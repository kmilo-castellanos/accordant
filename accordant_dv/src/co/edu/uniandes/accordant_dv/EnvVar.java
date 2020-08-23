/**
 */
package co.edu.uniandes.accordant_dv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.EnvVar#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.EnvVar#getValue <em>Value</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.EnvVar#getExecEnv <em>Exec Env</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getEnvVar()
 * @model
 * @generated
 */
public interface EnvVar extends EObject {
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
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getEnvVar_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.EnvVar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getEnvVar_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.EnvVar#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Exec Env</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_dv.ExecEnvironment#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exec Env</em>' container reference.
	 * @see #setExecEnv(ExecEnvironment)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getEnvVar_ExecEnv()
	 * @see co.edu.uniandes.accordant_dv.ExecEnvironment#getVars
	 * @model opposite="vars" required="true" transient="false"
	 * @generated
	 */
	ExecEnvironment getExecEnv();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.EnvVar#getExecEnv <em>Exec Env</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exec Env</em>' container reference.
	 * @see #getExecEnv()
	 * @generated
	 */
	void setExecEnv(ExecEnvironment value);

} // EnvVar
