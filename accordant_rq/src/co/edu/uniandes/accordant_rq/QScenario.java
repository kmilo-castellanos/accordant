/**
 */
package co.edu.uniandes.accordant_rq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QScenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_rq.QScenario#getMeasure <em>Measure</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.QScenario#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.QScenario#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.QScenario#getUnit <em>Unit</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.QScenario#getQAttribute <em>QAttribute</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.QScenario#getAnalyzed <em>Analyzed</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.QScenario#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.QScenario#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getQScenario()
 * @model
 * @generated
 */
public interface QScenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.accordant_rq.QAMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' attribute.
	 * @see co.edu.uniandes.accordant_rq.QAMetric
	 * @see #setMeasure(QAMetric)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getQScenario_Measure()
	 * @model required="true"
	 * @generated
	 */
	QAMetric getMeasure();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.QScenario#getMeasure <em>Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' attribute.
	 * @see co.edu.uniandes.accordant_rq.QAMetric
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(QAMetric value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(float)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getQScenario_MinValue()
	 * @model required="true"
	 * @generated
	 */
	float getMinValue();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.QScenario#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(float value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(float)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getQScenario_MaxValue()
	 * @model required="true"
	 * @generated
	 */
	float getMaxValue();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.QScenario#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(float value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.accordant_rq.MetricUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see co.edu.uniandes.accordant_rq.MetricUnit
	 * @see #setUnit(MetricUnit)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getQScenario_Unit()
	 * @model required="true"
	 * @generated
	 */
	MetricUnit getUnit();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.QScenario#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see co.edu.uniandes.accordant_rq.MetricUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(MetricUnit value);

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
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getQScenario_QAttribute()
	 * @model required="true"
	 * @generated
	 */
	QAttribute getQAttribute();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.QScenario#getQAttribute <em>QAttribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QAttribute</em>' attribute.
	 * @see co.edu.uniandes.accordant_rq.QAttribute
	 * @see #getQAttribute()
	 * @generated
	 */
	void setQAttribute(QAttribute value);

	/**
	 * Returns the value of the '<em><b>Analyzed</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_rq.AnalyzedQS#getQs <em>Qs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analyzed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analyzed</em>' reference.
	 * @see #setAnalyzed(AnalyzedQS)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getQScenario_Analyzed()
	 * @see co.edu.uniandes.accordant_rq.AnalyzedQS#getQs
	 * @model opposite="qs"
	 * @generated
	 */
	AnalyzedQS getAnalyzed();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.QScenario#getAnalyzed <em>Analyzed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analyzed</em>' reference.
	 * @see #getAnalyzed()
	 * @generated
	 */
	void setAnalyzed(AnalyzedQS value);

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
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getQScenario_Stimulus()
	 * @model required="true"
	 * @generated
	 */
	String getStimulus();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.QScenario#getStimulus <em>Stimulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus</em>' attribute.
	 * @see #getStimulus()
	 * @generated
	 */
	void setStimulus(String value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getQScenario_Environment()
	 * @model required="true"
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_rq.QScenario#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(String value);

} // QScenario
