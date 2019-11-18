/**
 */
package co.edu.uniandes.accordant_fv;

import co.edu.uniandes.accordant_rq.InputPackage;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_fv.FunctionalView#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.FunctionalView#getConns <em>Conns</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.FunctionalView#getComps <em>Comps</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.FunctionalView#getIpackage <em>Ipackage</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getFunctionalView()
 * @model
 * @generated
 */
public interface FunctionalView extends EObject {
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
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getFunctionalView_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.FunctionalView#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Conns</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_fv.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conns</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getFunctionalView_Conns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Connector> getConns();

	/**
	 * Returns the value of the '<em><b>Comps</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_fv.Component}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_fv.Component#getFuncView <em>Func View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comps</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getFunctionalView_Comps()
	 * @see co.edu.uniandes.accordant_fv.Component#getFuncView
	 * @model opposite="funcView" containment="true" required="true"
	 * @generated
	 */
	EList<Component> getComps();

	/**
	 * Returns the value of the '<em><b>Ipackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ipackage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ipackage</em>' reference.
	 * @see #setIpackage(InputPackage)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getFunctionalView_Ipackage()
	 * @model required="true"
	 * @generated
	 */
	InputPackage getIpackage();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.FunctionalView#getIpackage <em>Ipackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipackage</em>' reference.
	 * @see #getIpackage()
	 * @generated
	 */
	void setIpackage(InputPackage value);

} // FunctionalView
