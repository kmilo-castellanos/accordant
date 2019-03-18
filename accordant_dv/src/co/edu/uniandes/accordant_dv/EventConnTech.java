/**
 */
package co.edu.uniandes.accordant_dv;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Event Conn Tech</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.accordant_dv.Accordant_dvPackage#getEventConnTech()
 * @model
 * @generated
 */
public enum EventConnTech implements Enumerator {
	/**
	 * The '<em><b>KAFKA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KAFKA_VALUE
	 * @generated
	 * @ordered
	 */
	KAFKA(0, "KAFKA", "KAFKA"),

	/**
	 * The '<em><b>ACTIVEMQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVEMQ_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVEMQ(0, "ACTIVEMQ", "ACTIVEMQ"),

	/**
	 * The '<em><b>RABBITMQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RABBITMQ_VALUE
	 * @generated
	 * @ordered
	 */
	RABBITMQ(0, "RABBITMQ", "RABBITMQ");

	/**
	 * The '<em><b>KAFKA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KAFKA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KAFKA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KAFKA_VALUE = 0;

	/**
	 * The '<em><b>ACTIVEMQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACTIVEMQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVEMQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVEMQ_VALUE = 0;

	/**
	 * The '<em><b>RABBITMQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RABBITMQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RABBITMQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RABBITMQ_VALUE = 0;

	/**
	 * An array of all the '<em><b>Event Conn Tech</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EventConnTech[] VALUES_ARRAY =
		new EventConnTech[] {
			KAFKA,
			ACTIVEMQ,
			RABBITMQ,
		};

	/**
	 * A public read-only list of all the '<em><b>Event Conn Tech</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EventConnTech> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Event Conn Tech</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventConnTech get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventConnTech result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Conn Tech</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventConnTech getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventConnTech result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Conn Tech</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventConnTech get(int value) {
		switch (value) {
			case KAFKA_VALUE: return KAFKA;
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
	private EventConnTech(int value, String name, String literal) {
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
	
} //EventConnTech
