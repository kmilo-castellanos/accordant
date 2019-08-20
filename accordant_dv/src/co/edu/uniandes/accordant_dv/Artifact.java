/**
 */
package co.edu.uniandes.accordant_dv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.Artifact#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Artifact#getProps <em>Props</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Artifact#getComponent <em>Component</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Artifact#getConnector <em>Connector</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Artifact#getSaas <em>Saas</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Artifact#getPaas <em>Paas</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends EObject {
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
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getArtifact_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Artifact#getName <em>Name</em>}' attribute.
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
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getArtifact_Props()
	 * @model
	 * @generated
	 */
	String getProps();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Artifact#getProps <em>Props</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Props</em>' attribute.
	 * @see #getProps()
	 * @generated
	 */
	void setProps(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' attribute.
	 * @see #setComponent(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getArtifact_Component()
	 * @model
	 * @generated
	 */
	String getComponent();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Artifact#getComponent <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' attribute.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(String value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' attribute.
	 * @see #setConnector(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getArtifact_Connector()
	 * @model
	 * @generated
	 */
	String getConnector();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Artifact#getConnector <em>Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' attribute.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(String value);

	/**
	 * Returns the value of the '<em><b>Saas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saas</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saas</em>' reference.
	 * @see #setSaas(ServerlessEnv)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getArtifact_Saas()
	 * @model
	 * @generated
	 */
	ServerlessEnv getSaas();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Artifact#getSaas <em>Saas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saas</em>' reference.
	 * @see #getSaas()
	 * @generated
	 */
	void setSaas(ServerlessEnv value);

	/**
	 * Returns the value of the '<em><b>Paas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paas</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paas</em>' reference.
	 * @see #setPaas(ExecEnvironment)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getArtifact_Paas()
	 * @model
	 * @generated
	 */
	ExecEnvironment getPaas();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Artifact#getPaas <em>Paas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paas</em>' reference.
	 * @see #getPaas()
	 * @generated
	 */
	void setPaas(ExecEnvironment value);

} // Artifact
