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
import org.eclipse.fennec.ogc.features.example.city.Stadtteil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stadtteil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtteilImpl#getTyp <em>Typ</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtteilImpl#getFlaecheKm2 <em>Flaeche Km2</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtteilImpl#getGebaeude <em>Gebaeude</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtteilImpl#getEinwohner <em>Einwohner</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtteilImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StadtteilImpl extends CityFeatureImpl implements Stadtteil {
	/**
	 * The default value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected static final String TYP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected String typ = TYP_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlaecheKm2() <em>Flaeche Km2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaecheKm2()
	 * @generated
	 * @ordered
	 */
	protected static final double FLAECHE_KM2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFlaecheKm2() <em>Flaeche Km2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaecheKm2()
	 * @generated
	 * @ordered
	 */
	protected double flaecheKm2 = FLAECHE_KM2_EDEFAULT;

	/**
	 * The default value of the '{@link #getGebaeude() <em>Gebaeude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGebaeude()
	 * @generated
	 * @ordered
	 */
	protected static final int GEBAEUDE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGebaeude() <em>Gebaeude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGebaeude()
	 * @generated
	 * @ordered
	 */
	protected int gebaeude = GEBAEUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEinwohner() <em>Einwohner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinwohner()
	 * @generated
	 * @ordered
	 */
	protected static final int EINWOHNER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEinwohner() <em>Einwohner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinwohner()
	 * @generated
	 * @ordered
	 */
	protected int einwohner = EINWOHNER_EDEFAULT;

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
	protected StadtteilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CityPackage.Literals.STADTTEIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTyp(String newTyp) {
		String oldTyp = typ;
		typ = newTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTTEIL__TYP, oldTyp, typ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFlaecheKm2() {
		return flaecheKm2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlaecheKm2(double newFlaecheKm2) {
		double oldFlaecheKm2 = flaecheKm2;
		flaecheKm2 = newFlaecheKm2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTTEIL__FLAECHE_KM2, oldFlaecheKm2, flaecheKm2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGebaeude() {
		return gebaeude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGebaeude(int newGebaeude) {
		int oldGebaeude = gebaeude;
		gebaeude = newGebaeude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTTEIL__GEBAEUDE, oldGebaeude, gebaeude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEinwohner() {
		return einwohner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinwohner(int newEinwohner) {
		int oldEinwohner = einwohner;
		einwohner = newEinwohner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTTEIL__EINWOHNER, oldEinwohner, einwohner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTTEIL__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CityPackage.STADTTEIL__TYP:
				return getTyp();
			case CityPackage.STADTTEIL__FLAECHE_KM2:
				return getFlaecheKm2();
			case CityPackage.STADTTEIL__GEBAEUDE:
				return getGebaeude();
			case CityPackage.STADTTEIL__EINWOHNER:
				return getEinwohner();
			case CityPackage.STADTTEIL__COLOR:
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
			case CityPackage.STADTTEIL__TYP:
				setTyp((String)newValue);
				return;
			case CityPackage.STADTTEIL__FLAECHE_KM2:
				setFlaecheKm2((Double)newValue);
				return;
			case CityPackage.STADTTEIL__GEBAEUDE:
				setGebaeude((Integer)newValue);
				return;
			case CityPackage.STADTTEIL__EINWOHNER:
				setEinwohner((Integer)newValue);
				return;
			case CityPackage.STADTTEIL__COLOR:
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
			case CityPackage.STADTTEIL__TYP:
				setTyp(TYP_EDEFAULT);
				return;
			case CityPackage.STADTTEIL__FLAECHE_KM2:
				setFlaecheKm2(FLAECHE_KM2_EDEFAULT);
				return;
			case CityPackage.STADTTEIL__GEBAEUDE:
				setGebaeude(GEBAEUDE_EDEFAULT);
				return;
			case CityPackage.STADTTEIL__EINWOHNER:
				setEinwohner(EINWOHNER_EDEFAULT);
				return;
			case CityPackage.STADTTEIL__COLOR:
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
			case CityPackage.STADTTEIL__TYP:
				return TYP_EDEFAULT == null ? typ != null : !TYP_EDEFAULT.equals(typ);
			case CityPackage.STADTTEIL__FLAECHE_KM2:
				return flaecheKm2 != FLAECHE_KM2_EDEFAULT;
			case CityPackage.STADTTEIL__GEBAEUDE:
				return gebaeude != GEBAEUDE_EDEFAULT;
			case CityPackage.STADTTEIL__EINWOHNER:
				return einwohner != EINWOHNER_EDEFAULT;
			case CityPackage.STADTTEIL__COLOR:
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
		result.append(" (typ: ");
		result.append(typ);
		result.append(", flaecheKm2: ");
		result.append(flaecheKm2);
		result.append(", gebaeude: ");
		result.append(gebaeude);
		result.append(", einwohner: ");
		result.append(einwohner);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //StadtteilImpl
