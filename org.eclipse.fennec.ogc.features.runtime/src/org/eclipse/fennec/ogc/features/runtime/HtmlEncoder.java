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

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.Envelope;
import org.eclipse.fennec.ogc.features.api.FeatureResult;
import org.eclipse.fennec.ogc.features.geo.Geometries;
import org.geojson.Geometry;

/**
 * Writes the HTML representations of the OGC API resources: plain pages with tables and the
 * links of the resource, meant for people browsing the API.
 */
final class HtmlEncoder {

	private static final String STYLE = """
			:root{--bg:#fff;--fg:#1d2733;--muted:#5b6b7c;--line:#dde3ea;--accent:#1565c0;--head:#f3f6f9}
			@media (prefers-color-scheme:dark){:root{--bg:#12171d;--fg:#e3e9ef;--muted:#9aa8b6;--line:#2a333d;--accent:#64b5f6;--head:#1a2129}}
			body{font:15px/1.5 system-ui,-apple-system,Segoe UI,Roboto,sans-serif;margin:0;background:var(--bg);color:var(--fg)}
			header{padding:14px 24px;border-bottom:1px solid var(--line)}
			header a{color:var(--muted);text-decoration:none;margin-right:6px}
			main{padding:8px 24px 32px;max-width:1100px}
			h1{font-size:22px;margin:16px 0 4px}p.desc{color:var(--muted);margin:0 0 16px}
			a{color:var(--accent)}table{border-collapse:collapse;width:100%;margin:12px 0}
			th,td{text-align:left;padding:6px 10px;border-bottom:1px solid var(--line);vertical-align:top}
			th{background:var(--head);font-weight:600}td.num{text-align:right;font-variant-numeric:tabular-nums}
			ul.links{padding-left:18px}code{font-size:13px}.muted{color:var(--muted)}
			.pager a{margin-right:12px}
			""";

	private final StringBuilder html = new StringBuilder();
	private final LinkFactory links;

	HtmlEncoder(LinkFactory links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return html.toString();
	}

	HtmlEncoder landingPage(String title, String description, List<Link> pageLinks) {
		open(title);
		h1(title);
		if (description != null) {
			html.append("<p class=\"desc\">").append(esc(description)).append("</p>");
		}
		html.append("<p><a href=\"").append(esc(links.url("/viewer/"))).append("\">Open the map viewer</a></p>");
		linkList(pageLinks);
		return close();
	}

	HtmlEncoder conformance(List<String> classes) {
		open("Conformance", "Conformance", "");
		h1("Conformance classes");
		html.append("<ul>");
		for (String c : classes) {
			html.append("<li><code>").append(esc(c)).append("</code></li>");
		}
		html.append("</ul>");
		return close();
	}

	HtmlEncoder collections(List<CollectionView> collections) {
		open("Collections", "Collections", "");
		h1("Collections");
		html.append("<table><tr><th>Collection</th><th>Id</th><th>Layer group</th><th>Extent</th></tr>");
		for (CollectionView view : collections) {
			CollectionDescriptor c = view.descriptor();
			html.append("<tr><td><a href=\"").append(esc(links.url("/collections/" + LinkFactory.encode(c.id()) + "?f=html")))
					.append("\">").append(esc(c.title())).append("</a>");
			if (c.description() != null) {
				html.append("<br><span class=\"muted\">").append(esc(c.description())).append("</span>");
			}
			html.append("</td><td><code>").append(esc(c.id())).append("</code></td><td>")
					.append(esc(c.layerGroup() == null ? "" : c.layerGroup())).append("</td><td>")
					.append(view.extent().map(HtmlEncoder::extent).orElse("")).append("</td></tr>");
		}
		html.append("</table>");
		return close();
	}

	HtmlEncoder collection(CollectionView view) {
		CollectionDescriptor c = view.descriptor();
		open(c.title(), "Collections", "/collections?f=html", c.title(), "");
		h1(c.title());
		if (c.description() != null) {
			html.append("<p class=\"desc\">").append(esc(c.description())).append("</p>");
		}
		html.append("<table><tr><th>Id</th><td><code>").append(esc(c.id())).append("</code></td></tr>")
				.append("<tr><th>Feature type</th><td>").append(esc(c.type().getName())).append("</td></tr>");
		view.extent().ifPresent(e -> html.append("<tr><th>Extent</th><td>").append(extent(e)).append("</td></tr>"));
		html.append("</table><h2>Queryables</h2><table><tr><th>Name</th><th>Type</th></tr>");
		for (EAttribute property : c.properties()) {
			html.append("<tr><td><code>").append(esc(property.getName())).append("</code></td><td>")
					.append(esc(property.getEAttributeType().getName())).append("</td></tr>");
		}
		html.append("</table>");
		linkList(view.links());
		return close();
	}

