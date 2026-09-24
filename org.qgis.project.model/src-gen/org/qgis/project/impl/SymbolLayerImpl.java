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

import org.qgis.project.DataDefinedProperties;
import org.qgis.project.Option;
import org.qgis.project.QgisPackage;
import org.qgis.project.SymbolLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.impl.SymbolLayerImpl#getLayerClass <em>Layer Class</em>}</li>
 *   <li>{@link org.qgis.project.impl.SymbolLayerImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.qgis.project.impl.SymbolLayerImpl#getLocked <em>Locked</em>}</li>
 *   <li>{@link org.qgis.project.impl.SymbolLayerImpl#getPass <em>Pass</em>}</li>
 *   <li>{@link org.qgis.project.impl.SymbolLayerImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link org.qgis.project.impl.SymbolLayerImpl#getDataDefinedProperties <em>Data Defined Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbolLayerImpl extends MinimalEObjectImpl.Container implements SymbolLayer {
	/**
	 * The default value of the '{@link #getLayerClass() <em>Layer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayerClass() <em>Layer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerClass()
	 * @generated
	 * @ordered
	 */
	protected String layerClass = LAYER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected String enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocked()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocked()
	 * @generated
	 * @ordered
	 */
	protected String locked = LOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPass() <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPass()
	 * @generated
	 * @ordered
	 */
	protected static final String PASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPass() <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPass()
	 * @generated
	 * @ordered
	 */
	protected String pass = PASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected Option options;

	/**
	 * The cached value of the '{@link #getDataDefinedProperties() <em>Data Defined Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDefinedProperties()
	 * @generated
	 * @ordered
	 */
	protected DataDefinedProperties dataDefinedProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QgisPackage.Literals.SYMBOL_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLayerClass() {
		return layerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayerClass(String newLayerClass) {
		String oldLayerClass = layerClass;
		layerClass = newLayerClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SYMBOL_LAYER__LAYER_CLASS, oldLayerClass, layerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled(String newEnabled) {
		String oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SYMBOL_LAYER__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocked() {
		return locked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocked(String newLocked) {
		String oldLocked = locked;
		locked = newLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SYMBOL_LAYER__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPass() {
		return pass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPass(String newPass) {
		String oldPass = pass;
		pass = newPass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SYMBOL_LAYER__PASS, oldPass, pass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Option getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(Option newOptions, NotificationChain msgs) {
		Option oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.SYMBOL_LAYER__OPTIONS, oldOptions, newOptions);
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
	public void setOptions(Option newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.SYMBOL_LAYER__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.SYMBOL_LAYER__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SYMBOL_LAYER__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataDefinedProperties getDataDefinedProperties() {
		return dataDefinedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataDefinedProperties(DataDefinedProperties newDataDefinedProperties, NotificationChain msgs) {
		DataDefinedProperties oldDataDefinedProperties = dataDefinedProperties;
		dataDefinedProperties = newDataDefinedProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.SYMBOL_LAYER__DATA_DEFINED_PROPERTIES, oldDataDefinedProperties, newDataDefinedProperties);
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
	public void setDataDefinedProperties(DataDefinedProperties newDataDefinedProperties) {
		if (newDataDefinedProperties != dataDefinedProperties) {
			NotificationChain msgs = null;
			if (dataDefinedProperties != null)
				msgs = ((InternalEObject)dataDefinedProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.SYMBOL_LAYER__DATA_DEFINED_PROPERTIES, null, msgs);
			if (newDataDefinedProperties != null)
				msgs = ((InternalEObject)newDataDefinedProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.SYMBOL_LAYER__DATA_DEFINED_PROPERTIES, null, msgs);
			msgs = basicSetDataDefinedProperties(newDataDefinedProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SYMBOL_LAYER__DATA_DEFINED_PROPERTIES, newDataDefinedProperties, newDataDefinedProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QgisPackage.SYMBOL_LAYER__OPTIONS:
				return basicSetOptions(null, msgs);
			case QgisPackage.SYMBOL_LAYER__DATA_DEFINED_PROPERTIES:
				return basicSetDataDefinedProperties(null, msgs);
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
			case QgisPackage.SYMBOL_LAYER__LAYER_CLASS:
				return getLayerClass();
			case QgisPackage.SYMBOL_LAYER__ENABLED:
				return getEnabled();
			case QgisPackage.SYMBOL_LAYER__LOCKED:
				return getLocked();
			case QgisPackage.SYMBOL_LAYER__PASS:
				return getPass();
			case QgisPackage.SYMBOL_LAYER__OPTIONS:
				return getOptions();
			case QgisPackage.SYMBOL_LAYER__DATA_DEFINED_PROPERTIES:
				return getDataDefinedProperties();
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
			case QgisPackage.SYMBOL_LAYER__LAYER_CLASS:
				setLayerClass((String)newValue);
				return;
			case QgisPackage.SYMBOL_LAYER__ENABLED:
				setEnabled((String)newValue);
				return;
			case QgisPackage.SYMBOL_LAYER__LOCKED:
				setLocked((String)newValue);
				return;
			case QgisPackage.SYMBOL_LAYER__PASS:
				setPass((String)newValue);
				return;
			case QgisPackage.SYMBOL_LAYER__OPTIONS:
				setOptions((Option)newValue);
				return;
			case QgisPackage.SYMBOL_LAYER__DATA_DEFINED_PROPERTIES:
				setDataDefinedProperties((DataDefinedProperties)newValue);
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
			case QgisPackage.SYMBOL_LAYER__LAYER_CLASS:
				setLayerClass(LAYER_CLASS_EDEFAULT);
				return;
			case QgisPackage.SYMBOL_LAYER__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case QgisPackage.SYMBOL_LAYER__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case QgisPackage.SYMBOL_LAYER__PASS:
				setPass(PASS_EDEFAULT);
				return;
			case QgisPackage.SYMBOL_LAYER__OPTIONS:
				setOptions((Option)null);
				return;
			case QgisPackage.SYMBOL_LAYER__DATA_DEFINED_PROPERTIES:
				setDataDefinedProperties((DataDefinedProperties)null);
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
			case QgisPackage.SYMBOL_LAYER__LAYER_CLASS:
				return LAYER_CLASS_EDEFAULT == null ? layerClass != null : !LAYER_CLASS_EDEFAULT.equals(layerClass);
			case QgisPackage.SYMBOL_LAYER__ENABLED:
				return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
			case QgisPackage.SYMBOL_LAYER__LOCKED:
				return LOCKED_EDEFAULT == null ? locked != null : !LOCKED_EDEFAULT.equals(locked);
			case QgisPackage.SYMBOL_LAYER__PASS:
				return PASS_EDEFAULT == null ? pass != null : !PASS_EDEFAULT.equals(pass);
			case QgisPackage.SYMBOL_LAYER__OPTIONS:
				return options != null;
			case QgisPackage.SYMBOL_LAYER__DATA_DEFINED_PROPERTIES:
				return dataDefinedProperties != null;
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
		result.append(" (layerClass: ");
		result.append(layerClass);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(", locked: ");
		result.append(locked);
		result.append(", pass: ");
		result.append(pass);
		result.append(')');
		return result.toString();
	}

} //SymbolLayerImpl
