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

import java.io.InputStream;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.fennec.ogc.features.api.FeatureSource;
import org.eclipse.fennec.ogc.features.source.memory.MemoryFeatureSource;
import org.geojson.Geometry;
import org.geojson.Point;
import org.geojson.Polygon;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.annotation.Property;
import org.osgi.test.common.annotation.config.WithFactoryConfiguration;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import jakarta.servlet.Servlet;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

/**
 * A dynamic package, as a Data Atlas registers it: the Ecore file is loaded at runtime, there
 * is no generated code, and the instances come from XMI with the geometry as GeoJSON text.
 * The ecore fragment makes the geometry data type resolve its instance class, the
 * {@code GeoJsonDataTypes} component gives it the GeoJSON conversion, and the server serves
 * and filters the geometry like that of a generated model (#14).
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
@WithFactoryConfiguration(factoryPid = "org.eclipse.fennec.ogc.features.servlet", name = "dyn", location = "?",
		properties = {
				@Property(key = "title", value = "Spots"),
				@Property(key = "osgi.http.whiteboard.servlet.pattern", type = Property.Type.Array,
						value = { DynamicPackageTest.PATH, DynamicPackageTest.PATH + "/*" }),
				@Property(key = "osgi.http.whiteboard.servlet.name", value = DynamicPackageTest.SERVLET),
				@Property(key = "ePackage.target", value = "(emf.nsURI=" + DynamicPackageTest.NS_URI + ")"),
				@Property(key = "source.target", value = "(ogc.test.source=dyn)") })
class DynamicPackageTest {

	static final String NS_URI = "https://eclipse.org/fennec/ogc/test/spots/1.0";
	static final String PATH = "/ogc/dyn";
	static final String SERVLET = "fennec-ogc-features-dyn";

	private static final String BASE = "http://127.0.0.1:18894" + PATH;
	private static final JsonMapper MAPPER = JsonMapper.builder().build();
	private static final HttpClient CLIENT = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5)).build();

	@InjectBundleContext
	static BundleContext context;

	@InjectService(filter = "(osgi.http.whiteboard.servlet.name=" + SERVLET + ")", timeout = 10000)
	Servlet servlet;

	private static EPackage spots;
	private static EDataType geometryType;
	private static List<EObject> features;
	private static ServiceRegistration<EPackage> packageRegistration;
	private static ServiceRegistration<FeatureSource> sourceRegistration;

	@BeforeAll
	static void loadAndRegister() throws Exception {
		// the codec's GeoJsonDataTypes component must be up before the package is registered
		context.getServiceReferences(Resource.Factory.class, "(emf.configuratorName=geojson)");

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		Resource ecore = resourceSet.createResource(org.eclipse.emf.common.util.URI.createURI("spots.ecore"));
		try (InputStream in = context.getBundle().getEntry("dyn/spots.ecore").openStream()) {
			ecore.load(in, null);
		}
		spots = (EPackage) ecore.getContents().get(0);
		resourceSet.getPackageRegistry().put(NS_URI, spots);
		geometryType = (EDataType) spots.getEClassifier("Geometry");

		Hashtable<String, Object> packageProperties = new Hashtable<>();
		packageProperties.put("emf.nsURI", NS_URI);
		packageProperties.put("emf.name", spots.getName());
		packageRegistration = context.registerService(EPackage.class, spots, packageProperties);

		// GeoJsonDataTypes binds the package and sets the conversion; DS delivers the event in this thread
		long deadline = System.currentTimeMillis() + 10000;
		while (((EDataType.Internal) geometryType).getConversionDelegate() == null && System.currentTimeMillis() < deadline) {
			Thread.sleep(50);
		}

		Resource xmi = resourceSet.createResource(org.eclipse.emf.common.util.URI.createURI("spots.xmi"));
		try (InputStream in = context.getBundle().getEntry("dyn/spots.xmi").openStream()) {
			xmi.load(in, null);
		}
		features = List.copyOf(xmi.getContents());

		Hashtable<String, Object> sourceProperties = new Hashtable<>();
		sourceProperties.put("ogc.test.source", "dyn");
		sourceRegistration = context.registerService(FeatureSource.class,
				new MemoryFeatureSource(Set.of(NS_URI), () -> features), sourceProperties);
	}

	@AfterAll
	static void unregister() {
		if (sourceRegistration != null) {
			sourceRegistration.unregister();
		}
		if (packageRegistration != null) {
			packageRegistration.unregister();
		}
	}

	private static HttpResponse<String> get(String pathAndQuery) throws Exception {
		HttpRequest request = HttpRequest.newBuilder(URI.create(BASE + pathAndQuery)).timeout(Duration.ofSeconds(20))
				.header("Accept", "application/json").GET().build();
		return CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
	}

	private static JsonNode json(String pathAndQuery) throws Exception {
		HttpResponse<String> response = get(pathAndQuery);
		assertThat(response.statusCode()).as(response.body()).isEqualTo(200);
		return MAPPER.readTree(response.body());
	}

	private static String q(String value) {
		return URLEncoder.encode(value, StandardCharsets.UTF_8);
	}

	@Test
	void theFragmentResolvesTheInstanceClassOfADynamicPackage() {
		assertThat(spots.getClass().getName()).isEqualTo("org.eclipse.emf.ecore.impl.EPackageImpl");
		assertThat(geometryType.getInstanceClass()).isEqualTo(Geometry.class);
		assertThat(((EDataType.Internal) geometryType).getConversionDelegate()).isNotNull();
	}

	@Test
	void xmiCarriesTheGeometryAsGeoJsonText() {
		EClass spot = (EClass) spots.getEClassifier("Spot");
		EAttribute geometry = (EAttribute) spot.getEStructuralFeature("geometry");
		assertThat(features).hasSize(2);
		assertThat(features.get(0).eGet(geometry)).isInstanceOf(Point.class);
		assertThat(features.get(1).eGet(geometry)).isInstanceOf(Polygon.class);

		Point point = (Point) features.get(0).eGet(geometry);
		String text = EcoreUtil.convertToString(geometryType, point);
		assertThat(text).contains("\"Point\"").contains("11.617");
		assertThat(EcoreUtil.createFromString(geometryType, text)).isInstanceOf(Point.class);

		// a value that is no geometry is still rejected, as for a generated package
		org.junit.jupiter.api.Assertions.assertThrows(ClassCastException.class,
				() -> features.get(0).eSet(geometry, "not a geometry"));
	}

	@Test
	void theServerServesAndFiltersTheGeometry() throws Exception {
		JsonNode collections = json("/collections").path("collections");
		assertThat(collections.valueStream().map(c -> c.path("id").asString())).containsExactly("spots");
		assertThat(collections.get(0).path("extent").path("spatial").path("bbox").get(0).size()).isEqualTo(4);

		JsonNode items = json("/collections/spots/items");
		assertThat(items.path("numberReturned").asInt()).isEqualTo(2);
		JsonNode pool = json("/collections/spots/items/spot-pool");
		assertThat(pool.path("geometry").path("type").asString()).isEqualTo("Point");
		assertThat(pool.path("geometry").path("coordinates").get(0).asDouble()).isCloseTo(11.617, org.assertj.core.data.Offset.offset(1e-9));
		assertThat(pool.path("properties").has("geometry")).isFalse();
		assertThat(pool.path("properties").path("name").asString()).isEqualTo("Am Becken");

		// bbox around the point only
		JsonNode nearPool = json("/collections/spots/items?bbox=11.616,50.905,11.6175,50.9055");
		assertThat(nearPool.path("features").valueStream().map(f -> f.path("id").asString())).containsExactly("spot-pool");
		// bbox that touches neither
		assertThat(json("/collections/spots/items?bbox=12,51,13,52").path("numberReturned").asInt()).isZero();
		// the spatial function of CQL2 on the parsed geometry
		JsonNode intersects = json("/collections/spots/items?filter=" + q("S_INTERSECTS(geometry, BBOX(11.6185,50.9062,11.6186,50.9063))"));
		assertThat(intersects.path("features").valueStream().map(f -> f.path("id").asString())).containsExactly("spot-lawn");
	}
}
