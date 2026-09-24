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
 * A representation of the literals of the enumeration '<em><b>Sauna Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getSaunaType()
 * @model
 * @generated
 */
@ProviderType
public enum SaunaType implements Enumerator {
	/**
	 * The '<em><b>FINNISH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINNISH_VALUE
	 * @generated
	 * @ordered
	 */
	FINNISH(0, "FINNISH", "FINNISH"),

	/**
	 * The '<em><b>BIO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIO_VALUE
	 * @generated
	 * @ordered
	 */
	BIO(1, "BIO", "BIO"),

	/**
	 * The '<em><b>STEAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEAM_VALUE
	 * @generated
	 * @ordered
	 */
	STEAM(2, "STEAM", "STEAM"),

	/**
	 * The '<em><b>INFRARED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFRARED_VALUE
	 * @generated
	 * @ordered
	 */
	INFRARED(3, "INFRARED", "INFRARED");

	/**
	 * The '<em><b>FINNISH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINNISH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FINNISH_VALUE = 0;

	/**
	 * The '<em><b>BIO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIO_VALUE = 1;

	/**
	 * The '<em><b>STEAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_VALUE = 2;

	/**
	 * The '<em><b>INFRARED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFRARED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFRARED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Sauna Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SaunaType[] VALUES_ARRAY =
		new SaunaType[] {
			FINNISH,
			BIO,
			STEAM,
			INFRARED,
		};

	/**
	 * A public read-only list of all the '<em><b>Sauna Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SaunaType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sauna Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SaunaType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SaunaType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sauna Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SaunaType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SaunaType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sauna Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SaunaType get(int value) {
		switch (value) {
			case FINNISH_VALUE: return FINNISH;
			case BIO_VALUE: return BIO;
			case STEAM_VALUE: return STEAM;
			case INFRARED_VALUE: return INFRARED;
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
	private SaunaType(int value, String name, String literal) {
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
	
} //SaunaType
