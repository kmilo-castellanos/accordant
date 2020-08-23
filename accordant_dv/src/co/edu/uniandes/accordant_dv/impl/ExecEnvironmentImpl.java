/**
 */
package co.edu.uniandes.accordant_dv.impl;

import co.edu.uniandes.accordant_dv.Accordant_dvPackage;
import co.edu.uniandes.accordant_dv.Artifact;
import co.edu.uniandes.accordant_dv.EnvVar;
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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exec Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ExecEnvironmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ExecEnvironmentImpl#getCpu_req <em>Cpu req</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ExecEnvironmentImpl#getMem_req <em>Mem req</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ExecEnvironmentImpl#getCpu_lim <em>Cpu lim</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ExecEnvironmentImpl#getMem_lim <em>Mem lim</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ExecEnvironmentImpl#getImage <em>Image</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ExecEnvironmentImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ExecEnvironmentImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ExecEnvironmentImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ExecEnvironmentImpl#getPaasArts <em>Paas Arts</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.impl.ExecEnvironmentImpl#getPodOwner <em>Pod Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecEnvironmentImpl extends MinimalEObjectImpl.Container implements ExecEnvironment {
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
	 * The default value of the '{@link #getCpu_req() <em>Cpu req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_req()
	 * @generated
	 * @ordered
	 */
	protected static final float CPU_REQ_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCpu_req() <em>Cpu req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_req()
	 * @generated
	 * @ordered
	 */
	protected float cpu_req = CPU_REQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getMem_req() <em>Mem req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMem_req()
	 * @generated
	 * @ordered
	 */
	protected static final int MEM_REQ_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMem_req() <em>Mem req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMem_req()
	 * @generated
	 * @ordered
	 */
	protected int mem_req = MEM_REQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpu_lim() <em>Cpu lim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_lim()
	 * @generated
	 * @ordered
	 */
	protected static final float CPU_LIM_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCpu_lim() <em>Cpu lim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_lim()
	 * @generated
	 * @ordered
	 */
	protected float cpu_lim = CPU_LIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMem_lim() <em>Mem lim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMem_lim()
	 * @generated
	 * @ordered
	 */
	protected static final int MEM_LIM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMem_lim() <em>Mem lim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMem_lim()
	 * @generated
	 * @ordered
	 */
	protected int mem_lim = MEM_LIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> ports;

	/**
	 * The cached value of the '{@link #getVars() <em>Vars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVars()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvVar> vars;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<String> commands;

	/**
	 * The cached value of the '{@link #getPaasArts() <em>Paas Arts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaasArts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> paasArts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_dvPackage.Literals.EXEC_ENVIRONMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.EXEC_ENVIRONMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCpu_req() {
		return cpu_req;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpu_req(float newCpu_req) {
		float oldCpu_req = cpu_req;
		cpu_req = newCpu_req;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.EXEC_ENVIRONMENT__CPU_REQ, oldCpu_req, cpu_req));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMem_req() {
		return mem_req;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMem_req(int newMem_req) {
		int oldMem_req = mem_req;
		mem_req = newMem_req;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.EXEC_ENVIRONMENT__MEM_REQ, oldMem_req, mem_req));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCpu_lim() {
		return cpu_lim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpu_lim(float newCpu_lim) {
		float oldCpu_lim = cpu_lim;
		cpu_lim = newCpu_lim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.EXEC_ENVIRONMENT__CPU_LIM, oldCpu_lim, cpu_lim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMem_lim() {
		return mem_lim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMem_lim(int newMem_lim) {
		int oldMem_lim = mem_lim;
		mem_lim = newMem_lim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.EXEC_ENVIRONMENT__MEM_LIM, oldMem_lim, mem_lim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.EXEC_ENVIRONMENT__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPorts() {
		if (ports == null) {
			ports = new EDataTypeUniqueEList<Integer>(Integer.class, this, Accordant_dvPackage.EXEC_ENVIRONMENT__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnvVar> getVars() {
		if (vars == null) {
			vars = new EObjectContainmentWithInverseEList<EnvVar>(EnvVar.class, this, Accordant_dvPackage.EXEC_ENVIRONMENT__VARS, Accordant_dvPackage.ENV_VAR__EXEC_ENV);
		}
		return vars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCommands() {
		if (commands == null) {
			commands = new EDataTypeUniqueEList<String>(String.class, this, Accordant_dvPackage.EXEC_ENVIRONMENT__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getPaasArts() {
		if (paasArts == null) {
			paasArts = new EObjectWithInverseResolvingEList<Artifact>(Artifact.class, this, Accordant_dvPackage.EXEC_ENVIRONMENT__PAAS_ARTS, Accordant_dvPackage.ARTIFACT__PAAS_ENV);
		}
		return paasArts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pod getPodOwner() {
		if (eContainerFeatureID() != Accordant_dvPackage.EXEC_ENVIRONMENT__POD_OWNER) return null;
		return (Pod)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPodOwner(Pod newPodOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPodOwner, Accordant_dvPackage.EXEC_ENVIRONMENT__POD_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPodOwner(Pod newPodOwner) {
		if (newPodOwner != eInternalContainer() || (eContainerFeatureID() != Accordant_dvPackage.EXEC_ENVIRONMENT__POD_OWNER && newPodOwner != null)) {
			if (EcoreUtil.isAncestor(this, newPodOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPodOwner != null)
				msgs = ((InternalEObject)newPodOwner).eInverseAdd(this, Accordant_dvPackage.POD__ENVS, Pod.class, msgs);
			msgs = basicSetPodOwner(newPodOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_dvPackage.EXEC_ENVIRONMENT__POD_OWNER, newPodOwner, newPodOwner));
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
			case Accordant_dvPackage.EXEC_ENVIRONMENT__VARS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVars()).basicAdd(otherEnd, msgs);
			case Accordant_dvPackage.EXEC_ENVIRONMENT__PAAS_ARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPaasArts()).basicAdd(otherEnd, msgs);
			case Accordant_dvPackage.EXEC_ENVIRONMENT__POD_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPodOwner((Pod)otherEnd, msgs);
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
			case Accordant_dvPackage.EXEC_ENVIRONMENT__VARS:
				return ((InternalEList<?>)getVars()).basicRemove(otherEnd, msgs);
			case Accordant_dvPackage.EXEC_ENVIRONMENT__PAAS_ARTS:
				return ((InternalEList<?>)getPaasArts()).basicRemove(otherEnd, msgs);
			case Accordant_dvPackage.EXEC_ENVIRONMENT__POD_OWNER:
				return basicSetPodOwner(null, msgs);
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
			case Accordant_dvPackage.EXEC_ENVIRONMENT__POD_OWNER:
				return eInternalContainer().eInverseRemove(this, Accordant_dvPackage.POD__ENVS, Pod.class, msgs);
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
			case Accordant_dvPackage.EXEC_ENVIRONMENT__NAME:
				return getName();
			case Accordant_dvPackage.EXEC_ENVIRONMENT__CPU_REQ:
				return getCpu_req();
			case Accordant_dvPackage.EXEC_ENVIRONMENT__MEM_REQ:
				return getMem_req();
			case Accordant_dvPackage.EXEC_ENVIRONMENT__CPU_LIM:
				return getCpu_lim();
			case Accordant_dvPackage.EXEC_ENVIRONMENT__MEM_LIM:
				return getMem_lim();
			case Accordant_dvPackage.EXEC_ENVIRONMENT__IMAGE:
				return getImage();
			case Accordant_dvPackage.EXEC_ENVIRONMENT__PORTS:
				return getPorts();
			case Accordant_dvPackage.EXEC_ENVIRONMENT__VARS:
				return getVars();
			case Accordant_dvPackage.EXEC_ENVIRONMENT__COMMANDS:
				return getCommands();
			case Accordant_dvPackage.EXEC_ENVIRONMENT__PAAS_ARTS:
				return getPaasArts();
			case Accordant_dvPackage.EXEC_ENVIRONMENT__POD_OWNER:
				return getPodOwner();
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
			case Accordant_dvPackage.EXEC_ENVIRONMENT__NAME:
				setName((String)newValue);
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__CPU_REQ:
				setCpu_req((Float)newValue);
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__MEM_REQ:
				setMem_req((Integer)newValue);
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__CPU_LIM:
				setCpu_lim((Float)newValue);
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__MEM_LIM:
				setMem_lim((Integer)newValue);
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__IMAGE:
				setImage((String)newValue);
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Integer>)newValue);
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__VARS:
				getVars().clear();
				getVars().addAll((Collection<? extends EnvVar>)newValue);
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends String>)newValue);
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__PAAS_ARTS:
				getPaasArts().clear();
				getPaasArts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__POD_OWNER:
				setPodOwner((Pod)newValue);
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
			case Accordant_dvPackage.EXEC_ENVIRONMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__CPU_REQ:
				setCpu_req(CPU_REQ_EDEFAULT);
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__MEM_REQ:
				setMem_req(MEM_REQ_EDEFAULT);
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__CPU_LIM:
				setCpu_lim(CPU_LIM_EDEFAULT);
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__MEM_LIM:
				setMem_lim(MEM_LIM_EDEFAULT);
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__PORTS:
				getPorts().clear();
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__VARS:
				getVars().clear();
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__COMMANDS:
				getCommands().clear();
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__PAAS_ARTS:
				getPaasArts().clear();
				return;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__POD_OWNER:
				setPodOwner((Pod)null);
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
			case Accordant_dvPackage.EXEC_ENVIRONMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Accordant_dvPackage.EXEC_ENVIRONMENT__CPU_REQ:
				return cpu_req != CPU_REQ_EDEFAULT;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__MEM_REQ:
				return mem_req != MEM_REQ_EDEFAULT;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__CPU_LIM:
				return cpu_lim != CPU_LIM_EDEFAULT;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__MEM_LIM:
				return mem_lim != MEM_LIM_EDEFAULT;
			case Accordant_dvPackage.EXEC_ENVIRONMENT__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case Accordant_dvPackage.EXEC_ENVIRONMENT__PORTS:
				return ports != null && !ports.isEmpty();
			case Accordant_dvPackage.EXEC_ENVIRONMENT__VARS:
				return vars != null && !vars.isEmpty();
			case Accordant_dvPackage.EXEC_ENVIRONMENT__COMMANDS:
				return commands != null && !commands.isEmpty();
			case Accordant_dvPackage.EXEC_ENVIRONMENT__PAAS_ARTS:
				return paasArts != null && !paasArts.isEmpty();
			case Accordant_dvPackage.EXEC_ENVIRONMENT__POD_OWNER:
				return getPodOwner() != null;
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
		result.append(", cpu_req: ");
		result.append(cpu_req);
		result.append(", mem_req: ");
		result.append(mem_req);
		result.append(", cpu_lim: ");
		result.append(cpu_lim);
		result.append(", mem_lim: ");
		result.append(mem_lim);
		result.append(", image: ");
		result.append(image);
		result.append(", ports: ");
		result.append(ports);
		result.append(", commands: ");
		result.append(commands);
		result.append(')');
		return result.toString();
	}

} //ExecEnvironmentImpl
