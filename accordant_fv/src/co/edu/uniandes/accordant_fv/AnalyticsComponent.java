/**
 */
package co.edu.uniandes.accordant_fv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analytics Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_fv.AnalyticsComponent#getPmml <em>Pmml</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getAnalyticsComponent()
 * @model abstract="true"
 * @generated
 */
public interface AnalyticsComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Pmml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pmml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pmml</em>' attribute.
	 * @see #setPmml(String)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getAnalyticsComponent_Pmml()
	 * @model
	 * @generated
	 */
	String getPmml();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.AnalyticsComponent#getPmml <em>Pmml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pmml</em>' attribute.
	 * @see #getPmml()
	 * @generated
	 */
	void setPmml(String value);

} // AnalyticsComponent
