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

import java.util.Locale;

/**
 * An axis aligned bounding box in CRS84 (x = longitude, y = latitude).
 *
 * @param minX western edge
 * @param minY southern edge
 * @param maxX eastern edge
 * @param maxY northern edge
 */
public record Envelope(double minX, double minY, double maxX, double maxY) {

	/** the whole world in CRS84 */
	public static final Envelope WORLD = new Envelope(-180, -90, 180, 90);

	/**
	 * @throws IllegalArgumentException if a coordinate is not finite or min exceeds max
	 */
	public Envelope {
		if (!Double.isFinite(minX) || !Double.isFinite(minY) || !Double.isFinite(maxX) || !Double.isFinite(maxY)) {
			throw new IllegalArgumentException("Envelope coordinates must be finite");
		}
		if (minX > maxX || minY > maxY) {
			throw new IllegalArgumentException(String.format(Locale.ROOT,
					"Envelope min exceeds max: %s,%s,%s,%s", minX, minY, maxX, maxY));
		}
	}

	/**
	 * Parses the OGC {@code bbox} parameter {@code minX,minY,maxX,maxY}. The six value form
	 * with heights is accepted and the heights are ignored.
	 *
	 * @param bbox the parameter value
	 * @return the envelope
	 * @throws IllegalArgumentException if the value is not a valid bbox
	 */
	public static Envelope parse(String bbox) {
		if (bbox == null || bbox.isBlank()) {
			throw new IllegalArgumentException("bbox must not be empty");
		}
		String[] parts = bbox.split(",");
		double[] v = new double[parts.length];
		try {
			for (int i = 0; i < parts.length; i++) {
				v[i] = Double.parseDouble(parts[i].trim());
			}
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("bbox must contain numbers: " + bbox, e);
		}
		return switch (v.length) {
		case 4 -> new Envelope(v[0], v[1], v[2], v[3]);
		case 6 -> new Envelope(v[0], v[1], v[3], v[4]);
		default -> throw new IllegalArgumentException("bbox must have 4 or 6 values: " + bbox);
		};
	}

	/**
	 * @param other the other envelope
	 * @return {@code true} if both envelopes share at least one point
	 */
	public boolean intersects(Envelope other) {
		return minX <= other.maxX && maxX >= other.minX && minY <= other.maxY && maxY >= other.minY;
	}

	/**
	 * @param other the other envelope
	 * @return the smallest envelope containing both
	 */
	public Envelope union(Envelope other) {
		return new Envelope(Math.min(minX, other.minX), Math.min(minY, other.minY),
				Math.max(maxX, other.maxX), Math.max(maxY, other.maxY));
	}

	/**
	 * @return {@code true} if the envelope has no extent, i.e. describes a single point
	 */
	public boolean isPoint() {
		return minX == maxX && minY == maxY;
	}
}
