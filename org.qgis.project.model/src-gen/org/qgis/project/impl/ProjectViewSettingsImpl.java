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

import org.qgis.project.Extent;
import org.qgis.project.ProjectViewSettings;
import org.qgis.project.QgisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project View Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.impl.ProjectViewSettingsImpl#getUseProjectScales <em>Use Project Scales</em>}</li>
 *   <li>{@link org.qgis.project.impl.ProjectViewSettingsImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link org.qgis.project.impl.ProjectViewSettingsImpl#getDefaultViewExtent <em>Default View Extent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectViewSettingsImpl extends MinimalEObjectImpl.Container implements ProjectViewSettings {
	/**
	 * The default value of the '{@link #getUseProjectScales() <em>Use Project Scales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseProjectScales()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_PROJECT_SCALES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseProjectScales() <em>Use Project Scales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseProjectScales()
	 * @generated
	 * @ordered
	 */
	protected String useProjectScales = USE_PROJECT_SCALES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final String ROTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected String rotation = ROTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultViewExtent() <em>Default View Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultViewExtent()
	 * @generated
	 * @ordered
	 */
	protected Extent defaultViewExtent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectViewSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QgisPackage.Literals.PROJECT_VIEW_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseProjectScales() {
		return useProjectScales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseProjectScales(String newUseProjectScales) {
		String oldUseProjectScales = useProjectScales;
		useProjectScales = newUseProjectScales;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT_VIEW_SETTINGS__USE_PROJECT_SCALES, oldUseProjectScales, useProjectScales));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRotation(String newRotation) {
		String oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT_VIEW_SETTINGS__ROTATION, oldRotation, rotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Extent getDefaultViewExtent() {
		return defaultViewExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultViewExtent(Extent newDefaultViewExtent, NotificationChain msgs) {
		Extent oldDefaultViewExtent = defaultViewExtent;
		defaultViewExtent = newDefaultViewExtent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT_VIEW_SETTINGS__DEFAULT_VIEW_EXTENT, oldDefaultViewExtent, newDefaultViewExtent);
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
	public void setDefaultViewExtent(Extent newDefaultViewExtent) {
		if (newDefaultViewExtent != defaultViewExtent) {
			NotificationChain msgs = null;
			if (defaultViewExtent != null)
				msgs = ((InternalEObject)defaultViewExtent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.PROJECT_VIEW_SETTINGS__DEFAULT_VIEW_EXTENT, null, msgs);
			if (newDefaultViewExtent != null)
				msgs = ((InternalEObject)newDefaultViewExtent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.PROJECT_VIEW_SETTINGS__DEFAULT_VIEW_EXTENT, null, msgs);
			msgs = basicSetDefaultViewExtent(newDefaultViewExtent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT_VIEW_SETTINGS__DEFAULT_VIEW_EXTENT, newDefaultViewExtent, newDefaultViewExtent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QgisPackage.PROJECT_VIEW_SETTINGS__DEFAULT_VIEW_EXTENT:
				return basicSetDefaultViewExtent(null, msgs);
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
			case QgisPackage.PROJECT_VIEW_SETTINGS__USE_PROJECT_SCALES:
				return getUseProjectScales();
			case QgisPackage.PROJECT_VIEW_SETTINGS__ROTATION:
				return getRotation();
			case QgisPackage.PROJECT_VIEW_SETTINGS__DEFAULT_VIEW_EXTENT:
				return getDefaultViewExtent();
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
			case QgisPackage.PROJECT_VIEW_SETTINGS__USE_PROJECT_SCALES:
				setUseProjectScales((String)newValue);
				return;
			case QgisPackage.PROJECT_VIEW_SETTINGS__ROTATION:
				setRotation((String)newValue);
				return;
			case QgisPackage.PROJECT_VIEW_SETTINGS__DEFAULT_VIEW_EXTENT:
				setDefaultViewExtent((Extent)newValue);
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
			case QgisPackage.PROJECT_VIEW_SETTINGS__USE_PROJECT_SCALES:
				setUseProjectScales(USE_PROJECT_SCALES_EDEFAULT);
				return;
			case QgisPackage.PROJECT_VIEW_SETTINGS__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case QgisPackage.PROJECT_VIEW_SETTINGS__DEFAULT_VIEW_EXTENT:
				setDefaultViewExtent((Extent)null);
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
			case QgisPackage.PROJECT_VIEW_SETTINGS__USE_PROJECT_SCALES:
				return USE_PROJECT_SCALES_EDEFAULT == null ? useProjectScales != null : !USE_PROJECT_SCALES_EDEFAULT.equals(useProjectScales);
			case QgisPackage.PROJECT_VIEW_SETTINGS__ROTATION:
				return ROTATION_EDEFAULT == null ? rotation != null : !ROTATION_EDEFAULT.equals(rotation);
			case QgisPackage.PROJECT_VIEW_SETTINGS__DEFAULT_VIEW_EXTENT:
				return defaultViewExtent != null;
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
		result.append(" (useProjectScales: ");
		result.append(useProjectScales);
		result.append(", rotation: ");
		result.append(rotation);
		result.append(')');
		return result.toString();
	}

} //ProjectViewSettingsImpl
