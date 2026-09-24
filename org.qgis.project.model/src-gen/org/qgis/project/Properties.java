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
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The project properties used here.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.Properties#getSpatialRefSys <em>Spatial Ref Sys</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getProperties()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Properties extends EObject {
	/**
	 * Returns the value of the '<em><b>Spatial Ref Sys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Ref Sys</em>' containment reference.
	 * @see #setSpatialRefSys(SpatialRefSysProperties)
	 * @see org.qgis.project.QgisPackage#getProperties_SpatialRefSys()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SpatialRefSys'"
	 * @generated
	 */
	SpatialRefSysProperties getSpatialRefSys();

	/**
	 * Sets the value of the '{@link org.qgis.project.Properties#getSpatialRefSys <em>Spatial Ref Sys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spatial Ref Sys</em>' containment reference.
	 * @see #getSpatialRefSys()
	 * @generated
	 */
	void setSpatialRefSys(SpatialRefSysProperties value);

} // Properties
