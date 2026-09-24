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
package org.qgis.project.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.qgis.project.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.qgis.project.QgisPackage
 * @generated
 */
public class QgisAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QgisPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QgisAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QgisPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QgisSwitch<Adapter> modelSwitch =
		new QgisSwitch<Adapter>() {
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseCrs(Crs object) {
				return createCrsAdapter();
			}
			@Override
			public Adapter caseSpatialRefSys(SpatialRefSys object) {
				return createSpatialRefSysAdapter();
			}
			@Override
			public Adapter caseLayerTreeGroup(LayerTreeGroup object) {
				return createLayerTreeGroupAdapter();
			}
			@Override
			public Adapter caseLayerTreeLayer(LayerTreeLayer object) {
				return createLayerTreeLayerAdapter();
			}
			@Override
			public Adapter caseCustomOrder(CustomOrder object) {
				return createCustomOrderAdapter();
			}
			@Override
			public Adapter caseProjectLayers(ProjectLayers object) {
				return createProjectLayersAdapter();
			}
			@Override
			public Adapter caseMapLayer(MapLayer object) {
				return createMapLayerAdapter();
			}
			@Override
			public Adapter caseProvider(Provider object) {
				return createProviderAdapter();
			}
			@Override
			public Adapter caseRenderer(Renderer object) {
				return createRendererAdapter();
			}
			@Override
			public Adapter caseSymbols(Symbols object) {
				return createSymbolsAdapter();
			}
			@Override
			public Adapter caseSymbol(Symbol object) {
				return createSymbolAdapter();
			}
			@Override
			public Adapter caseSymbolLayer(SymbolLayer object) {
				return createSymbolLayerAdapter();
			}
			@Override
			public Adapter caseDataDefinedProperties(DataDefinedProperties object) {
				return createDataDefinedPropertiesAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseLabeling(Labeling object) {
				return createLabelingAdapter();
			}
			@Override
			public Adapter caseLabelSettings(LabelSettings object) {
				return createLabelSettingsAdapter();
			}
			@Override
			public Adapter caseTextStyle(TextStyle object) {
				return createTextStyleAdapter();
			}
			@Override
			public Adapter caseTextBuffer(TextBuffer object) {
				return createTextBufferAdapter();
			}
			@Override
			public Adapter casePlacement(Placement object) {
				return createPlacementAdapter();
			}
			@Override
			public Adapter caseRendering(Rendering object) {
				return createRenderingAdapter();
			}
			@Override
			public Adapter caseLayerOrder(LayerOrder object) {
				return createLayerOrderAdapter();
			}
			@Override
			public Adapter caseLayerRef(LayerRef object) {
				return createLayerRefAdapter();
			}
			@Override
			public Adapter caseProperties(Properties object) {
				return createPropertiesAdapter();
			}
			@Override
			public Adapter caseSpatialRefSysProperties(SpatialRefSysProperties object) {
				return createSpatialRefSysPropertiesAdapter();
			}
			@Override
			public Adapter caseTypedValue(TypedValue object) {
				return createTypedValueAdapter();
			}
			@Override
			public Adapter caseProjectViewSettings(ProjectViewSettings object) {
				return createProjectViewSettingsAdapter();
			}
			@Override
			public Adapter caseExtent(Extent object) {
				return createExtentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.Crs <em>Crs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.Crs
	 * @generated
	 */
	public Adapter createCrsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.SpatialRefSys <em>Spatial Ref Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.SpatialRefSys
	 * @generated
	 */
	public Adapter createSpatialRefSysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.LayerTreeGroup <em>Layer Tree Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.LayerTreeGroup
	 * @generated
	 */
	public Adapter createLayerTreeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.LayerTreeLayer <em>Layer Tree Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.LayerTreeLayer
	 * @generated
	 */
	public Adapter createLayerTreeLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.CustomOrder <em>Custom Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.CustomOrder
	 * @generated
	 */
	public Adapter createCustomOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.ProjectLayers <em>Project Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.ProjectLayers
	 * @generated
	 */
	public Adapter createProjectLayersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.MapLayer <em>Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.MapLayer
	 * @generated
	 */
	public Adapter createMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.Provider
	 * @generated
	 */
	public Adapter createProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.Renderer <em>Renderer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.Renderer
	 * @generated
	 */
	public Adapter createRendererAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.Symbols <em>Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.Symbols
	 * @generated
	 */
	public Adapter createSymbolsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.Symbol
	 * @generated
	 */
	public Adapter createSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.SymbolLayer <em>Symbol Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.SymbolLayer
	 * @generated
	 */
	public Adapter createSymbolLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.DataDefinedProperties <em>Data Defined Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.DataDefinedProperties
	 * @generated
	 */
	public Adapter createDataDefinedPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.Labeling <em>Labeling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.Labeling
	 * @generated
	 */
	public Adapter createLabelingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.LabelSettings <em>Label Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.LabelSettings
	 * @generated
	 */
	public Adapter createLabelSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.TextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.TextStyle
	 * @generated
	 */
	public Adapter createTextStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.TextBuffer <em>Text Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.TextBuffer
	 * @generated
	 */
	public Adapter createTextBufferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.Placement <em>Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.Placement
	 * @generated
	 */
	public Adapter createPlacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.Rendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.Rendering
	 * @generated
	 */
	public Adapter createRenderingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.LayerOrder <em>Layer Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.LayerOrder
	 * @generated
	 */
	public Adapter createLayerOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.LayerRef <em>Layer Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.LayerRef
	 * @generated
	 */
	public Adapter createLayerRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.Properties
	 * @generated
	 */
	public Adapter createPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.SpatialRefSysProperties <em>Spatial Ref Sys Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.SpatialRefSysProperties
	 * @generated
	 */
	public Adapter createSpatialRefSysPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.TypedValue <em>Typed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.TypedValue
	 * @generated
	 */
	public Adapter createTypedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.ProjectViewSettings <em>Project View Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.ProjectViewSettings
	 * @generated
	 */
	public Adapter createProjectViewSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.qgis.project.Extent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.qgis.project.Extent
	 * @generated
	 */
	public Adapter createExtentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QgisAdapterFactory
