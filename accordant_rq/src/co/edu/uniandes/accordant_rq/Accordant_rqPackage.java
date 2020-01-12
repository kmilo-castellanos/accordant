/**
 */
package co.edu.uniandes.accordant_rq;

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
 * @see co.edu.uniandes.accordant_rq.Accordant_rqFactory
 * @model kind="package"
 * @generated
 */
public interface Accordant_rqPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "accordant_rq";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uniandes.accordant.requirement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "accordant_rq";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Accordant_rqPackage eINSTANCE = co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl.init();

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_rq.impl.InputPackageImpl <em>Input Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_rq.impl.InputPackageImpl
	 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getInputPackage()
	 * @generated
	 */
	int INPUT_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PACKAGE__SCENARIOS = 1;

	/**
	 * The feature id for the '<em><b>Tactics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PACKAGE__TACTICS = 2;

	/**
	 * The feature id for the '<em><b>Analyzed Qs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PACKAGE__ANALYZED_QS = 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PACKAGE__CONSTRAINTS = 4;

	/**
	 * The number of structural features of the '<em>Input Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PACKAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Input Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_rq.impl.QScenarioImpl <em>QScenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_rq.impl.QScenarioImpl
	 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getQScenario()
	 * @generated
	 */
	int QSCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__MEASURE = 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__MIN_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__MAX_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__UNIT = 3;

	/**
	 * The feature id for the '<em><b>QAttribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__QATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__STIMULUS = 5;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__ENVIRONMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__NAME = 7;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO__RESPONSE = 8;

	/**
	 * The number of structural features of the '<em>QScenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>QScenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_rq.impl.SensitivityPointImpl <em>Sensitivity Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_rq.impl.SensitivityPointImpl
	 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getSensitivityPoint()
	 * @generated
	 */
	int SENSITIVITY_POINT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_POINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_POINT__RATIONALE = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_POINT__CODE = 2;

	/**
	 * The feature id for the '<em><b>Applied Tactics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_POINT__APPLIED_TACTICS = 3;

	/**
	 * The feature id for the '<em><b>Is Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_POINT__IS_RISK = 4;

	/**
	 * The number of structural features of the '<em>Sensitivity Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_POINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sensitivity Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_rq.impl.TacticImpl <em>Tactic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_rq.impl.TacticImpl
	 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getTactic()
	 * @generated
	 */
	int TACTIC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>QAttribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__QATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__RATIONALE = 2;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__STIMULUS = 3;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__VIEWPOINT = 5;

	/**
	 * The number of structural features of the '<em>Tactic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Tactic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_rq.impl.AnalyzedQSImpl <em>Analyzed QS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_rq.impl.AnalyzedQSImpl
	 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getAnalyzedQS()
	 * @generated
	 */
	int ANALYZED_QS = 4;

	/**
	 * The feature id for the '<em><b>SPoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_QS__SPOINTS = 0;

	/**
	 * The feature id for the '<em><b>Qs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_QS__QS = 1;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_QS__REASONING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_QS__NAME = 3;

	/**
	 * The number of structural features of the '<em>Analyzed QS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_QS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Analyzed QS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_QS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_rq.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_rq.impl.ConstraintImpl
	 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CODE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_rq.QAMetric <em>QA Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_rq.QAMetric
	 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getQAMetric()
	 * @generated
	 */
	int QA_METRIC = 6;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_rq.MetricUnit <em>Metric Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_rq.MetricUnit
	 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getMetricUnit()
	 * @generated
	 */
	int METRIC_UNIT = 7;

	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_rq.QAttribute <em>QAttribute</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_rq.QAttribute
	 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getQAttribute()
	 * @generated
	 */
	int QATTRIBUTE = 8;


	/**
	 * The meta object id for the '{@link co.edu.uniandes.accordant_rq.ConstraintType <em>Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see co.edu.uniandes.accordant_rq.ConstraintType
	 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getConstraintType()
	 * @generated
	 */
	int CONSTRAINT_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_rq.InputPackage <em>Input Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Package</em>'.
	 * @see co.edu.uniandes.accordant_rq.InputPackage
	 * @generated
	 */
	EClass getInputPackage();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.InputPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_rq.InputPackage#getName()
	 * @see #getInputPackage()
	 * @generated
	 */
	EAttribute getInputPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_rq.InputPackage#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see co.edu.uniandes.accordant_rq.InputPackage#getScenarios()
	 * @see #getInputPackage()
	 * @generated
	 */
	EReference getInputPackage_Scenarios();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_rq.InputPackage#getTactics <em>Tactics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tactics</em>'.
	 * @see co.edu.uniandes.accordant_rq.InputPackage#getTactics()
	 * @see #getInputPackage()
	 * @generated
	 */
	EReference getInputPackage_Tactics();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_rq.InputPackage#getAnalyzedQs <em>Analyzed Qs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analyzed Qs</em>'.
	 * @see co.edu.uniandes.accordant_rq.InputPackage#getAnalyzedQs()
	 * @see #getInputPackage()
	 * @generated
	 */
	EReference getInputPackage_AnalyzedQs();

	/**
	 * Returns the meta object for the containment reference list '{@link co.edu.uniandes.accordant_rq.InputPackage#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see co.edu.uniandes.accordant_rq.InputPackage#getConstraints()
	 * @see #getInputPackage()
	 * @generated
	 */
	EReference getInputPackage_Constraints();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_rq.QScenario <em>QScenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QScenario</em>'.
	 * @see co.edu.uniandes.accordant_rq.QScenario
	 * @generated
	 */
	EClass getQScenario();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.QScenario#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure</em>'.
	 * @see co.edu.uniandes.accordant_rq.QScenario#getMeasure()
	 * @see #getQScenario()
	 * @generated
	 */
	EAttribute getQScenario_Measure();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.QScenario#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see co.edu.uniandes.accordant_rq.QScenario#getMinValue()
	 * @see #getQScenario()
	 * @generated
	 */
	EAttribute getQScenario_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.QScenario#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see co.edu.uniandes.accordant_rq.QScenario#getMaxValue()
	 * @see #getQScenario()
	 * @generated
	 */
	EAttribute getQScenario_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.QScenario#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see co.edu.uniandes.accordant_rq.QScenario#getUnit()
	 * @see #getQScenario()
	 * @generated
	 */
	EAttribute getQScenario_Unit();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.QScenario#getQAttribute <em>QAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QAttribute</em>'.
	 * @see co.edu.uniandes.accordant_rq.QScenario#getQAttribute()
	 * @see #getQScenario()
	 * @generated
	 */
	EAttribute getQScenario_QAttribute();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.QScenario#getStimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus</em>'.
	 * @see co.edu.uniandes.accordant_rq.QScenario#getStimulus()
	 * @see #getQScenario()
	 * @generated
	 */
	EAttribute getQScenario_Stimulus();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.QScenario#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see co.edu.uniandes.accordant_rq.QScenario#getEnvironment()
	 * @see #getQScenario()
	 * @generated
	 */
	EAttribute getQScenario_Environment();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.QScenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_rq.QScenario#getName()
	 * @see #getQScenario()
	 * @generated
	 */
	EAttribute getQScenario_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.QScenario#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see co.edu.uniandes.accordant_rq.QScenario#getResponse()
	 * @see #getQScenario()
	 * @generated
	 */
	EAttribute getQScenario_Response();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_rq.SensitivityPoint <em>Sensitivity Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensitivity Point</em>'.
	 * @see co.edu.uniandes.accordant_rq.SensitivityPoint
	 * @generated
	 */
	EClass getSensitivityPoint();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.SensitivityPoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_rq.SensitivityPoint#getName()
	 * @see #getSensitivityPoint()
	 * @generated
	 */
	EAttribute getSensitivityPoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.SensitivityPoint#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see co.edu.uniandes.accordant_rq.SensitivityPoint#getRationale()
	 * @see #getSensitivityPoint()
	 * @generated
	 */
	EAttribute getSensitivityPoint_Rationale();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.SensitivityPoint#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see co.edu.uniandes.accordant_rq.SensitivityPoint#getCode()
	 * @see #getSensitivityPoint()
	 * @generated
	 */
	EAttribute getSensitivityPoint_Code();

	/**
	 * Returns the meta object for the reference list '{@link co.edu.uniandes.accordant_rq.SensitivityPoint#getAppliedTactics <em>Applied Tactics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied Tactics</em>'.
	 * @see co.edu.uniandes.accordant_rq.SensitivityPoint#getAppliedTactics()
	 * @see #getSensitivityPoint()
	 * @generated
	 */
	EReference getSensitivityPoint_AppliedTactics();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.SensitivityPoint#isIsRisk <em>Is Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Risk</em>'.
	 * @see co.edu.uniandes.accordant_rq.SensitivityPoint#isIsRisk()
	 * @see #getSensitivityPoint()
	 * @generated
	 */
	EAttribute getSensitivityPoint_IsRisk();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_rq.Tactic <em>Tactic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tactic</em>'.
	 * @see co.edu.uniandes.accordant_rq.Tactic
	 * @generated
	 */
	EClass getTactic();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.Tactic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_rq.Tactic#getName()
	 * @see #getTactic()
	 * @generated
	 */
	EAttribute getTactic_Name();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.Tactic#getQAttribute <em>QAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QAttribute</em>'.
	 * @see co.edu.uniandes.accordant_rq.Tactic#getQAttribute()
	 * @see #getTactic()
	 * @generated
	 */
	EAttribute getTactic_QAttribute();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.Tactic#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see co.edu.uniandes.accordant_rq.Tactic#getRationale()
	 * @see #getTactic()
	 * @generated
	 */
	EAttribute getTactic_Rationale();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.Tactic#getStimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimulus</em>'.
	 * @see co.edu.uniandes.accordant_rq.Tactic#getStimulus()
	 * @see #getTactic()
	 * @generated
	 */
	EAttribute getTactic_Stimulus();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.Tactic#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see co.edu.uniandes.accordant_rq.Tactic#getResponse()
	 * @see #getTactic()
	 * @generated
	 */
	EAttribute getTactic_Response();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.Tactic#getViewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Viewpoint</em>'.
	 * @see co.edu.uniandes.accordant_rq.Tactic#getViewpoint()
	 * @see #getTactic()
	 * @generated
	 */
	EAttribute getTactic_Viewpoint();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_rq.AnalyzedQS <em>Analyzed QS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analyzed QS</em>'.
	 * @see co.edu.uniandes.accordant_rq.AnalyzedQS
	 * @generated
	 */
	EClass getAnalyzedQS();

	/**
	 * Returns the meta object for the containment reference '{@link co.edu.uniandes.accordant_rq.AnalyzedQS#getSPoints <em>SPoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPoints</em>'.
	 * @see co.edu.uniandes.accordant_rq.AnalyzedQS#getSPoints()
	 * @see #getAnalyzedQS()
	 * @generated
	 */
	EReference getAnalyzedQS_SPoints();

	/**
	 * Returns the meta object for the reference '{@link co.edu.uniandes.accordant_rq.AnalyzedQS#getQs <em>Qs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qs</em>'.
	 * @see co.edu.uniandes.accordant_rq.AnalyzedQS#getQs()
	 * @see #getAnalyzedQS()
	 * @generated
	 */
	EReference getAnalyzedQS_Qs();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.AnalyzedQS#getReasoning <em>Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reasoning</em>'.
	 * @see co.edu.uniandes.accordant_rq.AnalyzedQS#getReasoning()
	 * @see #getAnalyzedQS()
	 * @generated
	 */
	EAttribute getAnalyzedQS_Reasoning();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.AnalyzedQS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see co.edu.uniandes.accordant_rq.AnalyzedQS#getName()
	 * @see #getAnalyzedQS()
	 * @generated
	 */
	EAttribute getAnalyzedQS_Name();

	/**
	 * Returns the meta object for class '{@link co.edu.uniandes.accordant_rq.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see co.edu.uniandes.accordant_rq.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.Constraint#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see co.edu.uniandes.accordant_rq.Constraint#getCode()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Code();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.Constraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see co.edu.uniandes.accordant_rq.Constraint#getType()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Type();

	/**
	 * Returns the meta object for the attribute '{@link co.edu.uniandes.accordant_rq.Constraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see co.edu.uniandes.accordant_rq.Constraint#getValue()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Value();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_rq.QAMetric <em>QA Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>QA Metric</em>'.
	 * @see co.edu.uniandes.accordant_rq.QAMetric
	 * @generated
	 */
	EEnum getQAMetric();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_rq.MetricUnit <em>Metric Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metric Unit</em>'.
	 * @see co.edu.uniandes.accordant_rq.MetricUnit
	 * @generated
	 */
	EEnum getMetricUnit();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_rq.QAttribute <em>QAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>QAttribute</em>'.
	 * @see co.edu.uniandes.accordant_rq.QAttribute
	 * @generated
	 */
	EEnum getQAttribute();

	/**
	 * Returns the meta object for enum '{@link co.edu.uniandes.accordant_rq.ConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Type</em>'.
	 * @see co.edu.uniandes.accordant_rq.ConstraintType
	 * @generated
	 */
	EEnum getConstraintType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Accordant_rqFactory getAccordant_rqFactory();

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
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_rq.impl.InputPackageImpl <em>Input Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_rq.impl.InputPackageImpl
		 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getInputPackage()
		 * @generated
		 */
		EClass INPUT_PACKAGE = eINSTANCE.getInputPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PACKAGE__NAME = eINSTANCE.getInputPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PACKAGE__SCENARIOS = eINSTANCE.getInputPackage_Scenarios();

		/**
		 * The meta object literal for the '<em><b>Tactics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PACKAGE__TACTICS = eINSTANCE.getInputPackage_Tactics();

		/**
		 * The meta object literal for the '<em><b>Analyzed Qs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PACKAGE__ANALYZED_QS = eINSTANCE.getInputPackage_AnalyzedQs();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PACKAGE__CONSTRAINTS = eINSTANCE.getInputPackage_Constraints();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_rq.impl.QScenarioImpl <em>QScenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_rq.impl.QScenarioImpl
		 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getQScenario()
		 * @generated
		 */
		EClass QSCENARIO = eINSTANCE.getQScenario();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSCENARIO__MEASURE = eINSTANCE.getQScenario_Measure();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSCENARIO__MIN_VALUE = eINSTANCE.getQScenario_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSCENARIO__MAX_VALUE = eINSTANCE.getQScenario_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSCENARIO__UNIT = eINSTANCE.getQScenario_Unit();

		/**
		 * The meta object literal for the '<em><b>QAttribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSCENARIO__QATTRIBUTE = eINSTANCE.getQScenario_QAttribute();

		/**
		 * The meta object literal for the '<em><b>Stimulus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSCENARIO__STIMULUS = eINSTANCE.getQScenario_Stimulus();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSCENARIO__ENVIRONMENT = eINSTANCE.getQScenario_Environment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSCENARIO__NAME = eINSTANCE.getQScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSCENARIO__RESPONSE = eINSTANCE.getQScenario_Response();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_rq.impl.SensitivityPointImpl <em>Sensitivity Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_rq.impl.SensitivityPointImpl
		 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getSensitivityPoint()
		 * @generated
		 */
		EClass SENSITIVITY_POINT = eINSTANCE.getSensitivityPoint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSITIVITY_POINT__NAME = eINSTANCE.getSensitivityPoint_Name();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSITIVITY_POINT__RATIONALE = eINSTANCE.getSensitivityPoint_Rationale();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSITIVITY_POINT__CODE = eINSTANCE.getSensitivityPoint_Code();

		/**
		 * The meta object literal for the '<em><b>Applied Tactics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSITIVITY_POINT__APPLIED_TACTICS = eINSTANCE.getSensitivityPoint_AppliedTactics();

		/**
		 * The meta object literal for the '<em><b>Is Risk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSITIVITY_POINT__IS_RISK = eINSTANCE.getSensitivityPoint_IsRisk();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_rq.impl.TacticImpl <em>Tactic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_rq.impl.TacticImpl
		 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getTactic()
		 * @generated
		 */
		EClass TACTIC = eINSTANCE.getTactic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TACTIC__NAME = eINSTANCE.getTactic_Name();

		/**
		 * The meta object literal for the '<em><b>QAttribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TACTIC__QATTRIBUTE = eINSTANCE.getTactic_QAttribute();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TACTIC__RATIONALE = eINSTANCE.getTactic_Rationale();

		/**
		 * The meta object literal for the '<em><b>Stimulus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TACTIC__STIMULUS = eINSTANCE.getTactic_Stimulus();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TACTIC__RESPONSE = eINSTANCE.getTactic_Response();

		/**
		 * The meta object literal for the '<em><b>Viewpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TACTIC__VIEWPOINT = eINSTANCE.getTactic_Viewpoint();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_rq.impl.AnalyzedQSImpl <em>Analyzed QS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_rq.impl.AnalyzedQSImpl
		 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getAnalyzedQS()
		 * @generated
		 */
		EClass ANALYZED_QS = eINSTANCE.getAnalyzedQS();

		/**
		 * The meta object literal for the '<em><b>SPoints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZED_QS__SPOINTS = eINSTANCE.getAnalyzedQS_SPoints();

		/**
		 * The meta object literal for the '<em><b>Qs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZED_QS__QS = eINSTANCE.getAnalyzedQS_Qs();

		/**
		 * The meta object literal for the '<em><b>Reasoning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYZED_QS__REASONING = eINSTANCE.getAnalyzedQS_Reasoning();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYZED_QS__NAME = eINSTANCE.getAnalyzedQS_Name();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_rq.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_rq.impl.ConstraintImpl
		 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__CODE = eINSTANCE.getConstraint_Code();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__TYPE = eINSTANCE.getConstraint_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__VALUE = eINSTANCE.getConstraint_Value();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_rq.QAMetric <em>QA Metric</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_rq.QAMetric
		 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getQAMetric()
		 * @generated
		 */
		EEnum QA_METRIC = eINSTANCE.getQAMetric();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_rq.MetricUnit <em>Metric Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_rq.MetricUnit
		 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getMetricUnit()
		 * @generated
		 */
		EEnum METRIC_UNIT = eINSTANCE.getMetricUnit();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_rq.QAttribute <em>QAttribute</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_rq.QAttribute
		 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getQAttribute()
		 * @generated
		 */
		EEnum QATTRIBUTE = eINSTANCE.getQAttribute();

		/**
		 * The meta object literal for the '{@link co.edu.uniandes.accordant_rq.ConstraintType <em>Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see co.edu.uniandes.accordant_rq.ConstraintType
		 * @see co.edu.uniandes.accordant_rq.impl.Accordant_rqPackageImpl#getConstraintType()
		 * @generated
		 */
		EEnum CONSTRAINT_TYPE = eINSTANCE.getConstraintType();

	}

} //Accordant_rqPackage
