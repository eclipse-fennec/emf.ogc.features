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
 * A representation of the model object '<em><b>First Aid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A first aid station.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.FirstAid#isDefibrillator <em>Defibrillator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getFirstAid()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='first-aid' title='Erste Hilfe' layerGroup='Service' style='#d81b60'"
 * @generated
 */
@ProviderType
public interface FirstAid extends Asset {
	/**
	 * Returns the value of the '<em><b>Defibrillator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An AED is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defibrillator</em>' attribute.
	 * @see #setDefibrillator(boolean)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getFirstAid_Defibrillator()
	 * @model
	 * @generated
	 */
	boolean isDefibrillator();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.FirstAid#isDefibrillator <em>Defibrillator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defibrillator</em>' attribute.
	 * @see #isDefibrillator()
	 * @generated
	 */
	void setDefibrillator(boolean value);

} // FirstAid
