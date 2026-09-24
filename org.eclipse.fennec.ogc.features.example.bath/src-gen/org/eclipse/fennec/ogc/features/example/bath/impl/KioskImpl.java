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
import org.eclipse.fennec.ogc.features.example.bath.Kiosk;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kiosk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.KioskImpl#getOpeningHours <em>Opening Hours</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.KioskImpl#getSeats <em>Seats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KioskImpl extends AssetImpl implements Kiosk {
	/**
	 * The default value of the '{@link #getOpeningHours() <em>Opening Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningHours()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENING_HOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpeningHours() <em>Opening Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningHours()
	 * @generated
	 * @ordered
	 */
	protected String openingHours = OPENING_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeats() <em>Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeats()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeats() <em>Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeats()
	 * @generated
	 * @ordered
	 */
	protected int seats = SEATS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KioskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BathPackage.Literals.KIOSK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpeningHours() {
		return openingHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpeningHours(String newOpeningHours) {
		String oldOpeningHours = openingHours;
		openingHours = newOpeningHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.KIOSK__OPENING_HOURS, oldOpeningHours, openingHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSeats() {
		return seats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeats(int newSeats) {
		int oldSeats = seats;
		seats = newSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.KIOSK__SEATS, oldSeats, seats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BathPackage.KIOSK__OPENING_HOURS:
				return getOpeningHours();
			case BathPackage.KIOSK__SEATS:
				return getSeats();
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
			case BathPackage.KIOSK__OPENING_HOURS:
				setOpeningHours((String)newValue);
				return;
			case BathPackage.KIOSK__SEATS:
				setSeats((Integer)newValue);
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
			case BathPackage.KIOSK__OPENING_HOURS:
				setOpeningHours(OPENING_HOURS_EDEFAULT);
				return;
			case BathPackage.KIOSK__SEATS:
				setSeats(SEATS_EDEFAULT);
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
			case BathPackage.KIOSK__OPENING_HOURS:
				return OPENING_HOURS_EDEFAULT == null ? openingHours != null : !OPENING_HOURS_EDEFAULT.equals(openingHours);
			case BathPackage.KIOSK__SEATS:
				return seats != SEATS_EDEFAULT;
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
		result.append(" (openingHours: ");
		result.append(openingHours);
		result.append(", seats: ");
		result.append(seats);
		result.append(')');
		return result.toString();
	}

} //KioskImpl
