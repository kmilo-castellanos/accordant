package co.edu.uniandes.accordant.db.mongo;

import static com.mongodb.client.model.Filters.eq;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;


public class MongoConnection {

	private MongoClient mongoClient;
	private MongoDatabase database;

	public MongoConnection(String mongoString) {
		super();
		this.mongoClient = MongoClients.create(mongoString);
		this.database = mongoClient.getDatabase("meteor");

		System.out.println("Connection to <" + mongoString + "> was established");

	}

	public void close() {
		try {
			mongoClient.close();
			;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public List<Document> getTactics() {
		MongoCollection<Document> collection = database.getCollection("Tactics");
		MongoCursor<Document> cursor = collection.find().iterator();
		List<Document> list= new ArrayList<Document>();
		while (cursor.hasNext()) {
			list.add(cursor.next());
		}
		cursor.close();
		return list;
	}

	public List<String> getProjects(String projectName) {
		List<String> projects = null;
		MongoCursor<Document> cursor = null;
		try {
			MongoCollection<Document> collection = this.database.getCollection("AProjects");
			if (projectName != null) {
				cursor = collection.find(eq("name", projectName)).iterator();
			} else {
				cursor = collection.find().iterator();
			}
			if (cursor.hasNext()) {
				projects = new ArrayList<String>();
				while (cursor.hasNext()) {
					Document doc = cursor.next();
					projects.add(doc.getString("name"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cursor.close();
		}
		return projects;
	}

	public List<Document> getDecisions(String qsName) {
		MongoCollection<Document> collection = database.getCollection("ArchDecisions");
		MongoCursor<Document> cursor = collection.find(eq("qs_name", qsName)).iterator();
		List<Document> list= new ArrayList<Document>();
		while (cursor.hasNext()) {
			list.add(cursor.next());
		}
		cursor.close();
		return list;
	}

	public List<Document> getConstraints(String projectName) {
		List<Document> list = new ArrayList<Document>();
		MongoCollection<Document> collection = database.getCollection("Constraints");
		MongoCursor<Document> cursor = collection.find(eq("project", projectName)).iterator();
		while (cursor.hasNext()) {
			list.add(cursor.next());
			// System.out.println("ArchDecision.xml: " + doc.getString("xml"));
		}
		cursor.close();
		return list;
	}

	public List<Document> getModels(String projectName) {
		List<Document> list = new ArrayList<Document>();
		MongoCollection<Document> collection = database.getCollection("ArchModels");
		MongoCursor<Document> cursor = collection.find(eq("project", projectName)).iterator();

		while (cursor.hasNext()) {
			list.add(cursor.next());
			// System.out.println(doc.toJson());
		}
		cursor.close();
		return list;
	}

	public List<Document> getQScenarios(String projectName) {
		MongoCollection<Document> collection = database.getCollection("QScenarios");
		MongoCursor<Document> cursor = collection.find(eq("project", projectName)).iterator();
		List<Document> list = new ArrayList<Document>();
		try {
			while (cursor.hasNext()) {
				list.add(cursor.next());
			}
		} finally {
			cursor.close();
		}
		return list;
	}

}
