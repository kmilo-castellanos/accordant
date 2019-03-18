/**
 */
package co.edu.uniandes.accordant_dv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.Pod#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Pod#getHost <em>Host</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Pod#getRestartPolicy <em>Restart Policy</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Pod#getEnvs <em>Envs</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Pod#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getPod()
 * @model
 * @generated
 */
public interface Pod extends EObject {
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
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getPod_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Pod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getPod_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Pod#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Restart Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restart Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart Policy</em>' attribute.
	 * @see #setRestartPolicy(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getPod_RestartPolicy()
	 * @model
	 * @generated
	 */
	String getRestartPolicy();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Pod#getRestartPolicy <em>Restart Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart Policy</em>' attribute.
	 * @see #getRestartPolicy()
	 * @generated
	 */
	void setRestartPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Envs</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_dv.ExecEnvironment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Envs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envs</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getPod_Envs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExecEnvironment> getEnvs();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(Device)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getPod_Node()
	 * @model
	 * @generated
	 */
	Device getNode();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Pod#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Device value);

} // Pod
