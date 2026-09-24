/**
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.ogc.features.example.city.CityFactory;
import org.eclipse.fennec.ogc.features.example.city.CityFeature;
import org.eclipse.fennec.ogc.features.example.city.CityPackage;
import org.eclipse.fennec.ogc.features.example.city.Flaeche;
import org.eclipse.fennec.ogc.features.example.city.Gebaeude;
import org.eclipse.fennec.ogc.features.example.city.Nutzung;
import org.eclipse.fennec.ogc.features.example.city.Ort;
import org.eclipse.fennec.ogc.features.example.city.Stadtgebiet;
import org.eclipse.fennec.ogc.features.example.city.Stadtteil;
import org.eclipse.fennec.ogc.features.example.city.Strasse;
import org.eclipse.fennec.ogc.features.example.city.Strassenklasse;

import org.geojson.Geometry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CityPackageImpl extends EPackageImpl implements CityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cityFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stadtgebietEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stadtteilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flaecheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strasseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gebaeudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nutzungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum strassenklasseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geoJsonGeometryEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CityPackageImpl() {
		super(eNS_URI, CityFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CityPackage init() {
		if (isInited) return (CityPackage)EPackage.Registry.INSTANCE.getEPackage(CityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CityPackageImpl theCityPackage = registeredCityPackage instanceof CityPackageImpl ? (CityPackageImpl)registeredCityPackage : new CityPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCityPackage.createPackageContents();

		// Initialize created meta-data
		theCityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CityPackage.eNS_URI, theCityPackage);
		return theCityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCityFeature() {
		return cityFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCityFeature_Id() {
		return (EAttribute)cityFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCityFeature_Name() {
		return (EAttribute)cityFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCityFeature_Geometry() {
		return (EAttribute)cityFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCityFeature_MinX() {
		return (EAttribute)cityFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCityFeature_MinY() {
		return (EAttribute)cityFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCityFeature_MaxX() {
		return (EAttribute)cityFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCityFeature_MaxY() {
		return (EAttribute)cityFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStadtgebiet() {
		return stadtgebietEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtgebiet_Kategorie() {
		return (EAttribute)stadtgebietEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtgebiet_FeatureTyp() {
		return (EAttribute)stadtgebietEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtgebiet_Land() {
		return (EAttribute)stadtgebietEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtgebiet_Bundesland() {
		return (EAttribute)stadtgebietEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtgebiet_Landkreis() {
		return (EAttribute)stadtgebietEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtgebiet_FlaecheKm2() {
		return (EAttribute)stadtgebietEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtgebiet_UmfangKm() {
		return (EAttribute)stadtgebietEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtgebiet_Nachbarorte() {
		return (EAttribute)stadtgebietEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtgebiet_Quelle() {
		return (EAttribute)stadtgebietEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtgebiet_GenauigkeitM() {
		return (EAttribute)stadtgebietEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtgebiet_Hinweis() {
		return (EAttribute)stadtgebietEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtgebiet_Color() {
		return (EAttribute)stadtgebietEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStadtteil() {
		return stadtteilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtteil_Typ() {
		return (EAttribute)stadtteilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtteil_FlaecheKm2() {
		return (EAttribute)stadtteilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtteil_Gebaeude() {
		return (EAttribute)stadtteilEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtteil_Einwohner() {
		return (EAttribute)stadtteilEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStadtteil_Color() {
		return (EAttribute)stadtteilEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlaeche() {
		return flaecheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlaeche_Nutzung() {
		return (EAttribute)flaecheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlaeche_FlaecheM2() {
		return (EAttribute)flaecheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlaeche_Frucht() {
		return (EAttribute)flaecheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlaeche_Baumart() {
		return (EAttribute)flaecheEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlaeche_Color() {
		return (EAttribute)flaecheEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrasse() {
		return strasseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrasse_Klasse() {
		return (EAttribute)strasseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrasse_BreiteM() {
		return (EAttribute)strasseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrasse_LaengeM() {
		return (EAttribute)strasseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrasse_Richtung() {
		return (EAttribute)strasseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrasse_Color() {
		return (EAttribute)strasseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGebaeude() {
		return gebaeudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGebaeude_Typ() {
		return (EAttribute)gebaeudeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGebaeude_Geschosse() {
		return (EAttribute)gebaeudeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGebaeude_HoeheM() {
		return (EAttribute)gebaeudeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGebaeude_FlaecheM2() {
		return (EAttribute)gebaeudeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGebaeude_Stadtteil() {
		return (EAttribute)gebaeudeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGebaeude_Adresse() {
		return (EAttribute)gebaeudeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGebaeude_Gehoeft() {
		return (EAttribute)gebaeudeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGebaeude_Color() {
		return (EAttribute)gebaeudeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrt() {
		return ortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrt_Kategorie() {
		return (EAttribute)ortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrt_Color() {
		return (EAttribute)ortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNutzung() {
		return nutzungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStrassenklasse() {
		return strassenklasseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGeoJsonGeometry() {
		return geoJsonGeometryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CityFactory getCityFactory() {
		return (CityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cityFeatureEClass = createEClass(CITY_FEATURE);
		createEAttribute(cityFeatureEClass, CITY_FEATURE__ID);
		createEAttribute(cityFeatureEClass, CITY_FEATURE__NAME);
		createEAttribute(cityFeatureEClass, CITY_FEATURE__GEOMETRY);
		createEAttribute(cityFeatureEClass, CITY_FEATURE__MIN_X);
		createEAttribute(cityFeatureEClass, CITY_FEATURE__MIN_Y);
		createEAttribute(cityFeatureEClass, CITY_FEATURE__MAX_X);
		createEAttribute(cityFeatureEClass, CITY_FEATURE__MAX_Y);

		stadtgebietEClass = createEClass(STADTGEBIET);
		createEAttribute(stadtgebietEClass, STADTGEBIET__KATEGORIE);
		createEAttribute(stadtgebietEClass, STADTGEBIET__FEATURE_TYP);
		createEAttribute(stadtgebietEClass, STADTGEBIET__LAND);
		createEAttribute(stadtgebietEClass, STADTGEBIET__BUNDESLAND);
		createEAttribute(stadtgebietEClass, STADTGEBIET__LANDKREIS);
		createEAttribute(stadtgebietEClass, STADTGEBIET__FLAECHE_KM2);
		createEAttribute(stadtgebietEClass, STADTGEBIET__UMFANG_KM);
		createEAttribute(stadtgebietEClass, STADTGEBIET__NACHBARORTE);
		createEAttribute(stadtgebietEClass, STADTGEBIET__QUELLE);
		createEAttribute(stadtgebietEClass, STADTGEBIET__GENAUIGKEIT_M);
		createEAttribute(stadtgebietEClass, STADTGEBIET__HINWEIS);
		createEAttribute(stadtgebietEClass, STADTGEBIET__COLOR);

		stadtteilEClass = createEClass(STADTTEIL);
		createEAttribute(stadtteilEClass, STADTTEIL__TYP);
		createEAttribute(stadtteilEClass, STADTTEIL__FLAECHE_KM2);
		createEAttribute(stadtteilEClass, STADTTEIL__GEBAEUDE);
		createEAttribute(stadtteilEClass, STADTTEIL__EINWOHNER);
		createEAttribute(stadtteilEClass, STADTTEIL__COLOR);

		flaecheEClass = createEClass(FLAECHE);
		createEAttribute(flaecheEClass, FLAECHE__NUTZUNG);
		createEAttribute(flaecheEClass, FLAECHE__FLAECHE_M2);
		createEAttribute(flaecheEClass, FLAECHE__FRUCHT);
		createEAttribute(flaecheEClass, FLAECHE__BAUMART);
		createEAttribute(flaecheEClass, FLAECHE__COLOR);

		strasseEClass = createEClass(STRASSE);
		createEAttribute(strasseEClass, STRASSE__KLASSE);
		createEAttribute(strasseEClass, STRASSE__BREITE_M);
		createEAttribute(strasseEClass, STRASSE__LAENGE_M);
		createEAttribute(strasseEClass, STRASSE__RICHTUNG);
		createEAttribute(strasseEClass, STRASSE__COLOR);

		gebaeudeEClass = createEClass(GEBAEUDE);
		createEAttribute(gebaeudeEClass, GEBAEUDE__TYP);
		createEAttribute(gebaeudeEClass, GEBAEUDE__GESCHOSSE);
		createEAttribute(gebaeudeEClass, GEBAEUDE__HOEHE_M);
		createEAttribute(gebaeudeEClass, GEBAEUDE__FLAECHE_M2);
		createEAttribute(gebaeudeEClass, GEBAEUDE__STADTTEIL);
		createEAttribute(gebaeudeEClass, GEBAEUDE__ADRESSE);
		createEAttribute(gebaeudeEClass, GEBAEUDE__GEHOEFT);
		createEAttribute(gebaeudeEClass, GEBAEUDE__COLOR);

		ortEClass = createEClass(ORT);
		createEAttribute(ortEClass, ORT__KATEGORIE);
		createEAttribute(ortEClass, ORT__COLOR);

		// Create enums
		nutzungEEnum = createEEnum(NUTZUNG);
		strassenklasseEEnum = createEEnum(STRASSENKLASSE);

		// Create data types
		geoJsonGeometryEDataType = createEDataType(GEO_JSON_GEOMETRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stadtgebietEClass.getESuperTypes().add(this.getCityFeature());
		stadtteilEClass.getESuperTypes().add(this.getCityFeature());
		flaecheEClass.getESuperTypes().add(this.getCityFeature());
		strasseEClass.getESuperTypes().add(this.getCityFeature());
		gebaeudeEClass.getESuperTypes().add(this.getCityFeature());
		ortEClass.getESuperTypes().add(this.getCityFeature());

		// Initialize classes, features, and operations; add parameters
		initEClass(cityFeatureEClass, CityFeature.class, "CityFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCityFeature_Id(), ecorePackage.getEString(), "id", null, 1, 1, CityFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCityFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, CityFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCityFeature_Geometry(), this.getGeoJsonGeometry(), "geometry", null, 0, 1, CityFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCityFeature_MinX(), ecorePackage.getEDouble(), "minX", null, 0, 1, CityFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCityFeature_MinY(), ecorePackage.getEDouble(), "minY", null, 0, 1, CityFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCityFeature_MaxX(), ecorePackage.getEDouble(), "maxX", null, 0, 1, CityFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCityFeature_MaxY(), ecorePackage.getEDouble(), "maxY", null, 0, 1, CityFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stadtgebietEClass, Stadtgebiet.class, "Stadtgebiet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStadtgebiet_Kategorie(), ecorePackage.getEString(), "kategorie", null, 0, 1, Stadtgebiet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStadtgebiet_FeatureTyp(), ecorePackage.getEString(), "featureTyp", null, 0, 1, Stadtgebiet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStadtgebiet_Land(), ecorePackage.getEString(), "land", null, 0, 1, Stadtgebiet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStadtgebiet_Bundesland(), ecorePackage.getEString(), "bundesland", null, 0, 1, Stadtgebiet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStadtgebiet_Landkreis(), ecorePackage.getEString(), "landkreis", null, 0, 1, Stadtgebiet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStadtgebiet_FlaecheKm2(), ecorePackage.getEDouble(), "flaecheKm2", null, 0, 1, Stadtgebiet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStadtgebiet_UmfangKm(), ecorePackage.getEDouble(), "umfangKm", null, 0, 1, Stadtgebiet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStadtgebiet_Nachbarorte(), ecorePackage.getEString(), "nachbarorte", null, 0, 1, Stadtgebiet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStadtgebiet_Quelle(), ecorePackage.getEString(), "quelle", null, 0, 1, Stadtgebiet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStadtgebiet_GenauigkeitM(), ecorePackage.getEInt(), "genauigkeitM", null, 0, 1, Stadtgebiet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStadtgebiet_Hinweis(), ecorePackage.getEString(), "hinweis", null, 0, 1, Stadtgebiet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStadtgebiet_Color(), ecorePackage.getEString(), "color", null, 0, 1, Stadtgebiet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stadtteilEClass, Stadtteil.class, "Stadtteil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStadtteil_Typ(), ecorePackage.getEString(), "typ", null, 0, 1, Stadtteil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStadtteil_FlaecheKm2(), ecorePackage.getEDouble(), "flaecheKm2", null, 0, 1, Stadtteil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStadtteil_Gebaeude(), ecorePackage.getEInt(), "gebaeude", null, 0, 1, Stadtteil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStadtteil_Einwohner(), ecorePackage.getEInt(), "einwohner", null, 0, 1, Stadtteil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStadtteil_Color(), ecorePackage.getEString(), "color", null, 0, 1, Stadtteil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flaecheEClass, Flaeche.class, "Flaeche", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlaeche_Nutzung(), this.getNutzung(), "nutzung", null, 0, 1, Flaeche.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlaeche_FlaecheM2(), ecorePackage.getEInt(), "flaecheM2", null, 0, 1, Flaeche.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlaeche_Frucht(), ecorePackage.getEString(), "frucht", null, 0, 1, Flaeche.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlaeche_Baumart(), ecorePackage.getEString(), "baumart", null, 0, 1, Flaeche.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlaeche_Color(), ecorePackage.getEString(), "color", null, 0, 1, Flaeche.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strasseEClass, Strasse.class, "Strasse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrasse_Klasse(), this.getStrassenklasse(), "klasse", null, 0, 1, Strasse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrasse_BreiteM(), ecorePackage.getEDouble(), "breiteM", null, 0, 1, Strasse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrasse_LaengeM(), ecorePackage.getEInt(), "laengeM", null, 0, 1, Strasse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrasse_Richtung(), ecorePackage.getEString(), "richtung", null, 0, 1, Strasse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrasse_Color(), ecorePackage.getEString(), "color", null, 0, 1, Strasse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gebaeudeEClass, Gebaeude.class, "Gebaeude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGebaeude_Typ(), ecorePackage.getEString(), "typ", null, 0, 1, Gebaeude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGebaeude_Geschosse(), ecorePackage.getEInt(), "geschosse", null, 0, 1, Gebaeude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGebaeude_HoeheM(), ecorePackage.getEDouble(), "hoeheM", null, 0, 1, Gebaeude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGebaeude_FlaecheM2(), ecorePackage.getEInt(), "flaecheM2", null, 0, 1, Gebaeude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGebaeude_Stadtteil(), ecorePackage.getEString(), "stadtteil", null, 0, 1, Gebaeude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGebaeude_Adresse(), ecorePackage.getEString(), "adresse", null, 0, 1, Gebaeude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGebaeude_Gehoeft(), ecorePackage.getEString(), "gehoeft", null, 0, 1, Gebaeude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGebaeude_Color(), ecorePackage.getEString(), "color", null, 0, 1, Gebaeude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ortEClass, Ort.class, "Ort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrt_Kategorie(), ecorePackage.getEString(), "kategorie", null, 0, 1, Ort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrt_Color(), ecorePackage.getEString(), "color", null, 0, 1, Ort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nutzungEEnum, Nutzung.class, "Nutzung");
		addEEnumLiteral(nutzungEEnum, Nutzung.WIESE);
		addEEnumLiteral(nutzungEEnum, Nutzung.FELD);
		addEEnumLiteral(nutzungEEnum, Nutzung.OBSTWIESE);
		addEEnumLiteral(nutzungEEnum, Nutzung.KLEINGAERTEN);
		addEEnumLiteral(nutzungEEnum, Nutzung.WALD);
		addEEnumLiteral(nutzungEEnum, Nutzung.PARK);
		addEEnumLiteral(nutzungEEnum, Nutzung.MARKTPLATZ);
		addEEnumLiteral(nutzungEEnum, Nutzung.SCHULHOF);
		addEEnumLiteral(nutzungEEnum, Nutzung.FRIEDHOF);
		addEEnumLiteral(nutzungEEnum, Nutzung.KLINIKGELAENDE);
		addEEnumLiteral(nutzungEEnum, Nutzung.SPORTPLATZ);

		initEEnum(strassenklasseEEnum, Strassenklasse.class, "Strassenklasse");
		addEEnumLiteral(strassenklasseEEnum, Strassenklasse.HAUPTSTRASSE);
		addEEnumLiteral(strassenklasseEEnum, Strassenklasse.NEBENSTRASSE);
		addEEnumLiteral(strassenklasseEEnum, Strassenklasse.WOHNSTRASSE);

		// Initialize data types
		initEDataType(geoJsonGeometryEDataType, Geometry.class, "GeoJsonGeometry", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// https://eclipse.org/fennec/persistence
		createPersistenceAnnotations();
		// https://eclipse.org/fennec/ogc/features
		createFeaturesAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>https://eclipse.org/fennec/persistence</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPersistenceAnnotations() {
		String source = "https://eclipse.org/fennec/persistence";
		addAnnotation
		  (cityFeatureEClass,
		   source,
		   new String[] {
			   "inheritance", "SINGLE_TABLE"
		   });
	}

	/**
	 * Initializes the annotations for <b>https://eclipse.org/fennec/ogc/features</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createFeaturesAnnotations() {
		String source = "https://eclipse.org/fennec/ogc/features";
		addAnnotation
		  (cityFeatureEClass,
		   source,
		   new String[] {
			   "geometry", "geometry",
			   "bbox", "minX,minY,maxX,maxY"
		   });
		addAnnotation
		  (stadtgebietEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "dim_stadt",
			   "title", "Dim Stadt",
			   "style", "{\"color\":\"#b3261e\",\"fillOpacity\":0}"
		   });
		addAnnotation
		  (getStadtgebiet_Color(),
		   source,
		   new String[] {
			   "property", "stroke"
		   });
		addAnnotation
		  (stadtteilEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "stadtteile",
			   "title", "Stadtteile",
			   "style", "{\"color\":\"#6366f1\",\"fillOpacity\":0.06}"
		   });
		addAnnotation
		  (getStadtteil_Color(),
		   source,
		   new String[] {
			   "property", "fill"
		   });
		addAnnotation
		  (flaecheEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "flaechen",
			   "title", "Fl\u00e4chen",
			   "style", "{\"color\":\"#a3e635\",\"fillOpacity\":0.4}"
		   });
		addAnnotation
		  (getFlaeche_Color(),
		   source,
		   new String[] {
			   "property", "fill"
		   });
		addAnnotation
		  (strasseEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "strassen",
			   "title", "Stra\u00dfen",
			   "style", "#57534e"
		   });
		addAnnotation
		  (getStrasse_Color(),
		   source,
		   new String[] {
			   "property", "stroke"
		   });
		addAnnotation
		  (gebaeudeEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "gebaeude",
			   "title", "Geb\u00e4ude",
			   "style", "{\"color\":\"#9c4f3f\",\"fillOpacity\":0.75}"
		   });
		addAnnotation
		  (getGebaeude_Color(),
		   source,
		   new String[] {
			   "property", "fill"
		   });
		addAnnotation
		  (ortEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "orte",
			   "title", "Orte",
			   "style", "#0ea5e9"
		   });
		addAnnotation
		  (getOrt_Color(),
		   source,
		   new String[] {
			   "property", "marker-color"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (getStadtgebiet_FeatureTyp(),
		   source,
		   new String[] {
			   "name", "feature_typ"
		   });
		addAnnotation
		  (getStadtgebiet_FlaecheKm2(),
		   source,
		   new String[] {
			   "name", "flaeche_km2"
		   });
		addAnnotation
		  (getStadtgebiet_UmfangKm(),
		   source,
		   new String[] {
			   "name", "umfang_km"
		   });
		addAnnotation
		  (getStadtgebiet_GenauigkeitM(),
		   source,
		   new String[] {
			   "name", "genauigkeit_m"
		   });
		addAnnotation
		  (getStadtteil_FlaecheKm2(),
		   source,
		   new String[] {
			   "name", "flaeche_km2"
		   });
		addAnnotation
		  (getFlaeche_FlaecheM2(),
		   source,
		   new String[] {
			   "name", "flaeche_m2"
		   });
		addAnnotation
		  (getStrasse_BreiteM(),
		   source,
		   new String[] {
			   "name", "breite_m"
		   });
		addAnnotation
		  (getStrasse_LaengeM(),
		   source,
		   new String[] {
			   "name", "laenge_m"
		   });
		addAnnotation
		  (getGebaeude_HoeheM(),
		   source,
		   new String[] {
			   "name", "hoehe_m"
		   });
		addAnnotation
		  (getGebaeude_FlaecheM2(),
		   source,
		   new String[] {
			   "name", "flaeche_m2"
		   });
	}

} //CityPackageImpl
