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
 * A representation of the model object '<em><b>Project View Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * View settings of the project.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.ProjectViewSettings#getUseProjectScales <em>Use Project Scales</em>}</li>
 *   <li>{@link org.qgis.project.ProjectViewSettings#getRotation <em>Rotation</em>}</li>
 *   <li>{@link org.qgis.project.ProjectViewSettings#getDefaultViewExtent <em>Default View Extent</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getProjectViewSettings()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ProjectViewSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Use Project Scales</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Project Scales</em>' attribute.
	 * @see #setUseProjectScales(String)
	 * @see org.qgis.project.QgisPackage#getProjectViewSettings_UseProjectScales()
	 * @model extendedMetaData="kind='attribute' name='UseProjectScales'"
	 * @generated
	 */
	String getUseProjectScales();

	/**
	 * Sets the value of the '{@link org.qgis.project.ProjectViewSettings#getUseProjectScales <em>Use Project Scales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Project Scales</em>' attribute.
	 * @see #getUseProjectScales()
	 * @generated
	 */
	void setUseProjectScales(String value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(String)
	 * @see org.qgis.project.QgisPackage#getProjectViewSettings_Rotation()
	 * @model extendedMetaData="kind='attribute' name='rotation'"
	 * @generated
	 */
	String getRotation();

	/**
	 * Sets the value of the '{@link org.qgis.project.ProjectViewSettings#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(String value);

	/**
	 * Returns the value of the '<em><b>Default View Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The extent a new view of the project shows.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default View Extent</em>' containment reference.
	 * @see #setDefaultViewExtent(Extent)
	 * @see org.qgis.project.QgisPackage#getProjectViewSettings_DefaultViewExtent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DefaultViewExtent'"
	 * @generated
	 */
	Extent getDefaultViewExtent();

	/**
	 * Sets the value of the '{@link org.qgis.project.ProjectViewSettings#getDefaultViewExtent <em>Default View Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default View Extent</em>' containment reference.
	 * @see #getDefaultViewExtent()
	 * @generated
	 */
	void setDefaultViewExtent(Extent value);

} // ProjectViewSettings
