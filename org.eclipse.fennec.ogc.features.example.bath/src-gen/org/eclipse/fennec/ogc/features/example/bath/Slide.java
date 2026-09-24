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
 * A representation of the model object '<em><b>Slide</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A water slide, modelled as the line of its run.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Slide#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Slide#getHeightDifference <em>Height Difference</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.Slide#getMinAge <em>Min Age</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getSlide()
 * @model annotation="https://eclipse.org/fennec/ogc/features collection='true' id='slides' title='Rutschen' layerGroup='Wasser' style='#00acc1'"
 * @generated
 */
@ProviderType
public interface Slide extends Asset {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length in metres.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getSlide_Length()
	 * @model
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Slide#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

	/**
	 * Returns the value of the '<em><b>Height Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Height difference in metres.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height Difference</em>' attribute.
	 * @see #setHeightDifference(double)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getSlide_HeightDifference()
	 * @model
	 * @generated
	 */
	double getHeightDifference();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Slide#getHeightDifference <em>Height Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height Difference</em>' attribute.
	 * @see #getHeightDifference()
	 * @generated
	 */
	void setHeightDifference(double value);

	/**
	 * Returns the value of the '<em><b>Min Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum age.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Age</em>' attribute.
	 * @see #setMinAge(int)
	 * @see org.eclipse.fennec.ogc.features.example.bath.BathPackage#getSlide_MinAge()
	 * @model
	 * @generated
	 */
	int getMinAge();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.ogc.features.example.bath.Slide#getMinAge <em>Min Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Age</em>' attribute.
	 * @see #getMinAge()
	 * @generated
	 */
	void setMinAge(int value);

} // Slide
