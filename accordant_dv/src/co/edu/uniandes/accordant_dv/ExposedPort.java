/**
 */
package co.edu.uniandes.accordant_dv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exposed Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExposedPort#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExposedPort#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExposedPort#getTarget <em>Target</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExposedPort#getPort <em>Port</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExposedPort#getExposes <em>Exposes</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExposedPort()
 * @model
 * @generated
 */
public interface ExposedPort extends EObject {
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
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExposedPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ExposedPort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExposedPort_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ExposedPort#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExposedPort_Target()
	 * @model
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ExposedPort#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExposedPort_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ExposedPort#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Exposes</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_dv.Pod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposes</em>' reference list.
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExposedPort_Exposes()
	 * @model
	 * @generated
	 */
	EList<Pod> getExposes();

} // ExposedPort
