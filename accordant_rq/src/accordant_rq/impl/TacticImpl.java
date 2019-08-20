/**
 */
package accordant_rq.impl;

import accordant_rq.Accordant_rqPackage;
import accordant_rq.QAttribute;
import accordant_rq.SensitivityPoint;
import accordant_rq.Tactic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tactic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link accordant_rq.impl.TacticImpl#getName <em>Name</em>}</li>
 *   <li>{@link accordant_rq.impl.TacticImpl#getQAttribute <em>QAttribute</em>}</li>
 *   <li>{@link accordant_rq.impl.TacticImpl#getSubtactics <em>Subtactics</em>}</li>
 *   <li>{@link accordant_rq.impl.TacticImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link accordant_rq.impl.TacticImpl#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link accordant_rq.impl.TacticImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link accordant_rq.impl.TacticImpl#getViewpoint <em>Viewpoint</em>}</li>
 *   <li>{@link accordant_rq.impl.TacticImpl#getSpoint <em>Spoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TacticImpl extends MinimalEObjectImpl.Container implements Tactic {
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
	 * The default value of the '{@link #getQAttribute() <em>QAttribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final QAttribute QATTRIBUTE_EDEFAULT = QAttribute.AVAILABILITY;

	/**
	 * The cached value of the '{@link #getQAttribute() <em>QAttribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQAttribute()
	 * @generated
	 * @ordered
	 */
	protected QAttribute qAttribute = QATTRIBUTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubtactics() <em>Subtactics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtactics()
	 * @generated
	 * @ordered
	 */
	protected EList<Tactic> subtactics;

	/**
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected String rationale = RATIONALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimulus() <em>Stimulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulus()
	 * @generated
	 * @ordered
	 */
	protected static final String STIMULUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimulus() <em>Stimulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulus()
	 * @generated
	 * @ordered
	 */
	protected String stimulus = STIMULUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponse() <em>Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected String response = RESPONSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewpoint() <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEWPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewpoint() <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoint()
	 * @generated
	 * @ordered
	 */
	protected String viewpoint = VIEWPOINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpoint() <em>Spoint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<SensitivityPoint> spoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TacticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_rqPackage.Literals.TACTIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.TACTIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAttribute getQAttribute() {
		return qAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQAttribute(QAttribute newQAttribute) {
		QAttribute oldQAttribute = qAttribute;
		qAttribute = newQAttribute == null ? QATTRIBUTE_EDEFAULT : newQAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.TACTIC__QATTRIBUTE, oldQAttribute,
					qAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tactic> getSubtactics() {
		if (subtactics == null) {
			subtactics = new EObjectContainmentEList<Tactic>(Tactic.class, this, Accordant_rqPackage.TACTIC__SUBTACTICS);
		}
		return subtactics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(String newRationale) {
		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.TACTIC__RATIONALE, oldRationale,
					rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStimulus() {
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStimulus(String newStimulus) {
		String oldStimulus = stimulus;
		stimulus = newStimulus;
		if (eNotificationRequired())
			eNotify(
					new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.TACTIC__STIMULUS, oldStimulus, stimulus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(String newResponse) {
		String oldResponse = response;
		response = newResponse;
		if (eNotificationRequired())
			eNotify(
					new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.TACTIC__RESPONSE, oldResponse, response));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewpoint() {
		return viewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewpoint(String newViewpoint) {
		String oldViewpoint = viewpoint;
		viewpoint = newViewpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_rqPackage.TACTIC__VIEWPOINT, oldViewpoint,
					viewpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensitivityPoint> getSpoint() {
		if (spoint == null) {
			spoint = new EObjectWithInverseResolvingEList.ManyInverse<SensitivityPoint>(SensitivityPoint.class, this,
					Accordant_rqPackage.TACTIC__SPOINT, Accordant_rqPackage.SENSITIVITY_POINT__TACTIC);
		}
		return spoint;
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
		case Accordant_rqPackage.TACTIC__SPOINT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSpoint()).basicAdd(otherEnd, msgs);
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
		case Accordant_rqPackage.TACTIC__SUBTACTICS:
			return ((InternalEList<?>) getSubtactics()).basicRemove(otherEnd, msgs);
		case Accordant_rqPackage.TACTIC__SPOINT:
			return ((InternalEList<?>) getSpoint()).basicRemove(otherEnd, msgs);
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
		case Accordant_rqPackage.TACTIC__NAME:
			return getName();
		case Accordant_rqPackage.TACTIC__QATTRIBUTE:
			return getQAttribute();
		case Accordant_rqPackage.TACTIC__SUBTACTICS:
			return getSubtactics();
		case Accordant_rqPackage.TACTIC__RATIONALE:
			return getRationale();
		case Accordant_rqPackage.TACTIC__STIMULUS:
			return getStimulus();
		case Accordant_rqPackage.TACTIC__RESPONSE:
			return getResponse();
		case Accordant_rqPackage.TACTIC__VIEWPOINT:
			return getViewpoint();
		case Accordant_rqPackage.TACTIC__SPOINT:
			return getSpoint();
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
		case Accordant_rqPackage.TACTIC__NAME:
			setName((String) newValue);
			return;
		case Accordant_rqPackage.TACTIC__QATTRIBUTE:
			setQAttribute((QAttribute) newValue);
			return;
		case Accordant_rqPackage.TACTIC__SUBTACTICS:
			getSubtactics().clear();
			getSubtactics().addAll((Collection<? extends Tactic>) newValue);
			return;
		case Accordant_rqPackage.TACTIC__RATIONALE:
			setRationale((String) newValue);
			return;
		case Accordant_rqPackage.TACTIC__STIMULUS:
			setStimulus((String) newValue);
			return;
		case Accordant_rqPackage.TACTIC__RESPONSE:
			setResponse((String) newValue);
			return;
		case Accordant_rqPackage.TACTIC__VIEWPOINT:
			setViewpoint((String) newValue);
			return;
		case Accordant_rqPackage.TACTIC__SPOINT:
			getSpoint().clear();
			getSpoint().addAll((Collection<? extends SensitivityPoint>) newValue);
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
		case Accordant_rqPackage.TACTIC__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Accordant_rqPackage.TACTIC__QATTRIBUTE:
			setQAttribute(QATTRIBUTE_EDEFAULT);
			return;
		case Accordant_rqPackage.TACTIC__SUBTACTICS:
			getSubtactics().clear();
			return;
		case Accordant_rqPackage.TACTIC__RATIONALE:
			setRationale(RATIONALE_EDEFAULT);
			return;
		case Accordant_rqPackage.TACTIC__STIMULUS:
			setStimulus(STIMULUS_EDEFAULT);
			return;
		case Accordant_rqPackage.TACTIC__RESPONSE:
			setResponse(RESPONSE_EDEFAULT);
			return;
		case Accordant_rqPackage.TACTIC__VIEWPOINT:
			setViewpoint(VIEWPOINT_EDEFAULT);
			return;
		case Accordant_rqPackage.TACTIC__SPOINT:
			getSpoint().clear();
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
		case Accordant_rqPackage.TACTIC__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Accordant_rqPackage.TACTIC__QATTRIBUTE:
			return qAttribute != QATTRIBUTE_EDEFAULT;
		case Accordant_rqPackage.TACTIC__SUBTACTICS:
			return subtactics != null && !subtactics.isEmpty();
		case Accordant_rqPackage.TACTIC__RATIONALE:
			return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
		case Accordant_rqPackage.TACTIC__STIMULUS:
			return STIMULUS_EDEFAULT == null ? stimulus != null : !STIMULUS_EDEFAULT.equals(stimulus);
		case Accordant_rqPackage.TACTIC__RESPONSE:
			return RESPONSE_EDEFAULT == null ? response != null : !RESPONSE_EDEFAULT.equals(response);
		case Accordant_rqPackage.TACTIC__VIEWPOINT:
			return VIEWPOINT_EDEFAULT == null ? viewpoint != null : !VIEWPOINT_EDEFAULT.equals(viewpoint);
		case Accordant_rqPackage.TACTIC__SPOINT:
			return spoint != null && !spoint.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", qAttribute: ");
		result.append(qAttribute);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(", stimulus: ");
		result.append(stimulus);
		result.append(", response: ");
		result.append(response);
		result.append(", viewpoint: ");
		result.append(viewpoint);
		result.append(')');
		return result.toString();
	}

} //TacticImpl
