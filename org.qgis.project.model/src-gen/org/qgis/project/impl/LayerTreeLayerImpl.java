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

import org.qgis.project.CheckState;
import org.qgis.project.LayerTreeLayer;
import org.qgis.project.QgisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer Tree Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.impl.LayerTreeLayerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.qgis.project.impl.LayerTreeLayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.qgis.project.impl.LayerTreeLayerImpl#getProviderKey <em>Provider Key</em>}</li>
 *   <li>{@link org.qgis.project.impl.LayerTreeLayerImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.qgis.project.impl.LayerTreeLayerImpl#getChecked <em>Checked</em>}</li>
 *   <li>{@link org.qgis.project.impl.LayerTreeLayerImpl#getExpanded <em>Expanded</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerTreeLayerImpl extends MinimalEObjectImpl.Container implements LayerTreeLayer {
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
	 * The default value of the '{@link #getProviderKey() <em>Provider Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderKey() <em>Provider Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderKey()
	 * @generated
	 * @ordered
	 */
	protected String providerKey = PROVIDER_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChecked() <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecked()
	 * @generated
	 * @ordered
	 */
	protected static final CheckState CHECKED_EDEFAULT = CheckState.CHECKED;

	/**
	 * The cached value of the '{@link #getChecked() <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecked()
	 * @generated
	 * @ordered
	 */
	protected CheckState checked = CHECKED_EDEFAULT;

	/**
	 * This is true if the Checked attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean checkedESet;

	/**
	 * The default value of the '{@link #getExpanded() <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpanded()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPANDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpanded() <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpanded()
	 * @generated
	 * @ordered
	 */
	protected String expanded = EXPANDED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerTreeLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QgisPackage.Literals.LAYER_TREE_LAYER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.LAYER_TREE_LAYER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.LAYER_TREE_LAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProviderKey() {
		return providerKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProviderKey(String newProviderKey) {
		String oldProviderKey = providerKey;
		providerKey = newProviderKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.LAYER_TREE_LAYER__PROVIDER_KEY, oldProviderKey, providerKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.LAYER_TREE_LAYER__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckState getChecked() {
		return checked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChecked(CheckState newChecked) {
		CheckState oldChecked = checked;
		checked = newChecked == null ? CHECKED_EDEFAULT : newChecked;
		boolean oldCheckedESet = checkedESet;
		checkedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.LAYER_TREE_LAYER__CHECKED, oldChecked, checked, !oldCheckedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetChecked() {
		CheckState oldChecked = checked;
		boolean oldCheckedESet = checkedESet;
		checked = CHECKED_EDEFAULT;
		checkedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QgisPackage.LAYER_TREE_LAYER__CHECKED, oldChecked, CHECKED_EDEFAULT, oldCheckedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetChecked() {
		return checkedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpanded() {
		return expanded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpanded(String newExpanded) {
		String oldExpanded = expanded;
		expanded = newExpanded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.LAYER_TREE_LAYER__EXPANDED, oldExpanded, expanded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QgisPackage.LAYER_TREE_LAYER__ID:
				return getId();
			case QgisPackage.LAYER_TREE_LAYER__NAME:
				return getName();
			case QgisPackage.LAYER_TREE_LAYER__PROVIDER_KEY:
				return getProviderKey();
			case QgisPackage.LAYER_TREE_LAYER__SOURCE:
				return getSource();
			case QgisPackage.LAYER_TREE_LAYER__CHECKED:
				return getChecked();
			case QgisPackage.LAYER_TREE_LAYER__EXPANDED:
				return getExpanded();
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
			case QgisPackage.LAYER_TREE_LAYER__ID:
				setId((String)newValue);
				return;
			case QgisPackage.LAYER_TREE_LAYER__NAME:
				setName((String)newValue);
				return;
			case QgisPackage.LAYER_TREE_LAYER__PROVIDER_KEY:
				setProviderKey((String)newValue);
				return;
			case QgisPackage.LAYER_TREE_LAYER__SOURCE:
				setSource((String)newValue);
				return;
			case QgisPackage.LAYER_TREE_LAYER__CHECKED:
				setChecked((CheckState)newValue);
				return;
			case QgisPackage.LAYER_TREE_LAYER__EXPANDED:
				setExpanded((String)newValue);
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
			case QgisPackage.LAYER_TREE_LAYER__ID:
				setId(ID_EDEFAULT);
				return;
			case QgisPackage.LAYER_TREE_LAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QgisPackage.LAYER_TREE_LAYER__PROVIDER_KEY:
				setProviderKey(PROVIDER_KEY_EDEFAULT);
				return;
			case QgisPackage.LAYER_TREE_LAYER__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case QgisPackage.LAYER_TREE_LAYER__CHECKED:
				unsetChecked();
				return;
			case QgisPackage.LAYER_TREE_LAYER__EXPANDED:
				setExpanded(EXPANDED_EDEFAULT);
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
			case QgisPackage.LAYER_TREE_LAYER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case QgisPackage.LAYER_TREE_LAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QgisPackage.LAYER_TREE_LAYER__PROVIDER_KEY:
				return PROVIDER_KEY_EDEFAULT == null ? providerKey != null : !PROVIDER_KEY_EDEFAULT.equals(providerKey);
			case QgisPackage.LAYER_TREE_LAYER__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case QgisPackage.LAYER_TREE_LAYER__CHECKED:
				return isSetChecked();
			case QgisPackage.LAYER_TREE_LAYER__EXPANDED:
				return EXPANDED_EDEFAULT == null ? expanded != null : !EXPANDED_EDEFAULT.equals(expanded);
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
		result.append(", providerKey: ");
		result.append(providerKey);
		result.append(", source: ");
		result.append(source);
		result.append(", checked: ");
		if (checkedESet) result.append(checked); else result.append("<unset>");
		result.append(", expanded: ");
		result.append(expanded);
		result.append(')');
		return result.toString();
	}

} //LayerTreeLayerImpl
