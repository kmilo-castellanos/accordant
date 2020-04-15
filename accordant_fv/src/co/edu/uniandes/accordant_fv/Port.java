/**
 */
package co.edu.uniandes.accordant_fv;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_fv.Port#getType <em>Type</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Port#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Port#getFields <em>Fields</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Port#getRole <em>Role</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Port#getComp <em>Comp</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.accordant_fv.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.PortType
	 * @see #setType(PortType)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getPort_Type()
	 * @model
	 * @generated
	 */
	PortType getType();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Port#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.PortType
	 * @see #getType()
	 * @generated
	 */
	void setType(PortType value);

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
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getPort_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_fv.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getPort_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_fv.Role#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getPort_Role()
	 * @see co.edu.uniandes.accordant_fv.Role#getPort
	 * @model opposite="port"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Port#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Comp</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_fv.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp</em>' container reference.
	 * @see #setComp(Component)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getPort_Comp()
	 * @see co.edu.uniandes.accordant_fv.Component#getPorts
	 * @model opposite="ports" transient="false"
	 * @generated
	 */
	Component getComp();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Port#getComp <em>Comp</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp</em>' container reference.
	 * @see #getComp()
	 * @generated
	 */
	void setComp(Component value);

} // Port
