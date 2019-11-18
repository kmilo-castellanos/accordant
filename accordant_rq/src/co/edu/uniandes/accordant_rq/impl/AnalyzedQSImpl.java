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
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.AnalyzedQSImpl#getSPoints <em>SPoints</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.AnalyzedQSImpl#getQs <em>Qs</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.AnalyzedQSImpl#getReasoning <em>Reasoning</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.AnalyzedQSImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalyzedQSImpl extends MinimalEObjectImpl.Container implements AnalyzedQS {
	/**
	 * The cached value of the '{@link #getSPoints() <em>SPoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPoints()
	 * @generated
	 * @ordered
	 */
	protected SensitivityPoint sPoints;

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
	public SensitivityPoint getSPoints() {
		return sPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPoints(SensitivityPoint newSPoints, NotificationChain msgs) {
		SensitivityPoint oldSPoints = sPoints;
		sPoints = newSPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.ANALYZED_QS__SPOINTS, oldSPoints, newSPoints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPoints(SensitivityPoint newSPoints) {
		if (newSPoints != sPoints) {
			NotificationChain msgs = null;
			if (sPoints != null)
				msgs = ((InternalEObject)sPoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Accordant_rqPackage.ANALYZED_QS__SPOINTS, null, msgs);
			if (newSPoints != null)
				msgs = ((InternalEObject)newSPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Accordant_rqPackage.ANALYZED_QS__SPOINTS, null, msgs);
			msgs = basicSetSPoints(newSPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.ANALYZED_QS__SPOINTS, newSPoints, newSPoints));
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
	public void setQs(QScenario newQs) {
		QScenario oldQs = qs;
		qs = newQs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.ANALYZED_QS__QS, oldQs, qs));
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.ANALYZED_QS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Accordant_rqPackage.ANALYZED_QS__SPOINTS:
				return basicSetSPoints(null, msgs);
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
			case Accordant_rqPackage.ANALYZED_QS__SPOINTS:
				return getSPoints();
			case Accordant_rqPackage.ANALYZED_QS__QS:
				if (resolve) return getQs();
				return basicGetQs();
			case Accordant_rqPackage.ANALYZED_QS__REASONING:
				return getReasoning();
			case Accordant_rqPackage.ANALYZED_QS__NAME:
				return getName();
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
			case Accordant_rqPackage.ANALYZED_QS__SPOINTS:
				setSPoints((SensitivityPoint)newValue);
				return;
			case Accordant_rqPackage.ANALYZED_QS__QS:
				setQs((QScenario)newValue);
				return;
			case Accordant_rqPackage.ANALYZED_QS__REASONING:
				setReasoning((String)newValue);
				return;
			case Accordant_rqPackage.ANALYZED_QS__NAME:
				setName((String)newValue);
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
			case Accordant_rqPackage.ANALYZED_QS__SPOINTS:
				setSPoints((SensitivityPoint)null);
				return;
			case Accordant_rqPackage.ANALYZED_QS__QS:
				setQs((QScenario)null);
				return;
			case Accordant_rqPackage.ANALYZED_QS__REASONING:
				setReasoning(REASONING_EDEFAULT);
				return;
			case Accordant_rqPackage.ANALYZED_QS__NAME:
				setName(NAME_EDEFAULT);
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
			case Accordant_rqPackage.ANALYZED_QS__SPOINTS:
				return sPoints != null;
			case Accordant_rqPackage.ANALYZED_QS__QS:
				return qs != null;
			case Accordant_rqPackage.ANALYZED_QS__REASONING:
				return REASONING_EDEFAULT == null ? reasoning != null : !REASONING_EDEFAULT.equals(reasoning);
			case Accordant_rqPackage.ANALYZED_QS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AnalyzedQSImpl
