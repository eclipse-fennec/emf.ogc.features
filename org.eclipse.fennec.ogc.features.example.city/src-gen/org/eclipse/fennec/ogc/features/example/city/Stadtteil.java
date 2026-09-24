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
 * A representation of the model object '<em><b>Stadtteil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A district of the town or its surroundings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtteil#getTyp <em>Typ</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtteil#getFlaecheKm2 <em>Flaeche Km2</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtteil#getGebaeude <em>Gebaeude</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtteil#getEinwohner <em>Einwohner</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtteil#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtteil()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='stadtteile' title='Stadtteile' style='{\"color\":\"#6366f1\",\"fillOpacity\":0.06}'"
 * @generated
 */
@ProviderType
public interface Stadtteil extends CityFeature {
	/**
	 * Returns the value of the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typ</em>' attribute.
	 * @see #setTyp(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtteil_Typ()
	 * @model
	 * @generated
	 */
	String getTyp();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtteil#getTyp <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ</em>' attribute.
	 * @see #getTyp()
	 * @generated
	 */
	void setTyp(String value);

	/**
	 * Returns the value of the '<em><b>Flaeche Km2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flaeche Km2</em>' attribute.
	 * @see #setFlaecheKm2(double)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtteil_FlaecheKm2()
	 * @model extendedMetaData="name='flaeche_km2'"
	 * @generated
	 */
	double getFlaecheKm2();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtteil#getFlaecheKm2 <em>Flaeche Km2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flaeche Km2</em>' attribute.
	 * @see #getFlaecheKm2()
	 * @generated
	 */
	void setFlaecheKm2(double value);

	/**
	 * Returns the value of the '<em><b>Gebaeude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of buildings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gebaeude</em>' attribute.
	 * @see #setGebaeude(int)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtteil_Gebaeude()
	 * @model
	 * @generated
	 */
	int getGebaeude();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtteil#getGebaeude <em>Gebaeude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gebaeude</em>' attribute.
	 * @see #getGebaeude()
	 * @generated
	 */
	void setGebaeude(int value);

	/**
	 * Returns the value of the '<em><b>Einwohner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of inhabitants.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einwohner</em>' attribute.
	 * @see #setEinwohner(int)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtteil_Einwohner()
	 * @model
	 * @generated
	 */
	int getEinwohner();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtteil#getEinwohner <em>Einwohner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einwohner</em>' attribute.
	 * @see #getEinwohner()
	 * @generated
	 */
	void setEinwohner(int value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Display colour of the feature, from the simplestyle member 'fill' of the source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtteil_Color()
	 * @model annotation="https://eclipse.org/fennec/ogc/features property='fill'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtteil#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // Stadtteil
