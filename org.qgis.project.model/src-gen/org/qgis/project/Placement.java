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
 * A representation of the model object '<em><b>Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Where labels go.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.Placement#getPlacement <em>Placement</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getPlacement()
 * @model extendedMetaData="kind='empty'"
 * @generated
 */
@ProviderType
public interface Placement extends EObject {
	/**
	 * Returns the value of the '<em><b>Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 0 around point, 1 over point, 2 along line ...
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Placement</em>' attribute.
	 * @see #setPlacement(String)
	 * @see org.qgis.project.QgisPackage#getPlacement_Placement()
	 * @model extendedMetaData="kind='attribute' name='placement'"
	 * @generated
	 */
	String getPlacement();

	/**
	 * Sets the value of the '{@link org.qgis.project.Placement#getPlacement <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' attribute.
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(String value);

} // Placement
