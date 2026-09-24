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

import org.qgis.project.Properties;
import org.qgis.project.QgisPackage;
import org.qgis.project.SpatialRefSysProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.impl.PropertiesImpl#getSpatialRefSys <em>Spatial Ref Sys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertiesImpl extends MinimalEObjectImpl.Container implements Properties {
	/**
	 * The cached value of the '{@link #getSpatialRefSys() <em>Spatial Ref Sys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialRefSys()
	 * @generated
	 * @ordered
	 */
	protected SpatialRefSysProperties spatialRefSys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QgisPackage.Literals.PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialRefSysProperties getSpatialRefSys() {
		return spatialRefSys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpatialRefSys(SpatialRefSysProperties newSpatialRefSys, NotificationChain msgs) {
		SpatialRefSysProperties oldSpatialRefSys = spatialRefSys;
		spatialRefSys = newSpatialRefSys;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.PROPERTIES__SPATIAL_REF_SYS, oldSpatialRefSys, newSpatialRefSys);
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
	public void setSpatialRefSys(SpatialRefSysProperties newSpatialRefSys) {
		if (newSpatialRefSys != spatialRefSys) {
			NotificationChain msgs = null;
			if (spatialRefSys != null)
				msgs = ((InternalEObject)spatialRefSys).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.PROPERTIES__SPATIAL_REF_SYS, null, msgs);
			if (newSpatialRefSys != null)
				msgs = ((InternalEObject)newSpatialRefSys).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.PROPERTIES__SPATIAL_REF_SYS, null, msgs);
			msgs = basicSetSpatialRefSys(newSpatialRefSys, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.PROPERTIES__SPATIAL_REF_SYS, newSpatialRefSys, newSpatialRefSys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QgisPackage.PROPERTIES__SPATIAL_REF_SYS:
				return basicSetSpatialRefSys(null, msgs);
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
			case QgisPackage.PROPERTIES__SPATIAL_REF_SYS:
				return getSpatialRefSys();
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
			case QgisPackage.PROPERTIES__SPATIAL_REF_SYS:
				setSpatialRefSys((SpatialRefSysProperties)newValue);
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
			case QgisPackage.PROPERTIES__SPATIAL_REF_SYS:
				setSpatialRefSys((SpatialRefSysProperties)null);
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
			case QgisPackage.PROPERTIES__SPATIAL_REF_SYS:
				return spatialRefSys != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertiesImpl
