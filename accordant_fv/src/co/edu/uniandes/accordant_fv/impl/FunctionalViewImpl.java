/**
 */
package co.edu.uniandes.accordant_fv.impl;

import co.edu.uniandes.accordant_fv.Accordant_fvPackage;
import co.edu.uniandes.accordant_fv.Component;
import co.edu.uniandes.accordant_fv.Connector;
import co.edu.uniandes.accordant_fv.FunctionalView;

import co.edu.uniandes.accordant_rq.InputPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.FunctionalViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.FunctionalViewImpl#getConns <em>Conns</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.FunctionalViewImpl#getComps <em>Comps</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.FunctionalViewImpl#getIpackage <em>Ipackage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalViewImpl extends MinimalEObjectImpl.Container implements FunctionalView {
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
	 * The cached value of the '{@link #getConns() <em>Conns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConns()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> conns;

	/**
	 * The cached value of the '{@link #getComps() <em>Comps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComps()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> comps;

	/**
	 * The cached value of the '{@link #getIpackage() <em>Ipackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpackage()
	 * @generated
	 * @ordered
	 */
	protected InputPackage ipackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_fvPackage.Literals.FUNCTIONAL_VIEW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.FUNCTIONAL_VIEW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConns() {
		if (conns == null) {
			conns = new EObjectContainmentEList<Connector>(Connector.class, this, Accordant_fvPackage.FUNCTIONAL_VIEW__CONNS);
		}
		return conns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComps() {
		if (comps == null) {
			comps = new EObjectContainmentWithInverseEList<Component>(Component.class, this, Accordant_fvPackage.FUNCTIONAL_VIEW__COMPS, Accordant_fvPackage.COMPONENT__FUNC_VIEW);
		}
		return comps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPackage getIpackage() {
		if (ipackage != null && ipackage.eIsProxy()) {
			InternalEObject oldIpackage = (InternalEObject)ipackage;
			ipackage = (InputPackage)eResolveProxy(oldIpackage);
			if (ipackage != oldIpackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Accordant_fvPackage.FUNCTIONAL_VIEW__IPACKAGE, oldIpackage, ipackage));
			}
		}
		return ipackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPackage basicGetIpackage() {
		return ipackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpackage(InputPackage newIpackage) {
		InputPackage oldIpackage = ipackage;
		ipackage = newIpackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.FUNCTIONAL_VIEW__IPACKAGE, oldIpackage, ipackage));
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
			case Accordant_fvPackage.FUNCTIONAL_VIEW__COMPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComps()).basicAdd(otherEnd, msgs);
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
			case Accordant_fvPackage.FUNCTIONAL_VIEW__CONNS:
				return ((InternalEList<?>)getConns()).basicRemove(otherEnd, msgs);
			case Accordant_fvPackage.FUNCTIONAL_VIEW__COMPS:
				return ((InternalEList<?>)getComps()).basicRemove(otherEnd, msgs);
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
			case Accordant_fvPackage.FUNCTIONAL_VIEW__NAME:
				return getName();
			case Accordant_fvPackage.FUNCTIONAL_VIEW__CONNS:
				return getConns();
			case Accordant_fvPackage.FUNCTIONAL_VIEW__COMPS:
				return getComps();
			case Accordant_fvPackage.FUNCTIONAL_VIEW__IPACKAGE:
				if (resolve) return getIpackage();
				return basicGetIpackage();
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
			case Accordant_fvPackage.FUNCTIONAL_VIEW__NAME:
				setName((String)newValue);
				return;
			case Accordant_fvPackage.FUNCTIONAL_VIEW__CONNS:
				getConns().clear();
				getConns().addAll((Collection<? extends Connector>)newValue);
				return;
			case Accordant_fvPackage.FUNCTIONAL_VIEW__COMPS:
				getComps().clear();
				getComps().addAll((Collection<? extends Component>)newValue);
				return;
			case Accordant_fvPackage.FUNCTIONAL_VIEW__IPACKAGE:
				setIpackage((InputPackage)newValue);
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
			case Accordant_fvPackage.FUNCTIONAL_VIEW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Accordant_fvPackage.FUNCTIONAL_VIEW__CONNS:
				getConns().clear();
				return;
			case Accordant_fvPackage.FUNCTIONAL_VIEW__COMPS:
				getComps().clear();
				return;
			case Accordant_fvPackage.FUNCTIONAL_VIEW__IPACKAGE:
				setIpackage((InputPackage)null);
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
			case Accordant_fvPackage.FUNCTIONAL_VIEW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Accordant_fvPackage.FUNCTIONAL_VIEW__CONNS:
				return conns != null && !conns.isEmpty();
			case Accordant_fvPackage.FUNCTIONAL_VIEW__COMPS:
				return comps != null && !comps.isEmpty();
			case Accordant_fvPackage.FUNCTIONAL_VIEW__IPACKAGE:
				return ipackage != null;
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

} //FunctionalViewImpl
