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
import org.eclipse.fennec.ogc.features.example.bath.BikeParking;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bike Parking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.BikeParkingImpl#getRacks <em>Racks</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.BikeParkingImpl#isCovered <em>Covered</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BikeParkingImpl extends AssetImpl implements BikeParking {
	/**
	 * The default value of the '{@link #getRacks() <em>Racks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRacks()
	 * @generated
	 * @ordered
	 */
	protected static final int RACKS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRacks() <em>Racks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRacks()
	 * @generated
	 * @ordered
	 */
	protected int racks = RACKS_EDEFAULT;

	/**
	 * The default value of the '{@link #isCovered() <em>Covered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCovered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COVERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCovered() <em>Covered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCovered()
	 * @generated
	 * @ordered
	 */
	protected boolean covered = COVERED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BikeParkingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BathPackage.Literals.BIKE_PARKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRacks() {
		return racks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRacks(int newRacks) {
		int oldRacks = racks;
		racks = newRacks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.BIKE_PARKING__RACKS, oldRacks, racks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCovered() {
		return covered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCovered(boolean newCovered) {
		boolean oldCovered = covered;
		covered = newCovered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.BIKE_PARKING__COVERED, oldCovered, covered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BathPackage.BIKE_PARKING__RACKS:
				return getRacks();
			case BathPackage.BIKE_PARKING__COVERED:
				return isCovered();
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
			case BathPackage.BIKE_PARKING__RACKS:
				setRacks((Integer)newValue);
				return;
			case BathPackage.BIKE_PARKING__COVERED:
				setCovered((Boolean)newValue);
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
			case BathPackage.BIKE_PARKING__RACKS:
				setRacks(RACKS_EDEFAULT);
				return;
			case BathPackage.BIKE_PARKING__COVERED:
				setCovered(COVERED_EDEFAULT);
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
			case BathPackage.BIKE_PARKING__RACKS:
				return racks != RACKS_EDEFAULT;
			case BathPackage.BIKE_PARKING__COVERED:
				return covered != COVERED_EDEFAULT;
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
		result.append(" (racks: ");
		result.append(racks);
		result.append(", covered: ");
		result.append(covered);
		result.append(')');
		return result.toString();
	}

} //BikeParkingImpl
