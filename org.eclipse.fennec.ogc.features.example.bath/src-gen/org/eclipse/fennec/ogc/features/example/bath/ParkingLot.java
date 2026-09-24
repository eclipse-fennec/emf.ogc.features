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
 * A representation of the model object '<em><b>Parking Lot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A car park.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.ParkingLot#getSpaces <em>Spaces</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.ParkingLot#getFreeHours <em>Free Hours</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.ParkingLot#getChargingPoints <em>Charging Points</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getParkingLot()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='parking' title='Parkpl\344tze' layerGroup='Mobilit\344t' style='{\"color\":\"#3949ab\",\"fillOpacity\":0.3}'"
 * @generated
 */
@ProviderType
public interface ParkingLot extends Asset {
	/**
	 * Returns the value of the '<em><b>Spaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of parking spaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spaces</em>' attribute.
	 * @see #setSpaces(int)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getParkingLot_Spaces()
	 * @model
	 * @generated
	 */
	int getSpaces();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.ParkingLot#getSpaces <em>Spaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spaces</em>' attribute.
	 * @see #getSpaces()
	 * @generated
	 */
	void setSpaces(int value);

	/**
	 * Returns the value of the '<em><b>Free Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hours of free parking.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free Hours</em>' attribute.
	 * @see #setFreeHours(int)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getParkingLot_FreeHours()
	 * @model
	 * @generated
	 */
	int getFreeHours();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.ParkingLot#getFreeHours <em>Free Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Hours</em>' attribute.
	 * @see #getFreeHours()
	 * @generated
	 */
	void setFreeHours(int value);

	/**
	 * Returns the value of the '<em><b>Charging Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of charging points for electric cars.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charging Points</em>' attribute.
	 * @see #setChargingPoints(int)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getParkingLot_ChargingPoints()
	 * @model
	 * @generated
	 */
	int getChargingPoints();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.ParkingLot#getChargingPoints <em>Charging Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charging Points</em>' attribute.
	 * @see #getChargingPoints()
	 * @generated
	 */
	void setChargingPoints(int value);

} // ParkingLot
