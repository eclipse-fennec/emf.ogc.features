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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.qgis.project.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.qgis.project.QgisPackage
 * @generated
 */
public class QgisSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QgisPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QgisSwitch() {
		if (modelPackage == null) {
			modelPackage = QgisPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QgisPackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.CRS: {
				Crs crs = (Crs)theEObject;
				T result = caseCrs(crs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.SPATIAL_REF_SYS: {
				SpatialRefSys spatialRefSys = (SpatialRefSys)theEObject;
				T result = caseSpatialRefSys(spatialRefSys);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.LAYER_TREE_GROUP: {
				LayerTreeGroup layerTreeGroup = (LayerTreeGroup)theEObject;
				T result = caseLayerTreeGroup(layerTreeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.LAYER_TREE_LAYER: {
				LayerTreeLayer layerTreeLayer = (LayerTreeLayer)theEObject;
				T result = caseLayerTreeLayer(layerTreeLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.CUSTOM_ORDER: {
				CustomOrder customOrder = (CustomOrder)theEObject;
				T result = caseCustomOrder(customOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.PROJECT_LAYERS: {
				ProjectLayers projectLayers = (ProjectLayers)theEObject;
				T result = caseProjectLayers(projectLayers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.MAP_LAYER: {
				MapLayer mapLayer = (MapLayer)theEObject;
				T result = caseMapLayer(mapLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.PROVIDER: {
				Provider provider = (Provider)theEObject;
				T result = caseProvider(provider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.RENDERER: {
				Renderer renderer = (Renderer)theEObject;
				T result = caseRenderer(renderer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.SYMBOLS: {
				Symbols symbols = (Symbols)theEObject;
				T result = caseSymbols(symbols);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.SYMBOL: {
				Symbol symbol = (Symbol)theEObject;
				T result = caseSymbol(symbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.SYMBOL_LAYER: {
				SymbolLayer symbolLayer = (SymbolLayer)theEObject;
				T result = caseSymbolLayer(symbolLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.DATA_DEFINED_PROPERTIES: {
				DataDefinedProperties dataDefinedProperties = (DataDefinedProperties)theEObject;
				T result = caseDataDefinedProperties(dataDefinedProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.OPTION: {
				Option option = (Option)theEObject;
				T result = caseOption(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.LABELING: {
				Labeling labeling = (Labeling)theEObject;
				T result = caseLabeling(labeling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.LABEL_SETTINGS: {
				LabelSettings labelSettings = (LabelSettings)theEObject;
				T result = caseLabelSettings(labelSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.TEXT_STYLE: {
				TextStyle textStyle = (TextStyle)theEObject;
				T result = caseTextStyle(textStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.TEXT_BUFFER: {
				TextBuffer textBuffer = (TextBuffer)theEObject;
				T result = caseTextBuffer(textBuffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.PLACEMENT: {
				Placement placement = (Placement)theEObject;
				T result = casePlacement(placement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.RENDERING: {
				Rendering rendering = (Rendering)theEObject;
				T result = caseRendering(rendering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.LAYER_ORDER: {
				LayerOrder layerOrder = (LayerOrder)theEObject;
				T result = caseLayerOrder(layerOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.LAYER_REF: {
				LayerRef layerRef = (LayerRef)theEObject;
				T result = caseLayerRef(layerRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.PROPERTIES: {
				Properties properties = (Properties)theEObject;
				T result = caseProperties(properties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.SPATIAL_REF_SYS_PROPERTIES: {
				SpatialRefSysProperties spatialRefSysProperties = (SpatialRefSysProperties)theEObject;
				T result = caseSpatialRefSysProperties(spatialRefSysProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.TYPED_VALUE: {
				TypedValue typedValue = (TypedValue)theEObject;
				T result = caseTypedValue(typedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.PROJECT_VIEW_SETTINGS: {
				ProjectViewSettings projectViewSettings = (ProjectViewSettings)theEObject;
				T result = caseProjectViewSettings(projectViewSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QgisPackage.EXTENT: {
				Extent extent = (Extent)theEObject;
				T result = caseExtent(extent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrs(Crs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spatial Ref Sys</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spatial Ref Sys</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpatialRefSys(SpatialRefSys object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Tree Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Tree Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerTreeGroup(LayerTreeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Tree Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Tree Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerTreeLayer(LayerTreeLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomOrder(CustomOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Layers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Layers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectLayers(ProjectLayers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapLayer(MapLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvider(Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Renderer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Renderer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenderer(Renderer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbols</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbols</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbols(Symbols object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbol(Symbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolLayer(SymbolLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Defined Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Defined Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDefinedProperties(DataDefinedProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeling(Labeling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelSettings(LabelSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextStyle(TextStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Buffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextBuffer(TextBuffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlacement(Placement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rendering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rendering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRendering(Rendering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerOrder(LayerOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerRef(LayerRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperties(Properties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spatial Ref Sys Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spatial Ref Sys Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpatialRefSysProperties(SpatialRefSysProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedValue(TypedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project View Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project View Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectViewSettings(ProjectViewSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtent(Extent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QgisSwitch
