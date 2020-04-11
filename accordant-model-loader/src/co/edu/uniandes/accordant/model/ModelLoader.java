package co.edu.uniandes.accordant.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import co.edu.uniandes.accordant.db.mongo.MongoConnection;
import co.edu.uniandes.accordant_fv.Accordant_fvFactory;
import co.edu.uniandes.accordant_fv.Component;
import co.edu.uniandes.accordant_fv.Connector;
import co.edu.uniandes.accordant_fv.Estimator;
import co.edu.uniandes.accordant_fv.Event;
import co.edu.uniandes.accordant_fv.FunctionalView;
import co.edu.uniandes.accordant_fv.Ingestor;
import co.edu.uniandes.accordant_fv.ProcedureCall;
import co.edu.uniandes.accordant_fv.Sink;
import co.edu.uniandes.accordant_fv.Stream;
import co.edu.uniandes.accordant_fv.Transformer;
import co.edu.uniandes.accordant_rq.Accordant_rqFactory;
import co.edu.uniandes.accordant_rq.AnalyzedQS;
import co.edu.uniandes.accordant_rq.ArchDecision;
import co.edu.uniandes.accordant_rq.Constraint;
import co.edu.uniandes.accordant_rq.Project;
import co.edu.uniandes.accordant_rq.QScenario;
import co.edu.uniandes.accordant_rq.Tactic;

public class ModelLoader {

	private Project project;
	private Accordant_rqFactory factory;
	private Accordant_fvFactory fvFactory;

	private Resource resource;
	private String outputPath;

	private static final String INGESTOR = "Ingestor";
	private static final String SINK = "Sink";
	private static final String ESTIMATOR = "Analytics";
	private static final String TRANSFORMER = "Transformer";

	private static final String EVENT = "Event";
	private static final String PROCALL = "ProcedureCall";
	private static final String STREAM = "Stream";

	private static final String PORT = "Port";

	// --------------------
	// SINGLETON
	private static ModelLoader instance;

	private ModelLoader() {
		factory = Accordant_rqFactory.eINSTANCE;
		fvFactory = Accordant_fvFactory.eINSTANCE;

	}

	public static ModelLoader getInstance() {
		if (instance == null) {
			instance = new ModelLoader();
		}
		return instance;
	}
	// --------------------

