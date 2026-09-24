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
package org.qgis.project;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An element holding a CRS, e.g. projectCrs or srs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.Crs#getSpatialRefSys <em>Spatial Ref Sys</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getCrs()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Crs extends EObject {
	/**
	 * Returns the value of the '<em><b>Spatial Ref Sys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Ref Sys</em>' containment reference.
	 * @see #setSpatialRefSys(SpatialRefSys)
	 * @see org.qgis.project.QgisPackage#getCrs_SpatialRefSys()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spatialrefsys'"
	 * @generated
	 */
	SpatialRefSys getSpatialRefSys();

	/**
	 * Sets the value of the '{@link org.qgis.project.Crs#getSpatialRefSys <em>Spatial Ref Sys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spatial Ref Sys</em>' containment reference.
	 * @see #getSpatialRefSys()
	 * @generated
	 */
	void setSpatialRefSys(SpatialRefSys value);

} // Crs
