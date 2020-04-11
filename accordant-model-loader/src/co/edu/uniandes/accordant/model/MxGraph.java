package co.edu.uniandes.accordant.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import co.edu.uniandes.accordant_fv.Component;
import co.edu.uniandes.accordant_fv.Connector;

public class MxGraph {

	private org.w3c.dom.Document docXML;

	public MxGraph(String xml) throws Exception {
		// System.out.println("xml:"+xml);
		InputStream xmlStream = new ByteArrayInputStream(xml.getBytes());
		docXML = Util.parseXML(xmlStream);

	}

	public NodeList getObjectNodes() {

		// System.out.println("Mxgraph.getComponents");
		NodeList objectNodes = docXML.getElementsByTagName("object");
		// System.out.println("Mxgraph.getElementsByTagName:" +
		// objectNodes.getLength());

		return objectNodes;
	}

	public List<Element> getEdges() {

		// System.out.println("Mxgraph.getComponents");
		List<Element> edges = null;
		NodeList cells = docXML.getElementsByTagName("mxCell");
		for (int i = 0; i < cells.getLength(); i++) {

			Node cell = cells.item(i);
			if (cell.getNodeType() == Node.ELEMENT_NODE) {
				Element cellElement = (Element) cell;
				String edge = cellElement.getAttribute("edge");
				Node parent = cellElement.getParentNode();
				// String id = cellElement.getAttribute("id"); 
				// String source = cellElement.getAttribute("source");
				// String target = cellElement.getAttribute("target");
				if (edge != null && edge.equals("1") && parent != null && parent.getNodeName() == "root") {
					if (edges==null)
						edges=new ArrayList<Element>();
					edges.add(cellElement);
					// System.out.println("Edge "+id+":"+source+"->"+target);
				}
			}
		}
		// System.out.println("Mxgraph.getElementsByTagName:" +
		// objectNodes.getLength());

		return edges;
	}

}
