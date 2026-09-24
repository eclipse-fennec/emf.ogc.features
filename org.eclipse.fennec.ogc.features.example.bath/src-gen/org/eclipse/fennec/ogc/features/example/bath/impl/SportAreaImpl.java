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
import org.eclipse.fennec.ogc.features.example.bath.SportArea;
import org.eclipse.fennec.ogc.features.example.bath.SportType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sport Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.SportAreaImpl#getSportType <em>Sport Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SportAreaImpl extends AssetImpl implements SportArea {
	/**
	 * The default value of the '{@link #getSportType() <em>Sport Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSportType()
	 * @generated
	 * @ordered
	 */
	protected static final SportType SPORT_TYPE_EDEFAULT = SportType.BEACH_VOLLEYBALL;

	/**
	 * The cached value of the '{@link #getSportType() <em>Sport Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSportType()
	 * @generated
	 * @ordered
	 */
	protected SportType sportType = SPORT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SportAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BathPackage.Literals.SPORT_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SportType getSportType() {
		return sportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSportType(SportType newSportType) {
		SportType oldSportType = sportType;
		sportType = newSportType == null ? SPORT_TYPE_EDEFAULT : newSportType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.SPORT_AREA__SPORT_TYPE, oldSportType, sportType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BathPackage.SPORT_AREA__SPORT_TYPE:
				return getSportType();
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
			case BathPackage.SPORT_AREA__SPORT_TYPE:
				setSportType((SportType)newValue);
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
			case BathPackage.SPORT_AREA__SPORT_TYPE:
				setSportType(SPORT_TYPE_EDEFAULT);
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
			case BathPackage.SPORT_AREA__SPORT_TYPE:
				return sportType != SPORT_TYPE_EDEFAULT;
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
		result.append(" (sportType: ");
		result.append(sportType);
		result.append(')');
		return result.toString();
	}

} //SportAreaImpl
