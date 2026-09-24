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
package org.eclipse.fennec.ogc.features.example.bath;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A pool.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Pool#getPoolType <em>Pool Type</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Pool#getDepthMin <em>Depth Min</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Pool#getDepthMax <em>Depth Max</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Pool#getWaterTemperature <em>Water Temperature</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Pool#getLanes <em>Lanes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getPool()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='pools' title='Becken' layerGroup='Wasser' style='#1e88e5'"
 * @generated
 */
@ProviderType
public interface Pool extends Asset {
	/**
	 * Returns the value of the '<em><b>Pool Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.ogc.features.example.bath.PoolType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool Type</em>' attribute.
	 * @see org.eclipse.fennec.ogc.features.example.bath.PoolType
	 * @see #setPoolType(PoolType)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getPool_PoolType()
	 * @model
	 * @generated
	 */
	PoolType getPoolType();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Pool#getPoolType <em>Pool Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Type</em>' attribute.
	 * @see org.eclipse.fennec.ogc.features.example.bath.PoolType
	 * @see #getPoolType()
	 * @generated
	 */
	void setPoolType(PoolType value);

	/**
	 * Returns the value of the '<em><b>Depth Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum water depth in metres.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depth Min</em>' attribute.
	 * @see #setDepthMin(double)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getPool_DepthMin()
	 * @model
	 * @generated
	 */
	double getDepthMin();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Pool#getDepthMin <em>Depth Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth Min</em>' attribute.
	 * @see #getDepthMin()
	 * @generated
	 */
	void setDepthMin(double value);

	/**
	 * Returns the value of the '<em><b>Depth Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum water depth in metres.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depth Max</em>' attribute.
	 * @see #setDepthMax(double)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getPool_DepthMax()
	 * @model
	 * @generated
	 */
	double getDepthMax();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Pool#getDepthMax <em>Depth Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth Max</em>' attribute.
	 * @see #getDepthMax()
	 * @generated
	 */
	void setDepthMax(double value);

	/**
	 * Returns the value of the '<em><b>Water Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Water temperature in °C.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Water Temperature</em>' attribute.
	 * @see #setWaterTemperature(double)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getPool_WaterTemperature()
	 * @model
	 * @generated
	 */
	double getWaterTemperature();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Pool#getWaterTemperature <em>Water Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Temperature</em>' attribute.
	 * @see #getWaterTemperature()
	 * @generated
	 */
	void setWaterTemperature(double value);

	/**
	 * Returns the value of the '<em><b>Lanes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of swimming lanes, 0 if none.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lanes</em>' attribute.
	 * @see #setLanes(int)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getPool_Lanes()
	 * @model
	 * @generated
	 */
	int getLanes();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Pool#getLanes <em>Lanes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lanes</em>' attribute.
	 * @see #getLanes()
	 * @generated
	 */
	void setLanes(int value);

} // Pool
