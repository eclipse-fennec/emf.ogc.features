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
 * A representation of the literals of the enumeration '<em><b>Sport Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getSportType()
 * @model
 * @generated
 */
@ProviderType
public enum SportType implements Enumerator {
	/**
	 * The '<em><b>BEACH VOLLEYBALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEACH_VOLLEYBALL_VALUE
	 * @generated
	 * @ordered
	 */
	BEACH_VOLLEYBALL(0, "BEACH_VOLLEYBALL", "BEACH_VOLLEYBALL"),

	/**
	 * The '<em><b>SOCCER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCCER_VALUE
	 * @generated
	 * @ordered
	 */
	SOCCER(1, "SOCCER", "SOCCER"),

	/**
	 * The '<em><b>TABLE TENNIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_TENNIS_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE_TENNIS(2, "TABLE_TENNIS", "TABLE_TENNIS"),

	/**
	 * The '<em><b>FITNESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FITNESS_VALUE
	 * @generated
	 * @ordered
	 */
	FITNESS(3, "FITNESS", "FITNESS"),

	/**
	 * The '<em><b>BASKETBALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASKETBALL_VALUE
	 * @generated
	 * @ordered
	 */
	BASKETBALL(4, "BASKETBALL", "BASKETBALL");

	/**
	 * The '<em><b>BEACH VOLLEYBALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEACH_VOLLEYBALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEACH_VOLLEYBALL_VALUE = 0;

	/**
	 * The '<em><b>SOCCER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCCER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOCCER_VALUE = 1;

	/**
	 * The '<em><b>TABLE TENNIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_TENNIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_TENNIS_VALUE = 2;

	/**
	 * The '<em><b>FITNESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FITNESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FITNESS_VALUE = 3;

	/**
	 * The '<em><b>BASKETBALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASKETBALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BASKETBALL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Sport Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SportType[] VALUES_ARRAY =
		new SportType[] {
			BEACH_VOLLEYBALL,
			SOCCER,
			TABLE_TENNIS,
			FITNESS,
			BASKETBALL,
		};

	/**
	 * A public read-only list of all the '<em><b>Sport Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SportType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sport Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SportType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SportType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sport Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SportType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SportType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sport Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SportType get(int value) {
		switch (value) {
			case BEACH_VOLLEYBALL_VALUE: return BEACH_VOLLEYBALL;
			case SOCCER_VALUE: return SOCCER;
			case TABLE_TENNIS_VALUE: return TABLE_TENNIS;
			case FITNESS_VALUE: return FITNESS;
			case BASKETBALL_VALUE: return BASKETBALL;
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
	private SportType(int value, String name, String literal) {
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
	
} //SportType
