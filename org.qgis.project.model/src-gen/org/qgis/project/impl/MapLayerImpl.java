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

import org.qgis.project.Crs;
import org.qgis.project.Labeling;
import org.qgis.project.MapLayer;
import org.qgis.project.Provider;
import org.qgis.project.QgisPackage;
import org.qgis.project.Renderer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.impl.MapLayerImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.qgis.project.impl.MapLayerImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.qgis.project.impl.MapLayerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.qgis.project.impl.MapLayerImpl#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link org.qgis.project.impl.MapLayerImpl#getLayername <em>Layername</em>}</li>
 *   <li>{@link org.qgis.project.impl.MapLayerImpl#getSrs <em>Srs</em>}</li>
 *   <li>{@link org.qgis.project.impl.MapLayerImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.qgis.project.impl.MapLayerImpl#getRenderer <em>Renderer</em>}</li>
 *   <li>{@link org.qgis.project.impl.MapLayerImpl#getLabeling <em>Labeling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapLayerImpl extends MinimalEObjectImpl.Container implements MapLayer {
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
	 * The default value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOMETRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected String geometry = GEOMETRY_EDEFAULT;

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
	 * The default value of the '{@link #getDatasource() <em>Datasource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasource()
	 * @generated
	 * @ordered
	 */
	protected static final String DATASOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatasource() <em>Datasource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasource()
	 * @generated
	 * @ordered
	 */
	protected String datasource = DATASOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayername() <em>Layername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayername()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayername() <em>Layername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayername()
	 * @generated
	 * @ordered
	 */
	protected String layername = LAYERNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSrs() <em>Srs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrs()
	 * @generated
	 * @ordered
	 */
	protected Crs srs;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Provider provider;

	/**
	 * The cached value of the '{@link #getRenderer() <em>Renderer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderer()
	 * @generated
	 * @ordered
	 */
	protected Renderer renderer;

	/**
	 * The cached value of the '{@link #getLabeling() <em>Labeling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabeling()
	 * @generated
	 * @ordered
	 */
	protected Labeling labeling;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QgisPackage.Literals.MAP_LAYER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.MAP_LAYER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeometry(String newGeometry) {
		String oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.MAP_LAYER__GEOMETRY, oldGeometry, geometry));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.MAP_LAYER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatasource() {
		return datasource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatasource(String newDatasource) {
		String oldDatasource = datasource;
		datasource = newDatasource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.MAP_LAYER__DATASOURCE, oldDatasource, datasource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLayername() {
		return layername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayername(String newLayername) {
		String oldLayername = layername;
		layername = newLayername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.MAP_LAYER__LAYERNAME, oldLayername, layername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Crs getSrs() {
		return srs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrs(Crs newSrs, NotificationChain msgs) {
		Crs oldSrs = srs;
		srs = newSrs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.MAP_LAYER__SRS, oldSrs, newSrs);
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
	public void setSrs(Crs newSrs) {
		if (newSrs != srs) {
			NotificationChain msgs = null;
			if (srs != null)
				msgs = ((InternalEObject)srs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.MAP_LAYER__SRS, null, msgs);
			if (newSrs != null)
				msgs = ((InternalEObject)newSrs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.MAP_LAYER__SRS, null, msgs);
			msgs = basicSetSrs(newSrs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.MAP_LAYER__SRS, newSrs, newSrs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Provider getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(Provider newProvider, NotificationChain msgs) {
		Provider oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.MAP_LAYER__PROVIDER, oldProvider, newProvider);
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
	public void setProvider(Provider newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.MAP_LAYER__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.MAP_LAYER__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.MAP_LAYER__PROVIDER, newProvider, newProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Renderer getRenderer() {
		return renderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRenderer(Renderer newRenderer, NotificationChain msgs) {
		Renderer oldRenderer = renderer;
		renderer = newRenderer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.MAP_LAYER__RENDERER, oldRenderer, newRenderer);
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
	public void setRenderer(Renderer newRenderer) {
		if (newRenderer != renderer) {
			NotificationChain msgs = null;
			if (renderer != null)
				msgs = ((InternalEObject)renderer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.MAP_LAYER__RENDERER, null, msgs);
			if (newRenderer != null)
				msgs = ((InternalEObject)newRenderer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.MAP_LAYER__RENDERER, null, msgs);
			msgs = basicSetRenderer(newRenderer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.MAP_LAYER__RENDERER, newRenderer, newRenderer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Labeling getLabeling() {
		return labeling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabeling(Labeling newLabeling, NotificationChain msgs) {
		Labeling oldLabeling = labeling;
		labeling = newLabeling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.MAP_LAYER__LABELING, oldLabeling, newLabeling);
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
	public void setLabeling(Labeling newLabeling) {
		if (newLabeling != labeling) {
			NotificationChain msgs = null;
			if (labeling != null)
				msgs = ((InternalEObject)labeling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.MAP_LAYER__LABELING, null, msgs);
			if (newLabeling != null)
				msgs = ((InternalEObject)newLabeling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.MAP_LAYER__LABELING, null, msgs);
			msgs = basicSetLabeling(newLabeling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.MAP_LAYER__LABELING, newLabeling, newLabeling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QgisPackage.MAP_LAYER__SRS:
				return basicSetSrs(null, msgs);
			case QgisPackage.MAP_LAYER__PROVIDER:
				return basicSetProvider(null, msgs);
			case QgisPackage.MAP_LAYER__RENDERER:
				return basicSetRenderer(null, msgs);
			case QgisPackage.MAP_LAYER__LABELING:
				return basicSetLabeling(null, msgs);
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
			case QgisPackage.MAP_LAYER__TYPE:
				return getType();
			case QgisPackage.MAP_LAYER__GEOMETRY:
				return getGeometry();
			case QgisPackage.MAP_LAYER__ID:
				return getId();
			case QgisPackage.MAP_LAYER__DATASOURCE:
				return getDatasource();
			case QgisPackage.MAP_LAYER__LAYERNAME:
				return getLayername();
			case QgisPackage.MAP_LAYER__SRS:
				return getSrs();
			case QgisPackage.MAP_LAYER__PROVIDER:
				return getProvider();
			case QgisPackage.MAP_LAYER__RENDERER:
				return getRenderer();
			case QgisPackage.MAP_LAYER__LABELING:
				return getLabeling();
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
			case QgisPackage.MAP_LAYER__TYPE:
				setType((String)newValue);
				return;
			case QgisPackage.MAP_LAYER__GEOMETRY:
				setGeometry((String)newValue);
				return;
			case QgisPackage.MAP_LAYER__ID:
				setId((String)newValue);
				return;
			case QgisPackage.MAP_LAYER__DATASOURCE:
				setDatasource((String)newValue);
				return;
			case QgisPackage.MAP_LAYER__LAYERNAME:
				setLayername((String)newValue);
				return;
			case QgisPackage.MAP_LAYER__SRS:
				setSrs((Crs)newValue);
				return;
			case QgisPackage.MAP_LAYER__PROVIDER:
				setProvider((Provider)newValue);
				return;
			case QgisPackage.MAP_LAYER__RENDERER:
				setRenderer((Renderer)newValue);
				return;
			case QgisPackage.MAP_LAYER__LABELING:
				setLabeling((Labeling)newValue);
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
			case QgisPackage.MAP_LAYER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case QgisPackage.MAP_LAYER__GEOMETRY:
				setGeometry(GEOMETRY_EDEFAULT);
				return;
			case QgisPackage.MAP_LAYER__ID:
				setId(ID_EDEFAULT);
				return;
			case QgisPackage.MAP_LAYER__DATASOURCE:
				setDatasource(DATASOURCE_EDEFAULT);
				return;
			case QgisPackage.MAP_LAYER__LAYERNAME:
				setLayername(LAYERNAME_EDEFAULT);
				return;
			case QgisPackage.MAP_LAYER__SRS:
				setSrs((Crs)null);
				return;
			case QgisPackage.MAP_LAYER__PROVIDER:
				setProvider((Provider)null);
				return;
			case QgisPackage.MAP_LAYER__RENDERER:
				setRenderer((Renderer)null);
				return;
			case QgisPackage.MAP_LAYER__LABELING:
				setLabeling((Labeling)null);
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
			case QgisPackage.MAP_LAYER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case QgisPackage.MAP_LAYER__GEOMETRY:
				return GEOMETRY_EDEFAULT == null ? geometry != null : !GEOMETRY_EDEFAULT.equals(geometry);
			case QgisPackage.MAP_LAYER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case QgisPackage.MAP_LAYER__DATASOURCE:
				return DATASOURCE_EDEFAULT == null ? datasource != null : !DATASOURCE_EDEFAULT.equals(datasource);
			case QgisPackage.MAP_LAYER__LAYERNAME:
				return LAYERNAME_EDEFAULT == null ? layername != null : !LAYERNAME_EDEFAULT.equals(layername);
			case QgisPackage.MAP_LAYER__SRS:
				return srs != null;
			case QgisPackage.MAP_LAYER__PROVIDER:
				return provider != null;
			case QgisPackage.MAP_LAYER__RENDERER:
				return renderer != null;
			case QgisPackage.MAP_LAYER__LABELING:
				return labeling != null;
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
		result.append(", geometry: ");
		result.append(geometry);
		result.append(", id: ");
		result.append(id);
		result.append(", datasource: ");
		result.append(datasource);
		result.append(", layername: ");
		result.append(layername);
		result.append(')');
		return result.toString();
	}

} //MapLayerImpl
