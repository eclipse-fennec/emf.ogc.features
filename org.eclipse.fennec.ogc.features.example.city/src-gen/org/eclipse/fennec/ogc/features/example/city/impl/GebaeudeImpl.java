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
import org.eclipse.fennec.ogc.features.example.city.Gebaeude;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gebaeude</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.GebaeudeImpl#getTyp <em>Typ</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.GebaeudeImpl#getGeschosse <em>Geschosse</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.GebaeudeImpl#getHoeheM <em>Hoehe M</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.GebaeudeImpl#getFlaecheM2 <em>Flaeche M2</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.GebaeudeImpl#getStadtteil <em>Stadtteil</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.GebaeudeImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.GebaeudeImpl#getGehoeft <em>Gehoeft</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.GebaeudeImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GebaeudeImpl extends CityFeatureImpl implements Gebaeude {
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
	 * The default value of the '{@link #getGeschosse() <em>Geschosse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschosse()
	 * @generated
	 * @ordered
	 */
	protected static final int GESCHOSSE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGeschosse() <em>Geschosse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschosse()
	 * @generated
	 * @ordered
	 */
	protected int geschosse = GESCHOSSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoeheM() <em>Hoehe M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheM()
	 * @generated
	 * @ordered
	 */
	protected static final double HOEHE_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHoeheM() <em>Hoehe M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheM()
	 * @generated
	 * @ordered
	 */
	protected double hoeheM = HOEHE_M_EDEFAULT;

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
	 * The default value of the '{@link #getStadtteil() <em>Stadtteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadtteil()
	 * @generated
	 * @ordered
	 */
	protected static final String STADTTEIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStadtteil() <em>Stadtteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadtteil()
	 * @generated
	 * @ordered
	 */
	protected String stadtteil = STADTTEIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected String adresse = ADRESSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGehoeft() <em>Gehoeft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGehoeft()
	 * @generated
	 * @ordered
	 */
	protected static final String GEHOEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGehoeft() <em>Gehoeft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGehoeft()
	 * @generated
	 * @ordered
	 */
	protected String gehoeft = GEHOEFT_EDEFAULT;

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
	protected GebaeudeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CityPackage.Literals.GEBAEUDE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.GEBAEUDE__TYP, oldTyp, typ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGeschosse() {
		return geschosse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeschosse(int newGeschosse) {
		int oldGeschosse = geschosse;
		geschosse = newGeschosse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.GEBAEUDE__GESCHOSSE, oldGeschosse, geschosse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHoeheM() {
		return hoeheM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHoeheM(double newHoeheM) {
		double oldHoeheM = hoeheM;
		hoeheM = newHoeheM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.GEBAEUDE__HOEHE_M, oldHoeheM, hoeheM));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.GEBAEUDE__FLAECHE_M2, oldFlaecheM2, flaecheM2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStadtteil() {
		return stadtteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStadtteil(String newStadtteil) {
		String oldStadtteil = stadtteil;
		stadtteil = newStadtteil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.GEBAEUDE__STADTTEIL, oldStadtteil, stadtteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdresse(String newAdresse) {
		String oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.GEBAEUDE__ADRESSE, oldAdresse, adresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGehoeft() {
		return gehoeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGehoeft(String newGehoeft) {
		String oldGehoeft = gehoeft;
		gehoeft = newGehoeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.GEBAEUDE__GEHOEFT, oldGehoeft, gehoeft));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.GEBAEUDE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CityPackage.GEBAEUDE__TYP:
				return getTyp();
			case CityPackage.GEBAEUDE__GESCHOSSE:
				return getGeschosse();
			case CityPackage.GEBAEUDE__HOEHE_M:
				return getHoeheM();
			case CityPackage.GEBAEUDE__FLAECHE_M2:
				return getFlaecheM2();
			case CityPackage.GEBAEUDE__STADTTEIL:
				return getStadtteil();
			case CityPackage.GEBAEUDE__ADRESSE:
				return getAdresse();
			case CityPackage.GEBAEUDE__GEHOEFT:
				return getGehoeft();
			case CityPackage.GEBAEUDE__COLOR:
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
			case CityPackage.GEBAEUDE__TYP:
				setTyp((String)newValue);
				return;
			case CityPackage.GEBAEUDE__GESCHOSSE:
				setGeschosse((Integer)newValue);
				return;
			case CityPackage.GEBAEUDE__HOEHE_M:
				setHoeheM((Double)newValue);
				return;
			case CityPackage.GEBAEUDE__FLAECHE_M2:
				setFlaecheM2((Integer)newValue);
				return;
			case CityPackage.GEBAEUDE__STADTTEIL:
				setStadtteil((String)newValue);
				return;
			case CityPackage.GEBAEUDE__ADRESSE:
				setAdresse((String)newValue);
				return;
			case CityPackage.GEBAEUDE__GEHOEFT:
				setGehoeft((String)newValue);
				return;
			case CityPackage.GEBAEUDE__COLOR:
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
			case CityPackage.GEBAEUDE__TYP:
				setTyp(TYP_EDEFAULT);
				return;
			case CityPackage.GEBAEUDE__GESCHOSSE:
				setGeschosse(GESCHOSSE_EDEFAULT);
				return;
			case CityPackage.GEBAEUDE__HOEHE_M:
				setHoeheM(HOEHE_M_EDEFAULT);
				return;
			case CityPackage.GEBAEUDE__FLAECHE_M2:
				setFlaecheM2(FLAECHE_M2_EDEFAULT);
				return;
			case CityPackage.GEBAEUDE__STADTTEIL:
				setStadtteil(STADTTEIL_EDEFAULT);
				return;
			case CityPackage.GEBAEUDE__ADRESSE:
				setAdresse(ADRESSE_EDEFAULT);
				return;
			case CityPackage.GEBAEUDE__GEHOEFT:
				setGehoeft(GEHOEFT_EDEFAULT);
				return;
			case CityPackage.GEBAEUDE__COLOR:
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
			case CityPackage.GEBAEUDE__TYP:
				return TYP_EDEFAULT == null ? typ != null : !TYP_EDEFAULT.equals(typ);
			case CityPackage.GEBAEUDE__GESCHOSSE:
				return geschosse != GESCHOSSE_EDEFAULT;
			case CityPackage.GEBAEUDE__HOEHE_M:
				return hoeheM != HOEHE_M_EDEFAULT;
			case CityPackage.GEBAEUDE__FLAECHE_M2:
				return flaecheM2 != FLAECHE_M2_EDEFAULT;
			case CityPackage.GEBAEUDE__STADTTEIL:
				return STADTTEIL_EDEFAULT == null ? stadtteil != null : !STADTTEIL_EDEFAULT.equals(stadtteil);
			case CityPackage.GEBAEUDE__ADRESSE:
				return ADRESSE_EDEFAULT == null ? adresse != null : !ADRESSE_EDEFAULT.equals(adresse);
			case CityPackage.GEBAEUDE__GEHOEFT:
				return GEHOEFT_EDEFAULT == null ? gehoeft != null : !GEHOEFT_EDEFAULT.equals(gehoeft);
			case CityPackage.GEBAEUDE__COLOR:
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
		result.append(", geschosse: ");
		result.append(geschosse);
		result.append(", hoeheM: ");
		result.append(hoeheM);
		result.append(", flaecheM2: ");
		result.append(flaecheM2);
		result.append(", stadtteil: ");
		result.append(stadtteil);
		result.append(", adresse: ");
		result.append(adresse);
		result.append(", gehoeft: ");
		result.append(gehoeft);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //GebaeudeImpl
