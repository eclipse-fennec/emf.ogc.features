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
package org.eclipse.fennec.ogc.features.example.city.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.ogc.features.example.city.CityPackage;
import org.eclipse.fennec.ogc.features.example.city.Strasse;
import org.eclipse.fennec.ogc.features.example.city.Strassenklasse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strasse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StrasseImpl#getKlasse <em>Klasse</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StrasseImpl#getBreiteM <em>Breite M</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StrasseImpl#getLaengeM <em>Laenge M</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StrasseImpl#getRichtung <em>Richtung</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StrasseImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrasseImpl extends CityFeatureImpl implements Strasse {
	/**
	 * The default value of the '{@link #getKlasse() <em>Klasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKlasse()
	 * @generated
	 * @ordered
	 */
	protected static final Strassenklasse KLASSE_EDEFAULT = Strassenklasse.HAUPTSTRASSE;

	/**
	 * The cached value of the '{@link #getKlasse() <em>Klasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKlasse()
	 * @generated
	 * @ordered
	 */
	protected Strassenklasse klasse = KLASSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBreiteM() <em>Breite M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreiteM()
	 * @generated
	 * @ordered
	 */
	protected static final double BREITE_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBreiteM() <em>Breite M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreiteM()
	 * @generated
	 * @ordered
	 */
	protected double breiteM = BREITE_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getLaengeM() <em>Laenge M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaengeM()
	 * @generated
	 * @ordered
	 */
	protected static final int LAENGE_M_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLaengeM() <em>Laenge M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaengeM()
	 * @generated
	 * @ordered
	 */
	protected int laengeM = LAENGE_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getRichtung() <em>Richtung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRichtung()
	 * @generated
	 * @ordered
	 */
	protected static final String RICHTUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRichtung() <em>Richtung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRichtung()
	 * @generated
	 * @ordered
	 */
	protected String richtung = RICHTUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrasseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CityPackage.Literals.STRASSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strassenklasse getKlasse() {
		return klasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKlasse(Strassenklasse newKlasse) {
		Strassenklasse oldKlasse = klasse;
		klasse = newKlasse == null ? KLASSE_EDEFAULT : newKlasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STRASSE__KLASSE, oldKlasse, klasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBreiteM() {
		return breiteM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBreiteM(double newBreiteM) {
		double oldBreiteM = breiteM;
		breiteM = newBreiteM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STRASSE__BREITE_M, oldBreiteM, breiteM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLaengeM() {
		return laengeM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLaengeM(int newLaengeM) {
		int oldLaengeM = laengeM;
		laengeM = newLaengeM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STRASSE__LAENGE_M, oldLaengeM, laengeM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRichtung() {
		return richtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRichtung(String newRichtung) {
		String oldRichtung = richtung;
		richtung = newRichtung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STRASSE__RICHTUNG, oldRichtung, richtung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STRASSE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CityPackage.STRASSE__KLASSE:
				return getKlasse();
			case CityPackage.STRASSE__BREITE_M:
				return getBreiteM();
			case CityPackage.STRASSE__LAENGE_M:
				return getLaengeM();
			case CityPackage.STRASSE__RICHTUNG:
				return getRichtung();
			case CityPackage.STRASSE__COLOR:
				return getColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CityPackage.STRASSE__KLASSE:
				setKlasse((Strassenklasse)newValue);
				return;
			case CityPackage.STRASSE__BREITE_M:
				setBreiteM((Double)newValue);
				return;
			case CityPackage.STRASSE__LAENGE_M:
				setLaengeM((Integer)newValue);
				return;
			case CityPackage.STRASSE__RICHTUNG:
				setRichtung((String)newValue);
				return;
			case CityPackage.STRASSE__COLOR:
				setColor((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CityPackage.STRASSE__KLASSE:
				setKlasse(KLASSE_EDEFAULT);
				return;
			case CityPackage.STRASSE__BREITE_M:
				setBreiteM(BREITE_M_EDEFAULT);
				return;
			case CityPackage.STRASSE__LAENGE_M:
				setLaengeM(LAENGE_M_EDEFAULT);
				return;
			case CityPackage.STRASSE__RICHTUNG:
				setRichtung(RICHTUNG_EDEFAULT);
				return;
			case CityPackage.STRASSE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CityPackage.STRASSE__KLASSE:
				return klasse != KLASSE_EDEFAULT;
			case CityPackage.STRASSE__BREITE_M:
				return breiteM != BREITE_M_EDEFAULT;
			case CityPackage.STRASSE__LAENGE_M:
				return laengeM != LAENGE_M_EDEFAULT;
			case CityPackage.STRASSE__RICHTUNG:
				return RICHTUNG_EDEFAULT == null ? richtung != null : !RICHTUNG_EDEFAULT.equals(richtung);
			case CityPackage.STRASSE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (klasse: ");
		result.append(klasse);
		result.append(", breiteM: ");
		result.append(breiteM);
		result.append(", laengeM: ");
		result.append(laengeM);
		result.append(", richtung: ");
		result.append(richtung);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //StrasseImpl
