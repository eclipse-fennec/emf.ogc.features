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
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.fennec.ogc.features.api.FeatureSource;
import org.eclipse.fennec.ogc.features.api.FilterLanguage;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
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
 * Serves OGC API - Features under {@code /ogc}: the collections of every registered EPackage
 * with annotated classes, read from the registered feature sources.
 */
@Component(service = Servlet.class, name = OgcFeaturesServlet.PID)
@Designate(ocd = OgcFeaturesServlet.Config.class)
@HttpWhiteboardServletName("fennec-ogc-features")
@HttpWhiteboardServletPattern({ "/ogc", "/ogc/*" })
public class OgcFeaturesServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/** the configuration PID */
	public static final String PID = "org.eclipse.fennec.ogc.features.servlet";

	@ObjectClassDefinition(name = "Fennec OGC API Features Server")
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
	}

	private final transient CollectionRegistry registry = new CollectionRegistry();
	private final transient Map<String, FilterLanguage> languages = new ConcurrentHashMap<>();
	private transient volatile OgcApi api;
	private transient volatile Config config;

	@Activate
	@Modified
	void activate(Config config) {
		this.config = config;
		this.api = new OgcApi(registry, () -> Map.copyOf(languages),
				new OgcApi.Settings(config.title(), emptyToNull(config.description()), config.defaultLimit(),
						config.maxLimit()));
	}

	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
	void addPackage(EPackage ePackage) {
		registry.addPackage(ePackage);
	}

	void removePackage(EPackage ePackage) {
		registry.removePackage(ePackage);
	}

	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
	void addSource(FeatureSource source) {
		registry.addSource(source);
	}

	void removeSource(FeatureSource source) {
		registry.removeSource(source);
	}

	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
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

	private static String emptyToNull(String value) {
		return value == null || value.isBlank() ? null : value;
	}
}
