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
import org.qgis.project.TextBuffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Buffer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.impl.TextBufferImpl#getBufferDraw <em>Buffer Draw</em>}</li>
 *   <li>{@link org.qgis.project.impl.TextBufferImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.qgis.project.impl.TextBufferImpl#getBufferColor <em>Buffer Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextBufferImpl extends MinimalEObjectImpl.Container implements TextBuffer {
	/**
	 * The default value of the '{@link #getBufferDraw() <em>Buffer Draw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferDraw()
	 * @generated
	 * @ordered
	 */
	protected static final String BUFFER_DRAW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBufferDraw() <em>Buffer Draw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferDraw()
	 * @generated
	 * @ordered
	 */
	protected String bufferDraw = BUFFER_DRAW_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final String BUFFER_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected String bufferSize = BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferColor() <em>Buffer Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BUFFER_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBufferColor() <em>Buffer Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferColor()
	 * @generated
	 * @ordered
	 */
	protected String bufferColor = BUFFER_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextBufferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QgisPackage.Literals.TEXT_BUFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBufferDraw() {
		return bufferDraw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBufferDraw(String newBufferDraw) {
		String oldBufferDraw = bufferDraw;
		bufferDraw = newBufferDraw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.TEXT_BUFFER__BUFFER_DRAW, oldBufferDraw, bufferDraw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBufferSize() {
		return bufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBufferSize(String newBufferSize) {
		String oldBufferSize = bufferSize;
		bufferSize = newBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.TEXT_BUFFER__BUFFER_SIZE, oldBufferSize, bufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBufferColor() {
		return bufferColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBufferColor(String newBufferColor) {
		String oldBufferColor = bufferColor;
		bufferColor = newBufferColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.TEXT_BUFFER__BUFFER_COLOR, oldBufferColor, bufferColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QgisPackage.TEXT_BUFFER__BUFFER_DRAW:
				return getBufferDraw();
			case QgisPackage.TEXT_BUFFER__BUFFER_SIZE:
				return getBufferSize();
			case QgisPackage.TEXT_BUFFER__BUFFER_COLOR:
				return getBufferColor();
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
			case QgisPackage.TEXT_BUFFER__BUFFER_DRAW:
				setBufferDraw((String)newValue);
				return;
			case QgisPackage.TEXT_BUFFER__BUFFER_SIZE:
				setBufferSize((String)newValue);
				return;
			case QgisPackage.TEXT_BUFFER__BUFFER_COLOR:
				setBufferColor((String)newValue);
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
			case QgisPackage.TEXT_BUFFER__BUFFER_DRAW:
				setBufferDraw(BUFFER_DRAW_EDEFAULT);
				return;
			case QgisPackage.TEXT_BUFFER__BUFFER_SIZE:
				setBufferSize(BUFFER_SIZE_EDEFAULT);
				return;
			case QgisPackage.TEXT_BUFFER__BUFFER_COLOR:
				setBufferColor(BUFFER_COLOR_EDEFAULT);
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
			case QgisPackage.TEXT_BUFFER__BUFFER_DRAW:
				return BUFFER_DRAW_EDEFAULT == null ? bufferDraw != null : !BUFFER_DRAW_EDEFAULT.equals(bufferDraw);
			case QgisPackage.TEXT_BUFFER__BUFFER_SIZE:
				return BUFFER_SIZE_EDEFAULT == null ? bufferSize != null : !BUFFER_SIZE_EDEFAULT.equals(bufferSize);
			case QgisPackage.TEXT_BUFFER__BUFFER_COLOR:
				return BUFFER_COLOR_EDEFAULT == null ? bufferColor != null : !BUFFER_COLOR_EDEFAULT.equals(bufferColor);
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
		result.append(" (bufferDraw: ");
		result.append(bufferDraw);
		result.append(", bufferSize: ");
		result.append(bufferSize);
		result.append(", bufferColor: ");
		result.append(bufferColor);
		result.append(')');
		return result.toString();
	}

} //TextBufferImpl
