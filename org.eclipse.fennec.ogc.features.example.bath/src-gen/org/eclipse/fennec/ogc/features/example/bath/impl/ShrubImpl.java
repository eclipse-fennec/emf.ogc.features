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
package org.eclipse.fennec.ogc.features.example.bath.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.ogc.features.example.bath.BathPackage;
import org.eclipse.fennec.ogc.features.example.bath.Shrub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shrub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.ShrubImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.ShrubImpl#getHeightM <em>Height M</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShrubImpl extends AssetImpl implements Shrub {
	/**
	 * The default value of the '{@link #getSpecies() <em>Species</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected String species = SPECIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeightM() <em>Height M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightM()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_M_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeightM() <em>Height M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightM()
	 * @generated
	 * @ordered
	 */
	protected double heightM = HEIGHT_M_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShrubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BathPackage.Literals.SHRUB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecies() {
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecies(String newSpecies) {
		String oldSpecies = species;
		species = newSpecies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.SHRUB__SPECIES, oldSpecies, species));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHeightM() {
		return heightM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeightM(double newHeightM) {
		double oldHeightM = heightM;
		heightM = newHeightM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.SHRUB__HEIGHT_M, oldHeightM, heightM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BathPackage.SHRUB__SPECIES:
				return getSpecies();
			case BathPackage.SHRUB__HEIGHT_M:
				return getHeightM();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BathPackage.SHRUB__SPECIES:
				setSpecies((String)newValue);
				return;
			case BathPackage.SHRUB__HEIGHT_M:
				setHeightM((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BathPackage.SHRUB__SPECIES:
				setSpecies(SPECIES_EDEFAULT);
				return;
			case BathPackage.SHRUB__HEIGHT_M:
				setHeightM(HEIGHT_M_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BathPackage.SHRUB__SPECIES:
				return SPECIES_EDEFAULT == null ? species != null : !SPECIES_EDEFAULT.equals(species);
			case BathPackage.SHRUB__HEIGHT_M:
				return heightM != HEIGHT_M_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (species: ");
		result.append(species);
		result.append(", heightM: ");
		result.append(heightM);
		result.append(')');
		return result.toString();
	}

} //ShrubImpl
