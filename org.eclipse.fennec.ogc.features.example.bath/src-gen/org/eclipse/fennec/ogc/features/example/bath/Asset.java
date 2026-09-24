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

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

import org.geojson.Geometry;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An asset of the leisure pool that has a location.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getMinX <em>Min X</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getMinY <em>Min Y</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getMaxX <em>Max X</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getMaxY <em>Max Y</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getLevel <em>Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Asset#isAccessible <em>Accessible</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getLastInspection <em>Last Inspection</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getAsset()
 * @model abstract="true"
 *        annotation="https://eclipse.org/fennec/persistence inheritance='SINGLE_TABLE'"
 *        annotation="https://eclipse.org/fennec/ogc/features collection='true' id='assets' title='Alle Anlagen' description='Alle Anlagen des Freizeitbads' geometry='geometry' bbox='minX,minY,maxX,maxY' temporal='lastInspection'"
 * @generated
 */
@ProviderType
public interface Asset extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stable identifier of the asset, also the OGC feature id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getAsset_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getId <em>Id</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * Display name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getAsset_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getAsset_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location of the asset as GeoJSON geometry in CRS84 (longitude, latitude).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry</em>' attribute.
	 * @see #setGeometry(Geometry)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getAsset_Geometry()
	 * @model dataType="org.eclipse.fennec.ogc.features.example.bath.GeoJsonGeometry"
	 * @generated
	 */
	Geometry getGeometry();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getGeometry <em>Geometry</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * Bounding box, western edge. Derived from the geometry when the asset is stored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min X</em>' attribute.
	 * @see #setMinX(double)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getAsset_MinX()
	 * @model
	 * @generated
	 */
	double getMinX();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getMinX <em>Min X</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * Bounding box, southern edge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Y</em>' attribute.
	 * @see #setMinY(double)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getAsset_MinY()
	 * @model
	 * @generated
	 */
	double getMinY();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getMinY <em>Min Y</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * Bounding box, eastern edge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max X</em>' attribute.
	 * @see #setMaxX(double)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getAsset_MaxX()
	 * @model
	 * @generated
	 */
	double getMaxX();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getMaxX <em>Max X</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * Bounding box, northern edge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Y</em>' attribute.
	 * @see #setMaxY(double)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getAsset_MaxY()
	 * @model
	 * @generated
	 */
	double getMaxY();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getMaxY <em>Max Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Y</em>' attribute.
	 * @see #getMaxY()
	 * @generated
	 */
	void setMaxY(double value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.ogc.features.example.bath.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Level
	 * @see #setLevel(Level)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getAsset_Level()
	 * @model
	 * @generated
	 */
	Level getLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Level
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.ogc.features.example.bath.OperationalStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.fennec.ogc.features.example.bath.OperationalStatus
	 * @see #setStatus(OperationalStatus)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getAsset_Status()
	 * @model
	 * @generated
	 */
	OperationalStatus getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.fennec.ogc.features.example.bath.OperationalStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(OperationalStatus value);

	/**
	 * Returns the value of the '<em><b>Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Barrier-free access.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accessible</em>' attribute.
	 * @see #setAccessible(boolean)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getAsset_Accessible()
	 * @model
	 * @generated
	 */
	boolean isAccessible();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#isAccessible <em>Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessible</em>' attribute.
	 * @see #isAccessible()
	 * @generated
	 */
	void setAccessible(boolean value);

	/**
	 * Returns the value of the '<em><b>Last Inspection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of the last safety inspection, the temporal property of the feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Inspection</em>' attribute.
	 * @see #setLastInspection(Date)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getAsset_LastInspection()
	 * @model
	 * @generated
	 */
	Date getLastInspection();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Asset#getLastInspection <em>Last Inspection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Inspection</em>' attribute.
	 * @see #getLastInspection()
	 * @generated
	 */
	void setLastInspection(Date value);

} // Asset
