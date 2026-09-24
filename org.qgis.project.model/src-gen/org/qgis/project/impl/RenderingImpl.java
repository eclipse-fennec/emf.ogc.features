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
package org.qgis.project.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.qgis.project.QgisPackage;
import org.qgis.project.Rendering;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rendering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.impl.RenderingImpl#getScaleVisibility <em>Scale Visibility</em>}</li>
 *   <li>{@link org.qgis.project.impl.RenderingImpl#getScaleMin <em>Scale Min</em>}</li>
 *   <li>{@link org.qgis.project.impl.RenderingImpl#getScaleMax <em>Scale Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenderingImpl extends MinimalEObjectImpl.Container implements Rendering {
	/**
	 * The default value of the '{@link #getScaleVisibility() <em>Scale Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleVisibility() <em>Scale Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleVisibility()
	 * @generated
	 * @ordered
	 */
	protected String scaleVisibility = SCALE_VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleMin() <em>Scale Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleMin()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleMin() <em>Scale Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleMin()
	 * @generated
	 * @ordered
	 */
	protected String scaleMin = SCALE_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleMax() <em>Scale Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleMax()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleMax() <em>Scale Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleMax()
	 * @generated
	 * @ordered
	 */
	protected String scaleMax = SCALE_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenderingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QgisPackage.Literals.RENDERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScaleVisibility() {
		return scaleVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaleVisibility(String newScaleVisibility) {
		String oldScaleVisibility = scaleVisibility;
		scaleVisibility = newScaleVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.RENDERING__SCALE_VISIBILITY, oldScaleVisibility, scaleVisibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScaleMin() {
		return scaleMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaleMin(String newScaleMin) {
		String oldScaleMin = scaleMin;
		scaleMin = newScaleMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.RENDERING__SCALE_MIN, oldScaleMin, scaleMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScaleMax() {
		return scaleMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaleMax(String newScaleMax) {
		String oldScaleMax = scaleMax;
		scaleMax = newScaleMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.RENDERING__SCALE_MAX, oldScaleMax, scaleMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QgisPackage.RENDERING__SCALE_VISIBILITY:
				return getScaleVisibility();
			case QgisPackage.RENDERING__SCALE_MIN:
				return getScaleMin();
			case QgisPackage.RENDERING__SCALE_MAX:
				return getScaleMax();
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
			case QgisPackage.RENDERING__SCALE_VISIBILITY:
				setScaleVisibility((String)newValue);
				return;
			case QgisPackage.RENDERING__SCALE_MIN:
				setScaleMin((String)newValue);
				return;
			case QgisPackage.RENDERING__SCALE_MAX:
				setScaleMax((String)newValue);
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
			case QgisPackage.RENDERING__SCALE_VISIBILITY:
				setScaleVisibility(SCALE_VISIBILITY_EDEFAULT);
				return;
			case QgisPackage.RENDERING__SCALE_MIN:
				setScaleMin(SCALE_MIN_EDEFAULT);
				return;
			case QgisPackage.RENDERING__SCALE_MAX:
				setScaleMax(SCALE_MAX_EDEFAULT);
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
			case QgisPackage.RENDERING__SCALE_VISIBILITY:
				return SCALE_VISIBILITY_EDEFAULT == null ? scaleVisibility != null : !SCALE_VISIBILITY_EDEFAULT.equals(scaleVisibility);
			case QgisPackage.RENDERING__SCALE_MIN:
				return SCALE_MIN_EDEFAULT == null ? scaleMin != null : !SCALE_MIN_EDEFAULT.equals(scaleMin);
			case QgisPackage.RENDERING__SCALE_MAX:
				return SCALE_MAX_EDEFAULT == null ? scaleMax != null : !SCALE_MAX_EDEFAULT.equals(scaleMax);
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
		result.append(" (scaleVisibility: ");
		result.append(scaleVisibility);
		result.append(", scaleMin: ");
		result.append(scaleMin);
		result.append(", scaleMax: ");
		result.append(scaleMax);
		result.append(')');
		return result.toString();
	}

} //RenderingImpl
