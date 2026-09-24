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
 * A representation of the model object '<em><b>Sport Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sport area.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.SportArea#getSportType <em>Sport Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getSportArea()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='sport-areas' title='Sportbereich' layerGroup='Sport' style='#43a047'"
 * @generated
 */
@ProviderType
public interface SportArea extends Asset {
	/**
	 * Returns the value of the '<em><b>Sport Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.ogc.features.example.bath.SportType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sport Type</em>' attribute.
	 * @see org.eclipse.fennec.ogc.features.example.bath.SportType
	 * @see #setSportType(SportType)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getSportArea_SportType()
	 * @model
	 * @generated
	 */
	SportType getSportType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.SportArea#getSportType <em>Sport Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sport Type</em>' attribute.
	 * @see org.eclipse.fennec.ogc.features.example.bath.SportType
	 * @see #getSportType()
	 * @generated
	 */
	void setSportType(SportType value);

} // SportArea
