/**
 */
package co.edu.uniandes.accordant_rq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensitivity Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_rq.SensitivityPoint#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.SensitivityPoint#getRationale <em>Rationale</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.SensitivityPoint#getCode <em>Code</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.SensitivityPoint#getTactic <em>Tactic</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.SensitivityPoint#isIsRisk <em>Is Risk</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getSensitivityPoint()
 * @model
 * @generated
 */
public interface SensitivityPoint extends EObject {
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
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getSensitivityPoint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.SensitivityPoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getSensitivityPoint_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.SensitivityPoint#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getSensitivityPoint_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.SensitivityPoint#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Tactic</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_rq.Tactic}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_rq.Tactic#getSpoint <em>Spoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tactic</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tactic</em>' reference list.
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getSensitivityPoint_Tactic()
	 * @see co.edu.uniandes.accordant_rq.Tactic#getSpoint
	 * @model opposite="spoint" required="true"
	 * @generated
	 */
	EList<Tactic> getTactic();

	/**
	 * Returns the value of the '<em><b>Is Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Risk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Risk</em>' attribute.
	 * @see #setIsRisk(boolean)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getSensitivityPoint_IsRisk()
	 * @model
	 * @generated
	 */
	boolean isIsRisk();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.SensitivityPoint#isIsRisk <em>Is Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Risk</em>' attribute.
	 * @see #isIsRisk()
	 * @generated
	 */
	void setIsRisk(boolean value);

} // SensitivityPoint
