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
 * A representation of the model object '<em><b>Bike Parking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bicycle parking.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.BikeParking#getRacks <em>Racks</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.BikeParking#isCovered <em>Covered</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getBikeParking()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='bike-parking' title='Fahrradstellpl\344tze' layerGroup='Mobilit\344t' style='#5e35b1'"
 * @generated
 */
@ProviderType
public interface BikeParking extends Asset {
	/**
	 * Returns the value of the '<em><b>Racks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of bicycle racks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Racks</em>' attribute.
	 * @see #setRacks(int)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getBikeParking_Racks()
	 * @model
	 * @generated
	 */
	int getRacks();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.BikeParking#getRacks <em>Racks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Racks</em>' attribute.
	 * @see #getRacks()
	 * @generated
	 */
	void setRacks(int value);

	/**
	 * Returns the value of the '<em><b>Covered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roofed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Covered</em>' attribute.
	 * @see #setCovered(boolean)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getBikeParking_Covered()
	 * @model
	 * @generated
	 */
	boolean isCovered();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.BikeParking#isCovered <em>Covered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Covered</em>' attribute.
	 * @see #isCovered()
	 * @generated
	 */
	void setCovered(boolean value);

} // BikeParking
