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
 * A representation of the literals of the enumeration '<em><b>Water Quality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Water quality classes of the EU bathing water directive: excellent, good, sufficient, poor.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getWaterQuality()
 * @model
 * @generated
 */
@ProviderType
public enum WaterQuality implements Enumerator {
	/**
	 * The '<em><b>EXCELLENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCELLENT_VALUE
	 * @generated
	 * @ordered
	 */
	EXCELLENT(0, "EXCELLENT", "EXCELLENT"),

	/**
	 * The '<em><b>GOOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOD_VALUE
	 * @generated
	 * @ordered
	 */
	GOOD(1, "GOOD", "GOOD"),

	/**
	 * The '<em><b>SUFFICIENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUFFICIENT_VALUE
	 * @generated
	 * @ordered
	 */
	SUFFICIENT(2, "SUFFICIENT", "SUFFICIENT"),

	/**
	 * The '<em><b>POOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POOR_VALUE
	 * @generated
	 * @ordered
	 */
	POOR(3, "POOR", "POOR");

	/**
	 * The '<em><b>EXCELLENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCELLENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCELLENT_VALUE = 0;

	/**
	 * The '<em><b>GOOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GOOD_VALUE = 1;

	/**
	 * The '<em><b>SUFFICIENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUFFICIENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUFFICIENT_VALUE = 2;

	/**
	 * The '<em><b>POOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POOR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Water Quality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WaterQuality[] VALUES_ARRAY =
		new WaterQuality[] {
			EXCELLENT,
			GOOD,
			SUFFICIENT,
			POOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Water Quality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WaterQuality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Water Quality</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WaterQuality get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WaterQuality result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Water Quality</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WaterQuality getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WaterQuality result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Water Quality</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WaterQuality get(int value) {
		switch (value) {
			case EXCELLENT_VALUE: return EXCELLENT;
			case GOOD_VALUE: return GOOD;
			case SUFFICIENT_VALUE: return SUFFICIENT;
			case POOR_VALUE: return POOR;
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
	private WaterQuality(int value, String name, String literal) {
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
	
} //WaterQuality
