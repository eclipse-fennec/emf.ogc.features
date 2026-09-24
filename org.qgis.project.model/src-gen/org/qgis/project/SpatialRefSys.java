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
 * A representation of the model object '<em><b>Spatial Ref Sys</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A coordinate reference system. QGIS reads a layer CRS from the authid alone, the project CRS only with the full definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.SpatialRefSys#getNativeFormat <em>Native Format</em>}</li>
 *   <li>{@link org.qgis.project.SpatialRefSys#getWkt <em>Wkt</em>}</li>
 *   <li>{@link org.qgis.project.SpatialRefSys#getProj4 <em>Proj4</em>}</li>
 *   <li>{@link org.qgis.project.SpatialRefSys#getSrsid <em>Srsid</em>}</li>
 *   <li>{@link org.qgis.project.SpatialRefSys#getSrid <em>Srid</em>}</li>
 *   <li>{@link org.qgis.project.SpatialRefSys#getAuthid <em>Authid</em>}</li>
 *   <li>{@link org.qgis.project.SpatialRefSys#getDescription <em>Description</em>}</li>
 *   <li>{@link org.qgis.project.SpatialRefSys#getProjectionacronym <em>Projectionacronym</em>}</li>
 *   <li>{@link org.qgis.project.SpatialRefSys#getEllipsoidacronym <em>Ellipsoidacronym</em>}</li>
 *   <li>{@link org.qgis.project.SpatialRefSys#getGeographicflag <em>Geographicflag</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getSpatialRefSys()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SpatialRefSys extends EObject {
	/**
	 * Returns the value of the '<em><b>Native Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wkt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Native Format</em>' attribute.
	 * @see #setNativeFormat(String)
	 * @see org.qgis.project.QgisPackage#getSpatialRefSys_NativeFormat()
	 * @model extendedMetaData="kind='attribute' name='nativeFormat'"
	 * @generated
	 */
	String getNativeFormat();

	/**
	 * Sets the value of the '{@link org.qgis.project.SpatialRefSys#getNativeFormat <em>Native Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native Format</em>' attribute.
	 * @see #getNativeFormat()
	 * @generated
	 */
	void setNativeFormat(String value);

	/**
	 * Returns the value of the '<em><b>Wkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wkt</em>' attribute.
	 * @see #setWkt(String)
	 * @see org.qgis.project.QgisPackage#getSpatialRefSys_Wkt()
	 * @model extendedMetaData="kind='element' name='wkt'"
	 * @generated
	 */
	String getWkt();

	/**
	 * Sets the value of the '{@link org.qgis.project.SpatialRefSys#getWkt <em>Wkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wkt</em>' attribute.
	 * @see #getWkt()
	 * @generated
	 */
	void setWkt(String value);

	/**
	 * Returns the value of the '<em><b>Proj4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proj4</em>' attribute.
	 * @see #setProj4(String)
	 * @see org.qgis.project.QgisPackage#getSpatialRefSys_Proj4()
	 * @model extendedMetaData="kind='element' name='proj4'"
	 * @generated
	 */
	String getProj4();

	/**
	 * Sets the value of the '{@link org.qgis.project.SpatialRefSys#getProj4 <em>Proj4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proj4</em>' attribute.
	 * @see #getProj4()
	 * @generated
	 */
	void setProj4(String value);

	/**
	 * Returns the value of the '<em><b>Srsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srsid</em>' attribute.
	 * @see #setSrsid(String)
	 * @see org.qgis.project.QgisPackage#getSpatialRefSys_Srsid()
	 * @model extendedMetaData="kind='element' name='srsid'"
	 * @generated
	 */
	String getSrsid();

	/**
	 * Sets the value of the '{@link org.qgis.project.SpatialRefSys#getSrsid <em>Srsid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srsid</em>' attribute.
	 * @see #getSrsid()
	 * @generated
	 */
	void setSrsid(String value);

	/**
	 * Returns the value of the '<em><b>Srid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srid</em>' attribute.
	 * @see #setSrid(String)
	 * @see org.qgis.project.QgisPackage#getSpatialRefSys_Srid()
	 * @model extendedMetaData="kind='element' name='srid'"
	 * @generated
	 */
	String getSrid();

	/**
	 * Sets the value of the '{@link org.qgis.project.SpatialRefSys#getSrid <em>Srid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srid</em>' attribute.
	 * @see #getSrid()
	 * @generated
	 */
	void setSrid(String value);

	/**
	 * Returns the value of the '<em><b>Authid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authid</em>' attribute.
	 * @see #setAuthid(String)
	 * @see org.qgis.project.QgisPackage#getSpatialRefSys_Authid()
	 * @model extendedMetaData="kind='element' name='authid'"
	 * @generated
	 */
	String getAuthid();

	/**
	 * Sets the value of the '{@link org.qgis.project.SpatialRefSys#getAuthid <em>Authid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authid</em>' attribute.
	 * @see #getAuthid()
	 * @generated
	 */
	void setAuthid(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.qgis.project.QgisPackage#getSpatialRefSys_Description()
	 * @model extendedMetaData="kind='element' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.qgis.project.SpatialRefSys#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Projectionacronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projectionacronym</em>' attribute.
	 * @see #setProjectionacronym(String)
	 * @see org.qgis.project.QgisPackage#getSpatialRefSys_Projectionacronym()
	 * @model extendedMetaData="kind='element' name='projectionacronym'"
	 * @generated
	 */
	String getProjectionacronym();

	/**
	 * Sets the value of the '{@link org.qgis.project.SpatialRefSys#getProjectionacronym <em>Projectionacronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projectionacronym</em>' attribute.
	 * @see #getProjectionacronym()
	 * @generated
	 */
	void setProjectionacronym(String value);

	/**
	 * Returns the value of the '<em><b>Ellipsoidacronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ellipsoidacronym</em>' attribute.
	 * @see #setEllipsoidacronym(String)
	 * @see org.qgis.project.QgisPackage#getSpatialRefSys_Ellipsoidacronym()
	 * @model extendedMetaData="kind='element' name='ellipsoidacronym'"
	 * @generated
	 */
	String getEllipsoidacronym();

	/**
	 * Sets the value of the '{@link org.qgis.project.SpatialRefSys#getEllipsoidacronym <em>Ellipsoidacronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsoidacronym</em>' attribute.
	 * @see #getEllipsoidacronym()
	 * @generated
	 */
	void setEllipsoidacronym(String value);

	/**
	 * Returns the value of the '<em><b>Geographicflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geographicflag</em>' attribute.
	 * @see #setGeographicflag(String)
	 * @see org.qgis.project.QgisPackage#getSpatialRefSys_Geographicflag()
	 * @model extendedMetaData="kind='element' name='geographicflag'"
	 * @generated
	 */
	String getGeographicflag();

	/**
	 * Sets the value of the '{@link org.qgis.project.SpatialRefSys#getGeographicflag <em>Geographicflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geographicflag</em>' attribute.
	 * @see #getGeographicflag()
	 * @generated
	 */
	void setGeographicflag(String value);

} // SpatialRefSys
