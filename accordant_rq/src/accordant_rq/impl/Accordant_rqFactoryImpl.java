/**
 */
package accordant_rq.impl;

import accordant_rq.*;

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
public class Accordant_rqFactoryImpl extends EFactoryImpl implements Accordant_rqFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Accordant_rqFactory init() {
		try {
			Accordant_rqFactory theAccordant_rqFactory = (Accordant_rqFactory) EPackage.Registry.INSTANCE
					.getEFactory(Accordant_rqPackage.eNS_URI);
			if (theAccordant_rqFactory != null) {
				return theAccordant_rqFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Accordant_rqFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accordant_rqFactoryImpl() {
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
		case Accordant_rqPackage.INPUT_PACKAGE:
			return createInputPackage();
		case Accordant_rqPackage.QSCENARIO:
			return createQScenario();
		case Accordant_rqPackage.SENSITIVITY_POINT:
			return createSensitivityPoint();
		case Accordant_rqPackage.TACTIC:
			return createTactic();
		case Accordant_rqPackage.ANALYZED_QS:
			return createAnalyzedQS();
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
		case Accordant_rqPackage.QA_METRIC:
			return createQAMetricFromString(eDataType, initialValue);
		case Accordant_rqPackage.METRIC_UNIT:
			return createMetricUnitFromString(eDataType, initialValue);
		case Accordant_rqPackage.QATTRIBUTE:
			return createQAttributeFromString(eDataType, initialValue);
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
		case Accordant_rqPackage.QA_METRIC:
			return convertQAMetricToString(eDataType, instanceValue);
		case Accordant_rqPackage.METRIC_UNIT:
			return convertMetricUnitToString(eDataType, instanceValue);
		case Accordant_rqPackage.QATTRIBUTE:
			return convertQAttributeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPackage createInputPackage() {
		InputPackageImpl inputPackage = new InputPackageImpl();
		return inputPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QScenario createQScenario() {
		QScenarioImpl qScenario = new QScenarioImpl();
		return qScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitivityPoint createSensitivityPoint() {
		SensitivityPointImpl sensitivityPoint = new SensitivityPointImpl();
		return sensitivityPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tactic createTactic() {
		TacticImpl tactic = new TacticImpl();
		return tactic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyzedQS createAnalyzedQS() {
		AnalyzedQSImpl analyzedQS = new AnalyzedQSImpl();
		return analyzedQS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAMetric createQAMetricFromString(EDataType eDataType, String initialValue) {
		QAMetric result = QAMetric.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQAMetricToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricUnit createMetricUnitFromString(EDataType eDataType, String initialValue) {
		MetricUnit result = MetricUnit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAttribute createQAttributeFromString(EDataType eDataType, String initialValue) {
		QAttribute result = QAttribute.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQAttributeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accordant_rqPackage getAccordant_rqPackage() {
		return (Accordant_rqPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Accordant_rqPackage getPackage() {
		return Accordant_rqPackage.eINSTANCE;
	}

} //Accordant_rqFactoryImpl
