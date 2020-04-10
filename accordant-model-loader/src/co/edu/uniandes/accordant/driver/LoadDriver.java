package co.edu.uniandes.accordant.driver;

import co.edu.uniandes.accordant.db.mongo.MongoConnection;
import co.edu.uniandes.accordant.model.ModelLoader;



public class LoadDriver {


	public static void main(String s[]) {
		try {

			String projectName = "UC1";
			String connString = "mongodb://127.0.0.1:3001/";
			String outputPath = null;
			if (s != null && s.length > 2) {
				projectName = s[1];
			}
			if (s != null && s.length > 3) {
				connString = s[2];
			}
			if (s != null && s.length > 4) {
				outputPath = s[3];
			}

			if (projectName == null || projectName.isEmpty()) {
				System.out.println(
						"The project name is required. \nRun: java -jar accordant-model-loader.jar  <project_name>* <mongoConn> <outputPaht>");
				System.exit(0);
			}

			MongoConnection conn= new MongoConnection(connString);
			ModelLoader rqLoader = ModelLoader.getInstance();
			rqLoader.loadData(projectName,conn,outputPath);
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
}
