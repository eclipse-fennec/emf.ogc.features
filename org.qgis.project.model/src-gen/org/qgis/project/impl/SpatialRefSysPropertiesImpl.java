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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.qgis.project.QgisPackage;
import org.qgis.project.SpatialRefSysProperties;
import org.qgis.project.TypedValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spatial Ref Sys Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.impl.SpatialRefSysPropertiesImpl#getProjectionsEnabled <em>Projections Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpatialRefSysPropertiesImpl extends MinimalEObjectImpl.Container implements SpatialRefSysProperties {
	/**
	 * The cached value of the '{@link #getProjectionsEnabled() <em>Projections Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectionsEnabled()
	 * @generated
	 * @ordered
	 */
	protected TypedValue projectionsEnabled;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpatialRefSysPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QgisPackage.Literals.SPATIAL_REF_SYS_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypedValue getProjectionsEnabled() {
		return projectionsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectionsEnabled(TypedValue newProjectionsEnabled, NotificationChain msgs) {
		TypedValue oldProjectionsEnabled = projectionsEnabled;
		projectionsEnabled = newProjectionsEnabled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.SPATIAL_REF_SYS_PROPERTIES__PROJECTIONS_ENABLED, oldProjectionsEnabled, newProjectionsEnabled);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectionsEnabled(TypedValue newProjectionsEnabled) {
		if (newProjectionsEnabled != projectionsEnabled) {
			NotificationChain msgs = null;
			if (projectionsEnabled != null)
				msgs = ((InternalEObject)projectionsEnabled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.SPATIAL_REF_SYS_PROPERTIES__PROJECTIONS_ENABLED, null, msgs);
			if (newProjectionsEnabled != null)
				msgs = ((InternalEObject)newProjectionsEnabled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.SPATIAL_REF_SYS_PROPERTIES__PROJECTIONS_ENABLED, null, msgs);
			msgs = basicSetProjectionsEnabled(newProjectionsEnabled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SPATIAL_REF_SYS_PROPERTIES__PROJECTIONS_ENABLED, newProjectionsEnabled, newProjectionsEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QgisPackage.SPATIAL_REF_SYS_PROPERTIES__PROJECTIONS_ENABLED:
				return basicSetProjectionsEnabled(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QgisPackage.SPATIAL_REF_SYS_PROPERTIES__PROJECTIONS_ENABLED:
				return getProjectionsEnabled();
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
			case QgisPackage.SPATIAL_REF_SYS_PROPERTIES__PROJECTIONS_ENABLED:
				setProjectionsEnabled((TypedValue)newValue);
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
			case QgisPackage.SPATIAL_REF_SYS_PROPERTIES__PROJECTIONS_ENABLED:
				setProjectionsEnabled((TypedValue)null);
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
			case QgisPackage.SPATIAL_REF_SYS_PROPERTIES__PROJECTIONS_ENABLED:
				return projectionsEnabled != null;
		}
		return super.eIsSet(featureID);
	}

} //SpatialRefSysPropertiesImpl
