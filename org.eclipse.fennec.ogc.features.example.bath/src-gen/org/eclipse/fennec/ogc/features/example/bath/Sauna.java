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
 * A representation of the model object '<em><b>Sauna</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sauna.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Sauna#getSaunaType <em>Sauna Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Sauna#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Sauna#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getSauna()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='saunas' title='Sauna' layerGroup='Wellness' style='#e53935'"
 * @generated
 */
@ProviderType
public interface Sauna extends Asset {
	/**
	 * Returns the value of the '<em><b>Sauna Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.ogc.features.example.bath.SaunaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sauna Type</em>' attribute.
	 * @see org.eclipse.fennec.ogc.features.example.bath.SaunaType
	 * @see #setSaunaType(SaunaType)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getSauna_SaunaType()
	 * @model
	 * @generated
	 */
	SaunaType getSaunaType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Sauna#getSaunaType <em>Sauna Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sauna Type</em>' attribute.
	 * @see org.eclipse.fennec.ogc.features.example.bath.SaunaType
	 * @see #getSaunaType()
	 * @generated
	 */
	void setSaunaType(SaunaType value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temperature in °C.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(double)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getSauna_Temperature()
	 * @model
	 * @generated
	 */
	double getTemperature();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Sauna#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(double value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of persons.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getSauna_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Sauna#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

} // Sauna
