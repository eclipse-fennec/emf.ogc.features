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

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assumptions.abort;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import net.opengis.cql2.Predicate;

/**
 * The examples of the CQL2 specification (OGC 21-065r2, see {@link SpecExamples}): every text example against its JSON
 * counterpart, and both written and read again. Examples outside the supported subset are
 * skipped with the parser's message.
 */
class Cql2SpecExamplesTest {


	/** the examples of the supported subset; fewer means the grammar lost something */
	private static final int SUPPORTED = 68;
	private static final AtomicInteger passed = new AtomicInteger();

	@AfterAll
	static void noSupportedExampleLost() {
		SpecExamples.directory();
		assertThat(passed).as("examples passed").hasValueGreaterThanOrEqualTo(SUPPORTED);
	}

	@TestFactory
	Stream<DynamicTest> examples() throws IOException {
		return Files.list(SpecExamples.directory().resolve("text")).sorted()
				.map(file -> DynamicTest.dynamicTest(file.getFileName().toString(), () -> check(file)));
	}

	private static void check(Path textFile) throws IOException {
		// example36-alt01.txt is another text form of example36.json
		String name = textFile.getFileName().toString().replaceFirst("(-alt\\d+)?\\.txt$", "");
		String text = Files.readString(textFile);
		byte[] json = Files.readAllBytes(SpecExamples.directory().resolve("json").resolve(name + ".json"));

		Predicate fromText;
		EObject fromJson;
		try {
			fromText = Cql2Text.parse(text);
		} catch (IllegalArgumentException e) {
			abort("text not supported: " + e.getMessage());
			return;
		}
		try {
			fromJson = loadJson(json);
		} catch (IOException e) {
			abort("JSON not supported: " + e.getMessage());
			return;
		}

		assertThat(same(fromJson, fromText)).as("text and JSON give the same model:%n text %s%n json %s", describe(fromText), describe(fromJson)).isTrue();
		assertThat(same(Cql2Text.parse(Cql2Text.write(fromText)), fromText))
				.as("text round trip of %s", Cql2Text.write(fromText)).isTrue();
		byte[] saved = saveJson(fromText);
		assertThat(same(loadJson(saved), fromText)).as("JSON round trip of %s", new String(saved, StandardCharsets.UTF_8)).isTrue();
		passed.incrementAndGet();
	}

	/**
	 * EcoreUtil.equals, but arrays by content: the geojson geometries expose their coordinates a
	 * second time as a volatile, not derived {@code double[]} attribute {@code data}, computed
	 * anew on every access.
	 */
	private static boolean same(EObject a, EObject b) {
		return new EqualityHelper() {
			private static final long serialVersionUID = 1L;

			@Override
			protected boolean haveEqualAttribute(EObject o1, EObject o2, EAttribute attribute) {
				Object v1 = o1.eGet(attribute);
				Object v2 = o2.eGet(attribute);
				if (attribute.getEAttributeType().getInstanceClass().isArray()) {
					// single-valued: an array, many-valued: a list of arrays
					return attribute.isMany() ? Objects.deepEquals(((List<?>) v1).toArray(), ((List<?>) v2).toArray())
							: Objects.deepEquals(v1, v2);
				}
				return super.haveEqualAttribute(o1, o2, attribute);
			}
		}.equals(a, b);
	}

	/** a compact dump of the set features, to see where two models differ */
	private static String describe(EObject object) {
		StringBuilder b = new StringBuilder(object.eClass().getName()).append('{');
		for (EStructuralFeature feature : object.eClass().getEAllStructuralFeatures()) {
			if (object.eIsSet(feature)) {
				Object value = object.eGet(feature);
				b.append(feature.getName()).append('=');
				if (value instanceof EObject child) {
					b.append(describe(child));
				} else if (value instanceof List<?> list) {
					b.append(list.stream().map(v -> v instanceof EObject c ? describe(c) : String.valueOf(v)).toList());
				} else {
					b.append(value);
				}
				b.append(' ');
			}
		}
		return b.append('}').toString();
	}

	private static EObject loadJson(byte[] json) throws IOException {
		Resource resource = Cql2ResourceFactories.json().createResource(URI.createURI("in.cql2json"));
		resource.load(new ByteArrayInputStream(json), null);
		if (!resource.getErrors().isEmpty()) {
			throw new IOException(resource.getErrors().get(0).getMessage());
		}
		return resource.getContents().get(0);
	}

	private static byte[] saveJson(Predicate predicate) throws IOException {
		Resource resource = Cql2ResourceFactories.json().createResource(URI.createURI("out.cql2json"));
		// the predicate itself: EcoreUtil.copy drops -0.0, the generated eIsSet takes it for the default 0.0
		resource.getContents().add(predicate);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		resource.save(out, null);
		return out.toByteArray();
	}
}
