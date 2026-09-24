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
package org.eclipse.fennec.ogc.features.runtime;

import java.io.ByteArrayOutputStream;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.Envelope;
import org.eclipse.fennec.ogc.features.api.FeatureQuery;
import org.eclipse.fennec.ogc.features.api.FeatureResult;
import org.eclipse.fennec.ogc.features.api.FeatureSource;
import org.eclipse.fennec.ogc.features.api.FeatureSourceException;
import org.eclipse.fennec.ogc.features.api.FilterLanguage;
import org.geojson.LineString;
import org.geojson.MultiLineString;
import org.geojson.MultiPoint;
import org.geojson.MultiPolygon;
import org.geojson.Point;
import org.geojson.Polygon;

/**
 * The OGC API Features resources, independent of the servlet API: a request path, its
 * parameters and the Accept header go in, a status, a media type and a body come out.
 */
final class OgcApi {

	private static final System.Logger LOGGER = System.getLogger(OgcApi.class.getName());

	static final List<String> CORE_CONFORMANCE = List.of(
			"http://www.opengis.net/spec/ogcapi-features-1/1.0/conf/core",
			"http://www.opengis.net/spec/ogcapi-features-1/1.0/conf/geojson",
			"http://www.opengis.net/spec/ogcapi-features-1/1.0/conf/html",
			"http://www.opengis.net/spec/ogcapi-features-1/1.0/conf/oas30");

	static final List<String> FILTER_CONFORMANCE = List.of(
			"http://www.opengis.net/spec/ogcapi-features-3/1.0/conf/queryables",
			"http://www.opengis.net/spec/ogcapi-features-3/1.0/conf/queryables-query-parameters",
			"http://www.opengis.net/spec/ogcapi-features-3/1.0/conf/filter",
			"http://www.opengis.net/spec/ogcapi-features-3/1.0/conf/features-filter");

	/**
	 * The server's settings.
	 *
	 * @param title title of the landing page
	 * @param description description of the landing page, may be {@code null}
	 * @param defaultLimit page size when a request has no {@code limit}
	 * @param maxLimit largest page size served
	 * @param layerFolders folder put in front of the layer groups of a package, by namespace URI
	 */
	record Settings(String title, String description, int defaultLimit, int maxLimit, Map<String, String> layerFolders) {

		Settings {
			layerFolders = Map.copyOf(layerFolders);
		}

		Settings(String title, String description, int defaultLimit, int maxLimit) {
			this(title, description, defaultLimit, maxLimit, Map.of());
		}
	}

	/**
	 * @param status the HTTP status
	 * @param contentType the media type
	 * @param body the body
	 * @param filename the file name for a download, {@code null} to show the body
	 */
	record Response(int status, String contentType, byte[] body, String filename) {

		Response(int status, String contentType, byte[] body) {
			this(status, contentType, body, null);
		}
	}

	/** features looked at for one with a geometry, in the order the items are served */
	private static final int KIND_SAMPLE = 20;

	private final CollectionRegistry registry;
	private final Supplier<Map<String, FilterLanguage>> languages;
	private final Settings settings;

	OgcApi(CollectionRegistry registry, Supplier<Map<String, FilterLanguage>> languages, Settings settings) {
		this.registry = registry;
		this.languages = languages;
		this.settings = settings;
	}

	/**
	 * @param path the path below the base URL, e.g. {@code /collections/pools/items}
	 * @param parameters the query parameters, first value each
	 * @param accept the Accept header, may be {@code null}
	 * @param baseUrl the base URL of the API without trailing slash
	 */
	Response handle(String path, Map<String, String> parameters, String accept, String baseUrl) {
		String format = "json";
		try {
			format = format(parameters.get("f"), accept);
			LinkFactory links = new LinkFactory(baseUrl);
			List<String> segments = segments(path);
			if ("qgs".equals(format) && !segments.equals(List.of("collections"))) {
				throw RequestException.notAcceptable("f=qgs is offered for /collections only");
			}
			if (segments.isEmpty()) {
				return landingPage(links, format);
			}
			switch (segments.get(0)) {
			case "conformance":
				expectLength(segments, 1);
				return conformance(format, links);
			case "api":
				expectLength(segments, 1);
				return api(format, links, baseUrl);
			case "collections":
				return collections(segments, parameters, format, links);
			default:
				throw RequestException.notFound("No resource at " + path);
			}
		} catch (RequestException e) {
			return exception(e, format, new LinkFactory(baseUrl));
		} catch (FeatureSourceException e) {
			LOGGER.log(System.Logger.Level.ERROR, "Feature source failed for " + path, e);
			return exception(new RequestException(500, "ServerError", "The feature store failed"), format,
					new LinkFactory(baseUrl));
		}
	}

