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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.fennec.ogc.features.example.bath.*;

import org.geojson.Geometry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BathFactoryImpl extends EFactoryImpl implements BathFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BathFactory init() {
		try {
			BathFactory theBathFactory = (BathFactory)EPackage.Registry.INSTANCE.getEFactory(BathPackage.eNS_URI);
			if (theBathFactory != null) {
				return theBathFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BathFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BathFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BathPackage.POOL: return createPool();
			case BathPackage.SLIDE: return createSlide();
			case BathPackage.CHANGING_ROOM: return createChangingRoom();
			case BathPackage.TOILET: return createToilet();
			case BathPackage.KIOSK: return createKiosk();
			case BathPackage.SAUNA: return createSauna();
			case BathPackage.SPORT_AREA: return createSportArea();
			case BathPackage.LAWN: return createLawn();
			case BathPackage.PLAYGROUND: return createPlayground();
			case BathPackage.FIRST_AID: return createFirstAid();
			case BathPackage.ENTRANCE: return createEntrance();
			case BathPackage.PATH: return createPath();
			case BathPackage.BUILDING: return createBuilding();
			case BathPackage.SITE_BOUNDARY: return createSiteBoundary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BathPackage.LEVEL:
				return createLevelFromString(eDataType, initialValue);
			case BathPackage.OPERATIONAL_STATUS:
				return createOperationalStatusFromString(eDataType, initialValue);
			case BathPackage.POOL_TYPE:
				return createPoolTypeFromString(eDataType, initialValue);
			case BathPackage.SAUNA_TYPE:
				return createSaunaTypeFromString(eDataType, initialValue);
			case BathPackage.SPORT_TYPE:
				return createSportTypeFromString(eDataType, initialValue);
			case BathPackage.SURFACE:
				return createSurfaceFromString(eDataType, initialValue);
			case BathPackage.GEO_JSON_GEOMETRY:
				return createGeoJsonGeometryFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BathPackage.LEVEL:
				return convertLevelToString(eDataType, instanceValue);
			case BathPackage.OPERATIONAL_STATUS:
				return convertOperationalStatusToString(eDataType, instanceValue);
			case BathPackage.POOL_TYPE:
				return convertPoolTypeToString(eDataType, instanceValue);
			case BathPackage.SAUNA_TYPE:
				return convertSaunaTypeToString(eDataType, instanceValue);
			case BathPackage.SPORT_TYPE:
				return convertSportTypeToString(eDataType, instanceValue);
			case BathPackage.SURFACE:
				return convertSurfaceToString(eDataType, instanceValue);
			case BathPackage.GEO_JSON_GEOMETRY:
				return convertGeoJsonGeometryToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pool createPool() {
		PoolImpl pool = new PoolImpl();
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Slide createSlide() {
		SlideImpl slide = new SlideImpl();
		return slide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangingRoom createChangingRoom() {
		ChangingRoomImpl changingRoom = new ChangingRoomImpl();
		return changingRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Toilet createToilet() {
		ToiletImpl toilet = new ToiletImpl();
		return toilet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kiosk createKiosk() {
		KioskImpl kiosk = new KioskImpl();
		return kiosk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sauna createSauna() {
		SaunaImpl sauna = new SaunaImpl();
		return sauna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SportArea createSportArea() {
		SportAreaImpl sportArea = new SportAreaImpl();
		return sportArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lawn createLawn() {
		LawnImpl lawn = new LawnImpl();
		return lawn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Playground createPlayground() {
		PlaygroundImpl playground = new PlaygroundImpl();
		return playground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FirstAid createFirstAid() {
		FirstAidImpl firstAid = new FirstAidImpl();
		return firstAid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entrance createEntrance() {
		EntranceImpl entrance = new EntranceImpl();
		return entrance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Building createBuilding() {
		BuildingImpl building = new BuildingImpl();
		return building;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SiteBoundary createSiteBoundary() {
		SiteBoundaryImpl siteBoundary = new SiteBoundaryImpl();
		return siteBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevelFromString(EDataType eDataType, String initialValue) {
		Level result = Level.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalStatus createOperationalStatusFromString(EDataType eDataType, String initialValue) {
		OperationalStatus result = OperationalStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationalStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolType createPoolTypeFromString(EDataType eDataType, String initialValue) {
		PoolType result = PoolType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoolTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaunaType createSaunaTypeFromString(EDataType eDataType, String initialValue) {
		SaunaType result = SaunaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSaunaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SportType createSportTypeFromString(EDataType eDataType, String initialValue) {
		SportType result = SportType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSportTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Surface createSurfaceFromString(EDataType eDataType, String initialValue) {
		Surface result = Surface.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSurfaceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry createGeoJsonGeometry(final String it) {
		return org.eclipse.fennec.ogc.features.geo.GeoJsonText.standalone().read(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry createGeoJsonGeometryFromString(EDataType eDataType, String initialValue) {
		return createGeoJsonGeometry(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeoJsonGeometry(final Geometry it) {
		return it == null ? null : org.eclipse.fennec.ogc.features.geo.GeoJsonText.standalone().write(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeoJsonGeometryToString(EDataType eDataType, Object instanceValue) {
		return convertGeoJsonGeometry((Geometry)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BathPackage getBathPackage() {
		return (BathPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BathPackage getPackage() {
		return BathPackage.eINSTANCE;
	}

} //BathFactoryImpl
