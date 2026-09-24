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
import org.qgis.project.QgisPackage;
import org.qgis.project.SpatialRefSys;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.impl.ExtentImpl#getXmin <em>Xmin</em>}</li>
 *   <li>{@link org.qgis.project.impl.ExtentImpl#getYmin <em>Ymin</em>}</li>
 *   <li>{@link org.qgis.project.impl.ExtentImpl#getXmax <em>Xmax</em>}</li>
 *   <li>{@link org.qgis.project.impl.ExtentImpl#getYmax <em>Ymax</em>}</li>
 *   <li>{@link org.qgis.project.impl.ExtentImpl#getSpatialRefSys <em>Spatial Ref Sys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtentImpl extends MinimalEObjectImpl.Container implements Extent {
	/**
	 * The default value of the '{@link #getXmin() <em>Xmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmin()
	 * @generated
	 * @ordered
	 */
	protected static final double XMIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXmin() <em>Xmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmin()
	 * @generated
	 * @ordered
	 */
	protected double xmin = XMIN_EDEFAULT;

	/**
	 * This is true if the Xmin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xminESet;

	/**
	 * The default value of the '{@link #getYmin() <em>Ymin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYmin()
	 * @generated
	 * @ordered
	 */
	protected static final double YMIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYmin() <em>Ymin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYmin()
	 * @generated
	 * @ordered
	 */
	protected double ymin = YMIN_EDEFAULT;

	/**
	 * This is true if the Ymin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yminESet;

	/**
	 * The default value of the '{@link #getXmax() <em>Xmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmax()
	 * @generated
	 * @ordered
	 */
	protected static final double XMAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXmax() <em>Xmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmax()
	 * @generated
	 * @ordered
	 */
	protected double xmax = XMAX_EDEFAULT;

	/**
	 * This is true if the Xmax attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xmaxESet;

	/**
	 * The default value of the '{@link #getYmax() <em>Ymax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYmax()
	 * @generated
	 * @ordered
	 */
	protected static final double YMAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYmax() <em>Ymax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYmax()
	 * @generated
	 * @ordered
	 */
	protected double ymax = YMAX_EDEFAULT;

	/**
	 * This is true if the Ymax attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ymaxESet;

	/**
	 * The cached value of the '{@link #getSpatialRefSys() <em>Spatial Ref Sys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialRefSys()
	 * @generated
	 * @ordered
	 */
	protected SpatialRefSys spatialRefSys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QgisPackage.Literals.EXTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getXmin() {
		return xmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmin(double newXmin) {
		double oldXmin = xmin;
		xmin = newXmin;
		boolean oldXminESet = xminESet;
		xminESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.EXTENT__XMIN, oldXmin, xmin, !oldXminESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetXmin() {
		double oldXmin = xmin;
		boolean oldXminESet = xminESet;
		xmin = XMIN_EDEFAULT;
		xminESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QgisPackage.EXTENT__XMIN, oldXmin, XMIN_EDEFAULT, oldXminESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetXmin() {
		return xminESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getYmin() {
		return ymin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYmin(double newYmin) {
		double oldYmin = ymin;
		ymin = newYmin;
		boolean oldYminESet = yminESet;
		yminESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.EXTENT__YMIN, oldYmin, ymin, !oldYminESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetYmin() {
		double oldYmin = ymin;
		boolean oldYminESet = yminESet;
		ymin = YMIN_EDEFAULT;
		yminESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QgisPackage.EXTENT__YMIN, oldYmin, YMIN_EDEFAULT, oldYminESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetYmin() {
		return yminESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getXmax() {
		return xmax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmax(double newXmax) {
		double oldXmax = xmax;
		xmax = newXmax;
		boolean oldXmaxESet = xmaxESet;
		xmaxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.EXTENT__XMAX, oldXmax, xmax, !oldXmaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetXmax() {
		double oldXmax = xmax;
		boolean oldXmaxESet = xmaxESet;
		xmax = XMAX_EDEFAULT;
		xmaxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QgisPackage.EXTENT__XMAX, oldXmax, XMAX_EDEFAULT, oldXmaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetXmax() {
		return xmaxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getYmax() {
		return ymax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYmax(double newYmax) {
		double oldYmax = ymax;
		ymax = newYmax;
		boolean oldYmaxESet = ymaxESet;
		ymaxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.EXTENT__YMAX, oldYmax, ymax, !oldYmaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetYmax() {
		double oldYmax = ymax;
		boolean oldYmaxESet = ymaxESet;
		ymax = YMAX_EDEFAULT;
		ymaxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QgisPackage.EXTENT__YMAX, oldYmax, YMAX_EDEFAULT, oldYmaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetYmax() {
		return ymaxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialRefSys getSpatialRefSys() {
		return spatialRefSys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpatialRefSys(SpatialRefSys newSpatialRefSys, NotificationChain msgs) {
		SpatialRefSys oldSpatialRefSys = spatialRefSys;
		spatialRefSys = newSpatialRefSys;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.EXTENT__SPATIAL_REF_SYS, oldSpatialRefSys, newSpatialRefSys);
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
	public void setSpatialRefSys(SpatialRefSys newSpatialRefSys) {
		if (newSpatialRefSys != spatialRefSys) {
			NotificationChain msgs = null;
			if (spatialRefSys != null)
				msgs = ((InternalEObject)spatialRefSys).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.EXTENT__SPATIAL_REF_SYS, null, msgs);
			if (newSpatialRefSys != null)
				msgs = ((InternalEObject)newSpatialRefSys).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.EXTENT__SPATIAL_REF_SYS, null, msgs);
			msgs = basicSetSpatialRefSys(newSpatialRefSys, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.EXTENT__SPATIAL_REF_SYS, newSpatialRefSys, newSpatialRefSys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QgisPackage.EXTENT__SPATIAL_REF_SYS:
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
			case QgisPackage.EXTENT__XMIN:
				return getXmin();
			case QgisPackage.EXTENT__YMIN:
				return getYmin();
			case QgisPackage.EXTENT__XMAX:
				return getXmax();
			case QgisPackage.EXTENT__YMAX:
				return getYmax();
			case QgisPackage.EXTENT__SPATIAL_REF_SYS:
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
			case QgisPackage.EXTENT__XMIN:
				setXmin((Double)newValue);
				return;
			case QgisPackage.EXTENT__YMIN:
				setYmin((Double)newValue);
				return;
			case QgisPackage.EXTENT__XMAX:
				setXmax((Double)newValue);
				return;
			case QgisPackage.EXTENT__YMAX:
				setYmax((Double)newValue);
				return;
			case QgisPackage.EXTENT__SPATIAL_REF_SYS:
				setSpatialRefSys((SpatialRefSys)newValue);
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
			case QgisPackage.EXTENT__XMIN:
				unsetXmin();
				return;
			case QgisPackage.EXTENT__YMIN:
				unsetYmin();
				return;
			case QgisPackage.EXTENT__XMAX:
				unsetXmax();
				return;
			case QgisPackage.EXTENT__YMAX:
				unsetYmax();
				return;
			case QgisPackage.EXTENT__SPATIAL_REF_SYS:
				setSpatialRefSys((SpatialRefSys)null);
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
			case QgisPackage.EXTENT__XMIN:
				return isSetXmin();
			case QgisPackage.EXTENT__YMIN:
				return isSetYmin();
			case QgisPackage.EXTENT__XMAX:
				return isSetXmax();
			case QgisPackage.EXTENT__YMAX:
				return isSetYmax();
			case QgisPackage.EXTENT__SPATIAL_REF_SYS:
				return spatialRefSys != null;
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
		result.append(" (xmin: ");
		if (xminESet) result.append(xmin); else result.append("<unset>");
		result.append(", ymin: ");
		if (yminESet) result.append(ymin); else result.append("<unset>");
		result.append(", xmax: ");
		if (xmaxESet) result.append(xmax); else result.append("<unset>");
		result.append(", ymax: ");
		if (ymaxESet) result.append(ymax); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ExtentImpl
