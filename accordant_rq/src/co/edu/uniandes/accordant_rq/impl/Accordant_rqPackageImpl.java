/**
 */
package co.edu.uniandes.accordant_rq.impl;

import co.edu.uniandes.accordant_rq.Accordant_rqFactory;
import co.edu.uniandes.accordant_rq.Accordant_rqPackage;
import co.edu.uniandes.accordant_rq.AnalyzedQS;
import co.edu.uniandes.accordant_rq.ArchDecision;
import co.edu.uniandes.accordant_rq.Constraint;
import co.edu.uniandes.accordant_rq.ConstraintType;
import co.edu.uniandes.accordant_rq.MetricUnit;
import co.edu.uniandes.accordant_rq.Project;
import co.edu.uniandes.accordant_rq.QAMetric;
import co.edu.uniandes.accordant_rq.QAttribute;
import co.edu.uniandes.accordant_rq.QScenario;
import co.edu.uniandes.accordant_rq.Tactic;

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
	private EClass projectEClass = null;

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
	private EClass archDecisionEClass = null;

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
	private EClass constraintEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintTypeEEnum = null;

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
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#eNS_URI
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
		if (isInited) return (Accordant_rqPackage)EPackage.Registry.INSTANCE.getEPackage(Accordant_rqPackage.eNS_URI);

		// Obtain or create and register package
		Accordant_rqPackageImpl theAccordant_rqPackage = (Accordant_rqPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Accordant_rqPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Accordant_rqPackageImpl());

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
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Name() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Scenarios() {
		return (EReference)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Tactics() {
		return (EReference)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_AnalyzedQs() {
		return (EReference)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Constraints() {
		return (EReference)projectEClass.getEStructuralFeatures().get(4);
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
		return (EAttribute)qScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQScenario_MinValue() {
		return (EAttribute)qScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQScenario_MaxValue() {
		return (EAttribute)qScenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQScenario_Unit() {
		return (EAttribute)qScenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQScenario_QAttribute() {
		return (EAttribute)qScenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQScenario_Stimulus() {
		return (EAttribute)qScenarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQScenario_Environment() {
		return (EAttribute)qScenarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQScenario_Name() {
		return (EAttribute)qScenarioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQScenario_Response() {
		return (EAttribute)qScenarioEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchDecision() {
		return archDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchDecision_Name() {
		return (EAttribute)archDecisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchDecision_Rationale() {
		return (EAttribute)archDecisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchDecision_Code() {
		return (EAttribute)archDecisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchDecision_AppliedTactics() {
		return (EReference)archDecisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchDecision_IsRisk() {
		return (EAttribute)archDecisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchDecision_IsSensitivityPoint() {
		return (EAttribute)archDecisionEClass.getEStructuralFeatures().get(5);
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
		return (EAttribute)tacticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTactic_QAttribute() {
		return (EAttribute)tacticEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTactic_Rationale() {
		return (EAttribute)tacticEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTactic_Stimulus() {
		return (EAttribute)tacticEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTactic_Response() {
		return (EAttribute)tacticEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTactic_Viewpoint() {
		return (EAttribute)tacticEClass.getEStructuralFeatures().get(5);
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
	public EReference getAnalyzedQS_Decisions() {
		return (EReference)analyzedQSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzedQS_Qs() {
		return (EReference)analyzedQSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalyzedQS_Reasoning() {
		return (EAttribute)analyzedQSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalyzedQS_Name() {
		return (EAttribute)analyzedQSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Code() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Type() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Value() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(2);
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
	public EEnum getConstraintType() {
		return constraintTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accordant_rqFactory getAccordant_rqFactory() {
		return (Accordant_rqFactory)getEFactoryInstance();
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
		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEReference(projectEClass, PROJECT__SCENARIOS);
		createEReference(projectEClass, PROJECT__TACTICS);
		createEReference(projectEClass, PROJECT__ANALYZED_QS);
		createEReference(projectEClass, PROJECT__CONSTRAINTS);

		qScenarioEClass = createEClass(QSCENARIO);
		createEAttribute(qScenarioEClass, QSCENARIO__MEASURE);
		createEAttribute(qScenarioEClass, QSCENARIO__MIN_VALUE);
		createEAttribute(qScenarioEClass, QSCENARIO__MAX_VALUE);
		createEAttribute(qScenarioEClass, QSCENARIO__UNIT);
		createEAttribute(qScenarioEClass, QSCENARIO__QATTRIBUTE);
		createEAttribute(qScenarioEClass, QSCENARIO__STIMULUS);
		createEAttribute(qScenarioEClass, QSCENARIO__ENVIRONMENT);
		createEAttribute(qScenarioEClass, QSCENARIO__NAME);
		createEAttribute(qScenarioEClass, QSCENARIO__RESPONSE);

		archDecisionEClass = createEClass(ARCH_DECISION);
		createEAttribute(archDecisionEClass, ARCH_DECISION__NAME);
		createEAttribute(archDecisionEClass, ARCH_DECISION__RATIONALE);
		createEAttribute(archDecisionEClass, ARCH_DECISION__CODE);
		createEReference(archDecisionEClass, ARCH_DECISION__APPLIED_TACTICS);
		createEAttribute(archDecisionEClass, ARCH_DECISION__IS_RISK);
		createEAttribute(archDecisionEClass, ARCH_DECISION__IS_SENSITIVITY_POINT);

		tacticEClass = createEClass(TACTIC);
		createEAttribute(tacticEClass, TACTIC__NAME);
		createEAttribute(tacticEClass, TACTIC__QATTRIBUTE);
		createEAttribute(tacticEClass, TACTIC__RATIONALE);
		createEAttribute(tacticEClass, TACTIC__STIMULUS);
		createEAttribute(tacticEClass, TACTIC__RESPONSE);
		createEAttribute(tacticEClass, TACTIC__VIEWPOINT);

		analyzedQSEClass = createEClass(ANALYZED_QS);
		createEReference(analyzedQSEClass, ANALYZED_QS__DECISIONS);
		createEReference(analyzedQSEClass, ANALYZED_QS__QS);
		createEAttribute(analyzedQSEClass, ANALYZED_QS__REASONING);
		createEAttribute(analyzedQSEClass, ANALYZED_QS__NAME);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__CODE);
		createEAttribute(constraintEClass, CONSTRAINT__TYPE);
		createEAttribute(constraintEClass, CONSTRAINT__VALUE);

		// Create enums
		qaMetricEEnum = createEEnum(QA_METRIC);
		metricUnitEEnum = createEEnum(METRIC_UNIT);
		qAttributeEEnum = createEEnum(QATTRIBUTE);
		constraintTypeEEnum = createEEnum(CONSTRAINT_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Scenarios(), this.getQScenario(), null, "scenarios", null, 1, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Tactics(), this.getTactic(), null, "tactics", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_AnalyzedQs(), this.getAnalyzedQS(), null, "analyzedQs", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qScenarioEClass, QScenario.class, "QScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQScenario_Measure(), this.getQAMetric(), "measure", null, 1, 1, QScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQScenario_MinValue(), ecorePackage.getEFloat(), "minValue", null, 1, 1, QScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQScenario_MaxValue(), ecorePackage.getEFloat(), "maxValue", null, 1, 1, QScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQScenario_Unit(), this.getMetricUnit(), "unit", null, 1, 1, QScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQScenario_QAttribute(), this.getQAttribute(), "qAttribute", null, 1, 1, QScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQScenario_Stimulus(), ecorePackage.getEString(), "stimulus", null, 1, 1, QScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQScenario_Environment(), ecorePackage.getEString(), "environment", null, 1, 1, QScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQScenario_Name(), ecorePackage.getEString(), "name", null, 1, 1, QScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQScenario_Response(), ecorePackage.getEString(), "response", null, 0, 1, QScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(archDecisionEClass, ArchDecision.class, "ArchDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchDecision_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArchDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchDecision_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1, ArchDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchDecision_Code(), ecorePackage.getEString(), "code", null, 0, 1, ArchDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchDecision_AppliedTactics(), this.getTactic(), null, "appliedTactics", null, 0, -1, ArchDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchDecision_IsRisk(), ecorePackage.getEBoolean(), "isRisk", null, 0, 1, ArchDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchDecision_IsSensitivityPoint(), ecorePackage.getEBoolean(), "isSensitivityPoint", null, 0, 1, ArchDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tacticEClass, Tactic.class, "Tactic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTactic_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tactic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTactic_QAttribute(), this.getQAttribute(), "qAttribute", null, 0, 1, Tactic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTactic_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1, Tactic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTactic_Stimulus(), ecorePackage.getEString(), "stimulus", null, 0, 1, Tactic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTactic_Response(), ecorePackage.getEString(), "response", null, 0, 1, Tactic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTactic_Viewpoint(), ecorePackage.getEString(), "viewpoint", null, 0, 1, Tactic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analyzedQSEClass, AnalyzedQS.class, "AnalyzedQS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalyzedQS_Decisions(), this.getArchDecision(), null, "decisions", null, 0, 1, AnalyzedQS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalyzedQS_Qs(), this.getQScenario(), null, "qs", null, 1, 1, AnalyzedQS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalyzedQS_Reasoning(), ecorePackage.getEString(), "reasoning", null, 0, 1, AnalyzedQS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalyzedQS_Name(), ecorePackage.getEString(), "name", null, 1, 1, AnalyzedQS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Code(), ecorePackage.getEString(), "code", "", 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_Type(), this.getConstraintType(), "type", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_Value(), ecorePackage.getEString(), "value", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(qaMetricEEnum, QAMetric.class, "QAMetric");
		addEEnumLiteral(qaMetricEEnum, QAMetric.THROUGHPUT);
		addEEnumLiteral(qaMetricEEnum, QAMetric.LATENCY);
		addEEnumLiteral(qaMetricEEnum, QAMetric.DEADLINE);
		addEEnumLiteral(qaMetricEEnum, QAMetric.UPDATETIME);

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

		initEEnum(constraintTypeEEnum, ConstraintType.class, "ConstraintType");
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.CLOUD_PROV);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.PROC_MODEL);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.LICENSE);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.TECH_VENDOR);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.ARCH_STYLE);

		// Create resource
		createResource(eNS_URI);
	}

} //Accordant_rqPackageImpl
