package co.edu.uniandes.accordant.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


import org.w3c.dom.NodeList;


public class MxGraph {
	

	private org.w3c.dom.Document docXML;

	public MxGraph(String xml) throws Exception {
		// System.out.println("xml:"+xml);
		InputStream xmlStream = new ByteArrayInputStream(xml.getBytes());
		docXML = Util.parseXML(xmlStream);

	}

	public NodeList getObjectNodes() {

		//System.out.println("Mxgraph.getComponents");
		NodeList objectNodes = docXML.getElementsByTagName("object");
		//System.out.println("Mxgraph.getElementsByTagName:" + objectNodes.getLength());
		
		return objectNodes;
	}

	
	
}
