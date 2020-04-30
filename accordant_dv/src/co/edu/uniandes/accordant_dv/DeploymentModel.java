/**
 */
package co.edu.uniandes.accordant_dv;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Deployment Model</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getDeploymentModel()
 * @model
 * @generated
 */
public enum DeploymentModel implements Enumerator {
	/**
	 * The '<em><b>ONPREMISES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONPREMISES_VALUE
	 * @generated
	 * @ordered
	 */
	ONPREMISES(0, "ONPREMISES", "ONPREMISES"),

	/**
	 * The '<em><b>CLOUD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUD_VALUE
	 * @generated
	 * @ordered
	 */
	CLOUD(1, "CLOUD", "CLOUD"),

	/**
	 * The '<em><b>HYBRID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYBRID_VALUE
	 * @generated
	 * @ordered
	 */
	HYBRID(2, "HYBRID", "HYBRID");

	/**
	 * The '<em><b>ONPREMISES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONPREMISES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONPREMISES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONPREMISES_VALUE = 0;

	/**
	 * The '<em><b>CLOUD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOUD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOUD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOUD_VALUE = 1;

	/**
	 * The '<em><b>HYBRID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HYBRID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HYBRID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HYBRID_VALUE = 2;

	/**
	 * An array of all the '<em><b>Deployment Model</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeploymentModel[] VALUES_ARRAY =
		new DeploymentModel[] {
			ONPREMISES,
			CLOUD,
			HYBRID,
		};

	/**
	 * A public read-only list of all the '<em><b>Deployment Model</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeploymentModel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Deployment Model</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentModel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeploymentModel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployment Model</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentModel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeploymentModel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployment Model</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentModel get(int value) {
		switch (value) {
			case ONPREMISES_VALUE: return ONPREMISES;
			case CLOUD_VALUE: return CLOUD;
			case HYBRID_VALUE: return HYBRID;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DeploymentModel(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DeploymentModel
