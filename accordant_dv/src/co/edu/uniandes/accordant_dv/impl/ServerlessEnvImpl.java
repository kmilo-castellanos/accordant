/**
 */
package co.edu.uniandes.accordant_dv.impl;

import co.edu.uniandes.accordant_dv.Accordant_dvPackage;
import co.edu.uniandes.accordant_dv.Artifact;
import co.edu.uniandes.accordant_dv.ServerlessEnv;

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
 * An implementation of the model object '<em><b>Serverless Env</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ServerlessEnvImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ServerlessEnvImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ServerlessEnvImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ServerlessEnvImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ServerlessEnvImpl#getProps <em>Props</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ServerlessEnvImpl#getSaasArts <em>Saas Arts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerlessEnvImpl extends MinimalEObjectImpl.Container implements ServerlessEnv {
	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected int timeout = TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected static final float MEMORY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected float memory = MEMORY_EDEFAULT;

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
	 * The cached value of the '{@link #getSaasArts() <em>Saas Arts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaasArts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> saasArts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerlessEnvImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_dvPackage.Literals.SERVERLESS_ENV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.SERVERLESS_ENV__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout(int newTimeout) {
		int oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.SERVERLESS_ENV__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemory(float newMemory) {
		float oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.SERVERLESS_ENV__MEMORY, oldMemory, memory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.SERVERLESS_ENV__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProps() {
		return props;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProps(String newProps) {
		String oldProps = props;
		props = newProps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.SERVERLESS_ENV__PROPS, oldProps, props));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getSaasArts() {
		if (saasArts == null) {
			saasArts = new EObjectWithInverseResolvingEList<Artifact>(Artifact.class, this, Accordant_dvPackage.SERVERLESS_ENV__SAAS_ARTS, Accordant_dvPackage.ARTIFACT__SAAS_ENV);
		}
		return saasArts;
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
			case Accordant_dvPackage.SERVERLESS_ENV__SAAS_ARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSaasArts()).basicAdd(otherEnd, msgs);
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
			case Accordant_dvPackage.SERVERLESS_ENV__SAAS_ARTS:
				return ((InternalEList<?>)getSaasArts()).basicRemove(otherEnd, msgs);
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
			case Accordant_dvPackage.SERVERLESS_ENV__PROVIDER:
				return getProvider();
			case Accordant_dvPackage.SERVERLESS_ENV__TIMEOUT:
				return getTimeout();
			case Accordant_dvPackage.SERVERLESS_ENV__MEMORY:
				return getMemory();
			case Accordant_dvPackage.SERVERLESS_ENV__NAME:
				return getName();
			case Accordant_dvPackage.SERVERLESS_ENV__PROPS:
				return getProps();
			case Accordant_dvPackage.SERVERLESS_ENV__SAAS_ARTS:
				return getSaasArts();
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
			case Accordant_dvPackage.SERVERLESS_ENV__PROVIDER:
				setProvider((String)newValue);
				return;
			case Accordant_dvPackage.SERVERLESS_ENV__TIMEOUT:
				setTimeout((Integer)newValue);
				return;
			case Accordant_dvPackage.SERVERLESS_ENV__MEMORY:
				setMemory((Float)newValue);
				return;
			case Accordant_dvPackage.SERVERLESS_ENV__NAME:
				setName((String)newValue);
				return;
			case Accordant_dvPackage.SERVERLESS_ENV__PROPS:
				setProps((String)newValue);
				return;
			case Accordant_dvPackage.SERVERLESS_ENV__SAAS_ARTS:
				getSaasArts().clear();
				getSaasArts().addAll((Collection<? extends Artifact>)newValue);
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
			case Accordant_dvPackage.SERVERLESS_ENV__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case Accordant_dvPackage.SERVERLESS_ENV__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case Accordant_dvPackage.SERVERLESS_ENV__MEMORY:
				setMemory(MEMORY_EDEFAULT);
				return;
			case Accordant_dvPackage.SERVERLESS_ENV__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Accordant_dvPackage.SERVERLESS_ENV__PROPS:
				setProps(PROPS_EDEFAULT);
				return;
			case Accordant_dvPackage.SERVERLESS_ENV__SAAS_ARTS:
				getSaasArts().clear();
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
			case Accordant_dvPackage.SERVERLESS_ENV__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case Accordant_dvPackage.SERVERLESS_ENV__TIMEOUT:
				return timeout != TIMEOUT_EDEFAULT;
			case Accordant_dvPackage.SERVERLESS_ENV__MEMORY:
				return memory != MEMORY_EDEFAULT;
			case Accordant_dvPackage.SERVERLESS_ENV__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Accordant_dvPackage.SERVERLESS_ENV__PROPS:
				return PROPS_EDEFAULT == null ? props != null : !PROPS_EDEFAULT.equals(props);
			case Accordant_dvPackage.SERVERLESS_ENV__SAAS_ARTS:
				return saasArts != null && !saasArts.isEmpty();
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
		result.append(" (provider: ");
		result.append(provider);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(", memory: ");
		result.append(memory);
		result.append(", name: ");
		result.append(name);
		result.append(", props: ");
		result.append(props);
		result.append(')');
		return result.toString();
	}

} //ServerlessEnvImpl
