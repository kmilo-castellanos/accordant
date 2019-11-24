/**
 */
package co.edu.uniandes.accordant_fv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_fv.Sink#getConn <em>Conn</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Sink#getFormat <em>Format</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Sink#getType <em>Type</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Sink#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getSink()
 * @model
 * @generated
 */
public interface Sink extends Component {
	/**
	 * Returns the value of the '<em><b>Conn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conn</em>' attribute.
	 * @see #setConn(String)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getSink_Conn()
	 * @model
	 * @generated
	 */
	String getConn();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Sink#getConn <em>Conn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn</em>' attribute.
	 * @see #getConn()
	 * @generated
	 */
	void setConn(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getSink_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Sink#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link co.edu.uniandes.accordant_fv.AccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.AccessType
	 * @see #setType(AccessType)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getSink_Type()
	 * @model
	 * @generated
	 */
	AccessType getType();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Sink#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see co.edu.uniandes.accordant_fv.AccessType
	 * @see #getType()
	 * @generated
	 */
	void setType(AccessType value);

	/**
	 * Returns the value of the '<em><b>Props</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Props</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Props</em>' attribute.
	 * @see #setProps(String)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getSink_Props()
	 * @model default=""
	 * @generated
	 */
	String getProps();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Sink#getProps <em>Props</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Props</em>' attribute.
	 * @see #getProps()
	 * @generated
	 */
	void setProps(String value);

} // Sink
