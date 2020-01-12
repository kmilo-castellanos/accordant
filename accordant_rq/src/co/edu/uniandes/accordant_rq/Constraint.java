/**
 */
package co.edu.uniandes.accordant_rq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_rq.Constraint#getCode <em>Code</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.Constraint#getType <em>Type</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.Constraint#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getConstraint_Code()
	 * @model default="" id="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.Constraint#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.accordant_rq.ConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see co.edu.uniandes.accordant_rq.ConstraintType
	 * @see #setType(ConstraintType)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getConstraint_Type()
	 * @model
	 * @generated
	 */
	ConstraintType getType();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.Constraint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see co.edu.uniandes.accordant_rq.ConstraintType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConstraintType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getConstraint_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.Constraint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Constraint
