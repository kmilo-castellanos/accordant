/**
 */
package co.edu.uniandes.accordant_dv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.Service#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Service#getPorts <em>Ports</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Service#getType <em>Type</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Service#getExtAccess <em>Ext Access</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
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
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_dv.ExposedPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getService_Ports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExposedPort> getPorts();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getService_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Service#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Ext Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Access</em>' attribute.
	 * @see #setExtAccess(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getService_ExtAccess()
	 * @model
	 * @generated
	 */
	String getExtAccess();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Service#getExtAccess <em>Ext Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext Access</em>' attribute.
	 * @see #getExtAccess()
	 * @generated
	 */
	void setExtAccess(String value);

} // Service
