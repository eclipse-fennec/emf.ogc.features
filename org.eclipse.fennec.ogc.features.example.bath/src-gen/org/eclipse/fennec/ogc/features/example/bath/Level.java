/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Data In Motion - initial API and implementation
 */
package org.eclipse.fennec.ogc.features.example.bath;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getLevel()
 * @model
 * @generated
 */
@ProviderType
public enum Level implements Enumerator {
	/**
	 * The '<em><b>GROUND FLOOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUND_FLOOR_VALUE
	 * @generated
	 * @ordered
	 */
	GROUND_FLOOR(0, "GROUND_FLOOR", "GROUND_FLOOR"),

	/**
	 * The '<em><b>UPPER FLOOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPER_FLOOR_VALUE
	 * @generated
	 * @ordered
	 */
	UPPER_FLOOR(1, "UPPER_FLOOR", "UPPER_FLOOR"),

	/**
	 * The '<em><b>BASEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	BASEMENT(2, "BASEMENT", "BASEMENT"),

	/**
	 * The '<em><b>OUTDOOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTDOOR_VALUE
	 * @generated
	 * @ordered
	 */
	OUTDOOR(3, "OUTDOOR", "OUTDOOR");

	/**
	 * The '<em><b>GROUND FLOOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUND_FLOOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_FLOOR_VALUE = 0;

	/**
	 * The '<em><b>UPPER FLOOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPER_FLOOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPPER_FLOOR_VALUE = 1;

	/**
	 * The '<em><b>BASEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BASEMENT_VALUE = 2;

	/**
	 * The '<em><b>OUTDOOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTDOOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OUTDOOR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Level[] VALUES_ARRAY =
		new Level[] {
			GROUND_FLOOR,
			UPPER_FLOOR,
			BASEMENT,
			OUTDOOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Level> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Level get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Level result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Level getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Level result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Level get(int value) {
		switch (value) {
			case GROUND_FLOOR_VALUE: return GROUND_FLOOR;
			case UPPER_FLOOR_VALUE: return UPPER_FLOOR;
			case BASEMENT_VALUE: return BASEMENT;
			case OUTDOOR_VALUE: return OUTDOOR;
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
	private Level(int value, String name, String literal) {
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
	
} //Level
