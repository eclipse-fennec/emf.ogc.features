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
 *     Data In Motion - initial API and implementation
 */
package org.eclipse.fennec.ogc.features.tests;

import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.fennec.ogc.features.geo.GeoJsonText;
import org.geojson.GeoJsonPackage;
import org.geojson.Geometry;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

/**
 * The experiment model for emf.ogc.features#14: a dynamic package {@code shapes} whose class
 * {@code Shape} holds its geometry as a <em>containment reference</em> to the GeoJSON model's
 * {@code Geometry}, plus one shape per GeoJSON geometry type. The backends store the shapes
 * and the test compares what comes back with what went in, geometry type by geometry type.
 */
final class ShapesModel {

	static final String NS_URI = "https://eclipse.org/fennec/ogc/test/shapes/1.0";

	/** every GeoJSON geometry type the OGC API Features server deals with, as GeoJSON text */
	static final Map<String, String> GEOMETRIES = new LinkedHashMap<>();
	static {
		GEOMETRIES.put("Point", "{\"type\":\"Point\",\"coordinates\":[11.617,50.905]}");
		GEOMETRIES.put("MultiPoint", "{\"type\":\"MultiPoint\",\"coordinates\":[[11.617,50.905],[11.618,50.906]]}");
		GEOMETRIES.put("LineString", "{\"type\":\"LineString\",\"coordinates\":[[11.617,50.905],[11.618,50.906],[11.619,50.905]]}");
		GEOMETRIES.put("MultiLineString", "{\"type\":\"MultiLineString\",\"coordinates\":"
				+ "[[[11.617,50.905],[11.618,50.906]],[[11.62,50.907],[11.621,50.908],[11.622,50.907]]]}");
		GEOMETRIES.put("Polygon", "{\"type\":\"Polygon\",\"coordinates\":"
				+ "[[[11.61,50.9],[11.62,50.9],[11.62,50.91],[11.61,50.91],[11.61,50.9]],"
				+ "[[11.613,50.903],[11.617,50.903],[11.617,50.907],[11.613,50.907],[11.613,50.903]]]}");
		GEOMETRIES.put("MultiPolygon", "{\"type\":\"MultiPolygon\",\"coordinates\":"
				+ "[[[[11.61,50.9],[11.62,50.9],[11.62,50.91],[11.61,50.91],[11.61,50.9]]],"
				+ "[[[11.63,50.92],[11.64,50.92],[11.64,50.93],[11.63,50.93],[11.63,50.92]]]]}");
		GEOMETRIES.put("GeometryCollection", "{\"type\":\"GeometryCollection\",\"geometries\":["
				+ "{\"type\":\"Point\",\"coordinates\":[11.617,50.905]},"
				+ "{\"type\":\"LineString\",\"coordinates\":[[11.617,50.905],[11.618,50.906]]}]}");
	}

	private static final JsonMapper MAPPER = JsonMapper.builder().build();

	final ResourceSet resourceSet;
	final EPackage ePackage;
	final EClass shape;
	final EAttribute id;
	final EAttribute name;
	final EReference geometry;
	final GeoJsonText text;

	/**
	 * Loads {@code dyn/shapes.ecore} of the test bundle into a resource set that knows the
	 * GeoJSON package, so the reference to its {@code Geometry} class resolves.
	 */
	ShapesModel(BundleContext context, Resource.Factory geoJson) throws IOException {
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(GeoJsonPackage.eNS_URI, GeoJsonPackage.eINSTANCE);
		Resource ecore = resourceSet.createResource(URI.createURI("shapes.ecore"));
		try (InputStream in = context.getBundle().getEntry("dyn/shapes.ecore").openStream()) {
			ecore.load(in, null);
		}
		ePackage = (EPackage) ecore.getContents().get(0);
		resourceSet.getPackageRegistry().put(NS_URI, ePackage);
		shape = (EClass) ePackage.getEClassifier("Shape");
		id = (EAttribute) shape.getEStructuralFeature("id");
		name = (EAttribute) shape.getEStructuralFeature("name");
		geometry = (EReference) shape.getEStructuralFeature("geometry");
		text = new GeoJsonText(geoJson);
	}

	/** registers the package as an EPackage service, as the Data Atlas does for its schemas */
	ServiceRegistration<EPackage> register(BundleContext context) {
		Hashtable<String, Object> properties = new Hashtable<>();
		properties.put("emf.nsURI", NS_URI);
		properties.put("emf.name", ePackage.getName());
		return context.registerService(EPackage.class, ePackage, properties);
	}

	/** one shape per geometry type, id = the type name in lower case */
	List<EObject> shapes() {
		return GEOMETRIES.entrySet().stream().map(e -> shape(e.getKey(), e.getValue())).toList();
	}

	EObject shape(String type, String geoJson) {
		EObject object = EcoreUtil.create(shape);
		object.eSet(id, idOf(type));
		object.eSet(name, type + " shape");
		object.eSet(geometry, text.read(geoJson));
		return object;
	}

	static String idOf(String type) {
		return type.toLowerCase();
	}

	/**
	 * @return what came back for the type: the geometry class, and whether its GeoJSON equals
	 *         what went in
	 */
	Outcome compare(String type, EObject stored) {
		if (stored == null) {
			return new Outcome(type, "object not found", null, false);
		}
		Object value = stored.eGet(geometry);
		if (value == null) {
			return new Outcome(type, "geometry null", null, false);
		}
		if (!(value instanceof Geometry g)) {
			return new Outcome(type, value.getClass().getSimpleName(), String.valueOf(value), false);
		}
		String back;
		try {
			back = text.write(g);
		} catch (RuntimeException e) {
			return new Outcome(type, g.eClass().getName(), "cannot write: " + e.getMessage(), false);
		}
		JsonNode expected = MAPPER.readTree(GEOMETRIES.get(type));
		JsonNode actual = MAPPER.readTree(back);
		return new Outcome(type, g.eClass().getName(), back, expected.equals(actual));
	}

	/** the result for one geometry type */
	record Outcome(String type, String came, String geoJson, boolean equal) {

		@Override
		public String toString() {
			return String.format("%-18s %-22s %s%s", type, came, equal ? "EQUAL" : "DIFFERENT",
					geoJson == null ? "" : "  " + geoJson);
		}
	}
}
