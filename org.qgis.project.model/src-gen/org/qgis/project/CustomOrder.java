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
 * A representation of the model object '<em><b>Custom Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A drawing order that differs from the layer tree, top first.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.CustomOrder#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.qgis.project.CustomOrder#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getCustomOrder()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CustomOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(String)
	 * @see org.qgis.project.QgisPackage#getCustomOrder_Enabled()
	 * @model extendedMetaData="kind='attribute' name='enabled'"
	 * @generated
	 */
	String getEnabled();

	/**
	 * Sets the value of the '{@link org.qgis.project.CustomOrder#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Map layer ids.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Items</em>' attribute list.
	 * @see org.qgis.project.QgisPackage#getCustomOrder_Items()
	 * @model extendedMetaData="kind='element' name='item'"
	 * @generated
	 */
	EList<String> getItems();

} // CustomOrder
