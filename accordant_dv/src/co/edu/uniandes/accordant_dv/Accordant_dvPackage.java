/**
 */
package co.edu.uniandes.accordant_dv;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.accordant_dv.Accordant_dvFactory
 * @model kind="package"
 * @generated
 */
public interface Accordant_dvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "accordant_dv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uniandes.accordant.deployment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "accordant_dv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Accordant_dvPackage eINSTANCE = co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl.init();

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.impl.DeploymentViewImpl <em>Deployment View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.impl.DeploymentViewImpl
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getDeploymentView()
	 * @generated
	 */
	int DEPLOYMENT_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_VIEW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Devs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_VIEW__DEVS = 1;

	/**
	 * The feature id for the '<em><b>Deployments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_VIEW__DEPLOYMENTS = 2;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_VIEW__SERVICES = 3;

	/**
	 * The feature id for the '<em><b>Serverless</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_VIEW__SERVERLESS = 4;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_VIEW__ARTIFACTS = 5;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_VIEW__PROJECT = 6;

	/**
	 * The feature id for the '<em><b>Fv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_VIEW__FV = 7;

	/**
	 * The number of structural features of the '<em>Deployment View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_VIEW_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Deployment View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.impl.DeviceImpl
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__HOST = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CPU = 2;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__STORAGE = 3;

	/**
	 * The feature id for the '<em><b>Mem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__MEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__OS = 6;

	/**
	 * The feature id for the '<em><b>Pods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PODS = 7;

	/**
	 * The feature id for the '<em><b>Dv</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DV = 8;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.impl.ExecEnvironmentImpl <em>Exec Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.impl.ExecEnvironmentImpl
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getExecEnvironment()
	 * @generated
	 */
	int EXEC_ENVIRONMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ENVIRONMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cpu req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ENVIRONMENT__CPU_REQ = 1;

	/**
	 * The feature id for the '<em><b>Mem req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ENVIRONMENT__MEM_REQ = 2;

	/**
	 * The feature id for the '<em><b>Cpu lim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ENVIRONMENT__CPU_LIM = 3;

	/**
	 * The feature id for the '<em><b>Mem lim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ENVIRONMENT__MEM_LIM = 4;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ENVIRONMENT__IMAGE = 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ENVIRONMENT__PORTS = 6;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ENVIRONMENT__VARS = 7;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ENVIRONMENT__COMMANDS = 8;

	/**
	 * The feature id for the '<em><b>Paas Arts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ENVIRONMENT__PAAS_ARTS = 9;

	/**
	 * The feature id for the '<em><b>Pod Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ENVIRONMENT__POD_OWNER = 10;

	/**
	 * The number of structural features of the '<em>Exec Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ENVIRONMENT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Exec Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.impl.ArtifactImpl
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PROPS = 1;

	/**
	 * The feature id for the '<em><b>Comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__COMP = 2;

	/**
	 * The feature id for the '<em><b>Conn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CONN = 3;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DECISION = 4;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__TECHNOLOGY = 5;

	/**
	 * The feature id for the '<em><b>Paas Env</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PAAS_ENV = 6;

	/**
	 * The feature id for the '<em><b>Saas Env</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__SAAS_ENV = 7;

	/**
	 * The feature id for the '<em><b>Dv</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DV = 8;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.impl.DeploymentImpl
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__REPLICAS = 1;

	/**
	 * The feature id for the '<em><b>Max Surge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__MAX_SURGE = 2;

	/**
	 * The feature id for the '<em><b>Max Unavail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__MAX_UNAVAIL = 3;

	/**
	 * The feature id for the '<em><b>Pods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__PODS = 4;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__STRATEGY = 5;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DECISION = 6;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__MODEL = 7;

	/**
	 * The feature id for the '<em><b>Dv</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DV = 8;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.impl.PodImpl <em>Pod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.impl.PodImpl
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getPod()
	 * @generated
	 */
	int POD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__HOST = 1;

	/**
	 * The feature id for the '<em><b>Restart Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__RESTART_POLICY = 2;

	/**
	 * The feature id for the '<em><b>Envs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__ENVS = 3;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__NODE = 4;

	/**
	 * The feature id for the '<em><b>Depl Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__DEPL_OWNER = 5;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__SERVICE = 6;

	/**
	 * The number of structural features of the '<em>Pod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Pod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.impl.EnvVarImpl <em>Env Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.impl.EnvVarImpl
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getEnvVar()
	 * @generated
	 */
	int ENV_VAR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Exec Env</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR__EXEC_ENV = 2;

	/**
	 * The number of structural features of the '<em>Env Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Env Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.impl.ServiceImpl
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PORTS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Ext Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EXT_ACCESS = 3;

	/**
	 * The feature id for the '<em><b>Dv</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DV = 4;

	/**
	 * The feature id for the '<em><b>Pod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__POD = 5;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.impl.ExposedPortImpl <em>Exposed Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.impl.ExposedPortImpl
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getExposedPort()
	 * @generated
	 */
	int EXPOSED_PORT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_PORT__PROTOCOL = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_PORT__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_PORT__PORT = 3;

	/**
	 * The feature id for the '<em><b>Exposes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_PORT__EXPOSES = 4;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_PORT__SERVICE = 5;

	/**
	 * The number of structural features of the '<em>Exposed Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_PORT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Exposed Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.impl.ServerlessEnvImpl <em>Serverless Env</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.impl.ServerlessEnvImpl
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getServerlessEnv()
	 * @generated
	 */
	int SERVERLESS_ENV = 9;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERLESS_ENV__PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERLESS_ENV__TIMEOUT = 1;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERLESS_ENV__MEMORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERLESS_ENV__NAME = 3;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERLESS_ENV__PROPS = 4;

	/**
	 * The feature id for the '<em><b>Saas Arts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERLESS_ENV__SAAS_ARTS = 5;

	/**
	 * The feature id for the '<em><b>Dv</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERLESS_ENV__DV = 6;

	/**
	 * The number of structural features of the '<em>Serverless Env</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERLESS_ENV_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Serverless Env</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVERLESS_ENV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.EventConnTech <em>Event Conn Tech</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.EventConnTech
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getEventConnTech()
	 * @generated
	 */
	int EVENT_CONN_TECH = 10;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.IngestorTech <em>Ingestor Tech</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.IngestorTech
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getIngestorTech()
	 * @generated
	 */
	int INGESTOR_TECH = 11;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.SinkTech <em>Sink Tech</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.SinkTech
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getSinkTech()
	 * @generated
	 */
	int SINK_TECH = 12;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.EstimatorTech <em>Estimator Tech</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.EstimatorTech
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getEstimatorTech()
	 * @generated
	 */
	int ESTIMATOR_TECH = 13;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.TransformerTech <em>Transformer Tech</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.TransformerTech
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getTransformerTech()
	 * @generated
	 */
	int TRANSFORMER_TECH = 14;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.TypeDevice <em>Type Device</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.TypeDevice
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getTypeDevice()
	 * @generated
	 */
	int TYPE_DEVICE = 15;


	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_dv.DeploymentModel <em>Deployment Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_dv.DeploymentModel
	 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getDeploymentModel()
	 * @generated
	 */
	int DEPLOYMENT_MODEL = 16;


	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_dv.DeploymentView <em>Deployment View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment View</em>'.
	 * @see co.edu.uniandes.accordant_dv.DeploymentView
	 * @generated
	 */
	EClass getDeploymentView();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.DeploymentView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_dv.DeploymentView#getName()
	 * @see #getDeploymentView()
	 * @generated
	 */
	EAttribute getDeploymentView_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_dv.DeploymentView#getDevs <em>Devs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devs</em>'.
	 * @see co.edu.uniandes.accordant_dv.DeploymentView#getDevs()
	 * @see #getDeploymentView()
	 * @generated
	 */
	EReference getDeploymentView_Devs();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_dv.DeploymentView#getDeployments <em>Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployments</em>'.
	 * @see co.edu.uniandes.accordant_dv.DeploymentView#getDeployments()
	 * @see #getDeploymentView()
	 * @generated
	 */
	EReference getDeploymentView_Deployments();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_dv.DeploymentView#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see co.edu.uniandes.accordant_dv.DeploymentView#getServices()
	 * @see #getDeploymentView()
	 * @generated
	 */
	EReference getDeploymentView_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_dv.DeploymentView#getServerless <em>Serverless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serverless</em>'.
	 * @see co.edu.uniandes.accordant_dv.DeploymentView#getServerless()
	 * @see #getDeploymentView()
	 * @generated
	 */
	EReference getDeploymentView_Serverless();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_dv.DeploymentView#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see co.edu.uniandes.accordant_dv.DeploymentView#getArtifacts()
	 * @see #getDeploymentView()
	 * @generated
	 */
	EReference getDeploymentView_Artifacts();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_dv.DeploymentView#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see co.edu.uniandes.accordant_dv.DeploymentView#getProject()
	 * @see #getDeploymentView()
	 * @generated
	 */
	EReference getDeploymentView_Project();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_dv.DeploymentView#getFv <em>Fv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fv</em>'.
	 * @see co.edu.uniandes.accordant_dv.DeploymentView#getFv()
	 * @see #getDeploymentView()
	 * @generated
	 */
	EReference getDeploymentView_Fv();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_dv.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see co.edu.uniandes.accordant_dv.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Device#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see co.edu.uniandes.accordant_dv.Device#getHost()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Host();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Device#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see co.edu.uniandes.accordant_dv.Device#getType()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Type();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Device#getCpu <em>Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu</em>'.
	 * @see co.edu.uniandes.accordant_dv.Device#getCpu()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Cpu();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Device#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see co.edu.uniandes.accordant_dv.Device#getStorage()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Storage();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Device#getMem <em>Mem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mem</em>'.
	 * @see co.edu.uniandes.accordant_dv.Device#getMem()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Mem();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_dv.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Device#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see co.edu.uniandes.accordant_dv.Device#getOs()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Os();

	/**
	 * Returns the meta object for the reference list '{@link co.edu.uniandes.accordant_dv.Device#getPods <em>Pods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pods</em>'.
	 * @see co.edu.uniandes.accordant_dv.Device#getPods()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Pods();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.accordant_dv.Device#getDv <em>Dv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dv</em>'.
	 * @see co.edu.uniandes.accordant_dv.Device#getDv()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Dv();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_dv.ExecEnvironment <em>Exec Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exec Environment</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExecEnvironment
	 * @generated
	 */
	EClass getExecEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExecEnvironment#getName()
	 * @see #getExecEnvironment()
	 * @generated
	 */
	EAttribute getExecEnvironment_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getCpu_req <em>Cpu req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu req</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExecEnvironment#getCpu_req()
	 * @see #getExecEnvironment()
	 * @generated
	 */
	EAttribute getExecEnvironment_Cpu_req();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getMem_req <em>Mem req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mem req</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExecEnvironment#getMem_req()
	 * @see #getExecEnvironment()
	 * @generated
	 */
	EAttribute getExecEnvironment_Mem_req();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getCpu_lim <em>Cpu lim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu lim</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExecEnvironment#getCpu_lim()
	 * @see #getExecEnvironment()
	 * @generated
	 */
	EAttribute getExecEnvironment_Cpu_lim();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getMem_lim <em>Mem lim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mem lim</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExecEnvironment#getMem_lim()
	 * @see #getExecEnvironment()
	 * @generated
	 */
	EAttribute getExecEnvironment_Mem_lim();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExecEnvironment#getImage()
	 * @see #getExecEnvironment()
	 * @generated
	 */
	EAttribute getExecEnvironment_Image();

	/**
	 * Returns the meta object for the attribute list '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ports</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExecEnvironment#getPorts()
	 * @see #getExecEnvironment()
	 * @generated
	 */
	EAttribute getExecEnvironment_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vars</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExecEnvironment#getVars()
	 * @see #getExecEnvironment()
	 * @generated
	 */
	EReference getExecEnvironment_Vars();

	/**
	 * Returns the meta object for the attribute list '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Commands</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExecEnvironment#getCommands()
	 * @see #getExecEnvironment()
	 * @generated
	 */
	EAttribute getExecEnvironment_Commands();

	/**
	 * Returns the meta object for the reference list '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getPaasArts <em>Paas Arts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Paas Arts</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExecEnvironment#getPaasArts()
	 * @see #getExecEnvironment()
	 * @generated
	 */
	EReference getExecEnvironment_PaasArts();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getPodOwner <em>Pod Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pod Owner</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExecEnvironment#getPodOwner()
	 * @see #getExecEnvironment()
	 * @generated
	 */
	EReference getExecEnvironment_PodOwner();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_dv.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see co.edu.uniandes.accordant_dv.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_dv.Artifact#getName()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Artifact#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Props</em>'.
	 * @see co.edu.uniandes.accordant_dv.Artifact#getProps()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Props();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_dv.Artifact#getComp <em>Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comp</em>'.
	 * @see co.edu.uniandes.accordant_dv.Artifact#getComp()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Comp();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_dv.Artifact#getConn <em>Conn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conn</em>'.
	 * @see co.edu.uniandes.accordant_dv.Artifact#getConn()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Conn();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_dv.Artifact#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decision</em>'.
	 * @see co.edu.uniandes.accordant_dv.Artifact#getDecision()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Decision();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Artifact#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see co.edu.uniandes.accordant_dv.Artifact#getTechnology()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Technology();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_dv.Artifact#getPaasEnv <em>Paas Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paas Env</em>'.
	 * @see co.edu.uniandes.accordant_dv.Artifact#getPaasEnv()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_PaasEnv();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_dv.Artifact#getSaasEnv <em>Saas Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Saas Env</em>'.
	 * @see co.edu.uniandes.accordant_dv.Artifact#getSaasEnv()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_SaasEnv();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.accordant_dv.Artifact#getDv <em>Dv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dv</em>'.
	 * @see co.edu.uniandes.accordant_dv.Artifact#getDv()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Dv();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_dv.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see co.edu.uniandes.accordant_dv.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Deployment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_dv.Deployment#getName()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Deployment#getReplicas <em>Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replicas</em>'.
	 * @see co.edu.uniandes.accordant_dv.Deployment#getReplicas()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Replicas();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Deployment#getMaxSurge <em>Max Surge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Surge</em>'.
	 * @see co.edu.uniandes.accordant_dv.Deployment#getMaxSurge()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_MaxSurge();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Deployment#getMaxUnavail <em>Max Unavail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Unavail</em>'.
	 * @see co.edu.uniandes.accordant_dv.Deployment#getMaxUnavail()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_MaxUnavail();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_dv.Deployment#getPods <em>Pods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pods</em>'.
	 * @see co.edu.uniandes.accordant_dv.Deployment#getPods()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Pods();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Deployment#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see co.edu.uniandes.accordant_dv.Deployment#getStrategy()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Strategy();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_dv.Deployment#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decision</em>'.
	 * @see co.edu.uniandes.accordant_dv.Deployment#getDecision()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Decision();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Deployment#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see co.edu.uniandes.accordant_dv.Deployment#getModel()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Model();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.accordant_dv.Deployment#getDv <em>Dv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dv</em>'.
	 * @see co.edu.uniandes.accordant_dv.Deployment#getDv()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Dv();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_dv.Pod <em>Pod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pod</em>'.
	 * @see co.edu.uniandes.accordant_dv.Pod
	 * @generated
	 */
	EClass getPod();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Pod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_dv.Pod#getName()
	 * @see #getPod()
	 * @generated
	 */
	EAttribute getPod_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Pod#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see co.edu.uniandes.accordant_dv.Pod#getHost()
	 * @see #getPod()
	 * @generated
	 */
	EAttribute getPod_Host();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Pod#getRestartPolicy <em>Restart Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Policy</em>'.
	 * @see co.edu.uniandes.accordant_dv.Pod#getRestartPolicy()
	 * @see #getPod()
	 * @generated
	 */
	EAttribute getPod_RestartPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_dv.Pod#getEnvs <em>Envs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Envs</em>'.
	 * @see co.edu.uniandes.accordant_dv.Pod#getEnvs()
	 * @see #getPod()
	 * @generated
	 */
	EReference getPod_Envs();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_dv.Pod#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see co.edu.uniandes.accordant_dv.Pod#getNode()
	 * @see #getPod()
	 * @generated
	 */
	EReference getPod_Node();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.accordant_dv.Pod#getDeplOwner <em>Depl Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Depl Owner</em>'.
	 * @see co.edu.uniandes.accordant_dv.Pod#getDeplOwner()
	 * @see #getPod()
	 * @generated
	 */
	EReference getPod_DeplOwner();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_dv.Pod#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see co.edu.uniandes.accordant_dv.Pod#getService()
	 * @see #getPod()
	 * @generated
	 */
	EReference getPod_Service();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_dv.EnvVar <em>Env Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Var</em>'.
	 * @see co.edu.uniandes.accordant_dv.EnvVar
	 * @generated
	 */
	EClass getEnvVar();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.EnvVar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_dv.EnvVar#getName()
	 * @see #getEnvVar()
	 * @generated
	 */
	EAttribute getEnvVar_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.EnvVar#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see co.edu.uniandes.accordant_dv.EnvVar#getValue()
	 * @see #getEnvVar()
	 * @generated
	 */
	EAttribute getEnvVar_Value();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.accordant_dv.EnvVar#getExecEnv <em>Exec Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Exec Env</em>'.
	 * @see co.edu.uniandes.accordant_dv.EnvVar#getExecEnv()
	 * @see #getEnvVar()
	 * @generated
	 */
	EReference getEnvVar_ExecEnv();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_dv.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see co.edu.uniandes.accordant_dv.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_dv.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_dv.Service#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see co.edu.uniandes.accordant_dv.Service#getPorts()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Ports();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Service#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see co.edu.uniandes.accordant_dv.Service#getType()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Type();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.Service#getExtAccess <em>Ext Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext Access</em>'.
	 * @see co.edu.uniandes.accordant_dv.Service#getExtAccess()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ExtAccess();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.accordant_dv.Service#getDv <em>Dv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dv</em>'.
	 * @see co.edu.uniandes.accordant_dv.Service#getDv()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Dv();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_dv.Service#getPod <em>Pod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pod</em>'.
	 * @see co.edu.uniandes.accordant_dv.Service#getPod()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Pod();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_dv.ExposedPort <em>Exposed Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exposed Port</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExposedPort
	 * @generated
	 */
	EClass getExposedPort();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.ExposedPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExposedPort#getName()
	 * @see #getExposedPort()
	 * @generated
	 */
	EAttribute getExposedPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.ExposedPort#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExposedPort#getProtocol()
	 * @see #getExposedPort()
	 * @generated
	 */
	EAttribute getExposedPort_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.ExposedPort#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExposedPort#getTarget()
	 * @see #getExposedPort()
	 * @generated
	 */
	EAttribute getExposedPort_Target();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.ExposedPort#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExposedPort#getPort()
	 * @see #getExposedPort()
	 * @generated
	 */
	EAttribute getExposedPort_Port();

	/**
	 * Returns the meta object for the reference list '{@link co.edu.uniandes.accordant_dv.ExposedPort#getExposes <em>Exposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exposes</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExposedPort#getExposes()
	 * @see #getExposedPort()
	 * @generated
	 */
	EReference getExposedPort_Exposes();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.accordant_dv.ExposedPort#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service</em>'.
	 * @see co.edu.uniandes.accordant_dv.ExposedPort#getService()
	 * @see #getExposedPort()
	 * @generated
	 */
	EReference getExposedPort_Service();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_dv.ServerlessEnv <em>Serverless Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serverless Env</em>'.
	 * @see co.edu.uniandes.accordant_dv.ServerlessEnv
	 * @generated
	 */
	EClass getServerlessEnv();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see co.edu.uniandes.accordant_dv.ServerlessEnv#getProvider()
	 * @see #getServerlessEnv()
	 * @generated
	 */
	EAttribute getServerlessEnv_Provider();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see co.edu.uniandes.accordant_dv.ServerlessEnv#getTimeout()
	 * @see #getServerlessEnv()
	 * @generated
	 */
	EAttribute getServerlessEnv_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see co.edu.uniandes.accordant_dv.ServerlessEnv#getMemory()
	 * @see #getServerlessEnv()
	 * @generated
	 */
	EAttribute getServerlessEnv_Memory();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_dv.ServerlessEnv#getName()
	 * @see #getServerlessEnv()
	 * @generated
	 */
	EAttribute getServerlessEnv_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Props</em>'.
	 * @see co.edu.uniandes.accordant_dv.ServerlessEnv#getProps()
	 * @see #getServerlessEnv()
	 * @generated
	 */
	EAttribute getServerlessEnv_Props();

	/**
	 * Returns the meta object for the reference list '{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getSaasArts <em>Saas Arts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Saas Arts</em>'.
	 * @see co.edu.uniandes.accordant_dv.ServerlessEnv#getSaasArts()
	 * @see #getServerlessEnv()
	 * @generated
	 */
	EReference getServerlessEnv_SaasArts();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getDv <em>Dv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dv</em>'.
	 * @see co.edu.uniandes.accordant_dv.ServerlessEnv#getDv()
	 * @see #getServerlessEnv()
	 * @generated
	 */
	EReference getServerlessEnv_Dv();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_dv.EventConnTech <em>Event Conn Tech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Conn Tech</em>'.
	 * @see co.edu.uniandes.accordant_dv.EventConnTech
	 * @generated
	 */
	EEnum getEventConnTech();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_dv.IngestorTech <em>Ingestor Tech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ingestor Tech</em>'.
	 * @see co.edu.uniandes.accordant_dv.IngestorTech
	 * @generated
	 */
	EEnum getIngestorTech();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_dv.SinkTech <em>Sink Tech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sink Tech</em>'.
	 * @see co.edu.uniandes.accordant_dv.SinkTech
	 * @generated
	 */
	EEnum getSinkTech();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_dv.EstimatorTech <em>Estimator Tech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Estimator Tech</em>'.
	 * @see co.edu.uniandes.accordant_dv.EstimatorTech
	 * @generated
	 */
	EEnum getEstimatorTech();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_dv.TransformerTech <em>Transformer Tech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transformer Tech</em>'.
	 * @see co.edu.uniandes.accordant_dv.TransformerTech
	 * @generated
	 */
	EEnum getTransformerTech();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_dv.TypeDevice <em>Type Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Device</em>'.
	 * @see co.edu.uniandes.accordant_dv.TypeDevice
	 * @generated
	 */
	EEnum getTypeDevice();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_dv.DeploymentModel <em>Deployment Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deployment Model</em>'.
	 * @see co.edu.uniandes.accordant_dv.DeploymentModel
	 * @generated
	 */
	EEnum getDeploymentModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Accordant_dvFactory getAccordant_dvFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.impl.DeploymentViewImpl <em>Deployment View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.impl.DeploymentViewImpl
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getDeploymentView()
		 * @generated
		 */
		EClass DEPLOYMENT_VIEW = eINSTANCE.getDeploymentView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_VIEW__NAME = eINSTANCE.getDeploymentView_Name();

		/**
		 * The meta object literal for the '<em><b>Devs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_VIEW__DEVS = eINSTANCE.getDeploymentView_Devs();

		/**
		 * The meta object literal for the '<em><b>Deployments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_VIEW__DEPLOYMENTS = eINSTANCE.getDeploymentView_Deployments();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_VIEW__SERVICES = eINSTANCE.getDeploymentView_Services();

		/**
		 * The meta object literal for the '<em><b>Serverless</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_VIEW__SERVERLESS = eINSTANCE.getDeploymentView_Serverless();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_VIEW__ARTIFACTS = eINSTANCE.getDeploymentView_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_VIEW__PROJECT = eINSTANCE.getDeploymentView_Project();

		/**
		 * The meta object literal for the '<em><b>Fv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_VIEW__FV = eINSTANCE.getDeploymentView_Fv();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.impl.DeviceImpl
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__HOST = eINSTANCE.getDevice_Host();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__TYPE = eINSTANCE.getDevice_Type();

		/**
		 * The meta object literal for the '<em><b>Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__CPU = eINSTANCE.getDevice_Cpu();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__STORAGE = eINSTANCE.getDevice_Storage();

		/**
		 * The meta object literal for the '<em><b>Mem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__MEM = eINSTANCE.getDevice_Mem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__OS = eINSTANCE.getDevice_Os();

		/**
		 * The meta object literal for the '<em><b>Pods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__PODS = eINSTANCE.getDevice_Pods();

		/**
		 * The meta object literal for the '<em><b>Dv</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__DV = eINSTANCE.getDevice_Dv();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.impl.ExecEnvironmentImpl <em>Exec Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.impl.ExecEnvironmentImpl
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getExecEnvironment()
		 * @generated
		 */
		EClass EXEC_ENVIRONMENT = eINSTANCE.getExecEnvironment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_ENVIRONMENT__NAME = eINSTANCE.getExecEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Cpu req</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_ENVIRONMENT__CPU_REQ = eINSTANCE.getExecEnvironment_Cpu_req();

		/**
		 * The meta object literal for the '<em><b>Mem req</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_ENVIRONMENT__MEM_REQ = eINSTANCE.getExecEnvironment_Mem_req();

		/**
		 * The meta object literal for the '<em><b>Cpu lim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_ENVIRONMENT__CPU_LIM = eINSTANCE.getExecEnvironment_Cpu_lim();

		/**
		 * The meta object literal for the '<em><b>Mem lim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_ENVIRONMENT__MEM_LIM = eINSTANCE.getExecEnvironment_Mem_lim();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_ENVIRONMENT__IMAGE = eINSTANCE.getExecEnvironment_Image();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_ENVIRONMENT__PORTS = eINSTANCE.getExecEnvironment_Ports();

		/**
		 * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_ENVIRONMENT__VARS = eINSTANCE.getExecEnvironment_Vars();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_ENVIRONMENT__COMMANDS = eINSTANCE.getExecEnvironment_Commands();

		/**
		 * The meta object literal for the '<em><b>Paas Arts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_ENVIRONMENT__PAAS_ARTS = eINSTANCE.getExecEnvironment_PaasArts();

		/**
		 * The meta object literal for the '<em><b>Pod Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_ENVIRONMENT__POD_OWNER = eINSTANCE.getExecEnvironment_PodOwner();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.impl.ArtifactImpl
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__PROPS = eINSTANCE.getArtifact_Props();

		/**
		 * The meta object literal for the '<em><b>Comp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__COMP = eINSTANCE.getArtifact_Comp();

		/**
		 * The meta object literal for the '<em><b>Conn</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__CONN = eINSTANCE.getArtifact_Conn();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__DECISION = eINSTANCE.getArtifact_Decision();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__TECHNOLOGY = eINSTANCE.getArtifact_Technology();

		/**
		 * The meta object literal for the '<em><b>Paas Env</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__PAAS_ENV = eINSTANCE.getArtifact_PaasEnv();

		/**
		 * The meta object literal for the '<em><b>Saas Env</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__SAAS_ENV = eINSTANCE.getArtifact_SaasEnv();

		/**
		 * The meta object literal for the '<em><b>Dv</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__DV = eINSTANCE.getArtifact_Dv();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.impl.DeploymentImpl
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__NAME = eINSTANCE.getDeployment_Name();

		/**
		 * The meta object literal for the '<em><b>Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__REPLICAS = eINSTANCE.getDeployment_Replicas();

		/**
		 * The meta object literal for the '<em><b>Max Surge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__MAX_SURGE = eINSTANCE.getDeployment_MaxSurge();

		/**
		 * The meta object literal for the '<em><b>Max Unavail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__MAX_UNAVAIL = eINSTANCE.getDeployment_MaxUnavail();

		/**
		 * The meta object literal for the '<em><b>Pods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__PODS = eINSTANCE.getDeployment_Pods();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__STRATEGY = eINSTANCE.getDeployment_Strategy();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__DECISION = eINSTANCE.getDeployment_Decision();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__MODEL = eINSTANCE.getDeployment_Model();

		/**
		 * The meta object literal for the '<em><b>Dv</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__DV = eINSTANCE.getDeployment_Dv();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.impl.PodImpl <em>Pod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.impl.PodImpl
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getPod()
		 * @generated
		 */
		EClass POD = eINSTANCE.getPod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POD__NAME = eINSTANCE.getPod_Name();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POD__HOST = eINSTANCE.getPod_Host();

		/**
		 * The meta object literal for the '<em><b>Restart Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POD__RESTART_POLICY = eINSTANCE.getPod_RestartPolicy();

		/**
		 * The meta object literal for the '<em><b>Envs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD__ENVS = eINSTANCE.getPod_Envs();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD__NODE = eINSTANCE.getPod_Node();

		/**
		 * The meta object literal for the '<em><b>Depl Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD__DEPL_OWNER = eINSTANCE.getPod_DeplOwner();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD__SERVICE = eINSTANCE.getPod_Service();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.impl.EnvVarImpl <em>Env Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.impl.EnvVarImpl
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getEnvVar()
		 * @generated
		 */
		EClass ENV_VAR = eINSTANCE.getEnvVar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_VAR__NAME = eINSTANCE.getEnvVar_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_VAR__VALUE = eINSTANCE.getEnvVar_Value();

		/**
		 * The meta object literal for the '<em><b>Exec Env</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_VAR__EXEC_ENV = eINSTANCE.getEnvVar_ExecEnv();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.impl.ServiceImpl
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PORTS = eINSTANCE.getService_Ports();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__TYPE = eINSTANCE.getService_Type();

		/**
		 * The meta object literal for the '<em><b>Ext Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__EXT_ACCESS = eINSTANCE.getService_ExtAccess();

		/**
		 * The meta object literal for the '<em><b>Dv</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DV = eINSTANCE.getService_Dv();

		/**
		 * The meta object literal for the '<em><b>Pod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__POD = eINSTANCE.getService_Pod();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.impl.ExposedPortImpl <em>Exposed Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.impl.ExposedPortImpl
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getExposedPort()
		 * @generated
		 */
		EClass EXPOSED_PORT = eINSTANCE.getExposedPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPOSED_PORT__NAME = eINSTANCE.getExposedPort_Name();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPOSED_PORT__PROTOCOL = eINSTANCE.getExposedPort_Protocol();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPOSED_PORT__TARGET = eINSTANCE.getExposedPort_Target();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPOSED_PORT__PORT = eINSTANCE.getExposedPort_Port();

		/**
		 * The meta object literal for the '<em><b>Exposes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPOSED_PORT__EXPOSES = eINSTANCE.getExposedPort_Exposes();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPOSED_PORT__SERVICE = eINSTANCE.getExposedPort_Service();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.impl.ServerlessEnvImpl <em>Serverless Env</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.impl.ServerlessEnvImpl
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getServerlessEnv()
		 * @generated
		 */
		EClass SERVERLESS_ENV = eINSTANCE.getServerlessEnv();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVERLESS_ENV__PROVIDER = eINSTANCE.getServerlessEnv_Provider();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVERLESS_ENV__TIMEOUT = eINSTANCE.getServerlessEnv_Timeout();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVERLESS_ENV__MEMORY = eINSTANCE.getServerlessEnv_Memory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVERLESS_ENV__NAME = eINSTANCE.getServerlessEnv_Name();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVERLESS_ENV__PROPS = eINSTANCE.getServerlessEnv_Props();

		/**
		 * The meta object literal for the '<em><b>Saas Arts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVERLESS_ENV__SAAS_ARTS = eINSTANCE.getServerlessEnv_SaasArts();

		/**
		 * The meta object literal for the '<em><b>Dv</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVERLESS_ENV__DV = eINSTANCE.getServerlessEnv_Dv();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.EventConnTech <em>Event Conn Tech</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.EventConnTech
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getEventConnTech()
		 * @generated
		 */
		EEnum EVENT_CONN_TECH = eINSTANCE.getEventConnTech();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.IngestorTech <em>Ingestor Tech</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.IngestorTech
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getIngestorTech()
		 * @generated
		 */
		EEnum INGESTOR_TECH = eINSTANCE.getIngestorTech();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.SinkTech <em>Sink Tech</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.SinkTech
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getSinkTech()
		 * @generated
		 */
		EEnum SINK_TECH = eINSTANCE.getSinkTech();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.EstimatorTech <em>Estimator Tech</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.EstimatorTech
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getEstimatorTech()
		 * @generated
		 */
		EEnum ESTIMATOR_TECH = eINSTANCE.getEstimatorTech();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.TransformerTech <em>Transformer Tech</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.TransformerTech
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getTransformerTech()
		 * @generated
		 */
		EEnum TRANSFORMER_TECH = eINSTANCE.getTransformerTech();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.TypeDevice <em>Type Device</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.TypeDevice
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getTypeDevice()
		 * @generated
		 */
		EEnum TYPE_DEVICE = eINSTANCE.getTypeDevice();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_dv.DeploymentModel <em>Deployment Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_dv.DeploymentModel
		 * @see co.edu.uniandes.accordant_dv.impl.Accordant_dvPackageImpl#getDeploymentModel()
		 * @generated
		 */
		EEnum DEPLOYMENT_MODEL = eINSTANCE.getDeploymentModel();

	}

} //Accordant_dvPackage
