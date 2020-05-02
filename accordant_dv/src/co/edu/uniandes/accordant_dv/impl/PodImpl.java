/**
 */
package co.edu.uniandes.accordant_dv.impl;

import co.edu.uniandes.accordant_dv.Accordant_dvPackage;
import co.edu.uniandes.accordant_dv.Deployment;
import co.edu.uniandes.accordant_dv.Device;
import co.edu.uniandes.accordant_dv.ExecEnvironment;
import co.edu.uniandes.accordant_dv.Pod;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.PodImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.PodImpl#getHost <em>Host</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.PodImpl#getRestartPolicy <em>Restart Policy</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.PodImpl#getEnvs <em>Envs</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.PodImpl#getNode <em>Node</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.PodImpl#getDeplOwner <em>Depl Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PodImpl extends MinimalEObjectImpl.Container implements Pod {
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
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestartPolicy() <em>Restart Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTART_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestartPolicy() <em>Restart Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartPolicy()
	 * @generated
	 * @ordered
	 */
	protected String restartPolicy = RESTART_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnvs() <em>Envs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvs()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecEnvironment> envs;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected Device node;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_dvPackage.Literals.POD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.POD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.POD__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRestartPolicy() {
		return restartPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestartPolicy(String newRestartPolicy) {
		String oldRestartPolicy = restartPolicy;
		restartPolicy = newRestartPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.POD__RESTART_POLICY, oldRestartPolicy, restartPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExecEnvironment> getEnvs() {
		if (envs == null) {
			envs = new EObjectContainmentWithInverseEList<ExecEnvironment>(ExecEnvironment.class, this, Accordant_dvPackage.POD__ENVS, Accordant_dvPackage.EXEC_ENVIRONMENT__POD_OWNER);
		}
		return envs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Device getNode() {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject)node;
			node = (Device)eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Accordant_dvPackage.POD__NODE, oldNode, node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(Device newNode, NotificationChain msgs) {
		Device oldNode = node;
		node = newNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.POD__NODE, oldNode, newNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNode(Device newNode) {
		if (newNode != node) {
			NotificationChain msgs = null;
			if (node != null)
				msgs = ((InternalEObject)node).eInverseRemove(this, Accordant_dvPackage.DEVICE__PODS, Device.class, msgs);
			if (newNode != null)
				msgs = ((InternalEObject)newNode).eInverseAdd(this, Accordant_dvPackage.DEVICE__PODS, Device.class, msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.POD__NODE, newNode, newNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deployment getDeplOwner() {
		if (eContainerFeatureID() != Accordant_dvPackage.POD__DEPL_OWNER) return null;
		return (Deployment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeplOwner(Deployment newDeplOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDeplOwner, Accordant_dvPackage.POD__DEPL_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeplOwner(Deployment newDeplOwner) {
		if (newDeplOwner != eInternalContainer() || (eContainerFeatureID() != Accordant_dvPackage.POD__DEPL_OWNER && newDeplOwner != null)) {
			if (EcoreUtil.isAncestor(this, newDeplOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeplOwner != null)
				msgs = ((InternalEObject)newDeplOwner).eInverseAdd(this, Accordant_dvPackage.DEPLOYMENT__PODS, Deployment.class, msgs);
			msgs = basicSetDeplOwner(newDeplOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.POD__DEPL_OWNER, newDeplOwner, newDeplOwner));
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
			case Accordant_dvPackage.POD__ENVS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnvs()).basicAdd(otherEnd, msgs);
			case Accordant_dvPackage.POD__NODE:
				if (node != null)
					msgs = ((InternalEObject)node).eInverseRemove(this, Accordant_dvPackage.DEVICE__PODS, Device.class, msgs);
				return basicSetNode((Device)otherEnd, msgs);
			case Accordant_dvPackage.POD__DEPL_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDeplOwner((Deployment)otherEnd, msgs);
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
			case Accordant_dvPackage.POD__ENVS:
				return ((InternalEList<?>)getEnvs()).basicRemove(otherEnd, msgs);
			case Accordant_dvPackage.POD__NODE:
				return basicSetNode(null, msgs);
			case Accordant_dvPackage.POD__DEPL_OWNER:
				return basicSetDeplOwner(null, msgs);
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
			case Accordant_dvPackage.POD__DEPL_OWNER:
				return eInternalContainer().eInverseRemove(this, Accordant_dvPackage.DEPLOYMENT__PODS, Deployment.class, msgs);
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
			case Accordant_dvPackage.POD__NAME:
				return getName();
			case Accordant_dvPackage.POD__HOST:
				return getHost();
			case Accordant_dvPackage.POD__RESTART_POLICY:
				return getRestartPolicy();
			case Accordant_dvPackage.POD__ENVS:
				return getEnvs();
			case Accordant_dvPackage.POD__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case Accordant_dvPackage.POD__DEPL_OWNER:
				return getDeplOwner();
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
			case Accordant_dvPackage.POD__NAME:
				setName((String)newValue);
				return;
			case Accordant_dvPackage.POD__HOST:
				setHost((String)newValue);
				return;
			case Accordant_dvPackage.POD__RESTART_POLICY:
				setRestartPolicy((String)newValue);
				return;
			case Accordant_dvPackage.POD__ENVS:
				getEnvs().clear();
				getEnvs().addAll((Collection<? extends ExecEnvironment>)newValue);
				return;
			case Accordant_dvPackage.POD__NODE:
				setNode((Device)newValue);
				return;
			case Accordant_dvPackage.POD__DEPL_OWNER:
				setDeplOwner((Deployment)newValue);
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
			case Accordant_dvPackage.POD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Accordant_dvPackage.POD__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case Accordant_dvPackage.POD__RESTART_POLICY:
				setRestartPolicy(RESTART_POLICY_EDEFAULT);
				return;
			case Accordant_dvPackage.POD__ENVS:
				getEnvs().clear();
				return;
			case Accordant_dvPackage.POD__NODE:
				setNode((Device)null);
				return;
			case Accordant_dvPackage.POD__DEPL_OWNER:
				setDeplOwner((Deployment)null);
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
			case Accordant_dvPackage.POD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Accordant_dvPackage.POD__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case Accordant_dvPackage.POD__RESTART_POLICY:
				return RESTART_POLICY_EDEFAULT == null ? restartPolicy != null : !RESTART_POLICY_EDEFAULT.equals(restartPolicy);
			case Accordant_dvPackage.POD__ENVS:
				return envs != null && !envs.isEmpty();
			case Accordant_dvPackage.POD__NODE:
				return node != null;
			case Accordant_dvPackage.POD__DEPL_OWNER:
				return getDeplOwner() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", host: ");
		result.append(host);
		result.append(", restartPolicy: ");
		result.append(restartPolicy);
		result.append(')');
		return result.toString();
	}

} //PodImpl
