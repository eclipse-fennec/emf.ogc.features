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
 * A representation of the model object '<em><b>Layer Tree Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A layer in the layer tree, referring to a map layer by id.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.LayerTreeLayer#getId <em>Id</em>}</li>
 *   <li>{@link org.qgis.project.LayerTreeLayer#getName <em>Name</em>}</li>
 *   <li>{@link org.qgis.project.LayerTreeLayer#getProviderKey <em>Provider Key</em>}</li>
 *   <li>{@link org.qgis.project.LayerTreeLayer#getSource <em>Source</em>}</li>
 *   <li>{@link org.qgis.project.LayerTreeLayer#getChecked <em>Checked</em>}</li>
 *   <li>{@link org.qgis.project.LayerTreeLayer#getExpanded <em>Expanded</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getLayerTreeLayer()
 * @model extendedMetaData="kind='empty'"
 * @generated
 */
@ProviderType
public interface LayerTreeLayer extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.qgis.project.QgisPackage#getLayerTreeLayer_Id()
	 * @model extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.qgis.project.LayerTreeLayer#getId <em>Id</em>}' attribute.
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
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.qgis.project.QgisPackage#getLayerTreeLayer_Name()
	 * @model extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.qgis.project.LayerTreeLayer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provider Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Key</em>' attribute.
	 * @see #setProviderKey(String)
	 * @see org.qgis.project.QgisPackage#getLayerTreeLayer_ProviderKey()
	 * @model extendedMetaData="kind='attribute' name='providerKey'"
	 * @generated
	 */
	String getProviderKey();

	/**
	 * Sets the value of the '{@link org.qgis.project.LayerTreeLayer#getProviderKey <em>Provider Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Key</em>' attribute.
	 * @see #getProviderKey()
	 * @generated
	 */
	void setProviderKey(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.qgis.project.QgisPackage#getLayerTreeLayer_Source()
	 * @model extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.qgis.project.LayerTreeLayer#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

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
	 * @see org.qgis.project.QgisPackage#getLayerTreeLayer_Checked()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='checked'"
	 * @generated
	 */
	CheckState getChecked();

	/**
	 * Sets the value of the '{@link org.qgis.project.LayerTreeLayer#getChecked <em>Checked</em>}' attribute.
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
	 * Unsets the value of the '{@link org.qgis.project.LayerTreeLayer#getChecked <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChecked()
	 * @see #getChecked()
	 * @see #setChecked(CheckState)
	 * @generated
	 */
	void unsetChecked();

	/**
	 * Returns whether the value of the '{@link org.qgis.project.LayerTreeLayer#getChecked <em>Checked</em>}' attribute is set.
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
	 * @see org.qgis.project.QgisPackage#getLayerTreeLayer_Expanded()
	 * @model extendedMetaData="kind='attribute' name='expanded'"
	 * @generated
	 */
	String getExpanded();

	/**
	 * Sets the value of the '{@link org.qgis.project.LayerTreeLayer#getExpanded <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expanded</em>' attribute.
	 * @see #getExpanded()
	 * @generated
	 */
	void setExpanded(String value);

} // LayerTreeLayer
