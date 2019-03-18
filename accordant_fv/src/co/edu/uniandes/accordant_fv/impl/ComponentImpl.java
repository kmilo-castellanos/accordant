/**
 */
package co.edu.uniandes.accordant_fv.impl;

import co.edu.uniandes.accordant_fv.Accordant_fvPackage;
import co.edu.uniandes.accordant_fv.Component;
import co.edu.uniandes.accordant_fv.FunctionalView;
import co.edu.uniandes.accordant_fv.Port;
import co.edu.uniandes.accordant_fv.ProcessingModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.ComponentImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.ComponentImpl#getProcModel <em>Proc Model</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.ComponentImpl#getFuncView <em>Func View</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
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
	protected EList<Port> ports;

	/**
	 * The default value of the '{@link #getProcModel() <em>Proc Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcModel()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingModel PROC_MODEL_EDEFAULT = ProcessingModel.STREAM;

	/**
	 * The cached value of the '{@link #getProcModel() <em>Proc Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcModel()
	 * @generated
	 * @ordered
	 */
	protected ProcessingModel procModel = PROC_MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_fvPackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, Accordant_fvPackage.COMPONENT__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingModel getProcModel() {
		return procModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcModel(ProcessingModel newProcModel) {
		ProcessingModel oldProcModel = procModel;
		procModel = newProcModel == null ? PROC_MODEL_EDEFAULT : newProcModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.COMPONENT__PROC_MODEL, oldProcModel, procModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalView getFuncView() {
		if (eContainerFeatureID() != Accordant_fvPackage.COMPONENT__FUNC_VIEW) return null;
		return (FunctionalView)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuncView(FunctionalView newFuncView, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFuncView, Accordant_fvPackage.COMPONENT__FUNC_VIEW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuncView(FunctionalView newFuncView) {
		if (newFuncView != eInternalContainer() || (eContainerFeatureID() != Accordant_fvPackage.COMPONENT__FUNC_VIEW && newFuncView != null)) {
			if (EcoreUtil.isAncestor(this, newFuncView))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFuncView != null)
				msgs = ((InternalEObject)newFuncView).eInverseAdd(this, Accordant_fvPackage.FUNCTIONAL_VIEW__COMPS, FunctionalView.class, msgs);
			msgs = basicSetFuncView(newFuncView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.COMPONENT__FUNC_VIEW, newFuncView, newFuncView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Accordant_fvPackage.COMPONENT__FUNC_VIEW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFuncView((FunctionalView)otherEnd, msgs);
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
			case Accordant_fvPackage.COMPONENT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case Accordant_fvPackage.COMPONENT__FUNC_VIEW:
				return basicSetFuncView(null, msgs);
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
			case Accordant_fvPackage.COMPONENT__FUNC_VIEW:
				return eInternalContainer().eInverseRemove(this, Accordant_fvPackage.FUNCTIONAL_VIEW__COMPS, FunctionalView.class, msgs);
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
			case Accordant_fvPackage.COMPONENT__NAME:
				return getName();
			case Accordant_fvPackage.COMPONENT__PORTS:
				return getPorts();
			case Accordant_fvPackage.COMPONENT__PROC_MODEL:
				return getProcModel();
			case Accordant_fvPackage.COMPONENT__FUNC_VIEW:
				return getFuncView();
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
			case Accordant_fvPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case Accordant_fvPackage.COMPONENT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case Accordant_fvPackage.COMPONENT__PROC_MODEL:
				setProcModel((ProcessingModel)newValue);
				return;
			case Accordant_fvPackage.COMPONENT__FUNC_VIEW:
				setFuncView((FunctionalView)newValue);
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
			case Accordant_fvPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Accordant_fvPackage.COMPONENT__PORTS:
				getPorts().clear();
				return;
			case Accordant_fvPackage.COMPONENT__PROC_MODEL:
				setProcModel(PROC_MODEL_EDEFAULT);
				return;
			case Accordant_fvPackage.COMPONENT__FUNC_VIEW:
				setFuncView((FunctionalView)null);
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
			case Accordant_fvPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Accordant_fvPackage.COMPONENT__PORTS:
				return ports != null && !ports.isEmpty();
			case Accordant_fvPackage.COMPONENT__PROC_MODEL:
				return procModel != PROC_MODEL_EDEFAULT;
			case Accordant_fvPackage.COMPONENT__FUNC_VIEW:
				return getFuncView() != null;
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
		result.append(", procModel: ");
		result.append(procModel);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