	List<String> conformanceClasses() {
		Set<String> classes = new LinkedHashSet<>(CORE_CONFORMANCE);
		Map<String, FilterLanguage> available = languages.get();
		if (!available.isEmpty()) {
			classes.addAll(FILTER_CONFORMANCE);
			available.values().forEach(l -> classes.addAll(l.conformanceClasses()));
		}
		return List.copyOf(classes);
	}

	private Response landingPage(LinkFactory links, String format) {
		List<Link> pageLinks = links.landingLinks(format);
		if ("html".equals(format)) {
			return html(new HtmlEncoder(links).landingPage(settings.title(), settings.description(), pageLinks));
		}
		return json(MediaTypes.JSON, e -> e.landingPage(settings.title(), settings.description(), pageLinks));
	}

	private Response conformance(String format, LinkFactory links) {
		List<String> classes = conformanceClasses();
		if ("html".equals(format)) {
			return html(new HtmlEncoder(links).conformance(classes));
		}
		return json(MediaTypes.JSON, e -> e.conformance(classes));
	}

	private Response api(String format, LinkFactory links, String baseUrl) {
		if ("html".equals(format)) {
			return html(new HtmlEncoder(links).api(settings.title()));
		}
		List<CollectionDescriptor> collections = registry.collections();
		List<String> languageNames = List.copyOf(languages.get().keySet());
		return json(MediaTypes.OPEN_API, e -> OpenApiDocument.write(e.generator(), settings.title(),
				settings.description(), baseUrl, collections, languageNames));
	}

	private Response collections(List<String> segments, Map<String, String> parameters, String format,
			LinkFactory links) {
		if (segments.size() == 1) {
			List<CollectionView> views = new ArrayList<>();
			for (CollectionDescriptor collection : registry.collections()) {
				views.add(view(collection, links, format));
			}
			if ("html".equals(format)) {
				return html(new HtmlEncoder(links).collections(views));
			}
			if ("qgs".equals(format)) {
				return qgisProject(views, links);
			}
			List<Link> pageLinks = new ArrayList<>(links.selfLinks("/collections", format, "Feature collections"));
			pageLinks.add(new Link(links.url("/collections?f=qgs"), "alternate", MediaTypes.QGIS_PROJECT, "QGIS project"));
			return json(MediaTypes.JSON, e -> e.collections(views, pageLinks));
		}
		CollectionDescriptor collection = registry.collection(segments.get(1))
				.orElseThrow(() -> RequestException.notFound("No collection '" + segments.get(1) + "'"));
		FeatureSource source = registry.source(collection)
				.orElseThrow(() -> RequestException.notFound("No collection '" + segments.get(1) + "'"));
		if (segments.size() == 2) {
			CollectionView view = view(collection, links, format);
			if ("html".equals(format)) {
				return html(new HtmlEncoder(links).collection(view));
			}
			return json(MediaTypes.JSON, e -> e.collection(view));
		}
		switch (segments.get(2)) {
		case "queryables":
			expectLength(segments, 3);
			String id = links.url("/collections/" + LinkFactory.encode(collection.id()) + "/queryables");
			return json(MediaTypes.JSON_SCHEMA, e -> e.queryables(collection, id));
		case "items":
			if (segments.size() == 3) {
				return items(collection, source, parameters, format, links);
			}
			expectLength(segments, 4);
			return feature(collection, source, segments.get(3), format, links);
		default:
			throw RequestException.notFound("No resource " + segments.get(2) + " of collection " + collection.id());
		}
	}

	private Response items(CollectionDescriptor collection, FeatureSource source, Map<String, String> parameters,
			String format, LinkFactory links) {
		ItemsRequest request = ItemsRequest.parse(parameters, collection, languages.get(), settings.defaultLimit(),
				settings.maxLimit());
		FeatureResult result;
		try {
			result = source.query(request.query());
		} catch (UnsupportedOperationException e) {
			// the backend cannot evaluate part of the filter, as in OData
			throw RequestException.notImplemented("Not supported by the backend of collection " + collection.id() + ": "
					+ e.getMessage());
		} catch (IllegalArgumentException e) {
			throw RequestException.badRequest("Invalid filter: " + e.getMessage());
		}
		List<Link> pageLinks = links.itemsLinks(collection, request, result.features().size(), result.numberMatched(),
				format);
		if ("html".equals(format)) {
			return html(new HtmlEncoder(links).items(collection, result, pageLinks));
		}
		return json(MediaTypes.GEO_JSON, e -> e.items(collection, result, pageLinks, links));
	}

