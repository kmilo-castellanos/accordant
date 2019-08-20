/**
 */
package co.edu.uniandes.accordant_dv.impl;

import co.edu.uniandes.accordant_dv.Accordant_dvPackage;
import co.edu.uniandes.accordant_dv.Artifact;
import co.edu.uniandes.accordant_dv.ExecEnvironment;
import co.edu.uniandes.accordant_dv.ServerlessEnv;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ArtifactImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ArtifactImpl#getProps <em>Props</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ArtifactImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ArtifactImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ArtifactImpl#getSaas <em>Saas</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ArtifactImpl#getPaas <em>Paas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends MinimalEObjectImpl.Container implements Artifact {
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
	 * The default value of the '{@link #getComponent() <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected String component = COMPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnector() <em>Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected String connector = CONNECTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSaas() <em>Saas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaas()
	 * @generated
	 * @ordered
	 */
	protected ServerlessEnv saas;

	/**
	 * The cached value of the '{@link #getPaas() <em>Paas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaas()
	 * @generated
	 * @ordered
	 */
	protected ExecEnvironment paas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_dvPackage.Literals.ARTIFACT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.ARTIFACT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.ARTIFACT__PROPS, oldProps, props));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(String newComponent) {
		String oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.ARTIFACT__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(String newConnector) {
		String oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.ARTIFACT__CONNECTOR, oldConnector, connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerlessEnv getSaas() {
		if (saas != null && saas.eIsProxy()) {
			InternalEObject oldSaas = (InternalEObject)saas;
			saas = (ServerlessEnv)eResolveProxy(oldSaas);
			if (saas != oldSaas) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Accordant_dvPackage.ARTIFACT__SAAS, oldSaas, saas));
			}
		}
		return saas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerlessEnv basicGetSaas() {
		return saas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaas(ServerlessEnv newSaas) {
		ServerlessEnv oldSaas = saas;
		saas = newSaas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.ARTIFACT__SAAS, oldSaas, saas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecEnvironment getPaas() {
		if (paas != null && paas.eIsProxy()) {
			InternalEObject oldPaas = (InternalEObject)paas;
			paas = (ExecEnvironment)eResolveProxy(oldPaas);
			if (paas != oldPaas) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Accordant_dvPackage.ARTIFACT__PAAS, oldPaas, paas));
			}
		}
		return paas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecEnvironment basicGetPaas() {
		return paas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaas(ExecEnvironment newPaas) {
		ExecEnvironment oldPaas = paas;
		paas = newPaas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.ARTIFACT__PAAS, oldPaas, paas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Accordant_dvPackage.ARTIFACT__NAME:
				return getName();
			case Accordant_dvPackage.ARTIFACT__PROPS:
				return getProps();
			case Accordant_dvPackage.ARTIFACT__COMPONENT:
				return getComponent();
			case Accordant_dvPackage.ARTIFACT__CONNECTOR:
				return getConnector();
			case Accordant_dvPackage.ARTIFACT__SAAS:
				if (resolve) return getSaas();
				return basicGetSaas();
			case Accordant_dvPackage.ARTIFACT__PAAS:
				if (resolve) return getPaas();
				return basicGetPaas();
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
			case Accordant_dvPackage.ARTIFACT__NAME:
				setName((String)newValue);
				return;
			case Accordant_dvPackage.ARTIFACT__PROPS:
				setProps((String)newValue);
				return;
			case Accordant_dvPackage.ARTIFACT__COMPONENT:
				setComponent((String)newValue);
				return;
			case Accordant_dvPackage.ARTIFACT__CONNECTOR:
				setConnector((String)newValue);
				return;
			case Accordant_dvPackage.ARTIFACT__SAAS:
				setSaas((ServerlessEnv)newValue);
				return;
			case Accordant_dvPackage.ARTIFACT__PAAS:
				setPaas((ExecEnvironment)newValue);
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
			case Accordant_dvPackage.ARTIFACT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Accordant_dvPackage.ARTIFACT__PROPS:
				setProps(PROPS_EDEFAULT);
				return;
			case Accordant_dvPackage.ARTIFACT__COMPONENT:
				setComponent(COMPONENT_EDEFAULT);
				return;
			case Accordant_dvPackage.ARTIFACT__CONNECTOR:
				setConnector(CONNECTOR_EDEFAULT);
				return;
			case Accordant_dvPackage.ARTIFACT__SAAS:
				setSaas((ServerlessEnv)null);
				return;
			case Accordant_dvPackage.ARTIFACT__PAAS:
				setPaas((ExecEnvironment)null);
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
			case Accordant_dvPackage.ARTIFACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Accordant_dvPackage.ARTIFACT__PROPS:
				return PROPS_EDEFAULT == null ? props != null : !PROPS_EDEFAULT.equals(props);
			case Accordant_dvPackage.ARTIFACT__COMPONENT:
				return COMPONENT_EDEFAULT == null ? component != null : !COMPONENT_EDEFAULT.equals(component);
			case Accordant_dvPackage.ARTIFACT__CONNECTOR:
				return CONNECTOR_EDEFAULT == null ? connector != null : !CONNECTOR_EDEFAULT.equals(connector);
			case Accordant_dvPackage.ARTIFACT__SAAS:
				return saas != null;
			case Accordant_dvPackage.ARTIFACT__PAAS:
				return paas != null;
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
		result.append(", props: ");
		result.append(props);
		result.append(", component: ");
		result.append(component);
		result.append(", connector: ");
		result.append(connector);
		result.append(')');
		return result.toString();
	}

} //ArtifactImpl
