package co.edu.uniandes.accordant.model;

import java.io.BufferedReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.jpmml.model.PMMLUtil;
import org.dmg.pmml.DataDictionary;
import org.dmg.pmml.DataField;
import org.dmg.pmml.DataType;
import org.dmg.pmml.PMML;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import co.edu.uniandes.accordant_fv.AccessType;
import co.edu.uniandes.accordant_fv.Buffering;
import co.edu.uniandes.accordant_fv.DeliveryGuarantee;
import co.edu.uniandes.accordant_fv.Field;
import co.edu.uniandes.accordant_fv.NotificationModel;
import co.edu.uniandes.accordant_fv.ProcessingModel;
import co.edu.uniandes.accordant_fv.SyncType;
import co.edu.uniandes.accordant_fv.Throughput;
import co.edu.uniandes.accordant_rq.ConstraintType;
import co.edu.uniandes.accordant_rq.MetricUnit;
import co.edu.uniandes.accordant_rq.QAMetric;
import co.edu.uniandes.accordant_rq.QAttribute;

public class Util {

	public static String getValueMatch(String pattern, String text) {
		Pattern rId = Pattern.compile(pattern);
		Matcher mId = rId.matcher(text);
		mId.find();
		return mId.group(1);
	}
	
	public static String formatName(String name) {
		return name!=null? name.replaceAll(" ", "_"):null;
	}

	
	public static String[] getValuesMatch(String pattern, String text) {
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(text);
		m.find();
		
		int con = m.groupCount();
		String[] values = new String[con];
		for(int i=0;i<con;i++) {
			values[i] = m.group(i+1); 
		}
		return values;
	}
	
	public static ArrayList<String> readFile(String fileName) {
		ArrayList<String> lines = new ArrayList<>();
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("files/"+fileName));
			String line = reader.readLine();
			while (line != null) {
				// read next line
				lines.add(line);				
				line = reader.readLine();
			}
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
	
	/**
	 * 
	 * @param xmlFileName Name of the xml file, i.e. students.xml. The path of the file must be included
	 * @return
	 */
	public static Document parseXML(String xmlFileName) throws Exception{
		File xmlFile = new File(xmlFileName);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(xmlFile);
		return doc;
	}
	
	
	public static Document parseXML(InputStream xmlStream) throws Exception{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(xmlStream);
		return doc;
	}
	
	
	public static Document parseXML(InputSource xmlSource) throws Exception{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(xmlSource);
		return doc;
	}
	