	HtmlEncoder items(CollectionDescriptor collection, FeatureResult result, List<Link> pageLinks) {
		open(collection.title(), "Collections", "/collections?f=html",
				collection.title(), "/collections/" + LinkFactory.encode(collection.id()) + "?f=html", "Items", "");
		h1(collection.title() + " — features");
		html.append("<p class=\"desc\">").append(result.features().size()).append(" returned");
		if (result.hasNumberMatched()) {
			html.append(" of ").append(result.numberMatched()).append(" matching");
		}
		html.append("</p>");
		pager(pageLinks);
		html.append("<table><tr><th>Id</th><th>Type</th><th>Name</th><th>Geometry</th></tr>");
		for (EObject feature : result.features()) {
			String id = FeatureValues.id(collection, feature);
			Object name = FeatureValues.properties(collection, feature).get("name");
			Geometry geometry = FeatureValues.geometry(collection, feature);
			html.append("<tr><td><a href=\"")
					.append(esc(links.url("/collections/" + LinkFactory.encode(collection.id()) + "/items/"
							+ LinkFactory.encode(id) + "?f=html")))
					.append("\">").append(esc(id)).append("</a></td><td>").append(esc(feature.eClass().getName()))
					.append("</td><td>").append(esc(name == null ? "" : name.toString())).append("</td><td>")
					.append(geometry == null ? "" : esc(Geometries.typeName(geometry))).append("</td></tr>");
		}
		html.append("</table>");
		pager(pageLinks);
		return close();
	}

	HtmlEncoder feature(CollectionDescriptor collection, EObject feature, List<Link> featureLinks) {
		String id = FeatureValues.id(collection, feature);
		open(id, "Collections", "/collections?f=html",
				collection.title(), "/collections/" + LinkFactory.encode(collection.id()) + "/items?f=html", id, "");
		h1(id);
		html.append("<table><tr><th>Feature type</th><td>").append(esc(feature.eClass().getName())).append("</td></tr>");
		Geometry geometry = FeatureValues.geometry(collection, feature);
		if (geometry != null) {
			Envelope e = Geometries.envelope(geometry);
			html.append("<tr><th>Geometry</th><td>").append(esc(Geometries.typeName(geometry)))
					.append(e == null ? "" : " — " + extent(e)).append("</td></tr>");
		}
		for (Map.Entry<String, Object> property : FeatureValues.properties(collection, feature).entrySet()) {
			boolean number = property.getValue() instanceof Number;
			html.append("<tr><th>").append(esc(property.getKey())).append("</th><td").append(number ? " class=\"num\"" : "")
					.append(">").append(esc(String.valueOf(property.getValue()))).append("</td></tr>");
		}
		html.append("</table>");
		linkList(featureLinks);
		return close();
	}

	HtmlEncoder api(String title) {
		open("API", "API", "");
		h1(title + " — API");
		html.append("<p>The API is described by an <a href=\"").append(esc(links.url("/api?f=json")))
				.append("\">OpenAPI 3.0 document</a>. Open it in any OpenAPI tool, e.g. the Swagger editor.</p>");
		return close();
	}

	HtmlEncoder exception(RequestException e) {
		open("Error");
		h1("Error " + e.status());
		html.append("<p><code>").append(esc(e.code())).append("</code> — ").append(esc(e.getMessage())).append("</p>");
		return close();
	}

	/**
	 * @param crumbs pairs of label and path below the base URL; an empty path marks the current page
	 */
	private void open(String title, String... crumbs) {
		html.append("<!doctype html><html lang=\"en\"><head><meta charset=\"utf-8\">")
				.append("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\"><title>")
				.append(esc(title)).append("</title><style>").append(STYLE).append("</style></head><body><header>")
				.append("<a href=\"").append(esc(links.url("/?f=html"))).append("\">Home</a>");
		for (int i = 0; i + 1 < crumbs.length; i += 2) {
			html.append(" / ");
			if (crumbs[i + 1].isEmpty()) {
				html.append("<span>").append(esc(crumbs[i])).append("</span>");
			} else {
				html.append("<a href=\"").append(esc(links.url(crumbs[i + 1]))).append("\">").append(esc(crumbs[i]))
						.append("</a>");
			}
		}
		html.append("</header><main>");
	}

	private HtmlEncoder close() {
		html.append("</main></body></html>");
		return this;
	}

	private void h1(String title) {
		html.append("<h1>").append(esc(title)).append("</h1>");
	}

	private void pager(List<Link> pageLinks) {
		html.append("<p class=\"pager\">");
		for (Link link : pageLinks) {
			if ("prev".equals(link.rel()) || "next".equals(link.rel())) {
				html.append("<a href=\"").append(esc(link.href())).append("\">")
						.append("prev".equals(link.rel()) ? "&larr; previous" : "next &rarr;").append("</a>");
			}
		}
		html.append("</p>");
	}

	private void linkList(List<Link> pageLinks) {
		html.append("<h2>Links</h2><ul class=\"links\">");
		for (Link link : pageLinks) {
			html.append("<li><a href=\"").append(esc(link.href())).append("\">")
					.append(esc(link.title() == null ? link.href() : link.title())).append("</a> <span class=\"muted\">")
					.append(esc(link.rel())).append(link.type() == null ? "" : ", " + esc(link.type()))
					.append("</span></li>");
		}
		html.append("</ul>");
	}

	private static String extent(Envelope e) {
		return String.format(Locale.ROOT, "%.5f, %.5f, %.5f, %.5f", e.minX(), e.minY(), e.maxX(), e.maxY());
	}

	static String esc(String text) {
		StringBuilder out = new StringBuilder(text.length());
		for (char c : text.toCharArray()) {
			switch (c) {
			case '<' -> out.append("&lt;");
			case '>' -> out.append("&gt;");
			case '&' -> out.append("&amp;");
			case '"' -> out.append("&quot;");
			case '\'' -> out.append("&#39;");
			default -> out.append(c);
			}
		}
		return out.toString();
	}
}
