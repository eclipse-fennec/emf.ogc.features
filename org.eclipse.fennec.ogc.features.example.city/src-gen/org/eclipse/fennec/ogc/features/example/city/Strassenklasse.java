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
package org.eclipse.fennec.ogc.features.example.city;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Strassenklasse</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStrassenklasse()
 * @model
 * @generated
 */
@ProviderType
public enum Strassenklasse implements Enumerator {
	/**
	 * The '<em><b>HAUPTSTRASSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAUPTSTRASSE_VALUE
	 * @generated
	 * @ordered
	 */
	HAUPTSTRASSE(0, "HAUPTSTRASSE", "Hauptstra\u00dfe"),

	/**
	 * The '<em><b>NEBENSTRASSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEBENSTRASSE_VALUE
	 * @generated
	 * @ordered
	 */
	NEBENSTRASSE(1, "NEBENSTRASSE", "Nebenstra\u00dfe"),

	/**
	 * The '<em><b>WOHNSTRASSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WOHNSTRASSE_VALUE
	 * @generated
	 * @ordered
	 */
	WOHNSTRASSE(2, "WOHNSTRASSE", "Wohnstra\u00dfe");

	/**
	 * The '<em><b>HAUPTSTRASSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAUPTSTRASSE
	 * @model literal="Hauptstra\337e"
	 * @generated
	 * @ordered
	 */
	public static final int HAUPTSTRASSE_VALUE = 0;

	/**
	 * The '<em><b>NEBENSTRASSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEBENSTRASSE
	 * @model literal="Nebenstra\337e"
	 * @generated
	 * @ordered
	 */
	public static final int NEBENSTRASSE_VALUE = 1;

	/**
	 * The '<em><b>WOHNSTRASSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WOHNSTRASSE
	 * @model literal="Wohnstra\337e"
	 * @generated
	 * @ordered
	 */
	public static final int WOHNSTRASSE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Strassenklasse</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Strassenklasse[] VALUES_ARRAY =
		new Strassenklasse[] {
			HAUPTSTRASSE,
			NEBENSTRASSE,
			WOHNSTRASSE,
		};

	/**
	 * A public read-only list of all the '<em><b>Strassenklasse</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Strassenklasse> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Strassenklasse</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Strassenklasse get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Strassenklasse result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Strassenklasse</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Strassenklasse getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Strassenklasse result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Strassenklasse</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Strassenklasse get(int value) {
		switch (value) {
			case HAUPTSTRASSE_VALUE: return HAUPTSTRASSE;
			case NEBENSTRASSE_VALUE: return NEBENSTRASSE;
			case WOHNSTRASSE_VALUE: return WOHNSTRASSE;
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
	private Strassenklasse(int value, String name, String literal) {
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
	
} //Strassenklasse
