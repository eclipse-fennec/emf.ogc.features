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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage
 * @generated
 */
@ProviderType
public interface BathFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BathFactory eINSTANCE = org.eclipse.fennec.ogc.features.example.bath.impl.BathFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pool</em>'.
	 * @generated
	 */
	Pool createPool();

	/**
	 * Returns a new object of class '<em>Slide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slide</em>'.
	 * @generated
	 */
	Slide createSlide();

	/**
	 * Returns a new object of class '<em>Changing Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Changing Room</em>'.
	 * @generated
	 */
	ChangingRoom createChangingRoom();

	/**
	 * Returns a new object of class '<em>Toilet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toilet</em>'.
	 * @generated
	 */
	Toilet createToilet();

	/**
	 * Returns a new object of class '<em>Kiosk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kiosk</em>'.
	 * @generated
	 */
	Kiosk createKiosk();

	/**
	 * Returns a new object of class '<em>Sauna</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sauna</em>'.
	 * @generated
	 */
	Sauna createSauna();

	/**
	 * Returns a new object of class '<em>Sport Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sport Area</em>'.
	 * @generated
	 */
	SportArea createSportArea();

	/**
	 * Returns a new object of class '<em>Lawn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lawn</em>'.
	 * @generated
	 */
	Lawn createLawn();

	/**
	 * Returns a new object of class '<em>Playground</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Playground</em>'.
	 * @generated
	 */
	Playground createPlayground();

	/**
	 * Returns a new object of class '<em>First Aid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First Aid</em>'.
	 * @generated
	 */
	FirstAid createFirstAid();

	/**
	 * Returns a new object of class '<em>Entrance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entrance</em>'.
	 * @generated
	 */
	Entrance createEntrance();

	/**
	 * Returns a new object of class '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path</em>'.
	 * @generated
	 */
	Path createPath();

	/**
	 * Returns a new object of class '<em>Building</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Building</em>'.
	 * @generated
	 */
	Building createBuilding();

	/**
	 * Returns a new object of class '<em>Site Boundary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Site Boundary</em>'.
	 * @generated
	 */
	SiteBoundary createSiteBoundary();

	/**
	 * Returns a new object of class '<em>Parking Lot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parking Lot</em>'.
	 * @generated
	 */
	ParkingLot createParkingLot();

	/**
	 * Returns a new object of class '<em>Paving</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paving</em>'.
	 * @generated
	 */
	Paving createPaving();

	/**
	 * Returns a new object of class '<em>Shower</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shower</em>'.
	 * @generated
	 */
	Shower createShower();

	/**
	 * Returns a new object of class '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree</em>'.
	 * @generated
	 */
	Tree createTree();

	/**
	 * Returns a new object of class '<em>Shrub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shrub</em>'.
	 * @generated
	 */
	Shrub createShrub();

	/**
	 * Returns a new object of class '<em>Bike Parking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bike Parking</em>'.
	 * @generated
	 */
	BikeParking createBikeParking();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BathPackage getBathPackage();

} //BathFactory
