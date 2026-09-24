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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Layers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The map layers of the project.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.ProjectLayers#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getProjectLayers()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ProjectLayers extends EObject {
	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link org.qgis.project.MapLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see org.qgis.project.QgisPackage#getProjectLayers_Layers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maplayer'"
	 * @generated
	 */
	EList<MapLayer> getLayers();

} // ProjectLayers
