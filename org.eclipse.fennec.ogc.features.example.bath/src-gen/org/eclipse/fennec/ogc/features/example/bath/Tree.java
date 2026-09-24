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
 * A representation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A tree.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Tree#getSpecies <em>Species</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Tree#getHeightM <em>Height M</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Tree#getCrownDiameterM <em>Crown Diameter M</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getTree()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='trees' title='B\344ume' layerGroup='Vegetation' style='{\"color\":\"#2e7d32\",\"labels\":false}'"
 * @generated
 */
@ProviderType
public interface Tree extends Asset {
	/**
	 * Returns the value of the '<em><b>Species</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tree species.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Species</em>' attribute.
	 * @see #setSpecies(String)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getTree_Species()
	 * @model
	 * @generated
	 */
	String getSpecies();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Tree#getSpecies <em>Species</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' attribute.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(String value);

	/**
	 * Returns the value of the '<em><b>Height M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Height in metres.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height M</em>' attribute.
	 * @see #setHeightM(double)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getTree_HeightM()
	 * @model
	 * @generated
	 */
	double getHeightM();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Tree#getHeightM <em>Height M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height M</em>' attribute.
	 * @see #getHeightM()
	 * @generated
	 */
	void setHeightM(double value);

	/**
	 * Returns the value of the '<em><b>Crown Diameter M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Crown diameter in metres.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crown Diameter M</em>' attribute.
	 * @see #setCrownDiameterM(double)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getTree_CrownDiameterM()
	 * @model
	 * @generated
	 */
	double getCrownDiameterM();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Tree#getCrownDiameterM <em>Crown Diameter M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crown Diameter M</em>' attribute.
	 * @see #getCrownDiameterM()
	 * @generated
	 */
	void setCrownDiameterM(double value);

} // Tree
