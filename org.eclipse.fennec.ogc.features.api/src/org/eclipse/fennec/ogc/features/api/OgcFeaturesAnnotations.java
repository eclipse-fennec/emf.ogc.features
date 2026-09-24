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
package org.eclipse.fennec.ogc.features.api;

/**
 * The EAnnotation that turns an EClass into an OGC API Features collection.
 * <p>
 * Keys are looked up on the EClass first and then along its super types, so an abstract
 * base class can declare the geometry, bbox and temporal attributes once while each
 * concrete subclass only names its collection:
 *
 * <pre>
 * &lt;eAnnotations source="https://eclipse.org/fennec/ogc/features"&gt;
 *   &lt;details key="collection" value="true"/&gt;
 *   &lt;details key="id" value="pools"/&gt;
 *   &lt;details key="title" value="Pools"/&gt;
 *   &lt;details key="geometry" value="geometry"/&gt;
 *   &lt;details key="bbox" value="minX,minY,maxX,maxY"/&gt;
 * &lt;/eAnnotations&gt;
 * </pre>
 */
public final class OgcFeaturesAnnotations {

	/** the annotation source */
	public static final String SOURCE = "https://eclipse.org/fennec/ogc/features";

	/** {@code true} publishes the EClass as a collection; not inherited */
	public static final String COLLECTION = "collection";
	/** the collection id used in the URL; not inherited, defaults to the EClass name */
	public static final String ID = "id";
	/** human readable title; not inherited, defaults to the EClass name */
	public static final String TITLE = "title";
	/** human readable description; not inherited */
	public static final String DESCRIPTION = "description";
	/** name of the attribute holding the geometry ({@code org.geojson.Geometry} instance class) */
	public static final String GEOMETRY = "geometry";
	/** four attribute names {@code minX,minY,maxX,maxY} holding the persisted bounding box */
	public static final String BBOX = "bbox";
	/** name of the date/time attribute a {@code datetime} parameter filters on */
	public static final String TEMPORAL = "temporal";
	/** name of the attribute used as feature id, defaults to the EClass' ID attribute */
	public static final String ID_ATTRIBUTE = "idAttribute";
	/** group of layers a viewer shows the collection in */
	public static final String LAYER_GROUP = "layerGroup";
	/** display style for a viewer, a CSS color or a JSON object */
	public static final String STYLE = "style";

	private OgcFeaturesAnnotations() {
	}
}
