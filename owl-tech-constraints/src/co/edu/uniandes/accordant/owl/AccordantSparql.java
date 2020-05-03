package co.edu.uniandes.accordant.owl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.query.*;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;
import org.apache.jena.vocabulary.OWL;
import org.apache.jena.vocabulary.RDFS;

public class AccordantSparql  {
	/***********************************/
	/* Constants */
	/***********************************/
	
	public AccordantSparql() {
		initializeOntology();
		cCatalog = new ConstraintCatalog();
	}
	
	private ConstraintCatalog cCatalog;

	// Directory where we've stored the local data files, such as pizza.rdf.owl
	private static final String SOURCE = "./src/resources/";

	// Owl ontology namespace
	private static final String ACCORDANT_TECH_NS = "http://www.uniandes.edu.co/accordant/technology#";

	private String prefix;

	
	@SuppressWarnings(value = "unused")
	private static final Logger log = LoggerFactory.getLogger(AccordantSparql.class);

	private OntModel model = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AccordantSparql sparqlQuery= new AccordantSparql();
		
		List<String[]> params = new ArrayList<String[]>();

		//ID1 All selected technologies must match with input license constraints
		params.add(new String[]{"<licenseKind>","accowl:Non-Proprietary"});
		params.add(new String[]{"<tech>","accowl:Spark"});
		sparqlQuery.executeQuery("ID1",params);
		
		//ID2 All selected technologies must match with input model processing constraints
		params = new ArrayList<String[]>();
		params.add(new String[]{"<processingModel>","accowl:Batch"});
		params.add(new String[]{"<techList>","accowl:Spark, accowl:Flume, accowl:Kafka"});
		sparqlQuery.executeQuery("ID2",params);
		
		//ID3 All selected technologies must match with input delivery guarantee constraints
		params = new ArrayList<String[]>();
		params.add(new String[]{"<deliveryGuarantee>","accowl:ExactlyOnce"});
		params.add(new String[]{"<techList>","accowl:Spark, accowl:Flume, accowl:Kafka"});
		sparqlQuery.executeQuery("ID3",params);
		
		
		//FD3 All connected component and connectors technologies must be compatible
		params = new ArrayList<String[]>();
		params.add(new String[]{"<tech2>","accowl:Storm"});
		params.add(new String[]{"<tech1>","accowl:Kafka"});
		sparqlQuery.executeQuery("FD3",params);
		
	}
	
	private void initializeOntology() {
		this.model= getModel();
		loadData();
	}

	public List<String> executeQuery(String constraintKey, List<String[]> params) {

		String queryTemplate = this.prefix + 	cCatalog.getQuery(constraintKey);
		for(String[] param : params) {
			queryTemplate= SparqlUtil.replaceParams(queryTemplate.toString(), param[0], param[1]);
		}	
		System.out.println("### executeQuery ->"+constraintKey);
		System.out.println("### Query Detail ->"+queryTemplate);

		return getResults(model,queryTemplate);
	}

	protected OntModel getModel() {
		return ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
	}

	protected void loadData() {
		FileManager.get().readModel(this.model, SOURCE+"ontology/accordant-bigowl.owl");
		this.prefix = "PREFIX accowl: <" + ACCORDANT_TECH_NS + "> \n"
				+"PREFIX bigowl: <http://www.khaos.uma.es/perception/bigowl#> \n"
				+ "PREFIX rdfs: <" + RDFS.getURI() + "> \n" 
				+ "PREFIX owl: <"+ OWL.getURI() + "> \n"
				+	"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \n"
				+ "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> \n";
	}
	
	
	protected List<String> getResults(Model m, String q) {
		Query query = QueryFactory.create(q);
		QueryExecution qexec = QueryExecutionFactory.create(query, m);
		
		try {
			ResultSet results = qexec.execSelect();
			QuerySolution qs=null;
			List<String> result=null;
			if(results.hasNext()) {
				result = new ArrayList<String>();
			}
			while(results.hasNext()) {
				 qs=results.next();
				 result.add(qs.toString());
			}
			return result;
		} finally {
			qexec.close();
		}

	}

	protected void showResults(Model m, String q) {
		Query query = QueryFactory.create(q);
		QueryExecution qexec = QueryExecutionFactory.create(query, m);
		
		try {
			ResultSet results = qexec.execSelect();
			//ResultSetFormatter.out(results, m);
			QuerySolution qs=null;
			while(results.hasNext()) {
				 qs=results.next();
				 System.out.println(qs.toString());
			}
		} finally {
			qexec.close();
		}

	}
}
