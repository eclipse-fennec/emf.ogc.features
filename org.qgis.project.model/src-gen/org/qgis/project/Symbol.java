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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A symbol: fill, line or marker.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.Symbol#getType <em>Type</em>}</li>
 *   <li>{@link org.qgis.project.Symbol#getName <em>Name</em>}</li>
 *   <li>{@link org.qgis.project.Symbol#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.qgis.project.Symbol#getClipToExtent <em>Clip To Extent</em>}</li>
 *   <li>{@link org.qgis.project.Symbol#getForceRhr <em>Force Rhr</em>}</li>
 *   <li>{@link org.qgis.project.Symbol#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getSymbol()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Symbol extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.qgis.project.QgisPackage#getSymbol_Type()
	 * @model extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.qgis.project.Symbol#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.qgis.project.QgisPackage#getSymbol_Name()
	 * @model extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.qgis.project.Symbol#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(String)
	 * @see org.qgis.project.QgisPackage#getSymbol_Alpha()
	 * @model extendedMetaData="kind='attribute' name='alpha'"
	 * @generated
	 */
	String getAlpha();

	/**
	 * Sets the value of the '{@link org.qgis.project.Symbol#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(String value);

	/**
	 * Returns the value of the '<em><b>Clip To Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip To Extent</em>' attribute.
	 * @see #setClipToExtent(String)
	 * @see org.qgis.project.QgisPackage#getSymbol_ClipToExtent()
	 * @model extendedMetaData="kind='attribute' name='clip_to_extent'"
	 * @generated
	 */
	String getClipToExtent();

	/**
	 * Sets the value of the '{@link org.qgis.project.Symbol#getClipToExtent <em>Clip To Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip To Extent</em>' attribute.
	 * @see #getClipToExtent()
	 * @generated
	 */
	void setClipToExtent(String value);

	/**
	 * Returns the value of the '<em><b>Force Rhr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Rhr</em>' attribute.
	 * @see #setForceRhr(String)
	 * @see org.qgis.project.QgisPackage#getSymbol_ForceRhr()
	 * @model extendedMetaData="kind='attribute' name='force_rhr'"
	 * @generated
	 */
	String getForceRhr();

	/**
	 * Sets the value of the '{@link org.qgis.project.Symbol#getForceRhr <em>Force Rhr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Rhr</em>' attribute.
	 * @see #getForceRhr()
	 * @generated
	 */
	void setForceRhr(String value);

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link org.qgis.project.SymbolLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see org.qgis.project.QgisPackage#getSymbol_Layers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='layer'"
	 * @generated
	 */
	EList<SymbolLayer> getLayers();

} // Symbol
