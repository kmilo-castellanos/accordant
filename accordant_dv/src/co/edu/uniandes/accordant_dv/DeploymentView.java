/**
 */
package co.edu.uniandes.accordant_dv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.DeploymentView#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.DeploymentView#getDevs <em>Devs</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.DeploymentView#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.DeploymentView#getServices <em>Services</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.DeploymentView#getServerless <em>Serverless</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.DeploymentView#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDeploymentView()
 * @model
 * @generated
 */
public interface DeploymentView extends EObject {
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
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDeploymentView_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.DeploymentView#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Devs</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_dv.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devs</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDeploymentView_Devs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Device> getDevs();

	/**
	 * Returns the value of the '<em><b>Deployments</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_dv.Deployment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployments</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDeploymentView_Deployments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deployment> getDeployments();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_dv.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDeploymentView_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Serverless</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_dv.ServerlessEnv}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serverless</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serverless</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDeploymentView_Serverless()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServerlessEnv> getServerless();

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_dv.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDeploymentView_Artifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

} // DeploymentView
