/**
 */
package co.edu.uniandes.accordant_dv;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Estimator Tech</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getEstimatorTech()
 * @model
 * @generated
 */
public enum EstimatorTech implements Enumerator {
	/**
	 * The '<em><b>SPARKMLIB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPARKMLIB_VALUE
	 * @generated
	 * @ordered
	 */
	SPARKMLIB(7, "SPARKMLIB", "SPARKMLIB"),

	/**
	 * The '<em><b>SCIKIT LEARN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCIKIT_LEARN_VALUE
	 * @generated
	 * @ordered
	 */
	SCIKIT_LEARN(1, "SCIKIT_LEARN", "SCIKIT_LEARN"),

	/**
	 * The '<em><b>MAHOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAHOUT_VALUE
	 * @generated
	 * @ordered
	 */
	MAHOUT(2, "MAHOUT", "MAHOUT"),

	/**
	 * The '<em><b>OPENSCORING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENSCORING_VALUE
	 * @generated
	 * @ordered
	 */
	OPENSCORING(3, "OPENSCORING", "OPENSCORING"),

	/**
	 * The '<em><b>JPMML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JPMML_VALUE
	 * @generated
	 * @ordered
	 */
	JPMML(4, "JPMML", "JPMML");

	/**
	 * The '<em><b>SPARKMLIB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPARKMLIB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPARKMLIB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPARKMLIB_VALUE = 7;

	/**
	 * The '<em><b>SCIKIT LEARN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCIKIT LEARN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCIKIT_LEARN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCIKIT_LEARN_VALUE = 1;

	/**
	 * The '<em><b>MAHOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAHOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAHOUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAHOUT_VALUE = 2;

	/**
	 * The '<em><b>OPENSCORING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPENSCORING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPENSCORING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPENSCORING_VALUE = 3;

	/**
	 * The '<em><b>JPMML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JPMML</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JPMML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JPMML_VALUE = 4;

	/**
	 * An array of all the '<em><b>Estimator Tech</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EstimatorTech[] VALUES_ARRAY =
		new EstimatorTech[] {
			SPARKMLIB,
			SCIKIT_LEARN,
			MAHOUT,
			OPENSCORING,
			JPMML,
		};

	/**
	 * A public read-only list of all the '<em><b>Estimator Tech</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EstimatorTech> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Estimator Tech</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EstimatorTech get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EstimatorTech result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Estimator Tech</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EstimatorTech getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EstimatorTech result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Estimator Tech</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EstimatorTech get(int value) {
		switch (value) {
			case SPARKMLIB_VALUE: return SPARKMLIB;
			case SCIKIT_LEARN_VALUE: return SCIKIT_LEARN;
			case MAHOUT_VALUE: return MAHOUT;
			case OPENSCORING_VALUE: return OPENSCORING;
			case JPMML_VALUE: return JPMML;
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
	private EstimatorTech(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //EstimatorTech
