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
package org.eclipse.fennec.ogc.features.example.bath.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.ogc.features.example.bath.Asset;
import org.eclipse.fennec.ogc.features.example.bath.BathPackage;
import org.eclipse.fennec.ogc.features.example.bath.Level;
import org.eclipse.fennec.ogc.features.example.bath.OperationalStatus;

import org.geojson.Geometry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.AssetImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.AssetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.AssetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.AssetImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.AssetImpl#getMinX <em>Min X</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.AssetImpl#getMinY <em>Min Y</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.AssetImpl#getMaxX <em>Max X</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.AssetImpl#getMaxY <em>Max Y</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.AssetImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.AssetImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.AssetImpl#isAccessible <em>Accessible</em>}</li>
 *   <li>{@link org.eclipse.fennec.ogc.features.example.bath.impl.AssetImpl#getLastInspection <em>Last Inspection</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssetImpl extends MinimalEObjectImpl.Container implements Asset {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Level LEVEL_EDEFAULT = Level.GROUND_FLOOR;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Level level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final OperationalStatus STATUS_EDEFAULT = OperationalStatus.OPEN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected OperationalStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAccessible() <em>Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccessible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCESSIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAccessible() <em>Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccessible()
	 * @generated
	 * @ordered
	 */
	protected boolean accessible = ACCESSIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastInspection() <em>Last Inspection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastInspection()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_INSPECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastInspection() <em>Last Inspection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastInspection()
	 * @generated
	 * @ordered
	 */
	protected Date lastInspection = LAST_INSPECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BathPackage.Literals.ASSET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.ASSET__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.ASSET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.ASSET__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.ASSET__GEOMETRY, oldGeometry, geometry));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.ASSET__MIN_X, oldMinX, minX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.ASSET__MIN_Y, oldMinY, minY));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.ASSET__MAX_X, oldMaxX, maxX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.ASSET__MAX_Y, oldMaxY, maxY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(Level newLevel) {
		Level oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.ASSET__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationalStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(OperationalStatus newStatus) {
		OperationalStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.ASSET__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAccessible() {
		return accessible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessible(boolean newAccessible) {
		boolean oldAccessible = accessible;
		accessible = newAccessible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.ASSET__ACCESSIBLE, oldAccessible, accessible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastInspection() {
		return lastInspection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastInspection(Date newLastInspection) {
		Date oldLastInspection = lastInspection;
		lastInspection = newLastInspection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BathPackage.ASSET__LAST_INSPECTION, oldLastInspection, lastInspection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BathPackage.ASSET__ID:
				return getId();
			case BathPackage.ASSET__NAME:
				return getName();
			case BathPackage.ASSET__DESCRIPTION:
				return getDescription();
			case BathPackage.ASSET__GEOMETRY:
				return getGeometry();
			case BathPackage.ASSET__MIN_X:
				return getMinX();
			case BathPackage.ASSET__MIN_Y:
				return getMinY();
			case BathPackage.ASSET__MAX_X:
				return getMaxX();
			case BathPackage.ASSET__MAX_Y:
				return getMaxY();
			case BathPackage.ASSET__LEVEL:
				return getLevel();
			case BathPackage.ASSET__STATUS:
				return getStatus();
			case BathPackage.ASSET__ACCESSIBLE:
				return isAccessible();
			case BathPackage.ASSET__LAST_INSPECTION:
				return getLastInspection();
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
			case BathPackage.ASSET__ID:
				setId((String)newValue);
				return;
			case BathPackage.ASSET__NAME:
				setName((String)newValue);
				return;
			case BathPackage.ASSET__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BathPackage.ASSET__GEOMETRY:
				setGeometry((Geometry)newValue);
				return;
			case BathPackage.ASSET__MIN_X:
				setMinX((Double)newValue);
				return;
			case BathPackage.ASSET__MIN_Y:
				setMinY((Double)newValue);
				return;
			case BathPackage.ASSET__MAX_X:
				setMaxX((Double)newValue);
				return;
			case BathPackage.ASSET__MAX_Y:
				setMaxY((Double)newValue);
				return;
			case BathPackage.ASSET__LEVEL:
				setLevel((Level)newValue);
				return;
			case BathPackage.ASSET__STATUS:
				setStatus((OperationalStatus)newValue);
				return;
			case BathPackage.ASSET__ACCESSIBLE:
				setAccessible((Boolean)newValue);
				return;
			case BathPackage.ASSET__LAST_INSPECTION:
				setLastInspection((Date)newValue);
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
			case BathPackage.ASSET__ID:
				setId(ID_EDEFAULT);
				return;
			case BathPackage.ASSET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BathPackage.ASSET__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BathPackage.ASSET__GEOMETRY:
				setGeometry(GEOMETRY_EDEFAULT);
				return;
			case BathPackage.ASSET__MIN_X:
				setMinX(MIN_X_EDEFAULT);
				return;
			case BathPackage.ASSET__MIN_Y:
				setMinY(MIN_Y_EDEFAULT);
				return;
			case BathPackage.ASSET__MAX_X:
				setMaxX(MAX_X_EDEFAULT);
				return;
			case BathPackage.ASSET__MAX_Y:
				setMaxY(MAX_Y_EDEFAULT);
				return;
			case BathPackage.ASSET__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case BathPackage.ASSET__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case BathPackage.ASSET__ACCESSIBLE:
				setAccessible(ACCESSIBLE_EDEFAULT);
				return;
			case BathPackage.ASSET__LAST_INSPECTION:
				setLastInspection(LAST_INSPECTION_EDEFAULT);
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
			case BathPackage.ASSET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BathPackage.ASSET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BathPackage.ASSET__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BathPackage.ASSET__GEOMETRY:
				return GEOMETRY_EDEFAULT == null ? geometry != null : !GEOMETRY_EDEFAULT.equals(geometry);
			case BathPackage.ASSET__MIN_X:
				return minX != MIN_X_EDEFAULT;
			case BathPackage.ASSET__MIN_Y:
				return minY != MIN_Y_EDEFAULT;
			case BathPackage.ASSET__MAX_X:
				return maxX != MAX_X_EDEFAULT;
			case BathPackage.ASSET__MAX_Y:
				return maxY != MAX_Y_EDEFAULT;
			case BathPackage.ASSET__LEVEL:
				return level != LEVEL_EDEFAULT;
			case BathPackage.ASSET__STATUS:
				return status != STATUS_EDEFAULT;
			case BathPackage.ASSET__ACCESSIBLE:
				return accessible != ACCESSIBLE_EDEFAULT;
			case BathPackage.ASSET__LAST_INSPECTION:
				return LAST_INSPECTION_EDEFAULT == null ? lastInspection != null : !LAST_INSPECTION_EDEFAULT.equals(lastInspection);
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
		result.append(", description: ");
		result.append(description);
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
		result.append(", level: ");
		result.append(level);
		result.append(", status: ");
		result.append(status);
		result.append(", accessible: ");
		result.append(accessible);
		result.append(", lastInspection: ");
		result.append(lastInspection);
		result.append(')');
		return result.toString();
	}

} //AssetImpl
