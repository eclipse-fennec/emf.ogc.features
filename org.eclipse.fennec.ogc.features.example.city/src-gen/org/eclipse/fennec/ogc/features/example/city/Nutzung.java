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
 * A representation of the literals of the enumeration '<em><b>Nutzung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getNutzung()
 * @model
 * @generated
 */
@ProviderType
public enum Nutzung implements Enumerator {
	/**
	 * The '<em><b>WIESE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIESE_VALUE
	 * @generated
	 * @ordered
	 */
	WIESE(0, "WIESE", "Wiese"),

	/**
	 * The '<em><b>FELD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FELD_VALUE
	 * @generated
	 * @ordered
	 */
	FELD(1, "FELD", "Feld"),

	/**
	 * The '<em><b>OBSTWIESE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSTWIESE_VALUE
	 * @generated
	 * @ordered
	 */
	OBSTWIESE(2, "OBSTWIESE", "Obstwiese"),

	/**
	 * The '<em><b>KLEINGAERTEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KLEINGAERTEN_VALUE
	 * @generated
	 * @ordered
	 */
	KLEINGAERTEN(3, "KLEINGAERTEN", "Kleing\u00e4rten"),

	/**
	 * The '<em><b>WALD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WALD_VALUE
	 * @generated
	 * @ordered
	 */
	WALD(4, "WALD", "Wald"),

	/**
	 * The '<em><b>PARK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARK_VALUE
	 * @generated
	 * @ordered
	 */
	PARK(5, "PARK", "Park"),

	/**
	 * The '<em><b>MARKTPLATZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKTPLATZ_VALUE
	 * @generated
	 * @ordered
	 */
	MARKTPLATZ(6, "MARKTPLATZ", "Marktplatz"),

	/**
	 * The '<em><b>SCHULHOF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHULHOF_VALUE
	 * @generated
	 * @ordered
	 */
	SCHULHOF(7, "SCHULHOF", "Schulhof"),

	/**
	 * The '<em><b>FRIEDHOF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIEDHOF_VALUE
	 * @generated
	 * @ordered
	 */
	FRIEDHOF(8, "FRIEDHOF", "Friedhof"),

	/**
	 * The '<em><b>KLINIKGELAENDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KLINIKGELAENDE_VALUE
	 * @generated
	 * @ordered
	 */
	KLINIKGELAENDE(9, "KLINIKGELAENDE", "Klinikgel\u00e4nde"),

	/**
	 * The '<em><b>SPORTPLATZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPORTPLATZ_VALUE
	 * @generated
	 * @ordered
	 */
	SPORTPLATZ(10, "SPORTPLATZ", "Sportplatz");

	/**
	 * The '<em><b>WIESE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIESE
	 * @model literal="Wiese"
	 * @generated
	 * @ordered
	 */
	public static final int WIESE_VALUE = 0;

	/**
	 * The '<em><b>FELD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FELD
	 * @model literal="Feld"
	 * @generated
	 * @ordered
	 */
	public static final int FELD_VALUE = 1;

	/**
	 * The '<em><b>OBSTWIESE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSTWIESE
	 * @model literal="Obstwiese"
	 * @generated
	 * @ordered
	 */
	public static final int OBSTWIESE_VALUE = 2;

	/**
	 * The '<em><b>KLEINGAERTEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KLEINGAERTEN
	 * @model literal="Kleing\344rten"
	 * @generated
	 * @ordered
	 */
	public static final int KLEINGAERTEN_VALUE = 3;

	/**
	 * The '<em><b>WALD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WALD
	 * @model literal="Wald"
	 * @generated
	 * @ordered
	 */
	public static final int WALD_VALUE = 4;

	/**
	 * The '<em><b>PARK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARK
	 * @model literal="Park"
	 * @generated
	 * @ordered
	 */
	public static final int PARK_VALUE = 5;

	/**
	 * The '<em><b>MARKTPLATZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKTPLATZ
	 * @model literal="Marktplatz"
	 * @generated
	 * @ordered
	 */
	public static final int MARKTPLATZ_VALUE = 6;

	/**
	 * The '<em><b>SCHULHOF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHULHOF
	 * @model literal="Schulhof"
	 * @generated
	 * @ordered
	 */
	public static final int SCHULHOF_VALUE = 7;

	/**
	 * The '<em><b>FRIEDHOF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIEDHOF
	 * @model literal="Friedhof"
	 * @generated
	 * @ordered
	 */
	public static final int FRIEDHOF_VALUE = 8;

	/**
	 * The '<em><b>KLINIKGELAENDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KLINIKGELAENDE
	 * @model literal="Klinikgel\344nde"
	 * @generated
	 * @ordered
	 */
	public static final int KLINIKGELAENDE_VALUE = 9;

	/**
	 * The '<em><b>SPORTPLATZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPORTPLATZ
	 * @model literal="Sportplatz"
	 * @generated
	 * @ordered
	 */
	public static final int SPORTPLATZ_VALUE = 10;

	/**
	 * An array of all the '<em><b>Nutzung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Nutzung[] VALUES_ARRAY =
		new Nutzung[] {
			WIESE,
			FELD,
			OBSTWIESE,
			KLEINGAERTEN,
			WALD,
			PARK,
			MARKTPLATZ,
			SCHULHOF,
			FRIEDHOF,
			KLINIKGELAENDE,
			SPORTPLATZ,
		};

	/**
	 * A public read-only list of all the '<em><b>Nutzung</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Nutzung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nutzung</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Nutzung get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Nutzung result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nutzung</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Nutzung getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Nutzung result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nutzung</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Nutzung get(int value) {
		switch (value) {
			case WIESE_VALUE: return WIESE;
			case FELD_VALUE: return FELD;
			case OBSTWIESE_VALUE: return OBSTWIESE;
			case KLEINGAERTEN_VALUE: return KLEINGAERTEN;
			case WALD_VALUE: return WALD;
			case PARK_VALUE: return PARK;
			case MARKTPLATZ_VALUE: return MARKTPLATZ;
			case SCHULHOF_VALUE: return SCHULHOF;
			case FRIEDHOF_VALUE: return FRIEDHOF;
			case KLINIKGELAENDE_VALUE: return KLINIKGELAENDE;
			case SPORTPLATZ_VALUE: return SPORTPLATZ;
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
	private Nutzung(int value, String name, String literal) {
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
	
} //Nutzung
