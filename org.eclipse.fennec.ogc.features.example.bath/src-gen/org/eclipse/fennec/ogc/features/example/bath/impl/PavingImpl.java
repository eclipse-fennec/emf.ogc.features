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
import org.eclipse.fennec.ogc.features.example.bath.Paving;
import org.eclipse.fennec.ogc.features.example.bath.Surface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paving</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.PavingImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.PavingImpl#isSlipResistant <em>Slip Resistant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PavingImpl extends AssetImpl implements Paving {
	/**
	 * The default value of the '{@link #getSurface() <em>Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurface()
	 * @generated
	 * @ordered
	 */
	protected static final Surface SURFACE_EDEFAULT = Surface.PAVED;

	/**
	 * The cached value of the '{@link #getSurface() <em>Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurface()
	 * @generated
	 * @ordered
	 */
	protected Surface surface = SURFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSlipResistant() <em>Slip Resistant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSlipResistant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SLIP_RESISTANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSlipResistant() <em>Slip Resistant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSlipResistant()
	 * @generated
	 * @ordered
	 */
	protected boolean slipResistant = SLIP_RESISTANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PavingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BathPackage.Literals.PAVING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Surface getSurface() {
		return surface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurface(Surface newSurface) {
		Surface oldSurface = surface;
		surface = newSurface == null ? SURFACE_EDEFAULT : newSurface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.PAVING__SURFACE, oldSurface, surface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSlipResistant() {
		return slipResistant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlipResistant(boolean newSlipResistant) {
		boolean oldSlipResistant = slipResistant;
		slipResistant = newSlipResistant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.PAVING__SLIP_RESISTANT, oldSlipResistant, slipResistant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BathPackage.PAVING__SURFACE:
				return getSurface();
			case BathPackage.PAVING__SLIP_RESISTANT:
				return isSlipResistant();
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
			case BathPackage.PAVING__SURFACE:
				setSurface((Surface)newValue);
				return;
			case BathPackage.PAVING__SLIP_RESISTANT:
				setSlipResistant((Boolean)newValue);
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
			case BathPackage.PAVING__SURFACE:
				setSurface(SURFACE_EDEFAULT);
				return;
			case BathPackage.PAVING__SLIP_RESISTANT:
				setSlipResistant(SLIP_RESISTANT_EDEFAULT);
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
			case BathPackage.PAVING__SURFACE:
				return surface != SURFACE_EDEFAULT;
			case BathPackage.PAVING__SLIP_RESISTANT:
				return slipResistant != SLIP_RESISTANT_EDEFAULT;
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
		result.append(" (surface: ");
		result.append(surface);
		result.append(", slipResistant: ");
		result.append(slipResistant);
		result.append(')');
		return result.toString();
	}

} //PavingImpl
