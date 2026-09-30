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

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.osgi.framework.BundleContext;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

/**
 * Experiment for #14, XMI: a dynamic package holding its geometry as a containment reference
 * to the GeoJSON model. Saves one shape per geometry type to XMI and loads it back.
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
class GeometryReferenceXmiTest {

	@InjectBundleContext
	static BundleContext context;

	@InjectService(filter = "(emf.configuratorName=geojson)", timeout = 10000)
	static Resource.Factory geoJson;

	private static ShapesModel model;
	private static String xmi;
	private static Map<String, EObject> reloaded;

	@BeforeAll
	static void roundTrip() throws Exception {
		model = new ShapesModel(context, geoJson);
		Resource out = model.resourceSet.createResource(URI.createURI("shapes.xmi"));
		out.getContents().addAll(model.shapes());
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		out.save(bytes, null);
		xmi = bytes.toString(StandardCharsets.UTF_8);
		System.out.println("=== #14 experiment, XMI of the shapes ===\n" + xmi);

		Resource in = model.resourceSet.createResource(URI.createURI("shapes-reloaded.xmi"));
		in.load(new ByteArrayInputStream(bytes.toByteArray()), null);
		reloaded = new java.util.LinkedHashMap<>();
		for (EObject object : in.getContents()) {
			reloaded.put((String) object.eGet(model.id), object);
		}
		System.out.println("=== #14 experiment, XMI round trip ===");
		for (String type : ShapesModel.GEOMETRIES.keySet()) {
			System.out.println(model.compare(type, reloaded.get(ShapesModel.idOf(type))));
		}
	}

	/**
	 * The geometry is a typed child element; its coordinates travel in the {@code data}
	 * attribute. The GeoJSON model's factory converts the double arrays with the EMF default
	 * for a Serializable instance class, which is Java serialisation as hex
	 * ({@code data="ACED0005..."}), so the text round-trips but is not readable.
	 */
	@Test
	void theXmiCarriesTheGeometryAsTypedChildWithSerialisedData() {
		assertThat(xmi).contains("xsi:type=\"geo-json:Point\"").contains("data=\"ACED0005");
		assertThat(in(xmi, "<geometry")).isEqualTo(ShapesModel.GEOMETRIES.size());
	}

	@ParameterizedTest(name = "{0}")
	@ValueSource(strings = { "Point", "MultiPoint", "LineString", "MultiLineString", "Polygon", "MultiPolygon",
			"GeometryCollection" })
	void xmiRoundTrip(String type) {
		ShapesModel.Outcome outcome = model.compare(type, reloaded.get(ShapesModel.idOf(type)));
		assertThat(outcome.equal()).as(outcome.toString()).isTrue();
	}

	private static int in(String text, String needle) {
		int count = 0;
		for (int i = text.indexOf(needle); i >= 0; i = text.indexOf(needle, i + 1)) {
			count++;
		}
		return count;
	}
}
