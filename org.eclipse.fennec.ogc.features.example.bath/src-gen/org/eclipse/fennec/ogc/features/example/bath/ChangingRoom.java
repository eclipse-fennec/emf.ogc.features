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
 * A representation of the model object '<em><b>Changing Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A changing room area.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.ChangingRoom#getCabins <em>Cabins</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.ChangingRoom#getLockers <em>Lockers</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.ChangingRoom#isFamily <em>Family</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getChangingRoom()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='changing-rooms' title='Umkleiden' layerGroup='Service' style='#8e24aa'"
 * @generated
 */
@ProviderType
public interface ChangingRoom extends Asset {
	/**
	 * Returns the value of the '<em><b>Cabins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of changing cabins.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cabins</em>' attribute.
	 * @see #setCabins(int)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getChangingRoom_Cabins()
	 * @model
	 * @generated
	 */
	int getCabins();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.ChangingRoom#getCabins <em>Cabins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cabins</em>' attribute.
	 * @see #getCabins()
	 * @generated
	 */
	void setCabins(int value);

	/**
	 * Returns the value of the '<em><b>Lockers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of lockers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lockers</em>' attribute.
	 * @see #setLockers(int)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getChangingRoom_Lockers()
	 * @model
	 * @generated
	 */
	int getLockers();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.ChangingRoom#getLockers <em>Lockers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lockers</em>' attribute.
	 * @see #getLockers()
	 * @generated
	 */
	void setLockers(int value);

	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Family changing room.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(boolean)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getChangingRoom_Family()
	 * @model
	 * @generated
	 */
	boolean isFamily();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.ChangingRoom#isFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #isFamily()
	 * @generated
	 */
	void setFamily(boolean value);

} // ChangingRoom
