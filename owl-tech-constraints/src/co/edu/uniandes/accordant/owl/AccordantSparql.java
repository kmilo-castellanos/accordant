package co.edu.uniandes.accordant.owl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
		sparqlQuery.executeQuery("ID1");
		sparqlQuery.executeQuery("ID2");
		sparqlQuery.executeQuery("ID3");
		sparqlQuery.executeQuery("FD3");
	}
	
	private void initializeOntology() {
		this.model= getModel();
		loadData();
	}

	public void executeQuery(String constraint) {

		
		System.out.println("### executeQuery ->"+constraint);
		showQuery(model,
				this.prefix + 	cCatalog.getQuery(constraint));
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
				+	"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
				+ "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>";
	}

	protected void showQuery(Model m, String q) {
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

	
	
	/***********************************/
	/* Internal implementation methods */
	/***********************************/

	/***********************************/
	/* Inner class definitions */
	/***********************************/

}
