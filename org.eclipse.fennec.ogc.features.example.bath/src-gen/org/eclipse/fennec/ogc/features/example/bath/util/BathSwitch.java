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
package org.eclipse.fennec.ogc.features.example.bath.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.fennec.ogc.features.example.bath.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage
 * @generated
 */
public class BathSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BathPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BathSwitch() {
		if (modelPackage == null) {
			modelPackage = BathPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BathPackage.ASSET: {
				Asset asset = (Asset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.POOL: {
				Pool pool = (Pool)theEObject;
				T result = casePool(pool);
				if (result == null) result = caseAsset(pool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.SLIDE: {
				Slide slide = (Slide)theEObject;
				T result = caseSlide(slide);
				if (result == null) result = caseAsset(slide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.CHANGING_ROOM: {
				ChangingRoom changingRoom = (ChangingRoom)theEObject;
				T result = caseChangingRoom(changingRoom);
				if (result == null) result = caseAsset(changingRoom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.TOILET: {
				Toilet toilet = (Toilet)theEObject;
				T result = caseToilet(toilet);
				if (result == null) result = caseAsset(toilet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.KIOSK: {
				Kiosk kiosk = (Kiosk)theEObject;
				T result = caseKiosk(kiosk);
				if (result == null) result = caseAsset(kiosk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.SAUNA: {
				Sauna sauna = (Sauna)theEObject;
				T result = caseSauna(sauna);
				if (result == null) result = caseAsset(sauna);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.SPORT_AREA: {
				SportArea sportArea = (SportArea)theEObject;
				T result = caseSportArea(sportArea);
				if (result == null) result = caseAsset(sportArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.LAWN: {
				Lawn lawn = (Lawn)theEObject;
				T result = caseLawn(lawn);
				if (result == null) result = caseAsset(lawn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.PLAYGROUND: {
				Playground playground = (Playground)theEObject;
				T result = casePlayground(playground);
				if (result == null) result = caseAsset(playground);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.FIRST_AID: {
				FirstAid firstAid = (FirstAid)theEObject;
				T result = caseFirstAid(firstAid);
				if (result == null) result = caseAsset(firstAid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.ENTRANCE: {
				Entrance entrance = (Entrance)theEObject;
				T result = caseEntrance(entrance);
				if (result == null) result = caseAsset(entrance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.PATH: {
				Path path = (Path)theEObject;
				T result = casePath(path);
				if (result == null) result = caseAsset(path);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.BUILDING: {
				Building building = (Building)theEObject;
				T result = caseBuilding(building);
				if (result == null) result = caseAsset(building);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.SITE_BOUNDARY: {
				SiteBoundary siteBoundary = (SiteBoundary)theEObject;
				T result = caseSiteBoundary(siteBoundary);
				if (result == null) result = caseAsset(siteBoundary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.PARKING_LOT: {
				ParkingLot parkingLot = (ParkingLot)theEObject;
				T result = caseParkingLot(parkingLot);
				if (result == null) result = caseAsset(parkingLot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.PAVING: {
				Paving paving = (Paving)theEObject;
				T result = casePaving(paving);
				if (result == null) result = caseAsset(paving);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.SHOWER: {
				Shower shower = (Shower)theEObject;
				T result = caseShower(shower);
				if (result == null) result = caseAsset(shower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.TREE: {
				Tree tree = (Tree)theEObject;
				T result = caseTree(tree);
				if (result == null) result = caseAsset(tree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.SHRUB: {
				Shrub shrub = (Shrub)theEObject;
				T result = caseShrub(shrub);
				if (result == null) result = caseAsset(shrub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BathPackage.BIKE_PARKING: {
				BikeParking bikeParking = (BikeParking)theEObject;
				T result = caseBikeParking(bikeParking);
				if (result == null) result = caseAsset(bikeParking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePool(Pool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlide(Slide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Changing Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Changing Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangingRoom(ChangingRoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toilet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toilet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToilet(Toilet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kiosk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kiosk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKiosk(Kiosk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sauna</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sauna</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSauna(Sauna object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sport Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sport Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSportArea(SportArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lawn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lawn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLawn(Lawn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Playground</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Playground</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayground(Playground object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First Aid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First Aid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstAid(FirstAid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entrance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entrance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntrance(Entrance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePath(Path object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Building</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Building</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilding(Building object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site Boundary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site Boundary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiteBoundary(SiteBoundary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parking Lot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parking Lot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParkingLot(ParkingLot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paving</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paving</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaving(Paving object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shower</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shower</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShower(Shower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTree(Tree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shrub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shrub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShrub(Shrub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bike Parking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bike Parking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBikeParking(BikeParking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BathSwitch
