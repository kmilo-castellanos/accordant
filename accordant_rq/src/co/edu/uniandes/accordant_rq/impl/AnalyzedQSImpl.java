/**
 */
package co.edu.uniandes.accordant_rq.impl;

import co.edu.uniandes.accordant_rq.Accordant_rqPackage;
import co.edu.uniandes.accordant_rq.AnalyzedQS;
import co.edu.uniandes.accordant_rq.QScenario;
import co.edu.uniandes.accordant_rq.SensitivityPoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analyzed QS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.AnalyzedQSImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.AnalyzedQSImpl#getQs <em>Qs</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.AnalyzedQSImpl#getReasoning <em>Reasoning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalyzedQSImpl extends MinimalEObjectImpl.Container implements AnalyzedQS {
	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected SensitivityPoint points;

	/**
	 * The cached value of the '{@link #getQs() <em>Qs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQs()
	 * @generated
	 * @ordered
	 */
	protected QScenario qs;

	/**
	 * The default value of the '{@link #getReasoning() <em>Reasoning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasoning()
	 * @generated
	 * @ordered
	 */
	protected static final String REASONING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReasoning() <em>Reasoning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasoning()
	 * @generated
	 * @ordered
	 */
	protected String reasoning = REASONING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalyzedQSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_rqPackage.Literals.ANALYZED_QS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensitivityPoint getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoints(SensitivityPoint newPoints, NotificationChain msgs) {
		SensitivityPoint oldPoints = points;
		points = newPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.ANALYZED_QS__POINTS, oldPoints, newPoints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(SensitivityPoint newPoints) {
		if (newPoints != points) {
			NotificationChain msgs = null;
			if (points != null)
				msgs = ((InternalEObject)points).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Accordant_rqPackage.ANALYZED_QS__POINTS, null, msgs);
			if (newPoints != null)
				msgs = ((InternalEObject)newPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Accordant_rqPackage.ANALYZED_QS__POINTS, null, msgs);
			msgs = basicSetPoints(newPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.ANALYZED_QS__POINTS, newPoints, newPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QScenario getQs() {
		if (qs != null && qs.eIsProxy()) {
			InternalEObject oldQs = (InternalEObject)qs;
			qs = (QScenario)eResolveProxy(oldQs);
			if (qs != oldQs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Accordant_rqPackage.ANALYZED_QS__QS, oldQs, qs));
			}
		}
		return qs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QScenario basicGetQs() {
		return qs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQs(QScenario newQs, NotificationChain msgs) {
		QScenario oldQs = qs;
		qs = newQs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.ANALYZED_QS__QS, oldQs, newQs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQs(QScenario newQs) {
		if (newQs != qs) {
			NotificationChain msgs = null;
			if (qs != null)
				msgs = ((InternalEObject)qs).eInverseRemove(this, Accordant_rqPackage.QSCENARIO__ANALYZED, QScenario.class, msgs);
			if (newQs != null)
				msgs = ((InternalEObject)newQs).eInverseAdd(this, Accordant_rqPackage.QSCENARIO__ANALYZED, QScenario.class, msgs);
			msgs = basicSetQs(newQs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.ANALYZED_QS__QS, newQs, newQs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReasoning() {
		return reasoning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasoning(String newReasoning) {
		String oldReasoning = reasoning;
		reasoning = newReasoning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.ANALYZED_QS__REASONING, oldReasoning, reasoning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Accordant_rqPackage.ANALYZED_QS__QS:
				if (qs != null)
					msgs = ((InternalEObject)qs).eInverseRemove(this, Accordant_rqPackage.QSCENARIO__ANALYZED, QScenario.class, msgs);
				return basicSetQs((QScenario)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Accordant_rqPackage.ANALYZED_QS__POINTS:
				return basicSetPoints(null, msgs);
			case Accordant_rqPackage.ANALYZED_QS__QS:
				return basicSetQs(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Accordant_rqPackage.ANALYZED_QS__POINTS:
				return getPoints();
			case Accordant_rqPackage.ANALYZED_QS__QS:
				if (resolve) return getQs();
				return basicGetQs();
			case Accordant_rqPackage.ANALYZED_QS__REASONING:
				return getReasoning();
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
			case Accordant_rqPackage.ANALYZED_QS__POINTS:
				setPoints((SensitivityPoint)newValue);
				return;
			case Accordant_rqPackage.ANALYZED_QS__QS:
				setQs((QScenario)newValue);
				return;
			case Accordant_rqPackage.ANALYZED_QS__REASONING:
				setReasoning((String)newValue);
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
			case Accordant_rqPackage.ANALYZED_QS__POINTS:
				setPoints((SensitivityPoint)null);
				return;
			case Accordant_rqPackage.ANALYZED_QS__QS:
				setQs((QScenario)null);
				return;
			case Accordant_rqPackage.ANALYZED_QS__REASONING:
				setReasoning(REASONING_EDEFAULT);
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
			case Accordant_rqPackage.ANALYZED_QS__POINTS:
				return points != null;
			case Accordant_rqPackage.ANALYZED_QS__QS:
				return qs != null;
			case Accordant_rqPackage.ANALYZED_QS__REASONING:
				return REASONING_EDEFAULT == null ? reasoning != null : !REASONING_EDEFAULT.equals(reasoning);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (reasoning: ");
		result.append(reasoning);
		result.append(')');
		return result.toString();
	}

} //AnalyzedQSImpl
