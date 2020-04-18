/**
 */
package co.edu.uniandes.accordant_fv.impl;

import co.edu.uniandes.accordant_fv.Accordant_fvPackage;
import co.edu.uniandes.accordant_fv.Field;

import co.edu.uniandes.accordant_fv.Port;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.FieldImpl#getDtype <em>Dtype</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.FieldImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.FieldImpl#getPortowner <em>Portowner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends MinimalEObjectImpl.Container implements Field {
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
	 * The default value of the '{@link #getDtype() <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtype()
	 * @generated
	 * @ordered
	 */
	protected static final String DTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDtype() <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtype()
	 * @generated
	 * @ordered
	 */
	protected String dtype = DTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final short ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected short order = ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_fvPackage.Literals.FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDtype() {
		return dtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtype(String newDtype) {
		String oldDtype = dtype;
		dtype = newDtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.FIELD__DTYPE, oldDtype, dtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(short newOrder) {
		short oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.FIELD__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPortowner() {
		if (eContainerFeatureID() != Accordant_fvPackage.FIELD__PORTOWNER) return null;
		return (Port)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortowner(Port newPortowner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPortowner, Accordant_fvPackage.FIELD__PORTOWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortowner(Port newPortowner) {
		if (newPortowner != eInternalContainer() || (eContainerFeatureID() != Accordant_fvPackage.FIELD__PORTOWNER && newPortowner != null)) {
			if (EcoreUtil.isAncestor(this, newPortowner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPortowner != null)
				msgs = ((InternalEObject)newPortowner).eInverseAdd(this, Accordant_fvPackage.PORT__FIELDS, Port.class, msgs);
			msgs = basicSetPortowner(newPortowner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.FIELD__PORTOWNER, newPortowner, newPortowner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Accordant_fvPackage.FIELD__PORTOWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPortowner((Port)otherEnd, msgs);
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
			case Accordant_fvPackage.FIELD__PORTOWNER:
				return basicSetPortowner(null, msgs);
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
			case Accordant_fvPackage.FIELD__PORTOWNER:
				return eInternalContainer().eInverseRemove(this, Accordant_fvPackage.PORT__FIELDS, Port.class, msgs);
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
			case Accordant_fvPackage.FIELD__NAME:
				return getName();
			case Accordant_fvPackage.FIELD__DTYPE:
				return getDtype();
			case Accordant_fvPackage.FIELD__ORDER:
				return getOrder();
			case Accordant_fvPackage.FIELD__PORTOWNER:
				return getPortowner();
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
			case Accordant_fvPackage.FIELD__NAME:
				setName((String)newValue);
				return;
			case Accordant_fvPackage.FIELD__DTYPE:
				setDtype((String)newValue);
				return;
			case Accordant_fvPackage.FIELD__ORDER:
				setOrder((Short)newValue);
				return;
			case Accordant_fvPackage.FIELD__PORTOWNER:
				setPortowner((Port)newValue);
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
			case Accordant_fvPackage.FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Accordant_fvPackage.FIELD__DTYPE:
				setDtype(DTYPE_EDEFAULT);
				return;
			case Accordant_fvPackage.FIELD__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case Accordant_fvPackage.FIELD__PORTOWNER:
				setPortowner((Port)null);
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
			case Accordant_fvPackage.FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Accordant_fvPackage.FIELD__DTYPE:
				return DTYPE_EDEFAULT == null ? dtype != null : !DTYPE_EDEFAULT.equals(dtype);
			case Accordant_fvPackage.FIELD__ORDER:
				return order != ORDER_EDEFAULT;
			case Accordant_fvPackage.FIELD__PORTOWNER:
				return getPortowner() != null;
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
		result.append(", dtype: ");
		result.append(dtype);
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
