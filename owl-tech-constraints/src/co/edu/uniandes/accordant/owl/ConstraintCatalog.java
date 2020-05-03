package co.edu.uniandes.accordant.owl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConstraintCatalog {

	private static final String SOURCE = "./src/resources/";
	private Properties prop;

	public ConstraintCatalog() {

		try (InputStream input = new FileInputStream(SOURCE + "constraints.properties")) {

			this.prop = new Properties();

			// load a properties file
			prop.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	
	public String getQuery(String constraintKey) {
		return prop.getProperty(constraintKey);
	}
	
}