	public void loadData(String projecName, MongoConnection conn, String outputPath) {

		this.outputPath = outputPath;

		try {

			List<String> projects = conn.getProjects(projecName);
			if (projects != null) {
				for (String projectName : projects) {
					String modelName = createRQModel(projectName);
					Project project = createProject(projectName);
					List<Document> tactics = conn.getTactics();
					HashMap<String, Tactic> tacticsMap = new HashMap<String, Tactic>();
					HashMap<String, ArchDecision> decisionsMap = new HashMap<String, ArchDecision>();
					if (tactics != null) {
						for (Document t : tactics) {
							Tactic tactic = createTactic(t);
							tacticsMap.put(tactic.getName(), tactic);
							project.getTactics().add(tactic);
						}
					}
					List<Document> constraints = conn.getConstraints(projectName);
					if (constraints != null) {
						for (Document cdoc : constraints) {
							Constraint cons = createConstraint(cdoc);
							project.getConstraints().add(cons);
						}
					}
					List<Document> scenarios = conn.getQScenarios(projectName);
					if (scenarios != null) {
						for (Document qdoc : scenarios) {
							QScenario qs = createQScenario(qdoc);
							AnalyzedQS aqs = createAQScenario(qdoc);
							aqs.setQs(qs);
							project.getScenarios().add(qs);
							project.getAnalyzedQs().add(aqs);

							List<Document> decisions = conn.getDecisions(qs.getName());
							if (decisions != null) {
								for (Document ddoc : decisions) {
									ArchDecision dec = createArchDecision(ddoc);
									dec.getAppliedTactics().add(tacticsMap.get(ddoc.getString("tactic")));
									decisionsMap.put(dec.getCode(), dec);
									aqs.setDecisions(dec);
								}
							}
						}
					}
					storeModel();

					List<Document> models = conn.getModels(projectName);
					if (models != null) {
						for (Document mdoc : models) {
							if (mdoc.getString("view").equals("Functional")) {
								createFVModel(project, decisionsMap, mdoc);
							}
						}
					}
				}

				System.out.println("Loading process finished successfully");
				System.out.println("Number of Projects: " + projects.size());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String createRQModel(String projectName) throws Exception {

		String modelName = projectName + "_ai";

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ail", new XMIResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		resource = resourceSet.createResource(
				URI.createURI(outputPath != null ? outputPath + "/out_models/" : "out_models/" + modelName + ".ail"));
		return modelName;
	}

	public String createFVModel(Project rqProject, HashMap<String, ArchDecision> decisionsMap, Document mdoc)
			throws Exception {

		String modelName = rqProject.getName() + "_" + mdoc.getString("name") + "_fv";

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("afl", new XMIResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		resource = resourceSet.createResource(
				URI.createURI(outputPath != null ? outputPath + "/out_models/" : "out_models/" + modelName + ".afl"));

		FunctionalView fv = createFunctionalView(rqProject);
		try {
			if (mdoc.getString("xml") != null && !mdoc.getString("xml").isEmpty()) {
				MxGraph mxgraph = new MxGraph(mdoc.getString("xml"));
				NodeList objectNodes = mxgraph.getObjectNodes();
				if (objectNodes != null) {
					HashMap<String, Component> compMap = new HashMap<String, Component>();
					HashMap<String, Connector> connMap = new HashMap<String, Connector>();

					for (int i = 0; i < objectNodes.getLength(); i++) {
						Node oNode = objectNodes.item(i);
						Component comp = null;
						Connector conn = null;
						if (oNode.getNodeType() == Node.ELEMENT_NODE) {
							Element objectElement = (Element) oNode;
							String eclass = objectElement.getAttribute("class");
							String id = objectElement.getAttribute("id");
							String name = objectElement.getAttribute("name");
							System.out.println("element: " + eclass + ", " + id + ", " + name);
							if (eclass != null) {
								if (eclass.equals(ModelLoader.INGESTOR) || eclass.equals(ModelLoader.SINK) || eclass.equals(ModelLoader.TRANSFORMER)
										|| eclass.equals(ModelLoader.ESTIMATOR)) {
									// Components
									if (eclass.equals(ModelLoader.INGESTOR)) {
										comp = createIngestor(objectElement);
									} else if (eclass.equals(ModelLoader.SINK)) {
										comp = createSink(objectElement);
									} else if (eclass.equals(ModelLoader.TRANSFORMER)) {
										comp = createTransformer(objectElement);
									} else if (eclass.equals(ModelLoader.ESTIMATOR)) {
										comp = createEstimator(objectElement);
									}
									comp.setFuncView(fv);
									compMap.put(id, comp);
									if (objectElement.getAttribute("decisionCode") != null) {
										ArchDecision dec = decisionsMap.get(objectElement.getAttribute("decisionCode"));
										if (dec != null) {
											comp.setDecision(dec);
										}
									}
								} else if (eclass.equals(ModelLoader.EVENT) || eclass.equals(ModelLoader.PROCALL) || eclass.equals(ModelLoader.STREAM)) {
									// Connnectors
									if (eclass.equals(ModelLoader.EVENT)) {
										conn = createEvent(objectElement);
									} else if (eclass.equals(ModelLoader.PROCALL)) {
										conn = createProcCall(objectElement);
									} else if (eclass.equals(ModelLoader.STREAM)) {
										conn = createStream(objectElement);
									}
									fv.getConns().add(conn);
									connMap.put(id, conn);
									if (objectElement.getAttribute("decisionCode") != null) {
										ArchDecision dec = decisionsMap.get(objectElement.getAttribute("decisionCode"));
										if (dec != null) {
											conn.setDecision(dec);
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.println("Total Componentes de FV:" + fv.getComps().size());
		} catch (Exception e) {
			e.printStackTrace();
		}

		storeModel();

		return modelName;
	}

	public FunctionalView createFunctionalView(Project rqProject) throws Exception {
		FunctionalView fv = fvFactory.createFunctionalView();
		fv.setName(rqProject.getName() + "FVModel");
		fv.setProject(rqProject);
		resource.getContents().add(fv);
		return fv;
	}

	public Project createProject(String projectName) throws Exception {
		project = factory.createProject();
		project.setName(projectName);
		resource.getContents().add(project);
		return project;
	}

	public void storeModel() throws Exception {
		resource.save(Collections.EMPTY_MAP);
	}

	public QScenario createQScenario(Document doc) {
		QScenario qs = factory.createQScenario();
		qs.setName(doc.getString("name"));
		qs.setEnvironment(doc.getString("environment"));
		qs.setMaxValue(doc.getInteger("maxVal") != null ? doc.getInteger("maxVal").floatValue() : null);
		qs.setMinValue(doc.getInteger("minVal") != null ? doc.getInteger("minVal").floatValue() : null);
		qs.setMeasure(Util.parseQAMetric(doc.getString("qametric")));
		qs.setQAttribute(Util.parseQAttribute(doc.getString("qa")));
		qs.setResponse(doc.getString("response"));
		qs.setStimulus(doc.getString("stimulus"));
		qs.setUnit(Util.parseUnit(doc.getString("unit")));
		return qs;
	}

	public AnalyzedQS createAQScenario(Document doc) {
		AnalyzedQS aqs = factory.createAnalyzedQS();
		aqs.setName(doc.getString("name"));
		aqs.setReasoning(doc.getString("rationale"));
		return aqs;
	}

	public Constraint createConstraint(Document doc) {
		Constraint cons = factory.createConstraint();
		cons.setCode(doc.getString("code"));
		cons.setType(Util.parseType(doc.getString("type")));
		cons.setValue(doc.getString("value"));
		return cons;
	}

	public ArchDecision createArchDecision(Document doc) {
		ArchDecision dec = factory.createArchDecision();
		dec.setCode(doc.getString("name"));
		dec.setName(doc.getString("name"));
		dec.setRationale(doc.getString("rationale"));
		dec.setIsRisk(doc.getString("risk") != null ? true : false);
		dec.setIsSensitivityPoint(doc.getString("sensitivity") != null ? true : false);
		return dec;
	}

	public Tactic createTactic(Document doc) {
		Tactic tac = factory.createTactic();
		tac.setName(doc.getString("name"));
		tac.setQAttribute(Util.parseQAttribute(doc.getString("qa")));
		return tac;
	}

	private Component createIngestor(Element el) {
		Ingestor ing = fvFactory.createIngestor();
		ing.setName(el.getAttribute("label"));
		ing.setConn(el.getAttribute("connection"));
		ing.setProcModel(Util.parseProcModel(el.getAttribute("procModel")));
		ing.setFormat(el.getAttribute("format"));
		ing.setProps(el.getAttribute("props"));
		ing.setType(Util.parseAccessType(el.getAttribute("accessType")));
		return ing;
	}

	private Component createSink(Element el) {
		Sink sin = fvFactory.createSink();
		sin.setName(el.getAttribute("label"));
		sin.setConn(el.getAttribute("connection"));
		sin.setProcModel(Util.parseProcModel(el.getAttribute("procModel")));
		sin.setFormat(el.getAttribute("format"));
		sin.setProps(el.getAttribute("props"));
		sin.setType(Util.parseAccessType(el.getAttribute("accessType")));
		return sin;
	}

	private Component createTransformer(Element el) {
		Transformer tra = fvFactory.createTransformer();
		tra.setName(el.getAttribute("label"));
		tra.setCodeRepo(el.getAttribute("sourceRepository"));
		tra.setLambdaExp(el.getAttribute("lambdaExpression"));
		tra.setPmml(el.getAttribute("pmmlFile"));
		tra.setSqlExp(el.getAttribute("SQL"));
		tra.setProcModel(Util.parseProcModel(el.getAttribute("procModel")));
		return tra;
	}

	private Component createEstimator(Element el) {
		Estimator est = fvFactory.createEstimator();
		est.setName(el.getAttribute("label"));
		est.setPmml(el.getAttribute("pmmlFile"));
		est.setProcModel(Util.parseProcModel(el.getAttribute("procModel")));
		return est;
	}

	private Connector createProcCall(Element el) {
		ProcedureCall pc = fvFactory.createProcedureCall();
		pc.setName(el.getAttribute("label"));
		pc.setDelivery(Util.parseDelivery(el.getAttribute("delivery")));
		pc.setBuffering(Util.parseBuffering(el.getAttribute("buffering")));
		pc.setNotification(Util.parseNotification(el.getAttribute("notification")));
		pc.setProps(el.getAttribute("props"));
		pc.setProtocol(el.getAttribute("protocol"));
		pc.setSynct(Util.parseSyncType(el.getAttribute("syncronization")));
		pc.setThroughput(Util.parseThroughput(el.getAttribute("throughput")));
		return pc;
	}

	private Connector createStream(Element el) {
		Stream stream = fvFactory.createStream();
		stream.setName(el.getAttribute("label"));
		stream.setDelivery(Util.parseDelivery(el.getAttribute("delivery")));
		stream.setBuffering(Util.parseBuffering(el.getAttribute("buffering")));
		stream.setNotification(Util.parseNotification(el.getAttribute("notification")));
		stream.setProps(el.getAttribute("props"));
		stream.setProtocol(el.getAttribute("protocol"));
		stream.setSynct(Util.parseSyncType(el.getAttribute("syncronization")));
		stream.setThroughput(Util.parseThroughput(el.getAttribute("throughput")));
		return stream;
	}

	private Connector createEvent(Element el) {
		Event evt = fvFactory.createEvent();
		evt.setName(el.getAttribute("label"));
		evt.setDelivery(Util.parseDelivery(el.getAttribute("delivery")));
		evt.setBuffering(Util.parseBuffering(el.getAttribute("buffering")));
		evt.setNotification(Util.parseNotification(el.getAttribute("notification")));
		evt.setProps(el.getAttribute("props"));
		evt.setProtocol(el.getAttribute("protocol"));
		evt.setSynct(Util.parseSyncType(el.getAttribute("syncronization")));
		evt.setThroughput(Util.parseThroughput(el.getAttribute("throughput")));
		return evt;
	}

	public String getOutputPath() {
		return outputPath;
	}

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

}
