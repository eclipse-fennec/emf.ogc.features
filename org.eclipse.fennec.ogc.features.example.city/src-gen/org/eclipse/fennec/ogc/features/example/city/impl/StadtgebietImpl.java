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
import org.eclipse.fennec.ogc.features.example.city.Stadtgebiet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stadtgebiet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtgebietImpl#getKategorie <em>Kategorie</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtgebietImpl#getFeatureTyp <em>Feature Typ</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtgebietImpl#getLand <em>Land</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtgebietImpl#getBundesland <em>Bundesland</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtgebietImpl#getLandkreis <em>Landkreis</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtgebietImpl#getFlaecheKm2 <em>Flaeche Km2</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtgebietImpl#getUmfangKm <em>Umfang Km</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtgebietImpl#getNachbarorte <em>Nachbarorte</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtgebietImpl#getQuelle <em>Quelle</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtgebietImpl#getGenauigkeitM <em>Genauigkeit M</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtgebietImpl#getHinweis <em>Hinweis</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtgebietImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StadtgebietImpl extends CityFeatureImpl implements Stadtgebiet {
	/**
	 * The default value of the '{@link #getKategorie() <em>Kategorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKategorie()
	 * @generated
	 * @ordered
	 */
	protected static final String KATEGORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKategorie() <em>Kategorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKategorie()
	 * @generated
	 * @ordered
	 */
	protected String kategorie = KATEGORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureTyp() <em>Feature Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureTyp()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_TYP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureTyp() <em>Feature Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureTyp()
	 * @generated
	 * @ordered
	 */
	protected String featureTyp = FEATURE_TYP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLand() <em>Land</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLand()
	 * @generated
	 * @ordered
	 */
	protected static final String LAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLand() <em>Land</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLand()
	 * @generated
	 * @ordered
	 */
	protected String land = LAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getBundesland() <em>Bundesland</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundesland()
	 * @generated
	 * @ordered
	 */
	protected static final String BUNDESLAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBundesland() <em>Bundesland</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundesland()
	 * @generated
	 * @ordered
	 */
	protected String bundesland = BUNDESLAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getLandkreis() <em>Landkreis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandkreis()
	 * @generated
	 * @ordered
	 */
	protected static final String LANDKREIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLandkreis() <em>Landkreis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandkreis()
	 * @generated
	 * @ordered
	 */
	protected String landkreis = LANDKREIS_EDEFAULT;

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
	 * The default value of the '{@link #getUmfangKm() <em>Umfang Km</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmfangKm()
	 * @generated
	 * @ordered
	 */
	protected static final double UMFANG_KM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUmfangKm() <em>Umfang Km</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmfangKm()
	 * @generated
	 * @ordered
	 */
	protected double umfangKm = UMFANG_KM_EDEFAULT;

	/**
	 * The default value of the '{@link #getNachbarorte() <em>Nachbarorte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachbarorte()
	 * @generated
	 * @ordered
	 */
	protected static final String NACHBARORTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNachbarorte() <em>Nachbarorte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachbarorte()
	 * @generated
	 * @ordered
	 */
	protected String nachbarorte = NACHBARORTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuelle() <em>Quelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuelle()
	 * @generated
	 * @ordered
	 */
	protected static final String QUELLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuelle() <em>Quelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuelle()
	 * @generated
	 * @ordered
	 */
	protected String quelle = QUELLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenauigkeitM() <em>Genauigkeit M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenauigkeitM()
	 * @generated
	 * @ordered
	 */
	protected static final int GENAUIGKEIT_M_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGenauigkeitM() <em>Genauigkeit M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenauigkeitM()
	 * @generated
	 * @ordered
	 */
	protected int genauigkeitM = GENAUIGKEIT_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getHinweis() <em>Hinweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHinweis()
	 * @generated
	 * @ordered
	 */
	protected static final String HINWEIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHinweis() <em>Hinweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHinweis()
	 * @generated
	 * @ordered
	 */
	protected String hinweis = HINWEIS_EDEFAULT;

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
	protected StadtgebietImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CityPackage.Literals.STADTGEBIET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKategorie() {
		return kategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKategorie(String newKategorie) {
		String oldKategorie = kategorie;
		kategorie = newKategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTGEBIET__KATEGORIE, oldKategorie, kategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeatureTyp() {
		return featureTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureTyp(String newFeatureTyp) {
		String oldFeatureTyp = featureTyp;
		featureTyp = newFeatureTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTGEBIET__FEATURE_TYP, oldFeatureTyp, featureTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLand() {
		return land;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLand(String newLand) {
		String oldLand = land;
		land = newLand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTGEBIET__LAND, oldLand, land));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBundesland() {
		return bundesland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBundesland(String newBundesland) {
		String oldBundesland = bundesland;
		bundesland = newBundesland;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTGEBIET__BUNDESLAND, oldBundesland, bundesland));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLandkreis() {
		return landkreis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLandkreis(String newLandkreis) {
		String oldLandkreis = landkreis;
		landkreis = newLandkreis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTGEBIET__LANDKREIS, oldLandkreis, landkreis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTGEBIET__FLAECHE_KM2, oldFlaecheKm2, flaecheKm2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUmfangKm() {
		return umfangKm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUmfangKm(double newUmfangKm) {
		double oldUmfangKm = umfangKm;
		umfangKm = newUmfangKm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTGEBIET__UMFANG_KM, oldUmfangKm, umfangKm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNachbarorte() {
		return nachbarorte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNachbarorte(String newNachbarorte) {
		String oldNachbarorte = nachbarorte;
		nachbarorte = newNachbarorte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTGEBIET__NACHBARORTE, oldNachbarorte, nachbarorte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuelle() {
		return quelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuelle(String newQuelle) {
		String oldQuelle = quelle;
		quelle = newQuelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTGEBIET__QUELLE, oldQuelle, quelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGenauigkeitM() {
		return genauigkeitM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenauigkeitM(int newGenauigkeitM) {
		int oldGenauigkeitM = genauigkeitM;
		genauigkeitM = newGenauigkeitM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTGEBIET__GENAUIGKEIT_M, oldGenauigkeitM, genauigkeitM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHinweis() {
		return hinweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHinweis(String newHinweis) {
		String oldHinweis = hinweis;
		hinweis = newHinweis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTGEBIET__HINWEIS, oldHinweis, hinweis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.STADTGEBIET__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CityPackage.STADTGEBIET__KATEGORIE:
				return getKategorie();
			case CityPackage.STADTGEBIET__FEATURE_TYP:
				return getFeatureTyp();
			case CityPackage.STADTGEBIET__LAND:
				return getLand();
			case CityPackage.STADTGEBIET__BUNDESLAND:
				return getBundesland();
			case CityPackage.STADTGEBIET__LANDKREIS:
				return getLandkreis();
			case CityPackage.STADTGEBIET__FLAECHE_KM2:
				return getFlaecheKm2();
			case CityPackage.STADTGEBIET__UMFANG_KM:
				return getUmfangKm();
			case CityPackage.STADTGEBIET__NACHBARORTE:
				return getNachbarorte();
			case CityPackage.STADTGEBIET__QUELLE:
				return getQuelle();
			case CityPackage.STADTGEBIET__GENAUIGKEIT_M:
				return getGenauigkeitM();
			case CityPackage.STADTGEBIET__HINWEIS:
				return getHinweis();
			case CityPackage.STADTGEBIET__COLOR:
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
			case CityPackage.STADTGEBIET__KATEGORIE:
				setKategorie((String)newValue);
				return;
			case CityPackage.STADTGEBIET__FEATURE_TYP:
				setFeatureTyp((String)newValue);
				return;
			case CityPackage.STADTGEBIET__LAND:
				setLand((String)newValue);
				return;
			case CityPackage.STADTGEBIET__BUNDESLAND:
				setBundesland((String)newValue);
				return;
			case CityPackage.STADTGEBIET__LANDKREIS:
				setLandkreis((String)newValue);
				return;
			case CityPackage.STADTGEBIET__FLAECHE_KM2:
				setFlaecheKm2((Double)newValue);
				return;
			case CityPackage.STADTGEBIET__UMFANG_KM:
				setUmfangKm((Double)newValue);
				return;
			case CityPackage.STADTGEBIET__NACHBARORTE:
				setNachbarorte((String)newValue);
				return;
			case CityPackage.STADTGEBIET__QUELLE:
				setQuelle((String)newValue);
				return;
			case CityPackage.STADTGEBIET__GENAUIGKEIT_M:
				setGenauigkeitM((Integer)newValue);
				return;
			case CityPackage.STADTGEBIET__HINWEIS:
				setHinweis((String)newValue);
				return;
			case CityPackage.STADTGEBIET__COLOR:
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
			case CityPackage.STADTGEBIET__KATEGORIE:
				setKategorie(KATEGORIE_EDEFAULT);
				return;
			case CityPackage.STADTGEBIET__FEATURE_TYP:
				setFeatureTyp(FEATURE_TYP_EDEFAULT);
				return;
			case CityPackage.STADTGEBIET__LAND:
				setLand(LAND_EDEFAULT);
				return;
			case CityPackage.STADTGEBIET__BUNDESLAND:
				setBundesland(BUNDESLAND_EDEFAULT);
				return;
			case CityPackage.STADTGEBIET__LANDKREIS:
				setLandkreis(LANDKREIS_EDEFAULT);
				return;
			case CityPackage.STADTGEBIET__FLAECHE_KM2:
				setFlaecheKm2(FLAECHE_KM2_EDEFAULT);
				return;
			case CityPackage.STADTGEBIET__UMFANG_KM:
				setUmfangKm(UMFANG_KM_EDEFAULT);
				return;
			case CityPackage.STADTGEBIET__NACHBARORTE:
				setNachbarorte(NACHBARORTE_EDEFAULT);
				return;
			case CityPackage.STADTGEBIET__QUELLE:
				setQuelle(QUELLE_EDEFAULT);
				return;
			case CityPackage.STADTGEBIET__GENAUIGKEIT_M:
				setGenauigkeitM(GENAUIGKEIT_M_EDEFAULT);
				return;
			case CityPackage.STADTGEBIET__HINWEIS:
				setHinweis(HINWEIS_EDEFAULT);
				return;
			case CityPackage.STADTGEBIET__COLOR:
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
			case CityPackage.STADTGEBIET__KATEGORIE:
				return KATEGORIE_EDEFAULT == null ? kategorie != null : !KATEGORIE_EDEFAULT.equals(kategorie);
			case CityPackage.STADTGEBIET__FEATURE_TYP:
				return FEATURE_TYP_EDEFAULT == null ? featureTyp != null : !FEATURE_TYP_EDEFAULT.equals(featureTyp);
			case CityPackage.STADTGEBIET__LAND:
				return LAND_EDEFAULT == null ? land != null : !LAND_EDEFAULT.equals(land);
			case CityPackage.STADTGEBIET__BUNDESLAND:
				return BUNDESLAND_EDEFAULT == null ? bundesland != null : !BUNDESLAND_EDEFAULT.equals(bundesland);
			case CityPackage.STADTGEBIET__LANDKREIS:
				return LANDKREIS_EDEFAULT == null ? landkreis != null : !LANDKREIS_EDEFAULT.equals(landkreis);
			case CityPackage.STADTGEBIET__FLAECHE_KM2:
				return flaecheKm2 != FLAECHE_KM2_EDEFAULT;
			case CityPackage.STADTGEBIET__UMFANG_KM:
				return umfangKm != UMFANG_KM_EDEFAULT;
			case CityPackage.STADTGEBIET__NACHBARORTE:
				return NACHBARORTE_EDEFAULT == null ? nachbarorte != null : !NACHBARORTE_EDEFAULT.equals(nachbarorte);
			case CityPackage.STADTGEBIET__QUELLE:
				return QUELLE_EDEFAULT == null ? quelle != null : !QUELLE_EDEFAULT.equals(quelle);
			case CityPackage.STADTGEBIET__GENAUIGKEIT_M:
				return genauigkeitM != GENAUIGKEIT_M_EDEFAULT;
			case CityPackage.STADTGEBIET__HINWEIS:
				return HINWEIS_EDEFAULT == null ? hinweis != null : !HINWEIS_EDEFAULT.equals(hinweis);
			case CityPackage.STADTGEBIET__COLOR:
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
		result.append(" (kategorie: ");
		result.append(kategorie);
		result.append(", featureTyp: ");
		result.append(featureTyp);
		result.append(", land: ");
		result.append(land);
		result.append(", bundesland: ");
		result.append(bundesland);
		result.append(", landkreis: ");
		result.append(landkreis);
		result.append(", flaecheKm2: ");
		result.append(flaecheKm2);
		result.append(", umfangKm: ");
		result.append(umfangKm);
		result.append(", nachbarorte: ");
		result.append(nachbarorte);
		result.append(", quelle: ");
		result.append(quelle);
		result.append(", genauigkeitM: ");
		result.append(genauigkeitM);
		result.append(", hinweis: ");
		result.append(hinweis);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //StadtgebietImpl
