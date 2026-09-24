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
 * A representation of the model object '<em><b>Data Defined Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Properties computed per feature, e.g. a colour from an expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.DataDefinedProperties#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see org.qgis.project.QgisPackage#getDataDefinedProperties()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataDefinedProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference.
	 * @see #setOption(Option)
	 * @see org.qgis.project.QgisPackage#getDataDefinedProperties_Option()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Option'"
	 * @generated
	 */
	Option getOption();

	/**
	 * Sets the value of the '{@link org.qgis.project.DataDefinedProperties#getOption <em>Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' containment reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(Option value);

} // DataDefinedProperties
