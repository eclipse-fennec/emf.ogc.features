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
package net.opengis.cql2;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bbox Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A bounding box {"bbox": [minx, miny, maxx, maxy]} in CRS84; six values with heights are allowed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.cql2.BboxLiteral#getBbox <em>Bbox</em>}</li>
 * </ul>
 *
 * @see net.opengis.cql2.Cql2Package#getBboxLiteral()
 * @model
 * @generated
 */
@ProviderType
public interface BboxLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Bbox</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordinates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bbox</em>' attribute list.
	 * @see net.opengis.cql2.Cql2Package#getBboxLiteral_Bbox()
	 * @model
	 * @generated
	 */
	EList<Double> getBbox();

} // BboxLiteral
