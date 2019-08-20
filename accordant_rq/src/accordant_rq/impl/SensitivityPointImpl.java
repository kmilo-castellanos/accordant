/**
 */
package accordant_rq.impl;

import accordant_rq.Accordant_rqPackage;
import accordant_rq.SensitivityPoint;
import accordant_rq.Tactic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensitivity Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accordant_rq.impl.SensitivityPointImpl#getName <em>Name</em>}</li>
 *   <li>{@link accordant_rq.impl.SensitivityPointImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link accordant_rq.impl.SensitivityPointImpl#getCode <em>Code</em>}</li>
 *   <li>{@link accordant_rq.impl.SensitivityPointImpl#getTactic <em>Tactic</em>}</li>
 *   <li>{@link accordant_rq.impl.SensitivityPointImpl#isIsRisk <em>Is Risk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensitivityPointImpl extends MinimalEObjectImpl.Container implements SensitivityPoint {
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
	 * The cached value of the '{@link #getTactic() <em>Tactic</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTactic()
	 * @generated
	 * @ordered
	 */
	protected EList<Tactic> tactic;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensitivityPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_rqPackage.Literals.SENSITIVITY_POINT;
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
			eNotify(
					new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.SENSITIVITY_POINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(String newRationale) {
		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.SENSITIVITY_POINT__RATIONALE,
					oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(
					new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.SENSITIVITY_POINT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tactic> getTactic() {
		if (tactic == null) {
			tactic = new EObjectWithInverseResolvingEList.ManyInverse<Tactic>(Tactic.class, this,
					Accordant_rqPackage.SENSITIVITY_POINT__TACTIC, Accordant_rqPackage.TACTIC__SPOINT);
		}
		return tactic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRisk() {
		return isRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRisk(boolean newIsRisk) {
		boolean oldIsRisk = isRisk;
		isRisk = newIsRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.SENSITIVITY_POINT__IS_RISK, oldIsRisk,
					isRisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Accordant_rqPackage.SENSITIVITY_POINT__TACTIC:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTactic()).basicAdd(otherEnd, msgs);
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
		case Accordant_rqPackage.SENSITIVITY_POINT__TACTIC:
			return ((InternalEList<?>) getTactic()).basicRemove(otherEnd, msgs);
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
		case Accordant_rqPackage.SENSITIVITY_POINT__NAME:
			return getName();
		case Accordant_rqPackage.SENSITIVITY_POINT__RATIONALE:
			return getRationale();
		case Accordant_rqPackage.SENSITIVITY_POINT__CODE:
			return getCode();
		case Accordant_rqPackage.SENSITIVITY_POINT__TACTIC:
			return getTactic();
		case Accordant_rqPackage.SENSITIVITY_POINT__IS_RISK:
			return isIsRisk();
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
		case Accordant_rqPackage.SENSITIVITY_POINT__NAME:
			setName((String) newValue);
			return;
		case Accordant_rqPackage.SENSITIVITY_POINT__RATIONALE:
			setRationale((String) newValue);
			return;
		case Accordant_rqPackage.SENSITIVITY_POINT__CODE:
			setCode((String) newValue);
			return;
		case Accordant_rqPackage.SENSITIVITY_POINT__TACTIC:
			getTactic().clear();
			getTactic().addAll((Collection<? extends Tactic>) newValue);
			return;
		case Accordant_rqPackage.SENSITIVITY_POINT__IS_RISK:
			setIsRisk((Boolean) newValue);
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
		case Accordant_rqPackage.SENSITIVITY_POINT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Accordant_rqPackage.SENSITIVITY_POINT__RATIONALE:
			setRationale(RATIONALE_EDEFAULT);
			return;
		case Accordant_rqPackage.SENSITIVITY_POINT__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case Accordant_rqPackage.SENSITIVITY_POINT__TACTIC:
			getTactic().clear();
			return;
		case Accordant_rqPackage.SENSITIVITY_POINT__IS_RISK:
			setIsRisk(IS_RISK_EDEFAULT);
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
		case Accordant_rqPackage.SENSITIVITY_POINT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Accordant_rqPackage.SENSITIVITY_POINT__RATIONALE:
			return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
		case Accordant_rqPackage.SENSITIVITY_POINT__CODE:
			return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
		case Accordant_rqPackage.SENSITIVITY_POINT__TACTIC:
			return tactic != null && !tactic.isEmpty();
		case Accordant_rqPackage.SENSITIVITY_POINT__IS_RISK:
			return isRisk != IS_RISK_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(", code: ");
		result.append(code);
		result.append(", isRisk: ");
		result.append(isRisk);
		result.append(')');
		return result.toString();
	}

} //SensitivityPointImpl
