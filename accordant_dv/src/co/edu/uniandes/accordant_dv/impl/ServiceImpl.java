/**
 */
package co.edu.uniandes.accordant_dv.impl;

import co.edu.uniandes.accordant_dv.Accordant_dvPackage;
import co.edu.uniandes.accordant_dv.DeploymentView;
import co.edu.uniandes.accordant_dv.ExposedPort;
import co.edu.uniandes.accordant_dv.Pod;
import co.edu.uniandes.accordant_dv.Service;

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
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ServiceImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ServiceImpl#getType <em>Type</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ServiceImpl#getExtAccess <em>Ext Access</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ServiceImpl#getDv <em>Dv</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ServiceImpl#getPod <em>Pod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
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
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ExposedPort> ports;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtAccess() <em>Ext Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String EXT_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtAccess() <em>Ext Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtAccess()
	 * @generated
	 * @ordered
	 */
	protected String extAccess = EXT_ACCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPod() <em>Pod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPod()
	 * @generated
	 * @ordered
	 */
	protected Pod pod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_dvPackage.Literals.SERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExposedPort> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentWithInverseEList<ExposedPort>(ExposedPort.class, this, Accordant_dvPackage.SERVICE__PORTS, Accordant_dvPackage.EXPOSED_PORT__SERVICE);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.SERVICE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtAccess() {
		return extAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtAccess(String newExtAccess) {
		String oldExtAccess = extAccess;
		extAccess = newExtAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.SERVICE__EXT_ACCESS, oldExtAccess, extAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentView getDv() {
		if (eContainerFeatureID() != Accordant_dvPackage.SERVICE__DV) return null;
		return (DeploymentView)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDv(DeploymentView newDv, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDv, Accordant_dvPackage.SERVICE__DV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDv(DeploymentView newDv) {
		if (newDv != eInternalContainer() || (eContainerFeatureID() != Accordant_dvPackage.SERVICE__DV && newDv != null)) {
			if (EcoreUtil.isAncestor(this, newDv))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDv != null)
				msgs = ((InternalEObject)newDv).eInverseAdd(this, Accordant_dvPackage.DEPLOYMENT_VIEW__SERVICES, DeploymentView.class, msgs);
			msgs = basicSetDv(newDv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.SERVICE__DV, newDv, newDv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pod getPod() {
		if (pod != null && pod.eIsProxy()) {
			InternalEObject oldPod = (InternalEObject)pod;
			pod = (Pod)eResolveProxy(oldPod);
			if (pod != oldPod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Accordant_dvPackage.SERVICE__POD, oldPod, pod));
			}
		}
		return pod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pod basicGetPod() {
		return pod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPod(Pod newPod, NotificationChain msgs) {
		Pod oldPod = pod;
		pod = newPod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.SERVICE__POD, oldPod, newPod);
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
	public void setPod(Pod newPod) {
		if (newPod != pod) {
			NotificationChain msgs = null;
			if (pod != null)
				msgs = ((InternalEObject)pod).eInverseRemove(this, Accordant_dvPackage.POD__SERVICE, Pod.class, msgs);
			if (newPod != null)
				msgs = ((InternalEObject)newPod).eInverseAdd(this, Accordant_dvPackage.POD__SERVICE, Pod.class, msgs);
			msgs = basicSetPod(newPod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.SERVICE__POD, newPod, newPod));
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
			case Accordant_dvPackage.SERVICE__PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPorts()).basicAdd(otherEnd, msgs);
			case Accordant_dvPackage.SERVICE__DV:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDv((DeploymentView)otherEnd, msgs);
			case Accordant_dvPackage.SERVICE__POD:
				if (pod != null)
					msgs = ((InternalEObject)pod).eInverseRemove(this, Accordant_dvPackage.POD__SERVICE, Pod.class, msgs);
				return basicSetPod((Pod)otherEnd, msgs);
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
			case Accordant_dvPackage.SERVICE__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case Accordant_dvPackage.SERVICE__DV:
				return basicSetDv(null, msgs);
			case Accordant_dvPackage.SERVICE__POD:
				return basicSetPod(null, msgs);
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
			case Accordant_dvPackage.SERVICE__DV:
				return eInternalContainer().eInverseRemove(this, Accordant_dvPackage.DEPLOYMENT_VIEW__SERVICES, DeploymentView.class, msgs);
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
			case Accordant_dvPackage.SERVICE__NAME:
				return getName();
			case Accordant_dvPackage.SERVICE__PORTS:
				return getPorts();
			case Accordant_dvPackage.SERVICE__TYPE:
				return getType();
			case Accordant_dvPackage.SERVICE__EXT_ACCESS:
				return getExtAccess();
			case Accordant_dvPackage.SERVICE__DV:
				return getDv();
			case Accordant_dvPackage.SERVICE__POD:
				if (resolve) return getPod();
				return basicGetPod();
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
			case Accordant_dvPackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case Accordant_dvPackage.SERVICE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends ExposedPort>)newValue);
				return;
			case Accordant_dvPackage.SERVICE__TYPE:
				setType((String)newValue);
				return;
			case Accordant_dvPackage.SERVICE__EXT_ACCESS:
				setExtAccess((String)newValue);
				return;
			case Accordant_dvPackage.SERVICE__DV:
				setDv((DeploymentView)newValue);
				return;
			case Accordant_dvPackage.SERVICE__POD:
				setPod((Pod)newValue);
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
			case Accordant_dvPackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Accordant_dvPackage.SERVICE__PORTS:
				getPorts().clear();
				return;
			case Accordant_dvPackage.SERVICE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Accordant_dvPackage.SERVICE__EXT_ACCESS:
				setExtAccess(EXT_ACCESS_EDEFAULT);
				return;
			case Accordant_dvPackage.SERVICE__DV:
				setDv((DeploymentView)null);
				return;
			case Accordant_dvPackage.SERVICE__POD:
				setPod((Pod)null);
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
			case Accordant_dvPackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Accordant_dvPackage.SERVICE__PORTS:
				return ports != null && !ports.isEmpty();
			case Accordant_dvPackage.SERVICE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case Accordant_dvPackage.SERVICE__EXT_ACCESS:
				return EXT_ACCESS_EDEFAULT == null ? extAccess != null : !EXT_ACCESS_EDEFAULT.equals(extAccess);
			case Accordant_dvPackage.SERVICE__DV:
				return getDv() != null;
			case Accordant_dvPackage.SERVICE__POD:
				return pod != null;
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
		result.append(", type: ");
		result.append(type);
		result.append(", extAccess: ");
		result.append(extAccess);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
