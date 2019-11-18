/**
 */
package co.edu.uniandes.accordant_fv;

import co.edu.uniandes.accordant_rq.SensitivityPoint;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_fv.Component#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Component#getPorts <em>Ports</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Component#getProcModel <em>Proc Model</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Component#getFuncView <em>Func View</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Component#getSpoint <em>Spoint</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends EObject {
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
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getComponent_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_fv.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getComponent_Ports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Proc Model</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.accordant_fv.ProcessingModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proc Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proc Model</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.ProcessingModel
	 * @see #setProcModel(ProcessingModel)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getComponent_ProcModel()
	 * @model
	 * @generated
	 */
	ProcessingModel getProcModel();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Component#getProcModel <em>Proc Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proc Model</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.ProcessingModel
	 * @see #getProcModel()
	 * @generated
	 */
	void setProcModel(ProcessingModel value);

	/**
	 * Returns the value of the '<em><b>Func View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_fv.FunctionalView#getComps <em>Comps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Func View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func View</em>' container reference.
	 * @see #setFuncView(FunctionalView)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getComponent_FuncView()
	 * @see co.edu.uniandes.accordant_fv.FunctionalView#getComps
	 * @model opposite="comps" transient="false"
	 * @generated
	 */
	FunctionalView getFuncView();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Component#getFuncView <em>Func View</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Func View</em>' container reference.
	 * @see #getFuncView()
	 * @generated
	 */
	void setFuncView(FunctionalView value);

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
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getComponent_Spoint()
	 * @model
	 * @generated
	 */
	SensitivityPoint getSpoint();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Component#getSpoint <em>Spoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spoint</em>' reference.
	 * @see #getSpoint()
	 * @generated
	 */
	void setSpoint(SensitivityPoint value);

} // Component
