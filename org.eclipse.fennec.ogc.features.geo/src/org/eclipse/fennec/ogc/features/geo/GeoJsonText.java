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
package org.eclipse.fennec.ogc.features.geo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.fennec.codec.geojson.GeoJsonResourceFactoryImpl;
import org.geojson.Geometry;

/**
 * Reads and writes GeoJSON EMF geometries as GeoJSON text, through a GeoJSON resource
 * factory (the Fennec GeoJSON codec in practice).
 */
public final class GeoJsonText {

	private static final URI URI_ = URI.createURI("geometry.geojson");

	private static volatile GeoJsonText standalone;

	private final Resource.Factory factory;

	/**
	 * @param factory the factory creating GeoJSON resources
	 */
	public GeoJsonText(Resource.Factory factory) {
		this.factory = Objects.requireNonNull(factory, "factory");
	}

	/**
	 * An instance over a GeoJSON codec of its own, for code that cannot get the OSGi
	 * service, such as the string conversion of a generated EMF factory.
	 *
	 * @return the shared standalone instance
	 */
	public static GeoJsonText standalone() {
		GeoJsonText instance = standalone;
		if (instance == null) {
			synchronized (GeoJsonText.class) {
				instance = standalone;
				if (instance == null) {
					instance = new GeoJsonText(new GeoJsonResourceFactoryImpl());
					standalone = instance;
				}
			}
		}
		return instance;
	}

	/**
	 * @param geometry the geometry
	 * @return its GeoJSON text
	 * @throws UncheckedIOException if serialization fails
	 */
	public String write(Geometry geometry) {
		Resource resource = factory.createResource(URI_);
		resource.getContents().add(geometry);
		try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {
			resource.save(out, null);
			return out.toString(StandardCharsets.UTF_8);
		} catch (IOException e) {
			throw new UncheckedIOException("Cannot write geometry as GeoJSON", e);
		} finally {
			// give the geometry back, it belongs to the feature and not to the scratch resource
			resource.getContents().clear();
		}
	}

	/**
	 * @param text GeoJSON text of a geometry
	 * @return the geometry, {@code null} for blank text
	 * @throws IllegalArgumentException if the text is no GeoJSON geometry
	 */
	public Geometry read(String text) {
		if (text == null || text.isBlank()) {
			return null;
		}
		Resource resource = factory.createResource(URI_);
		try (ByteArrayInputStream in = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8))) {
			resource.load(in, null);
		} catch (IOException | RuntimeException e) {
			// the codec lets parser exceptions escape unchecked instead of as IOException
			throw new IllegalArgumentException("Invalid GeoJSON: " + e.getMessage(), e);
		}
		if (!resource.getErrors().isEmpty()) {
			throw new IllegalArgumentException("Invalid GeoJSON: " + resource.getErrors().get(0).getMessage());
		}
		if (resource.getContents().isEmpty()) {
			return null;
		}
		EObject root = resource.getContents().get(0);
		if (root instanceof Geometry geometry) {
			resource.getContents().clear();
			return geometry;
		}
		throw new IllegalArgumentException("GeoJSON is no geometry but a " + root.eClass().getName());
	}
}
