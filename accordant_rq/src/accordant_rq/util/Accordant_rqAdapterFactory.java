/**
 */
package accordant_rq.util;

import accordant_rq.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see accordant_rq.Accordant_rqPackage
 * @generated
 */
public class Accordant_rqAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Accordant_rqPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accordant_rqAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Accordant_rqPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Accordant_rqSwitch<Adapter> modelSwitch = new Accordant_rqSwitch<Adapter>() {
		@Override
		public Adapter caseInputPackage(InputPackage object) {
			return createInputPackageAdapter();
		}

		@Override
		public Adapter caseQScenario(QScenario object) {
			return createQScenarioAdapter();
		}

		@Override
		public Adapter caseSensitivityPoint(SensitivityPoint object) {
			return createSensitivityPointAdapter();
		}

		@Override
		public Adapter caseTactic(Tactic object) {
			return createTacticAdapter();
		}

		@Override
		public Adapter caseAnalyzedQS(AnalyzedQS object) {
			return createAnalyzedQSAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link accordant_rq.InputPackage <em>Input Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accordant_rq.InputPackage
	 * @generated
	 */
	public Adapter createInputPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accordant_rq.QScenario <em>QScenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accordant_rq.QScenario
	 * @generated
	 */
	public Adapter createQScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accordant_rq.SensitivityPoint <em>Sensitivity Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accordant_rq.SensitivityPoint
	 * @generated
	 */
	public Adapter createSensitivityPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accordant_rq.Tactic <em>Tactic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accordant_rq.Tactic
	 * @generated
	 */
	public Adapter createTacticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link accordant_rq.AnalyzedQS <em>Analyzed QS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see accordant_rq.AnalyzedQS
	 * @generated
	 */
	public Adapter createAnalyzedQSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Accordant_rqAdapterFactory
