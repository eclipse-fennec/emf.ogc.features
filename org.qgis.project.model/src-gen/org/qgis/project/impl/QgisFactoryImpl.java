/**
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
package org.qgis.project.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.qgis.project.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QgisFactoryImpl extends EFactoryImpl implements QgisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QgisFactory init() {
		try {
			QgisFactory theQgisFactory = (QgisFactory)EPackage.Registry.INSTANCE.getEFactory(QgisPackage.eNS_URI);
			if (theQgisFactory != null) {
				return theQgisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QgisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QgisFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QgisPackage.PROJECT: return createProject();
			case QgisPackage.CRS: return createCrs();
			case QgisPackage.SPATIAL_REF_SYS: return createSpatialRefSys();
			case QgisPackage.LAYER_TREE_GROUP: return createLayerTreeGroup();
			case QgisPackage.LAYER_TREE_LAYER: return createLayerTreeLayer();
			case QgisPackage.CUSTOM_ORDER: return createCustomOrder();
			case QgisPackage.PROJECT_LAYERS: return createProjectLayers();
			case QgisPackage.MAP_LAYER: return createMapLayer();
			case QgisPackage.PROVIDER: return createProvider();
			case QgisPackage.RENDERER: return createRenderer();
			case QgisPackage.SYMBOLS: return createSymbols();
			case QgisPackage.SYMBOL: return createSymbol();
			case QgisPackage.SYMBOL_LAYER: return createSymbolLayer();
			case QgisPackage.DATA_DEFINED_PROPERTIES: return createDataDefinedProperties();
			case QgisPackage.OPTION: return createOption();
			case QgisPackage.LABELING: return createLabeling();
			case QgisPackage.LABEL_SETTINGS: return createLabelSettings();
			case QgisPackage.TEXT_STYLE: return createTextStyle();
			case QgisPackage.TEXT_BUFFER: return createTextBuffer();
			case QgisPackage.PLACEMENT: return createPlacement();
			case QgisPackage.RENDERING: return createRendering();
			case QgisPackage.LAYER_ORDER: return createLayerOrder();
			case QgisPackage.LAYER_REF: return createLayerRef();
			case QgisPackage.PROPERTIES: return createProperties();
			case QgisPackage.SPATIAL_REF_SYS_PROPERTIES: return createSpatialRefSysProperties();
			case QgisPackage.TYPED_VALUE: return createTypedValue();
			case QgisPackage.PROJECT_VIEW_SETTINGS: return createProjectViewSettings();
			case QgisPackage.EXTENT: return createExtent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QgisPackage.CHECK_STATE:
				return createCheckStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QgisPackage.CHECK_STATE:
				return convertCheckStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Crs createCrs() {
		CrsImpl crs = new CrsImpl();
		return crs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialRefSys createSpatialRefSys() {
		SpatialRefSysImpl spatialRefSys = new SpatialRefSysImpl();
		return spatialRefSys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerTreeGroup createLayerTreeGroup() {
		LayerTreeGroupImpl layerTreeGroup = new LayerTreeGroupImpl();
		return layerTreeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerTreeLayer createLayerTreeLayer() {
		LayerTreeLayerImpl layerTreeLayer = new LayerTreeLayerImpl();
		return layerTreeLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomOrder createCustomOrder() {
		CustomOrderImpl customOrder = new CustomOrderImpl();
		return customOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectLayers createProjectLayers() {
		ProjectLayersImpl projectLayers = new ProjectLayersImpl();
		return projectLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapLayer createMapLayer() {
		MapLayerImpl mapLayer = new MapLayerImpl();
		return mapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Renderer createRenderer() {
		RendererImpl renderer = new RendererImpl();
		return renderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Symbols createSymbols() {
		SymbolsImpl symbols = new SymbolsImpl();
		return symbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Symbol createSymbol() {
		SymbolImpl symbol = new SymbolImpl();
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbolLayer createSymbolLayer() {
		SymbolLayerImpl symbolLayer = new SymbolLayerImpl();
		return symbolLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataDefinedProperties createDataDefinedProperties() {
		DataDefinedPropertiesImpl dataDefinedProperties = new DataDefinedPropertiesImpl();
		return dataDefinedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Labeling createLabeling() {
		LabelingImpl labeling = new LabelingImpl();
		return labeling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelSettings createLabelSettings() {
		LabelSettingsImpl labelSettings = new LabelSettingsImpl();
		return labelSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextStyle createTextStyle() {
		TextStyleImpl textStyle = new TextStyleImpl();
		return textStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextBuffer createTextBuffer() {
		TextBufferImpl textBuffer = new TextBufferImpl();
		return textBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Placement createPlacement() {
		PlacementImpl placement = new PlacementImpl();
		return placement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rendering createRendering() {
		RenderingImpl rendering = new RenderingImpl();
		return rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerOrder createLayerOrder() {
		LayerOrderImpl layerOrder = new LayerOrderImpl();
		return layerOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerRef createLayerRef() {
		LayerRefImpl layerRef = new LayerRefImpl();
		return layerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialRefSysProperties createSpatialRefSysProperties() {
		SpatialRefSysPropertiesImpl spatialRefSysProperties = new SpatialRefSysPropertiesImpl();
		return spatialRefSysProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypedValue createTypedValue() {
		TypedValueImpl typedValue = new TypedValueImpl();
		return typedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectViewSettings createProjectViewSettings() {
		ProjectViewSettingsImpl projectViewSettings = new ProjectViewSettingsImpl();
		return projectViewSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Extent createExtent() {
		ExtentImpl extent = new ExtentImpl();
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckState createCheckStateFromString(EDataType eDataType, String initialValue) {
		CheckState result = CheckState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCheckStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QgisPackage getQgisPackage() {
		return (QgisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QgisPackage getPackage() {
		return QgisPackage.eINSTANCE;
	}

} //QgisFactoryImpl
