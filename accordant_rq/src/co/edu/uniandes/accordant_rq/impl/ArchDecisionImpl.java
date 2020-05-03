/**
 */
package co.edu.uniandes.accordant_rq.impl;

import co.edu.uniandes.accordant_rq.Accordant_rqPackage;
import co.edu.uniandes.accordant_rq.AnalyzedQS;
import co.edu.uniandes.accordant_rq.ArchDecision;
import co.edu.uniandes.accordant_rq.Tactic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arch Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.ArchDecisionImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.ArchDecisionImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.ArchDecisionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.ArchDecisionImpl#getAppliedTactics <em>Applied Tactics</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.ArchDecisionImpl#isIsRisk <em>Is Risk</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.ArchDecisionImpl#isIsSensitivityPoint <em>Is Sensitivity Point</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.ArchDecisionImpl#getAqs <em>Aqs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchDecisionImpl extends MinimalEObjectImpl.Container implements ArchDecision {
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
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected String rationale = RATIONALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAppliedTactics() <em>Applied Tactics</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedTactics()
	 * @generated
	 * @ordered
	 */
	protected EList<Tactic> appliedTactics;

	/**
	 * The default value of the '{@link #isIsRisk() <em>Is Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRisk()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RISK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRisk() <em>Is Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRisk()
	 * @generated
	 * @ordered
	 */
	protected boolean isRisk = IS_RISK_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSensitivityPoint() <em>Is Sensitivity Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSensitivityPoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SENSITIVITY_POINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSensitivityPoint() <em>Is Sensitivity Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSensitivityPoint()
	 * @generated
	 * @ordered
	 */
	protected boolean isSensitivityPoint = IS_SENSITIVITY_POINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchDecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_rqPackage.Literals.ARCH_DECISION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.ARCH_DECISION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRationale(String newRationale) {
		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.ARCH_DECISION__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.ARCH_DECISION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tactic> getAppliedTactics() {
		if (appliedTactics == null) {
			appliedTactics = new EObjectResolvingEList<Tactic>(Tactic.class, this, Accordant_rqPackage.ARCH_DECISION__APPLIED_TACTICS);
		}
		return appliedTactics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsRisk() {
		return isRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRisk(boolean newIsRisk) {
		boolean oldIsRisk = isRisk;
		isRisk = newIsRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.ARCH_DECISION__IS_RISK, oldIsRisk, isRisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSensitivityPoint() {
		return isSensitivityPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSensitivityPoint(boolean newIsSensitivityPoint) {
		boolean oldIsSensitivityPoint = isSensitivityPoint;
		isSensitivityPoint = newIsSensitivityPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.ARCH_DECISION__IS_SENSITIVITY_POINT, oldIsSensitivityPoint, isSensitivityPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalyzedQS getAqs() {
		if (eContainerFeatureID() != Accordant_rqPackage.ARCH_DECISION__AQS) return null;
		return (AnalyzedQS)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAqs(AnalyzedQS newAqs, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAqs, Accordant_rqPackage.ARCH_DECISION__AQS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAqs(AnalyzedQS newAqs) {
		if (newAqs != eInternalContainer() || (eContainerFeatureID() != Accordant_rqPackage.ARCH_DECISION__AQS && newAqs != null)) {
			if (EcoreUtil.isAncestor(this, newAqs))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAqs != null)
				msgs = ((InternalEObject)newAqs).eInverseAdd(this, Accordant_rqPackage.ANALYZED_QS__DECISIONS, AnalyzedQS.class, msgs);
			msgs = basicSetAqs(newAqs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.ARCH_DECISION__AQS, newAqs, newAqs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Accordant_rqPackage.ARCH_DECISION__AQS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAqs((AnalyzedQS)otherEnd, msgs);
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
			case Accordant_rqPackage.ARCH_DECISION__AQS:
				return basicSetAqs(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Accordant_rqPackage.ARCH_DECISION__AQS:
				return eInternalContainer().eInverseRemove(this, Accordant_rqPackage.ANALYZED_QS__DECISIONS, AnalyzedQS.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Accordant_rqPackage.ARCH_DECISION__NAME:
				return getName();
			case Accordant_rqPackage.ARCH_DECISION__RATIONALE:
				return getRationale();
			case Accordant_rqPackage.ARCH_DECISION__CODE:
				return getCode();
			case Accordant_rqPackage.ARCH_DECISION__APPLIED_TACTICS:
				return getAppliedTactics();
			case Accordant_rqPackage.ARCH_DECISION__IS_RISK:
				return isIsRisk();
			case Accordant_rqPackage.ARCH_DECISION__IS_SENSITIVITY_POINT:
				return isIsSensitivityPoint();
			case Accordant_rqPackage.ARCH_DECISION__AQS:
				return getAqs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Accordant_rqPackage.ARCH_DECISION__NAME:
				setName((String)newValue);
				return;
			case Accordant_rqPackage.ARCH_DECISION__RATIONALE:
				setRationale((String)newValue);
				return;
			case Accordant_rqPackage.ARCH_DECISION__CODE:
				setCode((String)newValue);
				return;
			case Accordant_rqPackage.ARCH_DECISION__APPLIED_TACTICS:
				getAppliedTactics().clear();
				getAppliedTactics().addAll((Collection<? extends Tactic>)newValue);
				return;
			case Accordant_rqPackage.ARCH_DECISION__IS_RISK:
				setIsRisk((Boolean)newValue);
				return;
			case Accordant_rqPackage.ARCH_DECISION__IS_SENSITIVITY_POINT:
				setIsSensitivityPoint((Boolean)newValue);
				return;
			case Accordant_rqPackage.ARCH_DECISION__AQS:
				setAqs((AnalyzedQS)newValue);
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
			case Accordant_rqPackage.ARCH_DECISION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Accordant_rqPackage.ARCH_DECISION__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
			case Accordant_rqPackage.ARCH_DECISION__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case Accordant_rqPackage.ARCH_DECISION__APPLIED_TACTICS:
				getAppliedTactics().clear();
				return;
			case Accordant_rqPackage.ARCH_DECISION__IS_RISK:
				setIsRisk(IS_RISK_EDEFAULT);
				return;
			case Accordant_rqPackage.ARCH_DECISION__IS_SENSITIVITY_POINT:
				setIsSensitivityPoint(IS_SENSITIVITY_POINT_EDEFAULT);
				return;
			case Accordant_rqPackage.ARCH_DECISION__AQS:
				setAqs((AnalyzedQS)null);
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
			case Accordant_rqPackage.ARCH_DECISION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Accordant_rqPackage.ARCH_DECISION__RATIONALE:
				return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
			case Accordant_rqPackage.ARCH_DECISION__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case Accordant_rqPackage.ARCH_DECISION__APPLIED_TACTICS:
				return appliedTactics != null && !appliedTactics.isEmpty();
			case Accordant_rqPackage.ARCH_DECISION__IS_RISK:
				return isRisk != IS_RISK_EDEFAULT;
			case Accordant_rqPackage.ARCH_DECISION__IS_SENSITIVITY_POINT:
				return isSensitivityPoint != IS_SENSITIVITY_POINT_EDEFAULT;
			case Accordant_rqPackage.ARCH_DECISION__AQS:
				return getAqs() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(", code: ");
		result.append(code);
		result.append(", isRisk: ");
		result.append(isRisk);
		result.append(", isSensitivityPoint: ");
		result.append(isSensitivityPoint);
		result.append(')');
		return result.toString();
	}

} //ArchDecisionImpl
