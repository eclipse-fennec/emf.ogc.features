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
import org.eclipse.fennec.ogc.features.example.bath.Pool;
import org.eclipse.fennec.ogc.features.example.bath.PoolType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.PoolImpl#getPoolType <em>Pool Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.PoolImpl#getDepthMin <em>Depth Min</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.PoolImpl#getDepthMax <em>Depth Max</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.PoolImpl#getWaterTemperature <em>Water Temperature</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.PoolImpl#getLanes <em>Lanes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoolImpl extends AssetImpl implements Pool {
	/**
	 * The default value of the '{@link #getPoolType() <em>Pool Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolType()
	 * @generated
	 * @ordered
	 */
	protected static final PoolType POOL_TYPE_EDEFAULT = PoolType.SWIMMER;

	/**
	 * The cached value of the '{@link #getPoolType() <em>Pool Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolType()
	 * @generated
	 * @ordered
	 */
	protected PoolType poolType = POOL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepthMin() <em>Depth Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthMin()
	 * @generated
	 * @ordered
	 */
	protected static final double DEPTH_MIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDepthMin() <em>Depth Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthMin()
	 * @generated
	 * @ordered
	 */
	protected double depthMin = DEPTH_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepthMax() <em>Depth Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthMax()
	 * @generated
	 * @ordered
	 */
	protected static final double DEPTH_MAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDepthMax() <em>Depth Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthMax()
	 * @generated
	 * @ordered
	 */
	protected double depthMax = DEPTH_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaterTemperature() <em>Water Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final double WATER_TEMPERATURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWaterTemperature() <em>Water Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterTemperature()
	 * @generated
	 * @ordered
	 */
	protected double waterTemperature = WATER_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanes() <em>Lanes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanes()
	 * @generated
	 * @ordered
	 */
	protected static final int LANES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLanes() <em>Lanes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanes()
	 * @generated
	 * @ordered
	 */
	protected int lanes = LANES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BathPackage.Literals.POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PoolType getPoolType() {
		return poolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoolType(PoolType newPoolType) {
		PoolType oldPoolType = poolType;
		poolType = newPoolType == null ? POOL_TYPE_EDEFAULT : newPoolType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.POOL__POOL_TYPE, oldPoolType, poolType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDepthMin() {
		return depthMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepthMin(double newDepthMin) {
		double oldDepthMin = depthMin;
		depthMin = newDepthMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.POOL__DEPTH_MIN, oldDepthMin, depthMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDepthMax() {
		return depthMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepthMax(double newDepthMax) {
		double oldDepthMax = depthMax;
		depthMax = newDepthMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.POOL__DEPTH_MAX, oldDepthMax, depthMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWaterTemperature() {
		return waterTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaterTemperature(double newWaterTemperature) {
		double oldWaterTemperature = waterTemperature;
		waterTemperature = newWaterTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.POOL__WATER_TEMPERATURE, oldWaterTemperature, waterTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLanes() {
		return lanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanes(int newLanes) {
		int oldLanes = lanes;
		lanes = newLanes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.POOL__LANES, oldLanes, lanes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BathPackage.POOL__POOL_TYPE:
				return getPoolType();
			case BathPackage.POOL__DEPTH_MIN:
				return getDepthMin();
			case BathPackage.POOL__DEPTH_MAX:
				return getDepthMax();
			case BathPackage.POOL__WATER_TEMPERATURE:
				return getWaterTemperature();
			case BathPackage.POOL__LANES:
				return getLanes();
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
			case BathPackage.POOL__POOL_TYPE:
				setPoolType((PoolType)newValue);
				return;
			case BathPackage.POOL__DEPTH_MIN:
				setDepthMin((Double)newValue);
				return;
			case BathPackage.POOL__DEPTH_MAX:
				setDepthMax((Double)newValue);
				return;
			case BathPackage.POOL__WATER_TEMPERATURE:
				setWaterTemperature((Double)newValue);
				return;
			case BathPackage.POOL__LANES:
				setLanes((Integer)newValue);
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
			case BathPackage.POOL__POOL_TYPE:
				setPoolType(POOL_TYPE_EDEFAULT);
				return;
			case BathPackage.POOL__DEPTH_MIN:
				setDepthMin(DEPTH_MIN_EDEFAULT);
				return;
			case BathPackage.POOL__DEPTH_MAX:
				setDepthMax(DEPTH_MAX_EDEFAULT);
				return;
			case BathPackage.POOL__WATER_TEMPERATURE:
				setWaterTemperature(WATER_TEMPERATURE_EDEFAULT);
				return;
			case BathPackage.POOL__LANES:
				setLanes(LANES_EDEFAULT);
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
			case BathPackage.POOL__POOL_TYPE:
				return poolType != POOL_TYPE_EDEFAULT;
			case BathPackage.POOL__DEPTH_MIN:
				return depthMin != DEPTH_MIN_EDEFAULT;
			case BathPackage.POOL__DEPTH_MAX:
				return depthMax != DEPTH_MAX_EDEFAULT;
			case BathPackage.POOL__WATER_TEMPERATURE:
				return waterTemperature != WATER_TEMPERATURE_EDEFAULT;
			case BathPackage.POOL__LANES:
				return lanes != LANES_EDEFAULT;
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
		result.append(" (poolType: ");
		result.append(poolType);
		result.append(", depthMin: ");
		result.append(depthMin);
		result.append(", depthMax: ");
		result.append(depthMax);
		result.append(", waterTemperature: ");
		result.append(waterTemperature);
		result.append(", lanes: ");
		result.append(lanes);
		result.append(')');
		return result.toString();
	}

} //PoolImpl
