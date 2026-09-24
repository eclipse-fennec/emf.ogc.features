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
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A QGIS project file (.qgs), the root element qgis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.Project#getVersion <em>Version</em>}</li>
 *   <li>{@link org.qgis.project.Project#getProjectname <em>Projectname</em>}</li>
 *   <li>{@link org.qgis.project.Project#getTitle <em>Title</em>}</li>
 *   <li>{@link org.qgis.project.Project#getProjectCrs <em>Project Crs</em>}</li>
 *   <li>{@link org.qgis.project.Project#getLayerTreeGroup <em>Layer Tree Group</em>}</li>
 *   <li>{@link org.qgis.project.Project#getProjectLayers <em>Project Layers</em>}</li>
 *   <li>{@link org.qgis.project.Project#getLayerOrder <em>Layer Order</em>}</li>
 *   <li>{@link org.qgis.project.Project#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.qgis.project.Project#getViewSettings <em>View Settings</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getProject()
 * @model extendedMetaData="name='qgis' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The QGIS version the file claims to be written by.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.qgis.project.QgisPackage#getProject_Version()
	 * @model extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.qgis.project.Project#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Projectname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projectname</em>' attribute.
	 * @see #setProjectname(String)
	 * @see org.qgis.project.QgisPackage#getProject_Projectname()
	 * @model extendedMetaData="kind='attribute' name='projectname'"
	 * @generated
	 */
	String getProjectname();

	/**
	 * Sets the value of the '{@link org.qgis.project.Project#getProjectname <em>Projectname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projectname</em>' attribute.
	 * @see #getProjectname()
	 * @generated
	 */
	void setProjectname(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.qgis.project.QgisPackage#getProject_Title()
	 * @model extendedMetaData="kind='element' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.qgis.project.Project#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Project Crs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CRS of the map canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Crs</em>' containment reference.
	 * @see #setProjectCrs(Crs)
	 * @see org.qgis.project.QgisPackage#getProject_ProjectCrs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='projectCrs'"
	 * @generated
	 */
	Crs getProjectCrs();

	/**
	 * Sets the value of the '{@link org.qgis.project.Project#getProjectCrs <em>Project Crs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Crs</em>' containment reference.
	 * @see #getProjectCrs()
	 * @generated
	 */
	void setProjectCrs(Crs value);

	/**
	 * Returns the value of the '<em><b>Layer Tree Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The root of the layer tree.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layer Tree Group</em>' containment reference.
	 * @see #setLayerTreeGroup(LayerTreeGroup)
	 * @see org.qgis.project.QgisPackage#getProject_LayerTreeGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='layer-tree-group'"
	 * @generated
	 */
	LayerTreeGroup getLayerTreeGroup();

	/**
	 * Sets the value of the '{@link org.qgis.project.Project#getLayerTreeGroup <em>Layer Tree Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Tree Group</em>' containment reference.
	 * @see #getLayerTreeGroup()
	 * @generated
	 */
	void setLayerTreeGroup(LayerTreeGroup value);

	/**
	 * Returns the value of the '<em><b>Project Layers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Layers</em>' containment reference.
	 * @see #setProjectLayers(ProjectLayers)
	 * @see org.qgis.project.QgisPackage#getProject_ProjectLayers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='projectlayers'"
	 * @generated
	 */
	ProjectLayers getProjectLayers();

	/**
	 * Sets the value of the '{@link org.qgis.project.Project#getProjectLayers <em>Project Layers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Layers</em>' containment reference.
	 * @see #getProjectLayers()
	 * @generated
	 */
	void setProjectLayers(ProjectLayers value);

	/**
	 * Returns the value of the '<em><b>Layer Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Order</em>' containment reference.
	 * @see #setLayerOrder(LayerOrder)
	 * @see org.qgis.project.QgisPackage#getProject_LayerOrder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='layerorder'"
	 * @generated
	 */
	LayerOrder getLayerOrder();

	/**
	 * Sets the value of the '{@link org.qgis.project.Project#getLayerOrder <em>Layer Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Order</em>' containment reference.
	 * @see #getLayerOrder()
	 * @generated
	 */
	void setLayerOrder(LayerOrder value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(Properties)
	 * @see org.qgis.project.QgisPackage#getProject_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties'"
	 * @generated
	 */
	Properties getProperties();

	/**
	 * Sets the value of the '{@link org.qgis.project.Project#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Properties value);

	/**
	 * Returns the value of the '<em><b>View Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Settings</em>' containment reference.
	 * @see #setViewSettings(ProjectViewSettings)
	 * @see org.qgis.project.QgisPackage#getProject_ViewSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProjectViewSettings'"
	 * @generated
	 */
	ProjectViewSettings getViewSettings();

	/**
	 * Sets the value of the '{@link org.qgis.project.Project#getViewSettings <em>View Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Settings</em>' containment reference.
	 * @see #getViewSettings()
	 * @generated
	 */
	void setViewSettings(ProjectViewSettings value);

} // Project
