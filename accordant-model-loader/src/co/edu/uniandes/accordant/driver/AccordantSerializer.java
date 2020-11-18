package co.edu.uniandes.accordant.driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.xtext.parsetree.reconstr.Serializer;

import com.google.inject.Guice;
import com.google.inject.Injector;

import co.edu.uniandes.accordant_rq.Accordant_rqFactory;
import co.edu.uniandes.accordant_rq.AinlRuntimeModule;
import co.edu.uniandes.accordant_rq.AinlStandaloneSetupGenerated;
import co.edu.uniandes.accordant_rq.impl.Accordant_rqFactoryImpl;

public class AccordantSerializer {

	private static Serializer SERIALIZER = null;

	public static void main(String[] s) {

		// AinlStandaloneSetupGenerated setup = new AinlStandaloneSetupGenerated();
		// com.google.inject.Injector injector =
		// setup.createInjectorAndDoEMFRegistration();
		// Serializer serializer = injector.getInstance(Serializer.class);
		
		Accordant_rqFactory factory = Accordant_rqFactory.eINSTANCE;
		URI uri = URI.createFileURI(
				"/Volumes/MacHD2/Desarrollo/accordant/accordant/accordant-model-loader/ChurnEstimation_ai.xmi");
		// Accordant_rqFactoryImpl rqFactory= new Accordant_rqFactoryImpl();
		// Resource resource = factory.createResource(uri);
		// Resource resource;

		// ResourceSet resourceSet;

		/*
		 * 
		 * Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		 * 
		 * Map<String, Object> m = reg.getExtensionToFactoryMap(); m.put("xmi", new
		 * XMIResourceFactoryImpl());
		 * 
		 * Map<String, Boolean> options = new HashMap<String, Boolean>();
		 * options.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		 * resource.load(options); EObject model = (EObject)
		 * resource.getContents().get(0);
		 */
		
		ResourceSet ecoreResourceSet = new ResourceSetImpl();


		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		
		URI ecoreURI = URI.createURI("/Volumes/MacHD2/Desarrollo/accordant/accordant/accordant_rq/model/accordant_rq.ecore");

		Resource ecoreResource = ecoreResourceSet.getResource(ecoreURI,true); 
		EPackage ePackage = (EPackage) ecoreResource.getContents().get(0);
		
		HashMap options = new HashMap();
		XMLResource.XMLMap xmlMap = new XMLMapImpl();
		xmlMap.setNoNamespacePackage(ePackage);
		options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		
		EPackage.Registry.INSTANCE.put(ePackage.getNsURI(),ePackage) ;

		
		m.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(
				URI.createURI(
						"/Volumes/MacHD2/Desarrollo/accordant/accordant/accordant-model-loader/ChurnEstimation_ai.xmi"),
				true);
		try {
			//resource.load(Collections.EMPTY_MAP);
			FileInputStream fileInputStream = new
			FileInputStream("/Volumes/MacHD2/Desarrollo/accordant/accordant/accordant-model-loader/ChurnEstimation_ai.xmi");
			XMLResourceImpl xmiResource = new XMLResourceImpl();
			xmiResource.load(fileInputStream, options);
			
			EObject root = xmiResource.getContents().get(0);
			System.out.println("root: "+root);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		/*
		 * 
		 * Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		 * Map<String, Object> m = reg.getExtensionToFactoryMap(); m.put("xmi", new
		 * XMIResourceFactoryImpl());
		 * 
		 * ResourceSet resourceSet = new ResourceSetImpl(); Resource resource =
		 * resourceSet.createResource(uri); System.out.println("uri:"+uri);
		 * System.out.println("xmiModel:"+resource.getContents());
		 * 
		 * EObject xmiModel = (EObject) resource.getContents().get(0); String dslModel =
		 * AccordantSerializer.valueOf(xmiModel);
		 * System.out.println("dslModel: "+dslModel);
		 */

	}

	private static Serializer getSerializer() {
		if (SERIALIZER == null) { // lazy creation
			SERIALIZER = Guice.createInjector(new AinlRuntimeModule()).getInstance(Serializer.class);
		}
		return SERIALIZER;
	}

	public static String valueOf(EObject eobj) {
		if (eobj == null) {
			return "null";
		}
		try {
			return getSerializer().serialize(eobj);
		} catch (Exception ex) { // fall back:
			return eobj.getClass().getSimpleName() + '@' + eobj.hashCode();
		}

	}
}
