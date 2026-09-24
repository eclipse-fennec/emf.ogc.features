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
 * A representation of the model object '<em><b>Shower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Showers at a pool.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Shower#getHeads <em>Heads</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Shower#isWarmWater <em>Warm Water</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getShower()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='showers' title='Duschen' layerGroup='Service' style='{\"color\":\"#0288d1\",\"labels\":false}'"
 * @generated
 */
@ProviderType
public interface Shower extends Asset {
	/**
	 * Returns the value of the '<em><b>Heads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of shower heads.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heads</em>' attribute.
	 * @see #setHeads(int)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getShower_Heads()
	 * @model
	 * @generated
	 */
	int getHeads();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Shower#getHeads <em>Heads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heads</em>' attribute.
	 * @see #getHeads()
	 * @generated
	 */
	void setHeads(int value);

	/**
	 * Returns the value of the '<em><b>Warm Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Warm water.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Warm Water</em>' attribute.
	 * @see #setWarmWater(boolean)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getShower_WarmWater()
	 * @model
	 * @generated
	 */
	boolean isWarmWater();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Shower#isWarmWater <em>Warm Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warm Water</em>' attribute.
	 * @see #isWarmWater()
	 * @generated
	 */
	void setWarmWater(boolean value);

} // Shower
