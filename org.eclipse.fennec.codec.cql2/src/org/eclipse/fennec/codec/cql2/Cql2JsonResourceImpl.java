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
package org.eclipse.fennec.codec.cql2;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.fennec.codec.config.ConfigurationResolver;
import org.eclipse.fennec.codec.constants.CodecOptions;
import org.eclipse.fennec.codec.resource.CodecResource;
import org.eclipse.fennec.codec.value.CodecValueRegistry;
import org.eclipse.fennec.emf.osgi.metadata.MetadataService;
import net.opengis.cql2.Cql2Package;
import org.eclipse.fennec.codec.cql2.internal.ArgsValueReader;
import org.eclipse.fennec.codec.cql2.internal.ArgsValueWriter;
import org.geojson.GeoJsonPackage;

/**
 * The CQL2 JSON encoding ({@value Cql2MediaTypes#JSON}) as codec resource: the root is an
 * operation, whose class the codec resolves from its {@code op} through the discriminator
 * mapping of the CQL2 model; the arguments go through {@link ArgsValueReader} and
 * {@link ArgsValueWriter}.
 */
public class Cql2JsonResourceImpl extends CodecResource {

	/**
	 * @param uri the resource URI
	 * @param metadataService a metadata service knowing the CQL2 package
	 */
	public Cql2JsonResourceImpl(URI uri, MetadataService metadataService) {
		super(uri, metadataService, resolver(), values(), null);
	}

	private static ConfigurationResolver resolver() {
		// the GeoJSON geometries of the arguments: a closed type mapping on Geometry, since the
		// simple names resolve in the cql2 package otherwise (eclipse-fennec/emf.codec#244)
		Map<String, Object> typeKey = Map.of(CodecOptions.CODEC_TYPE_KEY, "type");
		Map<String, EClass> geometries = new HashMap<>();
		Map<EClass, Map<String, Object>> classes = new HashMap<>();
		List<EStructuralFeature> volatiles = new ArrayList<>();
		for (EClassifier classifier : GeoJsonPackage.eINSTANCE.getEClassifiers()) {
			if (classifier instanceof EClass eClass) {
				classes.put(eClass, typeKey);
				if (!eClass.isAbstract() && GeoJsonPackage.Literals.GEOMETRY.isSuperTypeOf(eClass)) {
					geometries.put(eClass.getName(), eClass);
				}
				for (String name : List.of("data", "bbox")) {
					EStructuralFeature feature = eClass.getEStructuralFeature(name);
					if (feature != null && feature.isVolatile()) {
						volatiles.add(feature);
					}
				}
			}
		}
		classes.put(GeoJsonPackage.Literals.GEOMETRY, Map.of(
				CodecOptions.CODEC_TYPE_KEY, "type",
				CodecOptions.CODEC_TYPE_MAP_ID, "geojson",
				CodecOptions.CODEC_TYPE_DISCRIMINATOR_PATH, "type",
				CodecOptions.CODEC_TYPE_MAPPINGS, geometries,
				CodecOptions.CODEC_FALLBACK_STRATEGY, "ERROR"));
		return ConfigurationResolver.builder()
				.resourceProperties(Map.of(CodecOptions.CODEC_ECLASS_CONFIG, classes))
				.useId(false)
				.useNamesFromExtendedMetaData(true)
				.forceRead(volatiles.toArray(new EStructuralFeature[0]))
				.build();
	}

	private static CodecValueRegistry values() {
		return new CodecValueRegistry().register(new ArgsValueReader()).register(new ArgsValueWriter());
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		Map<Object, Object> effective = new HashMap<>();
		if (options != null) {
			effective.putAll(options);
		}
		effective.putIfAbsent(CodecOptions.CODEC_ROOT_TYPE, Cql2Package.Literals.OPERATION);
		super.doLoad(inputStream, effective);
	}
}
