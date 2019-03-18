/**
 */
package co.edu.uniandes.accordant_fv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_fv.Transformer#getSqlExp <em>Sql Exp</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Transformer#getLambdaExp <em>Lambda Exp</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.Transformer#getCodeRepo <em>Code Repo</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getTransformer()
 * @model
 * @generated
 */
public interface Transformer extends AnalyticsComponent {
	/**
	 * Returns the value of the '<em><b>Sql Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Exp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Exp</em>' attribute.
	 * @see #setSqlExp(String)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getTransformer_SqlExp()
	 * @model
	 * @generated
	 */
	String getSqlExp();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Transformer#getSqlExp <em>Sql Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Exp</em>' attribute.
	 * @see #getSqlExp()
	 * @generated
	 */
	void setSqlExp(String value);

	/**
	 * Returns the value of the '<em><b>Lambda Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lambda Exp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda Exp</em>' attribute.
	 * @see #setLambdaExp(String)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getTransformer_LambdaExp()
	 * @model
	 * @generated
	 */
	String getLambdaExp();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Transformer#getLambdaExp <em>Lambda Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda Exp</em>' attribute.
	 * @see #getLambdaExp()
	 * @generated
	 */
	void setLambdaExp(String value);

	/**
	 * Returns the value of the '<em><b>Code Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Repo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Repo</em>' attribute.
	 * @see #setCodeRepo(String)
	 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getTransformer_CodeRepo()
	 * @model
	 * @generated
	 */
	String getCodeRepo();

	/**
	 * Sets the value of the '{@link co.edu.uniandes.accordant_fv.Transformer#getCodeRepo <em>Code Repo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Repo</em>' attribute.
	 * @see #getCodeRepo()
	 * @generated
	 */
	void setCodeRepo(String value);

} // Transformer
