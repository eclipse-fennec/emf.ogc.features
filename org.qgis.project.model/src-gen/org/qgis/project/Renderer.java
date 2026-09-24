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
 * A representation of the model object '<em><b>Renderer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The feature renderer, e.g. singleSymbol.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.Renderer#getType <em>Type</em>}</li>
 *   <li>{@link org.qgis.project.Renderer#getSymbollevels <em>Symbollevels</em>}</li>
 *   <li>{@link org.qgis.project.Renderer#getEnableorderby <em>Enableorderby</em>}</li>
 *   <li>{@link org.qgis.project.Renderer#getForceraster <em>Forceraster</em>}</li>
 *   <li>{@link org.qgis.project.Renderer#getSymbols <em>Symbols</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getRenderer()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Renderer extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.qgis.project.QgisPackage#getRenderer_Type()
	 * @model extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.qgis.project.Renderer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Symbollevels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbollevels</em>' attribute.
	 * @see #setSymbollevels(String)
	 * @see org.qgis.project.QgisPackage#getRenderer_Symbollevels()
	 * @model extendedMetaData="kind='attribute' name='symbollevels'"
	 * @generated
	 */
	String getSymbollevels();

	/**
	 * Sets the value of the '{@link org.qgis.project.Renderer#getSymbollevels <em>Symbollevels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbollevels</em>' attribute.
	 * @see #getSymbollevels()
	 * @generated
	 */
	void setSymbollevels(String value);

	/**
	 * Returns the value of the '<em><b>Enableorderby</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enableorderby</em>' attribute.
	 * @see #setEnableorderby(String)
	 * @see org.qgis.project.QgisPackage#getRenderer_Enableorderby()
	 * @model extendedMetaData="kind='attribute' name='enableorderby'"
	 * @generated
	 */
	String getEnableorderby();

	/**
	 * Sets the value of the '{@link org.qgis.project.Renderer#getEnableorderby <em>Enableorderby</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enableorderby</em>' attribute.
	 * @see #getEnableorderby()
	 * @generated
	 */
	void setEnableorderby(String value);

	/**
	 * Returns the value of the '<em><b>Forceraster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forceraster</em>' attribute.
	 * @see #setForceraster(String)
	 * @see org.qgis.project.QgisPackage#getRenderer_Forceraster()
	 * @model extendedMetaData="kind='attribute' name='forceraster'"
	 * @generated
	 */
	String getForceraster();

	/**
	 * Sets the value of the '{@link org.qgis.project.Renderer#getForceraster <em>Forceraster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forceraster</em>' attribute.
	 * @see #getForceraster()
	 * @generated
	 */
	void setForceraster(String value);

	/**
	 * Returns the value of the '<em><b>Symbols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbols</em>' containment reference.
	 * @see #setSymbols(Symbols)
	 * @see org.qgis.project.QgisPackage#getRenderer_Symbols()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='symbols'"
	 * @generated
	 */
	Symbols getSymbols();

	/**
	 * Sets the value of the '{@link org.qgis.project.Renderer#getSymbols <em>Symbols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbols</em>' containment reference.
	 * @see #getSymbols()
	 * @generated
	 */
	void setSymbols(Symbols value);

} // Renderer
