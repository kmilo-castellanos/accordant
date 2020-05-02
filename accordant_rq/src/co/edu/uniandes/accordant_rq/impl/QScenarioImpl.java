/**
 */
package co.edu.uniandes.accordant_rq.impl;

import co.edu.uniandes.accordant_rq.Accordant_rqPackage;
import co.edu.uniandes.accordant_rq.MetricUnit;
import co.edu.uniandes.accordant_rq.QAMetric;
import co.edu.uniandes.accordant_rq.QAttribute;
import co.edu.uniandes.accordant_rq.QScenario;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QScenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.QScenarioImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.QScenarioImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.QScenarioImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.QScenarioImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.QScenarioImpl#getQAttribute <em>QAttribute</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.QScenarioImpl#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.QScenarioImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.QScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.QScenarioImpl#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QScenarioImpl extends MinimalEObjectImpl.Container implements QScenario {
	/**
	 * The default value of the '{@link #getMeasure() <em>Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected static final QAMetric MEASURE_EDEFAULT = QAMetric.THROUGHPUT;

	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected QAMetric measure = MEASURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected float minValue = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected float maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final MetricUnit UNIT_EDEFAULT = MetricUnit.MILLIS;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected MetricUnit unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQAttribute() <em>QAttribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final QAttribute QATTRIBUTE_EDEFAULT = QAttribute.AVAILABILITY;

	/**
	 * The cached value of the '{@link #getQAttribute() <em>QAttribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQAttribute()
	 * @generated
	 * @ordered
	 */
	protected QAttribute qAttribute = QATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimulus() <em>Stimulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulus()
	 * @generated
	 * @ordered
	 */
	protected static final String STIMULUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulus() <em>Stimulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulus()
	 * @generated
	 * @ordered
	 */
	protected String stimulus = STIMULUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String environment = ENVIRONMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponse() <em>Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected String response = RESPONSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_rqPackage.Literals.QSCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QAMetric getMeasure() {
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasure(QAMetric newMeasure) {
		QAMetric oldMeasure = measure;
		measure = newMeasure == null ? MEASURE_EDEFAULT : newMeasure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.QSCENARIO__MEASURE, oldMeasure, measure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinValue(float newMinValue) {
		float oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.QSCENARIO__MIN_VALUE, oldMinValue, minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxValue(float newMaxValue) {
		float oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.QSCENARIO__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetricUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(MetricUnit newUnit) {
		MetricUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.QSCENARIO__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QAttribute getQAttribute() {
		return qAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQAttribute(QAttribute newQAttribute) {
		QAttribute oldQAttribute = qAttribute;
		qAttribute = newQAttribute == null ? QATTRIBUTE_EDEFAULT : newQAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.QSCENARIO__QATTRIBUTE, oldQAttribute, qAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStimulus() {
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulus(String newStimulus) {
		String oldStimulus = stimulus;
		stimulus = newStimulus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.QSCENARIO__STIMULUS, oldStimulus, stimulus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvironment(String newEnvironment) {
		String oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.QSCENARIO__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.QSCENARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponse(String newResponse) {
		String oldResponse = response;
		response = newResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.QSCENARIO__RESPONSE, oldResponse, response));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Accordant_rqPackage.QSCENARIO__MEASURE:
				return getMeasure();
			case Accordant_rqPackage.QSCENARIO__MIN_VALUE:
				return getMinValue();
			case Accordant_rqPackage.QSCENARIO__MAX_VALUE:
				return getMaxValue();
			case Accordant_rqPackage.QSCENARIO__UNIT:
				return getUnit();
			case Accordant_rqPackage.QSCENARIO__QATTRIBUTE:
				return getQAttribute();
			case Accordant_rqPackage.QSCENARIO__STIMULUS:
				return getStimulus();
			case Accordant_rqPackage.QSCENARIO__ENVIRONMENT:
				return getEnvironment();
			case Accordant_rqPackage.QSCENARIO__NAME:
				return getName();
			case Accordant_rqPackage.QSCENARIO__RESPONSE:
				return getResponse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Accordant_rqPackage.QSCENARIO__MEASURE:
				setMeasure((QAMetric)newValue);
				return;
			case Accordant_rqPackage.QSCENARIO__MIN_VALUE:
				setMinValue((Float)newValue);
				return;
			case Accordant_rqPackage.QSCENARIO__MAX_VALUE:
				setMaxValue((Float)newValue);
				return;
			case Accordant_rqPackage.QSCENARIO__UNIT:
				setUnit((MetricUnit)newValue);
				return;
			case Accordant_rqPackage.QSCENARIO__QATTRIBUTE:
				setQAttribute((QAttribute)newValue);
				return;
			case Accordant_rqPackage.QSCENARIO__STIMULUS:
				setStimulus((String)newValue);
				return;
			case Accordant_rqPackage.QSCENARIO__ENVIRONMENT:
				setEnvironment((String)newValue);
				return;
			case Accordant_rqPackage.QSCENARIO__NAME:
				setName((String)newValue);
				return;
			case Accordant_rqPackage.QSCENARIO__RESPONSE:
				setResponse((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Accordant_rqPackage.QSCENARIO__MEASURE:
				setMeasure(MEASURE_EDEFAULT);
				return;
			case Accordant_rqPackage.QSCENARIO__MIN_VALUE:
				setMinValue(MIN_VALUE_EDEFAULT);
				return;
			case Accordant_rqPackage.QSCENARIO__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
				return;
			case Accordant_rqPackage.QSCENARIO__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case Accordant_rqPackage.QSCENARIO__QATTRIBUTE:
				setQAttribute(QATTRIBUTE_EDEFAULT);
				return;
			case Accordant_rqPackage.QSCENARIO__STIMULUS:
				setStimulus(STIMULUS_EDEFAULT);
				return;
			case Accordant_rqPackage.QSCENARIO__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
				return;
			case Accordant_rqPackage.QSCENARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Accordant_rqPackage.QSCENARIO__RESPONSE:
				setResponse(RESPONSE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Accordant_rqPackage.QSCENARIO__MEASURE:
				return measure != MEASURE_EDEFAULT;
			case Accordant_rqPackage.QSCENARIO__MIN_VALUE:
				return minValue != MIN_VALUE_EDEFAULT;
			case Accordant_rqPackage.QSCENARIO__MAX_VALUE:
				return maxValue != MAX_VALUE_EDEFAULT;
			case Accordant_rqPackage.QSCENARIO__UNIT:
				return unit != UNIT_EDEFAULT;
			case Accordant_rqPackage.QSCENARIO__QATTRIBUTE:
				return qAttribute != QATTRIBUTE_EDEFAULT;
			case Accordant_rqPackage.QSCENARIO__STIMULUS:
				return STIMULUS_EDEFAULT == null ? stimulus != null : !STIMULUS_EDEFAULT.equals(stimulus);
			case Accordant_rqPackage.QSCENARIO__ENVIRONMENT:
				return ENVIRONMENT_EDEFAULT == null ? environment != null : !ENVIRONMENT_EDEFAULT.equals(environment);
			case Accordant_rqPackage.QSCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Accordant_rqPackage.QSCENARIO__RESPONSE:
				return RESPONSE_EDEFAULT == null ? response != null : !RESPONSE_EDEFAULT.equals(response);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (measure: ");
		result.append(measure);
		result.append(", minValue: ");
		result.append(minValue);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", unit: ");
		result.append(unit);
		result.append(", qAttribute: ");
		result.append(qAttribute);
		result.append(", stimulus: ");
		result.append(stimulus);
		result.append(", environment: ");
		result.append(environment);
		result.append(", name: ");
		result.append(name);
		result.append(", response: ");
		result.append(response);
		result.append(')');
		return result.toString();
	}

} //QScenarioImpl