	public static List<String[]> getPMMLFields(String urlPMML)  {
			try {
				System.out.println("URLPMML: "+urlPMML);
				URL url = new URL(urlPMML);
				InputStream input =	url.openStream();
				PMML model;
				model = PMMLUtil.unmarshal(input);
				if (model != null) {
					List<String[]> fields= new ArrayList<String[]>();
					DataDictionary dataDict = model.getDataDictionary();
					for (DataField pmmlfield : dataDict.getDataFields()) {
						String name = pmmlfield.getName().getValue();
						String dtype= parseDTypes(pmmlfield.getDataType());
						fields.add(new String[]{name,dtype});
					}
					return fields;
				}
				input.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
	}		
	
	

	public static NotificationModel parseNotification(String notModel) {
		if ("CENTRAL".equalsIgnoreCase(notModel)) {
			return NotificationModel.CENTRAL;
		} else if ("POLLED".equalsIgnoreCase(notModel)) {
			return NotificationModel.POLLED;
		} else if ("PUBSUB".equalsIgnoreCase(notModel)) {
			return NotificationModel.PUBSUB;
		} else if ("QUEUED".equalsIgnoreCase(notModel)) {
			return NotificationModel.QUEUED;
		}
		return null;
	}
	
	public static Throughput parseThroughput(String tp) {
		if ("ATOMIC".equalsIgnoreCase(tp)) {
			return Throughput.ATOMIC;
		} else if ("HIGH_ORDER".equalsIgnoreCase(tp)) {
			return Throughput.HIGH_ORDER;
		}
		return null;
	}
	
	public static Buffering parseBuffering(String buffering) {
		if ("BUFFERED".equalsIgnoreCase(buffering)) {
			return Buffering.BUFFERED;
		} else if ("UNBUFFERED".equalsIgnoreCase(buffering)) {
			return Buffering.UNBUFFERED;
		}
		return null;
	}
	
	
	public static SyncType parseSyncType(String stype) {
		if ("async".equalsIgnoreCase(stype)) {
			return SyncType.ASYNC;
		} else if ("sync".equalsIgnoreCase(stype)) {
			return SyncType.SYNC;
		}
		return null;
	}
	
	public static DeliveryGuarantee parseDelivery(String delivery) {
		if ("BestEffort".equalsIgnoreCase(delivery)) {
			return DeliveryGuarantee.BEST_EFFORT;
		} else if ("AtLeastOne".equalsIgnoreCase(delivery)) {
			return DeliveryGuarantee.AT_LEAST_ONCE;
		} else if ("AtMostOne".equalsIgnoreCase(delivery)) {
			return DeliveryGuarantee.AT_MOST_ONCE;
		}else if ("ExactlyOne".equalsIgnoreCase(delivery)) {
			return DeliveryGuarantee.EXACTLY_ONCE;
		}
		return null;
	}
	
	
	public static AccessType parseAccessType(String type) {
		if ("Database".equalsIgnoreCase(type)) {
			return AccessType.DATABASE;
		} else if ("FileSystem".equalsIgnoreCase(type)) {
			return AccessType.FILESYSTEM;
		} else if ("HDFS".equalsIgnoreCase(type)) {
			return AccessType.HDFS;
		}else if ("HTTP".equalsIgnoreCase(type)) {
			return AccessType.HTTP;
		}
		return null;
	}
	
	public static ProcessingModel parseProcModel(String procModel) {
		if ("Batch".equalsIgnoreCase(procModel)) {
			return ProcessingModel.BATCH;
		} else if ("Stream".equalsIgnoreCase(procModel)) {
			return ProcessingModel.STREAM;
		} else if ("Microbatch".equalsIgnoreCase(procModel)) {
			return ProcessingModel.MICROBATCH;
		}
		return null;
	}
	
	public static QAMetric parseQAMetric(String qaMetric) {
		if (qaMetric.equalsIgnoreCase("Deadline")) {
			return QAMetric.DEADLINE;
		} else if (qaMetric.equalsIgnoreCase("Latency")) {
			return QAMetric.LATENCY;
		} else if (qaMetric.equalsIgnoreCase("Throughput")) {
			return QAMetric.THROUGHPUT;
		} else if (qaMetric.equalsIgnoreCase("Update Time")) {
			return QAMetric.UPDATETIME;
		}
		return null;
	}

	public static QAttribute parseQAttribute(String qAttribute) {
		if (qAttribute.equalsIgnoreCase("Availability")) {
			return QAttribute.AVAILABILITY;
		} else if (qAttribute.equalsIgnoreCase("Performance")) {
			return QAttribute.PERFORMANCE;
		} else if (qAttribute.equalsIgnoreCase("Modifiability")) {
			return QAttribute.MODIFIABILITY;
		} else if (qAttribute.equalsIgnoreCase("Testability")) {
			return QAttribute.TESTABILITY;
		} else if (qAttribute.equalsIgnoreCase("Scalability")) {
			return QAttribute.SCALABILITY;
		}
		return null;
	}

	public static MetricUnit parseUnit(String unit) {
		if (unit.equalsIgnoreCase("Hours")) {
			return MetricUnit.HOURS;
		} else if (unit.equalsIgnoreCase("Minutes")) {
			return MetricUnit.MINUTES;
		} else if (unit.equalsIgnoreCase("Seconds")) {
			return MetricUnit.SECONDS;
		} else if (unit.equalsIgnoreCase("Millis")) {
			return MetricUnit.MILLIS;
		} else if (unit.equalsIgnoreCase("Messages/seg")) {
			return MetricUnit.MSGS;
		} else if (unit.equalsIgnoreCase("Bits/seg")) {
			return MetricUnit.BYTES;
		}
		return null;
	}

	public static ConstraintType parseType(String type) {
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
	
	public static String parseDTypes(DataType datatype) {
		switch (datatype.name()) {
      	case "FLOAT": return "Float";
			case "INTEGER": return"Integer";
			case "DOUBLE": return"Double";
			case "BOOLEAN":return "Boolean";
			case "DATE":return "Date";
			default: return "String";
		}
	}
	
}
