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
import org.eclipse.fennec.ogc.features.example.bath.ChangingRoom;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Changing Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.ChangingRoomImpl#getCabins <em>Cabins</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.ChangingRoomImpl#getLockers <em>Lockers</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.ChangingRoomImpl#isFamily <em>Family</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangingRoomImpl extends AssetImpl implements ChangingRoom {
	/**
	 * The default value of the '{@link #getCabins() <em>Cabins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCabins()
	 * @generated
	 * @ordered
	 */
	protected static final int CABINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCabins() <em>Cabins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCabins()
	 * @generated
	 * @ordered
	 */
	protected int cabins = CABINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLockers() <em>Lockers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockers()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCKERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLockers() <em>Lockers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockers()
	 * @generated
	 * @ordered
	 */
	protected int lockers = LOCKERS_EDEFAULT;

	/**
	 * The default value of the '{@link #isFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFamily()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAMILY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFamily()
	 * @generated
	 * @ordered
	 */
	protected boolean family = FAMILY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangingRoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BathPackage.Literals.CHANGING_ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCabins() {
		return cabins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCabins(int newCabins) {
		int oldCabins = cabins;
		cabins = newCabins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.CHANGING_ROOM__CABINS, oldCabins, cabins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLockers() {
		return lockers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockers(int newLockers) {
		int oldLockers = lockers;
		lockers = newLockers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.CHANGING_ROOM__LOCKERS, oldLockers, lockers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFamily(boolean newFamily) {
		boolean oldFamily = family;
		family = newFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.CHANGING_ROOM__FAMILY, oldFamily, family));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BathPackage.CHANGING_ROOM__CABINS:
				return getCabins();
			case BathPackage.CHANGING_ROOM__LOCKERS:
				return getLockers();
			case BathPackage.CHANGING_ROOM__FAMILY:
				return isFamily();
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
			case BathPackage.CHANGING_ROOM__CABINS:
				setCabins((Integer)newValue);
				return;
			case BathPackage.CHANGING_ROOM__LOCKERS:
				setLockers((Integer)newValue);
				return;
			case BathPackage.CHANGING_ROOM__FAMILY:
				setFamily((Boolean)newValue);
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
			case BathPackage.CHANGING_ROOM__CABINS:
				setCabins(CABINS_EDEFAULT);
				return;
			case BathPackage.CHANGING_ROOM__LOCKERS:
				setLockers(LOCKERS_EDEFAULT);
				return;
			case BathPackage.CHANGING_ROOM__FAMILY:
				setFamily(FAMILY_EDEFAULT);
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
			case BathPackage.CHANGING_ROOM__CABINS:
				return cabins != CABINS_EDEFAULT;
			case BathPackage.CHANGING_ROOM__LOCKERS:
				return lockers != LOCKERS_EDEFAULT;
			case BathPackage.CHANGING_ROOM__FAMILY:
				return family != FAMILY_EDEFAULT;
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
		result.append(" (cabins: ");
		result.append(cabins);
		result.append(", lockers: ");
		result.append(lockers);
		result.append(", family: ");
		result.append(family);
		result.append(')');
		return result.toString();
	}

} //ChangingRoomImpl
