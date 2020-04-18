/**
 */
package co.edu.uniandes.accordant_fv.impl;

import co.edu.uniandes.accordant_fv.Accordant_fvPackage;
import co.edu.uniandes.accordant_fv.Buffering;
import co.edu.uniandes.accordant_fv.Connector;
import co.edu.uniandes.accordant_fv.DeliveryGuarantee;
import co.edu.uniandes.accordant_fv.NotificationModel;
import co.edu.uniandes.accordant_fv.Role;
import co.edu.uniandes.accordant_fv.SyncType;
import co.edu.uniandes.accordant_fv.Throughput;

import co.edu.uniandes.accordant_rq.ArchDecision;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.ConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.ConnectorImpl#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.ConnectorImpl#getSynct <em>Synct</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.ConnectorImpl#getNotification <em>Notification</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.ConnectorImpl#getBuffering <em>Buffering</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.ConnectorImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.ConnectorImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.ConnectorImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.ConnectorImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.ConnectorImpl#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
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
	 * The default value of the '{@link #getDelivery() <em>Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelivery()
	 * @generated
	 * @ordered
	 */
	protected static final DeliveryGuarantee DELIVERY_EDEFAULT = DeliveryGuarantee.BEST_EFFORT;

	/**
	 * The cached value of the '{@link #getDelivery() <em>Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelivery()
	 * @generated
	 * @ordered
	 */
	protected DeliveryGuarantee delivery = DELIVERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSynct() <em>Synct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynct()
	 * @generated
	 * @ordered
	 */
	protected static final SyncType SYNCT_EDEFAULT = SyncType.ASYNC;

	/**
	 * The cached value of the '{@link #getSynct() <em>Synct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynct()
	 * @generated
	 * @ordered
	 */
	protected SyncType synct = SYNCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotification() <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification()
	 * @generated
	 * @ordered
	 */
	protected static final NotificationModel NOTIFICATION_EDEFAULT = NotificationModel.POLLED;

	/**
	 * The cached value of the '{@link #getNotification() <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification()
	 * @generated
	 * @ordered
	 */
	protected NotificationModel notification = NOTIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuffering() <em>Buffering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffering()
	 * @generated
	 * @ordered
	 */
	protected static final Buffering BUFFERING_EDEFAULT = Buffering.BUFFERED;

	/**
	 * The cached value of the '{@link #getBuffering() <em>Buffering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffering()
	 * @generated
	 * @ordered
	 */
	protected Buffering buffering = BUFFERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final Throughput THROUGHPUT_EDEFAULT = Throughput.ATOMIC;

	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected Throughput throughput = THROUGHPUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecision() <em>Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecision()
	 * @generated
	 * @ordered
	 */
	protected ArchDecision decision;

	/**
	 * The default value of the '{@link #getProps() <em>Props</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProps()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProps() <em>Props</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProps()
	 * @generated
	 * @ordered
	 */
	protected String props = PROPS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_fvPackage.Literals.CONNECTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.CONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryGuarantee getDelivery() {
		return delivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelivery(DeliveryGuarantee newDelivery) {
		DeliveryGuarantee oldDelivery = delivery;
		delivery = newDelivery == null ? DELIVERY_EDEFAULT : newDelivery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.CONNECTOR__DELIVERY, oldDelivery, delivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncType getSynct() {
		return synct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynct(SyncType newSynct) {
		SyncType oldSynct = synct;
		synct = newSynct == null ? SYNCT_EDEFAULT : newSynct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.CONNECTOR__SYNCT, oldSynct, synct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationModel getNotification() {
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotification(NotificationModel newNotification) {
		NotificationModel oldNotification = notification;
		notification = newNotification == null ? NOTIFICATION_EDEFAULT : newNotification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.CONNECTOR__NOTIFICATION, oldNotification, notification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffering getBuffering() {
		return buffering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuffering(Buffering newBuffering) {
		Buffering oldBuffering = buffering;
		buffering = newBuffering == null ? BUFFERING_EDEFAULT : newBuffering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.CONNECTOR__BUFFERING, oldBuffering, buffering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throughput getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(Throughput newThroughput) {
		Throughput oldThroughput = throughput;
		throughput = newThroughput == null ? THROUGHPUT_EDEFAULT : newThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.CONNECTOR__THROUGHPUT, oldThroughput, throughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentWithInverseEList<Role>(Role.class, this, Accordant_fvPackage.CONNECTOR__ROLES, Accordant_fvPackage.ROLE__CONN);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.CONNECTOR__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchDecision getDecision() {
		if (decision != null && decision.eIsProxy()) {
			InternalEObject oldDecision = (InternalEObject)decision;
			decision = (ArchDecision)eResolveProxy(oldDecision);
			if (decision != oldDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Accordant_fvPackage.CONNECTOR__DECISION, oldDecision, decision));
			}
		}
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchDecision basicGetDecision() {
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecision(ArchDecision newDecision) {
		ArchDecision oldDecision = decision;
		decision = newDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.CONNECTOR__DECISION, oldDecision, decision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProps() {
		return props;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProps(String newProps) {
		String oldProps = props;
		props = newProps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.CONNECTOR__PROPS, oldProps, props));
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
			case Accordant_fvPackage.CONNECTOR__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
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
			case Accordant_fvPackage.CONNECTOR__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case Accordant_fvPackage.CONNECTOR__NAME:
				return getName();
			case Accordant_fvPackage.CONNECTOR__DELIVERY:
				return getDelivery();
			case Accordant_fvPackage.CONNECTOR__SYNCT:
				return getSynct();
			case Accordant_fvPackage.CONNECTOR__NOTIFICATION:
				return getNotification();
			case Accordant_fvPackage.CONNECTOR__BUFFERING:
				return getBuffering();
			case Accordant_fvPackage.CONNECTOR__THROUGHPUT:
				return getThroughput();
			case Accordant_fvPackage.CONNECTOR__ROLES:
				return getRoles();
			case Accordant_fvPackage.CONNECTOR__PROTOCOL:
				return getProtocol();
			case Accordant_fvPackage.CONNECTOR__DECISION:
				if (resolve) return getDecision();
				return basicGetDecision();
			case Accordant_fvPackage.CONNECTOR__PROPS:
				return getProps();
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
			case Accordant_fvPackage.CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case Accordant_fvPackage.CONNECTOR__DELIVERY:
				setDelivery((DeliveryGuarantee)newValue);
				return;
			case Accordant_fvPackage.CONNECTOR__SYNCT:
				setSynct((SyncType)newValue);
				return;
			case Accordant_fvPackage.CONNECTOR__NOTIFICATION:
				setNotification((NotificationModel)newValue);
				return;
			case Accordant_fvPackage.CONNECTOR__BUFFERING:
				setBuffering((Buffering)newValue);
				return;
			case Accordant_fvPackage.CONNECTOR__THROUGHPUT:
				setThroughput((Throughput)newValue);
				return;
			case Accordant_fvPackage.CONNECTOR__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case Accordant_fvPackage.CONNECTOR__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case Accordant_fvPackage.CONNECTOR__DECISION:
				setDecision((ArchDecision)newValue);
				return;
			case Accordant_fvPackage.CONNECTOR__PROPS:
				setProps((String)newValue);
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
			case Accordant_fvPackage.CONNECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Accordant_fvPackage.CONNECTOR__DELIVERY:
				setDelivery(DELIVERY_EDEFAULT);
				return;
			case Accordant_fvPackage.CONNECTOR__SYNCT:
				setSynct(SYNCT_EDEFAULT);
				return;
			case Accordant_fvPackage.CONNECTOR__NOTIFICATION:
				setNotification(NOTIFICATION_EDEFAULT);
				return;
			case Accordant_fvPackage.CONNECTOR__BUFFERING:
				setBuffering(BUFFERING_EDEFAULT);
				return;
			case Accordant_fvPackage.CONNECTOR__THROUGHPUT:
				setThroughput(THROUGHPUT_EDEFAULT);
				return;
			case Accordant_fvPackage.CONNECTOR__ROLES:
				getRoles().clear();
				return;
			case Accordant_fvPackage.CONNECTOR__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case Accordant_fvPackage.CONNECTOR__DECISION:
				setDecision((ArchDecision)null);
				return;
			case Accordant_fvPackage.CONNECTOR__PROPS:
				setProps(PROPS_EDEFAULT);
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
			case Accordant_fvPackage.CONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Accordant_fvPackage.CONNECTOR__DELIVERY:
				return delivery != DELIVERY_EDEFAULT;
			case Accordant_fvPackage.CONNECTOR__SYNCT:
				return synct != SYNCT_EDEFAULT;
			case Accordant_fvPackage.CONNECTOR__NOTIFICATION:
				return notification != NOTIFICATION_EDEFAULT;
			case Accordant_fvPackage.CONNECTOR__BUFFERING:
				return buffering != BUFFERING_EDEFAULT;
			case Accordant_fvPackage.CONNECTOR__THROUGHPUT:
				return throughput != THROUGHPUT_EDEFAULT;
			case Accordant_fvPackage.CONNECTOR__ROLES:
				return roles != null && !roles.isEmpty();
			case Accordant_fvPackage.CONNECTOR__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case Accordant_fvPackage.CONNECTOR__DECISION:
				return decision != null;
			case Accordant_fvPackage.CONNECTOR__PROPS:
				return PROPS_EDEFAULT == null ? props != null : !PROPS_EDEFAULT.equals(props);
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
		result.append(", delivery: ");
		result.append(delivery);
		result.append(", synct: ");
		result.append(synct);
		result.append(", notification: ");
		result.append(notification);
		result.append(", buffering: ");
		result.append(buffering);
		result.append(", throughput: ");
		result.append(throughput);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(", props: ");
		result.append(props);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
