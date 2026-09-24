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
package org.eclipse.fennec.ogc.features.example.city.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.fennec.ogc.features.example.city.*;

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
 * @see org.eclipse.fennec.ogc.features.example.city.CityPackage
 * @generated
 */
public class CitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitySwitch() {
		if (modelPackage == null) {
			modelPackage = CityPackage.eINSTANCE;
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
			case CityPackage.CITY_FEATURE: {
				CityFeature cityFeature = (CityFeature)theEObject;
				T result = caseCityFeature(cityFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CityPackage.STADTGEBIET: {
				Stadtgebiet stadtgebiet = (Stadtgebiet)theEObject;
				T result = caseStadtgebiet(stadtgebiet);
				if (result == null) result = caseCityFeature(stadtgebiet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CityPackage.STADTTEIL: {
				Stadtteil stadtteil = (Stadtteil)theEObject;
				T result = caseStadtteil(stadtteil);
				if (result == null) result = caseCityFeature(stadtteil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CityPackage.FLAECHE: {
				Flaeche flaeche = (Flaeche)theEObject;
				T result = caseFlaeche(flaeche);
				if (result == null) result = caseCityFeature(flaeche);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CityPackage.STRASSE: {
				Strasse strasse = (Strasse)theEObject;
				T result = caseStrasse(strasse);
				if (result == null) result = caseCityFeature(strasse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CityPackage.GEBAEUDE: {
				Gebaeude gebaeude = (Gebaeude)theEObject;
				T result = caseGebaeude(gebaeude);
				if (result == null) result = caseCityFeature(gebaeude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CityPackage.ORT: {
				Ort ort = (Ort)theEObject;
				T result = caseOrt(ort);
				if (result == null) result = caseCityFeature(ort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCityFeature(CityFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stadtgebiet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stadtgebiet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStadtgebiet(Stadtgebiet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stadtteil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stadtteil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStadtteil(Stadtteil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flaeche</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flaeche</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlaeche(Flaeche object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strasse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strasse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrasse(Strasse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gebaeude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gebaeude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGebaeude(Gebaeude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrt(Ort object) {
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

} //CitySwitch
