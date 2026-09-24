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
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An operation of the CQL2 JSON encoding: {"op": name, "args": [...]}. The op is the discriminator of the concrete class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.cql2.Operation#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see net.opengis.cql2.Cql2Package#getOperation()
 * @model abstract="true"
 *        annotation="http://eclipse.org/fennec/codec typeKey='op'"
 *        annotation="http://eclipse.org/fennec/codec/typeMapping/cql2 typeDiscriminatorPath='op' fallbackStrategy='ERROR'"
 * @generated
 */
@ProviderType
public interface Operation extends Predicate {
	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.cql2.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The arguments, in the order of the CQL2 JSON encoding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see net.opengis.cql2.Cql2Package#getOperation_Args()
	 * @model containment="true"
	 *        annotation="http://eclipse.org/fennec/codec valueReaderName='cql2.args' valueWriterName='cql2.args'"
	 * @generated
	 */
	EList<Expression> getArgs();

} // Operation
