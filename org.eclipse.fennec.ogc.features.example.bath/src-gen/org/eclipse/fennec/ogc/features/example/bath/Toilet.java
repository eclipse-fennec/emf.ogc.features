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
 * A representation of the model object '<em><b>Toilet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A toilet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Toilet#isBabyChanging <em>Baby Changing</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getToilet()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='toilets' title='WC' layerGroup='Service' style='#6d4c41'"
 * @generated
 */
@ProviderType
public interface Toilet extends Asset {
	/**
	 * Returns the value of the '<em><b>Baby Changing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Baby changing table available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Baby Changing</em>' attribute.
	 * @see #setBabyChanging(boolean)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getToilet_BabyChanging()
	 * @model
	 * @generated
	 */
	boolean isBabyChanging();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Toilet#isBabyChanging <em>Baby Changing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baby Changing</em>' attribute.
	 * @see #isBabyChanging()
	 * @generated
	 */
	void setBabyChanging(boolean value);

} // Toilet
