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

import org.qgis.project.CheckState;
import org.qgis.project.CustomOrder;
import org.qgis.project.LayerTreeGroup;
import org.qgis.project.LayerTreeLayer;
import org.qgis.project.QgisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer Tree Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.qgis.project.impl.LayerTreeGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.qgis.project.impl.LayerTreeGroupImpl#getChecked <em>Checked</em>}</li>
 *   <li>{@link org.qgis.project.impl.LayerTreeGroupImpl#getExpanded <em>Expanded</em>}</li>
 *   <li>{@link org.qgis.project.impl.LayerTreeGroupImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.qgis.project.impl.LayerTreeGroupImpl#getLayers <em>Layers</em>}</li>
 *   <li>{@link org.qgis.project.impl.LayerTreeGroupImpl#getCustomOrder <em>Custom Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerTreeGroupImpl extends MinimalEObjectImpl.Container implements LayerTreeGroup {
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
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<LayerTreeGroup> groups;

	/**
	 * The cached value of the '{@link #getLayers() <em>Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<LayerTreeLayer> layers;

	/**
	 * The cached value of the '{@link #getCustomOrder() <em>Custom Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomOrder()
	 * @generated
	 * @ordered
	 */
	protected CustomOrder customOrder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerTreeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QgisPackage.Literals.LAYER_TREE_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.LAYER_TREE_GROUP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.LAYER_TREE_GROUP__CHECKED, oldChecked, checked, !oldCheckedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, QgisPackage.LAYER_TREE_GROUP__CHECKED, oldChecked, CHECKED_EDEFAULT, oldCheckedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.LAYER_TREE_GROUP__EXPANDED, oldExpanded, expanded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LayerTreeGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<LayerTreeGroup>(LayerTreeGroup.class, this, QgisPackage.LAYER_TREE_GROUP__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LayerTreeLayer> getLayers() {
		if (layers == null) {
			layers = new EObjectContainmentEList<LayerTreeLayer>(LayerTreeLayer.class, this, QgisPackage.LAYER_TREE_GROUP__LAYERS);
		}
		return layers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomOrder getCustomOrder() {
		return customOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomOrder(CustomOrder newCustomOrder, NotificationChain msgs) {
		CustomOrder oldCustomOrder = customOrder;
		customOrder = newCustomOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QgisPackage.LAYER_TREE_GROUP__CUSTOM_ORDER, oldCustomOrder, newCustomOrder);
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
	public void setCustomOrder(CustomOrder newCustomOrder) {
		if (newCustomOrder != customOrder) {
			NotificationChain msgs = null;
			if (customOrder != null)
				msgs = ((InternalEObject)customOrder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QgisPackage.LAYER_TREE_GROUP__CUSTOM_ORDER, null, msgs);
			if (newCustomOrder != null)
				msgs = ((InternalEObject)newCustomOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QgisPackage.LAYER_TREE_GROUP__CUSTOM_ORDER, null, msgs);
			msgs = basicSetCustomOrder(newCustomOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QgisPackage.LAYER_TREE_GROUP__CUSTOM_ORDER, newCustomOrder, newCustomOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QgisPackage.LAYER_TREE_GROUP__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case QgisPackage.LAYER_TREE_GROUP__LAYERS:
				return ((InternalEList<?>)getLayers()).basicRemove(otherEnd, msgs);
			case QgisPackage.LAYER_TREE_GROUP__CUSTOM_ORDER:
				return basicSetCustomOrder(null, msgs);
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
			case QgisPackage.LAYER_TREE_GROUP__NAME:
				return getName();
			case QgisPackage.LAYER_TREE_GROUP__CHECKED:
				return getChecked();
			case QgisPackage.LAYER_TREE_GROUP__EXPANDED:
				return getExpanded();
			case QgisPackage.LAYER_TREE_GROUP__GROUPS:
				return getGroups();
			case QgisPackage.LAYER_TREE_GROUP__LAYERS:
				return getLayers();
			case QgisPackage.LAYER_TREE_GROUP__CUSTOM_ORDER:
				return getCustomOrder();
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
			case QgisPackage.LAYER_TREE_GROUP__NAME:
				setName((String)newValue);
				return;
			case QgisPackage.LAYER_TREE_GROUP__CHECKED:
				setChecked((CheckState)newValue);
				return;
			case QgisPackage.LAYER_TREE_GROUP__EXPANDED:
				setExpanded((String)newValue);
				return;
			case QgisPackage.LAYER_TREE_GROUP__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends LayerTreeGroup>)newValue);
				return;
			case QgisPackage.LAYER_TREE_GROUP__LAYERS:
				getLayers().clear();
				getLayers().addAll((Collection<? extends LayerTreeLayer>)newValue);
				return;
			case QgisPackage.LAYER_TREE_GROUP__CUSTOM_ORDER:
				setCustomOrder((CustomOrder)newValue);
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
			case QgisPackage.LAYER_TREE_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QgisPackage.LAYER_TREE_GROUP__CHECKED:
				unsetChecked();
				return;
			case QgisPackage.LAYER_TREE_GROUP__EXPANDED:
				setExpanded(EXPANDED_EDEFAULT);
				return;
			case QgisPackage.LAYER_TREE_GROUP__GROUPS:
				getGroups().clear();
				return;
			case QgisPackage.LAYER_TREE_GROUP__LAYERS:
				getLayers().clear();
				return;
			case QgisPackage.LAYER_TREE_GROUP__CUSTOM_ORDER:
				setCustomOrder((CustomOrder)null);
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
			case QgisPackage.LAYER_TREE_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QgisPackage.LAYER_TREE_GROUP__CHECKED:
				return isSetChecked();
			case QgisPackage.LAYER_TREE_GROUP__EXPANDED:
				return EXPANDED_EDEFAULT == null ? expanded != null : !EXPANDED_EDEFAULT.equals(expanded);
			case QgisPackage.LAYER_TREE_GROUP__GROUPS:
				return groups != null && !groups.isEmpty();
			case QgisPackage.LAYER_TREE_GROUP__LAYERS:
				return layers != null && !layers.isEmpty();
			case QgisPackage.LAYER_TREE_GROUP__CUSTOM_ORDER:
				return customOrder != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", checked: ");
		if (checkedESet) result.append(checked); else result.append("<unset>");
		result.append(", expanded: ");
		result.append(expanded);
		result.append(')');
		return result.toString();
	}

} //LayerTreeGroupImpl