	private Response feature(CollectionDescriptor collection, FeatureSource source, String id, String format,
			LinkFactory links) {
		EObject feature = source.get(collection, id)
				.orElseThrow(() -> RequestException.notFound("No feature '" + id + "' in collection " + collection.id()));
		List<Link> featureLinks = new ArrayList<>(links.featureLinks(collection, id));
		if ("html".equals(format)) {
			featureLinks.set(0, new Link(featureLinks.get(0).href(), "alternate", MediaTypes.GEO_JSON, null));
			featureLinks.set(1, new Link(featureLinks.get(1).href(), "self", MediaTypes.HTML, null));
			return html(new HtmlEncoder(links).feature(collection, feature, featureLinks));
		}
		return json(MediaTypes.GEO_JSON, e -> e.feature(collection, feature, featureLinks, links));
	}

	/** the collections as a QGIS project, one layer per collection with features */
	private Response qgisProject(List<CollectionView> views, LinkFactory links) {
		List<QgisProject.Layer> layers = new ArrayList<>();
		for (CollectionView view : views) {
			kind(view.descriptor()).ifPresent(kind -> layers.add(new QgisProject.Layer(view, kind)));
		}
		byte[] body = QgisProject.write(settings.title(), links.url(""), layers);
		return new Response(200, MediaTypes.QGIS_PROJECT, body, "ogc-features.qgs");
	}

	/** the geometry type of the first feature with a geometry: QGIS gives the layer that type */
	private Optional<QgisProject.Kind> kind(CollectionDescriptor collection) {
		if (collection.geometry() == null) {
			return Optional.empty();
		}
		Optional<FeatureSource> source = registry.source(collection);
		if (source.isEmpty()) {
			return Optional.empty();
		}
		for (EObject feature : source.get().query(FeatureQuery.builder(collection).limit(KIND_SAMPLE).build()).features()) {
			QgisProject.Kind kind = switch (feature.eGet(collection.geometry())) {
			case Point p -> QgisProject.Kind.POINT;
			case MultiPoint p -> QgisProject.Kind.POINT;
			case LineString l -> QgisProject.Kind.LINE;
			case MultiLineString l -> QgisProject.Kind.LINE;
			case Polygon p -> QgisProject.Kind.POLYGON;
			case MultiPolygon p -> QgisProject.Kind.POLYGON;
			case null, default -> null;
			};
			if (kind != null) {
				return Optional.of(kind);
			}
		}
		return Optional.empty();
	}

	private CollectionView view(CollectionDescriptor collection, LinkFactory links, String format) {
		Optional<Envelope> extent;
		try {
			extent = registry.source(collection).flatMap(s -> s.extent(collection));
		} catch (FeatureSourceException e) {
			LOGGER.log(System.Logger.Level.WARNING, "Cannot compute the extent of " + collection.id(), e);
			extent = Optional.empty();
		}
		return new CollectionView(collection, extent, links.collectionLinks(collection, format), layerGroup(collection));
	}

	private String layerGroup(CollectionDescriptor collection) {
		String folder = collection.type().getEPackage() == null ? null
				: settings.layerFolders().get(collection.type().getEPackage().getNsURI());
		if (folder == null) {
			return collection.layerGroup();
		}
		return collection.layerGroup() == null ? folder : folder + "/" + collection.layerGroup();
	}

	private Response exception(RequestException e, String format, LinkFactory links) {
		if ("html".equals(format)) {
			byte[] body = new HtmlEncoder(links).exception(e).toString().getBytes(StandardCharsets.UTF_8);
			return new Response(e.status(), MediaTypes.HTML + ";charset=utf-8", body);
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		JsonEncoder.write(out, encoder -> encoder.exception(e));
		return new Response(e.status(), MediaTypes.JSON, out.toByteArray());
	}

	private static Response json(String type, JsonEncoder.Body body) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		JsonEncoder.write(out, body);
		return new Response(200, type, out.toByteArray());
	}

	private static Response html(HtmlEncoder encoder) {
		return new Response(200, MediaTypes.HTML + ";charset=utf-8", encoder.toString().getBytes(StandardCharsets.UTF_8));
	}

	/**
	 * The {@code f} parameter wins; without it a browser asking for HTML gets HTML, everyone else JSON.
	 */
	static String format(String f, String accept) {
		if (f != null) {
			String lower = f.toLowerCase(Locale.ROOT);
			return switch (lower) {
			case "json", "geojson" -> "json";
			case "html" -> "html";
			case "qgs", "qgis" -> "qgs";
			default -> throw RequestException.notAcceptable("Unsupported format f=" + f + ", supported: json, html, qgs");
			};
		}
		if (accept != null && accept.contains("text/html")) {
			return "html";
		}
		return "json";
	}

	private static List<String> segments(String path) {
		List<String> segments = new ArrayList<>();
		if (path != null) {
			for (String segment : path.split("/")) {
				if (!segment.isEmpty()) {
					segments.add(URLDecoder.decode(segment, StandardCharsets.UTF_8));
				}
			}
		}
		return segments;
	}

	private static void expectLength(List<String> segments, int length) {
		if (segments.size() != length) {
			throw RequestException.notFound("No resource at /" + String.join("/", segments));
		}
	}
}
