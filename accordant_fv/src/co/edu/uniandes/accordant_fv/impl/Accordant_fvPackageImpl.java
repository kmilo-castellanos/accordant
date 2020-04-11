/**
 */
package co.edu.uniandes.accordant_fv.impl;

import co.edu.uniandes.accordant_fv.AccessType;
import co.edu.uniandes.accordant_fv.Accordant_fvFactory;
import co.edu.uniandes.accordant_fv.Accordant_fvPackage;
import co.edu.uniandes.accordant_fv.Adaptor;
import co.edu.uniandes.accordant_fv.AnalyticsComponent;
import co.edu.uniandes.accordant_fv.Arbitrator;
import co.edu.uniandes.accordant_fv.Buffering;
import co.edu.uniandes.accordant_fv.Component;
import co.edu.uniandes.accordant_fv.Connector;
import co.edu.uniandes.accordant_fv.DType;
import co.edu.uniandes.accordant_fv.DeliveryModel;
import co.edu.uniandes.accordant_fv.Distributor;
import co.edu.uniandes.accordant_fv.Estimator;
import co.edu.uniandes.accordant_fv.Event;
import co.edu.uniandes.accordant_fv.Field;
import co.edu.uniandes.accordant_fv.FunctionalView;
import co.edu.uniandes.accordant_fv.Ingestor;
import co.edu.uniandes.accordant_fv.NotificationModel;
import co.edu.uniandes.accordant_fv.Port;
import co.edu.uniandes.accordant_fv.PortType;
import co.edu.uniandes.accordant_fv.ProcedureCall;
import co.edu.uniandes.accordant_fv.ProcessingModel;
import co.edu.uniandes.accordant_fv.Role;
import co.edu.uniandes.accordant_fv.RoleType;
import co.edu.uniandes.accordant_fv.Sink;
import co.edu.uniandes.accordant_fv.Stream;
import co.edu.uniandes.accordant_fv.SyncType;
import co.edu.uniandes.accordant_fv.Throughput;
import co.edu.uniandes.accordant_fv.Transformer;

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
public class Accordant_fvPackageImpl extends EPackageImpl implements Accordant_fvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estimatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ingestorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analyticsComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arbitratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processingModelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deliveryModelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum syncTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum notificationModelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bufferingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum throughputEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dTypeEEnum = null;

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
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Accordant_fvPackageImpl() {
		super(eNS_URI, Accordant_fvFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Accordant_fvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Accordant_fvPackage init() {
		if (isInited) return (Accordant_fvPackage)EPackage.Registry.INSTANCE.getEPackage(Accordant_fvPackage.eNS_URI);

		// Obtain or create and register package
		Accordant_fvPackageImpl theAccordant_fvPackage = (Accordant_fvPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Accordant_fvPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Accordant_fvPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Accordant_rqPackageImpl theAccordant_rqPackage = (Accordant_rqPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Accordant_rqPackage.eNS_URI) instanceof Accordant_rqPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Accordant_rqPackage.eNS_URI) : Accordant_rqPackage.eINSTANCE);

		// Create package meta-data objects
		theAccordant_fvPackage.createPackageContents();
		theAccordant_rqPackage.createPackageContents();

		// Initialize created meta-data
		theAccordant_fvPackage.initializePackageContents();
		theAccordant_rqPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAccordant_fvPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Accordant_fvPackage.eNS_URI, theAccordant_fvPackage);
		return theAccordant_fvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalView() {
		return functionalViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalView_Name() {
		return (EAttribute)functionalViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalView_Conns() {
		return (EReference)functionalViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalView_Comps() {
		return (EReference)functionalViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalView_Project() {
		return (EReference)functionalViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Name() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Delivery() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Synct() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Notification() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Buffering() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Throughput() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Roles() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Protocol() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Decision() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Props() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Ports() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_ProcModel() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_FuncView() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Decision() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformer() {
		return transformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_SqlExp() {
		return (EAttribute)transformerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_LambdaExp() {
		return (EAttribute)transformerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_CodeRepo() {
		return (EAttribute)transformerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEstimator() {
		return estimatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStream() {
		return streamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptor() {
		return adaptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistributor() {
		return distributorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIngestor() {
		return ingestorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngestor_Conn() {
		return (EAttribute)ingestorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngestor_Format() {
		return (EAttribute)ingestorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngestor_Props() {
		return (EAttribute)ingestorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngestor_Type() {
		return (EAttribute)ingestorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalyticsComponent() {
		return analyticsComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalyticsComponent_Pmml() {
		return (EAttribute)analyticsComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSink() {
		return sinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSink_Conn() {
		return (EAttribute)sinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSink_Format() {
		return (EAttribute)sinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSink_Type() {
		return (EAttribute)sinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSink_Props() {
		return (EAttribute)sinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Type() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Name() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Fields() {
		return (EReference)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArbitrator() {
		return arbitratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Type() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Port() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureCall() {
		return procedureCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Name() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Dtype() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Order() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessingModel() {
		return processingModelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeliveryModel() {
		return deliveryModelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSyncType() {
		return syncTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNotificationModel() {
		return notificationModelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBuffering() {
		return bufferingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getThroughput() {
		return throughputEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortType() {
		return portTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoleType() {
		return roleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessType() {
		return accessTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDType() {
		return dTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accordant_fvFactory getAccordant_fvFactory() {
		return (Accordant_fvFactory)getEFactoryInstance();
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
		functionalViewEClass = createEClass(FUNCTIONAL_VIEW);
		createEAttribute(functionalViewEClass, FUNCTIONAL_VIEW__NAME);
		createEReference(functionalViewEClass, FUNCTIONAL_VIEW__CONNS);
		createEReference(functionalViewEClass, FUNCTIONAL_VIEW__COMPS);
		createEReference(functionalViewEClass, FUNCTIONAL_VIEW__PROJECT);

		connectorEClass = createEClass(CONNECTOR);
		createEAttribute(connectorEClass, CONNECTOR__NAME);
		createEAttribute(connectorEClass, CONNECTOR__DELIVERY);
		createEAttribute(connectorEClass, CONNECTOR__SYNCT);
		createEAttribute(connectorEClass, CONNECTOR__NOTIFICATION);
		createEAttribute(connectorEClass, CONNECTOR__BUFFERING);
		createEAttribute(connectorEClass, CONNECTOR__THROUGHPUT);
		createEReference(connectorEClass, CONNECTOR__ROLES);
		createEAttribute(connectorEClass, CONNECTOR__PROTOCOL);
		createEReference(connectorEClass, CONNECTOR__DECISION);
		createEAttribute(connectorEClass, CONNECTOR__PROPS);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEReference(componentEClass, COMPONENT__PORTS);
		createEAttribute(componentEClass, COMPONENT__PROC_MODEL);
		createEReference(componentEClass, COMPONENT__FUNC_VIEW);
		createEReference(componentEClass, COMPONENT__DECISION);

		transformerEClass = createEClass(TRANSFORMER);
		createEAttribute(transformerEClass, TRANSFORMER__SQL_EXP);
		createEAttribute(transformerEClass, TRANSFORMER__LAMBDA_EXP);
		createEAttribute(transformerEClass, TRANSFORMER__CODE_REPO);

		estimatorEClass = createEClass(ESTIMATOR);

		streamEClass = createEClass(STREAM);

		adaptorEClass = createEClass(ADAPTOR);

		distributorEClass = createEClass(DISTRIBUTOR);

		ingestorEClass = createEClass(INGESTOR);
		createEAttribute(ingestorEClass, INGESTOR__CONN);
		createEAttribute(ingestorEClass, INGESTOR__FORMAT);
		createEAttribute(ingestorEClass, INGESTOR__PROPS);
		createEAttribute(ingestorEClass, INGESTOR__TYPE);

		analyticsComponentEClass = createEClass(ANALYTICS_COMPONENT);
		createEAttribute(analyticsComponentEClass, ANALYTICS_COMPONENT__PMML);

		eventEClass = createEClass(EVENT);

		sinkEClass = createEClass(SINK);
		createEAttribute(sinkEClass, SINK__CONN);
		createEAttribute(sinkEClass, SINK__FORMAT);
		createEAttribute(sinkEClass, SINK__TYPE);
		createEAttribute(sinkEClass, SINK__PROPS);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__TYPE);
		createEAttribute(portEClass, PORT__NAME);
		createEReference(portEClass, PORT__FIELDS);

		arbitratorEClass = createEClass(ARBITRATOR);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__TYPE);
		createEAttribute(roleEClass, ROLE__NAME);
		createEReference(roleEClass, ROLE__PORT);

		procedureCallEClass = createEClass(PROCEDURE_CALL);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEAttribute(fieldEClass, FIELD__DTYPE);
		createEAttribute(fieldEClass, FIELD__ORDER);

		// Create enums
		processingModelEEnum = createEEnum(PROCESSING_MODEL);
		deliveryModelEEnum = createEEnum(DELIVERY_MODEL);
		syncTypeEEnum = createEEnum(SYNC_TYPE);
		notificationModelEEnum = createEEnum(NOTIFICATION_MODEL);
		bufferingEEnum = createEEnum(BUFFERING);
		throughputEEnum = createEEnum(THROUGHPUT);
		portTypeEEnum = createEEnum(PORT_TYPE);
		roleTypeEEnum = createEEnum(ROLE_TYPE);
		accessTypeEEnum = createEEnum(ACCESS_TYPE);
		dTypeEEnum = createEEnum(DTYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		transformerEClass.getESuperTypes().add(this.getAnalyticsComponent());
		estimatorEClass.getESuperTypes().add(this.getAnalyticsComponent());
		streamEClass.getESuperTypes().add(this.getConnector());
		adaptorEClass.getESuperTypes().add(this.getConnector());
		distributorEClass.getESuperTypes().add(this.getConnector());
		ingestorEClass.getESuperTypes().add(this.getComponent());
		analyticsComponentEClass.getESuperTypes().add(this.getComponent());
		eventEClass.getESuperTypes().add(this.getConnector());
		sinkEClass.getESuperTypes().add(this.getComponent());
		arbitratorEClass.getESuperTypes().add(this.getConnector());
		procedureCallEClass.getESuperTypes().add(this.getConnector());

		// Initialize classes, features, and operations; add parameters
		initEClass(functionalViewEClass, FunctionalView.class, "FunctionalView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalView_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionalView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalView_Conns(), this.getConnector(), null, "conns", null, 1, -1, FunctionalView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalView_Comps(), this.getComponent(), this.getComponent_FuncView(), "comps", null, 1, -1, FunctionalView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalView_Project(), theAccordant_rqPackage.getProject(), null, "project", null, 1, 1, FunctionalView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnector_Name(), ecorePackage.getEString(), "name", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Delivery(), this.getDeliveryModel(), "delivery", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Synct(), this.getSyncType(), "synct", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Notification(), this.getNotificationModel(), "notification", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Buffering(), this.getBuffering(), "buffering", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Throughput(), this.getThroughput(), "throughput", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Roles(), this.getRole(), null, "roles", null, 1, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Decision(), theAccordant_rqPackage.getArchDecision(), null, "decision", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Props(), ecorePackage.getEString(), "props", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Ports(), this.getPort(), null, "ports", null, 1, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_ProcModel(), this.getProcessingModel(), "procModel", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_FuncView(), this.getFunctionalView(), this.getFunctionalView_Comps(), "funcView", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Decision(), theAccordant_rqPackage.getArchDecision(), null, "decision", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformerEClass, Transformer.class, "Transformer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformer_SqlExp(), ecorePackage.getEString(), "sqlExp", null, 0, 1, Transformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformer_LambdaExp(), ecorePackage.getEString(), "lambdaExp", null, 0, 1, Transformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformer_CodeRepo(), ecorePackage.getEString(), "codeRepo", null, 0, 1, Transformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(estimatorEClass, Estimator.class, "Estimator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(streamEClass, Stream.class, "Stream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adaptorEClass, Adaptor.class, "Adaptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(distributorEClass, Distributor.class, "Distributor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ingestorEClass, Ingestor.class, "Ingestor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIngestor_Conn(), ecorePackage.getEString(), "conn", null, 0, 1, Ingestor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIngestor_Format(), ecorePackage.getEString(), "format", null, 0, 1, Ingestor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIngestor_Props(), ecorePackage.getEString(), "props", null, 0, 1, Ingestor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIngestor_Type(), this.getAccessType(), "type", null, 0, 1, Ingestor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analyticsComponentEClass, AnalyticsComponent.class, "AnalyticsComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalyticsComponent_Pmml(), ecorePackage.getEString(), "pmml", null, 0, 1, AnalyticsComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sinkEClass, Sink.class, "Sink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSink_Conn(), ecorePackage.getEString(), "conn", null, 0, 1, Sink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSink_Format(), ecorePackage.getEString(), "format", null, 0, 1, Sink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSink_Type(), this.getAccessType(), "type", null, 0, 1, Sink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSink_Props(), ecorePackage.getEString(), "props", "", 0, 1, Sink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Type(), this.getPortType(), "type", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Fields(), this.getField(), null, "fields", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arbitratorEClass, Arbitrator.class, "Arbitrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Type(), this.getRoleType(), "type", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Port(), this.getPort(), null, "port", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedureCallEClass, ProcedureCall.class, "ProcedureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Dtype(), ecorePackage.getEString(), "dtype", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Order(), ecorePackage.getEShort(), "order", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(processingModelEEnum, ProcessingModel.class, "ProcessingModel");
		addEEnumLiteral(processingModelEEnum, ProcessingModel.STREAM);
		addEEnumLiteral(processingModelEEnum, ProcessingModel.BATCH);
		addEEnumLiteral(processingModelEEnum, ProcessingModel.MICROBATCH);

		initEEnum(deliveryModelEEnum, DeliveryModel.class, "DeliveryModel");
		addEEnumLiteral(deliveryModelEEnum, DeliveryModel.BEST_EFFORT);
		addEEnumLiteral(deliveryModelEEnum, DeliveryModel.AT_LEAST_ONE);
		addEEnumLiteral(deliveryModelEEnum, DeliveryModel.AT_MOST_ONE);
		addEEnumLiteral(deliveryModelEEnum, DeliveryModel.EXACTLY_ONE);

		initEEnum(syncTypeEEnum, SyncType.class, "SyncType");
		addEEnumLiteral(syncTypeEEnum, SyncType.ASYNC);
		addEEnumLiteral(syncTypeEEnum, SyncType.SYNC);

		initEEnum(notificationModelEEnum, NotificationModel.class, "NotificationModel");
		addEEnumLiteral(notificationModelEEnum, NotificationModel.POLLED);
		addEEnumLiteral(notificationModelEEnum, NotificationModel.PUBSUB);
		addEEnumLiteral(notificationModelEEnum, NotificationModel.QUEUED);
		addEEnumLiteral(notificationModelEEnum, NotificationModel.CENTRAL);

		initEEnum(bufferingEEnum, Buffering.class, "Buffering");
		addEEnumLiteral(bufferingEEnum, Buffering.BUFFERED);
		addEEnumLiteral(bufferingEEnum, Buffering.UNBUFFERED);

		initEEnum(throughputEEnum, Throughput.class, "Throughput");
		addEEnumLiteral(throughputEEnum, Throughput.ATOMIC);
		addEEnumLiteral(throughputEEnum, Throughput.HIGH_ORDER);

		initEEnum(portTypeEEnum, PortType.class, "PortType");
		addEEnumLiteral(portTypeEEnum, PortType.REQUIRED);
		addEEnumLiteral(portTypeEEnum, PortType.PROVIDED);

		initEEnum(roleTypeEEnum, RoleType.class, "RoleType");
		addEEnumLiteral(roleTypeEEnum, RoleType.OUT);
		addEEnumLiteral(roleTypeEEnum, RoleType.IN);

		initEEnum(accessTypeEEnum, AccessType.class, "AccessType");
		addEEnumLiteral(accessTypeEEnum, AccessType.HTTP);
		addEEnumLiteral(accessTypeEEnum, AccessType.HDFS);
		addEEnumLiteral(accessTypeEEnum, AccessType.DATABASE);
		addEEnumLiteral(accessTypeEEnum, AccessType.FILESYSTEM);

		initEEnum(dTypeEEnum, DType.class, "DType");
		addEEnumLiteral(dTypeEEnum, DType.STRING);
		addEEnumLiteral(dTypeEEnum, DType.INT);
		addEEnumLiteral(dTypeEEnum, DType.FLOAT);
		addEEnumLiteral(dTypeEEnum, DType.DOUBLE);
		addEEnumLiteral(dTypeEEnum, DType.DATE);
		addEEnumLiteral(dTypeEEnum, DType.BOOLEAN);
		addEEnumLiteral(dTypeEEnum, DType.BLOB);
		addEEnumLiteral(dTypeEEnum, DType.BYTE);
		addEEnumLiteral(dTypeEEnum, DType.LONG);

		// Create resource
		createResource(eNS_URI);
	}

} //Accordant_fvPackageImpl
