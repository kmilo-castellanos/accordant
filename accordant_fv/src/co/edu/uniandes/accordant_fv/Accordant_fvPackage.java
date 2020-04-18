/**
 */
package co.edu.uniandes.accordant_fv;

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
 * @see co.edu.uniandes.accordant_fv.Accordant_fvFactory
 * @model kind="package"
 * @generated
 */
public interface Accordant_fvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "accordant_fv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uniandes.accordant.functional";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "accordant_fv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Accordant_fvPackage eINSTANCE = co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl.init();

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.FunctionalViewImpl <em>Functional View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.FunctionalViewImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getFunctionalView()
	 * @generated
	 */
	int FUNCTIONAL_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_VIEW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Conns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_VIEW__CONNS = 1;

	/**
	 * The feature id for the '<em><b>Comps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_VIEW__COMPS = 2;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_VIEW__PROJECT = 3;

	/**
	 * The number of structural features of the '<em>Functional View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_VIEW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Functional View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.ConnectorImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DELIVERY = 1;

	/**
	 * The feature id for the '<em><b>Synct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SYNCT = 2;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NOTIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__BUFFERING = 4;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__THROUGHPUT = 5;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ROLES = 6;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PROTOCOL = 7;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DECISION = 8;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PROPS = 9;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.ComponentImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORTS = 1;

	/**
	 * The feature id for the '<em><b>Proc Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROC_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Func View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FUNC_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DECISION = 4;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DELIVERY = 5;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.AnalyticsComponentImpl <em>Analytics Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.AnalyticsComponentImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getAnalyticsComponent()
	 * @generated
	 */
	int ANALYTICS_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_COMPONENT__PORTS = COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Proc Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_COMPONENT__PROC_MODEL = COMPONENT__PROC_MODEL;

	/**
	 * The feature id for the '<em><b>Func View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_COMPONENT__FUNC_VIEW = COMPONENT__FUNC_VIEW;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_COMPONENT__DECISION = COMPONENT__DECISION;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_COMPONENT__DELIVERY = COMPONENT__DELIVERY;

	/**
	 * The feature id for the '<em><b>Pmml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_COMPONENT__PMML = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analytics Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Analytics Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.TransformerImpl <em>Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.TransformerImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getTransformer()
	 * @generated
	 */
	int TRANSFORMER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__NAME = ANALYTICS_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__PORTS = ANALYTICS_COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Proc Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__PROC_MODEL = ANALYTICS_COMPONENT__PROC_MODEL;

	/**
	 * The feature id for the '<em><b>Func View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__FUNC_VIEW = ANALYTICS_COMPONENT__FUNC_VIEW;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__DECISION = ANALYTICS_COMPONENT__DECISION;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__DELIVERY = ANALYTICS_COMPONENT__DELIVERY;

	/**
	 * The feature id for the '<em><b>Pmml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__PMML = ANALYTICS_COMPONENT__PMML;

	/**
	 * The feature id for the '<em><b>Sql Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__SQL_EXP = ANALYTICS_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lambda Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__LAMBDA_EXP = ANALYTICS_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__CODE_REPO = ANALYTICS_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_FEATURE_COUNT = ANALYTICS_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OPERATION_COUNT = ANALYTICS_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.EstimatorImpl <em>Estimator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.EstimatorImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getEstimator()
	 * @generated
	 */
	int ESTIMATOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATOR__NAME = ANALYTICS_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATOR__PORTS = ANALYTICS_COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Proc Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATOR__PROC_MODEL = ANALYTICS_COMPONENT__PROC_MODEL;

	/**
	 * The feature id for the '<em><b>Func View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATOR__FUNC_VIEW = ANALYTICS_COMPONENT__FUNC_VIEW;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATOR__DECISION = ANALYTICS_COMPONENT__DECISION;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATOR__DELIVERY = ANALYTICS_COMPONENT__DELIVERY;

	/**
	 * The feature id for the '<em><b>Pmml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATOR__PMML = ANALYTICS_COMPONENT__PMML;

	/**
	 * The number of structural features of the '<em>Estimator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATOR_FEATURE_COUNT = ANALYTICS_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Estimator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATOR_OPERATION_COUNT = ANALYTICS_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.StreamImpl <em>Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.StreamImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getStream()
	 * @generated
	 */
	int STREAM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__DELIVERY = CONNECTOR__DELIVERY;

	/**
	 * The feature id for the '<em><b>Synct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__SYNCT = CONNECTOR__SYNCT;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__NOTIFICATION = CONNECTOR__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__BUFFERING = CONNECTOR__BUFFERING;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__THROUGHPUT = CONNECTOR__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__ROLES = CONNECTOR__ROLES;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__PROTOCOL = CONNECTOR__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__DECISION = CONNECTOR__DECISION;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__PROPS = CONNECTOR__PROPS;

	/**
	 * The number of structural features of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.AdaptorImpl <em>Adaptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.AdaptorImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getAdaptor()
	 * @generated
	 */
	int ADAPTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__DELIVERY = CONNECTOR__DELIVERY;

	/**
	 * The feature id for the '<em><b>Synct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__SYNCT = CONNECTOR__SYNCT;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__NOTIFICATION = CONNECTOR__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__BUFFERING = CONNECTOR__BUFFERING;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__THROUGHPUT = CONNECTOR__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__ROLES = CONNECTOR__ROLES;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__PROTOCOL = CONNECTOR__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__DECISION = CONNECTOR__DECISION;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR__PROPS = CONNECTOR__PROPS;

	/**
	 * The number of structural features of the '<em>Adaptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Adaptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.DistributorImpl <em>Distributor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.DistributorImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getDistributor()
	 * @generated
	 */
	int DISTRIBUTOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__DELIVERY = CONNECTOR__DELIVERY;

	/**
	 * The feature id for the '<em><b>Synct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__SYNCT = CONNECTOR__SYNCT;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__NOTIFICATION = CONNECTOR__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__BUFFERING = CONNECTOR__BUFFERING;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__THROUGHPUT = CONNECTOR__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__ROLES = CONNECTOR__ROLES;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__PROTOCOL = CONNECTOR__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__DECISION = CONNECTOR__DECISION;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR__PROPS = CONNECTOR__PROPS;

	/**
	 * The number of structural features of the '<em>Distributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Distributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.IngestorImpl <em>Ingestor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.IngestorImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getIngestor()
	 * @generated
	 */
	int INGESTOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGESTOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGESTOR__PORTS = COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Proc Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGESTOR__PROC_MODEL = COMPONENT__PROC_MODEL;

	/**
	 * The feature id for the '<em><b>Func View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGESTOR__FUNC_VIEW = COMPONENT__FUNC_VIEW;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGESTOR__DECISION = COMPONENT__DECISION;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGESTOR__DELIVERY = COMPONENT__DELIVERY;

	/**
	 * The feature id for the '<em><b>Conn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGESTOR__CONN = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGESTOR__FORMAT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGESTOR__PROPS = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGESTOR__TYPE = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ingestor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGESTOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ingestor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGESTOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.EventImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DELIVERY = CONNECTOR__DELIVERY;

	/**
	 * The feature id for the '<em><b>Synct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SYNCT = CONNECTOR__SYNCT;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NOTIFICATION = CONNECTOR__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__BUFFERING = CONNECTOR__BUFFERING;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__THROUGHPUT = CONNECTOR__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ROLES = CONNECTOR__ROLES;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PROTOCOL = CONNECTOR__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DECISION = CONNECTOR__DECISION;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PROPS = CONNECTOR__PROPS;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.SinkImpl <em>Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.SinkImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getSink()
	 * @generated
	 */
	int SINK = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__PORTS = COMPONENT__PORTS;

	/**
	 * The feature id for the '<em><b>Proc Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__PROC_MODEL = COMPONENT__PROC_MODEL;

	/**
	 * The feature id for the '<em><b>Func View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__FUNC_VIEW = COMPONENT__FUNC_VIEW;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__DECISION = COMPONENT__DECISION;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__DELIVERY = COMPONENT__DELIVERY;

	/**
	 * The feature id for the '<em><b>Conn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__CONN = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__FORMAT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__TYPE = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__PROPS = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.PortImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__FIELDS = 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ROLE = 3;

	/**
	 * The feature id for the '<em><b>Comp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__COMP = 4;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.ArbitratorImpl <em>Arbitrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.ArbitratorImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getArbitrator()
	 * @generated
	 */
	int ARBITRATOR = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__DELIVERY = CONNECTOR__DELIVERY;

	/**
	 * The feature id for the '<em><b>Synct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__SYNCT = CONNECTOR__SYNCT;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__NOTIFICATION = CONNECTOR__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__BUFFERING = CONNECTOR__BUFFERING;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__THROUGHPUT = CONNECTOR__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__ROLES = CONNECTOR__ROLES;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__PROTOCOL = CONNECTOR__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__DECISION = CONNECTOR__DECISION;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__PROPS = CONNECTOR__PROPS;

	/**
	 * The number of structural features of the '<em>Arbitrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arbitrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.RoleImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PORT = 2;

	/**
	 * The feature id for the '<em><b>Conn</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONN = 3;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.ProcedureCallImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getProcedureCall()
	 * @generated
	 */
	int PROCEDURE_CALL = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__DELIVERY = CONNECTOR__DELIVERY;

	/**
	 * The feature id for the '<em><b>Synct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__SYNCT = CONNECTOR__SYNCT;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__NOTIFICATION = CONNECTOR__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__BUFFERING = CONNECTOR__BUFFERING;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__THROUGHPUT = CONNECTOR__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__ROLES = CONNECTOR__ROLES;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__PROTOCOL = CONNECTOR__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__DECISION = CONNECTOR__DECISION;

	/**
	 * The feature id for the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__PROPS = CONNECTOR__PROPS;

	/**
	 * The number of structural features of the '<em>Procedure Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Procedure Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.impl.FieldImpl
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DTYPE = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ORDER = 2;

	/**
	 * The feature id for the '<em><b>Portowner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PORTOWNER = 3;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.ProcessingModel <em>Processing Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.ProcessingModel
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getProcessingModel()
	 * @generated
	 */
	int PROCESSING_MODEL = 17;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.DeliveryGuarantee <em>Delivery Guarantee</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.DeliveryGuarantee
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getDeliveryGuarantee()
	 * @generated
	 */
	int DELIVERY_GUARANTEE = 18;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.SyncType <em>Sync Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.SyncType
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getSyncType()
	 * @generated
	 */
	int SYNC_TYPE = 19;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.NotificationModel <em>Notification Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.NotificationModel
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getNotificationModel()
	 * @generated
	 */
	int NOTIFICATION_MODEL = 20;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.Buffering <em>Buffering</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.Buffering
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getBuffering()
	 * @generated
	 */
	int BUFFERING = 21;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.Throughput <em>Throughput</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.Throughput
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getThroughput()
	 * @generated
	 */
	int THROUGHPUT = 22;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.PortType <em>Port Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.PortType
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 23;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.RoleType <em>Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.RoleType
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 24;


	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.AccessType
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 25;


	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_fv.DType <em>DType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_fv.DType
	 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getDType()
	 * @generated
	 */
	int DTYPE = 26;


	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.FunctionalView <em>Functional View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional View</em>'.
	 * @see co.edu.uniandes.accordant_fv.FunctionalView
	 * @generated
	 */
	EClass getFunctionalView();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.FunctionalView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_fv.FunctionalView#getName()
	 * @see #getFunctionalView()
	 * @generated
	 */
	EAttribute getFunctionalView_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_fv.FunctionalView#getConns <em>Conns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conns</em>'.
	 * @see co.edu.uniandes.accordant_fv.FunctionalView#getConns()
	 * @see #getFunctionalView()
	 * @generated
	 */
	EReference getFunctionalView_Conns();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_fv.FunctionalView#getComps <em>Comps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comps</em>'.
	 * @see co.edu.uniandes.accordant_fv.FunctionalView#getComps()
	 * @see #getFunctionalView()
	 * @generated
	 */
	EReference getFunctionalView_Comps();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_fv.FunctionalView#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see co.edu.uniandes.accordant_fv.FunctionalView#getProject()
	 * @see #getFunctionalView()
	 * @generated
	 */
	EReference getFunctionalView_Project();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see co.edu.uniandes.accordant_fv.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_fv.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Connector#getDelivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery</em>'.
	 * @see co.edu.uniandes.accordant_fv.Connector#getDelivery()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Delivery();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Connector#getSynct <em>Synct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synct</em>'.
	 * @see co.edu.uniandes.accordant_fv.Connector#getSynct()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Synct();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Connector#getNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification</em>'.
	 * @see co.edu.uniandes.accordant_fv.Connector#getNotification()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Notification();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Connector#getBuffering <em>Buffering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffering</em>'.
	 * @see co.edu.uniandes.accordant_fv.Connector#getBuffering()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Buffering();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Connector#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see co.edu.uniandes.accordant_fv.Connector#getThroughput()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Throughput();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_fv.Connector#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see co.edu.uniandes.accordant_fv.Connector#getRoles()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Roles();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Connector#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see co.edu.uniandes.accordant_fv.Connector#getProtocol()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Protocol();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_fv.Connector#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decision</em>'.
	 * @see co.edu.uniandes.accordant_fv.Connector#getDecision()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Decision();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Connector#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Props</em>'.
	 * @see co.edu.uniandes.accordant_fv.Connector#getProps()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Props();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see co.edu.uniandes.accordant_fv.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_fv.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_fv.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see co.edu.uniandes.accordant_fv.Component#getPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Ports();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Component#getProcModel <em>Proc Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proc Model</em>'.
	 * @see co.edu.uniandes.accordant_fv.Component#getProcModel()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ProcModel();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.accordant_fv.Component#getFuncView <em>Func View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Func View</em>'.
	 * @see co.edu.uniandes.accordant_fv.Component#getFuncView()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_FuncView();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_fv.Component#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decision</em>'.
	 * @see co.edu.uniandes.accordant_fv.Component#getDecision()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Decision();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Component#getDelivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery</em>'.
	 * @see co.edu.uniandes.accordant_fv.Component#getDelivery()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Delivery();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.Transformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer</em>'.
	 * @see co.edu.uniandes.accordant_fv.Transformer
	 * @generated
	 */
	EClass getTransformer();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Transformer#getSqlExp <em>Sql Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sql Exp</em>'.
	 * @see co.edu.uniandes.accordant_fv.Transformer#getSqlExp()
	 * @see #getTransformer()
	 * @generated
	 */
	EAttribute getTransformer_SqlExp();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Transformer#getLambdaExp <em>Lambda Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lambda Exp</em>'.
	 * @see co.edu.uniandes.accordant_fv.Transformer#getLambdaExp()
	 * @see #getTransformer()
	 * @generated
	 */
	EAttribute getTransformer_LambdaExp();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Transformer#getCodeRepo <em>Code Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Repo</em>'.
	 * @see co.edu.uniandes.accordant_fv.Transformer#getCodeRepo()
	 * @see #getTransformer()
	 * @generated
	 */
	EAttribute getTransformer_CodeRepo();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.Estimator <em>Estimator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estimator</em>'.
	 * @see co.edu.uniandes.accordant_fv.Estimator
	 * @generated
	 */
	EClass getEstimator();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream</em>'.
	 * @see co.edu.uniandes.accordant_fv.Stream
	 * @generated
	 */
	EClass getStream();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.Adaptor <em>Adaptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptor</em>'.
	 * @see co.edu.uniandes.accordant_fv.Adaptor
	 * @generated
	 */
	EClass getAdaptor();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.Distributor <em>Distributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distributor</em>'.
	 * @see co.edu.uniandes.accordant_fv.Distributor
	 * @generated
	 */
	EClass getDistributor();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.Ingestor <em>Ingestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingestor</em>'.
	 * @see co.edu.uniandes.accordant_fv.Ingestor
	 * @generated
	 */
	EClass getIngestor();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Ingestor#getConn <em>Conn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conn</em>'.
	 * @see co.edu.uniandes.accordant_fv.Ingestor#getConn()
	 * @see #getIngestor()
	 * @generated
	 */
	EAttribute getIngestor_Conn();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Ingestor#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see co.edu.uniandes.accordant_fv.Ingestor#getFormat()
	 * @see #getIngestor()
	 * @generated
	 */
	EAttribute getIngestor_Format();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Ingestor#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Props</em>'.
	 * @see co.edu.uniandes.accordant_fv.Ingestor#getProps()
	 * @see #getIngestor()
	 * @generated
	 */
	EAttribute getIngestor_Props();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Ingestor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see co.edu.uniandes.accordant_fv.Ingestor#getType()
	 * @see #getIngestor()
	 * @generated
	 */
	EAttribute getIngestor_Type();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.AnalyticsComponent <em>Analytics Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analytics Component</em>'.
	 * @see co.edu.uniandes.accordant_fv.AnalyticsComponent
	 * @generated
	 */
	EClass getAnalyticsComponent();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.AnalyticsComponent#getPmml <em>Pmml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pmml</em>'.
	 * @see co.edu.uniandes.accordant_fv.AnalyticsComponent#getPmml()
	 * @see #getAnalyticsComponent()
	 * @generated
	 */
	EAttribute getAnalyticsComponent_Pmml();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see co.edu.uniandes.accordant_fv.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.Sink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink</em>'.
	 * @see co.edu.uniandes.accordant_fv.Sink
	 * @generated
	 */
	EClass getSink();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Sink#getConn <em>Conn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conn</em>'.
	 * @see co.edu.uniandes.accordant_fv.Sink#getConn()
	 * @see #getSink()
	 * @generated
	 */
	EAttribute getSink_Conn();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Sink#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see co.edu.uniandes.accordant_fv.Sink#getFormat()
	 * @see #getSink()
	 * @generated
	 */
	EAttribute getSink_Format();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Sink#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see co.edu.uniandes.accordant_fv.Sink#getType()
	 * @see #getSink()
	 * @generated
	 */
	EAttribute getSink_Type();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Sink#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Props</em>'.
	 * @see co.edu.uniandes.accordant_fv.Sink#getProps()
	 * @see #getSink()
	 * @generated
	 */
	EAttribute getSink_Props();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see co.edu.uniandes.accordant_fv.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see co.edu.uniandes.accordant_fv.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_fv.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_fv.Port#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see co.edu.uniandes.accordant_fv.Port#getFields()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Fields();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_fv.Port#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see co.edu.uniandes.accordant_fv.Port#getRole()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Role();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.accordant_fv.Port#getComp <em>Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Comp</em>'.
	 * @see co.edu.uniandes.accordant_fv.Port#getComp()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Comp();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.Arbitrator <em>Arbitrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbitrator</em>'.
	 * @see co.edu.uniandes.accordant_fv.Arbitrator
	 * @generated
	 */
	EClass getArbitrator();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see co.edu.uniandes.accordant_fv.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Role#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see co.edu.uniandes.accordant_fv.Role#getType()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Type();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_fv.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_fv.Role#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see co.edu.uniandes.accordant_fv.Role#getPort()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Port();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.accordant_fv.Role#getConn <em>Conn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Conn</em>'.
	 * @see co.edu.uniandes.accordant_fv.Role#getConn()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Conn();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.ProcedureCall <em>Procedure Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Call</em>'.
	 * @see co.edu.uniandes.accordant_fv.ProcedureCall
	 * @generated
	 */
	EClass getProcedureCall();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_fv.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see co.edu.uniandes.accordant_fv.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_fv.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Field#getDtype <em>Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtype</em>'.
	 * @see co.edu.uniandes.accordant_fv.Field#getDtype()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Dtype();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_fv.Field#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see co.edu.uniandes.accordant_fv.Field#getOrder()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Order();

	/**
	 * Returns the meta object for the container reference '{@link co.edu.uniandes.accordant_fv.Field#getPortowner <em>Portowner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Portowner</em>'.
	 * @see co.edu.uniandes.accordant_fv.Field#getPortowner()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Portowner();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_fv.ProcessingModel <em>Processing Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processing Model</em>'.
	 * @see co.edu.uniandes.accordant_fv.ProcessingModel
	 * @generated
	 */
	EEnum getProcessingModel();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_fv.DeliveryGuarantee <em>Delivery Guarantee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Delivery Guarantee</em>'.
	 * @see co.edu.uniandes.accordant_fv.DeliveryGuarantee
	 * @generated
	 */
	EEnum getDeliveryGuarantee();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_fv.SyncType <em>Sync Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sync Type</em>'.
	 * @see co.edu.uniandes.accordant_fv.SyncType
	 * @generated
	 */
	EEnum getSyncType();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_fv.NotificationModel <em>Notification Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Notification Model</em>'.
	 * @see co.edu.uniandes.accordant_fv.NotificationModel
	 * @generated
	 */
	EEnum getNotificationModel();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_fv.Buffering <em>Buffering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Buffering</em>'.
	 * @see co.edu.uniandes.accordant_fv.Buffering
	 * @generated
	 */
	EEnum getBuffering();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_fv.Throughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Throughput</em>'.
	 * @see co.edu.uniandes.accordant_fv.Throughput
	 * @generated
	 */
	EEnum getThroughput();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_fv.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Type</em>'.
	 * @see co.edu.uniandes.accordant_fv.PortType
	 * @generated
	 */
	EEnum getPortType();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_fv.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Type</em>'.
	 * @see co.edu.uniandes.accordant_fv.RoleType
	 * @generated
	 */
	EEnum getRoleType();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_fv.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see co.edu.uniandes.accordant_fv.AccessType
	 * @generated
	 */
	EEnum getAccessType();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_fv.DType <em>DType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DType</em>'.
	 * @see co.edu.uniandes.accordant_fv.DType
	 * @generated
	 */
	EEnum getDType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Accordant_fvFactory getAccordant_fvFactory();

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
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.FunctionalViewImpl <em>Functional View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.FunctionalViewImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getFunctionalView()
		 * @generated
		 */
		EClass FUNCTIONAL_VIEW = eINSTANCE.getFunctionalView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_VIEW__NAME = eINSTANCE.getFunctionalView_Name();

		/**
		 * The meta object literal for the '<em><b>Conns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_VIEW__CONNS = eINSTANCE.getFunctionalView_Conns();

		/**
		 * The meta object literal for the '<em><b>Comps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_VIEW__COMPS = eINSTANCE.getFunctionalView_Comps();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_VIEW__PROJECT = eINSTANCE.getFunctionalView_Project();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.ConnectorImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Delivery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__DELIVERY = eINSTANCE.getConnector_Delivery();

		/**
		 * The meta object literal for the '<em><b>Synct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SYNCT = eINSTANCE.getConnector_Synct();

		/**
		 * The meta object literal for the '<em><b>Notification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NOTIFICATION = eINSTANCE.getConnector_Notification();

		/**
		 * The meta object literal for the '<em><b>Buffering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__BUFFERING = eINSTANCE.getConnector_Buffering();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__THROUGHPUT = eINSTANCE.getConnector_Throughput();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__ROLES = eINSTANCE.getConnector_Roles();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PROTOCOL = eINSTANCE.getConnector_Protocol();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__DECISION = eINSTANCE.getConnector_Decision();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__PROPS = eINSTANCE.getConnector_Props();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.ComponentImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PORTS = eINSTANCE.getComponent_Ports();

		/**
		 * The meta object literal for the '<em><b>Proc Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__PROC_MODEL = eINSTANCE.getComponent_ProcModel();

		/**
		 * The meta object literal for the '<em><b>Func View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__FUNC_VIEW = eINSTANCE.getComponent_FuncView();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DECISION = eINSTANCE.getComponent_Decision();

		/**
		 * The meta object literal for the '<em><b>Delivery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__DELIVERY = eINSTANCE.getComponent_Delivery();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.TransformerImpl <em>Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.TransformerImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getTransformer()
		 * @generated
		 */
		EClass TRANSFORMER = eINSTANCE.getTransformer();

		/**
		 * The meta object literal for the '<em><b>Sql Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER__SQL_EXP = eINSTANCE.getTransformer_SqlExp();

		/**
		 * The meta object literal for the '<em><b>Lambda Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER__LAMBDA_EXP = eINSTANCE.getTransformer_LambdaExp();

		/**
		 * The meta object literal for the '<em><b>Code Repo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER__CODE_REPO = eINSTANCE.getTransformer_CodeRepo();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.EstimatorImpl <em>Estimator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.EstimatorImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getEstimator()
		 * @generated
		 */
		EClass ESTIMATOR = eINSTANCE.getEstimator();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.StreamImpl <em>Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.StreamImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getStream()
		 * @generated
		 */
		EClass STREAM = eINSTANCE.getStream();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.AdaptorImpl <em>Adaptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.AdaptorImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getAdaptor()
		 * @generated
		 */
		EClass ADAPTOR = eINSTANCE.getAdaptor();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.DistributorImpl <em>Distributor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.DistributorImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getDistributor()
		 * @generated
		 */
		EClass DISTRIBUTOR = eINSTANCE.getDistributor();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.IngestorImpl <em>Ingestor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.IngestorImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getIngestor()
		 * @generated
		 */
		EClass INGESTOR = eINSTANCE.getIngestor();

		/**
		 * The meta object literal for the '<em><b>Conn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGESTOR__CONN = eINSTANCE.getIngestor_Conn();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGESTOR__FORMAT = eINSTANCE.getIngestor_Format();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGESTOR__PROPS = eINSTANCE.getIngestor_Props();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGESTOR__TYPE = eINSTANCE.getIngestor_Type();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.AnalyticsComponentImpl <em>Analytics Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.AnalyticsComponentImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getAnalyticsComponent()
		 * @generated
		 */
		EClass ANALYTICS_COMPONENT = eINSTANCE.getAnalyticsComponent();

		/**
		 * The meta object literal for the '<em><b>Pmml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYTICS_COMPONENT__PMML = eINSTANCE.getAnalyticsComponent_Pmml();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.EventImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.SinkImpl <em>Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.SinkImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getSink()
		 * @generated
		 */
		EClass SINK = eINSTANCE.getSink();

		/**
		 * The meta object literal for the '<em><b>Conn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINK__CONN = eINSTANCE.getSink_Conn();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINK__FORMAT = eINSTANCE.getSink_Format();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINK__TYPE = eINSTANCE.getSink_Type();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINK__PROPS = eINSTANCE.getSink_Props();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.PortImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__FIELDS = eINSTANCE.getPort_Fields();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__ROLE = eINSTANCE.getPort_Role();

		/**
		 * The meta object literal for the '<em><b>Comp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__COMP = eINSTANCE.getPort_Comp();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.ArbitratorImpl <em>Arbitrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.ArbitratorImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getArbitrator()
		 * @generated
		 */
		EClass ARBITRATOR = eINSTANCE.getArbitrator();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.RoleImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__TYPE = eINSTANCE.getRole_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PORT = eINSTANCE.getRole_Port();

		/**
		 * The meta object literal for the '<em><b>Conn</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__CONN = eINSTANCE.getRole_Conn();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.ProcedureCallImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getProcedureCall()
		 * @generated
		 */
		EClass PROCEDURE_CALL = eINSTANCE.getProcedureCall();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.impl.FieldImpl
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Dtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__DTYPE = eINSTANCE.getField_Dtype();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__ORDER = eINSTANCE.getField_Order();

		/**
		 * The meta object literal for the '<em><b>Portowner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__PORTOWNER = eINSTANCE.getField_Portowner();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.ProcessingModel <em>Processing Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.ProcessingModel
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getProcessingModel()
		 * @generated
		 */
		EEnum PROCESSING_MODEL = eINSTANCE.getProcessingModel();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.DeliveryGuarantee <em>Delivery Guarantee</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.DeliveryGuarantee
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getDeliveryGuarantee()
		 * @generated
		 */
		EEnum DELIVERY_GUARANTEE = eINSTANCE.getDeliveryGuarantee();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.SyncType <em>Sync Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.SyncType
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getSyncType()
		 * @generated
		 */
		EEnum SYNC_TYPE = eINSTANCE.getSyncType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.NotificationModel <em>Notification Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.NotificationModel
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getNotificationModel()
		 * @generated
		 */
		EEnum NOTIFICATION_MODEL = eINSTANCE.getNotificationModel();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.Buffering <em>Buffering</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.Buffering
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getBuffering()
		 * @generated
		 */
		EEnum BUFFERING = eINSTANCE.getBuffering();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.Throughput <em>Throughput</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.Throughput
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getThroughput()
		 * @generated
		 */
		EEnum THROUGHPUT = eINSTANCE.getThroughput();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.PortType <em>Port Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.PortType
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getPortType()
		 * @generated
		 */
		EEnum PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.RoleType <em>Role Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.RoleType
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getRoleType()
		 * @generated
		 */
		EEnum ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.AccessType <em>Access Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.AccessType
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getAccessType()
		 * @generated
		 */
		EEnum ACCESS_TYPE = eINSTANCE.getAccessType();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_fv.DType <em>DType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_fv.DType
		 * @see co.edu.uniandes.accordant_fv.impl.Accordant_fvPackageImpl#getDType()
		 * @generated
		 */
		EEnum DTYPE = eINSTANCE.getDType();

	}

} //Accordant_fvPackage
