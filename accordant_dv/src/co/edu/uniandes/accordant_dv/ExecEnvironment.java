/**
 */
package co.edu.uniandes.accordant_dv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getCpu_req <em>Cpu req</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getMem_req <em>Mem req</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getCpu_lim <em>Cpu lim</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getMem_lim <em>Mem lim</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getImage <em>Image</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getPorts <em>Ports</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getVars <em>Vars</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getCommands <em>Commands</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getPaasArts <em>Paas Arts</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getPodOwner <em>Pod Owner</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExecEnvironment()
 * @model
 * @generated
 */
public interface ExecEnvironment extends EObject {
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
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExecEnvironment_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cpu req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu req</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu req</em>' attribute.
	 * @see #setCpu_req(float)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExecEnvironment_Cpu_req()
	 * @model
	 * @generated
	 */
	float getCpu_req();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getCpu_req <em>Cpu req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu req</em>' attribute.
	 * @see #getCpu_req()
	 * @generated
	 */
	void setCpu_req(float value);

	/**
	 * Returns the value of the '<em><b>Mem req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem req</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem req</em>' attribute.
	 * @see #setMem_req(int)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExecEnvironment_Mem_req()
	 * @model
	 * @generated
	 */
	int getMem_req();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getMem_req <em>Mem req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem req</em>' attribute.
	 * @see #getMem_req()
	 * @generated
	 */
	void setMem_req(int value);

	/**
	 * Returns the value of the '<em><b>Cpu lim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu lim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu lim</em>' attribute.
	 * @see #setCpu_lim(float)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExecEnvironment_Cpu_lim()
	 * @model
	 * @generated
	 */
	float getCpu_lim();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getCpu_lim <em>Cpu lim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu lim</em>' attribute.
	 * @see #getCpu_lim()
	 * @generated
	 */
	void setCpu_lim(float value);

	/**
	 * Returns the value of the '<em><b>Mem lim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem lim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem lim</em>' attribute.
	 * @see #setMem_lim(int)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExecEnvironment_Mem_lim()
	 * @model
	 * @generated
	 */
	int getMem_lim();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getMem_lim <em>Mem lim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem lim</em>' attribute.
	 * @see #getMem_lim()
	 * @generated
	 */
	void setMem_lim(int value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExecEnvironment_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' attribute list.
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExecEnvironment_Ports()
	 * @model
	 * @generated
	 */
	EList<Integer> getPorts();

	/**
	 * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_dv.EnvVar}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_dv.EnvVar#getExecEnv <em>Exec Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExecEnvironment_Vars()
	 * @see co.edu.uniandes.accordant_dv.EnvVar#getExecEnv
	 * @model opposite="execEnv" containment="true"
	 * @generated
	 */
	EList<EnvVar> getVars();

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' attribute list.
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExecEnvironment_Commands()
	 * @model
	 * @generated
	 */
	EList<String> getCommands();

	/**
	 * Returns the value of the '<em><b>Paas Arts</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_dv.Artifact}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_dv.Artifact#getPaasEnv <em>Paas Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paas Arts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paas Arts</em>' reference list.
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExecEnvironment_PaasArts()
	 * @see co.edu.uniandes.accordant_dv.Artifact#getPaasEnv
	 * @model opposite="paasEnv"
	 * @generated
	 */
	EList<Artifact> getPaasArts();

	/**
	 * Returns the value of the '<em><b>Pod Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_dv.Pod#getEnvs <em>Envs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pod Owner</em>' container reference.
	 * @see #setPodOwner(Pod)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExecEnvironment_PodOwner()
	 * @see co.edu.uniandes.accordant_dv.Pod#getEnvs
	 * @model opposite="envs" required="true" transient="false"
	 * @generated
	 */
	Pod getPodOwner();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getPodOwner <em>Pod Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pod Owner</em>' container reference.
	 * @see #getPodOwner()
	 * @generated
	 */
	void setPodOwner(Pod value);

} // ExecEnvironment
