/**
 */
package co.edu.uniandes.accordant_fv;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Delivery Model</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.accordant_fv.Accordant_fvPackage#getDeliveryModel()
 * @model
 * @generated
 */
public enum DeliveryModel implements Enumerator {
	/**
	 * The '<em><b>BEST EFFORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_EFFORT_VALUE
	 * @generated
	 * @ordered
	 */
	BEST_EFFORT(0, "BEST_EFFORT", "BEST_EFFORT"),

	/**
	 * The '<em><b>AT LEAST ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_LEAST_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	AT_LEAST_ONE(1, "AT_LEAST_ONE", "AT_LEAST_ONE"),

	/**
	 * The '<em><b>AT MOST ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_MOST_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	AT_MOST_ONE(2, "AT_MOST_ONE", "AT_MOST_ONE"),

	/**
	 * The '<em><b>EXACTLY ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXACTLY_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	EXACTLY_ONE(3, "EXACTLY_ONE", "EXACTLY_ONE");

	/**
	 * The '<em><b>BEST EFFORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEST EFFORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEST_EFFORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEST_EFFORT_VALUE = 0;

	/**
	 * The '<em><b>AT LEAST ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AT LEAST ONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AT_LEAST_ONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AT_LEAST_ONE_VALUE = 1;

	/**
	 * The '<em><b>AT MOST ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AT MOST ONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AT_MOST_ONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AT_MOST_ONE_VALUE = 2;

	/**
	 * The '<em><b>EXACTLY ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXACTLY ONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXACTLY_ONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXACTLY_ONE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Delivery Model</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeliveryModel[] VALUES_ARRAY =
		new DeliveryModel[] {
			BEST_EFFORT,
			AT_LEAST_ONE,
			AT_MOST_ONE,
			EXACTLY_ONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Delivery Model</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeliveryModel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Delivery Model</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeliveryModel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeliveryModel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Delivery Model</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeliveryModel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeliveryModel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Delivery Model</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeliveryModel get(int value) {
		switch (value) {
			case BEST_EFFORT_VALUE: return BEST_EFFORT;
			case AT_LEAST_ONE_VALUE: return AT_LEAST_ONE;
			case AT_MOST_ONE_VALUE: return AT_MOST_ONE;
			case EXACTLY_ONE_VALUE: return EXACTLY_ONE;
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
	private DeliveryModel(int value, String name, String literal) {
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
	
} //DeliveryModel
