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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.qgis.project.QgisPackage;
import org.qgis.project.Symbol;
import org.qgis.project.SymbolLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.impl.SymbolImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.qgis.project.impl.SymbolImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.qgis.project.impl.SymbolImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.qgis.project.impl.SymbolImpl#getClipToExtent <em>Clip To Extent</em>}</li>
 *   <li>{@link org.qgis.project.impl.SymbolImpl#getForceRhr <em>Force Rhr</em>}</li>
 *   <li>{@link org.qgis.project.impl.SymbolImpl#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbolImpl extends MinimalEObjectImpl.Container implements Symbol {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final String ALPHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected String alpha = ALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getClipToExtent() <em>Clip To Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipToExtent()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIP_TO_EXTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClipToExtent() <em>Clip To Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipToExtent()
	 * @generated
	 * @ordered
	 */
	protected String clipToExtent = CLIP_TO_EXTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getForceRhr() <em>Force Rhr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceRhr()
	 * @generated
	 * @ordered
	 */
	protected static final String FORCE_RHR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForceRhr() <em>Force Rhr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceRhr()
	 * @generated
	 * @ordered
	 */
	protected String forceRhr = FORCE_RHR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLayers() <em>Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<SymbolLayer> layers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QgisPackage.Literals.SYMBOL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SYMBOL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SYMBOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlpha(String newAlpha) {
		String oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SYMBOL__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClipToExtent() {
		return clipToExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClipToExtent(String newClipToExtent) {
		String oldClipToExtent = clipToExtent;
		clipToExtent = newClipToExtent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SYMBOL__CLIP_TO_EXTENT, oldClipToExtent, clipToExtent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getForceRhr() {
		return forceRhr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForceRhr(String newForceRhr) {
		String oldForceRhr = forceRhr;
		forceRhr = newForceRhr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SYMBOL__FORCE_RHR, oldForceRhr, forceRhr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SymbolLayer> getLayers() {
		if (layers == null) {
			layers = new EObjectContainmentEList<SymbolLayer>(SymbolLayer.class, this, QgisPackage.SYMBOL__LAYERS);
		}
		return layers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QgisPackage.SYMBOL__LAYERS:
				return ((InternalEList<?>)getLayers()).basicRemove(otherEnd, msgs);
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
			case QgisPackage.SYMBOL__TYPE:
				return getType();
			case QgisPackage.SYMBOL__NAME:
				return getName();
			case QgisPackage.SYMBOL__ALPHA:
				return getAlpha();
			case QgisPackage.SYMBOL__CLIP_TO_EXTENT:
				return getClipToExtent();
			case QgisPackage.SYMBOL__FORCE_RHR:
				return getForceRhr();
			case QgisPackage.SYMBOL__LAYERS:
				return getLayers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QgisPackage.SYMBOL__TYPE:
				setType((String)newValue);
				return;
			case QgisPackage.SYMBOL__NAME:
				setName((String)newValue);
				return;
			case QgisPackage.SYMBOL__ALPHA:
				setAlpha((String)newValue);
				return;
			case QgisPackage.SYMBOL__CLIP_TO_EXTENT:
				setClipToExtent((String)newValue);
				return;
			case QgisPackage.SYMBOL__FORCE_RHR:
				setForceRhr((String)newValue);
				return;
			case QgisPackage.SYMBOL__LAYERS:
				getLayers().clear();
				getLayers().addAll((Collection<? extends SymbolLayer>)newValue);
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
			case QgisPackage.SYMBOL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case QgisPackage.SYMBOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QgisPackage.SYMBOL__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case QgisPackage.SYMBOL__CLIP_TO_EXTENT:
				setClipToExtent(CLIP_TO_EXTENT_EDEFAULT);
				return;
			case QgisPackage.SYMBOL__FORCE_RHR:
				setForceRhr(FORCE_RHR_EDEFAULT);
				return;
			case QgisPackage.SYMBOL__LAYERS:
				getLayers().clear();
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
			case QgisPackage.SYMBOL__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case QgisPackage.SYMBOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QgisPackage.SYMBOL__ALPHA:
				return ALPHA_EDEFAULT == null ? alpha != null : !ALPHA_EDEFAULT.equals(alpha);
			case QgisPackage.SYMBOL__CLIP_TO_EXTENT:
				return CLIP_TO_EXTENT_EDEFAULT == null ? clipToExtent != null : !CLIP_TO_EXTENT_EDEFAULT.equals(clipToExtent);
			case QgisPackage.SYMBOL__FORCE_RHR:
				return FORCE_RHR_EDEFAULT == null ? forceRhr != null : !FORCE_RHR_EDEFAULT.equals(forceRhr);
			case QgisPackage.SYMBOL__LAYERS:
				return layers != null && !layers.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(", clipToExtent: ");
		result.append(clipToExtent);
		result.append(", forceRhr: ");
		result.append(forceRhr);
		result.append(')');
		return result.toString();
	}

} //SymbolImpl
