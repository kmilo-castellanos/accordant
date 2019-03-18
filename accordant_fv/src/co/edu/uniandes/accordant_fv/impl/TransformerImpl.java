/**
 */
package co.edu.uniandes.accordant_fv.impl;

import co.edu.uniandes.accordant_fv.Accordant_fvPackage;
import co.edu.uniandes.accordant_fv.Transformer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.TransformerImpl#getSqlExp <em>Sql Exp</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.TransformerImpl#getLambdaExp <em>Lambda Exp</em>}</li>
 *   <li>{@link co.edu.uniandes.accordant_fv.impl.TransformerImpl#getCodeRepo <em>Code Repo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerImpl extends AnalyticsComponentImpl implements Transformer {
	/**
	 * The default value of the '{@link #getSqlExp() <em>Sql Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlExp()
	 * @generated
	 * @ordered
	 */
	protected static final String SQL_EXP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSqlExp() <em>Sql Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlExp()
	 * @generated
	 * @ordered
	 */
	protected String sqlExp = SQL_EXP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLambdaExp() <em>Lambda Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaExp()
	 * @generated
	 * @ordered
	 */
	protected static final String LAMBDA_EXP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLambdaExp() <em>Lambda Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaExp()
	 * @generated
	 * @ordered
	 */
	protected String lambdaExp = LAMBDA_EXP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeRepo() <em>Code Repo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeRepo()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_REPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeRepo() <em>Code Repo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeRepo()
	 * @generated
	 * @ordered
	 */
	protected String codeRepo = CODE_REPO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Accordant_fvPackage.Literals.TRANSFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSqlExp() {
		return sqlExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlExp(String newSqlExp) {
		String oldSqlExp = sqlExp;
		sqlExp = newSqlExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.TRANSFORMER__SQL_EXP, oldSqlExp, sqlExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLambdaExp() {
		return lambdaExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLambdaExp(String newLambdaExp) {
		String oldLambdaExp = lambdaExp;
		lambdaExp = newLambdaExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.TRANSFORMER__LAMBDA_EXP, oldLambdaExp, lambdaExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeRepo() {
		return codeRepo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeRepo(String newCodeRepo) {
		String oldCodeRepo = codeRepo;
		codeRepo = newCodeRepo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Accordant_fvPackage.TRANSFORMER__CODE_REPO, oldCodeRepo, codeRepo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Accordant_fvPackage.TRANSFORMER__SQL_EXP:
				return getSqlExp();
			case Accordant_fvPackage.TRANSFORMER__LAMBDA_EXP:
				return getLambdaExp();
			case Accordant_fvPackage.TRANSFORMER__CODE_REPO:
				return getCodeRepo();
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
			case Accordant_fvPackage.TRANSFORMER__SQL_EXP:
				setSqlExp((String)newValue);
				return;
			case Accordant_fvPackage.TRANSFORMER__LAMBDA_EXP:
				setLambdaExp((String)newValue);
				return;
			case Accordant_fvPackage.TRANSFORMER__CODE_REPO:
				setCodeRepo((String)newValue);
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
			case Accordant_fvPackage.TRANSFORMER__SQL_EXP:
				setSqlExp(SQL_EXP_EDEFAULT);
				return;
			case Accordant_fvPackage.TRANSFORMER__LAMBDA_EXP:
				setLambdaExp(LAMBDA_EXP_EDEFAULT);
				return;
			case Accordant_fvPackage.TRANSFORMER__CODE_REPO:
				setCodeRepo(CODE_REPO_EDEFAULT);
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
			case Accordant_fvPackage.TRANSFORMER__SQL_EXP:
				return SQL_EXP_EDEFAULT == null ? sqlExp != null : !SQL_EXP_EDEFAULT.equals(sqlExp);
			case Accordant_fvPackage.TRANSFORMER__LAMBDA_EXP:
				return LAMBDA_EXP_EDEFAULT == null ? lambdaExp != null : !LAMBDA_EXP_EDEFAULT.equals(lambdaExp);
			case Accordant_fvPackage.TRANSFORMER__CODE_REPO:
				return CODE_REPO_EDEFAULT == null ? codeRepo != null : !CODE_REPO_EDEFAULT.equals(codeRepo);
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
		result.append(" (sqlExp: ");
		result.append(sqlExp);
		result.append(", lambdaExp: ");
		result.append(lambdaExp);
		result.append(", codeRepo: ");
		result.append(codeRepo);
		result.append(')');
		return result.toString();
	}

} //TransformerImpl
