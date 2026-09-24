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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.qgis.project.QgisPackage
 * @generated
 */
@ProviderType
public interface QgisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QgisFactory eINSTANCE = org.qgis.project.impl.QgisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Crs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crs</em>'.
	 * @generated
	 */
	Crs createCrs();

	/**
	 * Returns a new object of class '<em>Spatial Ref Sys</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spatial Ref Sys</em>'.
	 * @generated
	 */
	SpatialRefSys createSpatialRefSys();

	/**
	 * Returns a new object of class '<em>Layer Tree Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Tree Group</em>'.
	 * @generated
	 */
	LayerTreeGroup createLayerTreeGroup();

	/**
	 * Returns a new object of class '<em>Layer Tree Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Tree Layer</em>'.
	 * @generated
	 */
	LayerTreeLayer createLayerTreeLayer();

	/**
	 * Returns a new object of class '<em>Custom Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Order</em>'.
	 * @generated
	 */
	CustomOrder createCustomOrder();

	/**
	 * Returns a new object of class '<em>Project Layers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Layers</em>'.
	 * @generated
	 */
	ProjectLayers createProjectLayers();

	/**
	 * Returns a new object of class '<em>Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Layer</em>'.
	 * @generated
	 */
	MapLayer createMapLayer();

	/**
	 * Returns a new object of class '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider</em>'.
	 * @generated
	 */
	Provider createProvider();

	/**
	 * Returns a new object of class '<em>Renderer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Renderer</em>'.
	 * @generated
	 */
	Renderer createRenderer();

	/**
	 * Returns a new object of class '<em>Symbols</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbols</em>'.
	 * @generated
	 */
	Symbols createSymbols();

	/**
	 * Returns a new object of class '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbol</em>'.
	 * @generated
	 */
	Symbol createSymbol();

	/**
	 * Returns a new object of class '<em>Symbol Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbol Layer</em>'.
	 * @generated
	 */
	SymbolLayer createSymbolLayer();

	/**
	 * Returns a new object of class '<em>Data Defined Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Defined Properties</em>'.
	 * @generated
	 */
	DataDefinedProperties createDataDefinedProperties();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>Labeling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labeling</em>'.
	 * @generated
	 */
	Labeling createLabeling();

	/**
	 * Returns a new object of class '<em>Label Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Settings</em>'.
	 * @generated
	 */
	LabelSettings createLabelSettings();

	/**
	 * Returns a new object of class '<em>Text Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Style</em>'.
	 * @generated
	 */
	TextStyle createTextStyle();

	/**
	 * Returns a new object of class '<em>Text Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Buffer</em>'.
	 * @generated
	 */
	TextBuffer createTextBuffer();

	/**
	 * Returns a new object of class '<em>Placement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Placement</em>'.
	 * @generated
	 */
	Placement createPlacement();

	/**
	 * Returns a new object of class '<em>Rendering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rendering</em>'.
	 * @generated
	 */
	Rendering createRendering();

	/**
	 * Returns a new object of class '<em>Layer Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Order</em>'.
	 * @generated
	 */
	LayerOrder createLayerOrder();

	/**
	 * Returns a new object of class '<em>Layer Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Ref</em>'.
	 * @generated
	 */
	LayerRef createLayerRef();

	/**
	 * Returns a new object of class '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties</em>'.
	 * @generated
	 */
	Properties createProperties();

	/**
	 * Returns a new object of class '<em>Spatial Ref Sys Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spatial Ref Sys Properties</em>'.
	 * @generated
	 */
	SpatialRefSysProperties createSpatialRefSysProperties();

	/**
	 * Returns a new object of class '<em>Typed Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Value</em>'.
	 * @generated
	 */
	TypedValue createTypedValue();

	/**
	 * Returns a new object of class '<em>Project View Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project View Settings</em>'.
	 * @generated
	 */
	ProjectViewSettings createProjectViewSettings();

	/**
	 * Returns a new object of class '<em>Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extent</em>'.
	 * @generated
	 */
	Extent createExtent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QgisPackage getQgisPackage();

} //QgisFactory
