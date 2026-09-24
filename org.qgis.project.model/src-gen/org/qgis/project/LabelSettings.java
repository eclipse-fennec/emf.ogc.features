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
 * A representation of the model object '<em><b>Label Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The settings of simple labelling.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.LabelSettings#getCalloutType <em>Callout Type</em>}</li>
 *   <li>{@link org.qgis.project.LabelSettings#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link org.qgis.project.LabelSettings#getPlacement <em>Placement</em>}</li>
 *   <li>{@link org.qgis.project.LabelSettings#getRendering <em>Rendering</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getLabelSettings()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LabelSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Callout Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callout Type</em>' attribute.
	 * @see #setCalloutType(String)
	 * @see org.qgis.project.QgisPackage#getLabelSettings_CalloutType()
	 * @model extendedMetaData="kind='attribute' name='calloutType'"
	 * @generated
	 */
	String getCalloutType();

	/**
	 * Sets the value of the '{@link org.qgis.project.LabelSettings#getCalloutType <em>Callout Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callout Type</em>' attribute.
	 * @see #getCalloutType()
	 * @generated
	 */
	void setCalloutType(String value);

	/**
	 * Returns the value of the '<em><b>Text Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Style</em>' containment reference.
	 * @see #setTextStyle(TextStyle)
	 * @see org.qgis.project.QgisPackage#getLabelSettings_TextStyle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text-style'"
	 * @generated
	 */
	TextStyle getTextStyle();

	/**
	 * Sets the value of the '{@link org.qgis.project.LabelSettings#getTextStyle <em>Text Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Style</em>' containment reference.
	 * @see #getTextStyle()
	 * @generated
	 */
	void setTextStyle(TextStyle value);

	/**
	 * Returns the value of the '<em><b>Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' containment reference.
	 * @see #setPlacement(Placement)
	 * @see org.qgis.project.QgisPackage#getLabelSettings_Placement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='placement'"
	 * @generated
	 */
	Placement getPlacement();

	/**
	 * Sets the value of the '{@link org.qgis.project.LabelSettings#getPlacement <em>Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' containment reference.
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(Placement value);

	/**
	 * Returns the value of the '<em><b>Rendering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendering</em>' containment reference.
	 * @see #setRendering(Rendering)
	 * @see org.qgis.project.QgisPackage#getLabelSettings_Rendering()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rendering'"
	 * @generated
	 */
	Rendering getRendering();

	/**
	 * Sets the value of the '{@link org.qgis.project.LabelSettings#getRendering <em>Rendering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering</em>' containment reference.
	 * @see #getRendering()
	 * @generated
	 */
	void setRendering(Rendering value);

} // LabelSettings
