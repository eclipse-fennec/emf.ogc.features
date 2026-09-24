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
import org.qgis.project.LayerOrder;
import org.qgis.project.LayerTreeGroup;
import org.qgis.project.Project;
import org.qgis.project.ProjectLayers;
import org.qgis.project.ProjectViewSettings;
import org.qgis.project.Properties;
import org.qgis.project.QgisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.impl.ProjectImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.qgis.project.impl.ProjectImpl#getProjectname <em>Projectname</em>}</li>
 *   <li>{@link org.qgis.project.impl.ProjectImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.qgis.project.impl.ProjectImpl#getProjectCrs <em>Project Crs</em>}</li>
 *   <li>{@link org.qgis.project.impl.ProjectImpl#getLayerTreeGroup <em>Layer Tree Group</em>}</li>
 *   <li>{@link org.qgis.project.impl.ProjectImpl#getProjectLayers <em>Project Layers</em>}</li>
 *   <li>{@link org.qgis.project.impl.ProjectImpl#getLayerOrder <em>Layer Order</em>}</li>
 *   <li>{@link org.qgis.project.impl.ProjectImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.qgis.project.impl.ProjectImpl#getViewSettings <em>View Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectname() <em>Projectname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectname()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectname() <em>Projectname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectname()
	 * @generated
	 * @ordered
	 */
	protected String projectname = PROJECTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProjectCrs() <em>Project Crs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectCrs()
	 * @generated
	 * @ordered
	 */
	protected Crs projectCrs;

	/**
	 * The cached value of the '{@link #getLayerTreeGroup() <em>Layer Tree Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerTreeGroup()
	 * @generated
	 * @ordered
	 */
	protected LayerTreeGroup layerTreeGroup;

	/**
	 * The cached value of the '{@link #getProjectLayers() <em>Project Layers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectLayers()
	 * @generated
	 * @ordered
	 */
	protected ProjectLayers projectLayers;

	/**
	 * The cached value of the '{@link #getLayerOrder() <em>Layer Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerOrder()
	 * @generated
	 * @ordered
	 */
	protected LayerOrder layerOrder;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected Properties properties;

	/**
	 * The cached value of the '{@link #getViewSettings() <em>View Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewSettings()
	 * @generated
	 * @ordered
	 */
	protected ProjectViewSettings viewSettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QgisPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectname() {
		return projectname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectname(String newProjectname) {
		String oldProjectname = projectname;
		projectname = newProjectname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT__PROJECTNAME, oldProjectname, projectname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Crs getProjectCrs() {
		return projectCrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectCrs(Crs newProjectCrs, NotificationChain msgs) {
		Crs oldProjectCrs = projectCrs;
		projectCrs = newProjectCrs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT__PROJECT_CRS, oldProjectCrs, newProjectCrs);
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
	public void setProjectCrs(Crs newProjectCrs) {
		if (newProjectCrs != projectCrs) {
			NotificationChain msgs = null;
			if (projectCrs != null)
				msgs = ((InternalEObject)projectCrs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.PROJECT__PROJECT_CRS, null, msgs);
			if (newProjectCrs != null)
				msgs = ((InternalEObject)newProjectCrs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.PROJECT__PROJECT_CRS, null, msgs);
			msgs = basicSetProjectCrs(newProjectCrs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT__PROJECT_CRS, newProjectCrs, newProjectCrs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerTreeGroup getLayerTreeGroup() {
		return layerTreeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayerTreeGroup(LayerTreeGroup newLayerTreeGroup, NotificationChain msgs) {
		LayerTreeGroup oldLayerTreeGroup = layerTreeGroup;
		layerTreeGroup = newLayerTreeGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT__LAYER_TREE_GROUP, oldLayerTreeGroup, newLayerTreeGroup);
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
	public void setLayerTreeGroup(LayerTreeGroup newLayerTreeGroup) {
		if (newLayerTreeGroup != layerTreeGroup) {
			NotificationChain msgs = null;
			if (layerTreeGroup != null)
				msgs = ((InternalEObject)layerTreeGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.PROJECT__LAYER_TREE_GROUP, null, msgs);
			if (newLayerTreeGroup != null)
				msgs = ((InternalEObject)newLayerTreeGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.PROJECT__LAYER_TREE_GROUP, null, msgs);
			msgs = basicSetLayerTreeGroup(newLayerTreeGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT__LAYER_TREE_GROUP, newLayerTreeGroup, newLayerTreeGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectLayers getProjectLayers() {
		return projectLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectLayers(ProjectLayers newProjectLayers, NotificationChain msgs) {
		ProjectLayers oldProjectLayers = projectLayers;
		projectLayers = newProjectLayers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT__PROJECT_LAYERS, oldProjectLayers, newProjectLayers);
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
	public void setProjectLayers(ProjectLayers newProjectLayers) {
		if (newProjectLayers != projectLayers) {
			NotificationChain msgs = null;
			if (projectLayers != null)
				msgs = ((InternalEObject)projectLayers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.PROJECT__PROJECT_LAYERS, null, msgs);
			if (newProjectLayers != null)
				msgs = ((InternalEObject)newProjectLayers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.PROJECT__PROJECT_LAYERS, null, msgs);
			msgs = basicSetProjectLayers(newProjectLayers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT__PROJECT_LAYERS, newProjectLayers, newProjectLayers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerOrder getLayerOrder() {
		return layerOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayerOrder(LayerOrder newLayerOrder, NotificationChain msgs) {
		LayerOrder oldLayerOrder = layerOrder;
		layerOrder = newLayerOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT__LAYER_ORDER, oldLayerOrder, newLayerOrder);
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
	public void setLayerOrder(LayerOrder newLayerOrder) {
		if (newLayerOrder != layerOrder) {
			NotificationChain msgs = null;
			if (layerOrder != null)
				msgs = ((InternalEObject)layerOrder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.PROJECT__LAYER_ORDER, null, msgs);
			if (newLayerOrder != null)
				msgs = ((InternalEObject)newLayerOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.PROJECT__LAYER_ORDER, null, msgs);
			msgs = basicSetLayerOrder(newLayerOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT__LAYER_ORDER, newLayerOrder, newLayerOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Properties getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(Properties newProperties, NotificationChain msgs) {
		Properties oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT__PROPERTIES, oldProperties, newProperties);
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
	public void setProperties(Properties newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.PROJECT__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.PROJECT__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectViewSettings getViewSettings() {
		return viewSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewSettings(ProjectViewSettings newViewSettings, NotificationChain msgs) {
		ProjectViewSettings oldViewSettings = viewSettings;
		viewSettings = newViewSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT__VIEW_SETTINGS, oldViewSettings, newViewSettings);
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
	public void setViewSettings(ProjectViewSettings newViewSettings) {
		if (newViewSettings != viewSettings) {
			NotificationChain msgs = null;
			if (viewSettings != null)
				msgs = ((InternalEObject)viewSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.PROJECT__VIEW_SETTINGS, null, msgs);
			if (newViewSettings != null)
				msgs = ((InternalEObject)newViewSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.PROJECT__VIEW_SETTINGS, null, msgs);
			msgs = basicSetViewSettings(newViewSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.PROJECT__VIEW_SETTINGS, newViewSettings, newViewSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QgisPackage.PROJECT__PROJECT_CRS:
				return basicSetProjectCrs(null, msgs);
			case QgisPackage.PROJECT__LAYER_TREE_GROUP:
				return basicSetLayerTreeGroup(null, msgs);
			case QgisPackage.PROJECT__PROJECT_LAYERS:
				return basicSetProjectLayers(null, msgs);
			case QgisPackage.PROJECT__LAYER_ORDER:
				return basicSetLayerOrder(null, msgs);
			case QgisPackage.PROJECT__PROPERTIES:
				return basicSetProperties(null, msgs);
			case QgisPackage.PROJECT__VIEW_SETTINGS:
				return basicSetViewSettings(null, msgs);
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
			case QgisPackage.PROJECT__VERSION:
				return getVersion();
			case QgisPackage.PROJECT__PROJECTNAME:
				return getProjectname();
			case QgisPackage.PROJECT__TITLE:
				return getTitle();
			case QgisPackage.PROJECT__PROJECT_CRS:
				return getProjectCrs();
			case QgisPackage.PROJECT__LAYER_TREE_GROUP:
				return getLayerTreeGroup();
			case QgisPackage.PROJECT__PROJECT_LAYERS:
				return getProjectLayers();
			case QgisPackage.PROJECT__LAYER_ORDER:
				return getLayerOrder();
			case QgisPackage.PROJECT__PROPERTIES:
				return getProperties();
			case QgisPackage.PROJECT__VIEW_SETTINGS:
				return getViewSettings();
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
			case QgisPackage.PROJECT__VERSION:
				setVersion((String)newValue);
				return;
			case QgisPackage.PROJECT__PROJECTNAME:
				setProjectname((String)newValue);
				return;
			case QgisPackage.PROJECT__TITLE:
				setTitle((String)newValue);
				return;
			case QgisPackage.PROJECT__PROJECT_CRS:
				setProjectCrs((Crs)newValue);
				return;
			case QgisPackage.PROJECT__LAYER_TREE_GROUP:
				setLayerTreeGroup((LayerTreeGroup)newValue);
				return;
			case QgisPackage.PROJECT__PROJECT_LAYERS:
				setProjectLayers((ProjectLayers)newValue);
				return;
			case QgisPackage.PROJECT__LAYER_ORDER:
				setLayerOrder((LayerOrder)newValue);
				return;
			case QgisPackage.PROJECT__PROPERTIES:
				setProperties((Properties)newValue);
				return;
			case QgisPackage.PROJECT__VIEW_SETTINGS:
				setViewSettings((ProjectViewSettings)newValue);
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
			case QgisPackage.PROJECT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case QgisPackage.PROJECT__PROJECTNAME:
				setProjectname(PROJECTNAME_EDEFAULT);
				return;
			case QgisPackage.PROJECT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case QgisPackage.PROJECT__PROJECT_CRS:
				setProjectCrs((Crs)null);
				return;
			case QgisPackage.PROJECT__LAYER_TREE_GROUP:
				setLayerTreeGroup((LayerTreeGroup)null);
				return;
			case QgisPackage.PROJECT__PROJECT_LAYERS:
				setProjectLayers((ProjectLayers)null);
				return;
			case QgisPackage.PROJECT__LAYER_ORDER:
				setLayerOrder((LayerOrder)null);
				return;
			case QgisPackage.PROJECT__PROPERTIES:
				setProperties((Properties)null);
				return;
			case QgisPackage.PROJECT__VIEW_SETTINGS:
				setViewSettings((ProjectViewSettings)null);
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
			case QgisPackage.PROJECT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case QgisPackage.PROJECT__PROJECTNAME:
				return PROJECTNAME_EDEFAULT == null ? projectname != null : !PROJECTNAME_EDEFAULT.equals(projectname);
			case QgisPackage.PROJECT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case QgisPackage.PROJECT__PROJECT_CRS:
				return projectCrs != null;
			case QgisPackage.PROJECT__LAYER_TREE_GROUP:
				return layerTreeGroup != null;
			case QgisPackage.PROJECT__PROJECT_LAYERS:
				return projectLayers != null;
			case QgisPackage.PROJECT__LAYER_ORDER:
				return layerOrder != null;
			case QgisPackage.PROJECT__PROPERTIES:
				return properties != null;
			case QgisPackage.PROJECT__VIEW_SETTINGS:
				return viewSettings != null;
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
		result.append(" (version: ");
		result.append(version);
		result.append(", projectname: ");
		result.append(projectname);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
