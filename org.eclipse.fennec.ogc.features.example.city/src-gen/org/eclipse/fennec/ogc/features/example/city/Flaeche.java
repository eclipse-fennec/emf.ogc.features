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
 * A representation of the model object '<em><b>Flaeche</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A parcel of land use.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Flaeche#getNutzung <em>Nutzung</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Flaeche#getFlaecheM2 <em>Flaeche M2</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Flaeche#getFrucht <em>Frucht</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Flaeche#getBaumart <em>Baumart</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Flaeche#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getFlaeche()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='flaechen' title='Fl\344chen' style='{\"color\":\"#a3e635\",\"fillOpacity\":0.4}'"
 * @generated
 */
@ProviderType
public interface Flaeche extends CityFeature {
	/**
	 * Returns the value of the '<em><b>Nutzung</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.ogc.features.example.city.Nutzung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nutzung</em>' attribute.
	 * @see org.eclipse.fennec.ogc.features.example.city.Nutzung
	 * @see #setNutzung(Nutzung)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getFlaeche_Nutzung()
	 * @model
	 * @generated
	 */
	Nutzung getNutzung();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Flaeche#getNutzung <em>Nutzung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nutzung</em>' attribute.
	 * @see org.eclipse.fennec.ogc.features.example.city.Nutzung
	 * @see #getNutzung()
	 * @generated
	 */
	void setNutzung(Nutzung value);

	/**
	 * Returns the value of the '<em><b>Flaeche M2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flaeche M2</em>' attribute.
	 * @see #setFlaecheM2(int)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getFlaeche_FlaecheM2()
	 * @model extendedMetaData="name='flaeche_m2'"
	 * @generated
	 */
	int getFlaecheM2();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Flaeche#getFlaecheM2 <em>Flaeche M2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flaeche M2</em>' attribute.
	 * @see #getFlaecheM2()
	 * @generated
	 */
	void setFlaecheM2(int value);

	/**
	 * Returns the value of the '<em><b>Frucht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frucht</em>' attribute.
	 * @see #setFrucht(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getFlaeche_Frucht()
	 * @model
	 * @generated
	 */
	String getFrucht();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Flaeche#getFrucht <em>Frucht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frucht</em>' attribute.
	 * @see #getFrucht()
	 * @generated
	 */
	void setFrucht(String value);

	/**
	 * Returns the value of the '<em><b>Baumart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baumart</em>' attribute.
	 * @see #setBaumart(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getFlaeche_Baumart()
	 * @model
	 * @generated
	 */
	String getBaumart();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Flaeche#getBaumart <em>Baumart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baumart</em>' attribute.
	 * @see #getBaumart()
	 * @generated
	 */
	void setBaumart(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Display colour of the feature, from the simplestyle member 'fill' of the source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getFlaeche_Color()
	 * @model annotation="https://eclipse.org/fennec/ogc/features property='fill'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Flaeche#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // Flaeche
