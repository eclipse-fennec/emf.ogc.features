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
 * A representation of the model object '<em><b>Text Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Label text and its appearance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.TextStyle#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.qgis.project.TextStyle#getIsExpression <em>Is Expression</em>}</li>
 *   <li>{@link org.qgis.project.TextStyle#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.qgis.project.TextStyle#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.qgis.project.TextStyle#getTextBuffer <em>Text Buffer</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getTextStyle()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TextStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Name</em>' attribute.
	 * @see #setFieldName(String)
	 * @see org.qgis.project.QgisPackage#getTextStyle_FieldName()
	 * @model extendedMetaData="kind='attribute' name='fieldName'"
	 * @generated
	 */
	String getFieldName();

	/**
	 * Sets the value of the '{@link org.qgis.project.TextStyle#getFieldName <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Name</em>' attribute.
	 * @see #getFieldName()
	 * @generated
	 */
	void setFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Is Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Expression</em>' attribute.
	 * @see #setIsExpression(String)
	 * @see org.qgis.project.QgisPackage#getTextStyle_IsExpression()
	 * @model extendedMetaData="kind='attribute' name='isExpression'"
	 * @generated
	 */
	String getIsExpression();

	/**
	 * Sets the value of the '{@link org.qgis.project.TextStyle#getIsExpression <em>Is Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Expression</em>' attribute.
	 * @see #getIsExpression()
	 * @generated
	 */
	void setIsExpression(String value);

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(String)
	 * @see org.qgis.project.QgisPackage#getTextStyle_FontSize()
	 * @model extendedMetaData="kind='attribute' name='fontSize'"
	 * @generated
	 */
	String getFontSize();

	/**
	 * Sets the value of the '{@link org.qgis.project.TextStyle#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(String value);

	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' attribute.
	 * @see #setTextColor(String)
	 * @see org.qgis.project.QgisPackage#getTextStyle_TextColor()
	 * @model extendedMetaData="kind='attribute' name='textColor'"
	 * @generated
	 */
	String getTextColor();

	/**
	 * Sets the value of the '{@link org.qgis.project.TextStyle#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' attribute.
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(String value);

	/**
	 * Returns the value of the '<em><b>Text Buffer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Buffer</em>' containment reference.
	 * @see #setTextBuffer(TextBuffer)
	 * @see org.qgis.project.QgisPackage#getTextStyle_TextBuffer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text-buffer'"
	 * @generated
	 */
	TextBuffer getTextBuffer();

	/**
	 * Sets the value of the '{@link org.qgis.project.TextStyle#getTextBuffer <em>Text Buffer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Buffer</em>' containment reference.
	 * @see #getTextBuffer()
	 * @generated
	 */
	void setTextBuffer(TextBuffer value);

} // TextStyle
