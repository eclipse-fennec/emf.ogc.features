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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.qgis.project.CheckState;
import org.qgis.project.Crs;
import org.qgis.project.CustomOrder;
import org.qgis.project.DataDefinedProperties;
import org.qgis.project.Extent;
import org.qgis.project.LabelSettings;
import org.qgis.project.Labeling;
import org.qgis.project.LayerOrder;
import org.qgis.project.LayerRef;
import org.qgis.project.LayerTreeGroup;
import org.qgis.project.LayerTreeLayer;
import org.qgis.project.MapLayer;
import org.qgis.project.Option;
import org.qgis.project.Placement;
import org.qgis.project.Project;
import org.qgis.project.ProjectLayers;
import org.qgis.project.ProjectViewSettings;
import org.qgis.project.Properties;
import org.qgis.project.Provider;
import org.qgis.project.QgisFactory;
import org.qgis.project.QgisPackage;
import org.qgis.project.Renderer;
import org.qgis.project.Rendering;
import org.qgis.project.SpatialRefSys;
import org.qgis.project.SpatialRefSysProperties;
import org.qgis.project.Symbol;
import org.qgis.project.SymbolLayer;
import org.qgis.project.Symbols;
import org.qgis.project.TextBuffer;
import org.qgis.project.TextStyle;
import org.qgis.project.TypedValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QgisPackageImpl extends EPackageImpl implements QgisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spatialRefSysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerTreeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerTreeLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectLayersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rendererEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDefinedPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textBufferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renderingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spatialRefSysPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectViewSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum checkStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.qgis.project.QgisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QgisPackageImpl() {
		super(eNS_URI, QgisFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link QgisPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QgisPackage init() {
		if (isInited) return (QgisPackage)EPackage.Registry.INSTANCE.getEPackage(QgisPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQgisPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QgisPackageImpl theQgisPackage = registeredQgisPackage instanceof QgisPackageImpl ? (QgisPackageImpl)registeredQgisPackage : new QgisPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theQgisPackage.createPackageContents();

		// Initialize created meta-data
		theQgisPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQgisPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QgisPackage.eNS_URI, theQgisPackage);
		return theQgisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Version() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Projectname() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Title() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_ProjectCrs() {
		return (EReference)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_LayerTreeGroup() {
		return (EReference)projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_ProjectLayers() {
		return (EReference)projectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_LayerOrder() {
		return (EReference)projectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Properties() {
		return (EReference)projectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_ViewSettings() {
		return (EReference)projectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrs() {
		return crsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrs_SpatialRefSys() {
		return (EReference)crsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpatialRefSys() {
		return spatialRefSysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpatialRefSys_NativeFormat() {
		return (EAttribute)spatialRefSysEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpatialRefSys_Wkt() {
		return (EAttribute)spatialRefSysEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpatialRefSys_Proj4() {
		return (EAttribute)spatialRefSysEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpatialRefSys_Srsid() {
		return (EAttribute)spatialRefSysEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpatialRefSys_Srid() {
		return (EAttribute)spatialRefSysEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpatialRefSys_Authid() {
		return (EAttribute)spatialRefSysEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpatialRefSys_Description() {
		return (EAttribute)spatialRefSysEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpatialRefSys_Projectionacronym() {
		return (EAttribute)spatialRefSysEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpatialRefSys_Ellipsoidacronym() {
		return (EAttribute)spatialRefSysEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpatialRefSys_Geographicflag() {
		return (EAttribute)spatialRefSysEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayerTreeGroup() {
		return layerTreeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerTreeGroup_Name() {
		return (EAttribute)layerTreeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerTreeGroup_Checked() {
		return (EAttribute)layerTreeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerTreeGroup_Expanded() {
		return (EAttribute)layerTreeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerTreeGroup_Groups() {
		return (EReference)layerTreeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerTreeGroup_Layers() {
		return (EReference)layerTreeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerTreeGroup_CustomOrder() {
		return (EReference)layerTreeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayerTreeLayer() {
		return layerTreeLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerTreeLayer_Id() {
		return (EAttribute)layerTreeLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerTreeLayer_Name() {
		return (EAttribute)layerTreeLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerTreeLayer_ProviderKey() {
		return (EAttribute)layerTreeLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerTreeLayer_Source() {
		return (EAttribute)layerTreeLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerTreeLayer_Checked() {
		return (EAttribute)layerTreeLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerTreeLayer_Expanded() {
		return (EAttribute)layerTreeLayerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomOrder() {
		return customOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomOrder_Enabled() {
		return (EAttribute)customOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomOrder_Items() {
		return (EAttribute)customOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectLayers() {
		return projectLayersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjectLayers_Layers() {
		return (EReference)projectLayersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMapLayer() {
		return mapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapLayer_Type() {
		return (EAttribute)mapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapLayer_Geometry() {
		return (EAttribute)mapLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapLayer_Id() {
		return (EAttribute)mapLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapLayer_Datasource() {
		return (EAttribute)mapLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapLayer_Layername() {
		return (EAttribute)mapLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapLayer_Srs() {
		return (EReference)mapLayerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapLayer_Provider() {
		return (EReference)mapLayerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapLayer_Renderer() {
		return (EReference)mapLayerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapLayer_Labeling() {
		return (EReference)mapLayerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProvider_Encoding() {
		return (EAttribute)providerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProvider_Key() {
		return (EAttribute)providerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRenderer() {
		return rendererEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRenderer_Type() {
		return (EAttribute)rendererEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRenderer_Symbollevels() {
		return (EAttribute)rendererEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRenderer_Enableorderby() {
		return (EAttribute)rendererEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRenderer_Forceraster() {
		return (EAttribute)rendererEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRenderer_Symbols() {
		return (EReference)rendererEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSymbols() {
		return symbolsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSymbols_Symbols() {
		return (EReference)symbolsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSymbol() {
		return symbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbol_Type() {
		return (EAttribute)symbolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbol_Name() {
		return (EAttribute)symbolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbol_Alpha() {
		return (EAttribute)symbolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbol_ClipToExtent() {
		return (EAttribute)symbolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbol_ForceRhr() {
		return (EAttribute)symbolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSymbol_Layers() {
		return (EReference)symbolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSymbolLayer() {
		return symbolLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolLayer_LayerClass() {
		return (EAttribute)symbolLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolLayer_Enabled() {
		return (EAttribute)symbolLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolLayer_Locked() {
		return (EAttribute)symbolLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolLayer_Pass() {
		return (EAttribute)symbolLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSymbolLayer_Options() {
		return (EReference)symbolLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSymbolLayer_DataDefinedProperties() {
		return (EReference)symbolLayerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataDefinedProperties() {
		return dataDefinedPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataDefinedProperties_Option() {
		return (EReference)dataDefinedPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOption_Name() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOption_Type() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOption_Value() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOption_Options() {
		return (EReference)optionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabeling() {
		return labelingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabeling_Type() {
		return (EAttribute)labelingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabeling_Settings() {
		return (EReference)labelingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelSettings() {
		return labelSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelSettings_CalloutType() {
		return (EAttribute)labelSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelSettings_TextStyle() {
		return (EReference)labelSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelSettings_Placement() {
		return (EReference)labelSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelSettings_Rendering() {
		return (EReference)labelSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextStyle() {
		return textStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_FieldName() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_IsExpression() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_FontSize() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextColor() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextStyle_TextBuffer() {
		return (EReference)textStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextBuffer() {
		return textBufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextBuffer_BufferDraw() {
		return (EAttribute)textBufferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextBuffer_BufferSize() {
		return (EAttribute)textBufferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextBuffer_BufferColor() {
		return (EAttribute)textBufferEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlacement() {
		return placementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacement_Placement() {
		return (EAttribute)placementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRendering() {
		return renderingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRendering_ScaleVisibility() {
		return (EAttribute)renderingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRendering_ScaleMin() {
		return (EAttribute)renderingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRendering_ScaleMax() {
		return (EAttribute)renderingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayerOrder() {
		return layerOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerOrder_Layers() {
		return (EReference)layerOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayerRef() {
		return layerRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerRef_Id() {
		return (EAttribute)layerRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperties() {
		return propertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperties_SpatialRefSys() {
		return (EReference)propertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpatialRefSysProperties() {
		return spatialRefSysPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpatialRefSysProperties_ProjectionsEnabled() {
		return (EReference)spatialRefSysPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypedValue() {
		return typedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedValue_Type() {
		return (EAttribute)typedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedValue_Value() {
		return (EAttribute)typedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectViewSettings() {
		return projectViewSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectViewSettings_UseProjectScales() {
		return (EAttribute)projectViewSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectViewSettings_Rotation() {
		return (EAttribute)projectViewSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjectViewSettings_DefaultViewExtent() {
		return (EReference)projectViewSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtent() {
		return extentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtent_Xmin() {
		return (EAttribute)extentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtent_Ymin() {
		return (EAttribute)extentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtent_Xmax() {
		return (EAttribute)extentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtent_Ymax() {
		return (EAttribute)extentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtent_SpatialRefSys() {
		return (EReference)extentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCheckState() {
		return checkStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QgisFactory getQgisFactory() {
		return (QgisFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__VERSION);
		createEAttribute(projectEClass, PROJECT__PROJECTNAME);
		createEAttribute(projectEClass, PROJECT__TITLE);
		createEReference(projectEClass, PROJECT__PROJECT_CRS);
		createEReference(projectEClass, PROJECT__LAYER_TREE_GROUP);
		createEReference(projectEClass, PROJECT__PROJECT_LAYERS);
		createEReference(projectEClass, PROJECT__LAYER_ORDER);
		createEReference(projectEClass, PROJECT__PROPERTIES);
		createEReference(projectEClass, PROJECT__VIEW_SETTINGS);

		crsEClass = createEClass(CRS);
		createEReference(crsEClass, CRS__SPATIAL_REF_SYS);

		spatialRefSysEClass = createEClass(SPATIAL_REF_SYS);
		createEAttribute(spatialRefSysEClass, SPATIAL_REF_SYS__NATIVE_FORMAT);
		createEAttribute(spatialRefSysEClass, SPATIAL_REF_SYS__WKT);
		createEAttribute(spatialRefSysEClass, SPATIAL_REF_SYS__PROJ4);
		createEAttribute(spatialRefSysEClass, SPATIAL_REF_SYS__SRSID);
		createEAttribute(spatialRefSysEClass, SPATIAL_REF_SYS__SRID);
		createEAttribute(spatialRefSysEClass, SPATIAL_REF_SYS__AUTHID);
		createEAttribute(spatialRefSysEClass, SPATIAL_REF_SYS__DESCRIPTION);
		createEAttribute(spatialRefSysEClass, SPATIAL_REF_SYS__PROJECTIONACRONYM);
		createEAttribute(spatialRefSysEClass, SPATIAL_REF_SYS__ELLIPSOIDACRONYM);
		createEAttribute(spatialRefSysEClass, SPATIAL_REF_SYS__GEOGRAPHICFLAG);

		layerTreeGroupEClass = createEClass(LAYER_TREE_GROUP);
		createEAttribute(layerTreeGroupEClass, LAYER_TREE_GROUP__NAME);
		createEAttribute(layerTreeGroupEClass, LAYER_TREE_GROUP__CHECKED);
		createEAttribute(layerTreeGroupEClass, LAYER_TREE_GROUP__EXPANDED);
		createEReference(layerTreeGroupEClass, LAYER_TREE_GROUP__GROUPS);
		createEReference(layerTreeGroupEClass, LAYER_TREE_GROUP__LAYERS);
		createEReference(layerTreeGroupEClass, LAYER_TREE_GROUP__CUSTOM_ORDER);

		layerTreeLayerEClass = createEClass(LAYER_TREE_LAYER);
		createEAttribute(layerTreeLayerEClass, LAYER_TREE_LAYER__ID);
		createEAttribute(layerTreeLayerEClass, LAYER_TREE_LAYER__NAME);
		createEAttribute(layerTreeLayerEClass, LAYER_TREE_LAYER__PROVIDER_KEY);
		createEAttribute(layerTreeLayerEClass, LAYER_TREE_LAYER__SOURCE);
		createEAttribute(layerTreeLayerEClass, LAYER_TREE_LAYER__CHECKED);
		createEAttribute(layerTreeLayerEClass, LAYER_TREE_LAYER__EXPANDED);

		customOrderEClass = createEClass(CUSTOM_ORDER);
		createEAttribute(customOrderEClass, CUSTOM_ORDER__ENABLED);
		createEAttribute(customOrderEClass, CUSTOM_ORDER__ITEMS);

		projectLayersEClass = createEClass(PROJECT_LAYERS);
		createEReference(projectLayersEClass, PROJECT_LAYERS__LAYERS);

		mapLayerEClass = createEClass(MAP_LAYER);
		createEAttribute(mapLayerEClass, MAP_LAYER__TYPE);
		createEAttribute(mapLayerEClass, MAP_LAYER__GEOMETRY);
		createEAttribute(mapLayerEClass, MAP_LAYER__ID);
		createEAttribute(mapLayerEClass, MAP_LAYER__DATASOURCE);
		createEAttribute(mapLayerEClass, MAP_LAYER__LAYERNAME);
		createEReference(mapLayerEClass, MAP_LAYER__SRS);
		createEReference(mapLayerEClass, MAP_LAYER__PROVIDER);
		createEReference(mapLayerEClass, MAP_LAYER__RENDERER);
		createEReference(mapLayerEClass, MAP_LAYER__LABELING);

		providerEClass = createEClass(PROVIDER);
		createEAttribute(providerEClass, PROVIDER__ENCODING);
		createEAttribute(providerEClass, PROVIDER__KEY);

		rendererEClass = createEClass(RENDERER);
		createEAttribute(rendererEClass, RENDERER__TYPE);
		createEAttribute(rendererEClass, RENDERER__SYMBOLLEVELS);
		createEAttribute(rendererEClass, RENDERER__ENABLEORDERBY);
		createEAttribute(rendererEClass, RENDERER__FORCERASTER);
		createEReference(rendererEClass, RENDERER__SYMBOLS);

		symbolsEClass = createEClass(SYMBOLS);
		createEReference(symbolsEClass, SYMBOLS__SYMBOLS);

		symbolEClass = createEClass(SYMBOL);
		createEAttribute(symbolEClass, SYMBOL__TYPE);
		createEAttribute(symbolEClass, SYMBOL__NAME);
		createEAttribute(symbolEClass, SYMBOL__ALPHA);
		createEAttribute(symbolEClass, SYMBOL__CLIP_TO_EXTENT);
		createEAttribute(symbolEClass, SYMBOL__FORCE_RHR);
		createEReference(symbolEClass, SYMBOL__LAYERS);

		symbolLayerEClass = createEClass(SYMBOL_LAYER);
		createEAttribute(symbolLayerEClass, SYMBOL_LAYER__LAYER_CLASS);
		createEAttribute(symbolLayerEClass, SYMBOL_LAYER__ENABLED);
		createEAttribute(symbolLayerEClass, SYMBOL_LAYER__LOCKED);
		createEAttribute(symbolLayerEClass, SYMBOL_LAYER__PASS);
		createEReference(symbolLayerEClass, SYMBOL_LAYER__OPTIONS);
		createEReference(symbolLayerEClass, SYMBOL_LAYER__DATA_DEFINED_PROPERTIES);

		dataDefinedPropertiesEClass = createEClass(DATA_DEFINED_PROPERTIES);
		createEReference(dataDefinedPropertiesEClass, DATA_DEFINED_PROPERTIES__OPTION);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__NAME);
		createEAttribute(optionEClass, OPTION__TYPE);
		createEAttribute(optionEClass, OPTION__VALUE);
		createEReference(optionEClass, OPTION__OPTIONS);

		labelingEClass = createEClass(LABELING);
		createEAttribute(labelingEClass, LABELING__TYPE);
		createEReference(labelingEClass, LABELING__SETTINGS);

		labelSettingsEClass = createEClass(LABEL_SETTINGS);
		createEAttribute(labelSettingsEClass, LABEL_SETTINGS__CALLOUT_TYPE);
		createEReference(labelSettingsEClass, LABEL_SETTINGS__TEXT_STYLE);
		createEReference(labelSettingsEClass, LABEL_SETTINGS__PLACEMENT);
		createEReference(labelSettingsEClass, LABEL_SETTINGS__RENDERING);

		textStyleEClass = createEClass(TEXT_STYLE);
		createEAttribute(textStyleEClass, TEXT_STYLE__FIELD_NAME);
		createEAttribute(textStyleEClass, TEXT_STYLE__IS_EXPRESSION);
		createEAttribute(textStyleEClass, TEXT_STYLE__FONT_SIZE);
		createEAttribute(textStyleEClass, TEXT_STYLE__TEXT_COLOR);
		createEReference(textStyleEClass, TEXT_STYLE__TEXT_BUFFER);

		textBufferEClass = createEClass(TEXT_BUFFER);
		createEAttribute(textBufferEClass, TEXT_BUFFER__BUFFER_DRAW);
		createEAttribute(textBufferEClass, TEXT_BUFFER__BUFFER_SIZE);
		createEAttribute(textBufferEClass, TEXT_BUFFER__BUFFER_COLOR);

		placementEClass = createEClass(PLACEMENT);
		createEAttribute(placementEClass, PLACEMENT__PLACEMENT);

		renderingEClass = createEClass(RENDERING);
		createEAttribute(renderingEClass, RENDERING__SCALE_VISIBILITY);
		createEAttribute(renderingEClass, RENDERING__SCALE_MIN);
		createEAttribute(renderingEClass, RENDERING__SCALE_MAX);

		layerOrderEClass = createEClass(LAYER_ORDER);
		createEReference(layerOrderEClass, LAYER_ORDER__LAYERS);

		layerRefEClass = createEClass(LAYER_REF);
		createEAttribute(layerRefEClass, LAYER_REF__ID);

		propertiesEClass = createEClass(PROPERTIES);
		createEReference(propertiesEClass, PROPERTIES__SPATIAL_REF_SYS);

		spatialRefSysPropertiesEClass = createEClass(SPATIAL_REF_SYS_PROPERTIES);
		createEReference(spatialRefSysPropertiesEClass, SPATIAL_REF_SYS_PROPERTIES__PROJECTIONS_ENABLED);

		typedValueEClass = createEClass(TYPED_VALUE);
		createEAttribute(typedValueEClass, TYPED_VALUE__TYPE);
		createEAttribute(typedValueEClass, TYPED_VALUE__VALUE);

		projectViewSettingsEClass = createEClass(PROJECT_VIEW_SETTINGS);
		createEAttribute(projectViewSettingsEClass, PROJECT_VIEW_SETTINGS__USE_PROJECT_SCALES);
		createEAttribute(projectViewSettingsEClass, PROJECT_VIEW_SETTINGS__ROTATION);
		createEReference(projectViewSettingsEClass, PROJECT_VIEW_SETTINGS__DEFAULT_VIEW_EXTENT);

		extentEClass = createEClass(EXTENT);
		createEAttribute(extentEClass, EXTENT__XMIN);
		createEAttribute(extentEClass, EXTENT__YMIN);
		createEAttribute(extentEClass, EXTENT__XMAX);
		createEAttribute(extentEClass, EXTENT__YMAX);
		createEReference(extentEClass, EXTENT__SPATIAL_REF_SYS);

		// Create enums
		checkStateEEnum = createEEnum(CHECK_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_Version(), ecorePackage.getEString(), "version", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Projectname(), ecorePackage.getEString(), "projectname", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Title(), ecorePackage.getEString(), "title", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_ProjectCrs(), this.getCrs(), null, "projectCrs", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_LayerTreeGroup(), this.getLayerTreeGroup(), null, "layerTreeGroup", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_ProjectLayers(), this.getProjectLayers(), null, "projectLayers", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_LayerOrder(), this.getLayerOrder(), null, "layerOrder", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Properties(), this.getProperties(), null, "properties", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_ViewSettings(), this.getProjectViewSettings(), null, "viewSettings", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crsEClass, Crs.class, "Crs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrs_SpatialRefSys(), this.getSpatialRefSys(), null, "spatialRefSys", null, 0, 1, Crs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spatialRefSysEClass, SpatialRefSys.class, "SpatialRefSys", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpatialRefSys_NativeFormat(), ecorePackage.getEString(), "nativeFormat", null, 0, 1, SpatialRefSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpatialRefSys_Wkt(), ecorePackage.getEString(), "wkt", null, 0, 1, SpatialRefSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpatialRefSys_Proj4(), ecorePackage.getEString(), "proj4", null, 0, 1, SpatialRefSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpatialRefSys_Srsid(), ecorePackage.getEString(), "srsid", null, 0, 1, SpatialRefSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpatialRefSys_Srid(), ecorePackage.getEString(), "srid", null, 0, 1, SpatialRefSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpatialRefSys_Authid(), ecorePackage.getEString(), "authid", null, 0, 1, SpatialRefSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpatialRefSys_Description(), ecorePackage.getEString(), "description", null, 0, 1, SpatialRefSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpatialRefSys_Projectionacronym(), ecorePackage.getEString(), "projectionacronym", null, 0, 1, SpatialRefSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpatialRefSys_Ellipsoidacronym(), ecorePackage.getEString(), "ellipsoidacronym", null, 0, 1, SpatialRefSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpatialRefSys_Geographicflag(), ecorePackage.getEString(), "geographicflag", null, 0, 1, SpatialRefSys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerTreeGroupEClass, LayerTreeGroup.class, "LayerTreeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayerTreeGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, LayerTreeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerTreeGroup_Checked(), this.getCheckState(), "checked", null, 0, 1, LayerTreeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerTreeGroup_Expanded(), ecorePackage.getEString(), "expanded", null, 0, 1, LayerTreeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerTreeGroup_Groups(), this.getLayerTreeGroup(), null, "groups", null, 0, -1, LayerTreeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerTreeGroup_Layers(), this.getLayerTreeLayer(), null, "layers", null, 0, -1, LayerTreeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerTreeGroup_CustomOrder(), this.getCustomOrder(), null, "customOrder", null, 0, 1, LayerTreeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerTreeLayerEClass, LayerTreeLayer.class, "LayerTreeLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayerTreeLayer_Id(), ecorePackage.getEString(), "id", null, 0, 1, LayerTreeLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerTreeLayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, LayerTreeLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerTreeLayer_ProviderKey(), ecorePackage.getEString(), "providerKey", null, 0, 1, LayerTreeLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerTreeLayer_Source(), ecorePackage.getEString(), "source", null, 0, 1, LayerTreeLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerTreeLayer_Checked(), this.getCheckState(), "checked", null, 0, 1, LayerTreeLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerTreeLayer_Expanded(), ecorePackage.getEString(), "expanded", null, 0, 1, LayerTreeLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customOrderEClass, CustomOrder.class, "CustomOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomOrder_Enabled(), ecorePackage.getEString(), "enabled", null, 0, 1, CustomOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomOrder_Items(), ecorePackage.getEString(), "items", null, 0, -1, CustomOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectLayersEClass, ProjectLayers.class, "ProjectLayers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjectLayers_Layers(), this.getMapLayer(), null, "layers", null, 0, -1, ProjectLayers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapLayerEClass, MapLayer.class, "MapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapLayer_Type(), ecorePackage.getEString(), "type", null, 0, 1, MapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapLayer_Geometry(), ecorePackage.getEString(), "geometry", null, 0, 1, MapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapLayer_Id(), ecorePackage.getEString(), "id", null, 0, 1, MapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapLayer_Datasource(), ecorePackage.getEString(), "datasource", null, 0, 1, MapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapLayer_Layername(), ecorePackage.getEString(), "layername", null, 0, 1, MapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapLayer_Srs(), this.getCrs(), null, "srs", null, 0, 1, MapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapLayer_Provider(), this.getProvider(), null, "provider", null, 0, 1, MapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapLayer_Renderer(), this.getRenderer(), null, "renderer", null, 0, 1, MapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapLayer_Labeling(), this.getLabeling(), null, "labeling", null, 0, 1, MapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvider_Encoding(), ecorePackage.getEString(), "encoding", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvider_Key(), ecorePackage.getEString(), "key", null, 0, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rendererEClass, Renderer.class, "Renderer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenderer_Type(), ecorePackage.getEString(), "type", null, 0, 1, Renderer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenderer_Symbollevels(), ecorePackage.getEString(), "symbollevels", null, 0, 1, Renderer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenderer_Enableorderby(), ecorePackage.getEString(), "enableorderby", null, 0, 1, Renderer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenderer_Forceraster(), ecorePackage.getEString(), "forceraster", null, 0, 1, Renderer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRenderer_Symbols(), this.getSymbols(), null, "symbols", null, 0, 1, Renderer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolsEClass, Symbols.class, "Symbols", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymbols_Symbols(), this.getSymbol(), null, "symbols", null, 0, -1, Symbols.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolEClass, Symbol.class, "Symbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymbol_Type(), ecorePackage.getEString(), "type", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymbol_Name(), ecorePackage.getEString(), "name", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymbol_Alpha(), ecorePackage.getEString(), "alpha", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymbol_ClipToExtent(), ecorePackage.getEString(), "clipToExtent", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymbol_ForceRhr(), ecorePackage.getEString(), "forceRhr", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymbol_Layers(), this.getSymbolLayer(), null, "layers", null, 0, -1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolLayerEClass, SymbolLayer.class, "SymbolLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymbolLayer_LayerClass(), ecorePackage.getEString(), "layerClass", null, 0, 1, SymbolLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymbolLayer_Enabled(), ecorePackage.getEString(), "enabled", null, 0, 1, SymbolLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymbolLayer_Locked(), ecorePackage.getEString(), "locked", null, 0, 1, SymbolLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymbolLayer_Pass(), ecorePackage.getEString(), "pass", null, 0, 1, SymbolLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymbolLayer_Options(), this.getOption(), null, "options", null, 0, 1, SymbolLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymbolLayer_DataDefinedProperties(), this.getDataDefinedProperties(), null, "dataDefinedProperties", null, 0, 1, SymbolLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataDefinedPropertiesEClass, DataDefinedProperties.class, "DataDefinedProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataDefinedProperties_Option(), this.getOption(), null, "option", null, 0, 1, DataDefinedProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Type(), ecorePackage.getEString(), "type", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Value(), ecorePackage.getEString(), "value", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOption_Options(), this.getOption(), null, "options", null, 0, -1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelingEClass, Labeling.class, "Labeling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabeling_Type(), ecorePackage.getEString(), "type", null, 0, 1, Labeling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabeling_Settings(), this.getLabelSettings(), null, "settings", null, 0, 1, Labeling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelSettingsEClass, LabelSettings.class, "LabelSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelSettings_CalloutType(), ecorePackage.getEString(), "calloutType", null, 0, 1, LabelSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelSettings_TextStyle(), this.getTextStyle(), null, "textStyle", null, 0, 1, LabelSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelSettings_Placement(), this.getPlacement(), null, "placement", null, 0, 1, LabelSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelSettings_Rendering(), this.getRendering(), null, "rendering", null, 0, 1, LabelSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textStyleEClass, TextStyle.class, "TextStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextStyle_FieldName(), ecorePackage.getEString(), "fieldName", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_IsExpression(), ecorePackage.getEString(), "isExpression", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_FontSize(), ecorePackage.getEString(), "fontSize", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_TextColor(), ecorePackage.getEString(), "textColor", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextStyle_TextBuffer(), this.getTextBuffer(), null, "textBuffer", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textBufferEClass, TextBuffer.class, "TextBuffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextBuffer_BufferDraw(), ecorePackage.getEString(), "bufferDraw", null, 0, 1, TextBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextBuffer_BufferSize(), ecorePackage.getEString(), "bufferSize", null, 0, 1, TextBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextBuffer_BufferColor(), ecorePackage.getEString(), "bufferColor", null, 0, 1, TextBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placementEClass, Placement.class, "Placement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlacement_Placement(), ecorePackage.getEString(), "placement", null, 0, 1, Placement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renderingEClass, Rendering.class, "Rendering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRendering_ScaleVisibility(), ecorePackage.getEString(), "scaleVisibility", null, 0, 1, Rendering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRendering_ScaleMin(), ecorePackage.getEString(), "scaleMin", null, 0, 1, Rendering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRendering_ScaleMax(), ecorePackage.getEString(), "scaleMax", null, 0, 1, Rendering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerOrderEClass, LayerOrder.class, "LayerOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerOrder_Layers(), this.getLayerRef(), null, "layers", null, 0, -1, LayerOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerRefEClass, LayerRef.class, "LayerRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayerRef_Id(), ecorePackage.getEString(), "id", null, 0, 1, LayerRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperties_SpatialRefSys(), this.getSpatialRefSysProperties(), null, "spatialRefSys", null, 0, 1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spatialRefSysPropertiesEClass, SpatialRefSysProperties.class, "SpatialRefSysProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpatialRefSysProperties_ProjectionsEnabled(), this.getTypedValue(), null, "projectionsEnabled", null, 0, 1, SpatialRefSysProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedValueEClass, TypedValue.class, "TypedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedValue_Type(), ecorePackage.getEString(), "type", null, 0, 1, TypedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, TypedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectViewSettingsEClass, ProjectViewSettings.class, "ProjectViewSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectViewSettings_UseProjectScales(), ecorePackage.getEString(), "useProjectScales", null, 0, 1, ProjectViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectViewSettings_Rotation(), ecorePackage.getEString(), "rotation", null, 0, 1, ProjectViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectViewSettings_DefaultViewExtent(), this.getExtent(), null, "defaultViewExtent", null, 0, 1, ProjectViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extentEClass, Extent.class, "Extent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtent_Xmin(), ecorePackage.getEDouble(), "xmin", null, 0, 1, Extent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtent_Ymin(), ecorePackage.getEDouble(), "ymin", null, 0, 1, Extent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtent_Xmax(), ecorePackage.getEDouble(), "xmax", null, 0, 1, Extent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtent_Ymax(), ecorePackage.getEDouble(), "ymax", null, 0, 1, Extent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtent_SpatialRefSys(), this.getSpatialRefSys(), null, "spatialRefSys", null, 0, 1, Extent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(checkStateEEnum, CheckState.class, "CheckState");
		addEEnumLiteral(checkStateEEnum, CheckState.CHECKED);
		addEEnumLiteral(checkStateEEnum, CheckState.UNCHECKED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "qualified", "false"
		   });
		addAnnotation
		  (projectEClass,
		   source,
		   new String[] {
			   "name", "qgis",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProject_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
		   });
		addAnnotation
		  (getProject_Projectname(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "projectname"
		   });
		addAnnotation
		  (getProject_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "title"
		   });
		addAnnotation
		  (getProject_ProjectCrs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "projectCrs"
		   });
		addAnnotation
		  (getProject_LayerTreeGroup(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "layer-tree-group"
		   });
		addAnnotation
		  (getProject_ProjectLayers(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "projectlayers"
		   });
		addAnnotation
		  (getProject_LayerOrder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "layerorder"
		   });
		addAnnotation
		  (getProject_Properties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "properties"
		   });
		addAnnotation
		  (getProject_ViewSettings(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ProjectViewSettings"
		   });
		addAnnotation
		  (crsEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCrs_SpatialRefSys(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "spatialrefsys"
		   });
		addAnnotation
		  (spatialRefSysEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSpatialRefSys_NativeFormat(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nativeFormat"
		   });
		addAnnotation
		  (getSpatialRefSys_Wkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wkt"
		   });
		addAnnotation
		  (getSpatialRefSys_Proj4(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "proj4"
		   });
		addAnnotation
		  (getSpatialRefSys_Srsid(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "srsid"
		   });
		addAnnotation
		  (getSpatialRefSys_Srid(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "srid"
		   });
		addAnnotation
		  (getSpatialRefSys_Authid(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "authid"
		   });
		addAnnotation
		  (getSpatialRefSys_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description"
		   });
		addAnnotation
		  (getSpatialRefSys_Projectionacronym(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "projectionacronym"
		   });
		addAnnotation
		  (getSpatialRefSys_Ellipsoidacronym(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ellipsoidacronym"
		   });
		addAnnotation
		  (getSpatialRefSys_Geographicflag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geographicflag"
		   });
		addAnnotation
		  (layerTreeGroupEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLayerTreeGroup_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getLayerTreeGroup_Checked(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "checked"
		   });
		addAnnotation
		  (getLayerTreeGroup_Expanded(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "expanded"
		   });
		addAnnotation
		  (getLayerTreeGroup_Groups(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "layer-tree-group"
		   });
		addAnnotation
		  (getLayerTreeGroup_Layers(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "layer-tree-layer"
		   });
		addAnnotation
		  (getLayerTreeGroup_CustomOrder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "custom-order"
		   });
		addAnnotation
		  (layerTreeLayerEClass,
		   source,
		   new String[] {
			   "kind", "empty"
		   });
		addAnnotation
		  (getLayerTreeLayer_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getLayerTreeLayer_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getLayerTreeLayer_ProviderKey(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "providerKey"
		   });
		addAnnotation
		  (getLayerTreeLayer_Source(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "source"
		   });
		addAnnotation
		  (getLayerTreeLayer_Checked(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "checked"
		   });
		addAnnotation
		  (getLayerTreeLayer_Expanded(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "expanded"
		   });
		addAnnotation
		  (customOrderEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCustomOrder_Enabled(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "enabled"
		   });
		addAnnotation
		  (getCustomOrder_Items(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "item"
		   });
		addAnnotation
		  (projectLayersEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProjectLayers_Layers(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "maplayer"
		   });
		addAnnotation
		  (mapLayerEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMapLayer_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (getMapLayer_Geometry(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "geometry"
		   });
		addAnnotation
		  (getMapLayer_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id"
		   });
		addAnnotation
		  (getMapLayer_Datasource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "datasource"
		   });
		addAnnotation
		  (getMapLayer_Layername(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "layername"
		   });
		addAnnotation
		  (getMapLayer_Srs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "srs"
		   });
		addAnnotation
		  (getMapLayer_Provider(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "provider"
		   });
		addAnnotation
		  (getMapLayer_Renderer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "renderer-v2"
		   });
		addAnnotation
		  (getMapLayer_Labeling(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "labeling"
		   });
		addAnnotation
		  (providerEClass,
		   source,
		   new String[] {
			   "kind", "simple"
		   });
		addAnnotation
		  (getProvider_Encoding(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "encoding"
		   });
		addAnnotation
		  (getProvider_Key(),
		   source,
		   new String[] {
			   "kind", "simple",
			   "name", ":0"
		   });
		addAnnotation
		  (rendererEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRenderer_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (getRenderer_Symbollevels(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "symbollevels"
		   });
		addAnnotation
		  (getRenderer_Enableorderby(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "enableorderby"
		   });
		addAnnotation
		  (getRenderer_Forceraster(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "forceraster"
		   });
		addAnnotation
		  (getRenderer_Symbols(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "symbols"
		   });
		addAnnotation
		  (symbolsEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSymbols_Symbols(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "symbol"
		   });
		addAnnotation
		  (symbolEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSymbol_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (getSymbol_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getSymbol_Alpha(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "alpha"
		   });
		addAnnotation
		  (getSymbol_ClipToExtent(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "clip_to_extent"
		   });
		addAnnotation
		  (getSymbol_ForceRhr(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "force_rhr"
		   });
		addAnnotation
		  (getSymbol_Layers(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "layer"
		   });
		addAnnotation
		  (symbolLayerEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSymbolLayer_LayerClass(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "class"
		   });
		addAnnotation
		  (getSymbolLayer_Enabled(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "enabled"
		   });
		addAnnotation
		  (getSymbolLayer_Locked(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "locked"
		   });
		addAnnotation
		  (getSymbolLayer_Pass(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "pass"
		   });
		addAnnotation
		  (getSymbolLayer_Options(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Option"
		   });
		addAnnotation
		  (getSymbolLayer_DataDefinedProperties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "data_defined_properties"
		   });
		addAnnotation
		  (dataDefinedPropertiesEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDataDefinedProperties_Option(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Option"
		   });
		addAnnotation
		  (optionEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOption_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getOption_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (getOption_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (getOption_Options(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Option"
		   });
		addAnnotation
		  (labelingEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLabeling_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (getLabeling_Settings(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "settings"
		   });
		addAnnotation
		  (labelSettingsEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLabelSettings_CalloutType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "calloutType"
		   });
		addAnnotation
		  (getLabelSettings_TextStyle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text-style"
		   });
		addAnnotation
		  (getLabelSettings_Placement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "placement"
		   });
		addAnnotation
		  (getLabelSettings_Rendering(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rendering"
		   });
		addAnnotation
		  (textStyleEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTextStyle_FieldName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fieldName"
		   });
		addAnnotation
		  (getTextStyle_IsExpression(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isExpression"
		   });
		addAnnotation
		  (getTextStyle_FontSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "fontSize"
		   });
		addAnnotation
		  (getTextStyle_TextColor(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "textColor"
		   });
		addAnnotation
		  (getTextStyle_TextBuffer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text-buffer"
		   });
		addAnnotation
		  (textBufferEClass,
		   source,
		   new String[] {
			   "kind", "empty"
		   });
		addAnnotation
		  (getTextBuffer_BufferDraw(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "bufferDraw"
		   });
		addAnnotation
		  (getTextBuffer_BufferSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "bufferSize"
		   });
		addAnnotation
		  (getTextBuffer_BufferColor(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "bufferColor"
		   });
		addAnnotation
		  (placementEClass,
		   source,
		   new String[] {
			   "kind", "empty"
		   });
		addAnnotation
		  (getPlacement_Placement(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "placement"
		   });
		addAnnotation
		  (renderingEClass,
		   source,
		   new String[] {
			   "kind", "empty"
		   });
		addAnnotation
		  (getRendering_ScaleVisibility(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "scaleVisibility"
		   });
		addAnnotation
		  (getRendering_ScaleMin(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "scaleMin"
		   });
		addAnnotation
		  (getRendering_ScaleMax(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "scaleMax"
		   });
		addAnnotation
		  (layerOrderEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLayerOrder_Layers(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "layer"
		   });
		addAnnotation
		  (layerRefEClass,
		   source,
		   new String[] {
			   "kind", "empty"
		   });
		addAnnotation
		  (getLayerRef_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (propertiesEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProperties_SpatialRefSys(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpatialRefSys"
		   });
		addAnnotation
		  (spatialRefSysPropertiesEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSpatialRefSysProperties_ProjectionsEnabled(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ProjectionsEnabled"
		   });
		addAnnotation
		  (typedValueEClass,
		   source,
		   new String[] {
			   "kind", "simple"
		   });
		addAnnotation
		  (getTypedValue_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (getTypedValue_Value(),
		   source,
		   new String[] {
			   "kind", "simple",
			   "name", ":0"
		   });
		addAnnotation
		  (projectViewSettingsEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProjectViewSettings_UseProjectScales(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "UseProjectScales"
		   });
		addAnnotation
		  (getProjectViewSettings_Rotation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "rotation"
		   });
		addAnnotation
		  (getProjectViewSettings_DefaultViewExtent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DefaultViewExtent"
		   });
		addAnnotation
		  (extentEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExtent_Xmin(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmin"
		   });
		addAnnotation
		  (getExtent_Ymin(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ymin"
		   });
		addAnnotation
		  (getExtent_Xmax(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmax"
		   });
		addAnnotation
		  (getExtent_Ymax(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ymax"
		   });
		addAnnotation
		  (getExtent_SpatialRefSys(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "spatialrefsys"
		   });
	}

} //QgisPackageImpl
