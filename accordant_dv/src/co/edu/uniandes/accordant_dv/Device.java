/**
 */
package co.edu.uniandes.accordant_dv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_dv.Device#getHost <em>Host</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Device#getType <em>Type</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Device#getCpu <em>Cpu</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Device#getStorage <em>Storage</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Device#getMem <em>Mem</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Device#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_dv.Device#getOs <em>Os</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDevice_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Device#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.accordant_dv.TypeDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see co.edu.uniandes.accordant_dv.TypeDevice
	 * @see #setType(TypeDevice)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDevice_Type()
	 * @model
	 * @generated
	 */
	TypeDevice getType();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Device#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see co.edu.uniandes.accordant_dv.TypeDevice
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDevice value);

	/**
	 * Returns the value of the '<em><b>Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu</em>' attribute.
	 * @see #setCpu(int)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDevice_Cpu()
	 * @model
	 * @generated
	 */
	int getCpu();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Device#getCpu <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu</em>' attribute.
	 * @see #getCpu()
	 * @generated
	 */
	void setCpu(int value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' attribute.
	 * @see #setStorage(int)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDevice_Storage()
	 * @model
	 * @generated
	 */
	int getStorage();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Device#getStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' attribute.
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(int value);

	/**
	 * Returns the value of the '<em><b>Mem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem</em>' attribute.
	 * @see #setMem(int)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDevice_Mem()
	 * @model
	 * @generated
	 */
	int getMem();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Device#getMem <em>Mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem</em>' attribute.
	 * @see #getMem()
	 * @generated
	 */
	void setMem(int value);

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
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDevice_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Device#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(String)
	 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDevice_Os()
	 * @model
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_dv.Device#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(String value);

} // Device
