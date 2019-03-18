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
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getCpu_req <em>Cpu req</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getMem_req <em>Mem req</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getCpu_lim <em>Cpu lim</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getMem_lim <em>Mem lim</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getImage <em>Image</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getPorts <em>Ports</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getVars <em>Vars</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExecEnvironment()
 * @model
 * @generated
 */
public interface ExecEnvironment extends EObject {
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
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExecEnvironment_Artifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getExecEnvironment_Vars()
	 * @model containment="true"
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

} // ExecEnvironment
