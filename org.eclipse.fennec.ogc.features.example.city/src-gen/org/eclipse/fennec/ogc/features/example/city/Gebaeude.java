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
 * A representation of the model object '<em><b>Gebaeude</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A building footprint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getTyp <em>Typ</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getGeschosse <em>Geschosse</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getHoeheM <em>Hoehe M</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getFlaecheM2 <em>Flaeche M2</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getStadtteil <em>Stadtteil</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getGehoeft <em>Gehoeft</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getGebaeude()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='gebaeude' title='Geb\344ude' style='{\"color\":\"#9c4f3f\",\"fillOpacity\":0.75}'"
 * @generated
 */
@ProviderType
public interface Gebaeude extends CityFeature {
	/**
	 * Returns the value of the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typ</em>' attribute.
	 * @see #setTyp(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getGebaeude_Typ()
	 * @model
	 * @generated
	 */
	String getTyp();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getTyp <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ</em>' attribute.
	 * @see #getTyp()
	 * @generated
	 */
	void setTyp(String value);

	/**
	 * Returns the value of the '<em><b>Geschosse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geschosse</em>' attribute.
	 * @see #setGeschosse(int)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getGebaeude_Geschosse()
	 * @model
	 * @generated
	 */
	int getGeschosse();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getGeschosse <em>Geschosse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschosse</em>' attribute.
	 * @see #getGeschosse()
	 * @generated
	 */
	void setGeschosse(int value);

	/**
	 * Returns the value of the '<em><b>Hoehe M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hoehe M</em>' attribute.
	 * @see #setHoeheM(double)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getGebaeude_HoeheM()
	 * @model extendedMetaData="name='hoehe_m'"
	 * @generated
	 */
	double getHoeheM();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getHoeheM <em>Hoehe M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehe M</em>' attribute.
	 * @see #getHoeheM()
	 * @generated
	 */
	void setHoeheM(double value);

	/**
	 * Returns the value of the '<em><b>Flaeche M2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flaeche M2</em>' attribute.
	 * @see #setFlaecheM2(int)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getGebaeude_FlaecheM2()
	 * @model extendedMetaData="name='flaeche_m2'"
	 * @generated
	 */
	int getFlaecheM2();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getFlaecheM2 <em>Flaeche M2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flaeche M2</em>' attribute.
	 * @see #getFlaecheM2()
	 * @generated
	 */
	void setFlaecheM2(int value);

	/**
	 * Returns the value of the '<em><b>Stadtteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stadtteil</em>' attribute.
	 * @see #setStadtteil(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getGebaeude_Stadtteil()
	 * @model
	 * @generated
	 */
	String getStadtteil();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getStadtteil <em>Stadtteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stadtteil</em>' attribute.
	 * @see #getStadtteil()
	 * @generated
	 */
	void setStadtteil(String value);

	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' attribute.
	 * @see #setAdresse(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getGebaeude_Adresse()
	 * @model
	 * @generated
	 */
	String getAdresse();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getAdresse <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' attribute.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(String value);

	/**
	 * Returns the value of the '<em><b>Gehoeft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gehoeft</em>' attribute.
	 * @see #setGehoeft(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getGebaeude_Gehoeft()
	 * @model
	 * @generated
	 */
	String getGehoeft();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getGehoeft <em>Gehoeft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gehoeft</em>' attribute.
	 * @see #getGehoeft()
	 * @generated
	 */
	void setGehoeft(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Display colour of the feature, from the simplestyle member 'fill' of the source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getGebaeude_Color()
	 * @model annotation="https://eclipse.org/fennec/ogc/features property='fill'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // Gebaeude
