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
package org.eclipse.fennec.ogc.features.example.bath;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lawn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A lawn for sunbathing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Lawn#isShaded <em>Shaded</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getLawn()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='lawns' title='Liegewiese' layerGroup='Freifl\344chen' style='#7cb342'"
 * @generated
 */
@ProviderType
public interface Lawn extends Asset {
	/**
	 * Returns the value of the '<em><b>Shaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Partly shaded by trees.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shaded</em>' attribute.
	 * @see #setShaded(boolean)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getLawn_Shaded()
	 * @model
	 * @generated
	 */
	boolean isShaded();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Lawn#isShaded <em>Shaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaded</em>' attribute.
	 * @see #isShaded()
	 * @generated
	 */
	void setShaded(boolean value);

} // Lawn
