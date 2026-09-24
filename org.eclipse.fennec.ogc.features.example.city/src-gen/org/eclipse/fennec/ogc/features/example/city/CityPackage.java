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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;

import org.eclipse.fennec.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The generated town Dim Stadt (Kyffhäuserkreis): boundary, districts, land use, streets, buildings and places, published as OGC API Features collections.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.ogc.features.example.city.CityFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = CityPackage.eNS_URI, fingerprint = "fp1:8f61078fda76f1f22ee1e4cd9fff83a4ac9914788f65e8ffd24b726fec7f88a9", genModel = "/model/city.genmodel", genModelSourceLocations = {"model/city.genmodel","org.eclipse.fennec.ogc.features.example.city/model/city.genmodel"}, ecore = "/model/city.ecore", ecoreSourceLocations = "/model/city.ecore")
public interface CityPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "city";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://eclipse.org/fennec/ogc/example/city/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "city";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CityPackage eINSTANCE = org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.city.impl.CityFeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityFeatureImpl
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getCityFeature()
	 * @generated
	 */
	int CITY_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE__GEOMETRY = 2;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE__MIN_X = 3;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE__MIN_Y = 4;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE__MAX_X = 5;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE__MAX_Y = 6;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtgebietImpl <em>Stadtgebiet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.StadtgebietImpl
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getStadtgebiet()
	 * @generated
	 */
	int STADTGEBIET = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__ID = CITY_FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__NAME = CITY_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__GEOMETRY = CITY_FEATURE__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__MIN_X = CITY_FEATURE__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__MIN_Y = CITY_FEATURE__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__MAX_X = CITY_FEATURE__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__MAX_Y = CITY_FEATURE__MAX_Y;

	/**
	 * The feature id for the '<em><b>Kategorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__KATEGORIE = CITY_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__FEATURE_TYP = CITY_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Land</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__LAND = CITY_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bundesland</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__BUNDESLAND = CITY_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Landkreis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__LANDKREIS = CITY_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Flaeche Km2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__FLAECHE_KM2 = CITY_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Umfang Km</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__UMFANG_KM = CITY_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Nachbarorte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__NACHBARORTE = CITY_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Quelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__QUELLE = CITY_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Genauigkeit M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__GENAUIGKEIT_M = CITY_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Hinweis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__HINWEIS = CITY_FEATURE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET__COLOR = CITY_FEATURE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Stadtgebiet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET_FEATURE_COUNT = CITY_FEATURE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Stadtgebiet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTGEBIET_OPERATION_COUNT = CITY_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtteilImpl <em>Stadtteil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.StadtteilImpl
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getStadtteil()
	 * @generated
	 */
	int STADTTEIL = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTTEIL__ID = CITY_FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTTEIL__NAME = CITY_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTTEIL__GEOMETRY = CITY_FEATURE__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTTEIL__MIN_X = CITY_FEATURE__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTTEIL__MIN_Y = CITY_FEATURE__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTTEIL__MAX_X = CITY_FEATURE__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTTEIL__MAX_Y = CITY_FEATURE__MAX_Y;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTTEIL__TYP = CITY_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flaeche Km2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTTEIL__FLAECHE_KM2 = CITY_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gebaeude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTTEIL__GEBAEUDE = CITY_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Einwohner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTTEIL__EINWOHNER = CITY_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTTEIL__COLOR = CITY_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Stadtteil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTTEIL_FEATURE_COUNT = CITY_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Stadtteil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADTTEIL_OPERATION_COUNT = CITY_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.city.impl.FlaecheImpl <em>Flaeche</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.FlaecheImpl
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getFlaeche()
	 * @generated
	 */
	int FLAECHE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAECHE__ID = CITY_FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAECHE__NAME = CITY_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAECHE__GEOMETRY = CITY_FEATURE__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAECHE__MIN_X = CITY_FEATURE__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAECHE__MIN_Y = CITY_FEATURE__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAECHE__MAX_X = CITY_FEATURE__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAECHE__MAX_Y = CITY_FEATURE__MAX_Y;

	/**
	 * The feature id for the '<em><b>Nutzung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAECHE__NUTZUNG = CITY_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flaeche M2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAECHE__FLAECHE_M2 = CITY_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Frucht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAECHE__FRUCHT = CITY_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Baumart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAECHE__BAUMART = CITY_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAECHE__COLOR = CITY_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Flaeche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAECHE_FEATURE_COUNT = CITY_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Flaeche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAECHE_OPERATION_COUNT = CITY_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.city.impl.StrasseImpl <em>Strasse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.StrasseImpl
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getStrasse()
	 * @generated
	 */
	int STRASSE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRASSE__ID = CITY_FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRASSE__NAME = CITY_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRASSE__GEOMETRY = CITY_FEATURE__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRASSE__MIN_X = CITY_FEATURE__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRASSE__MIN_Y = CITY_FEATURE__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRASSE__MAX_X = CITY_FEATURE__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRASSE__MAX_Y = CITY_FEATURE__MAX_Y;

	/**
	 * The feature id for the '<em><b>Klasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRASSE__KLASSE = CITY_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Breite M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRASSE__BREITE_M = CITY_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Laenge M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRASSE__LAENGE_M = CITY_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Richtung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRASSE__RICHTUNG = CITY_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRASSE__COLOR = CITY_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Strasse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRASSE_FEATURE_COUNT = CITY_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Strasse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRASSE_OPERATION_COUNT = CITY_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.city.impl.GebaeudeImpl <em>Gebaeude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.GebaeudeImpl
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getGebaeude()
	 * @generated
	 */
	int GEBAEUDE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__ID = CITY_FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__NAME = CITY_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__GEOMETRY = CITY_FEATURE__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__MIN_X = CITY_FEATURE__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__MIN_Y = CITY_FEATURE__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__MAX_X = CITY_FEATURE__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__MAX_Y = CITY_FEATURE__MAX_Y;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__TYP = CITY_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geschosse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__GESCHOSSE = CITY_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hoehe M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__HOEHE_M = CITY_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Flaeche M2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__FLAECHE_M2 = CITY_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stadtteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__STADTTEIL = CITY_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__ADRESSE = CITY_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gehoeft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__GEHOEFT = CITY_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE__COLOR = CITY_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Gebaeude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE_FEATURE_COUNT = CITY_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Gebaeude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBAEUDE_OPERATION_COUNT = CITY_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.city.impl.OrtImpl <em>Ort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.OrtImpl
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getOrt()
	 * @generated
	 */
	int ORT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORT__ID = CITY_FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORT__NAME = CITY_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORT__GEOMETRY = CITY_FEATURE__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORT__MIN_X = CITY_FEATURE__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORT__MIN_Y = CITY_FEATURE__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORT__MAX_X = CITY_FEATURE__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORT__MAX_Y = CITY_FEATURE__MAX_Y;

	/**
	 * The feature id for the '<em><b>Kategorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORT__KATEGORIE = CITY_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORT__COLOR = CITY_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORT_FEATURE_COUNT = CITY_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORT_OPERATION_COUNT = CITY_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.city.Nutzung <em>Nutzung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.city.Nutzung
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getNutzung()
	 * @generated
	 */
	int NUTZUNG = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.city.Strassenklasse <em>Strassenklasse</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.city.Strassenklasse
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getStrassenklasse()
	 * @generated
	 */
	int STRASSENKLASSE = 8;

	/**
	 * The meta object id for the '<em>Geo Json Geometry</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.Geometry
	 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getGeoJsonGeometry()
	 * @generated
	 */
	int GEO_JSON_GEOMETRY = 9;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.city.CityFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.CityFeature
	 * @generated
	 */
	EClass getCityFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.CityFeature#getId()
	 * @see #getCityFeature()
	 * @generated
	 */
	EAttribute getCityFeature_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.CityFeature#getName()
	 * @see #getCityFeature()
	 * @generated
	 */
	EAttribute getCityFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometry</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.CityFeature#getGeometry()
	 * @see #getCityFeature()
	 * @generated
	 */
	EAttribute getCityFeature_Geometry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getMinX <em>Min X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min X</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.CityFeature#getMinX()
	 * @see #getCityFeature()
	 * @generated
	 */
	EAttribute getCityFeature_MinX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getMinY <em>Min Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Y</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.CityFeature#getMinY()
	 * @see #getCityFeature()
	 * @generated
	 */
	EAttribute getCityFeature_MinY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getMaxX <em>Max X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max X</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.CityFeature#getMaxX()
	 * @see #getCityFeature()
	 * @generated
	 */
	EAttribute getCityFeature_MaxX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getMaxY <em>Max Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Y</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.CityFeature#getMaxY()
	 * @see #getCityFeature()
	 * @generated
	 */
	EAttribute getCityFeature_MaxY();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet <em>Stadtgebiet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stadtgebiet</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtgebiet
	 * @generated
	 */
	EClass getStadtgebiet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getKategorie <em>Kategorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kategorie</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getKategorie()
	 * @see #getStadtgebiet()
	 * @generated
	 */
	EAttribute getStadtgebiet_Kategorie();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getFeatureTyp <em>Feature Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Typ</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getFeatureTyp()
	 * @see #getStadtgebiet()
	 * @generated
	 */
	EAttribute getStadtgebiet_FeatureTyp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getLand <em>Land</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Land</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getLand()
	 * @see #getStadtgebiet()
	 * @generated
	 */
	EAttribute getStadtgebiet_Land();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getBundesland <em>Bundesland</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bundesland</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getBundesland()
	 * @see #getStadtgebiet()
	 * @generated
	 */
	EAttribute getStadtgebiet_Bundesland();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getLandkreis <em>Landkreis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Landkreis</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getLandkreis()
	 * @see #getStadtgebiet()
	 * @generated
	 */
	EAttribute getStadtgebiet_Landkreis();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getFlaecheKm2 <em>Flaeche Km2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flaeche Km2</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getFlaecheKm2()
	 * @see #getStadtgebiet()
	 * @generated
	 */
	EAttribute getStadtgebiet_FlaecheKm2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getUmfangKm <em>Umfang Km</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Umfang Km</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getUmfangKm()
	 * @see #getStadtgebiet()
	 * @generated
	 */
	EAttribute getStadtgebiet_UmfangKm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getNachbarorte <em>Nachbarorte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nachbarorte</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getNachbarorte()
	 * @see #getStadtgebiet()
	 * @generated
	 */
	EAttribute getStadtgebiet_Nachbarorte();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getQuelle <em>Quelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quelle</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getQuelle()
	 * @see #getStadtgebiet()
	 * @generated
	 */
	EAttribute getStadtgebiet_Quelle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getGenauigkeitM <em>Genauigkeit M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genauigkeit M</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getGenauigkeitM()
	 * @see #getStadtgebiet()
	 * @generated
	 */
	EAttribute getStadtgebiet_GenauigkeitM();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getHinweis <em>Hinweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hinweis</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getHinweis()
	 * @see #getStadtgebiet()
	 * @generated
	 */
	EAttribute getStadtgebiet_Hinweis();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtgebiet#getColor()
	 * @see #getStadtgebiet()
	 * @generated
	 */
	EAttribute getStadtgebiet_Color();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.city.Stadtteil <em>Stadtteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stadtteil</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtteil
	 * @generated
	 */
	EClass getStadtteil();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtteil#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typ</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtteil#getTyp()
	 * @see #getStadtteil()
	 * @generated
	 */
	EAttribute getStadtteil_Typ();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtteil#getFlaecheKm2 <em>Flaeche Km2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flaeche Km2</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtteil#getFlaecheKm2()
	 * @see #getStadtteil()
	 * @generated
	 */
	EAttribute getStadtteil_FlaecheKm2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtteil#getGebaeude <em>Gebaeude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gebaeude</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtteil#getGebaeude()
	 * @see #getStadtteil()
	 * @generated
	 */
	EAttribute getStadtteil_Gebaeude();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtteil#getEinwohner <em>Einwohner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einwohner</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtteil#getEinwohner()
	 * @see #getStadtteil()
	 * @generated
	 */
	EAttribute getStadtteil_Einwohner();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Stadtteil#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Stadtteil#getColor()
	 * @see #getStadtteil()
	 * @generated
	 */
	EAttribute getStadtteil_Color();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.city.Flaeche <em>Flaeche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flaeche</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Flaeche
	 * @generated
	 */
	EClass getFlaeche();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Flaeche#getNutzung <em>Nutzung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nutzung</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Flaeche#getNutzung()
	 * @see #getFlaeche()
	 * @generated
	 */
	EAttribute getFlaeche_Nutzung();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Flaeche#getFlaecheM2 <em>Flaeche M2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flaeche M2</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Flaeche#getFlaecheM2()
	 * @see #getFlaeche()
	 * @generated
	 */
	EAttribute getFlaeche_FlaecheM2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Flaeche#getFrucht <em>Frucht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frucht</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Flaeche#getFrucht()
	 * @see #getFlaeche()
	 * @generated
	 */
	EAttribute getFlaeche_Frucht();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Flaeche#getBaumart <em>Baumart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baumart</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Flaeche#getBaumart()
	 * @see #getFlaeche()
	 * @generated
	 */
	EAttribute getFlaeche_Baumart();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Flaeche#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Flaeche#getColor()
	 * @see #getFlaeche()
	 * @generated
	 */
	EAttribute getFlaeche_Color();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.city.Strasse <em>Strasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strasse</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Strasse
	 * @generated
	 */
	EClass getStrasse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Strasse#getKlasse <em>Klasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Klasse</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Strasse#getKlasse()
	 * @see #getStrasse()
	 * @generated
	 */
	EAttribute getStrasse_Klasse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Strasse#getBreiteM <em>Breite M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breite M</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Strasse#getBreiteM()
	 * @see #getStrasse()
	 * @generated
	 */
	EAttribute getStrasse_BreiteM();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Strasse#getLaengeM <em>Laenge M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Laenge M</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Strasse#getLaengeM()
	 * @see #getStrasse()
	 * @generated
	 */
	EAttribute getStrasse_LaengeM();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Strasse#getRichtung <em>Richtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Richtung</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Strasse#getRichtung()
	 * @see #getStrasse()
	 * @generated
	 */
	EAttribute getStrasse_Richtung();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Strasse#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Strasse#getColor()
	 * @see #getStrasse()
	 * @generated
	 */
	EAttribute getStrasse_Color();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude <em>Gebaeude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gebaeude</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Gebaeude
	 * @generated
	 */
	EClass getGebaeude();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typ</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Gebaeude#getTyp()
	 * @see #getGebaeude()
	 * @generated
	 */
	EAttribute getGebaeude_Typ();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getGeschosse <em>Geschosse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geschosse</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Gebaeude#getGeschosse()
	 * @see #getGebaeude()
	 * @generated
	 */
	EAttribute getGebaeude_Geschosse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getHoeheM <em>Hoehe M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hoehe M</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Gebaeude#getHoeheM()
	 * @see #getGebaeude()
	 * @generated
	 */
	EAttribute getGebaeude_HoeheM();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getFlaecheM2 <em>Flaeche M2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flaeche M2</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Gebaeude#getFlaecheM2()
	 * @see #getGebaeude()
	 * @generated
	 */
	EAttribute getGebaeude_FlaecheM2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getStadtteil <em>Stadtteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stadtteil</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Gebaeude#getStadtteil()
	 * @see #getGebaeude()
	 * @generated
	 */
	EAttribute getGebaeude_Stadtteil();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Gebaeude#getAdresse()
	 * @see #getGebaeude()
	 * @generated
	 */
	EAttribute getGebaeude_Adresse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getGehoeft <em>Gehoeft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gehoeft</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Gebaeude#getGehoeft()
	 * @see #getGebaeude()
	 * @generated
	 */
	EAttribute getGebaeude_Gehoeft();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Gebaeude#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Gebaeude#getColor()
	 * @see #getGebaeude()
	 * @generated
	 */
	EAttribute getGebaeude_Color();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.city.Ort <em>Ort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ort</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Ort
	 * @generated
	 */
	EClass getOrt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Ort#getKategorie <em>Kategorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kategorie</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Ort#getKategorie()
	 * @see #getOrt()
	 * @generated
	 */
	EAttribute getOrt_Kategorie();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.city.Ort#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Ort#getColor()
	 * @see #getOrt()
	 * @generated
	 */
	EAttribute getOrt_Color();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.ogc.features.example.city.Nutzung <em>Nutzung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nutzung</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Nutzung
	 * @generated
	 */
	EEnum getNutzung();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.ogc.features.example.city.Strassenklasse <em>Strassenklasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Strassenklasse</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.city.Strassenklasse
	 * @generated
	 */
	EEnum getStrassenklasse();

	/**
	 * Returns the meta object for data type '{@link org.geojson.Geometry <em>Geo Json Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A GeoJSON geometry, persisted as GeoJSON text.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Geo Json Geometry</em>'.
	 * @see org.geojson.Geometry
	 * @model instanceClass="org.geojson.Geometry"
	 * @generated
	 */
	EDataType getGeoJsonGeometry();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CityFactory getCityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.city.impl.CityFeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityFeatureImpl
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getCityFeature()
		 * @generated
		 */
		EClass CITY_FEATURE = eINSTANCE.getCityFeature();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_FEATURE__ID = eINSTANCE.getCityFeature_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_FEATURE__NAME = eINSTANCE.getCityFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_FEATURE__GEOMETRY = eINSTANCE.getCityFeature_Geometry();

		/**
		 * The meta object literal for the '<em><b>Min X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_FEATURE__MIN_X = eINSTANCE.getCityFeature_MinX();

		/**
		 * The meta object literal for the '<em><b>Min Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_FEATURE__MIN_Y = eINSTANCE.getCityFeature_MinY();

		/**
		 * The meta object literal for the '<em><b>Max X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_FEATURE__MAX_X = eINSTANCE.getCityFeature_MaxX();

		/**
		 * The meta object literal for the '<em><b>Max Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_FEATURE__MAX_Y = eINSTANCE.getCityFeature_MaxY();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtgebietImpl <em>Stadtgebiet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.StadtgebietImpl
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getStadtgebiet()
		 * @generated
		 */
		EClass STADTGEBIET = eINSTANCE.getStadtgebiet();

		/**
		 * The meta object literal for the '<em><b>Kategorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTGEBIET__KATEGORIE = eINSTANCE.getStadtgebiet_Kategorie();

		/**
		 * The meta object literal for the '<em><b>Feature Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTGEBIET__FEATURE_TYP = eINSTANCE.getStadtgebiet_FeatureTyp();

		/**
		 * The meta object literal for the '<em><b>Land</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTGEBIET__LAND = eINSTANCE.getStadtgebiet_Land();

		/**
		 * The meta object literal for the '<em><b>Bundesland</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTGEBIET__BUNDESLAND = eINSTANCE.getStadtgebiet_Bundesland();

		/**
		 * The meta object literal for the '<em><b>Landkreis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTGEBIET__LANDKREIS = eINSTANCE.getStadtgebiet_Landkreis();

		/**
		 * The meta object literal for the '<em><b>Flaeche Km2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTGEBIET__FLAECHE_KM2 = eINSTANCE.getStadtgebiet_FlaecheKm2();

		/**
		 * The meta object literal for the '<em><b>Umfang Km</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTGEBIET__UMFANG_KM = eINSTANCE.getStadtgebiet_UmfangKm();

		/**
		 * The meta object literal for the '<em><b>Nachbarorte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTGEBIET__NACHBARORTE = eINSTANCE.getStadtgebiet_Nachbarorte();

		/**
		 * The meta object literal for the '<em><b>Quelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTGEBIET__QUELLE = eINSTANCE.getStadtgebiet_Quelle();

		/**
		 * The meta object literal for the '<em><b>Genauigkeit M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTGEBIET__GENAUIGKEIT_M = eINSTANCE.getStadtgebiet_GenauigkeitM();

		/**
		 * The meta object literal for the '<em><b>Hinweis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTGEBIET__HINWEIS = eINSTANCE.getStadtgebiet_Hinweis();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTGEBIET__COLOR = eINSTANCE.getStadtgebiet_Color();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.city.impl.StadtteilImpl <em>Stadtteil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.StadtteilImpl
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getStadtteil()
		 * @generated
		 */
		EClass STADTTEIL = eINSTANCE.getStadtteil();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTTEIL__TYP = eINSTANCE.getStadtteil_Typ();

		/**
		 * The meta object literal for the '<em><b>Flaeche Km2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTTEIL__FLAECHE_KM2 = eINSTANCE.getStadtteil_FlaecheKm2();

		/**
		 * The meta object literal for the '<em><b>Gebaeude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTTEIL__GEBAEUDE = eINSTANCE.getStadtteil_Gebaeude();

		/**
		 * The meta object literal for the '<em><b>Einwohner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTTEIL__EINWOHNER = eINSTANCE.getStadtteil_Einwohner();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADTTEIL__COLOR = eINSTANCE.getStadtteil_Color();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.city.impl.FlaecheImpl <em>Flaeche</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.FlaecheImpl
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getFlaeche()
		 * @generated
		 */
		EClass FLAECHE = eINSTANCE.getFlaeche();

		/**
		 * The meta object literal for the '<em><b>Nutzung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAECHE__NUTZUNG = eINSTANCE.getFlaeche_Nutzung();

		/**
		 * The meta object literal for the '<em><b>Flaeche M2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAECHE__FLAECHE_M2 = eINSTANCE.getFlaeche_FlaecheM2();

		/**
		 * The meta object literal for the '<em><b>Frucht</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAECHE__FRUCHT = eINSTANCE.getFlaeche_Frucht();

		/**
		 * The meta object literal for the '<em><b>Baumart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAECHE__BAUMART = eINSTANCE.getFlaeche_Baumart();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAECHE__COLOR = eINSTANCE.getFlaeche_Color();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.city.impl.StrasseImpl <em>Strasse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.StrasseImpl
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getStrasse()
		 * @generated
		 */
		EClass STRASSE = eINSTANCE.getStrasse();

		/**
		 * The meta object literal for the '<em><b>Klasse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRASSE__KLASSE = eINSTANCE.getStrasse_Klasse();

		/**
		 * The meta object literal for the '<em><b>Breite M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRASSE__BREITE_M = eINSTANCE.getStrasse_BreiteM();

		/**
		 * The meta object literal for the '<em><b>Laenge M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRASSE__LAENGE_M = eINSTANCE.getStrasse_LaengeM();

		/**
		 * The meta object literal for the '<em><b>Richtung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRASSE__RICHTUNG = eINSTANCE.getStrasse_Richtung();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRASSE__COLOR = eINSTANCE.getStrasse_Color();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.city.impl.GebaeudeImpl <em>Gebaeude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.GebaeudeImpl
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getGebaeude()
		 * @generated
		 */
		EClass GEBAEUDE = eINSTANCE.getGebaeude();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBAEUDE__TYP = eINSTANCE.getGebaeude_Typ();

		/**
		 * The meta object literal for the '<em><b>Geschosse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBAEUDE__GESCHOSSE = eINSTANCE.getGebaeude_Geschosse();

		/**
		 * The meta object literal for the '<em><b>Hoehe M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBAEUDE__HOEHE_M = eINSTANCE.getGebaeude_HoeheM();

		/**
		 * The meta object literal for the '<em><b>Flaeche M2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBAEUDE__FLAECHE_M2 = eINSTANCE.getGebaeude_FlaecheM2();

		/**
		 * The meta object literal for the '<em><b>Stadtteil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBAEUDE__STADTTEIL = eINSTANCE.getGebaeude_Stadtteil();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBAEUDE__ADRESSE = eINSTANCE.getGebaeude_Adresse();

		/**
		 * The meta object literal for the '<em><b>Gehoeft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBAEUDE__GEHOEFT = eINSTANCE.getGebaeude_Gehoeft();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBAEUDE__COLOR = eINSTANCE.getGebaeude_Color();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.city.impl.OrtImpl <em>Ort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.OrtImpl
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getOrt()
		 * @generated
		 */
		EClass ORT = eINSTANCE.getOrt();

		/**
		 * The meta object literal for the '<em><b>Kategorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORT__KATEGORIE = eINSTANCE.getOrt_Kategorie();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORT__COLOR = eINSTANCE.getOrt_Color();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.city.Nutzung <em>Nutzung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.city.Nutzung
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getNutzung()
		 * @generated
		 */
		EEnum NUTZUNG = eINSTANCE.getNutzung();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.city.Strassenklasse <em>Strassenklasse</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.city.Strassenklasse
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getStrassenklasse()
		 * @generated
		 */
		EEnum STRASSENKLASSE = eINSTANCE.getStrassenklasse();

		/**
		 * The meta object literal for the '<em>Geo Json Geometry</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.Geometry
		 * @see org.eclipse.fennec.ogc.features.example.city.impl.CityPackageImpl#getGeoJsonGeometry()
		 * @generated
		 */
		EDataType GEO_JSON_GEOMETRY = eINSTANCE.getGeoJsonGeometry();

	}

} //CityPackage
