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

import co.edu.uniandes.accordant.db.mongo.MongoConnection;
import co.edu.uniandes.accordant_rq.Accordant_rqFactory;
import co.edu.uniandes.accordant_rq.AnalyzedQS;
import co.edu.uniandes.accordant_rq.ArchDecision;
import co.edu.uniandes.accordant_rq.Constraint;
import co.edu.uniandes.accordant_rq.ConstraintType;
import co.edu.uniandes.accordant_rq.MetricUnit;
import co.edu.uniandes.accordant_rq.Project;
import co.edu.uniandes.accordant_rq.QAMetric;
import co.edu.uniandes.accordant_rq.QAttribute;
import co.edu.uniandes.accordant_rq.QScenario;
import co.edu.uniandes.accordant_rq.Tactic;

public class ModelLoader {

	private Project project;
	private Accordant_rqFactory factory;
	private Resource resource;
	private String outputPath;
			
	// --------------------
	// SINGLETON
	private static ModelLoader instance;

	private ModelLoader() {
		factory = Accordant_rqFactory.eINSTANCE;
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
					//String modelName = createModel(projectName);
					Project project = createProject(projectName);
					List<Document> tactics = conn.getTactics();
					HashMap<String,Tactic> tacticsMap=new HashMap<String,Tactic>();
					for (Document t : tactics) {
						Tactic tactic = createTactic(t);
						tacticsMap.put(tactic.getName(), tactic);
						project.getTactics().add(tactic);
					}
					List<Document> constraints = conn.getConstraints(projectName);
					for (Document cdoc : constraints) {
						Constraint cons = createConstraint(cdoc);
						project.getConstraints().add(cons);
					}
					List<Document> scenarios = conn.getQScenarios(projectName);
					for (Document qdoc : scenarios) {
						QScenario qs = createQScenario(qdoc);
						AnalyzedQS aqs = createAQScenario(qdoc);
						aqs.setQs(qs);
						project.getScenarios().add(qs);
						project.getAnalyzedQs().add(aqs);
						
						List<Document> decisions = conn.getDecisions(qs.getName());
						for (Document ddoc : decisions) {
							ArchDecision dec = createArchDecision(ddoc);
							dec.getAppliedTactics().add(tacticsMap.get(ddoc.getString("tactic")));
							aqs.setDecisions(dec);
						}
					}
					
					storeModel();
					
					
				}

				System.out.println("Loading process finished successfully");
				System.out.println("Number of Projects: "+projects.size());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String createModel(String projectName) throws Exception {

		String modelName = projectName + "_ai";

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ail", new XMIResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		resource = resourceSet.createResource(
				URI.createURI(outputPath != null ? outputPath + "/out_models/" : "out_models/" + modelName + ".ail"));
		return modelName;
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
		qs.setMeasure(parseQAMetric(doc.getString("qametric")));
		qs.setQAttribute(parseQAttribute(doc.getString("qa")));
		qs.setResponse(doc.getString("response"));
		qs.setStimulus(doc.getString("stimulus"));
		qs.setUnit(parseUnit(doc.getString("unit")));
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
		cons.setType(parseType(doc.getString("type")));
		cons.setValue(doc.getString("value"));
		return cons;
	}
	
	public ArchDecision createArchDecision(Document doc) {
		ArchDecision dec = factory.createArchDecision();
		dec.setCode(doc.getString("name"));
		dec.setIsRisk(doc.getString("risk")!=null?true:false);
		dec.setIsSensitivityPoint(doc.getString("sensitivity")!=null?true:false);
		return dec;
	}

	public Tactic createTactic(Document doc) {
		Tactic tac = factory.createTactic();
		tac.setName(doc.getString("name"));
		tac.setQAttribute(parseQAttribute(doc.getString("qa")));
		return tac;
	}
	
	
	
	public String getOutputPath() {
		return outputPath;
	}

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	private static QAMetric parseQAMetric(String qaMetric) {
		if (qaMetric.equals("Deadline")) {
			return QAMetric.DEADLINE;
		} else if (qaMetric.equals("Latency")) {
			return QAMetric.LATENCY;
		} else if (qaMetric.equals("Throughput")) {
			return QAMetric.THROUGHPUT;
		} else if (qaMetric.equals("Update Time")) {
			return QAMetric.UPDATETIME;
		}
		return null;
	}

	private static QAttribute parseQAttribute(String qAttribute) {
		if (qAttribute.equals("Availability")) {
			return QAttribute.AVAILABILITY;
		} else if (qAttribute.equals("Performance")) {
			return QAttribute.PERFORMANCE;
		} else if (qAttribute.equals("Modifiability")) {
			return QAttribute.MODIFIABILITY;
		} else if (qAttribute.equals("Testability")) {
			return QAttribute.TESTABILITY;
		} else if (qAttribute.equals("Scalability")) {
			return QAttribute.SCALABILITY;
		}
		return null;
	}

	private static MetricUnit parseUnit(String unit) {
		if (unit.equals("Hours")) {
			return MetricUnit.HOURS;
		} else if (unit.equals("Minutes")) {
			return MetricUnit.MINUTES;
		} else if (unit.equals("Seconds")) {
			return MetricUnit.SECONDS;
		} else if (unit.equals("Millis")) {
			return MetricUnit.MILLIS;
		} else if (unit.equals("Messages/seg")) {
			return MetricUnit.MSGS;
		} else if (unit.equals("Bits/seg")) {
			return MetricUnit.BYTES;
		}
		return null;
	}
	
	private static ConstraintType parseType(String type) {
		if (type.equals("Technology")) {
			return ConstraintType.TECH_VENDOR;
		} else if (type.equals("Architectural Style")) {
			return ConstraintType.ARCH_STYLE;
		} else if (type.equals("Cloud Model")) {
			return ConstraintType.CLOUD_PROV;
		} else if (type.equals("Processing Model")) {
			return ConstraintType.PROC_MODEL;
		}
		return null;
	}

}
