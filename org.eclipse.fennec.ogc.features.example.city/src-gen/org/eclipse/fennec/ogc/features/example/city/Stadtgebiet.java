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
 * A representation of the model object '<em><b>Stadtgebiet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The town boundary and its centre.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getKategorie <em>Kategorie</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getFeatureTyp <em>Feature Typ</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getLand <em>Land</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getBundesland <em>Bundesland</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getLandkreis <em>Landkreis</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getFlaecheKm2 <em>Flaeche Km2</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getUmfangKm <em>Umfang Km</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getNachbarorte <em>Nachbarorte</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getQuelle <em>Quelle</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getGenauigkeitM <em>Genauigkeit M</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getHinweis <em>Hinweis</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtgebiet()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='dim_stadt' title='Dim Stadt' style='{\"color\":\"#b3261e\",\"fillOpacity\":0}'"
 * @generated
 */
@ProviderType
public interface Stadtgebiet extends CityFeature {
	/**
	 * Returns the value of the '<em><b>Kategorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kategorie</em>' attribute.
	 * @see #setKategorie(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtgebiet_Kategorie()
	 * @model
	 * @generated
	 */
	String getKategorie();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getKategorie <em>Kategorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kategorie</em>' attribute.
	 * @see #getKategorie()
	 * @generated
	 */
	void setKategorie(String value);

	/**
	 * Returns the value of the '<em><b>Feature Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Typ</em>' attribute.
	 * @see #setFeatureTyp(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtgebiet_FeatureTyp()
	 * @model extendedMetaData="name='feature_typ'"
	 * @generated
	 */
	String getFeatureTyp();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getFeatureTyp <em>Feature Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Typ</em>' attribute.
	 * @see #getFeatureTyp()
	 * @generated
	 */
	void setFeatureTyp(String value);

	/**
	 * Returns the value of the '<em><b>Land</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land</em>' attribute.
	 * @see #setLand(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtgebiet_Land()
	 * @model
	 * @generated
	 */
	String getLand();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getLand <em>Land</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Land</em>' attribute.
	 * @see #getLand()
	 * @generated
	 */
	void setLand(String value);

	/**
	 * Returns the value of the '<em><b>Bundesland</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundesland</em>' attribute.
	 * @see #setBundesland(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtgebiet_Bundesland()
	 * @model
	 * @generated
	 */
	String getBundesland();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getBundesland <em>Bundesland</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundesland</em>' attribute.
	 * @see #getBundesland()
	 * @generated
	 */
	void setBundesland(String value);

	/**
	 * Returns the value of the '<em><b>Landkreis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landkreis</em>' attribute.
	 * @see #setLandkreis(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtgebiet_Landkreis()
	 * @model
	 * @generated
	 */
	String getLandkreis();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getLandkreis <em>Landkreis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landkreis</em>' attribute.
	 * @see #getLandkreis()
	 * @generated
	 */
	void setLandkreis(String value);

	/**
	 * Returns the value of the '<em><b>Flaeche Km2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flaeche Km2</em>' attribute.
	 * @see #setFlaecheKm2(double)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtgebiet_FlaecheKm2()
	 * @model extendedMetaData="name='flaeche_km2'"
	 * @generated
	 */
	double getFlaecheKm2();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getFlaecheKm2 <em>Flaeche Km2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flaeche Km2</em>' attribute.
	 * @see #getFlaecheKm2()
	 * @generated
	 */
	void setFlaecheKm2(double value);

	/**
	 * Returns the value of the '<em><b>Umfang Km</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Umfang Km</em>' attribute.
	 * @see #setUmfangKm(double)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtgebiet_UmfangKm()
	 * @model extendedMetaData="name='umfang_km'"
	 * @generated
	 */
	double getUmfangKm();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getUmfangKm <em>Umfang Km</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Umfang Km</em>' attribute.
	 * @see #getUmfangKm()
	 * @generated
	 */
	void setUmfangKm(double value);

	/**
	 * Returns the value of the '<em><b>Nachbarorte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachbarorte</em>' attribute.
	 * @see #setNachbarorte(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtgebiet_Nachbarorte()
	 * @model
	 * @generated
	 */
	String getNachbarorte();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getNachbarorte <em>Nachbarorte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachbarorte</em>' attribute.
	 * @see #getNachbarorte()
	 * @generated
	 */
	void setNachbarorte(String value);

	/**
	 * Returns the value of the '<em><b>Quelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quelle</em>' attribute.
	 * @see #setQuelle(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtgebiet_Quelle()
	 * @model
	 * @generated
	 */
	String getQuelle();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getQuelle <em>Quelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quelle</em>' attribute.
	 * @see #getQuelle()
	 * @generated
	 */
	void setQuelle(String value);

	/**
	 * Returns the value of the '<em><b>Genauigkeit M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genauigkeit M</em>' attribute.
	 * @see #setGenauigkeitM(int)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtgebiet_GenauigkeitM()
	 * @model extendedMetaData="name='genauigkeit_m'"
	 * @generated
	 */
	int getGenauigkeitM();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getGenauigkeitM <em>Genauigkeit M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genauigkeit M</em>' attribute.
	 * @see #getGenauigkeitM()
	 * @generated
	 */
	void setGenauigkeitM(int value);

	/**
	 * Returns the value of the '<em><b>Hinweis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hinweis</em>' attribute.
	 * @see #setHinweis(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtgebiet_Hinweis()
	 * @model
	 * @generated
	 */
	String getHinweis();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getHinweis <em>Hinweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hinweis</em>' attribute.
	 * @see #getHinweis()
	 * @generated
	 */
	void setHinweis(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Display colour of the feature, from the simplestyle member 'stroke' of the source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStadtgebiet_Color()
	 * @model annotation="https://eclipse.org/fennec/ogc/features property='stroke'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // Stadtgebiet
