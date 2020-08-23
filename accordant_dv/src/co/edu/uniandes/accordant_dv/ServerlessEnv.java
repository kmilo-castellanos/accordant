/**
 */
package co.edu.uniandes.accordant_dv;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serverless Env</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getProvider <em>Provider</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getMemory <em>Memory</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getProps <em>Props</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getSaasArts <em>Saas Arts</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getDv <em>Dv</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getServerlessEnv()
 * @model
 * @generated
 */
public interface ServerlessEnv extends EObject {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getServerlessEnv_Provider()
	 * @model
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(int)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getServerlessEnv_Timeout()
	 * @model
	 * @generated
	 */
	int getTimeout();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' attribute.
	 * @see #setMemory(float)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getServerlessEnv_Memory()
	 * @model
	 * @generated
	 */
	float getMemory();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' attribute.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(float value);

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
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getServerlessEnv_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Props</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Props</em>' attribute.
	 * @see #setProps(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getServerlessEnv_Props()
	 * @model
	 * @generated
	 */
	String getProps();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getProps <em>Props</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Props</em>' attribute.
	 * @see #getProps()
	 * @generated
	 */
	void setProps(String value);

	/**
	 * Returns the value of the '<em><b>Saas Arts</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_dv.Artifact}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_dv.Artifact#getSaasEnv <em>Saas Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saas Arts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saas Arts</em>' reference list.
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getServerlessEnv_SaasArts()
	 * @see co.edu.uniandes.accordant_dv.Artifact#getSaasEnv
	 * @model opposite="saasEnv"
	 * @generated
	 */
	EList<Artifact> getSaasArts();

	/**
	 * Returns the value of the '<em><b>Dv</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_dv.DeploymentView#getServerless <em>Serverless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dv</em>' container reference.
	 * @see #setDv(DeploymentView)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getServerlessEnv_Dv()
	 * @see co.edu.uniandes.accordant_dv.DeploymentView#getServerless
	 * @model opposite="serverless" required="true" transient="false"
	 * @generated
	 */
	DeploymentView getDv();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ServerlessEnv#getDv <em>Dv</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dv</em>' container reference.
	 * @see #getDv()
	 * @generated
	 */
	void setDv(DeploymentView value);

} // ServerlessEnv
