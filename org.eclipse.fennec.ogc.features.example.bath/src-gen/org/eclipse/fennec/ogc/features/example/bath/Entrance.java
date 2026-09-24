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
 * A representation of the model object '<em><b>Entrance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An entrance or exit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Entrance#isMain <em>Main</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getEntrance()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='entrances' title='Eing\344nge' layerGroup='Infrastruktur' style='#546e7a'"
 * @generated
 */
@ProviderType
public interface Entrance extends Asset {
	/**
	 * Returns the value of the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main entrance with cash desk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Main</em>' attribute.
	 * @see #setMain(boolean)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getEntrance_Main()
	 * @model
	 * @generated
	 */
	boolean isMain();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Entrance#isMain <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' attribute.
	 * @see #isMain()
	 * @generated
	 */
	void setMain(boolean value);

} // Entrance
