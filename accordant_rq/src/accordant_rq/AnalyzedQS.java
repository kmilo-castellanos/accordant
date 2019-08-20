/**
 */
package accordant_rq;

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
 *   <li>{@link accordant_rq.AnalyzedQS#getPoints <em>Points</em>}</li>
 *   <li>{@link accordant_rq.AnalyzedQS#getQs <em>Qs</em>}</li>
 *   <li>{@link accordant_rq.AnalyzedQS#getReasoning <em>Reasoning</em>}</li>
 * </ul>
 *
 * @see accordant_rq.Accordant_rqPackage#getAnalyzedQS()
 * @model
 * @generated
 */
public interface AnalyzedQS extends EObject {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference.
	 * @see #setPoints(SensitivityPoint)
	 * @see accordant_rq.Accordant_rqPackage#getAnalyzedQS_Points()
	 * @model containment="true"
	 * @generated
	 */
	SensitivityPoint getPoints();

	/**
	 * Sets the value of the '{@link accordant_rq.AnalyzedQS#getPoints <em>Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' containment reference.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(SensitivityPoint value);

	/**
	 * Returns the value of the '<em><b>Qs</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link accordant_rq.QScenario#getAnalyzed <em>Analyzed</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qs</em>' reference.
	 * @see #setQs(QScenario)
	 * @see accordant_rq.Accordant_rqPackage#getAnalyzedQS_Qs()
	 * @see accordant_rq.QScenario#getAnalyzed
	 * @model opposite="analyzed" required="true"
	 * @generated
	 */
	QScenario getQs();

	/**
	 * Sets the value of the '{@link accordant_rq.AnalyzedQS#getQs <em>Qs</em>}' reference.
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
	 * @see accordant_rq.Accordant_rqPackage#getAnalyzedQS_Reasoning()
	 * @model
	 * @generated
	 */
	String getReasoning();

	/**
	 * Sets the value of the '{@link accordant_rq.AnalyzedQS#getReasoning <em>Reasoning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reasoning</em>' attribute.
	 * @see #getReasoning()
	 * @generated
	 */
	void setReasoning(String value);

} // AnalyzedQS
