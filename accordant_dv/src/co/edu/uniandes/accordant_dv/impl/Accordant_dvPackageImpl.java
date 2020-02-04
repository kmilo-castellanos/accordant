/**
 */
package co.edu.uniandes.accordant_dv.impl;

import co.edu.uniandes.accordant_dv.Accordant_dvFactory;
import co.edu.uniandes.accordant_dv.Accordant_dvPackage;
import co.edu.uniandes.accordant_dv.Artifact;
import co.edu.uniandes.accordant_dv.Deployment;
import co.edu.uniandes.accordant_dv.DeploymentView;
import co.edu.uniandes.accordant_dv.Device;
import co.edu.uniandes.accordant_dv.EnvVar;
import co.edu.uniandes.accordant_dv.EstimatorTech;
import co.edu.uniandes.accordant_dv.EventConnTech;
import co.edu.uniandes.accordant_dv.ExecEnvironment;
import co.edu.uniandes.accordant_dv.ExposedPort;
import co.edu.uniandes.accordant_dv.IngestorTech;
import co.edu.uniandes.accordant_dv.Pod;
import co.edu.uniandes.accordant_dv.ServerlessEnv;
import co.edu.uniandes.accordant_dv.Service;
import co.edu.uniandes.accordant_dv.SinkTech;
import co.edu.uniandes.accordant_dv.TransformerTech;
import co.edu.uniandes.accordant_dv.TypeDevice;

import co.edu.uniandes.accordant_fv.Accordant_fvPackage;
import co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl;
import co.edu.uniandes.accordant_rq.Accordant_rqPackage;

import co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Accordant_dvPackageImpl extends EPackageImpl implements Accordant_dvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass execEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass podEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exposedPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverlessEnvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventConnTechEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ingestorTechEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sinkTechEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum estimatorTechEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transformerTechEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeDeviceEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Accordant_dvPackageImpl() {
		super(eNS_URI, Accordant_dvFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Accordant_dvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Accordant_dvPackage init() {
		if (isInited) return (Accordant_dvPackage)EPackage.Registry.INSTANCE.getEPackage(Accordant_dvPackage.eNS_URI);

		// Obtain or create and register package
		Accordant_dvPackageImpl theAccordant_dvPackage = (Accordant_dvPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Accordant_dvPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Accordant_dvPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Accordant_rqPackageImpl theAccordant_rqPackage = (Accordant_rqPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Accordant_rqPackage.eNS_URI) instanceof Accordant_rqPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Accordant_rqPackage.eNS_URI) : Accordant_rqPackage.eINSTANCE);
		Accordant_fvPackageImpl theAccordant_fvPackage = (Accordant_fvPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Accordant_fvPackage.eNS_URI) instanceof Accordant_fvPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Accordant_fvPackage.eNS_URI) : Accordant_fvPackage.eINSTANCE);

		// Create package meta-data objects
		theAccordant_dvPackage.createPackageContents();
		theAccordant_rqPackage.createPackageContents();
		theAccordant_fvPackage.createPackageContents();

		// Initialize created meta-data
		theAccordant_dvPackage.initializePackageContents();
		theAccordant_rqPackage.initializePackageContents();
		theAccordant_fvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAccordant_dvPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Accordant_dvPackage.eNS_URI, theAccordant_dvPackage);
		return theAccordant_dvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentView() {
		return deploymentViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentView_Name() {
		return (EAttribute)deploymentViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentView_Devs() {
		return (EReference)deploymentViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentView_Deployments() {
		return (EReference)deploymentViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentView_Services() {
		return (EReference)deploymentViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentView_Serverless() {
		return (EReference)deploymentViewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentView_Artifacts() {
		return (EReference)deploymentViewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentView_Project() {
		return (EReference)deploymentViewEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentView_Fv() {
		return (EReference)deploymentViewEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Host() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Type() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Cpu() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Storage() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Mem() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Name() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Os() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecEnvironment() {
		return execEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecEnvironment_Name() {
		return (EAttribute)execEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecEnvironment_Cpu_req() {
		return (EAttribute)execEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecEnvironment_Mem_req() {
		return (EAttribute)execEnvironmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecEnvironment_Cpu_lim() {
		return (EAttribute)execEnvironmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecEnvironment_Mem_lim() {
		return (EAttribute)execEnvironmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecEnvironment_Image() {
		return (EAttribute)execEnvironmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecEnvironment_Ports() {
		return (EAttribute)execEnvironmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecEnvironment_Vars() {
		return (EReference)execEnvironmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecEnvironment_Commands() {
		return (EAttribute)execEnvironmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecEnvironment_PaasArts() {
		return (EReference)execEnvironmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Name() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Props() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Comp() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Conn() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Spoint() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Name() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Replicas() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_MaxSurge() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_MaxUnavail() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Pods() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Strategy() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Spoint() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPod() {
		return podEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPod_Name() {
		return (EAttribute)podEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPod_Host() {
		return (EAttribute)podEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPod_RestartPolicy() {
		return (EAttribute)podEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPod_Envs() {
		return (EReference)podEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPod_Node() {
		return (EReference)podEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvVar() {
		return envVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvVar_Name() {
		return (EAttribute)envVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvVar_Value() {
		return (EAttribute)envVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Ports() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Type() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ExtAccess() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExposedPort() {
		return exposedPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExposedPort_Name() {
		return (EAttribute)exposedPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExposedPort_Protocol() {
		return (EAttribute)exposedPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExposedPort_Target() {
		return (EAttribute)exposedPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExposedPort_Port() {
		return (EAttribute)exposedPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExposedPort_Exposes() {
		return (EReference)exposedPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerlessEnv() {
		return serverlessEnvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerlessEnv_Provider() {
		return (EAttribute)serverlessEnvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerlessEnv_Timeout() {
		return (EAttribute)serverlessEnvEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerlessEnv_Memory() {
		return (EAttribute)serverlessEnvEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerlessEnv_Name() {
		return (EAttribute)serverlessEnvEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerlessEnv_Props() {
		return (EAttribute)serverlessEnvEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerlessEnv_SaasArts() {
		return (EReference)serverlessEnvEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventConnTech() {
		return eventConnTechEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIngestorTech() {
		return ingestorTechEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSinkTech() {
		return sinkTechEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEstimatorTech() {
		return estimatorTechEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransformerTech() {
		return transformerTechEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeDevice() {
		return typeDeviceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accordant_dvFactory getAccordant_dvFactory() {
		return (Accordant_dvFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		deploymentViewEClass = createEClass(DEPLOYMENT_VIEW);
		createEAttribute(deploymentViewEClass, DEPLOYMENT_VIEW__NAME);
		createEReference(deploymentViewEClass, DEPLOYMENT_VIEW__DEVS);
		createEReference(deploymentViewEClass, DEPLOYMENT_VIEW__DEPLOYMENTS);
		createEReference(deploymentViewEClass, DEPLOYMENT_VIEW__SERVICES);
		createEReference(deploymentViewEClass, DEPLOYMENT_VIEW__SERVERLESS);
		createEReference(deploymentViewEClass, DEPLOYMENT_VIEW__ARTIFACTS);
		createEReference(deploymentViewEClass, DEPLOYMENT_VIEW__PROJECT);
		createEReference(deploymentViewEClass, DEPLOYMENT_VIEW__FV);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__HOST);
		createEAttribute(deviceEClass, DEVICE__TYPE);
		createEAttribute(deviceEClass, DEVICE__CPU);
		createEAttribute(deviceEClass, DEVICE__STORAGE);
		createEAttribute(deviceEClass, DEVICE__MEM);
		createEAttribute(deviceEClass, DEVICE__NAME);
		createEAttribute(deviceEClass, DEVICE__OS);

		execEnvironmentEClass = createEClass(EXEC_ENVIRONMENT);
		createEAttribute(execEnvironmentEClass, EXEC_ENVIRONMENT__NAME);
		createEAttribute(execEnvironmentEClass, EXEC_ENVIRONMENT__CPU_REQ);
		createEAttribute(execEnvironmentEClass, EXEC_ENVIRONMENT__MEM_REQ);
		createEAttribute(execEnvironmentEClass, EXEC_ENVIRONMENT__CPU_LIM);
		createEAttribute(execEnvironmentEClass, EXEC_ENVIRONMENT__MEM_LIM);
		createEAttribute(execEnvironmentEClass, EXEC_ENVIRONMENT__IMAGE);
		createEAttribute(execEnvironmentEClass, EXEC_ENVIRONMENT__PORTS);
		createEReference(execEnvironmentEClass, EXEC_ENVIRONMENT__VARS);
		createEAttribute(execEnvironmentEClass, EXEC_ENVIRONMENT__COMMANDS);
		createEReference(execEnvironmentEClass, EXEC_ENVIRONMENT__PAAS_ARTS);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__NAME);
		createEAttribute(artifactEClass, ARTIFACT__PROPS);
		createEReference(artifactEClass, ARTIFACT__COMP);
		createEReference(artifactEClass, ARTIFACT__CONN);
		createEReference(artifactEClass, ARTIFACT__SPOINT);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEAttribute(deploymentEClass, DEPLOYMENT__NAME);
		createEAttribute(deploymentEClass, DEPLOYMENT__REPLICAS);
		createEAttribute(deploymentEClass, DEPLOYMENT__MAX_SURGE);
		createEAttribute(deploymentEClass, DEPLOYMENT__MAX_UNAVAIL);
		createEReference(deploymentEClass, DEPLOYMENT__PODS);
		createEAttribute(deploymentEClass, DEPLOYMENT__STRATEGY);
		createEReference(deploymentEClass, DEPLOYMENT__SPOINT);

		podEClass = createEClass(POD);
		createEAttribute(podEClass, POD__NAME);
		createEAttribute(podEClass, POD__HOST);
		createEAttribute(podEClass, POD__RESTART_POLICY);
		createEReference(podEClass, POD__ENVS);
		createEReference(podEClass, POD__NODE);

		envVarEClass = createEClass(ENV_VAR);
		createEAttribute(envVarEClass, ENV_VAR__NAME);
		createEAttribute(envVarEClass, ENV_VAR__VALUE);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEReference(serviceEClass, SERVICE__PORTS);
		createEAttribute(serviceEClass, SERVICE__TYPE);
		createEAttribute(serviceEClass, SERVICE__EXT_ACCESS);

		exposedPortEClass = createEClass(EXPOSED_PORT);
		createEAttribute(exposedPortEClass, EXPOSED_PORT__NAME);
		createEAttribute(exposedPortEClass, EXPOSED_PORT__PROTOCOL);
		createEAttribute(exposedPortEClass, EXPOSED_PORT__TARGET);
		createEAttribute(exposedPortEClass, EXPOSED_PORT__PORT);
		createEReference(exposedPortEClass, EXPOSED_PORT__EXPOSES);

		serverlessEnvEClass = createEClass(SERVERLESS_ENV);
		createEAttribute(serverlessEnvEClass, SERVERLESS_ENV__PROVIDER);
		createEAttribute(serverlessEnvEClass, SERVERLESS_ENV__TIMEOUT);
		createEAttribute(serverlessEnvEClass, SERVERLESS_ENV__MEMORY);
		createEAttribute(serverlessEnvEClass, SERVERLESS_ENV__NAME);
		createEAttribute(serverlessEnvEClass, SERVERLESS_ENV__PROPS);
		createEReference(serverlessEnvEClass, SERVERLESS_ENV__SAAS_ARTS);

		// Create enums
		eventConnTechEEnum = createEEnum(EVENT_CONN_TECH);
		ingestorTechEEnum = createEEnum(INGESTOR_TECH);
		sinkTechEEnum = createEEnum(SINK_TECH);
		estimatorTechEEnum = createEEnum(ESTIMATOR_TECH);
		transformerTechEEnum = createEEnum(TRANSFORMER_TECH);
		typeDeviceEEnum = createEEnum(TYPE_DEVICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Accordant_rqPackage theAccordant_rqPackage = (Accordant_rqPackage)EPackage.Registry.INSTANCE.getEPackage(Accordant_rqPackage.eNS_URI);
		Accordant_fvPackage theAccordant_fvPackage = (Accordant_fvPackage)EPackage.Registry.INSTANCE.getEPackage(Accordant_fvPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(deploymentViewEClass, DeploymentView.class, "DeploymentView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentView_Name(), ecorePackage.getEString(), "name", null, 1, 1, DeploymentView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentView_Devs(), this.getDevice(), null, "devs", null, 1, -1, DeploymentView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentView_Deployments(), this.getDeployment(), null, "deployments", null, 0, -1, DeploymentView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentView_Services(), this.getService(), null, "services", null, 0, -1, DeploymentView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentView_Serverless(), this.getServerlessEnv(), null, "serverless", null, 0, -1, DeploymentView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentView_Artifacts(), this.getArtifact(), null, "artifacts", null, 0, -1, DeploymentView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentView_Project(), theAccordant_rqPackage.getProject(), null, "project", null, 0, 1, DeploymentView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentView_Fv(), theAccordant_fvPackage.getFunctionalView(), null, "fv", null, 1, 1, DeploymentView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_Host(), ecorePackage.getEString(), "host", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Type(), this.getTypeDevice(), "type", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Cpu(), ecorePackage.getEInt(), "cpu", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Storage(), ecorePackage.getEInt(), "storage", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Mem(), ecorePackage.getEInt(), "mem", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Name(), ecorePackage.getEString(), "name", null, 1, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Os(), ecorePackage.getEString(), "os", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(execEnvironmentEClass, ExecEnvironment.class, "ExecEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecEnvironment_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecEnvironment_Cpu_req(), ecorePackage.getEFloat(), "cpu_req", null, 0, 1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecEnvironment_Mem_req(), ecorePackage.getEInt(), "mem_req", null, 0, 1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecEnvironment_Cpu_lim(), ecorePackage.getEFloat(), "cpu_lim", null, 0, 1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecEnvironment_Mem_lim(), ecorePackage.getEInt(), "mem_lim", null, 0, 1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecEnvironment_Image(), ecorePackage.getEString(), "image", null, 0, 1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecEnvironment_Ports(), ecorePackage.getEInt(), "ports", null, 0, -1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecEnvironment_Vars(), this.getEnvVar(), null, "vars", null, 0, -1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecEnvironment_Commands(), ecorePackage.getEString(), "commands", null, 0, -1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecEnvironment_PaasArts(), this.getArtifact(), null, "PaasArts", null, 0, -1, ExecEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Props(), ecorePackage.getEString(), "props", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Comp(), theAccordant_fvPackage.getComponent(), null, "comp", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Conn(), theAccordant_fvPackage.getConnector(), null, "conn", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Spoint(), theAccordant_rqPackage.getSensitivityPoint(), null, "spoint", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_Replicas(), ecorePackage.getEInt(), "replicas", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_MaxSurge(), ecorePackage.getEInt(), "maxSurge", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_MaxUnavail(), ecorePackage.getEInt(), "maxUnavail", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Pods(), this.getPod(), null, "pods", null, 1, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_Strategy(), ecorePackage.getEString(), "strategy", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Spoint(), theAccordant_rqPackage.getSensitivityPoint(), null, "spoint", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(podEClass, Pod.class, "Pod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPod_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPod_Host(), ecorePackage.getEString(), "host", null, 0, 1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPod_RestartPolicy(), ecorePackage.getEString(), "restartPolicy", null, 0, 1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPod_Envs(), this.getExecEnvironment(), null, "envs", null, 1, -1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPod_Node(), this.getDevice(), null, "node", null, 0, 1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(envVarEClass, EnvVar.class, "EnvVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvVar_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnvVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvVar_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnvVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Ports(), this.getExposedPort(), null, "ports", null, 1, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Type(), ecorePackage.getEString(), "type", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ExtAccess(), ecorePackage.getEString(), "extAccess", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exposedPortEClass, ExposedPort.class, "ExposedPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExposedPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExposedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExposedPort_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, ExposedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExposedPort_Target(), ecorePackage.getEString(), "target", null, 0, 1, ExposedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExposedPort_Port(), ecorePackage.getEInt(), "port", null, 0, 1, ExposedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExposedPort_Exposes(), this.getPod(), null, "exposes", null, 0, -1, ExposedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverlessEnvEClass, ServerlessEnv.class, "ServerlessEnv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerlessEnv_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, ServerlessEnv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerlessEnv_Timeout(), ecorePackage.getEInt(), "timeout", null, 0, 1, ServerlessEnv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerlessEnv_Memory(), ecorePackage.getEFloat(), "memory", null, 0, 1, ServerlessEnv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerlessEnv_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServerlessEnv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerlessEnv_Props(), ecorePackage.getEString(), "props", null, 0, 1, ServerlessEnv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerlessEnv_SaasArts(), this.getArtifact(), null, "SaasArts", null, 0, -1, ServerlessEnv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eventConnTechEEnum, EventConnTech.class, "EventConnTech");
		addEEnumLiteral(eventConnTechEEnum, EventConnTech.KAFKA);
		addEEnumLiteral(eventConnTechEEnum, EventConnTech.ACTIVEMQ);
		addEEnumLiteral(eventConnTechEEnum, EventConnTech.RABBITMQ);

		initEEnum(ingestorTechEEnum, IngestorTech.class, "IngestorTech");
		addEEnumLiteral(ingestorTechEEnum, IngestorTech.FLUME);

		initEEnum(sinkTechEEnum, SinkTech.class, "SinkTech");
		addEEnumLiteral(sinkTechEEnum, SinkTech.SQOOP);
		addEEnumLiteral(sinkTechEEnum, SinkTech.MONGODB);

		initEEnum(estimatorTechEEnum, EstimatorTech.class, "EstimatorTech");
		addEEnumLiteral(estimatorTechEEnum, EstimatorTech.SPARKMLIB);
		addEEnumLiteral(estimatorTechEEnum, EstimatorTech.SCIKIT_LEARN);
		addEEnumLiteral(estimatorTechEEnum, EstimatorTech.MAHOUT);
		addEEnumLiteral(estimatorTechEEnum, EstimatorTech.OPENSCORING);
		addEEnumLiteral(estimatorTechEEnum, EstimatorTech.JPMML);

		initEEnum(transformerTechEEnum, TransformerTech.class, "TransformerTech");
		addEEnumLiteral(transformerTechEEnum, TransformerTech.SPARK);
		addEEnumLiteral(transformerTechEEnum, TransformerTech.STORM);

		initEEnum(typeDeviceEEnum, TypeDevice.class, "TypeDevice");
		addEEnumLiteral(typeDeviceEEnum, TypeDevice.MEDIUM);
		addEEnumLiteral(typeDeviceEEnum, TypeDevice.LARGE);
		addEEnumLiteral(typeDeviceEEnum, TypeDevice.SMALL);

		// Create resource
		createResource(eNS_URI);
	}

} //Accordant_dvPackageImpl
