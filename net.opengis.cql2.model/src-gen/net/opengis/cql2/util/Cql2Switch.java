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
package net.opengis.cql2.util;

import net.opengis.cql2.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.opengis.cql2.Cql2Package
 * @generated
 */
public class Cql2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Cql2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cql2Switch() {
		if (modelPackage == null) {
			modelPackage = Cql2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Cql2Package.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.PREDICATE: {
				Predicate predicate = (Predicate)theEObject;
				T result = casePredicate(predicate);
				if (result == null) result = caseExpression(predicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = casePredicate(operation);
				if (result == null) result = caseExpression(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.COMPARISON: {
				Comparison comparison = (Comparison)theEObject;
				T result = caseComparison(comparison);
				if (result == null) result = caseOperation(comparison);
				if (result == null) result = casePredicate(comparison);
				if (result == null) result = caseExpression(comparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.SPATIAL_OPERATION: {
				SpatialOperation spatialOperation = (SpatialOperation)theEObject;
				T result = caseSpatialOperation(spatialOperation);
				if (result == null) result = caseOperation(spatialOperation);
				if (result == null) result = casePredicate(spatialOperation);
				if (result == null) result = caseExpression(spatialOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseOperation(and);
				if (result == null) result = casePredicate(and);
				if (result == null) result = caseExpression(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseOperation(or);
				if (result == null) result = casePredicate(or);
				if (result == null) result = caseExpression(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseOperation(not);
				if (result == null) result = casePredicate(not);
				if (result == null) result = caseExpression(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.EQUAL: {
				Equal equal = (Equal)theEObject;
				T result = caseEqual(equal);
				if (result == null) result = caseComparison(equal);
				if (result == null) result = caseOperation(equal);
				if (result == null) result = casePredicate(equal);
				if (result == null) result = caseExpression(equal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.NOT_EQUAL: {
				NotEqual notEqual = (NotEqual)theEObject;
				T result = caseNotEqual(notEqual);
				if (result == null) result = caseComparison(notEqual);
				if (result == null) result = caseOperation(notEqual);
				if (result == null) result = casePredicate(notEqual);
				if (result == null) result = caseExpression(notEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.LESS_THAN: {
				LessThan lessThan = (LessThan)theEObject;
				T result = caseLessThan(lessThan);
				if (result == null) result = caseComparison(lessThan);
				if (result == null) result = caseOperation(lessThan);
				if (result == null) result = casePredicate(lessThan);
				if (result == null) result = caseExpression(lessThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.LESS_OR_EQUAL: {
				LessOrEqual lessOrEqual = (LessOrEqual)theEObject;
				T result = caseLessOrEqual(lessOrEqual);
				if (result == null) result = caseComparison(lessOrEqual);
				if (result == null) result = caseOperation(lessOrEqual);
				if (result == null) result = casePredicate(lessOrEqual);
				if (result == null) result = caseExpression(lessOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.GREATER_THAN: {
				GreaterThan greaterThan = (GreaterThan)theEObject;
				T result = caseGreaterThan(greaterThan);
				if (result == null) result = caseComparison(greaterThan);
				if (result == null) result = caseOperation(greaterThan);
				if (result == null) result = casePredicate(greaterThan);
				if (result == null) result = caseExpression(greaterThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.GREATER_OR_EQUAL: {
				GreaterOrEqual greaterOrEqual = (GreaterOrEqual)theEObject;
				T result = caseGreaterOrEqual(greaterOrEqual);
				if (result == null) result = caseComparison(greaterOrEqual);
				if (result == null) result = caseOperation(greaterOrEqual);
				if (result == null) result = casePredicate(greaterOrEqual);
				if (result == null) result = caseExpression(greaterOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.LIKE: {
				Like like = (Like)theEObject;
				T result = caseLike(like);
				if (result == null) result = caseOperation(like);
				if (result == null) result = casePredicate(like);
				if (result == null) result = caseExpression(like);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.BETWEEN: {
				Between between = (Between)theEObject;
				T result = caseBetween(between);
				if (result == null) result = caseOperation(between);
				if (result == null) result = casePredicate(between);
				if (result == null) result = caseExpression(between);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.IN: {
				In in = (In)theEObject;
				T result = caseIn(in);
				if (result == null) result = caseOperation(in);
				if (result == null) result = casePredicate(in);
				if (result == null) result = caseExpression(in);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.IS_NULL: {
				IsNull isNull = (IsNull)theEObject;
				T result = caseIsNull(isNull);
				if (result == null) result = caseOperation(isNull);
				if (result == null) result = casePredicate(isNull);
				if (result == null) result = caseExpression(isNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.SINTERSECTS: {
				SIntersects sIntersects = (SIntersects)theEObject;
				T result = caseSIntersects(sIntersects);
				if (result == null) result = caseSpatialOperation(sIntersects);
				if (result == null) result = caseOperation(sIntersects);
				if (result == null) result = casePredicate(sIntersects);
				if (result == null) result = caseExpression(sIntersects);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.SEQUALS: {
				SEquals sEquals = (SEquals)theEObject;
				T result = caseSEquals(sEquals);
				if (result == null) result = caseSpatialOperation(sEquals);
				if (result == null) result = caseOperation(sEquals);
				if (result == null) result = casePredicate(sEquals);
				if (result == null) result = caseExpression(sEquals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.SDISJOINT: {
				SDisjoint sDisjoint = (SDisjoint)theEObject;
				T result = caseSDisjoint(sDisjoint);
				if (result == null) result = caseSpatialOperation(sDisjoint);
				if (result == null) result = caseOperation(sDisjoint);
				if (result == null) result = casePredicate(sDisjoint);
				if (result == null) result = caseExpression(sDisjoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.STOUCHES: {
				STouches sTouches = (STouches)theEObject;
				T result = caseSTouches(sTouches);
				if (result == null) result = caseSpatialOperation(sTouches);
				if (result == null) result = caseOperation(sTouches);
				if (result == null) result = casePredicate(sTouches);
				if (result == null) result = caseExpression(sTouches);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.SWITHIN: {
				SWithin sWithin = (SWithin)theEObject;
				T result = caseSWithin(sWithin);
				if (result == null) result = caseSpatialOperation(sWithin);
				if (result == null) result = caseOperation(sWithin);
				if (result == null) result = casePredicate(sWithin);
				if (result == null) result = caseExpression(sWithin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.SOVERLAPS: {
				SOverlaps sOverlaps = (SOverlaps)theEObject;
				T result = caseSOverlaps(sOverlaps);
				if (result == null) result = caseSpatialOperation(sOverlaps);
				if (result == null) result = caseOperation(sOverlaps);
				if (result == null) result = casePredicate(sOverlaps);
				if (result == null) result = caseExpression(sOverlaps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.SCROSSES: {
				SCrosses sCrosses = (SCrosses)theEObject;
				T result = caseSCrosses(sCrosses);
				if (result == null) result = caseSpatialOperation(sCrosses);
				if (result == null) result = caseOperation(sCrosses);
				if (result == null) result = casePredicate(sCrosses);
				if (result == null) result = caseExpression(sCrosses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.SCONTAINS: {
				SContains sContains = (SContains)theEObject;
				T result = caseSContains(sContains);
				if (result == null) result = caseSpatialOperation(sContains);
				if (result == null) result = caseOperation(sContains);
				if (result == null) result = casePredicate(sContains);
				if (result == null) result = caseExpression(sContains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.PROPERTY_REF: {
				PropertyRef propertyRef = (PropertyRef)theEObject;
				T result = casePropertyRef(propertyRef);
				if (result == null) result = caseExpression(propertyRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseExpression(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.STRING_LITERAL: {
				StringLiteral stringLiteral = (StringLiteral)theEObject;
				T result = caseStringLiteral(stringLiteral);
				if (result == null) result = caseLiteral(stringLiteral);
				if (result == null) result = caseExpression(stringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.NUMBER_LITERAL: {
				NumberLiteral numberLiteral = (NumberLiteral)theEObject;
				T result = caseNumberLiteral(numberLiteral);
				if (result == null) result = caseLiteral(numberLiteral);
				if (result == null) result = caseExpression(numberLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseLiteral(booleanLiteral);
				if (result == null) result = casePredicate(booleanLiteral);
				if (result == null) result = caseExpression(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.TIMESTAMP_LITERAL: {
				TimestampLiteral timestampLiteral = (TimestampLiteral)theEObject;
				T result = caseTimestampLiteral(timestampLiteral);
				if (result == null) result = caseLiteral(timestampLiteral);
				if (result == null) result = caseExpression(timestampLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.DATE_LITERAL: {
				DateLiteral dateLiteral = (DateLiteral)theEObject;
				T result = caseDateLiteral(dateLiteral);
				if (result == null) result = caseLiteral(dateLiteral);
				if (result == null) result = caseExpression(dateLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.ARRAY_LITERAL: {
				ArrayLiteral arrayLiteral = (ArrayLiteral)theEObject;
				T result = caseArrayLiteral(arrayLiteral);
				if (result == null) result = caseLiteral(arrayLiteral);
				if (result == null) result = caseExpression(arrayLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.BBOX_LITERAL: {
				BboxLiteral bboxLiteral = (BboxLiteral)theEObject;
				T result = caseBboxLiteral(bboxLiteral);
				if (result == null) result = caseLiteral(bboxLiteral);
				if (result == null) result = caseExpression(bboxLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cql2Package.GEOMETRY_LITERAL: {
				GeometryLiteral geometryLiteral = (GeometryLiteral)theEObject;
				T result = caseGeometryLiteral(geometryLiteral);
				if (result == null) result = caseLiteral(geometryLiteral);
				if (result == null) result = caseExpression(geometryLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicate(Predicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparison(Comparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spatial Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spatial Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpatialOperation(SpatialOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqual(Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotEqual(NotEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessThan(LessThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessOrEqual(LessOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThan(GreaterThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterOrEqual(GreaterOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Like</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Like</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLike(Like object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Between</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Between</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBetween(Between object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIn(In object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsNull(IsNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SIntersects</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SIntersects</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSIntersects(SIntersects object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SEquals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SEquals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEquals(SEquals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDisjoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDisjoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDisjoint(SDisjoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STouches</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STouches</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTouches(STouches object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SWithin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SWithin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSWithin(SWithin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SOverlaps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SOverlaps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSOverlaps(SOverlaps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SCrosses</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SCrosses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSCrosses(SCrosses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SContains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SContains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSContains(SContains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyRef(PropertyRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberLiteral(NumberLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timestamp Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timestamp Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimestampLiteral(TimestampLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateLiteral(DateLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayLiteral(ArrayLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bbox Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bbox Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBboxLiteral(BboxLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometry Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometry Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometryLiteral(GeometryLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Cql2Switch
