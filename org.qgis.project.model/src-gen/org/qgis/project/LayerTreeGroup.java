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
 * A representation of the model object '<em><b>Layer Tree Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A folder of the layer tree; groups are written before layers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.LayerTreeGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.qgis.project.LayerTreeGroup#getChecked <em>Checked</em>}</li>
 *   <li>{@link org.qgis.project.LayerTreeGroup#getExpanded <em>Expanded</em>}</li>
 *   <li>{@link org.qgis.project.LayerTreeGroup#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.qgis.project.LayerTreeGroup#getLayers <em>Layers</em>}</li>
 *   <li>{@link org.qgis.project.LayerTreeGroup#getCustomOrder <em>Custom Order</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getLayerTreeGroup()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LayerTreeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.qgis.project.QgisPackage#getLayerTreeGroup_Name()
	 * @model extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.qgis.project.LayerTreeGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Checked</b></em>' attribute.
	 * The literals are from the enumeration {@link org.qgis.project.CheckState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked</em>' attribute.
	 * @see org.qgis.project.CheckState
	 * @see #isSetChecked()
	 * @see #unsetChecked()
	 * @see #setChecked(CheckState)
	 * @see org.qgis.project.QgisPackage#getLayerTreeGroup_Checked()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='checked'"
	 * @generated
	 */
	CheckState getChecked();

	/**
	 * Sets the value of the '{@link org.qgis.project.LayerTreeGroup#getChecked <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked</em>' attribute.
	 * @see org.qgis.project.CheckState
	 * @see #isSetChecked()
	 * @see #unsetChecked()
	 * @see #getChecked()
	 * @generated
	 */
	void setChecked(CheckState value);

	/**
	 * Unsets the value of the '{@link org.qgis.project.LayerTreeGroup#getChecked <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChecked()
	 * @see #getChecked()
	 * @see #setChecked(CheckState)
	 * @generated
	 */
	void unsetChecked();

	/**
	 * Returns whether the value of the '{@link org.qgis.project.LayerTreeGroup#getChecked <em>Checked</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Checked</em>' attribute is set.
	 * @see #unsetChecked()
	 * @see #getChecked()
	 * @see #setChecked(CheckState)
	 * @generated
	 */
	boolean isSetChecked();

	/**
	 * Returns the value of the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expanded</em>' attribute.
	 * @see #setExpanded(String)
	 * @see org.qgis.project.QgisPackage#getLayerTreeGroup_Expanded()
	 * @model extendedMetaData="kind='attribute' name='expanded'"
	 * @generated
	 */
	String getExpanded();

	/**
	 * Sets the value of the '{@link org.qgis.project.LayerTreeGroup#getExpanded <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expanded</em>' attribute.
	 * @see #getExpanded()
	 * @generated
	 */
	void setExpanded(String value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.qgis.project.LayerTreeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see org.qgis.project.QgisPackage#getLayerTreeGroup_Groups()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='layer-tree-group'"
	 * @generated
	 */
	EList<LayerTreeGroup> getGroups();

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link org.qgis.project.LayerTreeLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see org.qgis.project.QgisPackage#getLayerTreeGroup_Layers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='layer-tree-layer'"
	 * @generated
	 */
	EList<LayerTreeLayer> getLayers();

	/**
	 * Returns the value of the '<em><b>Custom Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The drawing order, top first; only on the root group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Order</em>' containment reference.
	 * @see #setCustomOrder(CustomOrder)
	 * @see org.qgis.project.QgisPackage#getLayerTreeGroup_CustomOrder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='custom-order'"
	 * @generated
	 */
	CustomOrder getCustomOrder();

	/**
	 * Sets the value of the '{@link org.qgis.project.LayerTreeGroup#getCustomOrder <em>Custom Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Order</em>' containment reference.
	 * @see #getCustomOrder()
	 * @generated
	 */
	void setCustomOrder(CustomOrder value);

} // LayerTreeGroup
