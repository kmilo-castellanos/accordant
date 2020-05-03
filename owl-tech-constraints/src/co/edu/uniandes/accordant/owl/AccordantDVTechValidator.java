package co.edu.uniandes.accordant.owl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import co.edu.uniandes.accordant_dv.Accordant_dvPackage;
import co.edu.uniandes.accordant_dv.Artifact;
import co.edu.uniandes.accordant_dv.DeploymentView;
import co.edu.uniandes.accordant_fv.Accordant_fvPackage;
import co.edu.uniandes.accordant_fv.Component;
import co.edu.uniandes.accordant_fv.Connector;
import co.edu.uniandes.accordant_fv.FunctionalView;
import co.edu.uniandes.accordant_fv.Port;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import co.edu.uniandes.accordant_rq.Accordant_rqPackage;
import co.edu.uniandes.accordant_rq.Constraint;
import co.edu.uniandes.accordant_rq.ConstraintType;

public class AccordantDVTechValidator {

	private AccordantSparql sparqlQuery;

	private ResourceSet resourceSet;
	private Resource resourceDV;

	public AccordantDVTechValidator() {
		sparqlQuery = new AccordantSparql();
	}

	private void loadDVModel(String fileName) {
		try {
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("xmi", new XMIResourceFactoryImpl());

			resourceSet = new ResourceSetImpl();
			// resourceSet.getPackageRegistry().put(Accordant_rqPackage.eNS_URI,
			// Accordant_rqPackage.eINSTANCE);
			// resourceSet.getPackageRegistry().put(Accordant_fvPackage.eNS_URI,
			// Accordant_fvPackage.eINSTANCE);
			resourceSet.getPackageRegistry().put(Accordant_dvPackage.eNS_URI, Accordant_dvPackage.eINSTANCE);
			resourceDV = resourceSet.getResource(URI.createURI(fileName), true);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean validateID1() {
		// ID1 All selected technologies must match with input license constraints
		DeploymentView dv = (DeploymentView) this.resourceDV.getContents().get(0);
		List<String[]> params = null;
		if (dv != null && dv.getProject() != null && dv.getProject().getConstraints() != null) {
			List<Constraint> constraints = dv.getProject().getConstraints();
			for (Constraint con : constraints) {
				if (con.getType() == ConstraintType.LICENSE) {
					List<Artifact> artifacts = dv.getArtifacts();
					for (Artifact artifact : artifacts) {
						params = new ArrayList<String[]>();
						params.add(new String[] { "<licenseKind>", SparqlUtil.formatOWLName(con.getValue()) });
						params.add(new String[] { "<tech>", SparqlUtil.formatOWLName(artifact.getTechnology()) });
						List<String> results = sparqlQuery.executeQuery("ID1", params);
						/*
						 * for (String res : results) { System.out.println(res); }
						 */
						if (results == null || results.size() == 0) {
							System.out.println("Constraint 'ID1' violated for artifact:" + artifact.getName() + ", technology:"
									+ artifact.getTechnology());
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	public boolean validateID2() {
		// ID2 All selected technologies must match with input model processing
		// constraints
		DeploymentView dv = (DeploymentView) this.resourceDV.getContents().get(0);
		List<String[]> params = null;
		if (dv != null && dv.getProject() != null && dv.getProject().getConstraints() != null) {
			List<Constraint> constraints = dv.getProject().getConstraints();
			for (Constraint con : constraints) {
				if (con.getType() == ConstraintType.PROC_MODEL) {
					List<Artifact> artifacts = dv.getArtifacts();
					for (Artifact artifact : artifacts) {
						params = new ArrayList<String[]>();
						params.add(new String[] { "<processingModel>", SparqlUtil.formatOWLName(con.getValue()) });
						params.add(new String[] { "<tech>", SparqlUtil.formatOWLName(artifact.getTechnology()) });
						List<String> results = sparqlQuery.executeQuery("ID2", params);
						/*
						 * for (String res : results) { System.out.println(res); }
						 */
						if (results == null || results.size() == 0) {
							System.out.println("Constraint 'ID2' violated for artifact:" + artifact.getName() + ", technology:"
									+ artifact.getTechnology());
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	public boolean validateID3() {
		// ID3 All selected technologies must match with input delivery guarantee
		// constraints
		DeploymentView dv = (DeploymentView) this.resourceDV.getContents().get(0);
		List<String[]> params = null;
		if (dv != null && dv.getProject() != null && dv.getProject().getConstraints() != null) {
			List<Constraint> constraints = dv.getProject().getConstraints();
			for (Constraint con : constraints) {
				if (con.getType() == ConstraintType.DELIVERY_GUARANTEE) {
					List<Artifact> artifacts = dv.getArtifacts();
					for (Artifact artifact : artifacts) {
						params = new ArrayList<String[]>();
						params.add(new String[] { "<deliveryGuarantee>", SparqlUtil.formatOWLName(con.getValue()) });
						params.add(new String[] { "<tech>", SparqlUtil.formatOWLName(artifact.getTechnology()) });
						List<String> results = sparqlQuery.executeQuery("ID3", params);
						/*
						 * for (String res : results) { System.out.println(res); }
						 */
						if (results == null || results.size() == 0) {
							System.out.println("Constraint 'ID3' violated for artifact:" + artifact.getName() + ", technology:"
									+ artifact.getTechnology());
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	public boolean validateFD3() {
		// FD3 All connected component and connectors technologies must be compatible
		DeploymentView dv = (DeploymentView) this.resourceDV.getContents().get(0);
		HashMap<Component,String> compTech= new HashMap<Component,String>();
		HashMap<Connector,String> connTech= new HashMap<Connector,String>();

		List<Artifact> artifacts = dv.getArtifacts();
		for (Artifact artifact : artifacts) {
			if(artifact.getComp()!=null) {
				compTech.put(artifact.getComp(), artifact.getTechnology());
			}else if(artifact.getConn()!=null) {
				connTech.put(artifact.getConn(), artifact.getTechnology());
			}
		}
		
		List<String[]> params = null;
		if (dv != null && dv.getFv() != null && dv.getFv().getComps() != null) {
			List<Component> comps = dv.getFv().getComps();
			for (Component comp : comps) {
				List<Port> ports=comp.getPorts();
				for(Port port:ports) {
					Connector conn=port.getRole().getConn();
					params = new ArrayList<String[]>();
					String tech1 = compTech.get(comp);
					String tech2 = connTech.get(conn);
					params.add(new String[] { "<tech1>", SparqlUtil.formatOWLName(tech1) });
					params.add(new String[] { "<tech2>", SparqlUtil.formatOWLName(tech2) });
					List<String> results = sparqlQuery.executeQuery("FD3", params);
					if (results == null || results.size() == 0) {
						System.out.println("Constraint 'FD3' violated for component:" + comp.getName() + ", technology:"
								+ tech1+", and connector:" + conn.getName() + ", technology:"
										+ tech2);
						return false;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] s) {
		AccordantDVTechValidator loader = new AccordantDVTechValidator();
		loader.loadDVModel("file:/Users/kmilo/git/accordant-V2/accordant_dv/model/DV1_ok.xmi");
		System.out.println("validateID1:" + loader.validateID1());
		System.out.println("validateID2:" + loader.validateID2());
		System.out.println("validateID3:" + loader.validateID3());
		System.out.println("validateFD3:" + loader.validateFD3());

	}

}
