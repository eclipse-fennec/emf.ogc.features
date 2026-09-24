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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.fennec.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The OGC Common Query Language (CQL2) as EMF model: basic CQL2, the advanced comparison operators and the spatial functions. Mirrors the CQL2 JSON encoding, which the Fennec codec reads and writes with this model; the text encoding is parsed into the same model.
 * <!-- end-model-doc -->
 * @see net.opengis.cql2.Cql2Factory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = Cql2Package.eNS_URI, fingerprint = "fp1:e8fa587920c435fdc35828d8a28669af8673343bad62dd54d8f82d8fb242afa4", genModel = "/model/cql2.genmodel", genModelSourceLocations = {"model/cql2.genmodel","net.opengis.cql2.model/model/cql2.genmodel"}, ecore = "/model/cql2.ecore", ecoreSourceLocations = "/model/cql2.ecore")
public interface Cql2Package extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cql2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/spec/cql2/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cql2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cql2Package eINSTANCE = net.opengis.cql2.impl.Cql2PackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.ExpressionImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.PredicateImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 1;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.OperationImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ARGS = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.ComparisonImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 3;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__ARGS = OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.SpatialOperationImpl <em>Spatial Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.SpatialOperationImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSpatialOperation()
	 * @generated
	 */
	int SPATIAL_OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_OPERATION__ARGS = OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>Spatial Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spatial Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.AndImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getAnd()
	 * @generated
	 */
	int AND = 5;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ARGS = OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.OrImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getOr()
	 * @generated
	 */
	int OR = 6;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__ARGS = OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.NotImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getNot()
	 * @generated
	 */
	int NOT = 7;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__ARGS = OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.EqualImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 8;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__ARGS = COMPARISON__ARGS;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATION_COUNT = COMPARISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.NotEqualImpl <em>Not Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.NotEqualImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getNotEqual()
	 * @generated
	 */
	int NOT_EQUAL = 9;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL__ARGS = COMPARISON__ARGS;

	/**
	 * The number of structural features of the '<em>Not Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL_OPERATION_COUNT = COMPARISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.LessThanImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 10;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__ARGS = COMPARISON__ARGS;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATION_COUNT = COMPARISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.LessOrEqualImpl <em>Less Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.LessOrEqualImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getLessOrEqual()
	 * @generated
	 */
	int LESS_OR_EQUAL = 11;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL__ARGS = COMPARISON__ARGS;

	/**
	 * The number of structural features of the '<em>Less Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Less Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL_OPERATION_COUNT = COMPARISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.GreaterThanImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 12;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__ARGS = COMPARISON__ARGS;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATION_COUNT = COMPARISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.GreaterOrEqualImpl <em>Greater Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.GreaterOrEqualImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getGreaterOrEqual()
	 * @generated
	 */
	int GREATER_OR_EQUAL = 13;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL__ARGS = COMPARISON__ARGS;

	/**
	 * The number of structural features of the '<em>Greater Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL_OPERATION_COUNT = COMPARISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.LikeImpl <em>Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.LikeImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getLike()
	 * @generated
	 */
	int LIKE = 14;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE__ARGS = OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.BetweenImpl <em>Between</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.BetweenImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getBetween()
	 * @generated
	 */
	int BETWEEN = 15;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETWEEN__ARGS = OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>Between</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETWEEN_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Between</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETWEEN_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.InImpl <em>In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.InImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getIn()
	 * @generated
	 */
	int IN = 16;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN__ARGS = OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.IsNullImpl <em>Is Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.IsNullImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getIsNull()
	 * @generated
	 */
	int IS_NULL = 17;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NULL__ARGS = OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>Is Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NULL_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NULL_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.SIntersectsImpl <em>SIntersects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.SIntersectsImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSIntersects()
	 * @generated
	 */
	int SINTERSECTS = 18;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINTERSECTS__ARGS = SPATIAL_OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>SIntersects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINTERSECTS_FEATURE_COUNT = SPATIAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SIntersects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINTERSECTS_OPERATION_COUNT = SPATIAL_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.SEqualsImpl <em>SEquals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.SEqualsImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSEquals()
	 * @generated
	 */
	int SEQUALS = 19;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUALS__ARGS = SPATIAL_OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>SEquals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUALS_FEATURE_COUNT = SPATIAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SEquals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUALS_OPERATION_COUNT = SPATIAL_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.SDisjointImpl <em>SDisjoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.SDisjointImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSDisjoint()
	 * @generated
	 */
	int SDISJOINT = 20;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDISJOINT__ARGS = SPATIAL_OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>SDisjoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDISJOINT_FEATURE_COUNT = SPATIAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SDisjoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDISJOINT_OPERATION_COUNT = SPATIAL_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.STouchesImpl <em>STouches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.STouchesImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSTouches()
	 * @generated
	 */
	int STOUCHES = 21;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOUCHES__ARGS = SPATIAL_OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>STouches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOUCHES_FEATURE_COUNT = SPATIAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>STouches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOUCHES_OPERATION_COUNT = SPATIAL_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.SWithinImpl <em>SWithin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.SWithinImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSWithin()
	 * @generated
	 */
	int SWITHIN = 22;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITHIN__ARGS = SPATIAL_OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>SWithin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITHIN_FEATURE_COUNT = SPATIAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SWithin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITHIN_OPERATION_COUNT = SPATIAL_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.SOverlapsImpl <em>SOverlaps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.SOverlapsImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSOverlaps()
	 * @generated
	 */
	int SOVERLAPS = 23;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOVERLAPS__ARGS = SPATIAL_OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>SOverlaps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOVERLAPS_FEATURE_COUNT = SPATIAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SOverlaps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOVERLAPS_OPERATION_COUNT = SPATIAL_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.SCrossesImpl <em>SCrosses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.SCrossesImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSCrosses()
	 * @generated
	 */
	int SCROSSES = 24;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROSSES__ARGS = SPATIAL_OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>SCrosses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROSSES_FEATURE_COUNT = SPATIAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SCrosses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROSSES_OPERATION_COUNT = SPATIAL_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.SContainsImpl <em>SContains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.SContainsImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSContains()
	 * @generated
	 */
	int SCONTAINS = 25;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTAINS__ARGS = SPATIAL_OPERATION__ARGS;

	/**
	 * The number of structural features of the '<em>SContains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTAINS_FEATURE_COUNT = SPATIAL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SContains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTAINS_OPERATION_COUNT = SPATIAL_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.PropertyRefImpl <em>Property Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.PropertyRefImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getPropertyRef()
	 * @generated
	 */
	int PROPERTY_REF = 26;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF__PROPERTY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.LiteralImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 27;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.StringLiteralImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.NumberLiteralImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getNumberLiteral()
	 * @generated
	 */
	int NUMBER_LITERAL = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.BooleanLiteralImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.TimestampLiteralImpl <em>Timestamp Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.TimestampLiteralImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getTimestampLiteral()
	 * @generated
	 */
	int TIMESTAMP_LITERAL = 31;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_LITERAL__TIMESTAMP = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timestamp Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timestamp Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.DateLiteralImpl <em>Date Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.DateLiteralImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getDateLiteral()
	 * @generated
	 */
	int DATE_LITERAL = 32;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_LITERAL__DATE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.ArrayLiteralImpl <em>Array Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.ArrayLiteralImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getArrayLiteral()
	 * @generated
	 */
	int ARRAY_LITERAL = 33;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LITERAL__ELEMENTS = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.BboxLiteralImpl <em>Bbox Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.BboxLiteralImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getBboxLiteral()
	 * @generated
	 */
	int BBOX_LITERAL = 34;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBOX_LITERAL__BBOX = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bbox Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBOX_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bbox Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBOX_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.cql2.impl.GeometryLiteralImpl <em>Geometry Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.cql2.impl.GeometryLiteralImpl
	 * @see net.opengis.cql2.impl.Cql2PackageImpl#getGeometryLiteral()
	 * @generated
	 */
	int GEOMETRY_LITERAL = 35;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_LITERAL__GEOMETRY = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geometry Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Geometry Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see net.opengis.cql2.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see net.opengis.cql2.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see net.opengis.cql2.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.cql2.Operation#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see net.opengis.cql2.Operation#getArgs()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Args();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see net.opengis.cql2.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.SpatialOperation <em>Spatial Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Operation</em>'.
	 * @see net.opengis.cql2.SpatialOperation
	 * @generated
	 */
	EClass getSpatialOperation();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see net.opengis.cql2.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see net.opengis.cql2.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see net.opengis.cql2.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see net.opengis.cql2.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.NotEqual <em>Not Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Equal</em>'.
	 * @see net.opengis.cql2.NotEqual
	 * @generated
	 */
	EClass getNotEqual();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see net.opengis.cql2.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.LessOrEqual <em>Less Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Or Equal</em>'.
	 * @see net.opengis.cql2.LessOrEqual
	 * @generated
	 */
	EClass getLessOrEqual();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see net.opengis.cql2.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.GreaterOrEqual <em>Greater Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Or Equal</em>'.
	 * @see net.opengis.cql2.GreaterOrEqual
	 * @generated
	 */
	EClass getGreaterOrEqual();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.Like <em>Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Like</em>'.
	 * @see net.opengis.cql2.Like
	 * @generated
	 */
	EClass getLike();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.Between <em>Between</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Between</em>'.
	 * @see net.opengis.cql2.Between
	 * @generated
	 */
	EClass getBetween();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.In <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In</em>'.
	 * @see net.opengis.cql2.In
	 * @generated
	 */
	EClass getIn();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.IsNull <em>Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Null</em>'.
	 * @see net.opengis.cql2.IsNull
	 * @generated
	 */
	EClass getIsNull();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.SIntersects <em>SIntersects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SIntersects</em>'.
	 * @see net.opengis.cql2.SIntersects
	 * @generated
	 */
	EClass getSIntersects();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.SEquals <em>SEquals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SEquals</em>'.
	 * @see net.opengis.cql2.SEquals
	 * @generated
	 */
	EClass getSEquals();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.SDisjoint <em>SDisjoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDisjoint</em>'.
	 * @see net.opengis.cql2.SDisjoint
	 * @generated
	 */
	EClass getSDisjoint();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.STouches <em>STouches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STouches</em>'.
	 * @see net.opengis.cql2.STouches
	 * @generated
	 */
	EClass getSTouches();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.SWithin <em>SWithin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SWithin</em>'.
	 * @see net.opengis.cql2.SWithin
	 * @generated
	 */
	EClass getSWithin();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.SOverlaps <em>SOverlaps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SOverlaps</em>'.
	 * @see net.opengis.cql2.SOverlaps
	 * @generated
	 */
	EClass getSOverlaps();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.SCrosses <em>SCrosses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SCrosses</em>'.
	 * @see net.opengis.cql2.SCrosses
	 * @generated
	 */
	EClass getSCrosses();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.SContains <em>SContains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SContains</em>'.
	 * @see net.opengis.cql2.SContains
	 * @generated
	 */
	EClass getSContains();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.PropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Ref</em>'.
	 * @see net.opengis.cql2.PropertyRef
	 * @generated
	 */
	EClass getPropertyRef();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.cql2.PropertyRef#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see net.opengis.cql2.PropertyRef#getProperty()
	 * @see #getPropertyRef()
	 * @generated
	 */
	EAttribute getPropertyRef_Property();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see net.opengis.cql2.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see net.opengis.cql2.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.cql2.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.cql2.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.NumberLiteral <em>Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Literal</em>'.
	 * @see net.opengis.cql2.NumberLiteral
	 * @generated
	 */
	EClass getNumberLiteral();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.cql2.NumberLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.cql2.NumberLiteral#getValue()
	 * @see #getNumberLiteral()
	 * @generated
	 */
	EAttribute getNumberLiteral_Value();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see net.opengis.cql2.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.cql2.BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.cql2.BooleanLiteral#isValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.TimestampLiteral <em>Timestamp Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamp Literal</em>'.
	 * @see net.opengis.cql2.TimestampLiteral
	 * @generated
	 */
	EClass getTimestampLiteral();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.cql2.TimestampLiteral#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see net.opengis.cql2.TimestampLiteral#getTimestamp()
	 * @see #getTimestampLiteral()
	 * @generated
	 */
	EAttribute getTimestampLiteral_Timestamp();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.DateLiteral <em>Date Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Literal</em>'.
	 * @see net.opengis.cql2.DateLiteral
	 * @generated
	 */
	EClass getDateLiteral();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.cql2.DateLiteral#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see net.opengis.cql2.DateLiteral#getDate()
	 * @see #getDateLiteral()
	 * @generated
	 */
	EAttribute getDateLiteral_Date();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.ArrayLiteral <em>Array Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Literal</em>'.
	 * @see net.opengis.cql2.ArrayLiteral
	 * @generated
	 */
	EClass getArrayLiteral();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.cql2.ArrayLiteral#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see net.opengis.cql2.ArrayLiteral#getElements()
	 * @see #getArrayLiteral()
	 * @generated
	 */
	EReference getArrayLiteral_Elements();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.BboxLiteral <em>Bbox Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bbox Literal</em>'.
	 * @see net.opengis.cql2.BboxLiteral
	 * @generated
	 */
	EClass getBboxLiteral();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.cql2.BboxLiteral#getBbox <em>Bbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bbox</em>'.
	 * @see net.opengis.cql2.BboxLiteral#getBbox()
	 * @see #getBboxLiteral()
	 * @generated
	 */
	EAttribute getBboxLiteral_Bbox();

	/**
	 * Returns the meta object for class '{@link net.opengis.cql2.GeometryLiteral <em>Geometry Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry Literal</em>'.
	 * @see net.opengis.cql2.GeometryLiteral
	 * @generated
	 */
	EClass getGeometryLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.cql2.GeometryLiteral#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see net.opengis.cql2.GeometryLiteral#getGeometry()
	 * @see #getGeometryLiteral()
	 * @generated
	 */
	EReference getGeometryLiteral_Geometry();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Cql2Factory getCql2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.ExpressionImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.PredicateImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.OperationImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__ARGS = eINSTANCE.getOperation_Args();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.ComparisonImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getComparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.SpatialOperationImpl <em>Spatial Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.SpatialOperationImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSpatialOperation()
		 * @generated
		 */
		EClass SPATIAL_OPERATION = eINSTANCE.getSpatialOperation();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.AndImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.OrImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.NotImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.EqualImpl <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.EqualImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getEqual()
		 * @generated
		 */
		EClass EQUAL = eINSTANCE.getEqual();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.NotEqualImpl <em>Not Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.NotEqualImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getNotEqual()
		 * @generated
		 */
		EClass NOT_EQUAL = eINSTANCE.getNotEqual();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.LessThanImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.LessOrEqualImpl <em>Less Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.LessOrEqualImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getLessOrEqual()
		 * @generated
		 */
		EClass LESS_OR_EQUAL = eINSTANCE.getLessOrEqual();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.GreaterThanImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.GreaterOrEqualImpl <em>Greater Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.GreaterOrEqualImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getGreaterOrEqual()
		 * @generated
		 */
		EClass GREATER_OR_EQUAL = eINSTANCE.getGreaterOrEqual();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.LikeImpl <em>Like</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.LikeImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getLike()
		 * @generated
		 */
		EClass LIKE = eINSTANCE.getLike();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.BetweenImpl <em>Between</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.BetweenImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getBetween()
		 * @generated
		 */
		EClass BETWEEN = eINSTANCE.getBetween();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.InImpl <em>In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.InImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getIn()
		 * @generated
		 */
		EClass IN = eINSTANCE.getIn();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.IsNullImpl <em>Is Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.IsNullImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getIsNull()
		 * @generated
		 */
		EClass IS_NULL = eINSTANCE.getIsNull();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.SIntersectsImpl <em>SIntersects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.SIntersectsImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSIntersects()
		 * @generated
		 */
		EClass SINTERSECTS = eINSTANCE.getSIntersects();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.SEqualsImpl <em>SEquals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.SEqualsImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSEquals()
		 * @generated
		 */
		EClass SEQUALS = eINSTANCE.getSEquals();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.SDisjointImpl <em>SDisjoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.SDisjointImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSDisjoint()
		 * @generated
		 */
		EClass SDISJOINT = eINSTANCE.getSDisjoint();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.STouchesImpl <em>STouches</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.STouchesImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSTouches()
		 * @generated
		 */
		EClass STOUCHES = eINSTANCE.getSTouches();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.SWithinImpl <em>SWithin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.SWithinImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSWithin()
		 * @generated
		 */
		EClass SWITHIN = eINSTANCE.getSWithin();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.SOverlapsImpl <em>SOverlaps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.SOverlapsImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSOverlaps()
		 * @generated
		 */
		EClass SOVERLAPS = eINSTANCE.getSOverlaps();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.SCrossesImpl <em>SCrosses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.SCrossesImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSCrosses()
		 * @generated
		 */
		EClass SCROSSES = eINSTANCE.getSCrosses();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.SContainsImpl <em>SContains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.SContainsImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getSContains()
		 * @generated
		 */
		EClass SCONTAINS = eINSTANCE.getSContains();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.PropertyRefImpl <em>Property Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.PropertyRefImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getPropertyRef()
		 * @generated
		 */
		EClass PROPERTY_REF = eINSTANCE.getPropertyRef();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_REF__PROPERTY = eINSTANCE.getPropertyRef_Property();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.LiteralImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.StringLiteralImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.NumberLiteralImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getNumberLiteral()
		 * @generated
		 */
		EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.BooleanLiteralImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.TimestampLiteralImpl <em>Timestamp Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.TimestampLiteralImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getTimestampLiteral()
		 * @generated
		 */
		EClass TIMESTAMP_LITERAL = eINSTANCE.getTimestampLiteral();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESTAMP_LITERAL__TIMESTAMP = eINSTANCE.getTimestampLiteral_Timestamp();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.DateLiteralImpl <em>Date Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.DateLiteralImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getDateLiteral()
		 * @generated
		 */
		EClass DATE_LITERAL = eINSTANCE.getDateLiteral();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_LITERAL__DATE = eINSTANCE.getDateLiteral_Date();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.ArrayLiteralImpl <em>Array Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.ArrayLiteralImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getArrayLiteral()
		 * @generated
		 */
		EClass ARRAY_LITERAL = eINSTANCE.getArrayLiteral();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_LITERAL__ELEMENTS = eINSTANCE.getArrayLiteral_Elements();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.BboxLiteralImpl <em>Bbox Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.BboxLiteralImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getBboxLiteral()
		 * @generated
		 */
		EClass BBOX_LITERAL = eINSTANCE.getBboxLiteral();

		/**
		 * The meta object literal for the '<em><b>Bbox</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BBOX_LITERAL__BBOX = eINSTANCE.getBboxLiteral_Bbox();

		/**
		 * The meta object literal for the '{@link net.opengis.cql2.impl.GeometryLiteralImpl <em>Geometry Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.cql2.impl.GeometryLiteralImpl
		 * @see net.opengis.cql2.impl.Cql2PackageImpl#getGeometryLiteral()
		 * @generated
		 */
		EClass GEOMETRY_LITERAL = eINSTANCE.getGeometryLiteral();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_LITERAL__GEOMETRY = eINSTANCE.getGeometryLiteral_Geometry();

	}

} //Cql2Package
