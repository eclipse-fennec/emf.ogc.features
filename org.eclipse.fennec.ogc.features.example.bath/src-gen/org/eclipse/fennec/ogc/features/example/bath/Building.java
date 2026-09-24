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
 * A representation of the model object '<em><b>Building</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A building of the facility.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Building#getFloors <em>Floors</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getBuilding()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='buildings' title='Geb\344ude' layerGroup='Infrastruktur' style='{\"color\":\"#78909c\",\"fillOpacity\":0.15}'"
 * @generated
 */
@ProviderType
public interface Building extends Asset {
	/**
	 * Returns the value of the '<em><b>Floors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of floors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Floors</em>' attribute.
	 * @see #setFloors(int)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getBuilding_Floors()
	 * @model
	 * @generated
	 */
	int getFloors();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Building#getFloors <em>Floors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floors</em>' attribute.
	 * @see #getFloors()
	 * @generated
	 */
	void setFloors(int value);

} // Building
