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
package org.eclipse.fennec.ogc.features.example.bath.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.ogc.features.example.bath.BathPackage;
import org.eclipse.fennec.ogc.features.example.bath.ParkingLot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parking Lot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.ParkingLotImpl#getSpaces <em>Spaces</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.ParkingLotImpl#getFreeHours <em>Free Hours</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.ParkingLotImpl#getChargingPoints <em>Charging Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParkingLotImpl extends AssetImpl implements ParkingLot {
	/**
	 * The default value of the '{@link #getSpaces() <em>Spaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaces()
	 * @generated
	 * @ordered
	 */
	protected static final int SPACES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpaces() <em>Spaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaces()
	 * @generated
	 * @ordered
	 */
	protected int spaces = SPACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFreeHours() <em>Free Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeHours()
	 * @generated
	 * @ordered
	 */
	protected static final int FREE_HOURS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFreeHours() <em>Free Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeHours()
	 * @generated
	 * @ordered
	 */
	protected int freeHours = FREE_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getChargingPoints() <em>Charging Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int CHARGING_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChargingPoints() <em>Charging Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingPoints()
	 * @generated
	 * @ordered
	 */
	protected int chargingPoints = CHARGING_POINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParkingLotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BathPackage.Literals.PARKING_LOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSpaces() {
		return spaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaces(int newSpaces) {
		int oldSpaces = spaces;
		spaces = newSpaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.PARKING_LOT__SPACES, oldSpaces, spaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFreeHours() {
		return freeHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreeHours(int newFreeHours) {
		int oldFreeHours = freeHours;
		freeHours = newFreeHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.PARKING_LOT__FREE_HOURS, oldFreeHours, freeHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getChargingPoints() {
		return chargingPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChargingPoints(int newChargingPoints) {
		int oldChargingPoints = chargingPoints;
		chargingPoints = newChargingPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.PARKING_LOT__CHARGING_POINTS, oldChargingPoints, chargingPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BathPackage.PARKING_LOT__SPACES:
				return getSpaces();
			case BathPackage.PARKING_LOT__FREE_HOURS:
				return getFreeHours();
			case BathPackage.PARKING_LOT__CHARGING_POINTS:
				return getChargingPoints();
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
			case BathPackage.PARKING_LOT__SPACES:
				setSpaces((Integer)newValue);
				return;
			case BathPackage.PARKING_LOT__FREE_HOURS:
				setFreeHours((Integer)newValue);
				return;
			case BathPackage.PARKING_LOT__CHARGING_POINTS:
				setChargingPoints((Integer)newValue);
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
			case BathPackage.PARKING_LOT__SPACES:
				setSpaces(SPACES_EDEFAULT);
				return;
			case BathPackage.PARKING_LOT__FREE_HOURS:
				setFreeHours(FREE_HOURS_EDEFAULT);
				return;
			case BathPackage.PARKING_LOT__CHARGING_POINTS:
				setChargingPoints(CHARGING_POINTS_EDEFAULT);
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
			case BathPackage.PARKING_LOT__SPACES:
				return spaces != SPACES_EDEFAULT;
			case BathPackage.PARKING_LOT__FREE_HOURS:
				return freeHours != FREE_HOURS_EDEFAULT;
			case BathPackage.PARKING_LOT__CHARGING_POINTS:
				return chargingPoints != CHARGING_POINTS_EDEFAULT;
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
		result.append(" (spaces: ");
		result.append(spaces);
		result.append(", freeHours: ");
		result.append(freeHours);
		result.append(", chargingPoints: ");
		result.append(chargingPoints);
		result.append(')');
		return result.toString();
	}

} //ParkingLotImpl
