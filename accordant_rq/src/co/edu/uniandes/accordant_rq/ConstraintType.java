/**
 */
package co.edu.uniandes.accordant_rq;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Constraint Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.accordant_rq.Accordant_rqPackage#getConstraintType()
 * @model
 * @generated
 */
public enum ConstraintType implements Enumerator {
	/**
	 * The '<em><b>CLOUD PROV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUD_PROV_VALUE
	 * @generated
	 * @ordered
	 */
	CLOUD_PROV(0, "CLOUD_PROV", "CLOUD_PROV"),

	/**
	 * The '<em><b>PROC MODEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROC_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	PROC_MODEL(0, "PROC_MODEL", "PROC_MODEL"),

	/**
	 * The '<em><b>LICENSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LICENSE_VALUE
	 * @generated
	 * @ordered
	 */
	LICENSE(0, "LICENSE", "LICENSE"),

	/**
	 * The '<em><b>TECH VENDOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECH_VENDOR_VALUE
	 * @generated
	 * @ordered
	 */
	TECH_VENDOR(0, "TECH_VENDOR", "TECH_VENDOR"),

	/**
	 * The '<em><b>ARCH STYLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCH_STYLE_VALUE
	 * @generated
	 * @ordered
	 */
	ARCH_STYLE(0, "ARCH_STYLE", "ARCH_STYLE");

	/**
	 * The '<em><b>CLOUD PROV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOUD PROV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOUD_PROV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOUD_PROV_VALUE = 0;

	/**
	 * The '<em><b>PROC MODEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROC MODEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROC_MODEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROC_MODEL_VALUE = 0;

	/**
	 * The '<em><b>LICENSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LICENSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LICENSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LICENSE_VALUE = 0;

	/**
	 * The '<em><b>TECH VENDOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TECH VENDOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TECH_VENDOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TECH_VENDOR_VALUE = 0;

	/**
	 * The '<em><b>ARCH STYLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARCH STYLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARCH_STYLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARCH_STYLE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Constraint Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConstraintType[] VALUES_ARRAY =
		new ConstraintType[] {
			CLOUD_PROV,
			PROC_MODEL,
			LICENSE,
			TECH_VENDOR,
			ARCH_STYLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Constraint Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConstraintType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Constraint Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintType get(int value) {
		switch (value) {
			case CLOUD_PROV_VALUE: return CLOUD_PROV;
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
	private ConstraintType(int value, String name, String literal) {
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
	
} //ConstraintType
