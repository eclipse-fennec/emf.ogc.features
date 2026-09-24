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

import org.qgis.project.LabelSettings;
import org.qgis.project.Placement;
import org.qgis.project.QgisPackage;
import org.qgis.project.Rendering;
import org.qgis.project.TextStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.impl.LabelSettingsImpl#getCalloutType <em>Callout Type</em>}</li>
 *   <li>{@link org.qgis.project.impl.LabelSettingsImpl#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link org.qgis.project.impl.LabelSettingsImpl#getPlacement <em>Placement</em>}</li>
 *   <li>{@link org.qgis.project.impl.LabelSettingsImpl#getRendering <em>Rendering</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelSettingsImpl extends MinimalEObjectImpl.Container implements LabelSettings {
	/**
	 * The default value of the '{@link #getCalloutType() <em>Callout Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalloutType()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLOUT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalloutType() <em>Callout Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalloutType()
	 * @generated
	 * @ordered
	 */
	protected String calloutType = CALLOUT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextStyle() <em>Text Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextStyle()
	 * @generated
	 * @ordered
	 */
	protected TextStyle textStyle;

	/**
	 * The cached value of the '{@link #getPlacement() <em>Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacement()
	 * @generated
	 * @ordered
	 */
	protected Placement placement;

	/**
	 * The cached value of the '{@link #getRendering() <em>Rendering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendering()
	 * @generated
	 * @ordered
	 */
	protected Rendering rendering;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QgisPackage.Literals.LABEL_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCalloutType() {
		return calloutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalloutType(String newCalloutType) {
		String oldCalloutType = calloutType;
		calloutType = newCalloutType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.LABEL_SETTINGS__CALLOUT_TYPE, oldCalloutType, calloutType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextStyle getTextStyle() {
		return textStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextStyle(TextStyle newTextStyle, NotificationChain msgs) {
		TextStyle oldTextStyle = textStyle;
		textStyle = newTextStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.LABEL_SETTINGS__TEXT_STYLE, oldTextStyle, newTextStyle);
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
	public void setTextStyle(TextStyle newTextStyle) {
		if (newTextStyle != textStyle) {
			NotificationChain msgs = null;
			if (textStyle != null)
				msgs = ((InternalEObject)textStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.LABEL_SETTINGS__TEXT_STYLE, null, msgs);
			if (newTextStyle != null)
				msgs = ((InternalEObject)newTextStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.LABEL_SETTINGS__TEXT_STYLE, null, msgs);
			msgs = basicSetTextStyle(newTextStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.LABEL_SETTINGS__TEXT_STYLE, newTextStyle, newTextStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Placement getPlacement() {
		return placement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacement(Placement newPlacement, NotificationChain msgs) {
		Placement oldPlacement = placement;
		placement = newPlacement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.LABEL_SETTINGS__PLACEMENT, oldPlacement, newPlacement);
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
	public void setPlacement(Placement newPlacement) {
		if (newPlacement != placement) {
			NotificationChain msgs = null;
			if (placement != null)
				msgs = ((InternalEObject)placement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.LABEL_SETTINGS__PLACEMENT, null, msgs);
			if (newPlacement != null)
				msgs = ((InternalEObject)newPlacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.LABEL_SETTINGS__PLACEMENT, null, msgs);
			msgs = basicSetPlacement(newPlacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.LABEL_SETTINGS__PLACEMENT, newPlacement, newPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rendering getRendering() {
		return rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRendering(Rendering newRendering, NotificationChain msgs) {
		Rendering oldRendering = rendering;
		rendering = newRendering;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.LABEL_SETTINGS__RENDERING, oldRendering, newRendering);
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
	public void setRendering(Rendering newRendering) {
		if (newRendering != rendering) {
			NotificationChain msgs = null;
			if (rendering != null)
				msgs = ((InternalEObject)rendering).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.LABEL_SETTINGS__RENDERING, null, msgs);
			if (newRendering != null)
				msgs = ((InternalEObject)newRendering).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.LABEL_SETTINGS__RENDERING, null, msgs);
			msgs = basicSetRendering(newRendering, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.LABEL_SETTINGS__RENDERING, newRendering, newRendering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QgisPackage.LABEL_SETTINGS__TEXT_STYLE:
				return basicSetTextStyle(null, msgs);
			case QgisPackage.LABEL_SETTINGS__PLACEMENT:
				return basicSetPlacement(null, msgs);
			case QgisPackage.LABEL_SETTINGS__RENDERING:
				return basicSetRendering(null, msgs);
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
			case QgisPackage.LABEL_SETTINGS__CALLOUT_TYPE:
				return getCalloutType();
			case QgisPackage.LABEL_SETTINGS__TEXT_STYLE:
				return getTextStyle();
			case QgisPackage.LABEL_SETTINGS__PLACEMENT:
				return getPlacement();
			case QgisPackage.LABEL_SETTINGS__RENDERING:
				return getRendering();
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
			case QgisPackage.LABEL_SETTINGS__CALLOUT_TYPE:
				setCalloutType((String)newValue);
				return;
			case QgisPackage.LABEL_SETTINGS__TEXT_STYLE:
				setTextStyle((TextStyle)newValue);
				return;
			case QgisPackage.LABEL_SETTINGS__PLACEMENT:
				setPlacement((Placement)newValue);
				return;
			case QgisPackage.LABEL_SETTINGS__RENDERING:
				setRendering((Rendering)newValue);
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
			case QgisPackage.LABEL_SETTINGS__CALLOUT_TYPE:
				setCalloutType(CALLOUT_TYPE_EDEFAULT);
				return;
			case QgisPackage.LABEL_SETTINGS__TEXT_STYLE:
				setTextStyle((TextStyle)null);
				return;
			case QgisPackage.LABEL_SETTINGS__PLACEMENT:
				setPlacement((Placement)null);
				return;
			case QgisPackage.LABEL_SETTINGS__RENDERING:
				setRendering((Rendering)null);
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
			case QgisPackage.LABEL_SETTINGS__CALLOUT_TYPE:
				return CALLOUT_TYPE_EDEFAULT == null ? calloutType != null : !CALLOUT_TYPE_EDEFAULT.equals(calloutType);
			case QgisPackage.LABEL_SETTINGS__TEXT_STYLE:
				return textStyle != null;
			case QgisPackage.LABEL_SETTINGS__PLACEMENT:
				return placement != null;
			case QgisPackage.LABEL_SETTINGS__RENDERING:
				return rendering != null;
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
		result.append(" (calloutType: ");
		result.append(calloutType);
		result.append(')');
		return result.toString();
	}

} //LabelSettingsImpl
