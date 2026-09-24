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
package org.eclipse.fennec.ogc.features.viewer;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.servlet.whiteboard.propertytypes.HttpWhiteboardServletName;
import org.osgi.service.servlet.whiteboard.propertytypes.HttpWhiteboardServletPattern;

import jakarta.servlet.Servlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Serves the map viewer from the bundle's {@code web} folder under {@code /ogc/viewer}.
 * <p>
 * A servlet rather than a whiteboard resource, so that the ES modules of MapLibre get the
 * JavaScript media type browsers insist on, and {@code /ogc/viewer/} gets the index page.
 */
@Component(service = Servlet.class)
@HttpWhiteboardServletName("fennec-ogc-features-viewer")
@HttpWhiteboardServletPattern({ "/ogc/viewer", "/ogc/viewer/*" })
public class ViewerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Map<String, String> TYPES = Map.of(
			"html", "text/html;charset=utf-8",
			"js", "text/javascript;charset=utf-8",
			"mjs", "text/javascript;charset=utf-8",
			"css", "text/css;charset=utf-8",
			"svg", "image/svg+xml",
			"png", "image/png",
			"txt", "text/plain;charset=utf-8");

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		if (path == null) {
			// without the trailing slash the relative URLs of the page would resolve one level too high
			response.sendRedirect(request.getRequestURI() + "/");
			return;
		}
		if (path.equals("/")) {
			path = "/index.html";
		}
		if (path.contains("..")) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		String extension = path.substring(path.lastIndexOf('.') + 1);
		String type = TYPES.get(extension);
		try (InputStream in = type == null ? null : ViewerServlet.class.getResourceAsStream("/web" + path)) {
			if (in == null) {
				response.sendError(HttpServletResponse.SC_NOT_FOUND);
				return;
			}
			response.setContentType(type);
			response.setHeader("Cache-Control", path.startsWith("/maplibre/") ? "max-age=86400" : "no-cache");
			in.transferTo(response.getOutputStream());
		}
	}
}
