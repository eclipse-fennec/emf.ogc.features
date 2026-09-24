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
 * A representation of the model object '<em><b>Strasse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A street, modelled as its centre line.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Strasse#getKlasse <em>Klasse</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Strasse#getBreiteM <em>Breite M</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Strasse#getLaengeM <em>Laenge M</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Strasse#getRichtung <em>Richtung</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.Strasse#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStrasse()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='strassen' title='Stra\337en' style='#57534e'"
 * @generated
 */
@ProviderType
public interface Strasse extends CityFeature {
	/**
	 * Returns the value of the '<em><b>Klasse</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.ogc.features.example.city.Strassenklasse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Klasse</em>' attribute.
	 * @see org.eclipse.fennec.ogc.features.example.city.Strassenklasse
	 * @see #setKlasse(Strassenklasse)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStrasse_Klasse()
	 * @model
	 * @generated
	 */
	Strassenklasse getKlasse();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Strasse#getKlasse <em>Klasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Klasse</em>' attribute.
	 * @see org.eclipse.fennec.ogc.features.example.city.Strassenklasse
	 * @see #getKlasse()
	 * @generated
	 */
	void setKlasse(Strassenklasse value);

	/**
	 * Returns the value of the '<em><b>Breite M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breite M</em>' attribute.
	 * @see #setBreiteM(double)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStrasse_BreiteM()
	 * @model extendedMetaData="name='breite_m'"
	 * @generated
	 */
	double getBreiteM();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Strasse#getBreiteM <em>Breite M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breite M</em>' attribute.
	 * @see #getBreiteM()
	 * @generated
	 */
	void setBreiteM(double value);

	/**
	 * Returns the value of the '<em><b>Laenge M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Laenge M</em>' attribute.
	 * @see #setLaengeM(int)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStrasse_LaengeM()
	 * @model extendedMetaData="name='laenge_m'"
	 * @generated
	 */
	int getLaengeM();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Strasse#getLaengeM <em>Laenge M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laenge M</em>' attribute.
	 * @see #getLaengeM()
	 * @generated
	 */
	void setLaengeM(int value);

	/**
	 * Returns the value of the '<em><b>Richtung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Richtung</em>' attribute.
	 * @see #setRichtung(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStrasse_Richtung()
	 * @model
	 * @generated
	 */
	String getRichtung();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Strasse#getRichtung <em>Richtung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Richtung</em>' attribute.
	 * @see #getRichtung()
	 * @generated
	 */
	void setRichtung(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Display colour of the feature, from the simplestyle member 'stroke' of the source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getStrasse_Color()
	 * @model annotation="https://eclipse.org/fennec/ogc/features property='stroke'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.Strasse#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // Strasse
