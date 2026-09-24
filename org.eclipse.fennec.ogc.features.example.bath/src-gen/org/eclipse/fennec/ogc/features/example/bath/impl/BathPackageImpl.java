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
package org.eclipse.fennec.ogc.features.example.bath.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.ogc.features.example.bath.Asset;
import org.eclipse.fennec.ogc.features.example.bath.BathFactory;
import org.eclipse.fennec.ogc.features.example.bath.BathPackage;
import org.eclipse.fennec.ogc.features.example.bath.Building;
import org.eclipse.fennec.ogc.features.example.bath.ChangingRoom;
import org.eclipse.fennec.ogc.features.example.bath.Entrance;
import org.eclipse.fennec.ogc.features.example.bath.FirstAid;
import org.eclipse.fennec.ogc.features.example.bath.Kiosk;
import org.eclipse.fennec.ogc.features.example.bath.Lawn;
import org.eclipse.fennec.ogc.features.example.bath.Level;
import org.eclipse.fennec.ogc.features.example.bath.OperationalStatus;
import org.eclipse.fennec.ogc.features.example.bath.Path;
import org.eclipse.fennec.ogc.features.example.bath.Playground;
import org.eclipse.fennec.ogc.features.example.bath.Pool;
import org.eclipse.fennec.ogc.features.example.bath.PoolType;
import org.eclipse.fennec.ogc.features.example.bath.Sauna;
import org.eclipse.fennec.ogc.features.example.bath.SaunaType;
import org.eclipse.fennec.ogc.features.example.bath.SiteBoundary;
import org.eclipse.fennec.ogc.features.example.bath.Slide;
import org.eclipse.fennec.ogc.features.example.bath.SportArea;
import org.eclipse.fennec.ogc.features.example.bath.SportType;
import org.eclipse.fennec.ogc.features.example.bath.Surface;
import org.eclipse.fennec.ogc.features.example.bath.Toilet;

