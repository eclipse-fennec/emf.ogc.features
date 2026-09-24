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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.fennec.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The part of the QGIS project file (.qgs) that Fennec OGC Features writes, modelled from the files QGIS 3 writes itself: there is no current schema of the format. The nsURI is not an official QGIS namespace; the file has none, elements are unqualified.
 * <!-- end-model-doc -->
 * @see org.qgis.project.QgisFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
@ProviderType
@EPackage(uri = QgisPackage.eNS_URI, fingerprint = "fp1:7da790399d3aea359c4b664a8d85406189d7d02c083eaaed549c5baa2b18f6e0", genModel = "/model/qgis.genmodel", genModelSourceLocations = {"model/qgis.genmodel","org.qgis.project.model/model/qgis.genmodel"}, ecore = "/model/qgis.ecore", ecoreSourceLocations = "/model/qgis.ecore")
public interface QgisPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "project";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://qgis.org/project/3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qgis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QgisPackage eINSTANCE = org.qgis.project.impl.QgisPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.ProjectImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Projectname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECTNAME = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Project Crs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_CRS = 3;

	/**
	 * The feature id for the '<em><b>Layer Tree Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LAYER_TREE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Project Layers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_LAYERS = 5;

	/**
	 * The feature id for the '<em><b>Layer Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LAYER_ORDER = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROPERTIES = 7;

	/**
	 * The feature id for the '<em><b>View Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VIEW_SETTINGS = 8;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.CrsImpl <em>Crs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.CrsImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getCrs()
	 * @generated
	 */
	int CRS = 1;

	/**
	 * The feature id for the '<em><b>Spatial Ref Sys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRS__SPATIAL_REF_SYS = 0;

	/**
	 * The number of structural features of the '<em>Crs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Crs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.SpatialRefSysImpl <em>Spatial Ref Sys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.SpatialRefSysImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getSpatialRefSys()
	 * @generated
	 */
	int SPATIAL_REF_SYS = 2;

	/**
	 * The feature id for the '<em><b>Native Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REF_SYS__NATIVE_FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Wkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REF_SYS__WKT = 1;

	/**
	 * The feature id for the '<em><b>Proj4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REF_SYS__PROJ4 = 2;

	/**
	 * The feature id for the '<em><b>Srsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REF_SYS__SRSID = 3;

	/**
	 * The feature id for the '<em><b>Srid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REF_SYS__SRID = 4;

	/**
	 * The feature id for the '<em><b>Authid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REF_SYS__AUTHID = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REF_SYS__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Projectionacronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REF_SYS__PROJECTIONACRONYM = 7;

	/**
	 * The feature id for the '<em><b>Ellipsoidacronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REF_SYS__ELLIPSOIDACRONYM = 8;

	/**
	 * The feature id for the '<em><b>Geographicflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REF_SYS__GEOGRAPHICFLAG = 9;

	/**
	 * The number of structural features of the '<em>Spatial Ref Sys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REF_SYS_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Spatial Ref Sys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REF_SYS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.LayerTreeGroupImpl <em>Layer Tree Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.LayerTreeGroupImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getLayerTreeGroup()
	 * @generated
	 */
	int LAYER_TREE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TREE_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TREE_GROUP__CHECKED = 1;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TREE_GROUP__EXPANDED = 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TREE_GROUP__GROUPS = 3;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TREE_GROUP__LAYERS = 4;

	/**
	 * The feature id for the '<em><b>Custom Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TREE_GROUP__CUSTOM_ORDER = 5;

	/**
	 * The number of structural features of the '<em>Layer Tree Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TREE_GROUP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Layer Tree Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TREE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.LayerTreeLayerImpl <em>Layer Tree Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.LayerTreeLayerImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getLayerTreeLayer()
	 * @generated
	 */
	int LAYER_TREE_LAYER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TREE_LAYER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TREE_LAYER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Provider Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TREE_LAYER__PROVIDER_KEY = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TREE_LAYER__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TREE_LAYER__CHECKED = 4;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TREE_LAYER__EXPANDED = 5;

	/**
	 * The number of structural features of the '<em>Layer Tree Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TREE_LAYER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Layer Tree Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_TREE_LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.CustomOrderImpl <em>Custom Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.CustomOrderImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getCustomOrder()
	 * @generated
	 */
	int CUSTOM_ORDER = 5;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ORDER__ENABLED = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ORDER__ITEMS = 1;

	/**
	 * The number of structural features of the '<em>Custom Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ORDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Custom Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.ProjectLayersImpl <em>Project Layers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.ProjectLayersImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getProjectLayers()
	 * @generated
	 */
	int PROJECT_LAYERS = 6;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LAYERS__LAYERS = 0;

	/**
	 * The number of structural features of the '<em>Project Layers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LAYERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Project Layers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LAYERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.MapLayerImpl <em>Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.MapLayerImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getMapLayer()
	 * @generated
	 */
	int MAP_LAYER = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER__GEOMETRY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER__ID = 2;

	/**
	 * The feature id for the '<em><b>Datasource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER__DATASOURCE = 3;

	/**
	 * The feature id for the '<em><b>Layername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER__LAYERNAME = 4;

	/**
	 * The feature id for the '<em><b>Srs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER__SRS = 5;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER__PROVIDER = 6;

	/**
	 * The feature id for the '<em><b>Renderer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER__RENDERER = 7;

	/**
	 * The feature id for the '<em><b>Labeling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER__LABELING = 8;

	/**
	 * The number of structural features of the '<em>Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.ProviderImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 8;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__ENCODING = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__KEY = 1;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.RendererImpl <em>Renderer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.RendererImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getRenderer()
	 * @generated
	 */
	int RENDERER = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Symbollevels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER__SYMBOLLEVELS = 1;

	/**
	 * The feature id for the '<em><b>Enableorderby</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER__ENABLEORDERBY = 2;

	/**
	 * The feature id for the '<em><b>Forceraster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER__FORCERASTER = 3;

	/**
	 * The feature id for the '<em><b>Symbols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER__SYMBOLS = 4;

	/**
	 * The number of structural features of the '<em>Renderer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Renderer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.SymbolsImpl <em>Symbols</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.SymbolsImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getSymbols()
	 * @generated
	 */
	int SYMBOLS = 10;

	/**
	 * The feature id for the '<em><b>Symbols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLS__SYMBOLS = 0;

	/**
	 * The number of structural features of the '<em>Symbols</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Symbols</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.SymbolImpl <em>Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.SymbolImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getSymbol()
	 * @generated
	 */
	int SYMBOL = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__ALPHA = 2;

	/**
	 * The feature id for the '<em><b>Clip To Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__CLIP_TO_EXTENT = 3;

	/**
	 * The feature id for the '<em><b>Force Rhr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__FORCE_RHR = 4;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__LAYERS = 5;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.SymbolLayerImpl <em>Symbol Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.SymbolLayerImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getSymbolLayer()
	 * @generated
	 */
	int SYMBOL_LAYER = 12;

	/**
	 * The feature id for the '<em><b>Layer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_LAYER__LAYER_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_LAYER__ENABLED = 1;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_LAYER__LOCKED = 2;

	/**
	 * The feature id for the '<em><b>Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_LAYER__PASS = 3;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_LAYER__OPTIONS = 4;

	/**
	 * The feature id for the '<em><b>Data Defined Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_LAYER__DATA_DEFINED_PROPERTIES = 5;

	/**
	 * The number of structural features of the '<em>Symbol Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_LAYER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Symbol Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.DataDefinedPropertiesImpl <em>Data Defined Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.DataDefinedPropertiesImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getDataDefinedProperties()
	 * @generated
	 */
	int DATA_DEFINED_PROPERTIES = 13;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINED_PROPERTIES__OPTION = 0;

	/**
	 * The number of structural features of the '<em>Data Defined Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINED_PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Defined Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINED_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.OptionImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__OPTIONS = 3;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.LabelingImpl <em>Labeling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.LabelingImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getLabeling()
	 * @generated
	 */
	int LABELING = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELING__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELING__SETTINGS = 1;

	/**
	 * The number of structural features of the '<em>Labeling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Labeling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.LabelSettingsImpl <em>Label Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.LabelSettingsImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getLabelSettings()
	 * @generated
	 */
	int LABEL_SETTINGS = 16;

	/**
	 * The feature id for the '<em><b>Callout Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SETTINGS__CALLOUT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Text Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SETTINGS__TEXT_STYLE = 1;

	/**
	 * The feature id for the '<em><b>Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SETTINGS__PLACEMENT = 2;

	/**
	 * The feature id for the '<em><b>Rendering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SETTINGS__RENDERING = 3;

	/**
	 * The number of structural features of the '<em>Label Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SETTINGS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Label Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.TextStyleImpl <em>Text Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.TextStyleImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getTextStyle()
	 * @generated
	 */
	int TEXT_STYLE = 17;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__FIELD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__IS_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__FONT_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__TEXT_COLOR = 3;

	/**
	 * The feature id for the '<em><b>Text Buffer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__TEXT_BUFFER = 4;

	/**
	 * The number of structural features of the '<em>Text Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Text Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.TextBufferImpl <em>Text Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.TextBufferImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getTextBuffer()
	 * @generated
	 */
	int TEXT_BUFFER = 18;

	/**
	 * The feature id for the '<em><b>Buffer Draw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BUFFER__BUFFER_DRAW = 0;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BUFFER__BUFFER_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Buffer Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BUFFER__BUFFER_COLOR = 2;

	/**
	 * The number of structural features of the '<em>Text Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BUFFER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Text Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BUFFER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.PlacementImpl <em>Placement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.PlacementImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getPlacement()
	 * @generated
	 */
	int PLACEMENT = 19;

	/**
	 * The feature id for the '<em><b>Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT__PLACEMENT = 0;

	/**
	 * The number of structural features of the '<em>Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.RenderingImpl <em>Rendering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.RenderingImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getRendering()
	 * @generated
	 */
	int RENDERING = 20;

	/**
	 * The feature id for the '<em><b>Scale Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__SCALE_VISIBILITY = 0;

	/**
	 * The feature id for the '<em><b>Scale Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__SCALE_MIN = 1;

	/**
	 * The feature id for the '<em><b>Scale Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__SCALE_MAX = 2;

	/**
	 * The number of structural features of the '<em>Rendering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rendering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.LayerOrderImpl <em>Layer Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.LayerOrderImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getLayerOrder()
	 * @generated
	 */
	int LAYER_ORDER = 21;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_ORDER__LAYERS = 0;

	/**
	 * The number of structural features of the '<em>Layer Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_ORDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Layer Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.LayerRefImpl <em>Layer Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.LayerRefImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getLayerRef()
	 * @generated
	 */
	int LAYER_REF = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_REF__ID = 0;

	/**
	 * The number of structural features of the '<em>Layer Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Layer Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.PropertiesImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 23;

	/**
	 * The feature id for the '<em><b>Spatial Ref Sys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__SPATIAL_REF_SYS = 0;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.SpatialRefSysPropertiesImpl <em>Spatial Ref Sys Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.SpatialRefSysPropertiesImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getSpatialRefSysProperties()
	 * @generated
	 */
	int SPATIAL_REF_SYS_PROPERTIES = 24;

	/**
	 * The feature id for the '<em><b>Projections Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REF_SYS_PROPERTIES__PROJECTIONS_ENABLED = 0;

	/**
	 * The number of structural features of the '<em>Spatial Ref Sys Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REF_SYS_PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Spatial Ref Sys Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_REF_SYS_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.TypedValueImpl <em>Typed Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.TypedValueImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getTypedValue()
	 * @generated
	 */
	int TYPED_VALUE = 25;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VALUE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Typed Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Typed Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.ProjectViewSettingsImpl <em>Project View Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.ProjectViewSettingsImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getProjectViewSettings()
	 * @generated
	 */
	int PROJECT_VIEW_SETTINGS = 26;

	/**
	 * The feature id for the '<em><b>Use Project Scales</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VIEW_SETTINGS__USE_PROJECT_SCALES = 0;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VIEW_SETTINGS__ROTATION = 1;

	/**
	 * The feature id for the '<em><b>Default View Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VIEW_SETTINGS__DEFAULT_VIEW_EXTENT = 2;

	/**
	 * The number of structural features of the '<em>Project View Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VIEW_SETTINGS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Project View Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VIEW_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.impl.ExtentImpl <em>Extent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.impl.ExtentImpl
	 * @see org.qgis.project.impl.QgisPackageImpl#getExtent()
	 * @generated
	 */
	int EXTENT = 27;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__XMIN = 0;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__YMIN = 1;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__XMAX = 2;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__YMAX = 3;

	/**
	 * The feature id for the '<em><b>Spatial Ref Sys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT__SPATIAL_REF_SYS = 4;

	/**
	 * The number of structural features of the '<em>Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.qgis.project.CheckState <em>Check State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.qgis.project.CheckState
	 * @see org.qgis.project.impl.QgisPackageImpl#getCheckState()
	 * @generated
	 */
	int CHECK_STATE = 28;


	/**
	 * Returns the meta object for class '{@link org.qgis.project.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.qgis.project.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Project#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.qgis.project.Project#getVersion()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Project#getProjectname <em>Projectname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projectname</em>'.
	 * @see org.qgis.project.Project#getProjectname()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Projectname();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Project#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.qgis.project.Project#getTitle()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.Project#getProjectCrs <em>Project Crs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project Crs</em>'.
	 * @see org.qgis.project.Project#getProjectCrs()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ProjectCrs();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.Project#getLayerTreeGroup <em>Layer Tree Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layer Tree Group</em>'.
	 * @see org.qgis.project.Project#getLayerTreeGroup()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_LayerTreeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.Project#getProjectLayers <em>Project Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project Layers</em>'.
	 * @see org.qgis.project.Project#getProjectLayers()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ProjectLayers();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.Project#getLayerOrder <em>Layer Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layer Order</em>'.
	 * @see org.qgis.project.Project#getLayerOrder()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_LayerOrder();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.Project#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.qgis.project.Project#getProperties()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.Project#getViewSettings <em>View Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View Settings</em>'.
	 * @see org.qgis.project.Project#getViewSettings()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ViewSettings();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.Crs <em>Crs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crs</em>'.
	 * @see org.qgis.project.Crs
	 * @generated
	 */
	EClass getCrs();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.Crs#getSpatialRefSys <em>Spatial Ref Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spatial Ref Sys</em>'.
	 * @see org.qgis.project.Crs#getSpatialRefSys()
	 * @see #getCrs()
	 * @generated
	 */
	EReference getCrs_SpatialRefSys();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.SpatialRefSys <em>Spatial Ref Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Ref Sys</em>'.
	 * @see org.qgis.project.SpatialRefSys
	 * @generated
	 */
	EClass getSpatialRefSys();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.SpatialRefSys#getNativeFormat <em>Native Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native Format</em>'.
	 * @see org.qgis.project.SpatialRefSys#getNativeFormat()
	 * @see #getSpatialRefSys()
	 * @generated
	 */
	EAttribute getSpatialRefSys_NativeFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.SpatialRefSys#getWkt <em>Wkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wkt</em>'.
	 * @see org.qgis.project.SpatialRefSys#getWkt()
	 * @see #getSpatialRefSys()
	 * @generated
	 */
	EAttribute getSpatialRefSys_Wkt();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.SpatialRefSys#getProj4 <em>Proj4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proj4</em>'.
	 * @see org.qgis.project.SpatialRefSys#getProj4()
	 * @see #getSpatialRefSys()
	 * @generated
	 */
	EAttribute getSpatialRefSys_Proj4();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.SpatialRefSys#getSrsid <em>Srsid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srsid</em>'.
	 * @see org.qgis.project.SpatialRefSys#getSrsid()
	 * @see #getSpatialRefSys()
	 * @generated
	 */
	EAttribute getSpatialRefSys_Srsid();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.SpatialRefSys#getSrid <em>Srid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srid</em>'.
	 * @see org.qgis.project.SpatialRefSys#getSrid()
	 * @see #getSpatialRefSys()
	 * @generated
	 */
	EAttribute getSpatialRefSys_Srid();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.SpatialRefSys#getAuthid <em>Authid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authid</em>'.
	 * @see org.qgis.project.SpatialRefSys#getAuthid()
	 * @see #getSpatialRefSys()
	 * @generated
	 */
	EAttribute getSpatialRefSys_Authid();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.SpatialRefSys#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.qgis.project.SpatialRefSys#getDescription()
	 * @see #getSpatialRefSys()
	 * @generated
	 */
	EAttribute getSpatialRefSys_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.SpatialRefSys#getProjectionacronym <em>Projectionacronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projectionacronym</em>'.
	 * @see org.qgis.project.SpatialRefSys#getProjectionacronym()
	 * @see #getSpatialRefSys()
	 * @generated
	 */
	EAttribute getSpatialRefSys_Projectionacronym();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.SpatialRefSys#getEllipsoidacronym <em>Ellipsoidacronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ellipsoidacronym</em>'.
	 * @see org.qgis.project.SpatialRefSys#getEllipsoidacronym()
	 * @see #getSpatialRefSys()
	 * @generated
	 */
	EAttribute getSpatialRefSys_Ellipsoidacronym();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.SpatialRefSys#getGeographicflag <em>Geographicflag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geographicflag</em>'.
	 * @see org.qgis.project.SpatialRefSys#getGeographicflag()
	 * @see #getSpatialRefSys()
	 * @generated
	 */
	EAttribute getSpatialRefSys_Geographicflag();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.LayerTreeGroup <em>Layer Tree Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Tree Group</em>'.
	 * @see org.qgis.project.LayerTreeGroup
	 * @generated
	 */
	EClass getLayerTreeGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.LayerTreeGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.qgis.project.LayerTreeGroup#getName()
	 * @see #getLayerTreeGroup()
	 * @generated
	 */
	EAttribute getLayerTreeGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.LayerTreeGroup#getChecked <em>Checked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked</em>'.
	 * @see org.qgis.project.LayerTreeGroup#getChecked()
	 * @see #getLayerTreeGroup()
	 * @generated
	 */
	EAttribute getLayerTreeGroup_Checked();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.LayerTreeGroup#getExpanded <em>Expanded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expanded</em>'.
	 * @see org.qgis.project.LayerTreeGroup#getExpanded()
	 * @see #getLayerTreeGroup()
	 * @generated
	 */
	EAttribute getLayerTreeGroup_Expanded();

	/**
	 * Returns the meta object for the containment reference list '{@link org.qgis.project.LayerTreeGroup#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.qgis.project.LayerTreeGroup#getGroups()
	 * @see #getLayerTreeGroup()
	 * @generated
	 */
	EReference getLayerTreeGroup_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.qgis.project.LayerTreeGroup#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see org.qgis.project.LayerTreeGroup#getLayers()
	 * @see #getLayerTreeGroup()
	 * @generated
	 */
	EReference getLayerTreeGroup_Layers();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.LayerTreeGroup#getCustomOrder <em>Custom Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Order</em>'.
	 * @see org.qgis.project.LayerTreeGroup#getCustomOrder()
	 * @see #getLayerTreeGroup()
	 * @generated
	 */
	EReference getLayerTreeGroup_CustomOrder();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.LayerTreeLayer <em>Layer Tree Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Tree Layer</em>'.
	 * @see org.qgis.project.LayerTreeLayer
	 * @generated
	 */
	EClass getLayerTreeLayer();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.LayerTreeLayer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.qgis.project.LayerTreeLayer#getId()
	 * @see #getLayerTreeLayer()
	 * @generated
	 */
	EAttribute getLayerTreeLayer_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.LayerTreeLayer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.qgis.project.LayerTreeLayer#getName()
	 * @see #getLayerTreeLayer()
	 * @generated
	 */
	EAttribute getLayerTreeLayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.LayerTreeLayer#getProviderKey <em>Provider Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Key</em>'.
	 * @see org.qgis.project.LayerTreeLayer#getProviderKey()
	 * @see #getLayerTreeLayer()
	 * @generated
	 */
	EAttribute getLayerTreeLayer_ProviderKey();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.LayerTreeLayer#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.qgis.project.LayerTreeLayer#getSource()
	 * @see #getLayerTreeLayer()
	 * @generated
	 */
	EAttribute getLayerTreeLayer_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.LayerTreeLayer#getChecked <em>Checked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked</em>'.
	 * @see org.qgis.project.LayerTreeLayer#getChecked()
	 * @see #getLayerTreeLayer()
	 * @generated
	 */
	EAttribute getLayerTreeLayer_Checked();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.LayerTreeLayer#getExpanded <em>Expanded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expanded</em>'.
	 * @see org.qgis.project.LayerTreeLayer#getExpanded()
	 * @see #getLayerTreeLayer()
	 * @generated
	 */
	EAttribute getLayerTreeLayer_Expanded();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.CustomOrder <em>Custom Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Order</em>'.
	 * @see org.qgis.project.CustomOrder
	 * @generated
	 */
	EClass getCustomOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.CustomOrder#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.qgis.project.CustomOrder#getEnabled()
	 * @see #getCustomOrder()
	 * @generated
	 */
	EAttribute getCustomOrder_Enabled();

	/**
	 * Returns the meta object for the attribute list '{@link org.qgis.project.CustomOrder#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Items</em>'.
	 * @see org.qgis.project.CustomOrder#getItems()
	 * @see #getCustomOrder()
	 * @generated
	 */
	EAttribute getCustomOrder_Items();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.ProjectLayers <em>Project Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Layers</em>'.
	 * @see org.qgis.project.ProjectLayers
	 * @generated
	 */
	EClass getProjectLayers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.qgis.project.ProjectLayers#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see org.qgis.project.ProjectLayers#getLayers()
	 * @see #getProjectLayers()
	 * @generated
	 */
	EReference getProjectLayers_Layers();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.MapLayer <em>Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Layer</em>'.
	 * @see org.qgis.project.MapLayer
	 * @generated
	 */
	EClass getMapLayer();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.MapLayer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.qgis.project.MapLayer#getType()
	 * @see #getMapLayer()
	 * @generated
	 */
	EAttribute getMapLayer_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.MapLayer#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometry</em>'.
	 * @see org.qgis.project.MapLayer#getGeometry()
	 * @see #getMapLayer()
	 * @generated
	 */
	EAttribute getMapLayer_Geometry();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.MapLayer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.qgis.project.MapLayer#getId()
	 * @see #getMapLayer()
	 * @generated
	 */
	EAttribute getMapLayer_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.MapLayer#getDatasource <em>Datasource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datasource</em>'.
	 * @see org.qgis.project.MapLayer#getDatasource()
	 * @see #getMapLayer()
	 * @generated
	 */
	EAttribute getMapLayer_Datasource();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.MapLayer#getLayername <em>Layername</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layername</em>'.
	 * @see org.qgis.project.MapLayer#getLayername()
	 * @see #getMapLayer()
	 * @generated
	 */
	EAttribute getMapLayer_Layername();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.MapLayer#getSrs <em>Srs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Srs</em>'.
	 * @see org.qgis.project.MapLayer#getSrs()
	 * @see #getMapLayer()
	 * @generated
	 */
	EReference getMapLayer_Srs();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.MapLayer#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provider</em>'.
	 * @see org.qgis.project.MapLayer#getProvider()
	 * @see #getMapLayer()
	 * @generated
	 */
	EReference getMapLayer_Provider();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.MapLayer#getRenderer <em>Renderer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Renderer</em>'.
	 * @see org.qgis.project.MapLayer#getRenderer()
	 * @see #getMapLayer()
	 * @generated
	 */
	EReference getMapLayer_Renderer();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.MapLayer#getLabeling <em>Labeling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Labeling</em>'.
	 * @see org.qgis.project.MapLayer#getLabeling()
	 * @see #getMapLayer()
	 * @generated
	 */
	EReference getMapLayer_Labeling();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.qgis.project.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Provider#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.qgis.project.Provider#getEncoding()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Provider#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.qgis.project.Provider#getKey()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Key();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.Renderer <em>Renderer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Renderer</em>'.
	 * @see org.qgis.project.Renderer
	 * @generated
	 */
	EClass getRenderer();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Renderer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.qgis.project.Renderer#getType()
	 * @see #getRenderer()
	 * @generated
	 */
	EAttribute getRenderer_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Renderer#getSymbollevels <em>Symbollevels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbollevels</em>'.
	 * @see org.qgis.project.Renderer#getSymbollevels()
	 * @see #getRenderer()
	 * @generated
	 */
	EAttribute getRenderer_Symbollevels();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Renderer#getEnableorderby <em>Enableorderby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enableorderby</em>'.
	 * @see org.qgis.project.Renderer#getEnableorderby()
	 * @see #getRenderer()
	 * @generated
	 */
	EAttribute getRenderer_Enableorderby();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Renderer#getForceraster <em>Forceraster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forceraster</em>'.
	 * @see org.qgis.project.Renderer#getForceraster()
	 * @see #getRenderer()
	 * @generated
	 */
	EAttribute getRenderer_Forceraster();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.Renderer#getSymbols <em>Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Symbols</em>'.
	 * @see org.qgis.project.Renderer#getSymbols()
	 * @see #getRenderer()
	 * @generated
	 */
	EReference getRenderer_Symbols();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.Symbols <em>Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbols</em>'.
	 * @see org.qgis.project.Symbols
	 * @generated
	 */
	EClass getSymbols();

	/**
	 * Returns the meta object for the containment reference list '{@link org.qgis.project.Symbols#getSymbols <em>Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Symbols</em>'.
	 * @see org.qgis.project.Symbols#getSymbols()
	 * @see #getSymbols()
	 * @generated
	 */
	EReference getSymbols_Symbols();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol</em>'.
	 * @see org.qgis.project.Symbol
	 * @generated
	 */
	EClass getSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Symbol#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.qgis.project.Symbol#getType()
	 * @see #getSymbol()
	 * @generated
	 */
	EAttribute getSymbol_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Symbol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.qgis.project.Symbol#getName()
	 * @see #getSymbol()
	 * @generated
	 */
	EAttribute getSymbol_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Symbol#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see org.qgis.project.Symbol#getAlpha()
	 * @see #getSymbol()
	 * @generated
	 */
	EAttribute getSymbol_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Symbol#getClipToExtent <em>Clip To Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip To Extent</em>'.
	 * @see org.qgis.project.Symbol#getClipToExtent()
	 * @see #getSymbol()
	 * @generated
	 */
	EAttribute getSymbol_ClipToExtent();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Symbol#getForceRhr <em>Force Rhr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force Rhr</em>'.
	 * @see org.qgis.project.Symbol#getForceRhr()
	 * @see #getSymbol()
	 * @generated
	 */
	EAttribute getSymbol_ForceRhr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.qgis.project.Symbol#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see org.qgis.project.Symbol#getLayers()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_Layers();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.SymbolLayer <em>Symbol Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Layer</em>'.
	 * @see org.qgis.project.SymbolLayer
	 * @generated
	 */
	EClass getSymbolLayer();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.SymbolLayer#getLayerClass <em>Layer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer Class</em>'.
	 * @see org.qgis.project.SymbolLayer#getLayerClass()
	 * @see #getSymbolLayer()
	 * @generated
	 */
	EAttribute getSymbolLayer_LayerClass();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.SymbolLayer#getEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.qgis.project.SymbolLayer#getEnabled()
	 * @see #getSymbolLayer()
	 * @generated
	 */
	EAttribute getSymbolLayer_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.SymbolLayer#getLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see org.qgis.project.SymbolLayer#getLocked()
	 * @see #getSymbolLayer()
	 * @generated
	 */
	EAttribute getSymbolLayer_Locked();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.SymbolLayer#getPass <em>Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass</em>'.
	 * @see org.qgis.project.SymbolLayer#getPass()
	 * @see #getSymbolLayer()
	 * @generated
	 */
	EAttribute getSymbolLayer_Pass();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.SymbolLayer#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see org.qgis.project.SymbolLayer#getOptions()
	 * @see #getSymbolLayer()
	 * @generated
	 */
	EReference getSymbolLayer_Options();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.SymbolLayer#getDataDefinedProperties <em>Data Defined Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Defined Properties</em>'.
	 * @see org.qgis.project.SymbolLayer#getDataDefinedProperties()
	 * @see #getSymbolLayer()
	 * @generated
	 */
	EReference getSymbolLayer_DataDefinedProperties();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.DataDefinedProperties <em>Data Defined Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Defined Properties</em>'.
	 * @see org.qgis.project.DataDefinedProperties
	 * @generated
	 */
	EClass getDataDefinedProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.DataDefinedProperties#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Option</em>'.
	 * @see org.qgis.project.DataDefinedProperties#getOption()
	 * @see #getDataDefinedProperties()
	 * @generated
	 */
	EReference getDataDefinedProperties_Option();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see org.qgis.project.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Option#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.qgis.project.Option#getName()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Option#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.qgis.project.Option#getType()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.qgis.project.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link org.qgis.project.Option#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org.qgis.project.Option#getOptions()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Options();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.Labeling <em>Labeling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeling</em>'.
	 * @see org.qgis.project.Labeling
	 * @generated
	 */
	EClass getLabeling();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Labeling#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.qgis.project.Labeling#getType()
	 * @see #getLabeling()
	 * @generated
	 */
	EAttribute getLabeling_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.Labeling#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see org.qgis.project.Labeling#getSettings()
	 * @see #getLabeling()
	 * @generated
	 */
	EReference getLabeling_Settings();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.LabelSettings <em>Label Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Settings</em>'.
	 * @see org.qgis.project.LabelSettings
	 * @generated
	 */
	EClass getLabelSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.LabelSettings#getCalloutType <em>Callout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callout Type</em>'.
	 * @see org.qgis.project.LabelSettings#getCalloutType()
	 * @see #getLabelSettings()
	 * @generated
	 */
	EAttribute getLabelSettings_CalloutType();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.LabelSettings#getTextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Style</em>'.
	 * @see org.qgis.project.LabelSettings#getTextStyle()
	 * @see #getLabelSettings()
	 * @generated
	 */
	EReference getLabelSettings_TextStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.LabelSettings#getPlacement <em>Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Placement</em>'.
	 * @see org.qgis.project.LabelSettings#getPlacement()
	 * @see #getLabelSettings()
	 * @generated
	 */
	EReference getLabelSettings_Placement();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.LabelSettings#getRendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rendering</em>'.
	 * @see org.qgis.project.LabelSettings#getRendering()
	 * @see #getLabelSettings()
	 * @generated
	 */
	EReference getLabelSettings_Rendering();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.TextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Style</em>'.
	 * @see org.qgis.project.TextStyle
	 * @generated
	 */
	EClass getTextStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.TextStyle#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see org.qgis.project.TextStyle#getFieldName()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.TextStyle#getIsExpression <em>Is Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Expression</em>'.
	 * @see org.qgis.project.TextStyle#getIsExpression()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_IsExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.TextStyle#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.qgis.project.TextStyle#getFontSize()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.TextStyle#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see org.qgis.project.TextStyle#getTextColor()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_TextColor();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.TextStyle#getTextBuffer <em>Text Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Buffer</em>'.
	 * @see org.qgis.project.TextStyle#getTextBuffer()
	 * @see #getTextStyle()
	 * @generated
	 */
	EReference getTextStyle_TextBuffer();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.TextBuffer <em>Text Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Buffer</em>'.
	 * @see org.qgis.project.TextBuffer
	 * @generated
	 */
	EClass getTextBuffer();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.TextBuffer#getBufferDraw <em>Buffer Draw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Draw</em>'.
	 * @see org.qgis.project.TextBuffer#getBufferDraw()
	 * @see #getTextBuffer()
	 * @generated
	 */
	EAttribute getTextBuffer_BufferDraw();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.TextBuffer#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Size</em>'.
	 * @see org.qgis.project.TextBuffer#getBufferSize()
	 * @see #getTextBuffer()
	 * @generated
	 */
	EAttribute getTextBuffer_BufferSize();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.TextBuffer#getBufferColor <em>Buffer Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Color</em>'.
	 * @see org.qgis.project.TextBuffer#getBufferColor()
	 * @see #getTextBuffer()
	 * @generated
	 */
	EAttribute getTextBuffer_BufferColor();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.Placement <em>Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placement</em>'.
	 * @see org.qgis.project.Placement
	 * @generated
	 */
	EClass getPlacement();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Placement#getPlacement <em>Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placement</em>'.
	 * @see org.qgis.project.Placement#getPlacement()
	 * @see #getPlacement()
	 * @generated
	 */
	EAttribute getPlacement_Placement();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.Rendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rendering</em>'.
	 * @see org.qgis.project.Rendering
	 * @generated
	 */
	EClass getRendering();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Rendering#getScaleVisibility <em>Scale Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Visibility</em>'.
	 * @see org.qgis.project.Rendering#getScaleVisibility()
	 * @see #getRendering()
	 * @generated
	 */
	EAttribute getRendering_ScaleVisibility();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Rendering#getScaleMin <em>Scale Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Min</em>'.
	 * @see org.qgis.project.Rendering#getScaleMin()
	 * @see #getRendering()
	 * @generated
	 */
	EAttribute getRendering_ScaleMin();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Rendering#getScaleMax <em>Scale Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Max</em>'.
	 * @see org.qgis.project.Rendering#getScaleMax()
	 * @see #getRendering()
	 * @generated
	 */
	EAttribute getRendering_ScaleMax();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.LayerOrder <em>Layer Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Order</em>'.
	 * @see org.qgis.project.LayerOrder
	 * @generated
	 */
	EClass getLayerOrder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.qgis.project.LayerOrder#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see org.qgis.project.LayerOrder#getLayers()
	 * @see #getLayerOrder()
	 * @generated
	 */
	EReference getLayerOrder_Layers();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.LayerRef <em>Layer Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Ref</em>'.
	 * @see org.qgis.project.LayerRef
	 * @generated
	 */
	EClass getLayerRef();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.LayerRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.qgis.project.LayerRef#getId()
	 * @see #getLayerRef()
	 * @generated
	 */
	EAttribute getLayerRef_Id();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see org.qgis.project.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.Properties#getSpatialRefSys <em>Spatial Ref Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spatial Ref Sys</em>'.
	 * @see org.qgis.project.Properties#getSpatialRefSys()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_SpatialRefSys();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.SpatialRefSysProperties <em>Spatial Ref Sys Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Ref Sys Properties</em>'.
	 * @see org.qgis.project.SpatialRefSysProperties
	 * @generated
	 */
	EClass getSpatialRefSysProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.SpatialRefSysProperties#getProjectionsEnabled <em>Projections Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Projections Enabled</em>'.
	 * @see org.qgis.project.SpatialRefSysProperties#getProjectionsEnabled()
	 * @see #getSpatialRefSysProperties()
	 * @generated
	 */
	EReference getSpatialRefSysProperties_ProjectionsEnabled();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.TypedValue <em>Typed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Value</em>'.
	 * @see org.qgis.project.TypedValue
	 * @generated
	 */
	EClass getTypedValue();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.TypedValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.qgis.project.TypedValue#getType()
	 * @see #getTypedValue()
	 * @generated
	 */
	EAttribute getTypedValue_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.TypedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.qgis.project.TypedValue#getValue()
	 * @see #getTypedValue()
	 * @generated
	 */
	EAttribute getTypedValue_Value();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.ProjectViewSettings <em>Project View Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project View Settings</em>'.
	 * @see org.qgis.project.ProjectViewSettings
	 * @generated
	 */
	EClass getProjectViewSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.ProjectViewSettings#getUseProjectScales <em>Use Project Scales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Project Scales</em>'.
	 * @see org.qgis.project.ProjectViewSettings#getUseProjectScales()
	 * @see #getProjectViewSettings()
	 * @generated
	 */
	EAttribute getProjectViewSettings_UseProjectScales();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.ProjectViewSettings#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see org.qgis.project.ProjectViewSettings#getRotation()
	 * @see #getProjectViewSettings()
	 * @generated
	 */
	EAttribute getProjectViewSettings_Rotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.ProjectViewSettings#getDefaultViewExtent <em>Default View Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default View Extent</em>'.
	 * @see org.qgis.project.ProjectViewSettings#getDefaultViewExtent()
	 * @see #getProjectViewSettings()
	 * @generated
	 */
	EReference getProjectViewSettings_DefaultViewExtent();

	/**
	 * Returns the meta object for class '{@link org.qgis.project.Extent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extent</em>'.
	 * @see org.qgis.project.Extent
	 * @generated
	 */
	EClass getExtent();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Extent#getXmin <em>Xmin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmin</em>'.
	 * @see org.qgis.project.Extent#getXmin()
	 * @see #getExtent()
	 * @generated
	 */
	EAttribute getExtent_Xmin();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Extent#getYmin <em>Ymin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ymin</em>'.
	 * @see org.qgis.project.Extent#getYmin()
	 * @see #getExtent()
	 * @generated
	 */
	EAttribute getExtent_Ymin();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Extent#getXmax <em>Xmax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmax</em>'.
	 * @see org.qgis.project.Extent#getXmax()
	 * @see #getExtent()
	 * @generated
	 */
	EAttribute getExtent_Xmax();

	/**
	 * Returns the meta object for the attribute '{@link org.qgis.project.Extent#getYmax <em>Ymax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ymax</em>'.
	 * @see org.qgis.project.Extent#getYmax()
	 * @see #getExtent()
	 * @generated
	 */
	EAttribute getExtent_Ymax();

	/**
	 * Returns the meta object for the containment reference '{@link org.qgis.project.Extent#getSpatialRefSys <em>Spatial Ref Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spatial Ref Sys</em>'.
	 * @see org.qgis.project.Extent#getSpatialRefSys()
	 * @see #getExtent()
	 * @generated
	 */
	EReference getExtent_SpatialRefSys();

	/**
	 * Returns the meta object for enum '{@link org.qgis.project.CheckState <em>Check State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Check State</em>'.
	 * @see org.qgis.project.CheckState
	 * @generated
	 */
	EEnum getCheckState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QgisFactory getQgisFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.ProjectImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__VERSION = eINSTANCE.getProject_Version();

		/**
		 * The meta object literal for the '<em><b>Projectname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PROJECTNAME = eINSTANCE.getProject_Projectname();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__TITLE = eINSTANCE.getProject_Title();

		/**
		 * The meta object literal for the '<em><b>Project Crs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROJECT_CRS = eINSTANCE.getProject_ProjectCrs();

		/**
		 * The meta object literal for the '<em><b>Layer Tree Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__LAYER_TREE_GROUP = eINSTANCE.getProject_LayerTreeGroup();

		/**
		 * The meta object literal for the '<em><b>Project Layers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROJECT_LAYERS = eINSTANCE.getProject_ProjectLayers();

		/**
		 * The meta object literal for the '<em><b>Layer Order</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__LAYER_ORDER = eINSTANCE.getProject_LayerOrder();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROPERTIES = eINSTANCE.getProject_Properties();

		/**
		 * The meta object literal for the '<em><b>View Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__VIEW_SETTINGS = eINSTANCE.getProject_ViewSettings();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.CrsImpl <em>Crs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.CrsImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getCrs()
		 * @generated
		 */
		EClass CRS = eINSTANCE.getCrs();

		/**
		 * The meta object literal for the '<em><b>Spatial Ref Sys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRS__SPATIAL_REF_SYS = eINSTANCE.getCrs_SpatialRefSys();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.SpatialRefSysImpl <em>Spatial Ref Sys</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.SpatialRefSysImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getSpatialRefSys()
		 * @generated
		 */
		EClass SPATIAL_REF_SYS = eINSTANCE.getSpatialRefSys();

		/**
		 * The meta object literal for the '<em><b>Native Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_REF_SYS__NATIVE_FORMAT = eINSTANCE.getSpatialRefSys_NativeFormat();

		/**
		 * The meta object literal for the '<em><b>Wkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_REF_SYS__WKT = eINSTANCE.getSpatialRefSys_Wkt();

		/**
		 * The meta object literal for the '<em><b>Proj4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_REF_SYS__PROJ4 = eINSTANCE.getSpatialRefSys_Proj4();

		/**
		 * The meta object literal for the '<em><b>Srsid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_REF_SYS__SRSID = eINSTANCE.getSpatialRefSys_Srsid();

		/**
		 * The meta object literal for the '<em><b>Srid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_REF_SYS__SRID = eINSTANCE.getSpatialRefSys_Srid();

		/**
		 * The meta object literal for the '<em><b>Authid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_REF_SYS__AUTHID = eINSTANCE.getSpatialRefSys_Authid();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_REF_SYS__DESCRIPTION = eINSTANCE.getSpatialRefSys_Description();

		/**
		 * The meta object literal for the '<em><b>Projectionacronym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_REF_SYS__PROJECTIONACRONYM = eINSTANCE.getSpatialRefSys_Projectionacronym();

		/**
		 * The meta object literal for the '<em><b>Ellipsoidacronym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_REF_SYS__ELLIPSOIDACRONYM = eINSTANCE.getSpatialRefSys_Ellipsoidacronym();

		/**
		 * The meta object literal for the '<em><b>Geographicflag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_REF_SYS__GEOGRAPHICFLAG = eINSTANCE.getSpatialRefSys_Geographicflag();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.LayerTreeGroupImpl <em>Layer Tree Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.LayerTreeGroupImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getLayerTreeGroup()
		 * @generated
		 */
		EClass LAYER_TREE_GROUP = eINSTANCE.getLayerTreeGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TREE_GROUP__NAME = eINSTANCE.getLayerTreeGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Checked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TREE_GROUP__CHECKED = eINSTANCE.getLayerTreeGroup_Checked();

		/**
		 * The meta object literal for the '<em><b>Expanded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TREE_GROUP__EXPANDED = eINSTANCE.getLayerTreeGroup_Expanded();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TREE_GROUP__GROUPS = eINSTANCE.getLayerTreeGroup_Groups();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TREE_GROUP__LAYERS = eINSTANCE.getLayerTreeGroup_Layers();

		/**
		 * The meta object literal for the '<em><b>Custom Order</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_TREE_GROUP__CUSTOM_ORDER = eINSTANCE.getLayerTreeGroup_CustomOrder();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.LayerTreeLayerImpl <em>Layer Tree Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.LayerTreeLayerImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getLayerTreeLayer()
		 * @generated
		 */
		EClass LAYER_TREE_LAYER = eINSTANCE.getLayerTreeLayer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TREE_LAYER__ID = eINSTANCE.getLayerTreeLayer_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TREE_LAYER__NAME = eINSTANCE.getLayerTreeLayer_Name();

		/**
		 * The meta object literal for the '<em><b>Provider Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TREE_LAYER__PROVIDER_KEY = eINSTANCE.getLayerTreeLayer_ProviderKey();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TREE_LAYER__SOURCE = eINSTANCE.getLayerTreeLayer_Source();

		/**
		 * The meta object literal for the '<em><b>Checked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TREE_LAYER__CHECKED = eINSTANCE.getLayerTreeLayer_Checked();

		/**
		 * The meta object literal for the '<em><b>Expanded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_TREE_LAYER__EXPANDED = eINSTANCE.getLayerTreeLayer_Expanded();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.CustomOrderImpl <em>Custom Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.CustomOrderImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getCustomOrder()
		 * @generated
		 */
		EClass CUSTOM_ORDER = eINSTANCE.getCustomOrder();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_ORDER__ENABLED = eINSTANCE.getCustomOrder_Enabled();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_ORDER__ITEMS = eINSTANCE.getCustomOrder_Items();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.ProjectLayersImpl <em>Project Layers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.ProjectLayersImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getProjectLayers()
		 * @generated
		 */
		EClass PROJECT_LAYERS = eINSTANCE.getProjectLayers();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_LAYERS__LAYERS = eINSTANCE.getProjectLayers_Layers();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.MapLayerImpl <em>Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.MapLayerImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getMapLayer()
		 * @generated
		 */
		EClass MAP_LAYER = eINSTANCE.getMapLayer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_LAYER__TYPE = eINSTANCE.getMapLayer_Type();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_LAYER__GEOMETRY = eINSTANCE.getMapLayer_Geometry();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_LAYER__ID = eINSTANCE.getMapLayer_Id();

		/**
		 * The meta object literal for the '<em><b>Datasource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_LAYER__DATASOURCE = eINSTANCE.getMapLayer_Datasource();

		/**
		 * The meta object literal for the '<em><b>Layername</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_LAYER__LAYERNAME = eINSTANCE.getMapLayer_Layername();

		/**
		 * The meta object literal for the '<em><b>Srs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_LAYER__SRS = eINSTANCE.getMapLayer_Srs();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_LAYER__PROVIDER = eINSTANCE.getMapLayer_Provider();

		/**
		 * The meta object literal for the '<em><b>Renderer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_LAYER__RENDERER = eINSTANCE.getMapLayer_Renderer();

		/**
		 * The meta object literal for the '<em><b>Labeling</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_LAYER__LABELING = eINSTANCE.getMapLayer_Labeling();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.ProviderImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__ENCODING = eINSTANCE.getProvider_Encoding();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__KEY = eINSTANCE.getProvider_Key();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.RendererImpl <em>Renderer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.RendererImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getRenderer()
		 * @generated
		 */
		EClass RENDERER = eINSTANCE.getRenderer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDERER__TYPE = eINSTANCE.getRenderer_Type();

		/**
		 * The meta object literal for the '<em><b>Symbollevels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDERER__SYMBOLLEVELS = eINSTANCE.getRenderer_Symbollevels();

		/**
		 * The meta object literal for the '<em><b>Enableorderby</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDERER__ENABLEORDERBY = eINSTANCE.getRenderer_Enableorderby();

		/**
		 * The meta object literal for the '<em><b>Forceraster</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDERER__FORCERASTER = eINSTANCE.getRenderer_Forceraster();

		/**
		 * The meta object literal for the '<em><b>Symbols</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDERER__SYMBOLS = eINSTANCE.getRenderer_Symbols();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.SymbolsImpl <em>Symbols</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.SymbolsImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getSymbols()
		 * @generated
		 */
		EClass SYMBOLS = eINSTANCE.getSymbols();

		/**
		 * The meta object literal for the '<em><b>Symbols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOLS__SYMBOLS = eINSTANCE.getSymbols_Symbols();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.SymbolImpl <em>Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.SymbolImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getSymbol()
		 * @generated
		 */
		EClass SYMBOL = eINSTANCE.getSymbol();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL__TYPE = eINSTANCE.getSymbol_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL__NAME = eINSTANCE.getSymbol_Name();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL__ALPHA = eINSTANCE.getSymbol_Alpha();

		/**
		 * The meta object literal for the '<em><b>Clip To Extent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL__CLIP_TO_EXTENT = eINSTANCE.getSymbol_ClipToExtent();

		/**
		 * The meta object literal for the '<em><b>Force Rhr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL__FORCE_RHR = eINSTANCE.getSymbol_ForceRhr();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__LAYERS = eINSTANCE.getSymbol_Layers();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.SymbolLayerImpl <em>Symbol Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.SymbolLayerImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getSymbolLayer()
		 * @generated
		 */
		EClass SYMBOL_LAYER = eINSTANCE.getSymbolLayer();

		/**
		 * The meta object literal for the '<em><b>Layer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL_LAYER__LAYER_CLASS = eINSTANCE.getSymbolLayer_LayerClass();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL_LAYER__ENABLED = eINSTANCE.getSymbolLayer_Enabled();

		/**
		 * The meta object literal for the '<em><b>Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL_LAYER__LOCKED = eINSTANCE.getSymbolLayer_Locked();

		/**
		 * The meta object literal for the '<em><b>Pass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL_LAYER__PASS = eINSTANCE.getSymbolLayer_Pass();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL_LAYER__OPTIONS = eINSTANCE.getSymbolLayer_Options();

		/**
		 * The meta object literal for the '<em><b>Data Defined Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL_LAYER__DATA_DEFINED_PROPERTIES = eINSTANCE.getSymbolLayer_DataDefinedProperties();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.DataDefinedPropertiesImpl <em>Data Defined Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.DataDefinedPropertiesImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getDataDefinedProperties()
		 * @generated
		 */
		EClass DATA_DEFINED_PROPERTIES = eINSTANCE.getDataDefinedProperties();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DEFINED_PROPERTIES__OPTION = eINSTANCE.getDataDefinedProperties_Option();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.OptionImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__NAME = eINSTANCE.getOption_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__TYPE = eINSTANCE.getOption_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__OPTIONS = eINSTANCE.getOption_Options();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.LabelingImpl <em>Labeling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.LabelingImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getLabeling()
		 * @generated
		 */
		EClass LABELING = eINSTANCE.getLabeling();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELING__TYPE = eINSTANCE.getLabeling_Type();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABELING__SETTINGS = eINSTANCE.getLabeling_Settings();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.LabelSettingsImpl <em>Label Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.LabelSettingsImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getLabelSettings()
		 * @generated
		 */
		EClass LABEL_SETTINGS = eINSTANCE.getLabelSettings();

		/**
		 * The meta object literal for the '<em><b>Callout Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_SETTINGS__CALLOUT_TYPE = eINSTANCE.getLabelSettings_CalloutType();

		/**
		 * The meta object literal for the '<em><b>Text Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_SETTINGS__TEXT_STYLE = eINSTANCE.getLabelSettings_TextStyle();

		/**
		 * The meta object literal for the '<em><b>Placement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_SETTINGS__PLACEMENT = eINSTANCE.getLabelSettings_Placement();

		/**
		 * The meta object literal for the '<em><b>Rendering</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_SETTINGS__RENDERING = eINSTANCE.getLabelSettings_Rendering();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.TextStyleImpl <em>Text Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.TextStyleImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getTextStyle()
		 * @generated
		 */
		EClass TEXT_STYLE = eINSTANCE.getTextStyle();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__FIELD_NAME = eINSTANCE.getTextStyle_FieldName();

		/**
		 * The meta object literal for the '<em><b>Is Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__IS_EXPRESSION = eINSTANCE.getTextStyle_IsExpression();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__FONT_SIZE = eINSTANCE.getTextStyle_FontSize();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__TEXT_COLOR = eINSTANCE.getTextStyle_TextColor();

		/**
		 * The meta object literal for the '<em><b>Text Buffer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_STYLE__TEXT_BUFFER = eINSTANCE.getTextStyle_TextBuffer();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.TextBufferImpl <em>Text Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.TextBufferImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getTextBuffer()
		 * @generated
		 */
		EClass TEXT_BUFFER = eINSTANCE.getTextBuffer();

		/**
		 * The meta object literal for the '<em><b>Buffer Draw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_BUFFER__BUFFER_DRAW = eINSTANCE.getTextBuffer_BufferDraw();

		/**
		 * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_BUFFER__BUFFER_SIZE = eINSTANCE.getTextBuffer_BufferSize();

		/**
		 * The meta object literal for the '<em><b>Buffer Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_BUFFER__BUFFER_COLOR = eINSTANCE.getTextBuffer_BufferColor();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.PlacementImpl <em>Placement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.PlacementImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getPlacement()
		 * @generated
		 */
		EClass PLACEMENT = eINSTANCE.getPlacement();

		/**
		 * The meta object literal for the '<em><b>Placement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEMENT__PLACEMENT = eINSTANCE.getPlacement_Placement();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.RenderingImpl <em>Rendering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.RenderingImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getRendering()
		 * @generated
		 */
		EClass RENDERING = eINSTANCE.getRendering();

		/**
		 * The meta object literal for the '<em><b>Scale Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDERING__SCALE_VISIBILITY = eINSTANCE.getRendering_ScaleVisibility();

		/**
		 * The meta object literal for the '<em><b>Scale Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDERING__SCALE_MIN = eINSTANCE.getRendering_ScaleMin();

		/**
		 * The meta object literal for the '<em><b>Scale Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDERING__SCALE_MAX = eINSTANCE.getRendering_ScaleMax();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.LayerOrderImpl <em>Layer Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.LayerOrderImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getLayerOrder()
		 * @generated
		 */
		EClass LAYER_ORDER = eINSTANCE.getLayerOrder();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_ORDER__LAYERS = eINSTANCE.getLayerOrder_Layers();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.LayerRefImpl <em>Layer Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.LayerRefImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getLayerRef()
		 * @generated
		 */
		EClass LAYER_REF = eINSTANCE.getLayerRef();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_REF__ID = eINSTANCE.getLayerRef_Id();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.PropertiesImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Spatial Ref Sys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__SPATIAL_REF_SYS = eINSTANCE.getProperties_SpatialRefSys();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.SpatialRefSysPropertiesImpl <em>Spatial Ref Sys Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.SpatialRefSysPropertiesImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getSpatialRefSysProperties()
		 * @generated
		 */
		EClass SPATIAL_REF_SYS_PROPERTIES = eINSTANCE.getSpatialRefSysProperties();

		/**
		 * The meta object literal for the '<em><b>Projections Enabled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPATIAL_REF_SYS_PROPERTIES__PROJECTIONS_ENABLED = eINSTANCE.getSpatialRefSysProperties_ProjectionsEnabled();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.TypedValueImpl <em>Typed Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.TypedValueImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getTypedValue()
		 * @generated
		 */
		EClass TYPED_VALUE = eINSTANCE.getTypedValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_VALUE__TYPE = eINSTANCE.getTypedValue_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_VALUE__VALUE = eINSTANCE.getTypedValue_Value();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.ProjectViewSettingsImpl <em>Project View Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.ProjectViewSettingsImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getProjectViewSettings()
		 * @generated
		 */
		EClass PROJECT_VIEW_SETTINGS = eINSTANCE.getProjectViewSettings();

		/**
		 * The meta object literal for the '<em><b>Use Project Scales</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_VIEW_SETTINGS__USE_PROJECT_SCALES = eINSTANCE.getProjectViewSettings_UseProjectScales();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_VIEW_SETTINGS__ROTATION = eINSTANCE.getProjectViewSettings_Rotation();

		/**
		 * The meta object literal for the '<em><b>Default View Extent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_VIEW_SETTINGS__DEFAULT_VIEW_EXTENT = eINSTANCE.getProjectViewSettings_DefaultViewExtent();

		/**
		 * The meta object literal for the '{@link org.qgis.project.impl.ExtentImpl <em>Extent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.impl.ExtentImpl
		 * @see org.qgis.project.impl.QgisPackageImpl#getExtent()
		 * @generated
		 */
		EClass EXTENT = eINSTANCE.getExtent();

		/**
		 * The meta object literal for the '<em><b>Xmin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENT__XMIN = eINSTANCE.getExtent_Xmin();

		/**
		 * The meta object literal for the '<em><b>Ymin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENT__YMIN = eINSTANCE.getExtent_Ymin();

		/**
		 * The meta object literal for the '<em><b>Xmax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENT__XMAX = eINSTANCE.getExtent_Xmax();

		/**
		 * The meta object literal for the '<em><b>Ymax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENT__YMAX = eINSTANCE.getExtent_Ymax();

		/**
		 * The meta object literal for the '<em><b>Spatial Ref Sys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENT__SPATIAL_REF_SYS = eINSTANCE.getExtent_SpatialRefSys();

		/**
		 * The meta object literal for the '{@link org.qgis.project.CheckState <em>Check State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.qgis.project.CheckState
		 * @see org.qgis.project.impl.QgisPackageImpl#getCheckState()
		 * @generated
		 */
		EEnum CHECK_STATE = eINSTANCE.getCheckState();

	}

} //QgisPackage
