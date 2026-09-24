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
 * A representation of the model object '<em><b>Text Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The halo around label text.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.TextBuffer#getBufferDraw <em>Buffer Draw</em>}</li>
 *   <li>{@link org.qgis.project.TextBuffer#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.qgis.project.TextBuffer#getBufferColor <em>Buffer Color</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getTextBuffer()
 * @model extendedMetaData="kind='empty'"
 * @generated
 */
@ProviderType
public interface TextBuffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Buffer Draw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Draw</em>' attribute.
	 * @see #setBufferDraw(String)
	 * @see org.qgis.project.QgisPackage#getTextBuffer_BufferDraw()
	 * @model extendedMetaData="kind='attribute' name='bufferDraw'"
	 * @generated
	 */
	String getBufferDraw();

	/**
	 * Sets the value of the '{@link org.qgis.project.TextBuffer#getBufferDraw <em>Buffer Draw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Draw</em>' attribute.
	 * @see #getBufferDraw()
	 * @generated
	 */
	void setBufferDraw(String value);

	/**
	 * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Size</em>' attribute.
	 * @see #setBufferSize(String)
	 * @see org.qgis.project.QgisPackage#getTextBuffer_BufferSize()
	 * @model extendedMetaData="kind='attribute' name='bufferSize'"
	 * @generated
	 */
	String getBufferSize();

	/**
	 * Sets the value of the '{@link org.qgis.project.TextBuffer#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(String value);

	/**
	 * Returns the value of the '<em><b>Buffer Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Color</em>' attribute.
	 * @see #setBufferColor(String)
	 * @see org.qgis.project.QgisPackage#getTextBuffer_BufferColor()
	 * @model extendedMetaData="kind='attribute' name='bufferColor'"
	 * @generated
	 */
	String getBufferColor();

	/**
	 * Sets the value of the '{@link org.qgis.project.TextBuffer#getBufferColor <em>Buffer Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Color</em>' attribute.
	 * @see #getBufferColor()
	 * @generated
	 */
	void setBufferColor(String value);

} // TextBuffer
