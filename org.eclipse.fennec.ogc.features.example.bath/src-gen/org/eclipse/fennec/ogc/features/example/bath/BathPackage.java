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
package org.eclipse.fennec.ogc.features.example.bath;


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
 * Assets of a leisure pool (Freizeitbad), published as OGC API Features collections.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.ogc.features.example.bath.BathFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = BathPackage.eNS_URI, fingerprint = "fp1:d078980007d9fb7c31e2e1babb62b624a0d6c6b062f7154fbfb1c04c949cf645", genModel = "/model/bath.genmodel", genModelSourceLocations = {"model/bath.genmodel","org.eclipse.fennec.ogc.features.example.bath/model/bath.genmodel"}, ecore = "/model/bath.ecore", ecoreSourceLocations = "/model/bath.ecore")
public interface BathPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bath";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://eclipse.org/fennec/ogc/example/bath/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bath";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BathPackage eINSTANCE = org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.AssetImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__GEOMETRY = 3;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__MIN_X = 4;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__MIN_Y = 5;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__MAX_X = 6;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__MAX_Y = 7;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__LEVEL = 8;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__STATUS = 9;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ACCESSIBLE = 10;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__LAST_INSPECTION = 11;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.PoolImpl <em>Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.PoolImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getPool()
	 * @generated
	 */
	int POOL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Pool Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__POOL_TYPE = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Depth Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__DEPTH_MIN = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Depth Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__DEPTH_MAX = ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Water Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__WATER_TEMPERATURE = ASSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__LANES = ASSET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_FEATURE_COUNT = ASSET_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.SlideImpl <em>Slide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.SlideImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getSlide()
	 * @generated
	 */
	int SLIDE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__LENGTH = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__HEIGHT_DIFFERENCE = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__MIN_AGE = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Slide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE_FEATURE_COUNT = ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Slide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.ChangingRoomImpl <em>Changing Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.ChangingRoomImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getChangingRoom()
	 * @generated
	 */
	int CHANGING_ROOM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Cabins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM__CABINS = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lockers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM__LOCKERS = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM__FAMILY = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Changing Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM_FEATURE_COUNT = ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Changing Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGING_ROOM_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.ToiletImpl <em>Toilet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.ToiletImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getToilet()
	 * @generated
	 */
	int TOILET = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Baby Changing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__BABY_CHANGING = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Toilet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Toilet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.KioskImpl <em>Kiosk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.KioskImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getKiosk()
	 * @generated
	 */
	int KIOSK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Opening Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK__OPENING_HOURS = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK__SEATS = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Kiosk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK_FEATURE_COUNT = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Kiosk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIOSK_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.SaunaImpl <em>Sauna</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.SaunaImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getSauna()
	 * @generated
	 */
	int SAUNA = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Sauna Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA__SAUNA_TYPE = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA__TEMPERATURE = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA__CAPACITY = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sauna</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA_FEATURE_COUNT = ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sauna</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAUNA_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.SportAreaImpl <em>Sport Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.SportAreaImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getSportArea()
	 * @generated
	 */
	int SPORT_AREA = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_AREA__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_AREA__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_AREA__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_AREA__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_AREA__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_AREA__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_AREA__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_AREA__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_AREA__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_AREA__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_AREA__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_AREA__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Sport Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_AREA__SPORT_TYPE = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sport Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_AREA_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sport Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_AREA_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.LawnImpl <em>Lawn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.LawnImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getLawn()
	 * @generated
	 */
	int LAWN = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAWN__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAWN__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAWN__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAWN__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAWN__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAWN__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAWN__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAWN__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAWN__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAWN__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAWN__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAWN__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Shaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAWN__SHADED = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lawn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAWN_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lawn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAWN_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.PlaygroundImpl <em>Playground</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.PlaygroundImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getPlayground()
	 * @generated
	 */
	int PLAYGROUND = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYGROUND__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYGROUND__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYGROUND__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYGROUND__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYGROUND__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYGROUND__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYGROUND__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYGROUND__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYGROUND__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYGROUND__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYGROUND__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYGROUND__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Age From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYGROUND__AGE_FROM = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Age To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYGROUND__AGE_TO = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Playground</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYGROUND_FEATURE_COUNT = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Playground</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYGROUND_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.FirstAidImpl <em>First Aid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.FirstAidImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getFirstAid()
	 * @generated
	 */
	int FIRST_AID = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_AID__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_AID__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_AID__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_AID__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_AID__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_AID__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_AID__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_AID__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_AID__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_AID__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_AID__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_AID__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Defibrillator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_AID__DEFIBRILLATOR = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>First Aid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_AID_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>First Aid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_AID_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.EntranceImpl <em>Entrance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.EntranceImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getEntrance()
	 * @generated
	 */
	int ENTRANCE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__MAIN = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entrance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entrance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.PathImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Surface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__SURFACE = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.BuildingImpl <em>Building</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BuildingImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getBuilding()
	 * @generated
	 */
	int BUILDING = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Floors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__FLOORS = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.SiteBoundaryImpl <em>Site Boundary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.SiteBoundaryImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getSiteBoundary()
	 * @generated
	 */
	int SITE_BOUNDARY = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_BOUNDARY__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_BOUNDARY__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_BOUNDARY__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_BOUNDARY__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_BOUNDARY__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_BOUNDARY__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_BOUNDARY__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_BOUNDARY__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_BOUNDARY__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_BOUNDARY__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_BOUNDARY__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_BOUNDARY__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The number of structural features of the '<em>Site Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_BOUNDARY_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Site Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_BOUNDARY_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.ParkingLotImpl <em>Parking Lot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.ParkingLotImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getParkingLot()
	 * @generated
	 */
	int PARKING_LOT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Spaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT__SPACES = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Free Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT__FREE_HOURS = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Charging Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT__CHARGING_POINTS = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parking Lot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT_FEATURE_COUNT = ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Parking Lot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_LOT_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.PavingImpl <em>Paving</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.PavingImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getPaving()
	 * @generated
	 */
	int PAVING = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAVING__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAVING__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAVING__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAVING__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAVING__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAVING__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAVING__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAVING__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAVING__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAVING__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAVING__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAVING__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Surface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAVING__SURFACE = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slip Resistant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAVING__SLIP_RESISTANT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Paving</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAVING_FEATURE_COUNT = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Paving</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAVING_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.ShowerImpl <em>Shower</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.ShowerImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getShower()
	 * @generated
	 */
	int SHOWER = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOWER__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOWER__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOWER__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOWER__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOWER__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOWER__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOWER__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOWER__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOWER__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOWER__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOWER__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOWER__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Heads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOWER__HEADS = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Warm Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOWER__WARM_WATER = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOWER_FEATURE_COUNT = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Shower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOWER_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.TreeImpl <em>Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.TreeImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getTree()
	 * @generated
	 */
	int TREE = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Species</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__SPECIES = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__HEIGHT_M = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Crown Diameter M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__CROWN_DIAMETER_M = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE_COUNT = ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.ShrubImpl <em>Shrub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.ShrubImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getShrub()
	 * @generated
	 */
	int SHRUB = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHRUB__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHRUB__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHRUB__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHRUB__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHRUB__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHRUB__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHRUB__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHRUB__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHRUB__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHRUB__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHRUB__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHRUB__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Species</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHRUB__SPECIES = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHRUB__HEIGHT_M = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shrub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHRUB_FEATURE_COUNT = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Shrub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHRUB_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.BikeParkingImpl <em>Bike Parking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BikeParkingImpl
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getBikeParking()
	 * @generated
	 */
	int BIKE_PARKING = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_PARKING__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_PARKING__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_PARKING__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_PARKING__GEOMETRY = ASSET__GEOMETRY;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_PARKING__MIN_X = ASSET__MIN_X;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_PARKING__MIN_Y = ASSET__MIN_Y;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_PARKING__MAX_X = ASSET__MAX_X;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_PARKING__MAX_Y = ASSET__MAX_Y;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_PARKING__LEVEL = ASSET__LEVEL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_PARKING__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_PARKING__ACCESSIBLE = ASSET__ACCESSIBLE;

	/**
	 * The feature id for the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_PARKING__LAST_INSPECTION = ASSET__LAST_INSPECTION;

	/**
	 * The feature id for the '<em><b>Racks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_PARKING__RACKS = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_PARKING__COVERED = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bike Parking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_PARKING_FEATURE_COUNT = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bike Parking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_PARKING_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.Level <em>Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.Level
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.OperationalStatus <em>Operational Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.OperationalStatus
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getOperationalStatus()
	 * @generated
	 */
	int OPERATIONAL_STATUS = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.PoolType <em>Pool Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.PoolType
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getPoolType()
	 * @generated
	 */
	int POOL_TYPE = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.SaunaType <em>Sauna Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.SaunaType
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getSaunaType()
	 * @generated
	 */
	int SAUNA_TYPE = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.SportType <em>Sport Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.SportType
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getSportType()
	 * @generated
	 */
	int SPORT_TYPE = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.ogc.features.example.bath.Surface <em>Surface</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.ogc.features.example.bath.Surface
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getSurface()
	 * @generated
	 */
	int SURFACE = 26;

	/**
	 * The meta object id for the '<em>Geo Json Geometry</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.Geometry
	 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getGeoJsonGeometry()
	 * @generated
	 */
	int GEO_JSON_GEOMETRY = 27;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Asset#getId()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Asset#getName()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Asset#getDescription()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometry</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Asset#getGeometry()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Geometry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getMinX <em>Min X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min X</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Asset#getMinX()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_MinX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getMinY <em>Min Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Y</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Asset#getMinY()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_MinY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getMaxX <em>Max X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max X</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Asset#getMaxX()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_MaxX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getMaxY <em>Max Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Y</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Asset#getMaxY()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_MaxY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Asset#getLevel()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Level();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Asset#getStatus()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#isAccessible <em>Accessible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accessible</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Asset#isAccessible()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Accessible();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getLastInspection <em>Last Inspection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Inspection</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Asset#getLastInspection()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_LastInspection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.Pool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pool</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Pool
	 * @generated
	 */
	EClass getPool();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Pool#getPoolType <em>Pool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pool Type</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Pool#getPoolType()
	 * @see #getPool()
	 * @generated
	 */
	EAttribute getPool_PoolType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Pool#getDepthMin <em>Depth Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth Min</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Pool#getDepthMin()
	 * @see #getPool()
	 * @generated
	 */
	EAttribute getPool_DepthMin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Pool#getDepthMax <em>Depth Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth Max</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Pool#getDepthMax()
	 * @see #getPool()
	 * @generated
	 */
	EAttribute getPool_DepthMax();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Pool#getWaterTemperature <em>Water Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water Temperature</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Pool#getWaterTemperature()
	 * @see #getPool()
	 * @generated
	 */
	EAttribute getPool_WaterTemperature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Pool#getLanes <em>Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lanes</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Pool#getLanes()
	 * @see #getPool()
	 * @generated
	 */
	EAttribute getPool_Lanes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.Slide <em>Slide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slide</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Slide
	 * @generated
	 */
	EClass getSlide();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Slide#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Slide#getLength()
	 * @see #getSlide()
	 * @generated
	 */
	EAttribute getSlide_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Slide#getHeightDifference <em>Height Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height Difference</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Slide#getHeightDifference()
	 * @see #getSlide()
	 * @generated
	 */
	EAttribute getSlide_HeightDifference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Slide#getMinAge <em>Min Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Age</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Slide#getMinAge()
	 * @see #getSlide()
	 * @generated
	 */
	EAttribute getSlide_MinAge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.ChangingRoom <em>Changing Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Changing Room</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.ChangingRoom
	 * @generated
	 */
	EClass getChangingRoom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.ChangingRoom#getCabins <em>Cabins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cabins</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.ChangingRoom#getCabins()
	 * @see #getChangingRoom()
	 * @generated
	 */
	EAttribute getChangingRoom_Cabins();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.ChangingRoom#getLockers <em>Lockers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lockers</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.ChangingRoom#getLockers()
	 * @see #getChangingRoom()
	 * @generated
	 */
	EAttribute getChangingRoom_Lockers();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.ChangingRoom#isFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.ChangingRoom#isFamily()
	 * @see #getChangingRoom()
	 * @generated
	 */
	EAttribute getChangingRoom_Family();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.Toilet <em>Toilet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toilet</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Toilet
	 * @generated
	 */
	EClass getToilet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Toilet#isBabyChanging <em>Baby Changing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baby Changing</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Toilet#isBabyChanging()
	 * @see #getToilet()
	 * @generated
	 */
	EAttribute getToilet_BabyChanging();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.Kiosk <em>Kiosk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kiosk</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Kiosk
	 * @generated
	 */
	EClass getKiosk();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Kiosk#getOpeningHours <em>Opening Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Hours</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Kiosk#getOpeningHours()
	 * @see #getKiosk()
	 * @generated
	 */
	EAttribute getKiosk_OpeningHours();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Kiosk#getSeats <em>Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seats</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Kiosk#getSeats()
	 * @see #getKiosk()
	 * @generated
	 */
	EAttribute getKiosk_Seats();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.Sauna <em>Sauna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sauna</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Sauna
	 * @generated
	 */
	EClass getSauna();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Sauna#getSaunaType <em>Sauna Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sauna Type</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Sauna#getSaunaType()
	 * @see #getSauna()
	 * @generated
	 */
	EAttribute getSauna_SaunaType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Sauna#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Sauna#getTemperature()
	 * @see #getSauna()
	 * @generated
	 */
	EAttribute getSauna_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Sauna#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Sauna#getCapacity()
	 * @see #getSauna()
	 * @generated
	 */
	EAttribute getSauna_Capacity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.SportArea <em>Sport Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sport Area</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.SportArea
	 * @generated
	 */
	EClass getSportArea();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.SportArea#getSportType <em>Sport Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sport Type</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.SportArea#getSportType()
	 * @see #getSportArea()
	 * @generated
	 */
	EAttribute getSportArea_SportType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.Lawn <em>Lawn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lawn</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Lawn
	 * @generated
	 */
	EClass getLawn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Lawn#isShaded <em>Shaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shaded</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Lawn#isShaded()
	 * @see #getLawn()
	 * @generated
	 */
	EAttribute getLawn_Shaded();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.Playground <em>Playground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Playground</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Playground
	 * @generated
	 */
	EClass getPlayground();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Playground#getAgeFrom <em>Age From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age From</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Playground#getAgeFrom()
	 * @see #getPlayground()
	 * @generated
	 */
	EAttribute getPlayground_AgeFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Playground#getAgeTo <em>Age To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age To</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Playground#getAgeTo()
	 * @see #getPlayground()
	 * @generated
	 */
	EAttribute getPlayground_AgeTo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.FirstAid <em>First Aid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Aid</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.FirstAid
	 * @generated
	 */
	EClass getFirstAid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.FirstAid#isDefibrillator <em>Defibrillator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defibrillator</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.FirstAid#isDefibrillator()
	 * @see #getFirstAid()
	 * @generated
	 */
	EAttribute getFirstAid_Defibrillator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.Entrance <em>Entrance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entrance</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Entrance
	 * @generated
	 */
	EClass getEntrance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Entrance#isMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Entrance#isMain()
	 * @see #getEntrance()
	 * @generated
	 */
	EAttribute getEntrance_Main();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Path#getSurface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surface</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Path#getSurface()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Surface();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Building
	 * @generated
	 */
	EClass getBuilding();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Building#getFloors <em>Floors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floors</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Building#getFloors()
	 * @see #getBuilding()
	 * @generated
	 */
	EAttribute getBuilding_Floors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.SiteBoundary <em>Site Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site Boundary</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.SiteBoundary
	 * @generated
	 */
	EClass getSiteBoundary();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.ParkingLot <em>Parking Lot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parking Lot</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.ParkingLot
	 * @generated
	 */
	EClass getParkingLot();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.ParkingLot#getSpaces <em>Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spaces</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.ParkingLot#getSpaces()
	 * @see #getParkingLot()
	 * @generated
	 */
	EAttribute getParkingLot_Spaces();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.ParkingLot#getFreeHours <em>Free Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free Hours</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.ParkingLot#getFreeHours()
	 * @see #getParkingLot()
	 * @generated
	 */
	EAttribute getParkingLot_FreeHours();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.ParkingLot#getChargingPoints <em>Charging Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charging Points</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.ParkingLot#getChargingPoints()
	 * @see #getParkingLot()
	 * @generated
	 */
	EAttribute getParkingLot_ChargingPoints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.Paving <em>Paving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paving</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Paving
	 * @generated
	 */
	EClass getPaving();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Paving#getSurface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surface</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Paving#getSurface()
	 * @see #getPaving()
	 * @generated
	 */
	EAttribute getPaving_Surface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Paving#isSlipResistant <em>Slip Resistant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slip Resistant</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Paving#isSlipResistant()
	 * @see #getPaving()
	 * @generated
	 */
	EAttribute getPaving_SlipResistant();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.Shower <em>Shower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shower</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Shower
	 * @generated
	 */
	EClass getShower();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Shower#getHeads <em>Heads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heads</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Shower#getHeads()
	 * @see #getShower()
	 * @generated
	 */
	EAttribute getShower_Heads();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Shower#isWarmWater <em>Warm Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warm Water</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Shower#isWarmWater()
	 * @see #getShower()
	 * @generated
	 */
	EAttribute getShower_WarmWater();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Tree
	 * @generated
	 */
	EClass getTree();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Tree#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Species</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Tree#getSpecies()
	 * @see #getTree()
	 * @generated
	 */
	EAttribute getTree_Species();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Tree#getHeightM <em>Height M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height M</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Tree#getHeightM()
	 * @see #getTree()
	 * @generated
	 */
	EAttribute getTree_HeightM();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Tree#getCrownDiameterM <em>Crown Diameter M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crown Diameter M</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Tree#getCrownDiameterM()
	 * @see #getTree()
	 * @generated
	 */
	EAttribute getTree_CrownDiameterM();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.Shrub <em>Shrub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shrub</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Shrub
	 * @generated
	 */
	EClass getShrub();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Shrub#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Species</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Shrub#getSpecies()
	 * @see #getShrub()
	 * @generated
	 */
	EAttribute getShrub_Species();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.Shrub#getHeightM <em>Height M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height M</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Shrub#getHeightM()
	 * @see #getShrub()
	 * @generated
	 */
	EAttribute getShrub_HeightM();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.ogc.features.example.bath.BikeParking <em>Bike Parking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bike Parking</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.BikeParking
	 * @generated
	 */
	EClass getBikeParking();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.BikeParking#getRacks <em>Racks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Racks</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.BikeParking#getRacks()
	 * @see #getBikeParking()
	 * @generated
	 */
	EAttribute getBikeParking_Racks();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.ogc.features.example.bath.BikeParking#isCovered <em>Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Covered</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.BikeParking#isCovered()
	 * @see #getBikeParking()
	 * @generated
	 */
	EAttribute getBikeParking_Covered();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.ogc.features.example.bath.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Level
	 * @generated
	 */
	EEnum getLevel();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.ogc.features.example.bath.OperationalStatus <em>Operational Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operational Status</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.OperationalStatus
	 * @generated
	 */
	EEnum getOperationalStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.ogc.features.example.bath.PoolType <em>Pool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pool Type</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.PoolType
	 * @generated
	 */
	EEnum getPoolType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.ogc.features.example.bath.SaunaType <em>Sauna Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sauna Type</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.SaunaType
	 * @generated
	 */
	EEnum getSaunaType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.ogc.features.example.bath.SportType <em>Sport Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sport Type</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.SportType
	 * @generated
	 */
	EEnum getSportType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.ogc.features.example.bath.Surface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Surface</em>'.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Surface
	 * @generated
	 */
	EEnum getSurface();

	/**
	 * Returns the meta object for data type '{@link org.geojson.Geometry <em>Geo Json Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A GeoJSON geometry. Persisted as GeoJSON text by the geojson TypeConverter of org.eclipse.fennec.ogc.features.geo. The string conversion lets XMI carry it, and reads it back from JPA as long as Fennec persistence hands String column values to EcoreUtil.createFromString instead of to the converter.
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
	BathFactory getBathFactory();

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
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.AssetImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ID = eINSTANCE.getAsset_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__NAME = eINSTANCE.getAsset_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__DESCRIPTION = eINSTANCE.getAsset_Description();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__GEOMETRY = eINSTANCE.getAsset_Geometry();

		/**
		 * The meta object literal for the '<em><b>Min X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__MIN_X = eINSTANCE.getAsset_MinX();

		/**
		 * The meta object literal for the '<em><b>Min Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__MIN_Y = eINSTANCE.getAsset_MinY();

		/**
		 * The meta object literal for the '<em><b>Max X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__MAX_X = eINSTANCE.getAsset_MaxX();

		/**
		 * The meta object literal for the '<em><b>Max Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__MAX_Y = eINSTANCE.getAsset_MaxY();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__LEVEL = eINSTANCE.getAsset_Level();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__STATUS = eINSTANCE.getAsset_Status();

		/**
		 * The meta object literal for the '<em><b>Accessible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ACCESSIBLE = eINSTANCE.getAsset_Accessible();

		/**
		 * The meta object literal for the '<em><b>Last Inspection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__LAST_INSPECTION = eINSTANCE.getAsset_LastInspection();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.PoolImpl <em>Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.PoolImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getPool()
		 * @generated
		 */
		EClass POOL = eINSTANCE.getPool();

		/**
		 * The meta object literal for the '<em><b>Pool Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL__POOL_TYPE = eINSTANCE.getPool_PoolType();

		/**
		 * The meta object literal for the '<em><b>Depth Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL__DEPTH_MIN = eINSTANCE.getPool_DepthMin();

		/**
		 * The meta object literal for the '<em><b>Depth Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL__DEPTH_MAX = eINSTANCE.getPool_DepthMax();

		/**
		 * The meta object literal for the '<em><b>Water Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL__WATER_TEMPERATURE = eINSTANCE.getPool_WaterTemperature();

		/**
		 * The meta object literal for the '<em><b>Lanes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL__LANES = eINSTANCE.getPool_Lanes();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.SlideImpl <em>Slide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.SlideImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getSlide()
		 * @generated
		 */
		EClass SLIDE = eINSTANCE.getSlide();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDE__LENGTH = eINSTANCE.getSlide_Length();

		/**
		 * The meta object literal for the '<em><b>Height Difference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDE__HEIGHT_DIFFERENCE = eINSTANCE.getSlide_HeightDifference();

		/**
		 * The meta object literal for the '<em><b>Min Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDE__MIN_AGE = eINSTANCE.getSlide_MinAge();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.ChangingRoomImpl <em>Changing Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.ChangingRoomImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getChangingRoom()
		 * @generated
		 */
		EClass CHANGING_ROOM = eINSTANCE.getChangingRoom();

		/**
		 * The meta object literal for the '<em><b>Cabins</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGING_ROOM__CABINS = eINSTANCE.getChangingRoom_Cabins();

		/**
		 * The meta object literal for the '<em><b>Lockers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGING_ROOM__LOCKERS = eINSTANCE.getChangingRoom_Lockers();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGING_ROOM__FAMILY = eINSTANCE.getChangingRoom_Family();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.ToiletImpl <em>Toilet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.ToiletImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getToilet()
		 * @generated
		 */
		EClass TOILET = eINSTANCE.getToilet();

		/**
		 * The meta object literal for the '<em><b>Baby Changing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOILET__BABY_CHANGING = eINSTANCE.getToilet_BabyChanging();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.KioskImpl <em>Kiosk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.KioskImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getKiosk()
		 * @generated
		 */
		EClass KIOSK = eINSTANCE.getKiosk();

		/**
		 * The meta object literal for the '<em><b>Opening Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KIOSK__OPENING_HOURS = eINSTANCE.getKiosk_OpeningHours();

		/**
		 * The meta object literal for the '<em><b>Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KIOSK__SEATS = eINSTANCE.getKiosk_Seats();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.SaunaImpl <em>Sauna</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.SaunaImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getSauna()
		 * @generated
		 */
		EClass SAUNA = eINSTANCE.getSauna();

		/**
		 * The meta object literal for the '<em><b>Sauna Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAUNA__SAUNA_TYPE = eINSTANCE.getSauna_SaunaType();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAUNA__TEMPERATURE = eINSTANCE.getSauna_Temperature();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAUNA__CAPACITY = eINSTANCE.getSauna_Capacity();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.SportAreaImpl <em>Sport Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.SportAreaImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getSportArea()
		 * @generated
		 */
		EClass SPORT_AREA = eINSTANCE.getSportArea();

		/**
		 * The meta object literal for the '<em><b>Sport Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORT_AREA__SPORT_TYPE = eINSTANCE.getSportArea_SportType();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.LawnImpl <em>Lawn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.LawnImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getLawn()
		 * @generated
		 */
		EClass LAWN = eINSTANCE.getLawn();

		/**
		 * The meta object literal for the '<em><b>Shaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAWN__SHADED = eINSTANCE.getLawn_Shaded();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.PlaygroundImpl <em>Playground</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.PlaygroundImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getPlayground()
		 * @generated
		 */
		EClass PLAYGROUND = eINSTANCE.getPlayground();

		/**
		 * The meta object literal for the '<em><b>Age From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYGROUND__AGE_FROM = eINSTANCE.getPlayground_AgeFrom();

		/**
		 * The meta object literal for the '<em><b>Age To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYGROUND__AGE_TO = eINSTANCE.getPlayground_AgeTo();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.FirstAidImpl <em>First Aid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.FirstAidImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getFirstAid()
		 * @generated
		 */
		EClass FIRST_AID = eINSTANCE.getFirstAid();

		/**
		 * The meta object literal for the '<em><b>Defibrillator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRST_AID__DEFIBRILLATOR = eINSTANCE.getFirstAid_Defibrillator();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.EntranceImpl <em>Entrance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.EntranceImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getEntrance()
		 * @generated
		 */
		EClass ENTRANCE = eINSTANCE.getEntrance();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRANCE__MAIN = eINSTANCE.getEntrance_Main();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.PathImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Surface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__SURFACE = eINSTANCE.getPath_Surface();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.BuildingImpl <em>Building</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BuildingImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getBuilding()
		 * @generated
		 */
		EClass BUILDING = eINSTANCE.getBuilding();

		/**
		 * The meta object literal for the '<em><b>Floors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING__FLOORS = eINSTANCE.getBuilding_Floors();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.SiteBoundaryImpl <em>Site Boundary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.SiteBoundaryImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getSiteBoundary()
		 * @generated
		 */
		EClass SITE_BOUNDARY = eINSTANCE.getSiteBoundary();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.ParkingLotImpl <em>Parking Lot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.ParkingLotImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getParkingLot()
		 * @generated
		 */
		EClass PARKING_LOT = eINSTANCE.getParkingLot();

		/**
		 * The meta object literal for the '<em><b>Spaces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARKING_LOT__SPACES = eINSTANCE.getParkingLot_Spaces();

		/**
		 * The meta object literal for the '<em><b>Free Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARKING_LOT__FREE_HOURS = eINSTANCE.getParkingLot_FreeHours();

		/**
		 * The meta object literal for the '<em><b>Charging Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARKING_LOT__CHARGING_POINTS = eINSTANCE.getParkingLot_ChargingPoints();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.PavingImpl <em>Paving</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.PavingImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getPaving()
		 * @generated
		 */
		EClass PAVING = eINSTANCE.getPaving();

		/**
		 * The meta object literal for the '<em><b>Surface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAVING__SURFACE = eINSTANCE.getPaving_Surface();

		/**
		 * The meta object literal for the '<em><b>Slip Resistant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAVING__SLIP_RESISTANT = eINSTANCE.getPaving_SlipResistant();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.ShowerImpl <em>Shower</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.ShowerImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getShower()
		 * @generated
		 */
		EClass SHOWER = eINSTANCE.getShower();

		/**
		 * The meta object literal for the '<em><b>Heads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOWER__HEADS = eINSTANCE.getShower_Heads();

		/**
		 * The meta object literal for the '<em><b>Warm Water</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOWER__WARM_WATER = eINSTANCE.getShower_WarmWater();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.TreeImpl <em>Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.TreeImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getTree()
		 * @generated
		 */
		EClass TREE = eINSTANCE.getTree();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE__SPECIES = eINSTANCE.getTree_Species();

		/**
		 * The meta object literal for the '<em><b>Height M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE__HEIGHT_M = eINSTANCE.getTree_HeightM();

		/**
		 * The meta object literal for the '<em><b>Crown Diameter M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE__CROWN_DIAMETER_M = eINSTANCE.getTree_CrownDiameterM();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.ShrubImpl <em>Shrub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.ShrubImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getShrub()
		 * @generated
		 */
		EClass SHRUB = eINSTANCE.getShrub();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHRUB__SPECIES = eINSTANCE.getShrub_Species();

		/**
		 * The meta object literal for the '<em><b>Height M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHRUB__HEIGHT_M = eINSTANCE.getShrub_HeightM();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.impl.BikeParkingImpl <em>Bike Parking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BikeParkingImpl
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getBikeParking()
		 * @generated
		 */
		EClass BIKE_PARKING = eINSTANCE.getBikeParking();

		/**
		 * The meta object literal for the '<em><b>Racks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIKE_PARKING__RACKS = eINSTANCE.getBikeParking_Racks();

		/**
		 * The meta object literal for the '<em><b>Covered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIKE_PARKING__COVERED = eINSTANCE.getBikeParking_Covered();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.Level <em>Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.Level
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getLevel()
		 * @generated
		 */
		EEnum LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.OperationalStatus <em>Operational Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.OperationalStatus
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getOperationalStatus()
		 * @generated
		 */
		EEnum OPERATIONAL_STATUS = eINSTANCE.getOperationalStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.PoolType <em>Pool Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.PoolType
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getPoolType()
		 * @generated
		 */
		EEnum POOL_TYPE = eINSTANCE.getPoolType();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.SaunaType <em>Sauna Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.SaunaType
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getSaunaType()
		 * @generated
		 */
		EEnum SAUNA_TYPE = eINSTANCE.getSaunaType();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.SportType <em>Sport Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.SportType
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getSportType()
		 * @generated
		 */
		EEnum SPORT_TYPE = eINSTANCE.getSportType();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.ogc.features.example.bath.Surface <em>Surface</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.ogc.features.example.bath.Surface
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getSurface()
		 * @generated
		 */
		EEnum SURFACE = eINSTANCE.getSurface();

		/**
		 * The meta object literal for the '<em>Geo Json Geometry</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.Geometry
		 * @see org.eclipse.fennec.ogc.features.example.bath.impl.BathPackageImpl#getGeoJsonGeometry()
		 * @generated
		 */
		EDataType GEO_JSON_GEOMETRY = eINSTANCE.getGeoJsonGeometry();

	}

} //BathPackage
