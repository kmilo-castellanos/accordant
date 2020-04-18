/**
 */
package co.edu.uniandes.accordant_fv.impl;

import co.edu.uniandes.accordant_fv.*;

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
public class Accordant_fvFactoryImpl extends EFactoryImpl implements Accordant_fvFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Accordant_fvFactory init() {
		try {
			Accordant_fvFactory theAccordant_fvFactory = (Accordant_fvFactory)EPackage.Registry.INSTANCE.getEFactory(Accordant_fvPackage.eNS_URI);
			if (theAccordant_fvFactory != null) {
				return theAccordant_fvFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Accordant_fvFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accordant_fvFactoryImpl() {
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
			case Accordant_fvPackage.FUNCTIONAL_VIEW: return createFunctionalView();
			case Accordant_fvPackage.TRANSFORMER: return createTransformer();
			case Accordant_fvPackage.ESTIMATOR: return createEstimator();
			case Accordant_fvPackage.STREAM: return createStream();
			case Accordant_fvPackage.ADAPTOR: return createAdaptor();
			case Accordant_fvPackage.DISTRIBUTOR: return createDistributor();
			case Accordant_fvPackage.INGESTOR: return createIngestor();
			case Accordant_fvPackage.EVENT: return createEvent();
			case Accordant_fvPackage.SINK: return createSink();
			case Accordant_fvPackage.PORT: return createPort();
			case Accordant_fvPackage.ARBITRATOR: return createArbitrator();
			case Accordant_fvPackage.ROLE: return createRole();
			case Accordant_fvPackage.PROCEDURE_CALL: return createProcedureCall();
			case Accordant_fvPackage.FIELD: return createField();
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
			case Accordant_fvPackage.PROCESSING_MODEL:
				return createProcessingModelFromString(eDataType, initialValue);
			case Accordant_fvPackage.DELIVERY_GUARANTEE:
				return createDeliveryGuaranteeFromString(eDataType, initialValue);
			case Accordant_fvPackage.SYNC_TYPE:
				return createSyncTypeFromString(eDataType, initialValue);
			case Accordant_fvPackage.NOTIFICATION_MODEL:
				return createNotificationModelFromString(eDataType, initialValue);
			case Accordant_fvPackage.BUFFERING:
				return createBufferingFromString(eDataType, initialValue);
			case Accordant_fvPackage.THROUGHPUT:
				return createThroughputFromString(eDataType, initialValue);
			case Accordant_fvPackage.PORT_TYPE:
				return createPortTypeFromString(eDataType, initialValue);
			case Accordant_fvPackage.ROLE_TYPE:
				return createRoleTypeFromString(eDataType, initialValue);
			case Accordant_fvPackage.ACCESS_TYPE:
				return createAccessTypeFromString(eDataType, initialValue);
			case Accordant_fvPackage.DTYPE:
				return createDTypeFromString(eDataType, initialValue);
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
			case Accordant_fvPackage.PROCESSING_MODEL:
				return convertProcessingModelToString(eDataType, instanceValue);
			case Accordant_fvPackage.DELIVERY_GUARANTEE:
				return convertDeliveryGuaranteeToString(eDataType, instanceValue);
			case Accordant_fvPackage.SYNC_TYPE:
				return convertSyncTypeToString(eDataType, instanceValue);
			case Accordant_fvPackage.NOTIFICATION_MODEL:
				return convertNotificationModelToString(eDataType, instanceValue);
			case Accordant_fvPackage.BUFFERING:
				return convertBufferingToString(eDataType, instanceValue);
			case Accordant_fvPackage.THROUGHPUT:
				return convertThroughputToString(eDataType, instanceValue);
			case Accordant_fvPackage.PORT_TYPE:
				return convertPortTypeToString(eDataType, instanceValue);
			case Accordant_fvPackage.ROLE_TYPE:
				return convertRoleTypeToString(eDataType, instanceValue);
			case Accordant_fvPackage.ACCESS_TYPE:
				return convertAccessTypeToString(eDataType, instanceValue);
			case Accordant_fvPackage.DTYPE:
				return convertDTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalView createFunctionalView() {
		FunctionalViewImpl functionalView = new FunctionalViewImpl();
		return functionalView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformer createTransformer() {
		TransformerImpl transformer = new TransformerImpl();
		return transformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Estimator createEstimator() {
		EstimatorImpl estimator = new EstimatorImpl();
		return estimator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stream createStream() {
		StreamImpl stream = new StreamImpl();
		return stream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adaptor createAdaptor() {
		AdaptorImpl adaptor = new AdaptorImpl();
		return adaptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distributor createDistributor() {
		DistributorImpl distributor = new DistributorImpl();
		return distributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingestor createIngestor() {
		IngestorImpl ingestor = new IngestorImpl();
		return ingestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sink createSink() {
		SinkImpl sink = new SinkImpl();
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arbitrator createArbitrator() {
		ArbitratorImpl arbitrator = new ArbitratorImpl();
		return arbitrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureCall createProcedureCall() {
		ProcedureCallImpl procedureCall = new ProcedureCallImpl();
		return procedureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingModel createProcessingModelFromString(EDataType eDataType, String initialValue) {
		ProcessingModel result = ProcessingModel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingModelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryGuarantee createDeliveryGuaranteeFromString(EDataType eDataType, String initialValue) {
		DeliveryGuarantee result = DeliveryGuarantee.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeliveryGuaranteeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncType createSyncTypeFromString(EDataType eDataType, String initialValue) {
		SyncType result = SyncType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSyncTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationModel createNotificationModelFromString(EDataType eDataType, String initialValue) {
		NotificationModel result = NotificationModel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotificationModelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffering createBufferingFromString(EDataType eDataType, String initialValue) {
		Buffering result = Buffering.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBufferingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throughput createThroughputFromString(EDataType eDataType, String initialValue) {
		Throughput result = Throughput.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThroughputToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortTypeFromString(EDataType eDataType, String initialValue) {
		PortType result = PortType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType createRoleTypeFromString(EDataType eDataType, String initialValue) {
		RoleType result = RoleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessTypeFromString(EDataType eDataType, String initialValue) {
		AccessType result = AccessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DType createDTypeFromString(EDataType eDataType, String initialValue) {
		DType result = DType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accordant_fvPackage getAccordant_fvPackage() {
		return (Accordant_fvPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Accordant_fvPackage getPackage() {
		return Accordant_fvPackage.eINSTANCE;
	}

} //Accordant_fvFactoryImpl
