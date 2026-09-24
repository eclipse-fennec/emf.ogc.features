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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playground</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A playground.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Playground#getAgeFrom <em>Age From</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Playground#getAgeTo <em>Age To</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getPlayground()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='playgrounds' title='Spielplatz' layerGroup='Freifl\344chen' style='#fdd835'"
 * @generated
 */
@ProviderType
public interface Playground extends Asset {
	/**
	 * Returns the value of the '<em><b>Age From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum age.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Age From</em>' attribute.
	 * @see #setAgeFrom(int)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getPlayground_AgeFrom()
	 * @model
	 * @generated
	 */
	int getAgeFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Playground#getAgeFrom <em>Age From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age From</em>' attribute.
	 * @see #getAgeFrom()
	 * @generated
	 */
	void setAgeFrom(int value);

	/**
	 * Returns the value of the '<em><b>Age To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum age.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Age To</em>' attribute.
	 * @see #setAgeTo(int)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getPlayground_AgeTo()
	 * @model
	 * @generated
	 */
	int getAgeTo();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Playground#getAgeTo <em>Age To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age To</em>' attribute.
	 * @see #getAgeTo()
	 * @generated
	 */
	void setAgeTo(int value);

} // Playground
