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
 * A representation of the model object '<em><b>Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A vector or raster layer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.MapLayer#getType <em>Type</em>}</li>
 *   <li>{@link org.qgis.project.MapLayer#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.qgis.project.MapLayer#getId <em>Id</em>}</li>
 *   <li>{@link org.qgis.project.MapLayer#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link org.qgis.project.MapLayer#getLayername <em>Layername</em>}</li>
 *   <li>{@link org.qgis.project.MapLayer#getSrs <em>Srs</em>}</li>
 *   <li>{@link org.qgis.project.MapLayer#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.qgis.project.MapLayer#getRenderer <em>Renderer</em>}</li>
 *   <li>{@link org.qgis.project.MapLayer#getLabeling <em>Labeling</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getMapLayer()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MapLayer extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * vector or raster
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.qgis.project.QgisPackage#getMapLayer_Type()
	 * @model extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.qgis.project.MapLayer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Point, Line or Polygon; QGIS takes the actual type from the provider.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry</em>' attribute.
	 * @see #setGeometry(String)
	 * @see org.qgis.project.QgisPackage#getMapLayer_Geometry()
	 * @model extendedMetaData="kind='attribute' name='geometry'"
	 * @generated
	 */
	String getGeometry();

	/**
	 * Sets the value of the '{@link org.qgis.project.MapLayer#getGeometry <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' attribute.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.qgis.project.QgisPackage#getMapLayer_Id()
	 * @model extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.qgis.project.MapLayer#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Datasource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasource</em>' attribute.
	 * @see #setDatasource(String)
	 * @see org.qgis.project.QgisPackage#getMapLayer_Datasource()
	 * @model extendedMetaData="kind='element' name='datasource'"
	 * @generated
	 */
	String getDatasource();

	/**
	 * Sets the value of the '{@link org.qgis.project.MapLayer#getDatasource <em>Datasource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datasource</em>' attribute.
	 * @see #getDatasource()
	 * @generated
	 */
	void setDatasource(String value);

	/**
	 * Returns the value of the '<em><b>Layername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layername</em>' attribute.
	 * @see #setLayername(String)
	 * @see org.qgis.project.QgisPackage#getMapLayer_Layername()
	 * @model extendedMetaData="kind='element' name='layername'"
	 * @generated
	 */
	String getLayername();

	/**
	 * Sets the value of the '{@link org.qgis.project.MapLayer#getLayername <em>Layername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layername</em>' attribute.
	 * @see #getLayername()
	 * @generated
	 */
	void setLayername(String value);

	/**
	 * Returns the value of the '<em><b>Srs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srs</em>' containment reference.
	 * @see #setSrs(Crs)
	 * @see org.qgis.project.QgisPackage#getMapLayer_Srs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='srs'"
	 * @generated
	 */
	Crs getSrs();

	/**
	 * Sets the value of the '{@link org.qgis.project.MapLayer#getSrs <em>Srs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srs</em>' containment reference.
	 * @see #getSrs()
	 * @generated
	 */
	void setSrs(Crs value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(Provider)
	 * @see org.qgis.project.QgisPackage#getMapLayer_Provider()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='provider'"
	 * @generated
	 */
	Provider getProvider();

	/**
	 * Sets the value of the '{@link org.qgis.project.MapLayer#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Provider value);

	/**
	 * Returns the value of the '<em><b>Renderer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renderer</em>' containment reference.
	 * @see #setRenderer(Renderer)
	 * @see org.qgis.project.QgisPackage#getMapLayer_Renderer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='renderer-v2'"
	 * @generated
	 */
	Renderer getRenderer();

	/**
	 * Sets the value of the '{@link org.qgis.project.MapLayer#getRenderer <em>Renderer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renderer</em>' containment reference.
	 * @see #getRenderer()
	 * @generated
	 */
	void setRenderer(Renderer value);

	/**
	 * Returns the value of the '<em><b>Labeling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeling</em>' containment reference.
	 * @see #setLabeling(Labeling)
	 * @see org.qgis.project.QgisPackage#getMapLayer_Labeling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='labeling'"
	 * @generated
	 */
	Labeling getLabeling();

	/**
	 * Sets the value of the '{@link org.qgis.project.MapLayer#getLabeling <em>Labeling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labeling</em>' containment reference.
	 * @see #getLabeling()
	 * @generated
	 */
	void setLabeling(Labeling value);

} // MapLayer
