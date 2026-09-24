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
import org.eclipse.fennec.ogc.features.example.bath.Slide;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slide</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.SlideImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.SlideImpl#getHeightDifference <em>Height Difference</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.SlideImpl#getMinAge <em>Min Age</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlideImpl extends AssetImpl implements Slide {
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected double length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeightDifference() <em>Height Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightDifference()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_DIFFERENCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeightDifference() <em>Height Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightDifference()
	 * @generated
	 * @ordered
	 */
	protected double heightDifference = HEIGHT_DIFFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinAge() <em>Min Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAge()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinAge() <em>Min Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAge()
	 * @generated
	 * @ordered
	 */
	protected int minAge = MIN_AGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BathPackage.Literals.SLIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(double newLength) {
		double oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.SLIDE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHeightDifference() {
		return heightDifference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeightDifference(double newHeightDifference) {
		double oldHeightDifference = heightDifference;
		heightDifference = newHeightDifference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.SLIDE__HEIGHT_DIFFERENCE, oldHeightDifference, heightDifference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinAge() {
		return minAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinAge(int newMinAge) {
		int oldMinAge = minAge;
		minAge = newMinAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.SLIDE__MIN_AGE, oldMinAge, minAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BathPackage.SLIDE__LENGTH:
				return getLength();
			case BathPackage.SLIDE__HEIGHT_DIFFERENCE:
				return getHeightDifference();
			case BathPackage.SLIDE__MIN_AGE:
				return getMinAge();
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
			case BathPackage.SLIDE__LENGTH:
				setLength((Double)newValue);
				return;
			case BathPackage.SLIDE__HEIGHT_DIFFERENCE:
				setHeightDifference((Double)newValue);
				return;
			case BathPackage.SLIDE__MIN_AGE:
				setMinAge((Integer)newValue);
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
			case BathPackage.SLIDE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case BathPackage.SLIDE__HEIGHT_DIFFERENCE:
				setHeightDifference(HEIGHT_DIFFERENCE_EDEFAULT);
				return;
			case BathPackage.SLIDE__MIN_AGE:
				setMinAge(MIN_AGE_EDEFAULT);
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
			case BathPackage.SLIDE__LENGTH:
				return length != LENGTH_EDEFAULT;
			case BathPackage.SLIDE__HEIGHT_DIFFERENCE:
				return heightDifference != HEIGHT_DIFFERENCE_EDEFAULT;
			case BathPackage.SLIDE__MIN_AGE:
				return minAge != MIN_AGE_EDEFAULT;
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
		result.append(" (length: ");
		result.append(length);
		result.append(", heightDifference: ");
		result.append(heightDifference);
		result.append(", minAge: ");
		result.append(minAge);
		result.append(')');
		return result.toString();
	}

} //SlideImpl
