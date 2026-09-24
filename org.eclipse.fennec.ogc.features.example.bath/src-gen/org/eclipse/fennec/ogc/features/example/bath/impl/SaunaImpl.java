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
import org.eclipse.fennec.ogc.features.example.bath.Sauna;
import org.eclipse.fennec.ogc.features.example.bath.SaunaType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sauna</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.SaunaImpl#getSaunaType <em>Sauna Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.SaunaImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.SaunaImpl#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaunaImpl extends AssetImpl implements Sauna {
	/**
	 * The default value of the '{@link #getSaunaType() <em>Sauna Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaunaType()
	 * @generated
	 * @ordered
	 */
	protected static final SaunaType SAUNA_TYPE_EDEFAULT = SaunaType.FINNISH;

	/**
	 * The cached value of the '{@link #getSaunaType() <em>Sauna Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaunaType()
	 * @generated
	 * @ordered
	 */
	protected SaunaType saunaType = SAUNA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final double TEMPERATURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected double temperature = TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaunaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BathPackage.Literals.SAUNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SaunaType getSaunaType() {
		return saunaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaunaType(SaunaType newSaunaType) {
		SaunaType oldSaunaType = saunaType;
		saunaType = newSaunaType == null ? SAUNA_TYPE_EDEFAULT : newSaunaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.SAUNA__SAUNA_TYPE, oldSaunaType, saunaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperature(double newTemperature) {
		double oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.SAUNA__TEMPERATURE, oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.SAUNA__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BathPackage.SAUNA__SAUNA_TYPE:
				return getSaunaType();
			case BathPackage.SAUNA__TEMPERATURE:
				return getTemperature();
			case BathPackage.SAUNA__CAPACITY:
				return getCapacity();
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
			case BathPackage.SAUNA__SAUNA_TYPE:
				setSaunaType((SaunaType)newValue);
				return;
			case BathPackage.SAUNA__TEMPERATURE:
				setTemperature((Double)newValue);
				return;
			case BathPackage.SAUNA__CAPACITY:
				setCapacity((Integer)newValue);
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
			case BathPackage.SAUNA__SAUNA_TYPE:
				setSaunaType(SAUNA_TYPE_EDEFAULT);
				return;
			case BathPackage.SAUNA__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case BathPackage.SAUNA__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
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
			case BathPackage.SAUNA__SAUNA_TYPE:
				return saunaType != SAUNA_TYPE_EDEFAULT;
			case BathPackage.SAUNA__TEMPERATURE:
				return temperature != TEMPERATURE_EDEFAULT;
			case BathPackage.SAUNA__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
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
		result.append(" (saunaType: ");
		result.append(saunaType);
		result.append(", temperature: ");
		result.append(temperature);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //SaunaImpl
