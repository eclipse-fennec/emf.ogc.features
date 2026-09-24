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

import net.opengis.cql2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cql2FactoryImpl extends EFactoryImpl implements Cql2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cql2Factory init() {
		try {
			Cql2Factory theCql2Factory = (Cql2Factory)EPackage.Registry.INSTANCE.getEFactory(Cql2Package.eNS_URI);
			if (theCql2Factory != null) {
				return theCql2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Cql2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cql2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Cql2Package.AND: return createAnd();
			case Cql2Package.OR: return createOr();
			case Cql2Package.NOT: return createNot();
			case Cql2Package.EQUAL: return createEqual();
			case Cql2Package.NOT_EQUAL: return createNotEqual();
			case Cql2Package.LESS_THAN: return createLessThan();
			case Cql2Package.LESS_OR_EQUAL: return createLessOrEqual();
			case Cql2Package.GREATER_THAN: return createGreaterThan();
			case Cql2Package.GREATER_OR_EQUAL: return createGreaterOrEqual();
			case Cql2Package.LIKE: return createLike();
			case Cql2Package.BETWEEN: return createBetween();
			case Cql2Package.IN: return createIn();
			case Cql2Package.IS_NULL: return createIsNull();
			case Cql2Package.SINTERSECTS: return createSIntersects();
			case Cql2Package.SEQUALS: return createSEquals();
			case Cql2Package.SDISJOINT: return createSDisjoint();
			case Cql2Package.STOUCHES: return createSTouches();
			case Cql2Package.SWITHIN: return createSWithin();
			case Cql2Package.SOVERLAPS: return createSOverlaps();
			case Cql2Package.SCROSSES: return createSCrosses();
			case Cql2Package.SCONTAINS: return createSContains();
			case Cql2Package.PROPERTY_REF: return createPropertyRef();
			case Cql2Package.STRING_LITERAL: return createStringLiteral();
			case Cql2Package.NUMBER_LITERAL: return createNumberLiteral();
			case Cql2Package.BOOLEAN_LITERAL: return createBooleanLiteral();
			case Cql2Package.TIMESTAMP_LITERAL: return createTimestampLiteral();
			case Cql2Package.DATE_LITERAL: return createDateLiteral();
			case Cql2Package.ARRAY_LITERAL: return createArrayLiteral();
			case Cql2Package.BBOX_LITERAL: return createBboxLiteral();
			case Cql2Package.GEOMETRY_LITERAL: return createGeometryLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Equal createEqual() {
		EqualImpl equal = new EqualImpl();
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotEqual createNotEqual() {
		NotEqualImpl notEqual = new NotEqualImpl();
		return notEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LessThan createLessThan() {
		LessThanImpl lessThan = new LessThanImpl();
		return lessThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LessOrEqual createLessOrEqual() {
		LessOrEqualImpl lessOrEqual = new LessOrEqualImpl();
		return lessOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GreaterThan createGreaterThan() {
		GreaterThanImpl greaterThan = new GreaterThanImpl();
		return greaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GreaterOrEqual createGreaterOrEqual() {
		GreaterOrEqualImpl greaterOrEqual = new GreaterOrEqualImpl();
		return greaterOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Like createLike() {
		LikeImpl like = new LikeImpl();
		return like;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Between createBetween() {
		BetweenImpl between = new BetweenImpl();
		return between;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public In createIn() {
		InImpl in = new InImpl();
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsNull createIsNull() {
		IsNullImpl isNull = new IsNullImpl();
		return isNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SIntersects createSIntersects() {
		SIntersectsImpl sIntersects = new SIntersectsImpl();
		return sIntersects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SEquals createSEquals() {
		SEqualsImpl sEquals = new SEqualsImpl();
		return sEquals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SDisjoint createSDisjoint() {
		SDisjointImpl sDisjoint = new SDisjointImpl();
		return sDisjoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public STouches createSTouches() {
		STouchesImpl sTouches = new STouchesImpl();
		return sTouches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SWithin createSWithin() {
		SWithinImpl sWithin = new SWithinImpl();
		return sWithin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SOverlaps createSOverlaps() {
		SOverlapsImpl sOverlaps = new SOverlapsImpl();
		return sOverlaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCrosses createSCrosses() {
		SCrossesImpl sCrosses = new SCrossesImpl();
		return sCrosses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SContains createSContains() {
		SContainsImpl sContains = new SContainsImpl();
		return sContains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyRef createPropertyRef() {
		PropertyRefImpl propertyRef = new PropertyRefImpl();
		return propertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberLiteral createNumberLiteral() {
		NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
		return numberLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimestampLiteral createTimestampLiteral() {
		TimestampLiteralImpl timestampLiteral = new TimestampLiteralImpl();
		return timestampLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateLiteral createDateLiteral() {
		DateLiteralImpl dateLiteral = new DateLiteralImpl();
		return dateLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayLiteral createArrayLiteral() {
		ArrayLiteralImpl arrayLiteral = new ArrayLiteralImpl();
		return arrayLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BboxLiteral createBboxLiteral() {
		BboxLiteralImpl bboxLiteral = new BboxLiteralImpl();
		return bboxLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryLiteral createGeometryLiteral() {
		GeometryLiteralImpl geometryLiteral = new GeometryLiteralImpl();
		return geometryLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cql2Package getCql2Package() {
		return (Cql2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Cql2Package getPackage() {
		return Cql2Package.eINSTANCE;
	}

} //Cql2FactoryImpl
