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
package org.eclipse.fennec.ogc.features.example.city;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A point of interest.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Ort#getKategorie <em>Kategorie</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Ort#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getOrt()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='orte' title='Orte' style='#0ea5e9'"
 * @generated
 */
@ProviderType
public interface Ort extends CityFeature {
	/**
	 * Returns the value of the '<em><b>Kategorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kategorie</em>' attribute.
	 * @see #setKategorie(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getOrt_Kategorie()
	 * @model
	 * @generated
	 */
	String getKategorie();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Ort#getKategorie <em>Kategorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kategorie</em>' attribute.
	 * @see #getKategorie()
	 * @generated
	 */
	void setKategorie(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Display colour of the feature, from the simplestyle member 'marker-color' of the source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getOrt_Color()
	 * @model annotation="https://eclipse.org/fennec/ogc/features property='marker-color'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Ort#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // Ort
