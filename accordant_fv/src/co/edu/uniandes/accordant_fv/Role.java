/**
 */
package co.edu.uniandes.accordant_fv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_fv.Role#getType <em>Type</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Role#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Role#getPort <em>Port</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Role#getConn <em>Conn</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.accordant_fv.RoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.RoleType
	 * @see #setType(RoleType)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getRole_Type()
	 * @model
	 * @generated
	 */
	RoleType getType();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Role#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.RoleType
	 * @see #getType()
	 * @generated
	 */
	void setType(RoleType value);

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
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getRole_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_fv.Port#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getRole_Port()
	 * @see co.edu.uniandes.accordant_fv.Port#getRole
	 * @model opposite="role"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Role#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Conn</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_fv.Connector#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conn</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conn</em>' container reference.
	 * @see #setConn(Connector)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getRole_Conn()
	 * @see co.edu.uniandes.accordant_fv.Connector#getRoles
	 * @model opposite="roles" required="true" transient="false"
	 * @generated
	 */
	Connector getConn();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Role#getConn <em>Conn</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn</em>' container reference.
	 * @see #getConn()
	 * @generated
	 */
	void setConn(Connector value);

} // Role
