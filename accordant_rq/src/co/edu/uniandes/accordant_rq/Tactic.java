/**
 */
package co.edu.uniandes.accordant_rq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tactic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_rq.Tactic#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.Tactic#getQAttribute <em>QAttribute</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.Tactic#getSubtactics <em>Subtactics</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.Tactic#getRationale <em>Rationale</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.Tactic#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.Tactic#getResponse <em>Response</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.Tactic#getViewpoint <em>Viewpoint</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.Tactic#getSpoint <em>Spoint</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getTactic()
 * @model
 * @generated
 */
public interface Tactic extends EObject {
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
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getTactic_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.Tactic#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>QAttribute</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.accordant_rq.QAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QAttribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QAttribute</em>' attribute.
	 * @see co.edu.uniandes.accordant_rq.QAttribute
	 * @see #setQAttribute(QAttribute)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getTactic_QAttribute()
	 * @model
	 * @generated
	 */
	QAttribute getQAttribute();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.Tactic#getQAttribute <em>QAttribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QAttribute</em>' attribute.
	 * @see co.edu.uniandes.accordant_rq.QAttribute
	 * @see #getQAttribute()
	 * @generated
	 */
	void setQAttribute(QAttribute value);

	/**
	 * Returns the value of the '<em><b>Subtactics</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_rq.Tactic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtactics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtactics</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getTactic_Subtactics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tactic> getSubtactics();

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getTactic_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.Tactic#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

	/**
	 * Returns the value of the '<em><b>Stimulus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimulus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimulus</em>' attribute.
	 * @see #setStimulus(String)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getTactic_Stimulus()
	 * @model
	 * @generated
	 */
	String getStimulus();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.Tactic#getStimulus <em>Stimulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus</em>' attribute.
	 * @see #getStimulus()
	 * @generated
	 */
	void setStimulus(String value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' attribute.
	 * @see #setResponse(String)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getTactic_Response()
	 * @model
	 * @generated
	 */
	String getResponse();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.Tactic#getResponse <em>Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' attribute.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(String value);

	/**
	 * Returns the value of the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewpoint</em>' attribute.
	 * @see #setViewpoint(String)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getTactic_Viewpoint()
	 * @model
	 * @generated
	 */
	String getViewpoint();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.Tactic#getViewpoint <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewpoint</em>' attribute.
	 * @see #getViewpoint()
	 * @generated
	 */
	void setViewpoint(String value);

	/**
	 * Returns the value of the '<em><b>Spoint</b></em>' reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_rq.SensitivityPoint}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_rq.SensitivityPoint#getTactic <em>Tactic</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spoint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spoint</em>' reference list.
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getTactic_Spoint()
	 * @see co.edu.uniandes.accordant_rq.SensitivityPoint#getTactic
	 * @model opposite="tactic"
	 * @generated
	 */
	EList<SensitivityPoint> getSpoint();

} // Tactic
