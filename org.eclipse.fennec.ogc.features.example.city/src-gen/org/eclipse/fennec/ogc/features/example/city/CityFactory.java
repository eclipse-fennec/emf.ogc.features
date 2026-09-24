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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage
 * @generated
 */
@ProviderType
public interface CityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CityFactory eINSTANCE = org.eclipse.fennec.ogc.features.example.city.impl.CityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Stadtgebiet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stadtgebiet</em>'.
	 * @generated
	 */
	Stadtgebiet createStadtgebiet();

	/**
	 * Returns a new object of class '<em>Stadtteil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stadtteil</em>'.
	 * @generated
	 */
	Stadtteil createStadtteil();

	/**
	 * Returns a new object of class '<em>Flaeche</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flaeche</em>'.
	 * @generated
	 */
	Flaeche createFlaeche();

	/**
	 * Returns a new object of class '<em>Strasse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strasse</em>'.
	 * @generated
	 */
	Strasse createStrasse();

	/**
	 * Returns a new object of class '<em>Gebaeude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gebaeude</em>'.
	 * @generated
	 */
	Gebaeude createGebaeude();

	/**
	 * Returns a new object of class '<em>Ort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ort</em>'.
	 * @generated
	 */
	Ort createOrt();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CityPackage getCityPackage();

} //CityFactory
