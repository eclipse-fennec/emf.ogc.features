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
import org.eclipse.fennec.ogc.features.example.city.Flaeche;
import org.eclipse.fennec.ogc.features.example.city.Nutzung;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flaeche</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.FlaecheImpl#getNutzung <em>Nutzung</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.FlaecheImpl#getFlaecheM2 <em>Flaeche M2</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.FlaecheImpl#getFrucht <em>Frucht</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.FlaecheImpl#getBaumart <em>Baumart</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.FlaecheImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlaecheImpl extends CityFeatureImpl implements Flaeche {
	/**
	 * The default value of the '{@link #getNutzung() <em>Nutzung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutzung()
	 * @generated
	 * @ordered
	 */
	protected static final Nutzung NUTZUNG_EDEFAULT = Nutzung.WIESE;

	/**
	 * The cached value of the '{@link #getNutzung() <em>Nutzung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutzung()
	 * @generated
	 * @ordered
	 */
	protected Nutzung nutzung = NUTZUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlaecheM2() <em>Flaeche M2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaecheM2()
	 * @generated
	 * @ordered
	 */
	protected static final int FLAECHE_M2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFlaecheM2() <em>Flaeche M2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaecheM2()
	 * @generated
	 * @ordered
	 */
	protected int flaecheM2 = FLAECHE_M2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrucht() <em>Frucht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrucht()
	 * @generated
	 * @ordered
	 */
	protected static final String FRUCHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrucht() <em>Frucht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrucht()
	 * @generated
	 * @ordered
	 */
	protected String frucht = FRUCHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaumart() <em>Baumart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaumart()
	 * @generated
	 * @ordered
	 */
	protected static final String BAUMART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaumart() <em>Baumart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaumart()
	 * @generated
	 * @ordered
	 */
	protected String baumart = BAUMART_EDEFAULT;

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
	protected FlaecheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CityPackage.Literals.FLAECHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nutzung getNutzung() {
		return nutzung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNutzung(Nutzung newNutzung) {
		Nutzung oldNutzung = nutzung;
		nutzung = newNutzung == null ? NUTZUNG_EDEFAULT : newNutzung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.FLAECHE__NUTZUNG, oldNutzung, nutzung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFlaecheM2() {
		return flaecheM2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlaecheM2(int newFlaecheM2) {
		int oldFlaecheM2 = flaecheM2;
		flaecheM2 = newFlaecheM2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.FLAECHE__FLAECHE_M2, oldFlaecheM2, flaecheM2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrucht() {
		return frucht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrucht(String newFrucht) {
		String oldFrucht = frucht;
		frucht = newFrucht;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.FLAECHE__FRUCHT, oldFrucht, frucht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBaumart() {
		return baumart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaumart(String newBaumart) {
		String oldBaumart = baumart;
		baumart = newBaumart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.FLAECHE__BAUMART, oldBaumart, baumart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.FLAECHE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CityPackage.FLAECHE__NUTZUNG:
				return getNutzung();
			case CityPackage.FLAECHE__FLAECHE_M2:
				return getFlaecheM2();
			case CityPackage.FLAECHE__FRUCHT:
				return getFrucht();
			case CityPackage.FLAECHE__BAUMART:
				return getBaumart();
			case CityPackage.FLAECHE__COLOR:
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
			case CityPackage.FLAECHE__NUTZUNG:
				setNutzung((Nutzung)newValue);
				return;
			case CityPackage.FLAECHE__FLAECHE_M2:
				setFlaecheM2((Integer)newValue);
				return;
			case CityPackage.FLAECHE__FRUCHT:
				setFrucht((String)newValue);
				return;
			case CityPackage.FLAECHE__BAUMART:
				setBaumart((String)newValue);
				return;
			case CityPackage.FLAECHE__COLOR:
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
			case CityPackage.FLAECHE__NUTZUNG:
				setNutzung(NUTZUNG_EDEFAULT);
				return;
			case CityPackage.FLAECHE__FLAECHE_M2:
				setFlaecheM2(FLAECHE_M2_EDEFAULT);
				return;
			case CityPackage.FLAECHE__FRUCHT:
				setFrucht(FRUCHT_EDEFAULT);
				return;
			case CityPackage.FLAECHE__BAUMART:
				setBaumart(BAUMART_EDEFAULT);
				return;
			case CityPackage.FLAECHE__COLOR:
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
			case CityPackage.FLAECHE__NUTZUNG:
				return nutzung != NUTZUNG_EDEFAULT;
			case CityPackage.FLAECHE__FLAECHE_M2:
				return flaecheM2 != FLAECHE_M2_EDEFAULT;
			case CityPackage.FLAECHE__FRUCHT:
				return FRUCHT_EDEFAULT == null ? frucht != null : !FRUCHT_EDEFAULT.equals(frucht);
			case CityPackage.FLAECHE__BAUMART:
				return BAUMART_EDEFAULT == null ? baumart != null : !BAUMART_EDEFAULT.equals(baumart);
			case CityPackage.FLAECHE__COLOR:
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
		result.append(" (nutzung: ");
		result.append(nutzung);
		result.append(", flaecheM2: ");
		result.append(flaecheM2);
		result.append(", frucht: ");
		result.append(frucht);
		result.append(", baumart: ");
		result.append(baumart);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //FlaecheImpl
