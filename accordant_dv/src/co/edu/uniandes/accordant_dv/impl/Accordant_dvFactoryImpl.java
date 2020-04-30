/**
 */
package co.edu.uniandes.accordant_dv.impl;

import co.edu.uniandes.accordant_dv.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Accordant_dvFactoryImpl extends EFactoryImpl implements Accordant_dvFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Accordant_dvFactory init() {
		try {
			Accordant_dvFactory theAccordant_dvFactory = (Accordant_dvFactory)EPackage.Registry.INSTANCE.getEFactory(Accordant_dvPackage.eNS_URI);
			if (theAccordant_dvFactory != null) {
				return theAccordant_dvFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Accordant_dvFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accordant_dvFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Accordant_dvPackage.DEPLOYMENT_VIEW: return createDeploymentView();
			case Accordant_dvPackage.DEVICE: return createDevice();
			case Accordant_dvPackage.EXEC_ENVIRONMENT: return createExecEnvironment();
			case Accordant_dvPackage.ARTIFACT: return createArtifact();
			case Accordant_dvPackage.DEPLOYMENT: return createDeployment();
			case Accordant_dvPackage.POD: return createPod();
			case Accordant_dvPackage.ENV_VAR: return createEnvVar();
			case Accordant_dvPackage.SERVICE: return createService();
			case Accordant_dvPackage.EXPOSED_PORT: return createExposedPort();
			case Accordant_dvPackage.SERVERLESS_ENV: return createServerlessEnv();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Accordant_dvPackage.EVENT_CONN_TECH:
				return createEventConnTechFromString(eDataType, initialValue);
			case Accordant_dvPackage.INGESTOR_TECH:
				return createIngestorTechFromString(eDataType, initialValue);
			case Accordant_dvPackage.SINK_TECH:
				return createSinkTechFromString(eDataType, initialValue);
			case Accordant_dvPackage.ESTIMATOR_TECH:
				return createEstimatorTechFromString(eDataType, initialValue);
			case Accordant_dvPackage.TRANSFORMER_TECH:
				return createTransformerTechFromString(eDataType, initialValue);
			case Accordant_dvPackage.TYPE_DEVICE:
				return createTypeDeviceFromString(eDataType, initialValue);
			case Accordant_dvPackage.DEPLOYMENT_MODEL:
				return createDeploymentModelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Accordant_dvPackage.EVENT_CONN_TECH:
				return convertEventConnTechToString(eDataType, instanceValue);
			case Accordant_dvPackage.INGESTOR_TECH:
				return convertIngestorTechToString(eDataType, instanceValue);
			case Accordant_dvPackage.SINK_TECH:
				return convertSinkTechToString(eDataType, instanceValue);
			case Accordant_dvPackage.ESTIMATOR_TECH:
				return convertEstimatorTechToString(eDataType, instanceValue);
			case Accordant_dvPackage.TRANSFORMER_TECH:
				return convertTransformerTechToString(eDataType, instanceValue);
			case Accordant_dvPackage.TYPE_DEVICE:
				return convertTypeDeviceToString(eDataType, instanceValue);
			case Accordant_dvPackage.DEPLOYMENT_MODEL:
				return convertDeploymentModelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentView createDeploymentView() {
		DeploymentViewImpl deploymentView = new DeploymentViewImpl();
		return deploymentView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecEnvironment createExecEnvironment() {
		ExecEnvironmentImpl execEnvironment = new ExecEnvironmentImpl();
		return execEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pod createPod() {
		PodImpl pod = new PodImpl();
		return pod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvVar createEnvVar() {
		EnvVarImpl envVar = new EnvVarImpl();
		return envVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExposedPort createExposedPort() {
		ExposedPortImpl exposedPort = new ExposedPortImpl();
		return exposedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerlessEnv createServerlessEnv() {
		ServerlessEnvImpl serverlessEnv = new ServerlessEnvImpl();
		return serverlessEnv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventConnTech createEventConnTechFromString(EDataType eDataType, String initialValue) {
		EventConnTech result = EventConnTech.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventConnTechToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngestorTech createIngestorTechFromString(EDataType eDataType, String initialValue) {
		IngestorTech result = IngestorTech.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIngestorTechToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkTech createSinkTechFromString(EDataType eDataType, String initialValue) {
		SinkTech result = SinkTech.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSinkTechToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstimatorTech createEstimatorTechFromString(EDataType eDataType, String initialValue) {
		EstimatorTech result = EstimatorTech.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEstimatorTechToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerTech createTransformerTechFromString(EDataType eDataType, String initialValue) {
		TransformerTech result = TransformerTech.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransformerTechToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDevice createTypeDeviceFromString(EDataType eDataType, String initialValue) {
		TypeDevice result = TypeDevice.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDeviceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentModel createDeploymentModelFromString(EDataType eDataType, String initialValue) {
		DeploymentModel result = DeploymentModel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeploymentModelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Accordant_dvPackage getAccordant_dvPackage() {
		return (Accordant_dvPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Accordant_dvPackage getPackage() {
		return Accordant_dvPackage.eINSTANCE;
	}

} //Accordant_dvFactoryImpl