import org.geojson.Geometry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BathPackageImpl extends EPackageImpl implements BathPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changingRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toiletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kioskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saunaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sportAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lawnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playgroundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstAidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteBoundaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationalStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum poolTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum saunaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sportTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum surfaceEEnum = null;

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
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BathPackageImpl() {
		super(eNS_URI, BathFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BathPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BathPackage init() {
		if (isInited) return (BathPackage)EPackage.Registry.INSTANCE.getEPackage(BathPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBathPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BathPackageImpl theBathPackage = registeredBathPackage instanceof BathPackageImpl ? (BathPackageImpl)registeredBathPackage : new BathPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBathPackage.createPackageContents();

		// Initialize created meta-data
		theBathPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBathPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BathPackage.eNS_URI, theBathPackage);
		return theBathPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_Id() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_Name() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_Description() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_Geometry() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_MinX() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_MinY() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_MaxX() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_MaxY() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_Level() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_Status() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_Accessible() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_LastInspection() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPool() {
		return poolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPool_PoolType() {
		return (EAttribute)poolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPool_DepthMin() {
		return (EAttribute)poolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPool_DepthMax() {
		return (EAttribute)poolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPool_WaterTemperature() {
		return (EAttribute)poolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPool_Lanes() {
		return (EAttribute)poolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSlide() {
		return slideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlide_Length() {
		return (EAttribute)slideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlide_HeightDifference() {
		return (EAttribute)slideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlide_MinAge() {
		return (EAttribute)slideEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangingRoom() {
		return changingRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangingRoom_Cabins() {
		return (EAttribute)changingRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangingRoom_Lockers() {
		return (EAttribute)changingRoomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangingRoom_Family() {
		return (EAttribute)changingRoomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToilet() {
		return toiletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToilet_BabyChanging() {
		return (EAttribute)toiletEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKiosk() {
		return kioskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKiosk_OpeningHours() {
		return (EAttribute)kioskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKiosk_Seats() {
		return (EAttribute)kioskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSauna() {
		return saunaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSauna_SaunaType() {
		return (EAttribute)saunaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSauna_Temperature() {
		return (EAttribute)saunaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSauna_Capacity() {
		return (EAttribute)saunaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSportArea() {
		return sportAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSportArea_SportType() {
		return (EAttribute)sportAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLawn() {
		return lawnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLawn_Shaded() {
		return (EAttribute)lawnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayground() {
		return playgroundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayground_AgeFrom() {
		return (EAttribute)playgroundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayground_AgeTo() {
		return (EAttribute)playgroundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFirstAid() {
		return firstAidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFirstAid_Defibrillator() {
		return (EAttribute)firstAidEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntrance() {
		return entranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntrance_Main() {
		return (EAttribute)entranceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPath_Surface() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuilding() {
		return buildingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuilding_Floors() {
		return (EAttribute)buildingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSiteBoundary() {
		return siteBoundaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLevel() {
		return levelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperationalStatus() {
		return operationalStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPoolType() {
		return poolTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSaunaType() {
		return saunaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSportType() {
		return sportTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSurface() {
		return surfaceEEnum;
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
	public BathFactory getBathFactory() {
		return (BathFactory)getEFactoryInstance();
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
		assetEClass = createEClass(ASSET);
		createEAttribute(assetEClass, ASSET__ID);
		createEAttribute(assetEClass, ASSET__NAME);
		createEAttribute(assetEClass, ASSET__DESCRIPTION);
		createEAttribute(assetEClass, ASSET__GEOMETRY);
		createEAttribute(assetEClass, ASSET__MIN_X);
		createEAttribute(assetEClass, ASSET__MIN_Y);
		createEAttribute(assetEClass, ASSET__MAX_X);
		createEAttribute(assetEClass, ASSET__MAX_Y);
		createEAttribute(assetEClass, ASSET__LEVEL);
		createEAttribute(assetEClass, ASSET__STATUS);
		createEAttribute(assetEClass, ASSET__ACCESSIBLE);
		createEAttribute(assetEClass, ASSET__LAST_INSPECTION);

		poolEClass = createEClass(POOL);
		createEAttribute(poolEClass, POOL__POOL_TYPE);
		createEAttribute(poolEClass, POOL__DEPTH_MIN);
		createEAttribute(poolEClass, POOL__DEPTH_MAX);
		createEAttribute(poolEClass, POOL__WATER_TEMPERATURE);
		createEAttribute(poolEClass, POOL__LANES);

		slideEClass = createEClass(SLIDE);
		createEAttribute(slideEClass, SLIDE__LENGTH);
		createEAttribute(slideEClass, SLIDE__HEIGHT_DIFFERENCE);
		createEAttribute(slideEClass, SLIDE__MIN_AGE);

		changingRoomEClass = createEClass(CHANGING_ROOM);
		createEAttribute(changingRoomEClass, CHANGING_ROOM__CABINS);
		createEAttribute(changingRoomEClass, CHANGING_ROOM__LOCKERS);
		createEAttribute(changingRoomEClass, CHANGING_ROOM__FAMILY);

		toiletEClass = createEClass(TOILET);
		createEAttribute(toiletEClass, TOILET__BABY_CHANGING);

		kioskEClass = createEClass(KIOSK);
		createEAttribute(kioskEClass, KIOSK__OPENING_HOURS);
		createEAttribute(kioskEClass, KIOSK__SEATS);

		saunaEClass = createEClass(SAUNA);
		createEAttribute(saunaEClass, SAUNA__SAUNA_TYPE);
		createEAttribute(saunaEClass, SAUNA__TEMPERATURE);
		createEAttribute(saunaEClass, SAUNA__CAPACITY);

		sportAreaEClass = createEClass(SPORT_AREA);
		createEAttribute(sportAreaEClass, SPORT_AREA__SPORT_TYPE);

		lawnEClass = createEClass(LAWN);
		createEAttribute(lawnEClass, LAWN__SHADED);

		playgroundEClass = createEClass(PLAYGROUND);
		createEAttribute(playgroundEClass, PLAYGROUND__AGE_FROM);
		createEAttribute(playgroundEClass, PLAYGROUND__AGE_TO);

		firstAidEClass = createEClass(FIRST_AID);
		createEAttribute(firstAidEClass, FIRST_AID__DEFIBRILLATOR);

		entranceEClass = createEClass(ENTRANCE);
		createEAttribute(entranceEClass, ENTRANCE__MAIN);

		pathEClass = createEClass(PATH);
		createEAttribute(pathEClass, PATH__SURFACE);

		buildingEClass = createEClass(BUILDING);
		createEAttribute(buildingEClass, BUILDING__FLOORS);

		siteBoundaryEClass = createEClass(SITE_BOUNDARY);

		// Create enums
		levelEEnum = createEEnum(LEVEL);
		operationalStatusEEnum = createEEnum(OPERATIONAL_STATUS);
		poolTypeEEnum = createEEnum(POOL_TYPE);
		saunaTypeEEnum = createEEnum(SAUNA_TYPE);
		sportTypeEEnum = createEEnum(SPORT_TYPE);
		surfaceEEnum = createEEnum(SURFACE);

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
		poolEClass.getESuperTypes().add(this.getAsset());
		slideEClass.getESuperTypes().add(this.getAsset());
		changingRoomEClass.getESuperTypes().add(this.getAsset());
		toiletEClass.getESuperTypes().add(this.getAsset());
		kioskEClass.getESuperTypes().add(this.getAsset());
		saunaEClass.getESuperTypes().add(this.getAsset());
		sportAreaEClass.getESuperTypes().add(this.getAsset());
		lawnEClass.getESuperTypes().add(this.getAsset());
		playgroundEClass.getESuperTypes().add(this.getAsset());
		firstAidEClass.getESuperTypes().add(this.getAsset());
		entranceEClass.getESuperTypes().add(this.getAsset());
		pathEClass.getESuperTypes().add(this.getAsset());
		buildingEClass.getESuperTypes().add(this.getAsset());
		siteBoundaryEClass.getESuperTypes().add(this.getAsset());

		// Initialize classes, features, and operations; add parameters
		initEClass(assetEClass, Asset.class, "Asset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_Id(), ecorePackage.getEString(), "id", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_Name(), ecorePackage.getEString(), "name", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_Description(), ecorePackage.getEString(), "description", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_Geometry(), this.getGeoJsonGeometry(), "geometry", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_MinX(), ecorePackage.getEDouble(), "minX", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_MinY(), ecorePackage.getEDouble(), "minY", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_MaxX(), ecorePackage.getEDouble(), "maxX", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_MaxY(), ecorePackage.getEDouble(), "maxY", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_Level(), this.getLevel(), "level", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_Status(), this.getOperationalStatus(), "status", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_Accessible(), ecorePackage.getEBoolean(), "accessible", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_LastInspection(), ecorePackage.getEDate(), "lastInspection", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poolEClass, Pool.class, "Pool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPool_PoolType(), this.getPoolType(), "poolType", null, 0, 1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPool_DepthMin(), ecorePackage.getEDouble(), "depthMin", null, 0, 1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPool_DepthMax(), ecorePackage.getEDouble(), "depthMax", null, 0, 1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPool_WaterTemperature(), ecorePackage.getEDouble(), "waterTemperature", null, 0, 1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPool_Lanes(), ecorePackage.getEInt(), "lanes", null, 0, 1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slideEClass, Slide.class, "Slide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlide_Length(), ecorePackage.getEDouble(), "length", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlide_HeightDifference(), ecorePackage.getEDouble(), "heightDifference", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlide_MinAge(), ecorePackage.getEInt(), "minAge", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changingRoomEClass, ChangingRoom.class, "ChangingRoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangingRoom_Cabins(), ecorePackage.getEInt(), "cabins", null, 0, 1, ChangingRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangingRoom_Lockers(), ecorePackage.getEInt(), "lockers", null, 0, 1, ChangingRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangingRoom_Family(), ecorePackage.getEBoolean(), "family", null, 0, 1, ChangingRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toiletEClass, Toilet.class, "Toilet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToilet_BabyChanging(), ecorePackage.getEBoolean(), "babyChanging", null, 0, 1, Toilet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kioskEClass, Kiosk.class, "Kiosk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKiosk_OpeningHours(), ecorePackage.getEString(), "openingHours", null, 0, 1, Kiosk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKiosk_Seats(), ecorePackage.getEInt(), "seats", null, 0, 1, Kiosk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(saunaEClass, Sauna.class, "Sauna", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSauna_SaunaType(), this.getSaunaType(), "saunaType", null, 0, 1, Sauna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSauna_Temperature(), ecorePackage.getEDouble(), "temperature", null, 0, 1, Sauna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSauna_Capacity(), ecorePackage.getEInt(), "capacity", null, 0, 1, Sauna.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sportAreaEClass, SportArea.class, "SportArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSportArea_SportType(), this.getSportType(), "sportType", null, 0, 1, SportArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lawnEClass, Lawn.class, "Lawn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLawn_Shaded(), ecorePackage.getEBoolean(), "shaded", null, 0, 1, Lawn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playgroundEClass, Playground.class, "Playground", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayground_AgeFrom(), ecorePackage.getEInt(), "ageFrom", null, 0, 1, Playground.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayground_AgeTo(), ecorePackage.getEInt(), "ageTo", null, 0, 1, Playground.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(firstAidEClass, FirstAid.class, "FirstAid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFirstAid_Defibrillator(), ecorePackage.getEBoolean(), "defibrillator", null, 0, 1, FirstAid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entranceEClass, Entrance.class, "Entrance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntrance_Main(), ecorePackage.getEBoolean(), "main", null, 0, 1, Entrance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPath_Surface(), this.getSurface(), "surface", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildingEClass, Building.class, "Building", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuilding_Floors(), ecorePackage.getEInt(), "floors", null, 0, 1, Building.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siteBoundaryEClass, SiteBoundary.class, "SiteBoundary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(levelEEnum, Level.class, "Level");
		addEEnumLiteral(levelEEnum, Level.GROUND_FLOOR);
		addEEnumLiteral(levelEEnum, Level.UPPER_FLOOR);
		addEEnumLiteral(levelEEnum, Level.BASEMENT);
		addEEnumLiteral(levelEEnum, Level.OUTDOOR);

		initEEnum(operationalStatusEEnum, OperationalStatus.class, "OperationalStatus");
		addEEnumLiteral(operationalStatusEEnum, OperationalStatus.OPEN);
		addEEnumLiteral(operationalStatusEEnum, OperationalStatus.CLOSED);
		addEEnumLiteral(operationalStatusEEnum, OperationalStatus.MAINTENANCE);

		initEEnum(poolTypeEEnum, PoolType.class, "PoolType");
		addEEnumLiteral(poolTypeEEnum, PoolType.SWIMMER);
		addEEnumLiteral(poolTypeEEnum, PoolType.NON_SWIMMER);
		addEEnumLiteral(poolTypeEEnum, PoolType.KIDS);
		addEEnumLiteral(poolTypeEEnum, PoolType.WAVE);
		addEEnumLiteral(poolTypeEEnum, PoolType.OUTDOOR);
		addEEnumLiteral(poolTypeEEnum, PoolType.WHIRLPOOL);
		addEEnumLiteral(poolTypeEEnum, PoolType.DIVING);

		initEEnum(saunaTypeEEnum, SaunaType.class, "SaunaType");
		addEEnumLiteral(saunaTypeEEnum, SaunaType.FINNISH);
		addEEnumLiteral(saunaTypeEEnum, SaunaType.BIO);
		addEEnumLiteral(saunaTypeEEnum, SaunaType.STEAM);
		addEEnumLiteral(saunaTypeEEnum, SaunaType.INFRARED);

		initEEnum(sportTypeEEnum, SportType.class, "SportType");
		addEEnumLiteral(sportTypeEEnum, SportType.BEACH_VOLLEYBALL);
		addEEnumLiteral(sportTypeEEnum, SportType.SOCCER);
		addEEnumLiteral(sportTypeEEnum, SportType.TABLE_TENNIS);
		addEEnumLiteral(sportTypeEEnum, SportType.FITNESS);
		addEEnumLiteral(sportTypeEEnum, SportType.BASKETBALL);

		initEEnum(surfaceEEnum, Surface.class, "Surface");
		addEEnumLiteral(surfaceEEnum, Surface.PAVED);
		addEEnumLiteral(surfaceEEnum, Surface.GRAVEL);
		addEEnumLiteral(surfaceEEnum, Surface.WOODEN);
		addEEnumLiteral(surfaceEEnum, Surface.RUBBER);
		addEEnumLiteral(surfaceEEnum, Surface.GRASS);

		// Initialize data types
		initEDataType(geoJsonGeometryEDataType, Geometry.class, "GeoJsonGeometry", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// https://eclipse.org/fennec/persistence
		createPersistenceAnnotations();
		// https://eclipse.org/fennec/ogc/features
		createFeaturesAnnotations();
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
		  (assetEClass,
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
		  (assetEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "assets",
			   "title", "Alle Anlagen",
			   "description", "Alle Anlagen des Freizeitbads",
			   "geometry", "geometry",
			   "bbox", "minX,minY,maxX,maxY",
			   "temporal", "lastInspection"
		   });
		addAnnotation
		  (poolEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "pools",
			   "title", "Becken",
			   "layerGroup", "Wasser",
			   "style", "#1e88e5"
		   });
		addAnnotation
		  (slideEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "slides",
			   "title", "Rutschen",
			   "layerGroup", "Wasser",
			   "style", "#00acc1"
		   });
		addAnnotation
		  (changingRoomEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "changing-rooms",
			   "title", "Umkleiden",
			   "layerGroup", "Service",
			   "style", "#8e24aa"
		   });
		addAnnotation
		  (toiletEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "toilets",
			   "title", "WC",
			   "layerGroup", "Service",
			   "style", "#6d4c41"
		   });
		addAnnotation
		  (kioskEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "kiosks",
			   "title", "Kiosk & Gastronomie",
			   "layerGroup", "Gastronomie",
			   "style", "#fb8c00"
		   });
		addAnnotation
		  (saunaEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "saunas",
			   "title", "Sauna",
			   "layerGroup", "Wellness",
			   "style", "#e53935"
		   });
		addAnnotation
		  (sportAreaEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "sport-areas",
			   "title", "Sportbereich",
			   "layerGroup", "Sport",
			   "style", "#43a047"
		   });
		addAnnotation
		  (lawnEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "lawns",
			   "title", "Liegewiese",
			   "layerGroup", "Freifl\u00e4chen",
			   "style", "#7cb342"
		   });
		addAnnotation
		  (playgroundEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "playgrounds",
			   "title", "Spielplatz",
			   "layerGroup", "Freifl\u00e4chen",
			   "style", "#fdd835"
		   });
		addAnnotation
		  (firstAidEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "first-aid",
			   "title", "Erste Hilfe",
			   "layerGroup", "Service",
			   "style", "#d81b60"
		   });
		addAnnotation
		  (entranceEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "entrances",
			   "title", "Eing\u00e4nge",
			   "layerGroup", "Infrastruktur",
			   "style", "#546e7a"
		   });
		addAnnotation
		  (pathEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "paths",
			   "title", "Wege",
			   "layerGroup", "Infrastruktur",
			   "style", "#9e9e9e"
		   });
		addAnnotation
		  (buildingEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "buildings",
			   "title", "Geb\u00e4ude",
			   "layerGroup", "Infrastruktur",
			   "style", "{\"color\":\"#78909c\",\"fillOpacity\":0.15}"
		   });
		addAnnotation
		  (siteBoundaryEClass,
		   source,
		   new String[] {
			   "collection", "true",
			   "id", "site",
			   "title", "Gel\u00e4nde",
			   "layerGroup", "Infrastruktur",
			   "style", "{\"color\":\"#37474f\",\"fillOpacity\":0.03}"
		   });
	}

} //BathPackageImpl
