/**
 */
package co.edu.uniandes.accordant_rq;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_rq.InputPackage#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.InputPackage#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.InputPackage#getGtactics <em>Gtactics</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getInputPackage()
 * @model
 * @generated
 */
public interface InputPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getInputPackage_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.InputPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_rq.QScenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenarios</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getInputPackage_Scenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<QScenario> getScenarios();

	/**
	 * Returns the value of the '<em><b>Gtactics</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_rq.Tactic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gtactics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gtactics</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getInputPackage_Gtactics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tactic> getGtactics();

} // InputPackage
