/**
 */
package co.edu.uniandes.accordant_rq;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage
 * @generated
 */
public interface Accordant_rqFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Accordant_rqFactory eINSTANCE = co.edu.uniandes.accordant_rq.impl.Accordant_rqFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>QScenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QScenario</em>'.
	 * @generated
	 */
	QScenario createQScenario();

	/**
	 * Returns a new object of class '<em>Arch Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arch Decision</em>'.
	 * @generated
	 */
	ArchDecision createArchDecision();

	/**
	 * Returns a new object of class '<em>Tactic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tactic</em>'.
	 * @generated
	 */
	Tactic createTactic();

	/**
	 * Returns a new object of class '<em>Analyzed QS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analyzed QS</em>'.
	 * @generated
	 */
	AnalyzedQS createAnalyzedQS();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Accordant_rqPackage getAccordant_rqPackage();

} //Accordant_rqFactory
