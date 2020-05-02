/**
 */
package co.edu.uniandes.accordant_dv.impl;

import co.edu.uniandes.accordant_dv.Accordant_dvPackage;
import co.edu.uniandes.accordant_dv.Artifact;
import co.edu.uniandes.accordant_dv.ExecEnvironment;
import co.edu.uniandes.accordant_dv.ServerlessEnv;
import co.edu.uniandes.accordant_fv.Component;
import co.edu.uniandes.accordant_fv.Connector;
import co.edu.uniandes.accordant_rq.ArchDecision;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ArtifactImpl#getComp <em>Comp</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ArtifactImpl#getConn <em>Conn</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ArtifactImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ArtifactImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ArtifactImpl#getPaasEnv <em>Paas Env</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ArtifactImpl#getSaasEnv <em>Saas Env</em>}</li>
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
	 * The cached value of the '{@link #getComp() <em>Comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp()
	 * @generated
	 * @ordered
	 */
	protected Component comp;

	/**
	 * The cached value of the '{@link #getConn() <em>Conn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConn()
	 * @generated
	 * @ordered
	 */
	protected Connector conn;

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
	 * The default value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected String technology = TECHNOLOGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaasEnv() <em>Paas Env</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaasEnv()
	 * @generated
	 * @ordered
	 */
	protected ExecEnvironment paasEnv;

	/**
	 * The cached value of the '{@link #getSaasEnv() <em>Saas Env</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaasEnv()
	 * @generated
	 * @ordered
	 */
	protected ServerlessEnv saasEnv;

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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.ARTIFACT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.ARTIFACT__PROPS, oldProps, props));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getComp() {
		if (comp != null && comp.eIsProxy()) {
			InternalEObject oldComp = (InternalEObject)comp;
			comp = (Component)eResolveProxy(oldComp);
			if (comp != oldComp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Accordant_dvPackage.ARTIFACT__COMP, oldComp, comp));
			}
		}
		return comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComp() {
		return comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComp(Component newComp) {
		Component oldComp = comp;
		comp = newComp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.ARTIFACT__COMP, oldComp, comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector getConn() {
		if (conn != null && conn.eIsProxy()) {
			InternalEObject oldConn = (InternalEObject)conn;
			conn = (Connector)eResolveProxy(oldConn);
			if (conn != oldConn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Accordant_dvPackage.ARTIFACT__CONN, oldConn, conn));
			}
		}
		return conn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConn() {
		return conn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConn(Connector newConn) {
		Connector oldConn = conn;
		conn = newConn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.ARTIFACT__CONN, oldConn, conn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchDecision getDecision() {
		if (decision != null && decision.eIsProxy()) {
			InternalEObject oldDecision = (InternalEObject)decision;
			decision = (ArchDecision)eResolveProxy(oldDecision);
			if (decision != oldDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Accordant_dvPackage.ARTIFACT__DECISION, oldDecision, decision));
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
	@Override
	public void setDecision(ArchDecision newDecision) {
		ArchDecision oldDecision = decision;
		decision = newDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.ARTIFACT__DECISION, oldDecision, decision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechnology(String newTechnology) {
		String oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.ARTIFACT__TECHNOLOGY, oldTechnology, technology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecEnvironment getPaasEnv() {
		if (paasEnv != null && paasEnv.eIsProxy()) {
			InternalEObject oldPaasEnv = (InternalEObject)paasEnv;
			paasEnv = (ExecEnvironment)eResolveProxy(oldPaasEnv);
			if (paasEnv != oldPaasEnv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Accordant_dvPackage.ARTIFACT__PAAS_ENV, oldPaasEnv, paasEnv));
			}
		}
		return paasEnv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecEnvironment basicGetPaasEnv() {
		return paasEnv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaasEnv(ExecEnvironment newPaasEnv, NotificationChain msgs) {
		ExecEnvironment oldPaasEnv = paasEnv;
		paasEnv = newPaasEnv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.ARTIFACT__PAAS_ENV, oldPaasEnv, newPaasEnv);
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
	public void setPaasEnv(ExecEnvironment newPaasEnv) {
		if (newPaasEnv != paasEnv) {
			NotificationChain msgs = null;
			if (paasEnv != null)
				msgs = ((InternalEObject)paasEnv).eInverseRemove(this, Accordant_dvPackage.EXEC_ENVIRONMENT__PAAS_ARTS, ExecEnvironment.class, msgs);
			if (newPaasEnv != null)
				msgs = ((InternalEObject)newPaasEnv).eInverseAdd(this, Accordant_dvPackage.EXEC_ENVIRONMENT__PAAS_ARTS, ExecEnvironment.class, msgs);
			msgs = basicSetPaasEnv(newPaasEnv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.ARTIFACT__PAAS_ENV, newPaasEnv, newPaasEnv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerlessEnv getSaasEnv() {
		if (saasEnv != null && saasEnv.eIsProxy()) {
			InternalEObject oldSaasEnv = (InternalEObject)saasEnv;
			saasEnv = (ServerlessEnv)eResolveProxy(oldSaasEnv);
			if (saasEnv != oldSaasEnv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Accordant_dvPackage.ARTIFACT__SAAS_ENV, oldSaasEnv, saasEnv));
			}
		}
		return saasEnv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerlessEnv basicGetSaasEnv() {
		return saasEnv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSaasEnv(ServerlessEnv newSaasEnv, NotificationChain msgs) {
		ServerlessEnv oldSaasEnv = saasEnv;
		saasEnv = newSaasEnv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.ARTIFACT__SAAS_ENV, oldSaasEnv, newSaasEnv);
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
	public void setSaasEnv(ServerlessEnv newSaasEnv) {
		if (newSaasEnv != saasEnv) {
			NotificationChain msgs = null;
			if (saasEnv != null)
				msgs = ((InternalEObject)saasEnv).eInverseRemove(this, Accordant_dvPackage.SERVERLESS_ENV__SAAS_ARTS, ServerlessEnv.class, msgs);
			if (newSaasEnv != null)
				msgs = ((InternalEObject)newSaasEnv).eInverseAdd(this, Accordant_dvPackage.SERVERLESS_ENV__SAAS_ARTS, ServerlessEnv.class, msgs);
			msgs = basicSetSaasEnv(newSaasEnv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.ARTIFACT__SAAS_ENV, newSaasEnv, newSaasEnv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Accordant_dvPackage.ARTIFACT__PAAS_ENV:
				if (paasEnv != null)
					msgs = ((InternalEObject)paasEnv).eInverseRemove(this, Accordant_dvPackage.EXEC_ENVIRONMENT__PAAS_ARTS, ExecEnvironment.class, msgs);
				return basicSetPaasEnv((ExecEnvironment)otherEnd, msgs);
			case Accordant_dvPackage.ARTIFACT__SAAS_ENV:
				if (saasEnv != null)
					msgs = ((InternalEObject)saasEnv).eInverseRemove(this, Accordant_dvPackage.SERVERLESS_ENV__SAAS_ARTS, ServerlessEnv.class, msgs);
				return basicSetSaasEnv((ServerlessEnv)otherEnd, msgs);
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
			case Accordant_dvPackage.ARTIFACT__PAAS_ENV:
				return basicSetPaasEnv(null, msgs);
			case Accordant_dvPackage.ARTIFACT__SAAS_ENV:
				return basicSetSaasEnv(null, msgs);
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
			case Accordant_dvPackage.ARTIFACT__NAME:
				return getName();
			case Accordant_dvPackage.ARTIFACT__PROPS:
				return getProps();
			case Accordant_dvPackage.ARTIFACT__COMP:
				if (resolve) return getComp();
				return basicGetComp();
			case Accordant_dvPackage.ARTIFACT__CONN:
				if (resolve) return getConn();
				return basicGetConn();
			case Accordant_dvPackage.ARTIFACT__DECISION:
				if (resolve) return getDecision();
				return basicGetDecision();
			case Accordant_dvPackage.ARTIFACT__TECHNOLOGY:
				return getTechnology();
			case Accordant_dvPackage.ARTIFACT__PAAS_ENV:
				if (resolve) return getPaasEnv();
				return basicGetPaasEnv();
			case Accordant_dvPackage.ARTIFACT__SAAS_ENV:
				if (resolve) return getSaasEnv();
				return basicGetSaasEnv();
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
			case Accordant_dvPackage.ARTIFACT__NAME:
				setName((String)newValue);
				return;
			case Accordant_dvPackage.ARTIFACT__PROPS:
				setProps((String)newValue);
				return;
			case Accordant_dvPackage.ARTIFACT__COMP:
				setComp((Component)newValue);
				return;
			case Accordant_dvPackage.ARTIFACT__CONN:
				setConn((Connector)newValue);
				return;
			case Accordant_dvPackage.ARTIFACT__DECISION:
				setDecision((ArchDecision)newValue);
				return;
			case Accordant_dvPackage.ARTIFACT__TECHNOLOGY:
				setTechnology((String)newValue);
				return;
			case Accordant_dvPackage.ARTIFACT__PAAS_ENV:
				setPaasEnv((ExecEnvironment)newValue);
				return;
			case Accordant_dvPackage.ARTIFACT__SAAS_ENV:
				setSaasEnv((ServerlessEnv)newValue);
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
			case Accordant_dvPackage.ARTIFACT__COMP:
				setComp((Component)null);
				return;
			case Accordant_dvPackage.ARTIFACT__CONN:
				setConn((Connector)null);
				return;
			case Accordant_dvPackage.ARTIFACT__DECISION:
				setDecision((ArchDecision)null);
				return;
			case Accordant_dvPackage.ARTIFACT__TECHNOLOGY:
				setTechnology(TECHNOLOGY_EDEFAULT);
				return;
			case Accordant_dvPackage.ARTIFACT__PAAS_ENV:
				setPaasEnv((ExecEnvironment)null);
				return;
			case Accordant_dvPackage.ARTIFACT__SAAS_ENV:
				setSaasEnv((ServerlessEnv)null);
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
			case Accordant_dvPackage.ARTIFACT__COMP:
				return comp != null;
			case Accordant_dvPackage.ARTIFACT__CONN:
				return conn != null;
			case Accordant_dvPackage.ARTIFACT__DECISION:
				return decision != null;
			case Accordant_dvPackage.ARTIFACT__TECHNOLOGY:
				return TECHNOLOGY_EDEFAULT == null ? technology != null : !TECHNOLOGY_EDEFAULT.equals(technology);
			case Accordant_dvPackage.ARTIFACT__PAAS_ENV:
				return paasEnv != null;
			case Accordant_dvPackage.ARTIFACT__SAAS_ENV:
				return saasEnv != null;
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
		result.append(", props: ");
		result.append(props);
		result.append(", technology: ");
		result.append(technology);
		result.append(')');
		return result.toString();
	}

} //ArtifactImpl
