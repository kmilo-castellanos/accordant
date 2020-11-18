package co.edu.uniandes.accordant.codegenerator;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Guice;

import co.edu.uniandes.accordant_dv.Accordant_dvPackage;
import co.edu.uniandes.accordant_dv.generator.AdvlGenerator;
import co.edu.uniandes.accordant_fv.Accordant_fvPackage;
import co.edu.uniandes.accordant_rq.Accordant_rqPackage;

public class DVCodeGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DVCodeGenerator().generate(
				"/Volumes/MacHD2/Desarrollo/accordant/accordant/accordant-model-loader/ChurnEstimation_Churn-DV_dv.xmi",
				"/Volumes/MacHD2/Desarrollo/accordant/accordant/accordant-model-loader/");

	}

	public void generate(String file, String outputPath) {
		doEMFSetup();

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createURI(file), true);
		System.out.println("resource: " + resource);
		JavaIoFileSystemAccess fsa = new JavaIoFileSystemAccess();

		Guice.createInjector(new AbstractGenericModule() {

			public Class<? extends IEncodingProvider> bindIEncodingProvider() {
				return IEncodingProvider.Runtime.class;
			}

		}).injectMembers(fsa);

		fsa.setOutputPath(outputPath);

		AdvlGenerator gen = new AdvlGenerator();
		gen.doGenerate(resource, fsa, new GeneratorContext());
	}

	private static void doEMFSetup() {

		EPackage.Registry.INSTANCE.put(Accordant_rqPackage.eINSTANCE.getNsURI(), Accordant_rqPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(Accordant_fvPackage.eINSTANCE.getNsURI(), Accordant_fvPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(Accordant_dvPackage.eINSTANCE.getNsURI(), Accordant_dvPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	}

}
