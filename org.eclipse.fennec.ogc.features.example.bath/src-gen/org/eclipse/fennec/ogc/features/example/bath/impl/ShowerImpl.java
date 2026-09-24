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
import org.eclipse.fennec.ogc.features.example.bath.Shower;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shower</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.ShowerImpl#getHeads <em>Heads</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.ShowerImpl#isWarmWater <em>Warm Water</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShowerImpl extends AssetImpl implements Shower {
	/**
	 * The default value of the '{@link #getHeads() <em>Heads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeads()
	 * @generated
	 * @ordered
	 */
	protected static final int HEADS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeads() <em>Heads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeads()
	 * @generated
	 * @ordered
	 */
	protected int heads = HEADS_EDEFAULT;

	/**
	 * The default value of the '{@link #isWarmWater() <em>Warm Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWarmWater()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WARM_WATER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWarmWater() <em>Warm Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWarmWater()
	 * @generated
	 * @ordered
	 */
	protected boolean warmWater = WARM_WATER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShowerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BathPackage.Literals.SHOWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeads() {
		return heads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeads(int newHeads) {
		int oldHeads = heads;
		heads = newHeads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.SHOWER__HEADS, oldHeads, heads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWarmWater() {
		return warmWater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWarmWater(boolean newWarmWater) {
		boolean oldWarmWater = warmWater;
		warmWater = newWarmWater;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.SHOWER__WARM_WATER, oldWarmWater, warmWater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BathPackage.SHOWER__HEADS:
				return getHeads();
			case BathPackage.SHOWER__WARM_WATER:
				return isWarmWater();
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
			case BathPackage.SHOWER__HEADS:
				setHeads((Integer)newValue);
				return;
			case BathPackage.SHOWER__WARM_WATER:
				setWarmWater((Boolean)newValue);
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
			case BathPackage.SHOWER__HEADS:
				setHeads(HEADS_EDEFAULT);
				return;
			case BathPackage.SHOWER__WARM_WATER:
				setWarmWater(WARM_WATER_EDEFAULT);
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
			case BathPackage.SHOWER__HEADS:
				return heads != HEADS_EDEFAULT;
			case BathPackage.SHOWER__WARM_WATER:
				return warmWater != WARM_WATER_EDEFAULT;
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
		result.append(" (heads: ");
		result.append(heads);
		result.append(", warmWater: ");
		result.append(warmWater);
		result.append(')');
		return result.toString();
	}

} //ShowerImpl
