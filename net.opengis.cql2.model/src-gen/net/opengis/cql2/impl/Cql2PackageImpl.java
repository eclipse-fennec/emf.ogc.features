/**
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
package net.opengis.cql2.impl;

import net.opengis.cql2.And;
import net.opengis.cql2.ArrayLiteral;
import net.opengis.cql2.BboxLiteral;
import net.opengis.cql2.Between;
import net.opengis.cql2.BooleanLiteral;
import net.opengis.cql2.Comparison;
import net.opengis.cql2.Cql2Factory;
import net.opengis.cql2.Cql2Package;
import net.opengis.cql2.DateLiteral;
import net.opengis.cql2.Equal;
import net.opengis.cql2.Expression;
import net.opengis.cql2.GeometryLiteral;
import net.opengis.cql2.GreaterOrEqual;
import net.opengis.cql2.GreaterThan;
import net.opengis.cql2.In;
import net.opengis.cql2.IsNull;
import net.opengis.cql2.LessOrEqual;
import net.opengis.cql2.LessThan;
import net.opengis.cql2.Like;
import net.opengis.cql2.Literal;
import net.opengis.cql2.Not;
import net.opengis.cql2.NotEqual;
import net.opengis.cql2.NumberLiteral;
import net.opengis.cql2.Operation;
import net.opengis.cql2.Or;
import net.opengis.cql2.Predicate;
import net.opengis.cql2.PropertyRef;
import net.opengis.cql2.SContains;
import net.opengis.cql2.SCrosses;
import net.opengis.cql2.SDisjoint;
import net.opengis.cql2.SEquals;
import net.opengis.cql2.SIntersects;
import net.opengis.cql2.SOverlaps;
import net.opengis.cql2.STouches;
import net.opengis.cql2.SWithin;
import net.opengis.cql2.SpatialOperation;
import net.opengis.cql2.StringLiteral;
import net.opengis.cql2.TimestampLiteral;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.geojson.GeoJsonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cql2PackageImpl extends EPackageImpl implements Cql2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spatialOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass likeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass betweenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sIntersectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sEqualsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sDisjointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sTouchesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sWithinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sOverlapsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sCrossesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sContainsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timestampLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bboxLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryLiteralEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.opengis.cql2.Cql2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Cql2PackageImpl() {
		super(eNS_URI, Cql2Factory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Cql2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Cql2Package init() {
		if (isInited) return (Cql2Package)EPackage.Registry.INSTANCE.getEPackage(Cql2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredCql2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Cql2PackageImpl theCql2Package = registeredCql2Package instanceof Cql2PackageImpl ? (Cql2PackageImpl)registeredCql2Package : new Cql2PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GeoJsonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCql2Package.createPackageContents();

		// Initialize created meta-data
		theCql2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCql2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Cql2Package.eNS_URI, theCql2Package);
		return theCql2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation_Args() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparison() {
		return comparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpatialOperation() {
		return spatialOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEqual() {
		return equalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotEqual() {
		return notEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLessThan() {
		return lessThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLessOrEqual() {
		return lessOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGreaterThan() {
		return greaterThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGreaterOrEqual() {
		return greaterOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLike() {
		return likeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBetween() {
		return betweenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIn() {
		return inEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIsNull() {
		return isNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSIntersects() {
		return sIntersectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSEquals() {
		return sEqualsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSDisjoint() {
		return sDisjointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSTouches() {
		return sTouchesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSWithin() {
		return sWithinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSOverlaps() {
		return sOverlapsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSCrosses() {
		return sCrossesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSContains() {
		return sContainsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyRef() {
		return propertyRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyRef_Property() {
		return (EAttribute)propertyRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringLiteral() {
		return stringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringLiteral_Value() {
		return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberLiteral() {
		return numberLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberLiteral_Value() {
		return (EAttribute)numberLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanLiteral() {
		return booleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanLiteral_Value() {
		return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimestampLiteral() {
		return timestampLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimestampLiteral_Timestamp() {
		return (EAttribute)timestampLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateLiteral() {
		return dateLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateLiteral_Date() {
		return (EAttribute)dateLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayLiteral() {
		return arrayLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayLiteral_Elements() {
		return (EReference)arrayLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBboxLiteral() {
		return bboxLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBboxLiteral_Bbox() {
		return (EAttribute)bboxLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeometryLiteral() {
		return geometryLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeometryLiteral_Geometry() {
		return (EReference)geometryLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cql2Factory getCql2Factory() {
		return (Cql2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		expressionEClass = createEClass(EXPRESSION);

		predicateEClass = createEClass(PREDICATE);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__ARGS);

		comparisonEClass = createEClass(COMPARISON);

		spatialOperationEClass = createEClass(SPATIAL_OPERATION);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);

		notEClass = createEClass(NOT);

		equalEClass = createEClass(EQUAL);

		notEqualEClass = createEClass(NOT_EQUAL);

		lessThanEClass = createEClass(LESS_THAN);

		lessOrEqualEClass = createEClass(LESS_OR_EQUAL);

		greaterThanEClass = createEClass(GREATER_THAN);

		greaterOrEqualEClass = createEClass(GREATER_OR_EQUAL);

		likeEClass = createEClass(LIKE);

		betweenEClass = createEClass(BETWEEN);

		inEClass = createEClass(IN);

		isNullEClass = createEClass(IS_NULL);

		sIntersectsEClass = createEClass(SINTERSECTS);

		sEqualsEClass = createEClass(SEQUALS);

		sDisjointEClass = createEClass(SDISJOINT);

		sTouchesEClass = createEClass(STOUCHES);

		sWithinEClass = createEClass(SWITHIN);

		sOverlapsEClass = createEClass(SOVERLAPS);

		sCrossesEClass = createEClass(SCROSSES);

		sContainsEClass = createEClass(SCONTAINS);

		propertyRefEClass = createEClass(PROPERTY_REF);
		createEAttribute(propertyRefEClass, PROPERTY_REF__PROPERTY);

		literalEClass = createEClass(LITERAL);

		stringLiteralEClass = createEClass(STRING_LITERAL);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

		numberLiteralEClass = createEClass(NUMBER_LITERAL);
		createEAttribute(numberLiteralEClass, NUMBER_LITERAL__VALUE);

		booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
		createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

		timestampLiteralEClass = createEClass(TIMESTAMP_LITERAL);
		createEAttribute(timestampLiteralEClass, TIMESTAMP_LITERAL__TIMESTAMP);

		dateLiteralEClass = createEClass(DATE_LITERAL);
		createEAttribute(dateLiteralEClass, DATE_LITERAL__DATE);

		arrayLiteralEClass = createEClass(ARRAY_LITERAL);
		createEReference(arrayLiteralEClass, ARRAY_LITERAL__ELEMENTS);

		bboxLiteralEClass = createEClass(BBOX_LITERAL);
		createEAttribute(bboxLiteralEClass, BBOX_LITERAL__BBOX);

		geometryLiteralEClass = createEClass(GEOMETRY_LITERAL);
		createEReference(geometryLiteralEClass, GEOMETRY_LITERAL__GEOMETRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GeoJsonPackage theGeoJsonPackage = (GeoJsonPackage)EPackage.Registry.INSTANCE.getEPackage(GeoJsonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		predicateEClass.getESuperTypes().add(this.getExpression());
		operationEClass.getESuperTypes().add(this.getPredicate());
		comparisonEClass.getESuperTypes().add(this.getOperation());
		spatialOperationEClass.getESuperTypes().add(this.getOperation());
		andEClass.getESuperTypes().add(this.getOperation());
		orEClass.getESuperTypes().add(this.getOperation());
		notEClass.getESuperTypes().add(this.getOperation());
		equalEClass.getESuperTypes().add(this.getComparison());
		notEqualEClass.getESuperTypes().add(this.getComparison());
		lessThanEClass.getESuperTypes().add(this.getComparison());
		lessOrEqualEClass.getESuperTypes().add(this.getComparison());
		greaterThanEClass.getESuperTypes().add(this.getComparison());
		greaterOrEqualEClass.getESuperTypes().add(this.getComparison());
		likeEClass.getESuperTypes().add(this.getOperation());
		betweenEClass.getESuperTypes().add(this.getOperation());
		inEClass.getESuperTypes().add(this.getOperation());
		isNullEClass.getESuperTypes().add(this.getOperation());
		sIntersectsEClass.getESuperTypes().add(this.getSpatialOperation());
		sEqualsEClass.getESuperTypes().add(this.getSpatialOperation());
		sDisjointEClass.getESuperTypes().add(this.getSpatialOperation());
		sTouchesEClass.getESuperTypes().add(this.getSpatialOperation());
		sWithinEClass.getESuperTypes().add(this.getSpatialOperation());
		sOverlapsEClass.getESuperTypes().add(this.getSpatialOperation());
		sCrossesEClass.getESuperTypes().add(this.getSpatialOperation());
		sContainsEClass.getESuperTypes().add(this.getSpatialOperation());
		propertyRefEClass.getESuperTypes().add(this.getExpression());
		literalEClass.getESuperTypes().add(this.getExpression());
		stringLiteralEClass.getESuperTypes().add(this.getLiteral());
		numberLiteralEClass.getESuperTypes().add(this.getLiteral());
		booleanLiteralEClass.getESuperTypes().add(this.getLiteral());
		booleanLiteralEClass.getESuperTypes().add(this.getPredicate());
		timestampLiteralEClass.getESuperTypes().add(this.getLiteral());
		dateLiteralEClass.getESuperTypes().add(this.getLiteral());
		arrayLiteralEClass.getESuperTypes().add(this.getLiteral());
		bboxLiteralEClass.getESuperTypes().add(this.getLiteral());
		geometryLiteralEClass.getESuperTypes().add(this.getLiteral());

		// Initialize classes, features, and operations; add parameters
		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predicateEClass, Predicate.class, "Predicate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Args(), this.getExpression(), null, "args", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonEClass, Comparison.class, "Comparison", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spatialOperationEClass, SpatialOperation.class, "SpatialOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalEClass, Equal.class, "Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEqualEClass, NotEqual.class, "NotEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessThanEClass, LessThan.class, "LessThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessOrEqualEClass, LessOrEqual.class, "LessOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterThanEClass, GreaterThan.class, "GreaterThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterOrEqualEClass, GreaterOrEqual.class, "GreaterOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(likeEClass, Like.class, "Like", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(betweenEClass, Between.class, "Between", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inEClass, In.class, "In", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isNullEClass, IsNull.class, "IsNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sIntersectsEClass, SIntersects.class, "SIntersects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sEqualsEClass, SEquals.class, "SEquals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sDisjointEClass, SDisjoint.class, "SDisjoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sTouchesEClass, STouches.class, "STouches", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sWithinEClass, SWithin.class, "SWithin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sOverlapsEClass, SOverlaps.class, "SOverlaps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sCrossesEClass, SCrosses.class, "SCrosses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sContainsEClass, SContains.class, "SContains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyRefEClass, PropertyRef.class, "PropertyRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyRef_Property(), ecorePackage.getEString(), "property", null, 1, 1, PropertyRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberLiteralEClass, NumberLiteral.class, "NumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberLiteral_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, NumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timestampLiteralEClass, TimestampLiteral.class, "TimestampLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimestampLiteral_Timestamp(), ecorePackage.getEString(), "timestamp", null, 0, 1, TimestampLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateLiteralEClass, DateLiteral.class, "DateLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateLiteral_Date(), ecorePackage.getEString(), "date", null, 0, 1, DateLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayLiteralEClass, ArrayLiteral.class, "ArrayLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayLiteral_Elements(), this.getExpression(), null, "elements", null, 0, -1, ArrayLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bboxLiteralEClass, BboxLiteral.class, "BboxLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBboxLiteral_Bbox(), ecorePackage.getEDouble(), "bbox", null, 0, -1, BboxLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometryLiteralEClass, GeometryLiteral.class, "GeometryLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeometryLiteral_Geometry(), theGeoJsonPackage.getGeometry(), null, "geometry", null, 1, 1, GeometryLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://eclipse.org/fennec/codec
		createCodecAnnotations();
		// http://eclipse.org/fennec/codec/typeMapping/cql2
		createCql2Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://eclipse.org/fennec/codec</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCodecAnnotations() {
		String source = "http://eclipse.org/fennec/codec";
		addAnnotation
		  (operationEClass,
		   source,
		   new String[] {
			   "typeKey", "op"
		   });
		addAnnotation
		  (getOperation_Args(),
		   source,
		   new String[] {
			   "valueReaderName", "cql2.args",
			   "valueWriterName", "cql2.args"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://eclipse.org/fennec/codec/typeMapping/cql2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCql2Annotations() {
		String source = "http://eclipse.org/fennec/codec/typeMapping/cql2";
		addAnnotation
		  (operationEClass,
		   source,
		   new String[] {
			   "typeDiscriminatorPath", "op",
			   "fallbackStrategy", "ERROR"
		   });
		addAnnotation
		  (andEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "and"
		   });
		addAnnotation
		  (orEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "or"
		   });
		addAnnotation
		  (notEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "not"
		   });
		addAnnotation
		  (equalEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "="
		   });
		addAnnotation
		  (notEqualEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "<>"
		   });
		addAnnotation
		  (lessThanEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "<"
		   });
		addAnnotation
		  (lessOrEqualEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "<="
		   });
		addAnnotation
		  (greaterThanEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", ">"
		   });
		addAnnotation
		  (greaterOrEqualEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", ">="
		   });
		addAnnotation
		  (likeEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "like"
		   });
		addAnnotation
		  (betweenEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "between"
		   });
		addAnnotation
		  (inEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "in"
		   });
		addAnnotation
		  (isNullEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "isNull"
		   });
		addAnnotation
		  (sIntersectsEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "s_intersects"
		   });
		addAnnotation
		  (sEqualsEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "s_equals"
		   });
		addAnnotation
		  (sDisjointEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "s_disjoint"
		   });
		addAnnotation
		  (sTouchesEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "s_touches"
		   });
		addAnnotation
		  (sWithinEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "s_within"
		   });
		addAnnotation
		  (sOverlapsEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "s_overlaps"
		   });
		addAnnotation
		  (sCrossesEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "s_crosses"
		   });
		addAnnotation
		  (sContainsEClass,
		   source,
		   new String[] {
			   "typeDiscriminator", "s_contains"
		   });
	}

} //Cql2PackageImpl
