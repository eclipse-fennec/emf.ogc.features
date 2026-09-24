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
 * A representation of the model object '<em><b>Spatial Ref Sys Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CRS properties of the project.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.SpatialRefSysProperties#getProjectionsEnabled <em>Projections Enabled</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getSpatialRefSysProperties()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SpatialRefSysProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Projections Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * QGIS reads the project CRS only with 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Projections Enabled</em>' containment reference.
	 * @see #setProjectionsEnabled(TypedValue)
	 * @see org.qgis.project.QgisPackage#getSpatialRefSysProperties_ProjectionsEnabled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProjectionsEnabled'"
	 * @generated
	 */
	TypedValue getProjectionsEnabled();

	/**
	 * Sets the value of the '{@link org.qgis.project.SpatialRefSysProperties#getProjectionsEnabled <em>Projections Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projections Enabled</em>' containment reference.
	 * @see #getProjectionsEnabled()
	 * @generated
	 */
	void setProjectionsEnabled(TypedValue value);

} // SpatialRefSysProperties
