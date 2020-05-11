/**
 */
package co.edu.uniandes.accordant_dv.impl;

import co.edu.uniandes.accordant_dv.Accordant_dvPackage;
import co.edu.uniandes.accordant_dv.Artifact;
import co.edu.uniandes.accordant_dv.Deployment;
import co.edu.uniandes.accordant_dv.DeploymentView;
import co.edu.uniandes.accordant_dv.Device;
import co.edu.uniandes.accordant_dv.ServerlessEnv;
import co.edu.uniandes.accordant_dv.Service;

import co.edu.uniandes.accordant_fv.FunctionalView;
import co.edu.uniandes.accordant_rq.Project;
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
 * An implementation of the model object '<em><b>Deployment View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentViewImpl#getDevs <em>Devs</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentViewImpl#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentViewImpl#getServices <em>Services</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentViewImpl#getServerless <em>Serverless</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentViewImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentViewImpl#getProject <em>Project</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.DeploymentViewImpl#getFv <em>Fv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentViewImpl extends MinimalEObjectImpl.Container implements DeploymentView {
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
	 * The cached value of the '{@link #getDevs() <em>Devs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevs()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devs;

	/**
	 * The cached value of the '{@link #getDeployments() <em>Deployments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<Deployment> deployments;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getServerless() <em>Serverless</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerless()
	 * @generated
	 * @ordered
	 */
	protected EList<ServerlessEnv> serverless;

	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> artifacts;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project;

	/**
	 * The cached value of the '{@link #getFv() <em>Fv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFv()
	 * @generated
	 * @ordered
	 */
	protected FunctionalView fv;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_dvPackage.Literals.DEPLOYMENT_VIEW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.DEPLOYMENT_VIEW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Device> getDevs() {
		if (devs == null) {
			devs = new EObjectContainmentEList<Device>(Device.class, this, Accordant_dvPackage.DEPLOYMENT_VIEW__DEVS);
		}
		return devs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Deployment> getDeployments() {
		if (deployments == null) {
			deployments = new EObjectContainmentEList<Deployment>(Deployment.class, this, Accordant_dvPackage.DEPLOYMENT_VIEW__DEPLOYMENTS);
		}
		return deployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, Accordant_dvPackage.DEPLOYMENT_VIEW__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServerlessEnv> getServerless() {
		if (serverless == null) {
			serverless = new EObjectContainmentEList<ServerlessEnv>(ServerlessEnv.class, this, Accordant_dvPackage.DEPLOYMENT_VIEW__SERVERLESS);
		}
		return serverless;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectContainmentEList<Artifact>(Artifact.class, this, Accordant_dvPackage.DEPLOYMENT_VIEW__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project getProject() {
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (Project)eResolveProxy(oldProject);
			if (project != oldProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Accordant_dvPackage.DEPLOYMENT_VIEW__PROJECT, oldProject, project));
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProject(Project newProject) {
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.DEPLOYMENT_VIEW__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalView getFv() {
		if (fv != null && fv.eIsProxy()) {
			InternalEObject oldFv = (InternalEObject)fv;
			fv = (FunctionalView)eResolveProxy(oldFv);
			if (fv != oldFv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Accordant_dvPackage.DEPLOYMENT_VIEW__FV, oldFv, fv));
			}
		}
		return fv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalView basicGetFv() {
		return fv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFv(FunctionalView newFv) {
		FunctionalView oldFv = fv;
		fv = newFv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.DEPLOYMENT_VIEW__FV, oldFv, fv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Accordant_dvPackage.DEPLOYMENT_VIEW__DEVS:
				return ((InternalEList<?>)getDevs()).basicRemove(otherEnd, msgs);
			case Accordant_dvPackage.DEPLOYMENT_VIEW__DEPLOYMENTS:
				return ((InternalEList<?>)getDeployments()).basicRemove(otherEnd, msgs);
			case Accordant_dvPackage.DEPLOYMENT_VIEW__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case Accordant_dvPackage.DEPLOYMENT_VIEW__SERVERLESS:
				return ((InternalEList<?>)getServerless()).basicRemove(otherEnd, msgs);
			case Accordant_dvPackage.DEPLOYMENT_VIEW__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
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
			case Accordant_dvPackage.DEPLOYMENT_VIEW__NAME:
				return getName();
			case Accordant_dvPackage.DEPLOYMENT_VIEW__DEVS:
				return getDevs();
			case Accordant_dvPackage.DEPLOYMENT_VIEW__DEPLOYMENTS:
				return getDeployments();
			case Accordant_dvPackage.DEPLOYMENT_VIEW__SERVICES:
				return getServices();
			case Accordant_dvPackage.DEPLOYMENT_VIEW__SERVERLESS:
				return getServerless();
			case Accordant_dvPackage.DEPLOYMENT_VIEW__ARTIFACTS:
				return getArtifacts();
			case Accordant_dvPackage.DEPLOYMENT_VIEW__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case Accordant_dvPackage.DEPLOYMENT_VIEW__FV:
				if (resolve) return getFv();
				return basicGetFv();
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
			case Accordant_dvPackage.DEPLOYMENT_VIEW__NAME:
				setName((String)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT_VIEW__DEVS:
				getDevs().clear();
				getDevs().addAll((Collection<? extends Device>)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT_VIEW__DEPLOYMENTS:
				getDeployments().clear();
				getDeployments().addAll((Collection<? extends Deployment>)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT_VIEW__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT_VIEW__SERVERLESS:
				getServerless().clear();
				getServerless().addAll((Collection<? extends ServerlessEnv>)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT_VIEW__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT_VIEW__PROJECT:
				setProject((Project)newValue);
				return;
			case Accordant_dvPackage.DEPLOYMENT_VIEW__FV:
				setFv((FunctionalView)newValue);
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
			case Accordant_dvPackage.DEPLOYMENT_VIEW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Accordant_dvPackage.DEPLOYMENT_VIEW__DEVS:
				getDevs().clear();
				return;
			case Accordant_dvPackage.DEPLOYMENT_VIEW__DEPLOYMENTS:
				getDeployments().clear();
				return;
			case Accordant_dvPackage.DEPLOYMENT_VIEW__SERVICES:
				getServices().clear();
				return;
			case Accordant_dvPackage.DEPLOYMENT_VIEW__SERVERLESS:
				getServerless().clear();
				return;
			case Accordant_dvPackage.DEPLOYMENT_VIEW__ARTIFACTS:
				getArtifacts().clear();
				return;
			case Accordant_dvPackage.DEPLOYMENT_VIEW__PROJECT:
				setProject((Project)null);
				return;
			case Accordant_dvPackage.DEPLOYMENT_VIEW__FV:
				setFv((FunctionalView)null);
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
			case Accordant_dvPackage.DEPLOYMENT_VIEW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Accordant_dvPackage.DEPLOYMENT_VIEW__DEVS:
				return devs != null && !devs.isEmpty();
			case Accordant_dvPackage.DEPLOYMENT_VIEW__DEPLOYMENTS:
				return deployments != null && !deployments.isEmpty();
			case Accordant_dvPackage.DEPLOYMENT_VIEW__SERVICES:
				return services != null && !services.isEmpty();
			case Accordant_dvPackage.DEPLOYMENT_VIEW__SERVERLESS:
				return serverless != null && !serverless.isEmpty();
			case Accordant_dvPackage.DEPLOYMENT_VIEW__ARTIFACTS:
				return artifacts != null && !artifacts.isEmpty();
			case Accordant_dvPackage.DEPLOYMENT_VIEW__PROJECT:
				return project != null;
			case Accordant_dvPackage.DEPLOYMENT_VIEW__FV:
				return fv != null;
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

} //DeploymentViewImpl
