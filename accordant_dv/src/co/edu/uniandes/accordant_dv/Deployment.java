/**
 */
package co.edu.uniandes.accordant_dv;

import co.edu.uniandes.accordant_rq.SensitivityPoint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.Deployment#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Deployment#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Deployment#getMaxSurge <em>Max Surge</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Deployment#getMaxUnavail <em>Max Unavail</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Deployment#getPods <em>Pods</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Deployment#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Deployment#getSpoint <em>Spoint</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
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
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDeployment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Deployment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replicas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replicas</em>' attribute.
	 * @see #setReplicas(int)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDeployment_Replicas()
	 * @model
	 * @generated
	 */
	int getReplicas();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Deployment#getReplicas <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replicas</em>' attribute.
	 * @see #getReplicas()
	 * @generated
	 */
	void setReplicas(int value);

	/**
	 * Returns the value of the '<em><b>Max Surge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Surge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Surge</em>' attribute.
	 * @see #setMaxSurge(int)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDeployment_MaxSurge()
	 * @model
	 * @generated
	 */
	int getMaxSurge();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Deployment#getMaxSurge <em>Max Surge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Surge</em>' attribute.
	 * @see #getMaxSurge()
	 * @generated
	 */
	void setMaxSurge(int value);

	/**
	 * Returns the value of the '<em><b>Max Unavail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Unavail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Unavail</em>' attribute.
	 * @see #setMaxUnavail(int)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDeployment_MaxUnavail()
	 * @model
	 * @generated
	 */
	int getMaxUnavail();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Deployment#getMaxUnavail <em>Max Unavail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Unavail</em>' attribute.
	 * @see #getMaxUnavail()
	 * @generated
	 */
	void setMaxUnavail(int value);

	/**
	 * Returns the value of the '<em><b>Pods</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_dv.Pod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pods</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDeployment_Pods()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Pod> getPods();

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see #setStrategy(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDeployment_Strategy()
	 * @model
	 * @generated
	 */
	String getStrategy();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Deployment#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(String value);

	/**
	 * Returns the value of the '<em><b>Spoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spoint</em>' reference.
	 * @see #setSpoint(SensitivityPoint)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDeployment_Spoint()
	 * @model
	 * @generated
	 */
	SensitivityPoint getSpoint();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Deployment#getSpoint <em>Spoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spoint</em>' reference.
	 * @see #getSpoint()
	 * @generated
	 */
	void setSpoint(SensitivityPoint value);

} // Deployment
