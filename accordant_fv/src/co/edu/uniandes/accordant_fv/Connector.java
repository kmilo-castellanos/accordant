/**
 */
package co.edu.uniandes.accordant_fv;

import co.edu.uniandes.accordant_rq.ArchDecision;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_fv.Connector#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Connector#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Connector#getSynct <em>Synct</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Connector#getNotification <em>Notification</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Connector#getBuffering <em>Buffering</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Connector#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Connector#getRoles <em>Roles</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Connector#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Connector#getDecision <em>Decision</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Connector#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getConnector()
 * @model abstract="true"
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getConnector_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Connector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Delivery</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.accordant_fv.DeliveryGuarantee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.DeliveryGuarantee
	 * @see #setDelivery(DeliveryGuarantee)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getConnector_Delivery()
	 * @model
	 * @generated
	 */
	DeliveryGuarantee getDelivery();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Connector#getDelivery <em>Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.DeliveryGuarantee
	 * @see #getDelivery()
	 * @generated
	 */
	void setDelivery(DeliveryGuarantee value);

	/**
	 * Returns the value of the '<em><b>Synct</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.accordant_fv.SyncType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synct</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.SyncType
	 * @see #setSynct(SyncType)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getConnector_Synct()
	 * @model
	 * @generated
	 */
	SyncType getSynct();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Connector#getSynct <em>Synct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synct</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.SyncType
	 * @see #getSynct()
	 * @generated
	 */
	void setSynct(SyncType value);

	/**
	 * Returns the value of the '<em><b>Notification</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.accordant_fv.NotificationModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.NotificationModel
	 * @see #setNotification(NotificationModel)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getConnector_Notification()
	 * @model
	 * @generated
	 */
	NotificationModel getNotification();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Connector#getNotification <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.NotificationModel
	 * @see #getNotification()
	 * @generated
	 */
	void setNotification(NotificationModel value);

	/**
	 * Returns the value of the '<em><b>Buffering</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.accordant_fv.Buffering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffering</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.Buffering
	 * @see #setBuffering(Buffering)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getConnector_Buffering()
	 * @model
	 * @generated
	 */
	Buffering getBuffering();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Connector#getBuffering <em>Buffering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffering</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.Buffering
	 * @see #getBuffering()
	 * @generated
	 */
	void setBuffering(Buffering value);

	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.accordant_fv.Throughput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throughput</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.Throughput
	 * @see #setThroughput(Throughput)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getConnector_Throughput()
	 * @model
	 * @generated
	 */
	Throughput getThroughput();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Connector#getThroughput <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.Throughput
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(Throughput value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link co.edu.uniandes.accordant_fv.Role}.
	 * It is bidirectional and its opposite is '{@link co.edu.uniandes.accordant_fv.Role#getConn <em>Conn</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getConnector_Roles()
	 * @see co.edu.uniandes.accordant_fv.Role#getConn
	 * @model opposite="conn" containment="true" required="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getConnector_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Connector#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision</em>' reference.
	 * @see #setDecision(ArchDecision)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getConnector_Decision()
	 * @model
	 * @generated
	 */
	ArchDecision getDecision();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Connector#getDecision <em>Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision</em>' reference.
	 * @see #getDecision()
	 * @generated
	 */
	void setDecision(ArchDecision value);

	/**
	 * Returns the value of the '<em><b>Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Props</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Props</em>' attribute.
	 * @see #setProps(String)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getConnector_Props()
	 * @model
	 * @generated
	 */
	String getProps();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Connector#getProps <em>Props</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Props</em>' attribute.
	 * @see #getProps()
	 * @generated
	 */
	void setProps(String value);

} // Connector
