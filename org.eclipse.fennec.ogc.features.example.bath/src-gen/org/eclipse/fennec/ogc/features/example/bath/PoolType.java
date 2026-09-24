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
 * A representation of the literals of the enumeration '<em><b>Pool Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getPoolType()
 * @model
 * @generated
 */
@ProviderType
public enum PoolType implements Enumerator {
	/**
	 * The '<em><b>SWIMMER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWIMMER_VALUE
	 * @generated
	 * @ordered
	 */
	SWIMMER(0, "SWIMMER", "SWIMMER"),

	/**
	 * The '<em><b>NON SWIMMER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_SWIMMER_VALUE
	 * @generated
	 * @ordered
	 */
	NON_SWIMMER(1, "NON_SWIMMER", "NON_SWIMMER"),

	/**
	 * The '<em><b>KIDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KIDS_VALUE
	 * @generated
	 * @ordered
	 */
	KIDS(2, "KIDS", "KIDS"),

	/**
	 * The '<em><b>WAVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAVE_VALUE
	 * @generated
	 * @ordered
	 */
	WAVE(3, "WAVE", "WAVE"),

	/**
	 * The '<em><b>OUTDOOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTDOOR_VALUE
	 * @generated
	 * @ordered
	 */
	OUTDOOR(4, "OUTDOOR", "OUTDOOR"),

	/**
	 * The '<em><b>WHIRLPOOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHIRLPOOL_VALUE
	 * @generated
	 * @ordered
	 */
	WHIRLPOOL(5, "WHIRLPOOL", "WHIRLPOOL"),

	/**
	 * The '<em><b>DIVING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVING_VALUE
	 * @generated
	 * @ordered
	 */
	DIVING(6, "DIVING", "DIVING"),

	/**
	 * The '<em><b>SOLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLE_VALUE
	 * @generated
	 * @ordered
	 */
	SOLE(7, "SOLE", "SOLE"),

	/**
	 * The '<em><b>LANDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANDING_VALUE
	 * @generated
	 * @ordered
	 */
	LANDING(8, "LANDING", "LANDING");

	/**
	 * The '<em><b>SWIMMER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWIMMER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SWIMMER_VALUE = 0;

	/**
	 * The '<em><b>NON SWIMMER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_SWIMMER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NON_SWIMMER_VALUE = 1;

	/**
	 * The '<em><b>KIDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KIDS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KIDS_VALUE = 2;

	/**
	 * The '<em><b>WAVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAVE_VALUE = 3;

	/**
	 * The '<em><b>OUTDOOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTDOOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OUTDOOR_VALUE = 4;

	/**
	 * The '<em><b>WHIRLPOOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHIRLPOOL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHIRLPOOL_VALUE = 5;

	/**
	 * The '<em><b>DIVING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIVING_VALUE = 6;

	/**
	 * The '<em><b>SOLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOLE_VALUE = 7;

	/**
	 * The '<em><b>LANDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LANDING_VALUE = 8;

	/**
	 * An array of all the '<em><b>Pool Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PoolType[] VALUES_ARRAY =
		new PoolType[] {
			SWIMMER,
			NON_SWIMMER,
			KIDS,
			WAVE,
			OUTDOOR,
			WHIRLPOOL,
			DIVING,
			SOLE,
			LANDING,
		};

	/**
	 * A public read-only list of all the '<em><b>Pool Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PoolType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pool Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PoolType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PoolType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pool Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PoolType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PoolType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pool Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PoolType get(int value) {
		switch (value) {
			case SWIMMER_VALUE: return SWIMMER;
			case NON_SWIMMER_VALUE: return NON_SWIMMER;
			case KIDS_VALUE: return KIDS;
			case WAVE_VALUE: return WAVE;
			case OUTDOOR_VALUE: return OUTDOOR;
			case WHIRLPOOL_VALUE: return WHIRLPOOL;
			case DIVING_VALUE: return DIVING;
			case SOLE_VALUE: return SOLE;
			case LANDING_VALUE: return LANDING;
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
	private PoolType(int value, String name, String literal) {
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
	
} //PoolType
