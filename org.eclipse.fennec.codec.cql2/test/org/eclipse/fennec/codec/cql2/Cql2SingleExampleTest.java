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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Test;

import net.opengis.cql2.Like;
import net.opengis.cql2.Predicate;
import net.opengis.cql2.PropertyRef;
import net.opengis.cql2.StringLiteral;

/** The first step: one example through both encodings. */
class Cql2SingleExampleTest {

	@Test
	void likeInTextAndJson() throws Exception {
		Predicate text = Cql2Text.parse("owner LIKE 'Mike%'");
		assertThat(text).isInstanceOf(Like.class);
		assertThat(((PropertyRef) ((Like) text).getArgs().get(0)).getProperty()).isEqualTo("owner");
		assertThat(((StringLiteral) ((Like) text).getArgs().get(1)).getValue()).isEqualTo("Mike%");

		Resource json = Cql2ResourceFactories.json().createResource(URI.createURI("example12.cql2json"));
		json.load(new ByteArrayInputStream("""
				{ "op": "like", "args": [ { "property": "owner" }, "Mike%" ] }
				""".getBytes(StandardCharsets.UTF_8)), null);
		assertThat(json.getErrors()).isEmpty();
		EObject fromJson = json.getContents().get(0);
		assertThat(EcoreUtil.equals(fromJson, text)).as("text and JSON give the same model").isTrue();
	}

	@Test
	void writeJson() throws Exception {
		Resource json = Cql2ResourceFactories.json().createResource(URI.createURI("out.cql2json"));
		json.getContents().add(Cql2Text.parse("owner LIKE 'Mike%'"));
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		json.save(out, null);
		String written = out.toString(StandardCharsets.UTF_8);
		assertThat(written.replaceAll("\\s", "")).isEqualTo("""
				{"op":"like","args":[{"property":"owner"},"Mike%"]}""");
	}
}
