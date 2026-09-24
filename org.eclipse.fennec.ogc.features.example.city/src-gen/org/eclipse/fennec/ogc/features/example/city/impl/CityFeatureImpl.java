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
package org.eclipse.fennec.ogc.features.example.city.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.ogc.features.example.city.CityFeature;
import org.eclipse.fennec.ogc.features.example.city.CityPackage;

import org.geojson.Geometry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.CityFeatureImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.CityFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.CityFeatureImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.CityFeatureImpl#getMinX <em>Min X</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.CityFeatureImpl#getMinY <em>Min Y</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.CityFeatureImpl#getMaxX <em>Max X</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.city.impl.CityFeatureImpl#getMaxY <em>Max Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CityFeatureImpl extends MinimalEObjectImpl.Container implements CityFeature {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected static final Geometry GEOMETRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected Geometry geometry = GEOMETRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinX() <em>Min X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinX()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinX() <em>Min X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinX()
	 * @generated
	 * @ordered
	 */
	protected double minX = MIN_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinY() <em>Min Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinY()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinY() <em>Min Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinY()
	 * @generated
	 * @ordered
	 */
	protected double minY = MIN_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxX() <em>Max X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxX()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxX() <em>Max X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxX()
	 * @generated
	 * @ordered
	 */
	protected double maxX = MAX_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxY() <em>Max Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxY()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxY() <em>Max Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxY()
	 * @generated
	 * @ordered
	 */
	protected double maxY = MAX_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CityPackage.Literals.CITY_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.CITY_FEATURE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.CITY_FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geometry getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeometry(Geometry newGeometry) {
		Geometry oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.CITY_FEATURE__GEOMETRY, oldGeometry, geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinX() {
		return minX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinX(double newMinX) {
		double oldMinX = minX;
		minX = newMinX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.CITY_FEATURE__MIN_X, oldMinX, minX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinY() {
		return minY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinY(double newMinY) {
		double oldMinY = minY;
		minY = newMinY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.CITY_FEATURE__MIN_Y, oldMinY, minY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxX() {
		return maxX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxX(double newMaxX) {
		double oldMaxX = maxX;
		maxX = newMaxX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.CITY_FEATURE__MAX_X, oldMaxX, maxX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxY() {
		return maxY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxY(double newMaxY) {
		double oldMaxY = maxY;
		maxY = newMaxY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.CITY_FEATURE__MAX_Y, oldMaxY, maxY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CityPackage.CITY_FEATURE__ID:
				return getId();
			case CityPackage.CITY_FEATURE__NAME:
				return getName();
			case CityPackage.CITY_FEATURE__GEOMETRY:
				return getGeometry();
			case CityPackage.CITY_FEATURE__MIN_X:
				return getMinX();
			case CityPackage.CITY_FEATURE__MIN_Y:
				return getMinY();
			case CityPackage.CITY_FEATURE__MAX_X:
				return getMaxX();
			case CityPackage.CITY_FEATURE__MAX_Y:
				return getMaxY();
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
			case CityPackage.CITY_FEATURE__ID:
				setId((String)newValue);
				return;
			case CityPackage.CITY_FEATURE__NAME:
				setName((String)newValue);
				return;
			case CityPackage.CITY_FEATURE__GEOMETRY:
				setGeometry((Geometry)newValue);
				return;
			case CityPackage.CITY_FEATURE__MIN_X:
				setMinX((Double)newValue);
				return;
			case CityPackage.CITY_FEATURE__MIN_Y:
				setMinY((Double)newValue);
				return;
			case CityPackage.CITY_FEATURE__MAX_X:
				setMaxX((Double)newValue);
				return;
			case CityPackage.CITY_FEATURE__MAX_Y:
				setMaxY((Double)newValue);
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
			case CityPackage.CITY_FEATURE__ID:
				setId(ID_EDEFAULT);
				return;
			case CityPackage.CITY_FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CityPackage.CITY_FEATURE__GEOMETRY:
				setGeometry(GEOMETRY_EDEFAULT);
				return;
			case CityPackage.CITY_FEATURE__MIN_X:
				setMinX(MIN_X_EDEFAULT);
				return;
			case CityPackage.CITY_FEATURE__MIN_Y:
				setMinY(MIN_Y_EDEFAULT);
				return;
			case CityPackage.CITY_FEATURE__MAX_X:
				setMaxX(MAX_X_EDEFAULT);
				return;
			case CityPackage.CITY_FEATURE__MAX_Y:
				setMaxY(MAX_Y_EDEFAULT);
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
			case CityPackage.CITY_FEATURE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CityPackage.CITY_FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CityPackage.CITY_FEATURE__GEOMETRY:
				return GEOMETRY_EDEFAULT == null ? geometry != null : !GEOMETRY_EDEFAULT.equals(geometry);
			case CityPackage.CITY_FEATURE__MIN_X:
				return minX != MIN_X_EDEFAULT;
			case CityPackage.CITY_FEATURE__MIN_Y:
				return minY != MIN_Y_EDEFAULT;
			case CityPackage.CITY_FEATURE__MAX_X:
				return maxX != MAX_X_EDEFAULT;
			case CityPackage.CITY_FEATURE__MAX_Y:
				return maxY != MAX_Y_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", geometry: ");
		result.append(geometry);
		result.append(", minX: ");
		result.append(minX);
		result.append(", minY: ");
		result.append(minY);
		result.append(", maxX: ");
		result.append(maxX);
		result.append(", maxY: ");
		result.append(maxY);
		result.append(')');
		return result.toString();
	}

} //CityFeatureImpl
