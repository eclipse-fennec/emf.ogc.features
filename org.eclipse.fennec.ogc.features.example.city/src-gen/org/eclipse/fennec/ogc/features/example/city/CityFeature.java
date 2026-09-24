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
package org.eclipse.fennec.ogc.features.example.city;

import org.eclipse.emf.ecore.EObject;

import org.geojson.Geometry;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A feature of the generated town Dim Stadt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getMinX <em>Min X</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getMinY <em>Min Y</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getMaxX <em>Max X</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getMaxY <em>Max Y</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getCityFeature()
 * @model abstract="true"
 *        annotation="https://eclipse.org/fennec/persistence inheritance='SINGLE_TABLE'"
 *        annotation="https://eclipse.org/fennec/ogc/features geometry='geometry' bbox='minX,minY,maxX,maxY'"
 * @generated
 */
@ProviderType
public interface CityFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feature id of the source data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getCityFeature_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getCityFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geometry in CRS84.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry</em>' attribute.
	 * @see #setGeometry(Geometry)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getCityFeature_Geometry()
	 * @model dataType="org.eclipse.fennec.ogc.features.example.city.GeoJsonGeometry"
	 * @generated
	 */
	Geometry getGeometry();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getGeometry <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' attribute.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(Geometry value);

	/**
	 * Returns the value of the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min X</em>' attribute.
	 * @see #setMinX(double)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getCityFeature_MinX()
	 * @model
	 * @generated
	 */
	double getMinX();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getMinX <em>Min X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min X</em>' attribute.
	 * @see #getMinX()
	 * @generated
	 */
	void setMinX(double value);

	/**
	 * Returns the value of the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Y</em>' attribute.
	 * @see #setMinY(double)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getCityFeature_MinY()
	 * @model
	 * @generated
	 */
	double getMinY();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getMinY <em>Min Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Y</em>' attribute.
	 * @see #getMinY()
	 * @generated
	 */
	void setMinY(double value);

	/**
	 * Returns the value of the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max X</em>' attribute.
	 * @see #setMaxX(double)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getCityFeature_MaxX()
	 * @model
	 * @generated
	 */
	double getMaxX();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getMaxX <em>Max X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max X</em>' attribute.
	 * @see #getMaxX()
	 * @generated
	 */
	void setMaxX(double value);

	/**
	 * Returns the value of the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Y</em>' attribute.
	 * @see #setMaxY(double)
	 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage#getCityFeature_MaxY()
	 * @model
	 * @generated
	 */
	double getMaxY();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.city.CityFeature#getMaxY <em>Max Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Y</em>' attribute.
	 * @see #getMaxY()
	 * @generated
	 */
	void setMaxY(double value);

} // CityFeature
