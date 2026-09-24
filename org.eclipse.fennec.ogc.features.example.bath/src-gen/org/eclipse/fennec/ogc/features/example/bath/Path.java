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
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A footpath.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Path#getSurface <em>Surface</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getPath()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='paths' title='Wege' layerGroup='Infrastruktur' style='#9e9e9e'"
 * @generated
 */
@ProviderType
public interface Path extends Asset {
	/**
	 * Returns the value of the '<em><b>Surface</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.ogc.features.example.bath.Surface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface</em>' attribute.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Surface
	 * @see #setSurface(Surface)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getPath_Surface()
	 * @model
	 * @generated
	 */
	Surface getSurface();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Path#getSurface <em>Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface</em>' attribute.
	 * @see org.eclipse.fennec.ogc.features.example.bath.Surface
	 * @see #getSurface()
	 * @generated
	 */
	void setSurface(Surface value);

} // Path
