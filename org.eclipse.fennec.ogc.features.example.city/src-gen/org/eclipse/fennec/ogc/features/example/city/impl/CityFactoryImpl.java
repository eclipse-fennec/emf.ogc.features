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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.fennec.ogc.features.example.city.*;

import org.geojson.Geometry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CityFactoryImpl extends EFactoryImpl implements CityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CityFactory init() {
		try {
			CityFactory theCityFactory = (CityFactory)EPackage.Registry.INSTANCE.getEFactory(CityPackage.eNS_URI);
			if (theCityFactory != null) {
				return theCityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CityFactoryImpl() {
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
			case CityPackage.STADTGEBIET: return createStadtgebiet();
			case CityPackage.STADTTEIL: return createStadtteil();
			case CityPackage.FLAECHE: return createFlaeche();
			case CityPackage.STRASSE: return createStrasse();
			case CityPackage.GEBAEUDE: return createGebaeude();
			case CityPackage.ORT: return createOrt();
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
			case CityPackage.NUTZUNG:
				return createNutzungFromString(eDataType, initialValue);
			case CityPackage.STRASSENKLASSE:
				return createStrassenklasseFromString(eDataType, initialValue);
			case CityPackage.GEO_JSON_GEOMETRY:
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
			case CityPackage.NUTZUNG:
				return convertNutzungToString(eDataType, instanceValue);
			case CityPackage.STRASSENKLASSE:
				return convertStrassenklasseToString(eDataType, instanceValue);
			case CityPackage.GEO_JSON_GEOMETRY:
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
	public Stadtgebiet createStadtgebiet() {
		StadtgebietImpl stadtgebiet = new StadtgebietImpl();
		return stadtgebiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stadtteil createStadtteil() {
		StadtteilImpl stadtteil = new StadtteilImpl();
		return stadtteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flaeche createFlaeche() {
		FlaecheImpl flaeche = new FlaecheImpl();
		return flaeche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strasse createStrasse() {
		StrasseImpl strasse = new StrasseImpl();
		return strasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gebaeude createGebaeude() {
		GebaeudeImpl gebaeude = new GebaeudeImpl();
		return gebaeude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ort createOrt() {
		OrtImpl ort = new OrtImpl();
		return ort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nutzung createNutzungFromString(EDataType eDataType, String initialValue) {
		Nutzung result = Nutzung.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNutzungToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strassenklasse createStrassenklasseFromString(EDataType eDataType, String initialValue) {
		Strassenklasse result = Strassenklasse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrassenklasseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry createGeoJsonGeometryFromString(EDataType eDataType, String initialValue) {
		return (Geometry)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeoJsonGeometryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CityPackage getCityPackage() {
		return (CityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CityPackage getPackage() {
		return CityPackage.eINSTANCE;
	}

} //CityFactoryImpl
