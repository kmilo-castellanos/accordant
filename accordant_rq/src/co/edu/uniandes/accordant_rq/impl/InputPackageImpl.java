/**
 */
package co.edu.uniandes.accordant_rq.impl;

import co.edu.uniandes.accordant_rq.Accordant_rqPackage;
import co.edu.uniandes.accordant_rq.AnalyzedQS;
import co.edu.uniandes.accordant_rq.Constraint;
import co.edu.uniandes.accordant_rq.InputPackage;
import co.edu.uniandes.accordant_rq.QScenario;

import co.edu.uniandes.accordant_rq.Tactic;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.InputPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.InputPackageImpl#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.InputPackageImpl#getTactics <em>Tactics</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.InputPackageImpl#getAnalyzedQs <em>Analyzed Qs</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_rq.impl.InputPackageImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputPackageImpl extends MinimalEObjectImpl.Container implements InputPackage {
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
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<QScenario> scenarios;

	/**
	 * The cached value of the '{@link #getTactics() <em>Tactics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTactics()
	 * @generated
	 * @ordered
	 */
	protected EList<Tactic> tactics;

	/**
	 * The cached value of the '{@link #getAnalyzedQs() <em>Analyzed Qs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyzedQs()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalyzedQS> analyzedQs;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_rqPackage.Literals.INPUT_PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.INPUT_PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QScenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentEList<QScenario>(QScenario.class, this, Accordant_rqPackage.INPUT_PACKAGE__SCENARIOS);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tactic> getTactics() {
		if (tactics == null) {
			tactics = new EObjectContainmentEList<Tactic>(Tactic.class, this, Accordant_rqPackage.INPUT_PACKAGE__TACTICS);
		}
		return tactics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalyzedQS> getAnalyzedQs() {
		if (analyzedQs == null) {
			analyzedQs = new EObjectContainmentEList<AnalyzedQS>(AnalyzedQS.class, this, Accordant_rqPackage.INPUT_PACKAGE__ANALYZED_QS);
		}
		return analyzedQs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, Accordant_rqPackage.INPUT_PACKAGE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Accordant_rqPackage.INPUT_PACKAGE__SCENARIOS:
				return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
			case Accordant_rqPackage.INPUT_PACKAGE__TACTICS:
				return ((InternalEList<?>)getTactics()).basicRemove(otherEnd, msgs);
			case Accordant_rqPackage.INPUT_PACKAGE__ANALYZED_QS:
				return ((InternalEList<?>)getAnalyzedQs()).basicRemove(otherEnd, msgs);
			case Accordant_rqPackage.INPUT_PACKAGE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case Accordant_rqPackage.INPUT_PACKAGE__NAME:
				return getName();
			case Accordant_rqPackage.INPUT_PACKAGE__SCENARIOS:
				return getScenarios();
			case Accordant_rqPackage.INPUT_PACKAGE__TACTICS:
				return getTactics();
			case Accordant_rqPackage.INPUT_PACKAGE__ANALYZED_QS:
				return getAnalyzedQs();
			case Accordant_rqPackage.INPUT_PACKAGE__CONSTRAINTS:
				return getConstraints();
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
			case Accordant_rqPackage.INPUT_PACKAGE__NAME:
				setName((String)newValue);
				return;
			case Accordant_rqPackage.INPUT_PACKAGE__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends QScenario>)newValue);
				return;
			case Accordant_rqPackage.INPUT_PACKAGE__TACTICS:
				getTactics().clear();
				getTactics().addAll((Collection<? extends Tactic>)newValue);
				return;
			case Accordant_rqPackage.INPUT_PACKAGE__ANALYZED_QS:
				getAnalyzedQs().clear();
				getAnalyzedQs().addAll((Collection<? extends AnalyzedQS>)newValue);
				return;
			case Accordant_rqPackage.INPUT_PACKAGE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
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
			case Accordant_rqPackage.INPUT_PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Accordant_rqPackage.INPUT_PACKAGE__SCENARIOS:
				getScenarios().clear();
				return;
			case Accordant_rqPackage.INPUT_PACKAGE__TACTICS:
				getTactics().clear();
				return;
			case Accordant_rqPackage.INPUT_PACKAGE__ANALYZED_QS:
				getAnalyzedQs().clear();
				return;
			case Accordant_rqPackage.INPUT_PACKAGE__CONSTRAINTS:
				getConstraints().clear();
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
			case Accordant_rqPackage.INPUT_PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Accordant_rqPackage.INPUT_PACKAGE__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
			case Accordant_rqPackage.INPUT_PACKAGE__TACTICS:
				return tactics != null && !tactics.isEmpty();
			case Accordant_rqPackage.INPUT_PACKAGE__ANALYZED_QS:
				return analyzedQs != null && !analyzedQs.isEmpty();
			case Accordant_rqPackage.INPUT_PACKAGE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //InputPackageImpl
