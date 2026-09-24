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
 * A representation of the model object '<em><b>Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A rectangle in a CRS.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.Extent#getXmin <em>Xmin</em>}</li>
 *   <li>{@link org.qgis.project.Extent#getYmin <em>Ymin</em>}</li>
 *   <li>{@link org.qgis.project.Extent#getXmax <em>Xmax</em>}</li>
 *   <li>{@link org.qgis.project.Extent#getYmax <em>Ymax</em>}</li>
 *   <li>{@link org.qgis.project.Extent#getSpatialRefSys <em>Spatial Ref Sys</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getExtent()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Extent extends EObject {
	/**
	 * Returns the value of the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xmin</em>' attribute.
	 * @see #isSetXmin()
	 * @see #unsetXmin()
	 * @see #setXmin(double)
	 * @see org.qgis.project.QgisPackage#getExtent_Xmin()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='xmin'"
	 * @generated
	 */
	double getXmin();

	/**
	 * Sets the value of the '{@link org.qgis.project.Extent#getXmin <em>Xmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xmin</em>' attribute.
	 * @see #isSetXmin()
	 * @see #unsetXmin()
	 * @see #getXmin()
	 * @generated
	 */
	void setXmin(double value);

	/**
	 * Unsets the value of the '{@link org.qgis.project.Extent#getXmin <em>Xmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXmin()
	 * @see #getXmin()
	 * @see #setXmin(double)
	 * @generated
	 */
	void unsetXmin();

	/**
	 * Returns whether the value of the '{@link org.qgis.project.Extent#getXmin <em>Xmin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Xmin</em>' attribute is set.
	 * @see #unsetXmin()
	 * @see #getXmin()
	 * @see #setXmin(double)
	 * @generated
	 */
	boolean isSetXmin();

	/**
	 * Returns the value of the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ymin</em>' attribute.
	 * @see #isSetYmin()
	 * @see #unsetYmin()
	 * @see #setYmin(double)
	 * @see org.qgis.project.QgisPackage#getExtent_Ymin()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ymin'"
	 * @generated
	 */
	double getYmin();

	/**
	 * Sets the value of the '{@link org.qgis.project.Extent#getYmin <em>Ymin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ymin</em>' attribute.
	 * @see #isSetYmin()
	 * @see #unsetYmin()
	 * @see #getYmin()
	 * @generated
	 */
	void setYmin(double value);

	/**
	 * Unsets the value of the '{@link org.qgis.project.Extent#getYmin <em>Ymin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYmin()
	 * @see #getYmin()
	 * @see #setYmin(double)
	 * @generated
	 */
	void unsetYmin();

	/**
	 * Returns whether the value of the '{@link org.qgis.project.Extent#getYmin <em>Ymin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ymin</em>' attribute is set.
	 * @see #unsetYmin()
	 * @see #getYmin()
	 * @see #setYmin(double)
	 * @generated
	 */
	boolean isSetYmin();

	/**
	 * Returns the value of the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xmax</em>' attribute.
	 * @see #isSetXmax()
	 * @see #unsetXmax()
	 * @see #setXmax(double)
	 * @see org.qgis.project.QgisPackage#getExtent_Xmax()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='xmax'"
	 * @generated
	 */
	double getXmax();

	/**
	 * Sets the value of the '{@link org.qgis.project.Extent#getXmax <em>Xmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xmax</em>' attribute.
	 * @see #isSetXmax()
	 * @see #unsetXmax()
	 * @see #getXmax()
	 * @generated
	 */
	void setXmax(double value);

	/**
	 * Unsets the value of the '{@link org.qgis.project.Extent#getXmax <em>Xmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXmax()
	 * @see #getXmax()
	 * @see #setXmax(double)
	 * @generated
	 */
	void unsetXmax();

	/**
	 * Returns whether the value of the '{@link org.qgis.project.Extent#getXmax <em>Xmax</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Xmax</em>' attribute is set.
	 * @see #unsetXmax()
	 * @see #getXmax()
	 * @see #setXmax(double)
	 * @generated
	 */
	boolean isSetXmax();

	/**
	 * Returns the value of the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ymax</em>' attribute.
	 * @see #isSetYmax()
	 * @see #unsetYmax()
	 * @see #setYmax(double)
	 * @see org.qgis.project.QgisPackage#getExtent_Ymax()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ymax'"
	 * @generated
	 */
	double getYmax();

	/**
	 * Sets the value of the '{@link org.qgis.project.Extent#getYmax <em>Ymax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ymax</em>' attribute.
	 * @see #isSetYmax()
	 * @see #unsetYmax()
	 * @see #getYmax()
	 * @generated
	 */
	void setYmax(double value);

	/**
	 * Unsets the value of the '{@link org.qgis.project.Extent#getYmax <em>Ymax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYmax()
	 * @see #getYmax()
	 * @see #setYmax(double)
	 * @generated
	 */
	void unsetYmax();

	/**
	 * Returns whether the value of the '{@link org.qgis.project.Extent#getYmax <em>Ymax</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ymax</em>' attribute is set.
	 * @see #unsetYmax()
	 * @see #getYmax()
	 * @see #setYmax(double)
	 * @generated
	 */
	boolean isSetYmax();

	/**
	 * Returns the value of the '<em><b>Spatial Ref Sys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Ref Sys</em>' containment reference.
	 * @see #setSpatialRefSys(SpatialRefSys)
	 * @see org.qgis.project.QgisPackage#getExtent_SpatialRefSys()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spatialrefsys'"
	 * @generated
	 */
	SpatialRefSys getSpatialRefSys();

	/**
	 * Sets the value of the '{@link org.qgis.project.Extent#getSpatialRefSys <em>Spatial Ref Sys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spatial Ref Sys</em>' containment reference.
	 * @see #getSpatialRefSys()
	 * @generated
	 */
	void setSpatialRefSys(SpatialRefSys value);

} // Extent
