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
import org.qgis.project.Renderer;
import org.qgis.project.Symbols;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Renderer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.impl.RendererImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.qgis.project.impl.RendererImpl#getSymbollevels <em>Symbollevels</em>}</li>
 *   <li>{@link org.qgis.project.impl.RendererImpl#getEnableorderby <em>Enableorderby</em>}</li>
 *   <li>{@link org.qgis.project.impl.RendererImpl#getForceraster <em>Forceraster</em>}</li>
 *   <li>{@link org.qgis.project.impl.RendererImpl#getSymbols <em>Symbols</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RendererImpl extends MinimalEObjectImpl.Container implements Renderer {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbollevels() <em>Symbollevels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbollevels()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOLLEVELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbollevels() <em>Symbollevels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbollevels()
	 * @generated
	 * @ordered
	 */
	protected String symbollevels = SYMBOLLEVELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnableorderby() <em>Enableorderby</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableorderby()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLEORDERBY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableorderby() <em>Enableorderby</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableorderby()
	 * @generated
	 * @ordered
	 */
	protected String enableorderby = ENABLEORDERBY_EDEFAULT;

	/**
	 * The default value of the '{@link #getForceraster() <em>Forceraster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceraster()
	 * @generated
	 * @ordered
	 */
	protected static final String FORCERASTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForceraster() <em>Forceraster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceraster()
	 * @generated
	 * @ordered
	 */
	protected String forceraster = FORCERASTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSymbols() <em>Symbols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbols()
	 * @generated
	 * @ordered
	 */
	protected Symbols symbols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RendererImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QgisPackage.Literals.RENDERER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.RENDERER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymbollevels() {
		return symbollevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbollevels(String newSymbollevels) {
		String oldSymbollevels = symbollevels;
		symbollevels = newSymbollevels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.RENDERER__SYMBOLLEVELS, oldSymbollevels, symbollevels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnableorderby() {
		return enableorderby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableorderby(String newEnableorderby) {
		String oldEnableorderby = enableorderby;
		enableorderby = newEnableorderby;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.RENDERER__ENABLEORDERBY, oldEnableorderby, enableorderby));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getForceraster() {
		return forceraster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForceraster(String newForceraster) {
		String oldForceraster = forceraster;
		forceraster = newForceraster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.RENDERER__FORCERASTER, oldForceraster, forceraster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Symbols getSymbols() {
		return symbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymbols(Symbols newSymbols, NotificationChain msgs) {
		Symbols oldSymbols = symbols;
		symbols = newSymbols;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.RENDERER__SYMBOLS, oldSymbols, newSymbols);
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
	public void setSymbols(Symbols newSymbols) {
		if (newSymbols != symbols) {
			NotificationChain msgs = null;
			if (symbols != null)
				msgs = ((InternalEObject)symbols).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.RENDERER__SYMBOLS, null, msgs);
			if (newSymbols != null)
				msgs = ((InternalEObject)newSymbols).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.RENDERER__SYMBOLS, null, msgs);
			msgs = basicSetSymbols(newSymbols, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.RENDERER__SYMBOLS, newSymbols, newSymbols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QgisPackage.RENDERER__SYMBOLS:
				return basicSetSymbols(null, msgs);
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
			case QgisPackage.RENDERER__TYPE:
				return getType();
			case QgisPackage.RENDERER__SYMBOLLEVELS:
				return getSymbollevels();
			case QgisPackage.RENDERER__ENABLEORDERBY:
				return getEnableorderby();
			case QgisPackage.RENDERER__FORCERASTER:
				return getForceraster();
			case QgisPackage.RENDERER__SYMBOLS:
				return getSymbols();
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
			case QgisPackage.RENDERER__TYPE:
				setType((String)newValue);
				return;
			case QgisPackage.RENDERER__SYMBOLLEVELS:
				setSymbollevels((String)newValue);
				return;
			case QgisPackage.RENDERER__ENABLEORDERBY:
				setEnableorderby((String)newValue);
				return;
			case QgisPackage.RENDERER__FORCERASTER:
				setForceraster((String)newValue);
				return;
			case QgisPackage.RENDERER__SYMBOLS:
				setSymbols((Symbols)newValue);
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
			case QgisPackage.RENDERER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case QgisPackage.RENDERER__SYMBOLLEVELS:
				setSymbollevels(SYMBOLLEVELS_EDEFAULT);
				return;
			case QgisPackage.RENDERER__ENABLEORDERBY:
				setEnableorderby(ENABLEORDERBY_EDEFAULT);
				return;
			case QgisPackage.RENDERER__FORCERASTER:
				setForceraster(FORCERASTER_EDEFAULT);
				return;
			case QgisPackage.RENDERER__SYMBOLS:
				setSymbols((Symbols)null);
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
			case QgisPackage.RENDERER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case QgisPackage.RENDERER__SYMBOLLEVELS:
				return SYMBOLLEVELS_EDEFAULT == null ? symbollevels != null : !SYMBOLLEVELS_EDEFAULT.equals(symbollevels);
			case QgisPackage.RENDERER__ENABLEORDERBY:
				return ENABLEORDERBY_EDEFAULT == null ? enableorderby != null : !ENABLEORDERBY_EDEFAULT.equals(enableorderby);
			case QgisPackage.RENDERER__FORCERASTER:
				return FORCERASTER_EDEFAULT == null ? forceraster != null : !FORCERASTER_EDEFAULT.equals(forceraster);
			case QgisPackage.RENDERER__SYMBOLS:
				return symbols != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", symbollevels: ");
		result.append(symbollevels);
		result.append(", enableorderby: ");
		result.append(enableorderby);
		result.append(", forceraster: ");
		result.append(forceraster);
		result.append(')');
		return result.toString();
	}

} //RendererImpl
