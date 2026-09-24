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
 * A representation of the model object '<em><b>Kiosk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A kiosk or snack bar.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Kiosk#getOpeningHours <em>Opening Hours</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Kiosk#getSeats <em>Seats</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getKiosk()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='kiosks' title='Kiosk &amp; Gastronomie' layerGroup='Gastronomie' style='#fb8c00'"
 * @generated
 */
@ProviderType
public interface Kiosk extends Asset {
	/**
	 * Returns the value of the '<em><b>Opening Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Opening hours, e.g. 10:00-19:00.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opening Hours</em>' attribute.
	 * @see #setOpeningHours(String)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getKiosk_OpeningHours()
	 * @model
	 * @generated
	 */
	String getOpeningHours();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Kiosk#getOpeningHours <em>Opening Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Hours</em>' attribute.
	 * @see #getOpeningHours()
	 * @generated
	 */
	void setOpeningHours(String value);

	/**
	 * Returns the value of the '<em><b>Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of seats.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seats</em>' attribute.
	 * @see #setSeats(int)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getKiosk_Seats()
	 * @model
	 * @generated
	 */
	int getSeats();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Kiosk#getSeats <em>Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seats</em>' attribute.
	 * @see #getSeats()
	 * @generated
	 */
	void setSeats(int value);

} // Kiosk
