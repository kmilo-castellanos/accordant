/**
 */
package co.edu.uniandes.accordant_rq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analyzed QS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_rq.AnalyzedQS#getSPoints <em>SPoints</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.AnalyzedQS#getQs <em>Qs</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.AnalyzedQS#getReasoning <em>Reasoning</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.AnalyzedQS#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getAnalyzedQS()
 * @model
 * @generated
 */
public interface AnalyzedQS extends EObject {
	/**
	 * Returns the value of the '<em><b>SPoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPoints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPoints</em>' containment reference.
	 * @see #setSPoints(SensitivityPoint)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getAnalyzedQS_SPoints()
	 * @model containment="true"
	 * @generated
	 */
	SensitivityPoint getSPoints();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.AnalyzedQS#getSPoints <em>SPoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPoints</em>' containment reference.
	 * @see #getSPoints()
	 * @generated
	 */
	void setSPoints(SensitivityPoint value);

	/**
	 * Returns the value of the '<em><b>Qs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qs</em>' reference.
	 * @see #setQs(QScenario)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getAnalyzedQS_Qs()
	 * @model required="true"
	 * @generated
	 */
	QScenario getQs();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.AnalyzedQS#getQs <em>Qs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qs</em>' reference.
	 * @see #getQs()
	 * @generated
	 */
	void setQs(QScenario value);

	/**
	 * Returns the value of the '<em><b>Reasoning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reasoning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reasoning</em>' attribute.
	 * @see #setReasoning(String)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getAnalyzedQS_Reasoning()
	 * @model
	 * @generated
	 */
	String getReasoning();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.AnalyzedQS#getReasoning <em>Reasoning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reasoning</em>' attribute.
	 * @see #getReasoning()
	 * @generated
	 */
	void setReasoning(String value);

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
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getAnalyzedQS_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.AnalyzedQS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AnalyzedQS
