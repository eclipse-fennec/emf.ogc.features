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
 * A representation of the model object '<em><b>Symbol Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A symbol layer, e.g. SimpleFill, SimpleLine or SimpleMarker.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.SymbolLayer#getLayerClass <em>Layer Class</em>}</li>
 *   <li>{@link org.qgis.project.SymbolLayer#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.qgis.project.SymbolLayer#getLocked <em>Locked</em>}</li>
 *   <li>{@link org.qgis.project.SymbolLayer#getPass <em>Pass</em>}</li>
 *   <li>{@link org.qgis.project.SymbolLayer#getOptions <em>Options</em>}</li>
 *   <li>{@link org.qgis.project.SymbolLayer#getDataDefinedProperties <em>Data Defined Properties</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getSymbolLayer()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SymbolLayer extends EObject {
	/**
	 * Returns the value of the '<em><b>Layer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The symbol layer type, e.g. SimpleFill.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layer Class</em>' attribute.
	 * @see #setLayerClass(String)
	 * @see org.qgis.project.QgisPackage#getSymbolLayer_LayerClass()
	 * @model extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getLayerClass();

	/**
	 * Sets the value of the '{@link org.qgis.project.SymbolLayer#getLayerClass <em>Layer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Class</em>' attribute.
	 * @see #getLayerClass()
	 * @generated
	 */
	void setLayerClass(String value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(String)
	 * @see org.qgis.project.QgisPackage#getSymbolLayer_Enabled()
	 * @model extendedMetaData="kind='attribute' name='enabled'"
	 * @generated
	 */
	String getEnabled();

	/**
	 * Sets the value of the '{@link org.qgis.project.SymbolLayer#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #setLocked(String)
	 * @see org.qgis.project.QgisPackage#getSymbolLayer_Locked()
	 * @model extendedMetaData="kind='attribute' name='locked'"
	 * @generated
	 */
	String getLocked();

	/**
	 * Sets the value of the '{@link org.qgis.project.SymbolLayer#getLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #getLocked()
	 * @generated
	 */
	void setLocked(String value);

	/**
	 * Returns the value of the '<em><b>Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass</em>' attribute.
	 * @see #setPass(String)
	 * @see org.qgis.project.QgisPackage#getSymbolLayer_Pass()
	 * @model extendedMetaData="kind='attribute' name='pass'"
	 * @generated
	 */
	String getPass();

	/**
	 * Sets the value of the '{@link org.qgis.project.SymbolLayer#getPass <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass</em>' attribute.
	 * @see #getPass()
	 * @generated
	 */
	void setPass(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The properties, a map of options.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(Option)
	 * @see org.qgis.project.QgisPackage#getSymbolLayer_Options()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Option'"
	 * @generated
	 */
	Option getOptions();

	/**
	 * Sets the value of the '{@link org.qgis.project.SymbolLayer#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Option value);

	/**
	 * Returns the value of the '<em><b>Data Defined Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Defined Properties</em>' containment reference.
	 * @see #setDataDefinedProperties(DataDefinedProperties)
	 * @see org.qgis.project.QgisPackage#getSymbolLayer_DataDefinedProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data_defined_properties'"
	 * @generated
	 */
	DataDefinedProperties getDataDefinedProperties();

	/**
	 * Sets the value of the '{@link org.qgis.project.SymbolLayer#getDataDefinedProperties <em>Data Defined Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Defined Properties</em>' containment reference.
	 * @see #getDataDefinedProperties()
	 * @generated
	 */
	void setDataDefinedProperties(DataDefinedProperties value);

} // SymbolLayer
