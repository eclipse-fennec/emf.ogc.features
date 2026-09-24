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
import org.qgis.project.SpatialRefSys;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spatial Ref Sys</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.impl.SpatialRefSysImpl#getNativeFormat <em>Native Format</em>}</li>
 *   <li>{@link org.qgis.project.impl.SpatialRefSysImpl#getWkt <em>Wkt</em>}</li>
 *   <li>{@link org.qgis.project.impl.SpatialRefSysImpl#getProj4 <em>Proj4</em>}</li>
 *   <li>{@link org.qgis.project.impl.SpatialRefSysImpl#getSrsid <em>Srsid</em>}</li>
 *   <li>{@link org.qgis.project.impl.SpatialRefSysImpl#getSrid <em>Srid</em>}</li>
 *   <li>{@link org.qgis.project.impl.SpatialRefSysImpl#getAuthid <em>Authid</em>}</li>
 *   <li>{@link org.qgis.project.impl.SpatialRefSysImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.qgis.project.impl.SpatialRefSysImpl#getProjectionacronym <em>Projectionacronym</em>}</li>
 *   <li>{@link org.qgis.project.impl.SpatialRefSysImpl#getEllipsoidacronym <em>Ellipsoidacronym</em>}</li>
 *   <li>{@link org.qgis.project.impl.SpatialRefSysImpl#getGeographicflag <em>Geographicflag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpatialRefSysImpl extends MinimalEObjectImpl.Container implements SpatialRefSys {
	/**
	 * The default value of the '{@link #getNativeFormat() <em>Native Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String NATIVE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNativeFormat() <em>Native Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeFormat()
	 * @generated
	 * @ordered
	 */
	protected String nativeFormat = NATIVE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWkt() <em>Wkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWkt()
	 * @generated
	 * @ordered
	 */
	protected static final String WKT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWkt() <em>Wkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWkt()
	 * @generated
	 * @ordered
	 */
	protected String wkt = WKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProj4() <em>Proj4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProj4()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJ4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProj4() <em>Proj4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProj4()
	 * @generated
	 * @ordered
	 */
	protected String proj4 = PROJ4_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrsid() <em>Srsid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsid()
	 * @generated
	 * @ordered
	 */
	protected static final String SRSID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrsid() <em>Srsid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsid()
	 * @generated
	 * @ordered
	 */
	protected String srsid = SRSID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrid() <em>Srid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrid()
	 * @generated
	 * @ordered
	 */
	protected static final String SRID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrid() <em>Srid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrid()
	 * @generated
	 * @ordered
	 */
	protected String srid = SRID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthid() <em>Authid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthid()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthid() <em>Authid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthid()
	 * @generated
	 * @ordered
	 */
	protected String authid = AUTHID_EDEFAULT;

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
	 * The default value of the '{@link #getProjectionacronym() <em>Projectionacronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectionacronym()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECTIONACRONYM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectionacronym() <em>Projectionacronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectionacronym()
	 * @generated
	 * @ordered
	 */
	protected String projectionacronym = PROJECTIONACRONYM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEllipsoidacronym() <em>Ellipsoidacronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEllipsoidacronym()
	 * @generated
	 * @ordered
	 */
	protected static final String ELLIPSOIDACRONYM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEllipsoidacronym() <em>Ellipsoidacronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEllipsoidacronym()
	 * @generated
	 * @ordered
	 */
	protected String ellipsoidacronym = ELLIPSOIDACRONYM_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeographicflag() <em>Geographicflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeographicflag()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOGRAPHICFLAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeographicflag() <em>Geographicflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeographicflag()
	 * @generated
	 * @ordered
	 */
	protected String geographicflag = GEOGRAPHICFLAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpatialRefSysImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QgisPackage.Literals.SPATIAL_REF_SYS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNativeFormat() {
		return nativeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNativeFormat(String newNativeFormat) {
		String oldNativeFormat = nativeFormat;
		nativeFormat = newNativeFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SPATIAL_REF_SYS__NATIVE_FORMAT, oldNativeFormat, nativeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWkt() {
		return wkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWkt(String newWkt) {
		String oldWkt = wkt;
		wkt = newWkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SPATIAL_REF_SYS__WKT, oldWkt, wkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProj4() {
		return proj4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProj4(String newProj4) {
		String oldProj4 = proj4;
		proj4 = newProj4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SPATIAL_REF_SYS__PROJ4, oldProj4, proj4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSrsid() {
		return srsid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrsid(String newSrsid) {
		String oldSrsid = srsid;
		srsid = newSrsid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SPATIAL_REF_SYS__SRSID, oldSrsid, srsid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSrid() {
		return srid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrid(String newSrid) {
		String oldSrid = srid;
		srid = newSrid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SPATIAL_REF_SYS__SRID, oldSrid, srid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthid() {
		return authid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthid(String newAuthid) {
		String oldAuthid = authid;
		authid = newAuthid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SPATIAL_REF_SYS__AUTHID, oldAuthid, authid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SPATIAL_REF_SYS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectionacronym() {
		return projectionacronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectionacronym(String newProjectionacronym) {
		String oldProjectionacronym = projectionacronym;
		projectionacronym = newProjectionacronym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SPATIAL_REF_SYS__PROJECTIONACRONYM, oldProjectionacronym, projectionacronym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEllipsoidacronym() {
		return ellipsoidacronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEllipsoidacronym(String newEllipsoidacronym) {
		String oldEllipsoidacronym = ellipsoidacronym;
		ellipsoidacronym = newEllipsoidacronym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SPATIAL_REF_SYS__ELLIPSOIDACRONYM, oldEllipsoidacronym, ellipsoidacronym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeographicflag() {
		return geographicflag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeographicflag(String newGeographicflag) {
		String oldGeographicflag = geographicflag;
		geographicflag = newGeographicflag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.SPATIAL_REF_SYS__GEOGRAPHICFLAG, oldGeographicflag, geographicflag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QgisPackage.SPATIAL_REF_SYS__NATIVE_FORMAT:
				return getNativeFormat();
			case QgisPackage.SPATIAL_REF_SYS__WKT:
				return getWkt();
			case QgisPackage.SPATIAL_REF_SYS__PROJ4:
				return getProj4();
			case QgisPackage.SPATIAL_REF_SYS__SRSID:
				return getSrsid();
			case QgisPackage.SPATIAL_REF_SYS__SRID:
				return getSrid();
			case QgisPackage.SPATIAL_REF_SYS__AUTHID:
				return getAuthid();
			case QgisPackage.SPATIAL_REF_SYS__DESCRIPTION:
				return getDescription();
			case QgisPackage.SPATIAL_REF_SYS__PROJECTIONACRONYM:
				return getProjectionacronym();
			case QgisPackage.SPATIAL_REF_SYS__ELLIPSOIDACRONYM:
				return getEllipsoidacronym();
			case QgisPackage.SPATIAL_REF_SYS__GEOGRAPHICFLAG:
				return getGeographicflag();
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
			case QgisPackage.SPATIAL_REF_SYS__NATIVE_FORMAT:
				setNativeFormat((String)newValue);
				return;
			case QgisPackage.SPATIAL_REF_SYS__WKT:
				setWkt((String)newValue);
				return;
			case QgisPackage.SPATIAL_REF_SYS__PROJ4:
				setProj4((String)newValue);
				return;
			case QgisPackage.SPATIAL_REF_SYS__SRSID:
				setSrsid((String)newValue);
				return;
			case QgisPackage.SPATIAL_REF_SYS__SRID:
				setSrid((String)newValue);
				return;
			case QgisPackage.SPATIAL_REF_SYS__AUTHID:
				setAuthid((String)newValue);
				return;
			case QgisPackage.SPATIAL_REF_SYS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case QgisPackage.SPATIAL_REF_SYS__PROJECTIONACRONYM:
				setProjectionacronym((String)newValue);
				return;
			case QgisPackage.SPATIAL_REF_SYS__ELLIPSOIDACRONYM:
				setEllipsoidacronym((String)newValue);
				return;
			case QgisPackage.SPATIAL_REF_SYS__GEOGRAPHICFLAG:
				setGeographicflag((String)newValue);
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
			case QgisPackage.SPATIAL_REF_SYS__NATIVE_FORMAT:
				setNativeFormat(NATIVE_FORMAT_EDEFAULT);
				return;
			case QgisPackage.SPATIAL_REF_SYS__WKT:
				setWkt(WKT_EDEFAULT);
				return;
			case QgisPackage.SPATIAL_REF_SYS__PROJ4:
				setProj4(PROJ4_EDEFAULT);
				return;
			case QgisPackage.SPATIAL_REF_SYS__SRSID:
				setSrsid(SRSID_EDEFAULT);
				return;
			case QgisPackage.SPATIAL_REF_SYS__SRID:
				setSrid(SRID_EDEFAULT);
				return;
			case QgisPackage.SPATIAL_REF_SYS__AUTHID:
				setAuthid(AUTHID_EDEFAULT);
				return;
			case QgisPackage.SPATIAL_REF_SYS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case QgisPackage.SPATIAL_REF_SYS__PROJECTIONACRONYM:
				setProjectionacronym(PROJECTIONACRONYM_EDEFAULT);
				return;
			case QgisPackage.SPATIAL_REF_SYS__ELLIPSOIDACRONYM:
				setEllipsoidacronym(ELLIPSOIDACRONYM_EDEFAULT);
				return;
			case QgisPackage.SPATIAL_REF_SYS__GEOGRAPHICFLAG:
				setGeographicflag(GEOGRAPHICFLAG_EDEFAULT);
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
			case QgisPackage.SPATIAL_REF_SYS__NATIVE_FORMAT:
				return NATIVE_FORMAT_EDEFAULT == null ? nativeFormat != null : !NATIVE_FORMAT_EDEFAULT.equals(nativeFormat);
			case QgisPackage.SPATIAL_REF_SYS__WKT:
				return WKT_EDEFAULT == null ? wkt != null : !WKT_EDEFAULT.equals(wkt);
			case QgisPackage.SPATIAL_REF_SYS__PROJ4:
				return PROJ4_EDEFAULT == null ? proj4 != null : !PROJ4_EDEFAULT.equals(proj4);
			case QgisPackage.SPATIAL_REF_SYS__SRSID:
				return SRSID_EDEFAULT == null ? srsid != null : !SRSID_EDEFAULT.equals(srsid);
			case QgisPackage.SPATIAL_REF_SYS__SRID:
				return SRID_EDEFAULT == null ? srid != null : !SRID_EDEFAULT.equals(srid);
			case QgisPackage.SPATIAL_REF_SYS__AUTHID:
				return AUTHID_EDEFAULT == null ? authid != null : !AUTHID_EDEFAULT.equals(authid);
			case QgisPackage.SPATIAL_REF_SYS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case QgisPackage.SPATIAL_REF_SYS__PROJECTIONACRONYM:
				return PROJECTIONACRONYM_EDEFAULT == null ? projectionacronym != null : !PROJECTIONACRONYM_EDEFAULT.equals(projectionacronym);
			case QgisPackage.SPATIAL_REF_SYS__ELLIPSOIDACRONYM:
				return ELLIPSOIDACRONYM_EDEFAULT == null ? ellipsoidacronym != null : !ELLIPSOIDACRONYM_EDEFAULT.equals(ellipsoidacronym);
			case QgisPackage.SPATIAL_REF_SYS__GEOGRAPHICFLAG:
				return GEOGRAPHICFLAG_EDEFAULT == null ? geographicflag != null : !GEOGRAPHICFLAG_EDEFAULT.equals(geographicflag);
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
		result.append(" (nativeFormat: ");
		result.append(nativeFormat);
		result.append(", wkt: ");
		result.append(wkt);
		result.append(", proj4: ");
		result.append(proj4);
		result.append(", srsid: ");
		result.append(srsid);
		result.append(", srid: ");
		result.append(srid);
		result.append(", authid: ");
		result.append(authid);
		result.append(", description: ");
		result.append(description);
		result.append(", projectionacronym: ");
		result.append(projectionacronym);
		result.append(", ellipsoidacronym: ");
		result.append(ellipsoidacronym);
		result.append(", geographicflag: ");
		result.append(geographicflag);
		result.append(')');
		return result.toString();
	}

} //SpatialRefSysImpl
