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

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.fennec.ogc.features.api.CollectionProvider;
import org.eclipse.fennec.ogc.features.api.FeatureSource;
import org.eclipse.fennec.ogc.features.api.FilterLanguage;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.servlet.whiteboard.propertytypes.HttpWhiteboardServletName;
import org.osgi.service.servlet.whiteboard.propertytypes.HttpWhiteboardServletPattern;

import jakarta.servlet.Servlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Serves one OGC API - Features landing page with its conformance, OpenAPI, collections and
 * items. One configuration is one server instance: it binds the packages, feature sources
 * and collection providers its reference filters select, publishes the collections its
 * allowlist names, and mounts where its whiteboard properties say.
 * <p>
 * Every configuration property becomes a service property, so the standard whiteboard keys
 * apply: {@code osgi.http.whiteboard.servlet.pattern} replaces the default {@code /ogc},
 * {@code /ogc/*}; {@code osgi.http.whiteboard.servlet.name} must differ between instances
 * on the same whiteboard; {@code osgi.http.whiteboard.context.select} and
 * {@code osgi.http.whiteboard.target} pick the servlet context and the HTTP runtime.
 * {@code ePackage.target}, {@code source.target} and {@code collectionProvider.target}
 * narrow what the instance binds. Without a configuration nothing is served.
 */
@Component(service = Servlet.class, name = OgcFeaturesServlet.PID, configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = OgcFeaturesServlet.Config.class, factory = true)
@HttpWhiteboardServletName("fennec-ogc-features")
@HttpWhiteboardServletPattern({ "/ogc", "/ogc/*" })
public class OgcFeaturesServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/** the configuration PID, singleton or factory */
	public static final String PID = "org.eclipse.fennec.ogc.features.servlet";

	@ObjectClassDefinition(name = "Fennec OGC API Features Server",
			description = "One OGC API Features landing page with its collections; one configuration per instance")
	public @interface Config {

		@AttributeDefinition(description = "Title of the landing page")
		String title() default "Fennec OGC API Features";

		@AttributeDefinition(description = "Description of the landing page")
		String description() default "Feature collections of EMF models, served by Eclipse Fennec";

		@AttributeDefinition(description = "Page size when a request has no limit")
		int defaultLimit() default 10;

		@AttributeDefinition(description = "Largest page size served")
		int maxLimit() default 10000;

		@AttributeDefinition(description = "Public base URL, e.g. https://example.org/ogc; derived from the request when empty")
		String baseUrl() default "";

		@AttributeDefinition(description = "Value of Access-Control-Allow-Origin; no CORS header when empty")
		String corsOrigin() default "*";

		@AttributeDefinition(description = "Folders of the layer groups, 'nsURI=Folder/Subfolder': put in front of the "
				+ "layer groups of the collections of that package")
		String[] layerFolders() default {};

		@AttributeDefinition(description = "Ids of the collections this instance publishes; every collection of the "
				+ "bound packages when empty")
		String[] collections() default {};

		@AttributeDefinition(name = "osgi.http.whiteboard.servlet.pattern", required = false,
				description = "Where the instance is mounted: the landing page path and the same path with /*")
		String[] osgi_http_whiteboard_servlet_pattern() default { "/ogc", "/ogc/*" };

		@AttributeDefinition(name = "osgi.http.whiteboard.servlet.name", required = false,
				description = "Servlet name, unique per servlet context")
		String osgi_http_whiteboard_servlet_name() default "fennec-ogc-features";

		@AttributeDefinition(name = "osgi.http.whiteboard.context.select", required = false,
				description = "Filter selecting the servlet context; the default context when empty")
		String osgi_http_whiteboard_context_select();

		@AttributeDefinition(name = "osgi.http.whiteboard.target", required = false,
				description = "Filter selecting the HTTP runtime, e.g. (id=atlasHttp); every runtime when empty")
		String osgi_http_whiteboard_target();

		@AttributeDefinition(name = "ePackage.target", required = false,
				description = "Filter selecting the EPackage services bound, e.g. (emf.nsURI=https://example.org/pools); "
						+ "every package when empty")
		String ePackage_target();

		@AttributeDefinition(name = "source.target", required = false,
				description = "Filter selecting the FeatureSource services bound; every source when empty")
		String source_target();

		@AttributeDefinition(name = "collectionProvider.target", required = false,
				description = "Filter selecting the CollectionProvider services bound; every provider when empty")
		String collectionProvider_target();
	}

	private final transient CollectionRegistry registry = new CollectionRegistry();
	private final transient Map<String, FilterLanguage> languages = new ConcurrentHashMap<>();
	private transient volatile OgcApi api;
	private transient volatile Config config;

	@Activate
	@Modified
	void activate(Config config) {
		this.config = config;
		registry.publish(List.of(config.collections()));
		this.api = new OgcApi(registry, () -> Map.copyOf(languages),
				new OgcApi.Settings(config.title(), emptyToNull(config.description()), config.defaultLimit(),
						config.maxLimit(), folders(config.layerFolders())));
	}

	@Reference(name = "ePackage", cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
	void addPackage(EPackage ePackage) {
		registry.addPackage(ePackage);
	}

	void removePackage(EPackage ePackage) {
		registry.removePackage(ePackage);
	}

	@Reference(name = "source", cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
	void addSource(FeatureSource source) {
		registry.addSource(source);
	}

	void removeSource(FeatureSource source) {
		registry.removeSource(source);
	}

	@Reference(name = "collectionProvider", cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
	void addCollectionProvider(CollectionProvider provider) {
		registry.addProvider(provider);
	}

	void removeCollectionProvider(CollectionProvider provider) {
		registry.removeProvider(provider);
	}

	@Reference(name = "filterLanguage", cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
	void addLanguage(FilterLanguage language) {
		languages.put(language.name(), language);
	}

	void removeLanguage(FilterLanguage language) {
		languages.remove(language.name(), language);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Map<String, String> parameters = new LinkedHashMap<>();
		request.getParameterMap().forEach((k, v) -> parameters.put(k, v.length == 0 ? "" : v[0]));
		OgcApi.Response result = api.handle(request.getPathInfo(), parameters, request.getHeader("Accept"),
				baseUrl(request));
		cors(response);
		response.setStatus(result.status());
		response.setContentType(result.contentType());
		if (result.filename() != null) {
			response.setHeader("Content-Disposition", "attachment; filename=\"" + result.filename() + "\"");
		}
		response.setContentLength(result.body().length);
		response.getOutputStream().write(result.body());
	}

	@Override
	protected void doOptions(HttpServletRequest request, HttpServletResponse response) {
		cors(response);
		response.setHeader("Allow", "GET, HEAD, OPTIONS");
		response.setHeader("Access-Control-Allow-Methods", "GET, HEAD, OPTIONS");
		response.setHeader("Access-Control-Allow-Headers", "Accept, Content-Type");
		response.setStatus(HttpServletResponse.SC_NO_CONTENT);
	}

	private void cors(HttpServletResponse response) {
		String origin = config.corsOrigin();
		if (origin != null && !origin.isBlank()) {
			response.setHeader("Access-Control-Allow-Origin", origin);
		}
	}

	private String baseUrl(HttpServletRequest request) {
		String configured = config.baseUrl();
		if (configured != null && !configured.isBlank()) {
			return configured.endsWith("/") ? configured.substring(0, configured.length() - 1) : configured;
		}
		// scheme, host and port as the client used them, then the path up to this servlet
		String url = request.getRequestURL().toString();
		String origin = url.substring(0, url.length() - request.getRequestURI().length());
		return origin + request.getContextPath() + request.getServletPath();
	}

	private static Map<String, String> folders(String[] entries) {
		Map<String, String> folders = new LinkedHashMap<>();
		for (String entry : entries) {
			int eq = entry.lastIndexOf('=');
			if (eq > 0) {
				folders.put(entry.substring(0, eq).trim(), entry.substring(eq + 1).trim());
			}
		}
		return folders;
	}

	private static String emptyToNull(String value) {
		return value == null || value.isBlank() ? null : value;
	}
}
