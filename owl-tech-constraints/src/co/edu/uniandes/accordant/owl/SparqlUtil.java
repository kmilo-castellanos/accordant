package co.edu.uniandes.accordant.owl;

import org.apache.commons.lang3.text.WordUtils;

public class SparqlUtil {

	
	public static String replaceParams(String query, String index, String value) {
		return query.replaceAll(index,value);
	}
	
	@SuppressWarnings("deprecation")
	public static String formatOWLName(String name) {
		
		return "accowl:"+WordUtils.capitalizeFully(name, new char[]{ ' ', '_','-' });
	}
}
