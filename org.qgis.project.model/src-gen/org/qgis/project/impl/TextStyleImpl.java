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
import org.qgis.project.TextBuffer;
import org.qgis.project.TextStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.impl.TextStyleImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.qgis.project.impl.TextStyleImpl#getIsExpression <em>Is Expression</em>}</li>
 *   <li>{@link org.qgis.project.impl.TextStyleImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.qgis.project.impl.TextStyleImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.qgis.project.impl.TextStyleImpl#getTextBuffer <em>Text Buffer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextStyleImpl extends MinimalEObjectImpl.Container implements TextStyle {
	/**
	 * The default value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldName()
	 * @generated
	 * @ordered
	 */
	protected String fieldName = FIELD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsExpression() <em>Is Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsExpression() <em>Is Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExpression()
	 * @generated
	 * @ordered
	 */
	protected String isExpression = IS_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected String fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected String textColor = TEXT_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextBuffer() <em>Text Buffer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextBuffer()
	 * @generated
	 * @ordered
	 */
	protected TextBuffer textBuffer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QgisPackage.Literals.TEXT_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldName(String newFieldName) {
		String oldFieldName = fieldName;
		fieldName = newFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.TEXT_STYLE__FIELD_NAME, oldFieldName, fieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIsExpression() {
		return isExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsExpression(String newIsExpression) {
		String oldIsExpression = isExpression;
		isExpression = newIsExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.TEXT_STYLE__IS_EXPRESSION, oldIsExpression, isExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontSize(String newFontSize) {
		String oldFontSize = fontSize;
		fontSize = newFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.TEXT_STYLE__FONT_SIZE, oldFontSize, fontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextColor() {
		return textColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextColor(String newTextColor) {
		String oldTextColor = textColor;
		textColor = newTextColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.TEXT_STYLE__TEXT_COLOR, oldTextColor, textColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextBuffer getTextBuffer() {
		return textBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextBuffer(TextBuffer newTextBuffer, NotificationChain msgs) {
		TextBuffer oldTextBuffer = textBuffer;
		textBuffer = newTextBuffer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.TEXT_STYLE__TEXT_BUFFER, oldTextBuffer, newTextBuffer);
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
	public void setTextBuffer(TextBuffer newTextBuffer) {
		if (newTextBuffer != textBuffer) {
			NotificationChain msgs = null;
			if (textBuffer != null)
				msgs = ((InternalEObject)textBuffer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.TEXT_STYLE__TEXT_BUFFER, null, msgs);
			if (newTextBuffer != null)
				msgs = ((InternalEObject)newTextBuffer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.TEXT_STYLE__TEXT_BUFFER, null, msgs);
			msgs = basicSetTextBuffer(newTextBuffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.TEXT_STYLE__TEXT_BUFFER, newTextBuffer, newTextBuffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QgisPackage.TEXT_STYLE__TEXT_BUFFER:
				return basicSetTextBuffer(null, msgs);
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
			case QgisPackage.TEXT_STYLE__FIELD_NAME:
				return getFieldName();
			case QgisPackage.TEXT_STYLE__IS_EXPRESSION:
				return getIsExpression();
			case QgisPackage.TEXT_STYLE__FONT_SIZE:
				return getFontSize();
			case QgisPackage.TEXT_STYLE__TEXT_COLOR:
				return getTextColor();
			case QgisPackage.TEXT_STYLE__TEXT_BUFFER:
				return getTextBuffer();
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
			case QgisPackage.TEXT_STYLE__FIELD_NAME:
				setFieldName((String)newValue);
				return;
			case QgisPackage.TEXT_STYLE__IS_EXPRESSION:
				setIsExpression((String)newValue);
				return;
			case QgisPackage.TEXT_STYLE__FONT_SIZE:
				setFontSize((String)newValue);
				return;
			case QgisPackage.TEXT_STYLE__TEXT_COLOR:
				setTextColor((String)newValue);
				return;
			case QgisPackage.TEXT_STYLE__TEXT_BUFFER:
				setTextBuffer((TextBuffer)newValue);
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
			case QgisPackage.TEXT_STYLE__FIELD_NAME:
				setFieldName(FIELD_NAME_EDEFAULT);
				return;
			case QgisPackage.TEXT_STYLE__IS_EXPRESSION:
				setIsExpression(IS_EXPRESSION_EDEFAULT);
				return;
			case QgisPackage.TEXT_STYLE__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case QgisPackage.TEXT_STYLE__TEXT_COLOR:
				setTextColor(TEXT_COLOR_EDEFAULT);
				return;
			case QgisPackage.TEXT_STYLE__TEXT_BUFFER:
				setTextBuffer((TextBuffer)null);
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
			case QgisPackage.TEXT_STYLE__FIELD_NAME:
				return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
			case QgisPackage.TEXT_STYLE__IS_EXPRESSION:
				return IS_EXPRESSION_EDEFAULT == null ? isExpression != null : !IS_EXPRESSION_EDEFAULT.equals(isExpression);
			case QgisPackage.TEXT_STYLE__FONT_SIZE:
				return FONT_SIZE_EDEFAULT == null ? fontSize != null : !FONT_SIZE_EDEFAULT.equals(fontSize);
			case QgisPackage.TEXT_STYLE__TEXT_COLOR:
				return TEXT_COLOR_EDEFAULT == null ? textColor != null : !TEXT_COLOR_EDEFAULT.equals(textColor);
			case QgisPackage.TEXT_STYLE__TEXT_BUFFER:
				return textBuffer != null;
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
		result.append(" (fieldName: ");
		result.append(fieldName);
		result.append(", isExpression: ");
		result.append(isExpression);
		result.append(", fontSize: ");
		result.append(fontSize);
		result.append(", textColor: ");
		result.append(textColor);
		result.append(')');
		return result.toString();
	}

} //TextStyleImpl
