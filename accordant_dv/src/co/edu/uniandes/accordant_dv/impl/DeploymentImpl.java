/**
 */
package co.edu.uniandes.accordant_dv.impl;

import co.edu.uniandes.accordant_dv.Accordant_dvPackage;
import co.edu.uniandes.accordant_dv.Deployment;
import co.edu.uniandes.accordant_dv.Pod;

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
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl#getMaxSurge <em>Max Surge</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl#getMaxUnavail <em>Max Unavail</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl#getPods <em>Pods</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentImpl#getStrategy <em>Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment {
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
	 * The default value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLICAS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected int replicas = REPLICAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSurge() <em>Max Surge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSurge()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SURGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxSurge() <em>Max Surge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSurge()
	 * @generated
	 * @ordered
	 */
	protected int maxSurge = MAX_SURGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxUnavail() <em>Max Unavail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnavail()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_UNAVAIL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxUnavail() <em>Max Unavail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnavail()
	 * @generated
	 * @ordered
	 */
	protected int maxUnavail = MAX_UNAVAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPods() <em>Pods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPods()
	 * @generated
	 * @ordered
	 */
	protected EList<Pod> pods;

	/**
	 * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected String strategy = STRATEGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_dvPackage.Literals.DEPLOYMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.DEPLOYMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReplicas() {
		return replicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplicas(int newReplicas) {
		int oldReplicas = replicas;
		replicas = newReplicas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.DEPLOYMENT__REPLICAS, oldReplicas, replicas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxSurge() {
		return maxSurge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSurge(int newMaxSurge) {
		int oldMaxSurge = maxSurge;
		maxSurge = newMaxSurge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.DEPLOYMENT__MAX_SURGE, oldMaxSurge, maxSurge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxUnavail() {
		return maxUnavail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxUnavail(int newMaxUnavail) {
		int oldMaxUnavail = maxUnavail;
		maxUnavail = newMaxUnavail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.DEPLOYMENT__MAX_UNAVAIL, oldMaxUnavail, maxUnavail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pod> getPods() {
		if (pods == null) {
			pods = new EObjectContainmentEList<Pod>(Pod.class, this, Accordant_dvPackage.DEPLOYMENT__PODS);
		}
		return pods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(String newStrategy) {
		String oldStrategy = strategy;
		strategy = newStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.DEPLOYMENT__STRATEGY, oldStrategy, strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Accordant_dvPackage.DEPLOYMENT__PODS:
				return ((InternalEList<?>)getPods()).basicRemove(otherEnd, msgs);
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
			case Accordant_dvPackage.DEPLOYMENT__NAME:
				return getName();
			case Accordant_dvPackage.DEPLOYMENT__REPLICAS:
				return getReplicas();
			case Accordant_dvPackage.DEPLOYMENT__MAX_SURGE:
				return getMaxSurge();
			case Accordant_dvPackage.DEPLOYMENT__MAX_UNAVAIL:
				return getMaxUnavail();
			case Accordant_dvPackage.DEPLOYMENT__PODS:
				return getPods();
			case Accordant_dvPackage.DEPLOYMENT__STRATEGY:
				return getStrategy();
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
			case Accordant_dvPackage.DEPLOYMENT__NAME:
				setName((String)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT__REPLICAS:
				setReplicas((Integer)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT__MAX_SURGE:
				setMaxSurge((Integer)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT__MAX_UNAVAIL:
				setMaxUnavail((Integer)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT__PODS:
				getPods().clear();
				getPods().addAll((Collection<? extends Pod>)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT__STRATEGY:
				setStrategy((String)newValue);
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
			case Accordant_dvPackage.DEPLOYMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Accordant_dvPackage.DEPLOYMENT__REPLICAS:
				setReplicas(REPLICAS_EDEFAULT);
				return;
			case Accordant_dvPackage.DEPLOYMENT__MAX_SURGE:
				setMaxSurge(MAX_SURGE_EDEFAULT);
				return;
			case Accordant_dvPackage.DEPLOYMENT__MAX_UNAVAIL:
				setMaxUnavail(MAX_UNAVAIL_EDEFAULT);
				return;
			case Accordant_dvPackage.DEPLOYMENT__PODS:
				getPods().clear();
				return;
			case Accordant_dvPackage.DEPLOYMENT__STRATEGY:
				setStrategy(STRATEGY_EDEFAULT);
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
			case Accordant_dvPackage.DEPLOYMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Accordant_dvPackage.DEPLOYMENT__REPLICAS:
				return replicas != REPLICAS_EDEFAULT;
			case Accordant_dvPackage.DEPLOYMENT__MAX_SURGE:
				return maxSurge != MAX_SURGE_EDEFAULT;
			case Accordant_dvPackage.DEPLOYMENT__MAX_UNAVAIL:
				return maxUnavail != MAX_UNAVAIL_EDEFAULT;
			case Accordant_dvPackage.DEPLOYMENT__PODS:
				return pods != null && !pods.isEmpty();
			case Accordant_dvPackage.DEPLOYMENT__STRATEGY:
				return STRATEGY_EDEFAULT == null ? strategy != null : !STRATEGY_EDEFAULT.equals(strategy);
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
		result.append(", replicas: ");
		result.append(replicas);
		result.append(", maxSurge: ");
		result.append(maxSurge);
		result.append(", maxUnavail: ");
		result.append(maxUnavail);
		result.append(", strategy: ");
		result.append(strategy);
		result.append(')');
		return result.toString();
	}

} //DeploymentImpl
