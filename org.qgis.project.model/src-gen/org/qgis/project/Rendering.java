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
 * A representation of the model object '<em><b>Rendering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * When labels are drawn.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.Rendering#getScaleVisibility <em>Scale Visibility</em>}</li>
 *   <li>{@link org.qgis.project.Rendering#getScaleMin <em>Scale Min</em>}</li>
 *   <li>{@link org.qgis.project.Rendering#getScaleMax <em>Scale Max</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getRendering()
 * @model extendedMetaData="kind='empty'"
 * @generated
 */
@ProviderType
public interface Rendering extends EObject {
	/**
	 * Returns the value of the '<em><b>Scale Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Visibility</em>' attribute.
	 * @see #setScaleVisibility(String)
	 * @see org.qgis.project.QgisPackage#getRendering_ScaleVisibility()
	 * @model extendedMetaData="kind='attribute' name='scaleVisibility'"
	 * @generated
	 */
	String getScaleVisibility();

	/**
	 * Sets the value of the '{@link org.qgis.project.Rendering#getScaleVisibility <em>Scale Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Visibility</em>' attribute.
	 * @see #getScaleVisibility()
	 * @generated
	 */
	void setScaleVisibility(String value);

	/**
	 * Returns the value of the '<em><b>Scale Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Labels from this scale denominator on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scale Min</em>' attribute.
	 * @see #setScaleMin(String)
	 * @see org.qgis.project.QgisPackage#getRendering_ScaleMin()
	 * @model extendedMetaData="kind='attribute' name='scaleMin'"
	 * @generated
	 */
	String getScaleMin();

	/**
	 * Sets the value of the '{@link org.qgis.project.Rendering#getScaleMin <em>Scale Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Min</em>' attribute.
	 * @see #getScaleMin()
	 * @generated
	 */
	void setScaleMin(String value);

	/**
	 * Returns the value of the '<em><b>Scale Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Max</em>' attribute.
	 * @see #setScaleMax(String)
	 * @see org.qgis.project.QgisPackage#getRendering_ScaleMax()
	 * @model extendedMetaData="kind='attribute' name='scaleMax'"
	 * @generated
	 */
	String getScaleMax();

	/**
	 * Sets the value of the '{@link org.qgis.project.Rendering#getScaleMax <em>Scale Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Max</em>' attribute.
	 * @see #getScaleMax()
	 * @generated
	 */
	void setScaleMax(String value);

} // Rendering
