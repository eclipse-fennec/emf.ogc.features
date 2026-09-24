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
 * A representation of the literals of the enumeration '<em><b>Surface</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getSurface()
 * @model
 * @generated
 */
@ProviderType
public enum Surface implements Enumerator {
	/**
	 * The '<em><b>PAVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAVED_VALUE
	 * @generated
	 * @ordered
	 */
	PAVED(0, "PAVED", "PAVED"),

	/**
	 * The '<em><b>GRAVEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAVEL_VALUE
	 * @generated
	 * @ordered
	 */
	GRAVEL(1, "GRAVEL", "GRAVEL"),

	/**
	 * The '<em><b>WOODEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WOODEN_VALUE
	 * @generated
	 * @ordered
	 */
	WOODEN(2, "WOODEN", "WOODEN"),

	/**
	 * The '<em><b>RUBBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUBBER_VALUE
	 * @generated
	 * @ordered
	 */
	RUBBER(3, "RUBBER", "RUBBER"),

	/**
	 * The '<em><b>GRASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRASS_VALUE
	 * @generated
	 * @ordered
	 */
	GRASS(4, "GRASS", "GRASS");

	/**
	 * The '<em><b>PAVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAVED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAVED_VALUE = 0;

	/**
	 * The '<em><b>GRAVEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAVEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRAVEL_VALUE = 1;

	/**
	 * The '<em><b>WOODEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WOODEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WOODEN_VALUE = 2;

	/**
	 * The '<em><b>RUBBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUBBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RUBBER_VALUE = 3;

	/**
	 * The '<em><b>GRASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRASS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Surface</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Surface[] VALUES_ARRAY =
		new Surface[] {
			PAVED,
			GRAVEL,
			WOODEN,
			RUBBER,
			GRASS,
		};

	/**
	 * A public read-only list of all the '<em><b>Surface</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Surface> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Surface</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Surface get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Surface result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Surface</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Surface getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Surface result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Surface</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Surface get(int value) {
		switch (value) {
			case PAVED_VALUE: return PAVED;
			case GRAVEL_VALUE: return GRAVEL;
			case WOODEN_VALUE: return WOODEN;
			case RUBBER_VALUE: return RUBBER;
			case GRASS_VALUE: return GRASS;
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
	private Surface(int value, String name, String literal) {
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
	
} //Surface
