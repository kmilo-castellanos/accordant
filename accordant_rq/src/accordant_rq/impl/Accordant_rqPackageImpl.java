/**
 */
package accordant_rq.impl;

import accordant_rq.Accordant_rqFactory;
import accordant_rq.Accordant_rqPackage;
import accordant_rq.AnalyzedQS;
import accordant_rq.InputPackage;
import accordant_rq.MetricUnit;
import accordant_rq.QAMetric;
import accordant_rq.QAttribute;
import accordant_rq.QScenario;
import accordant_rq.SensitivityPoint;
import accordant_rq.Tactic;

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
public class Accordant_rqPackageImpl extends EPackageImpl implements Accordant_rqPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensitivityPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tacticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analyzedQSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qaMetricEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metricUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qAttributeEEnum = null;

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
	 * @see accordant_rq.Accordant_rqPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Accordant_rqPackageImpl() {
		super(eNS_URI, Accordant_rqFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Accordant_rqPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Accordant_rqPackage init() {
		if (isInited)
			return (Accordant_rqPackage) EPackage.Registry.INSTANCE.getEPackage(Accordant_rqPackage.eNS_URI);

		// Obtain or create and register package
		Accordant_rqPackageImpl theAccordant_rqPackage = (Accordant_rqPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Accordant_rqPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Accordant_rqPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAccordant_rqPackage.createPackageContents();

		// Initialize created meta-data
		theAccordant_rqPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAccordant_rqPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Accordant_rqPackage.eNS_URI, theAccordant_rqPackage);
		return theAccordant_rqPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPackage() {
		return inputPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPackage_Name() {
		return (EAttribute) inputPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPackage_Scenarios() {
		return (EReference) inputPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQScenario() {
		return qScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQScenario_Measure() {
		return (EAttribute) qScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQScenario_MinValue() {
		return (EAttribute) qScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQScenario_MaxValue() {
		return (EAttribute) qScenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQScenario_Unit() {
		return (EAttribute) qScenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQScenario_QAttribute() {
		return (EAttribute) qScenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQScenario_Analyzed() {
		return (EReference) qScenarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQScenario_Stimulus() {
		return (EAttribute) qScenarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQScenario_Environment() {
		return (EAttribute) qScenarioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensitivityPoint() {
		return sensitivityPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensitivityPoint_Name() {
		return (EAttribute) sensitivityPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensitivityPoint_Rationale() {
		return (EAttribute) sensitivityPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensitivityPoint_Code() {
		return (EAttribute) sensitivityPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensitivityPoint_Tactic() {
		return (EReference) sensitivityPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensitivityPoint_IsRisk() {
		return (EAttribute) sensitivityPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTactic() {
		return tacticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTactic_Name() {
		return (EAttribute) tacticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTactic_QAttribute() {
		return (EAttribute) tacticEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTactic_Subtactics() {
		return (EReference) tacticEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTactic_Rationale() {
		return (EAttribute) tacticEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTactic_Stimulus() {
		return (EAttribute) tacticEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTactic_Response() {
		return (EAttribute) tacticEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTactic_Viewpoint() {
		return (EAttribute) tacticEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTactic_Spoint() {
		return (EReference) tacticEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalyzedQS() {
		return analyzedQSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzedQS_Points() {
		return (EReference) analyzedQSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzedQS_Qs() {
		return (EReference) analyzedQSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalyzedQS_Reasoning() {
		return (EAttribute) analyzedQSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQAMetric() {
		return qaMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetricUnit() {
		return metricUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQAttribute() {
		return qAttributeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accordant_rqFactory getAccordant_rqFactory() {
		return (Accordant_rqFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		inputPackageEClass = createEClass(INPUT_PACKAGE);
		createEAttribute(inputPackageEClass, INPUT_PACKAGE__NAME);
		createEReference(inputPackageEClass, INPUT_PACKAGE__SCENARIOS);

		qScenarioEClass = createEClass(QSCENARIO);
		createEAttribute(qScenarioEClass, QSCENARIO__MEASURE);
		createEAttribute(qScenarioEClass, QSCENARIO__MIN_VALUE);
		createEAttribute(qScenarioEClass, QSCENARIO__MAX_VALUE);
		createEAttribute(qScenarioEClass, QSCENARIO__UNIT);
		createEAttribute(qScenarioEClass, QSCENARIO__QATTRIBUTE);
		createEReference(qScenarioEClass, QSCENARIO__ANALYZED);
		createEAttribute(qScenarioEClass, QSCENARIO__STIMULUS);
		createEAttribute(qScenarioEClass, QSCENARIO__ENVIRONMENT);

		sensitivityPointEClass = createEClass(SENSITIVITY_POINT);
		createEAttribute(sensitivityPointEClass, SENSITIVITY_POINT__NAME);
		createEAttribute(sensitivityPointEClass, SENSITIVITY_POINT__RATIONALE);
		createEAttribute(sensitivityPointEClass, SENSITIVITY_POINT__CODE);
		createEReference(sensitivityPointEClass, SENSITIVITY_POINT__TACTIC);
		createEAttribute(sensitivityPointEClass, SENSITIVITY_POINT__IS_RISK);

		tacticEClass = createEClass(TACTIC);
		createEAttribute(tacticEClass, TACTIC__NAME);
		createEAttribute(tacticEClass, TACTIC__QATTRIBUTE);
		createEReference(tacticEClass, TACTIC__SUBTACTICS);
		createEAttribute(tacticEClass, TACTIC__RATIONALE);
		createEAttribute(tacticEClass, TACTIC__STIMULUS);
		createEAttribute(tacticEClass, TACTIC__RESPONSE);
		createEAttribute(tacticEClass, TACTIC__VIEWPOINT);
		createEReference(tacticEClass, TACTIC__SPOINT);

		analyzedQSEClass = createEClass(ANALYZED_QS);
		createEReference(analyzedQSEClass, ANALYZED_QS__POINTS);
		createEReference(analyzedQSEClass, ANALYZED_QS__QS);
		createEAttribute(analyzedQSEClass, ANALYZED_QS__REASONING);

		// Create enums
		qaMetricEEnum = createEEnum(QA_METRIC);
		metricUnitEEnum = createEEnum(METRIC_UNIT);
		qAttributeEEnum = createEEnum(QATTRIBUTE);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(inputPackageEClass, InputPackage.class, "InputPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputPackage_Name(), ecorePackage.getEString(), "name", null, 1, 1, InputPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputPackage_Scenarios(), this.getQScenario(), null, "scenarios", null, 0, 1, InputPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(qScenarioEClass, QScenario.class, "QScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQScenario_Measure(), this.getQAMetric(), "measure", null, 0, 1, QScenario.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQScenario_MinValue(), ecorePackage.getEFloat(), "minValue", null, 0, 1, QScenario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQScenario_MaxValue(), ecorePackage.getEFloat(), "maxValue", null, 0, 1, QScenario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQScenario_Unit(), this.getMetricUnit(), "unit", null, 0, 1, QScenario.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQScenario_QAttribute(), this.getQAttribute(), "qAttribute", null, 0, 1, QScenario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQScenario_Analyzed(), this.getAnalyzedQS(), this.getAnalyzedQS_Qs(), "analyzed", null, 0, 1,
				QScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQScenario_Stimulus(), ecorePackage.getEString(), "stimulus", null, 0, 1, QScenario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQScenario_Environment(), ecorePackage.getEString(), "environment", null, 0, 1, QScenario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensitivityPointEClass, SensitivityPoint.class, "SensitivityPoint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensitivityPoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, SensitivityPoint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensitivityPoint_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1,
				SensitivityPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensitivityPoint_Code(), ecorePackage.getEString(), "code", null, 0, 1, SensitivityPoint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensitivityPoint_Tactic(), this.getTactic(), this.getTactic_Spoint(), "tactic", null, 1, -1,
				SensitivityPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensitivityPoint_IsRisk(), ecorePackage.getEBoolean(), "isRisk", null, 0, 1,
				SensitivityPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(tacticEClass, Tactic.class, "Tactic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTactic_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tactic.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTactic_QAttribute(), this.getQAttribute(), "qAttribute", null, 0, 1, Tactic.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTactic_Subtactics(), this.getTactic(), null, "subtactics", null, 0, -1, Tactic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTactic_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1, Tactic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTactic_Stimulus(), ecorePackage.getEString(), "stimulus", null, 0, 1, Tactic.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTactic_Response(), ecorePackage.getEString(), "response", null, 0, 1, Tactic.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTactic_Viewpoint(), ecorePackage.getEString(), "viewpoint", null, 0, 1, Tactic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTactic_Spoint(), this.getSensitivityPoint(), this.getSensitivityPoint_Tactic(), "spoint", null, 0,
				-1, Tactic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analyzedQSEClass, AnalyzedQS.class, "AnalyzedQS", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalyzedQS_Points(), this.getSensitivityPoint(), null, "points", null, 0, 1, AnalyzedQS.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAnalyzedQS_Qs(), this.getQScenario(), this.getQScenario_Analyzed(), "qs", null, 1, 1,
				AnalyzedQS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalyzedQS_Reasoning(), ecorePackage.getEString(), "reasoning", null, 0, 1, AnalyzedQS.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(qaMetricEEnum, QAMetric.class, "QAMetric");
		addEEnumLiteral(qaMetricEEnum, QAMetric.THROUGHPUT);
		addEEnumLiteral(qaMetricEEnum, QAMetric.LATENCY);
		addEEnumLiteral(qaMetricEEnum, QAMetric.DEADLINE);

		initEEnum(metricUnitEEnum, MetricUnit.class, "MetricUnit");
		addEEnumLiteral(metricUnitEEnum, MetricUnit.MILLIS);
		addEEnumLiteral(metricUnitEEnum, MetricUnit.SECONDS);
		addEEnumLiteral(metricUnitEEnum, MetricUnit.MINUTES);
		addEEnumLiteral(metricUnitEEnum, MetricUnit.HOURS);
		addEEnumLiteral(metricUnitEEnum, MetricUnit.TASKS);
		addEEnumLiteral(metricUnitEEnum, MetricUnit.BYTES);
		addEEnumLiteral(metricUnitEEnum, MetricUnit.MSGS);

		initEEnum(qAttributeEEnum, QAttribute.class, "QAttribute");
		addEEnumLiteral(qAttributeEEnum, QAttribute.AVAILABILITY);
		addEEnumLiteral(qAttributeEEnum, QAttribute.PERFORMANCE);
		addEEnumLiteral(qAttributeEEnum, QAttribute.MODIFIABILITY);
		addEEnumLiteral(qAttributeEEnum, QAttribute.TESTABILITY);
		addEEnumLiteral(qAttributeEEnum, QAttribute.SCALABILITY);

		// Create resource
		createResource(eNS_URI);
	}

} //Accordant_rqPackageImpl
