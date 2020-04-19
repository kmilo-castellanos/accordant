/**
 */
package co.edu.uniandes.accordant_rq;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>QAttribute</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getQAttribute()
 * @model
 * @generated
 */
public enum QAttribute implements Enumerator {
	/**
	 * The '<em><b>AVAILABILITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	AVAILABILITY(0, "AVAILABILITY", "AVAILABILITY"),

	/**
	 * The '<em><b>PERFORMANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERFORMANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PERFORMANCE(1, "PERFORMANCE", "PERFORMANCE"),

	/**
	 * The '<em><b>MODIFIABILITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODIFIABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFIABILITY(2, "MODIFIABILITY", "MODIFIABILITY"),

	/**
	 * The '<em><b>TESTABILITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TESTABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	TESTABILITY(3, "TESTABILITY", "TESTABILITY"),

	/**
	 * The '<em><b>SCALABILITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCALABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	SCALABILITY(4, "SCALABILITY", "SCALABILITY");

	/**
	 * The '<em><b>AVAILABILITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AVAILABILITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVAILABILITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVAILABILITY_VALUE = 0;

	/**
	 * The '<em><b>PERFORMANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERFORMANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERFORMANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERFORMANCE_VALUE = 1;

	/**
	 * The '<em><b>MODIFIABILITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODIFIABILITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODIFIABILITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODIFIABILITY_VALUE = 2;

	/**
	 * The '<em><b>TESTABILITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TESTABILITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TESTABILITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TESTABILITY_VALUE = 3;

	/**
	 * The '<em><b>SCALABILITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCALABILITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCALABILITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCALABILITY_VALUE = 4;

	/**
	 * An array of all the '<em><b>QAttribute</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QAttribute[] VALUES_ARRAY =
		new QAttribute[] {
			AVAILABILITY,
			PERFORMANCE,
			MODIFIABILITY,
			TESTABILITY,
			SCALABILITY,
		};

	/**
	 * A public read-only list of all the '<em><b>QAttribute</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QAttribute> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>QAttribute</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QAttribute get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QAttribute result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>QAttribute</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QAttribute getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QAttribute result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>QAttribute</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QAttribute get(int value) {
		switch (value) {
			case AVAILABILITY_VALUE: return AVAILABILITY;
			case PERFORMANCE_VALUE: return PERFORMANCE;
			case MODIFIABILITY_VALUE: return MODIFIABILITY;
			case TESTABILITY_VALUE: return TESTABILITY;
			case SCALABILITY_VALUE: return SCALABILITY;
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
	private QAttribute(int value, String name, String literal) {
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
	
} //QAttribute
