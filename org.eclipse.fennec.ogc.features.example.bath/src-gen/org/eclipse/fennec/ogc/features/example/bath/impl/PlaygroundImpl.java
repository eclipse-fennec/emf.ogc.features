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
import org.eclipse.fennec.ogc.features.example.bath.Playground;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Playground</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.PlaygroundImpl#getAgeFrom <em>Age From</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.PlaygroundImpl#getAgeTo <em>Age To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaygroundImpl extends AssetImpl implements Playground {
	/**
	 * The default value of the '{@link #getAgeFrom() <em>Age From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeFrom()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_FROM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAgeFrom() <em>Age From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeFrom()
	 * @generated
	 * @ordered
	 */
	protected int ageFrom = AGE_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgeTo() <em>Age To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeTo()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_TO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAgeTo() <em>Age To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeTo()
	 * @generated
	 * @ordered
	 */
	protected int ageTo = AGE_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaygroundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BathPackage.Literals.PLAYGROUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAgeFrom() {
		return ageFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgeFrom(int newAgeFrom) {
		int oldAgeFrom = ageFrom;
		ageFrom = newAgeFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.PLAYGROUND__AGE_FROM, oldAgeFrom, ageFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAgeTo() {
		return ageTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgeTo(int newAgeTo) {
		int oldAgeTo = ageTo;
		ageTo = newAgeTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.PLAYGROUND__AGE_TO, oldAgeTo, ageTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BathPackage.PLAYGROUND__AGE_FROM:
				return getAgeFrom();
			case BathPackage.PLAYGROUND__AGE_TO:
				return getAgeTo();
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
			case BathPackage.PLAYGROUND__AGE_FROM:
				setAgeFrom((Integer)newValue);
				return;
			case BathPackage.PLAYGROUND__AGE_TO:
				setAgeTo((Integer)newValue);
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
			case BathPackage.PLAYGROUND__AGE_FROM:
				setAgeFrom(AGE_FROM_EDEFAULT);
				return;
			case BathPackage.PLAYGROUND__AGE_TO:
				setAgeTo(AGE_TO_EDEFAULT);
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
			case BathPackage.PLAYGROUND__AGE_FROM:
				return ageFrom != AGE_FROM_EDEFAULT;
			case BathPackage.PLAYGROUND__AGE_TO:
				return ageTo != AGE_TO_EDEFAULT;
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
		result.append(" (ageFrom: ");
		result.append(ageFrom);
		result.append(", ageTo: ");
		result.append(ageTo);
		result.append(')');
		return result.toString();
	}

} //PlaygroundImpl
