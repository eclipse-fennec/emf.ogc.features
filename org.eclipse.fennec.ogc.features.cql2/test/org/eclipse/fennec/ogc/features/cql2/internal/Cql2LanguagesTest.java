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
package org.eclipse.fennec.ogc.features.cql2.internal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.eclipse.fennec.codec.cql2.Cql2ResourceFactories;
import org.junit.jupiter.api.Test;

import net.opengis.cql2.Like;

class Cql2LanguagesTest {

	@Test
	void textAndJson() {
		assertThat(new Cql2TextLanguage(Cql2ResourceFactories.text()).parse("owner LIKE 'Mike%'")).isInstanceOf(Like.class);
		assertThat(new Cql2JsonLanguage(Cql2ResourceFactories.json()).parse("""
				{"op":"like","args":[{"property":"owner"},"Mike%"]}""")).isInstanceOf(Like.class);
	}

	@Test
	void invalidFilterNamesTheProblem() {
		assertThatThrownBy(() -> new Cql2TextLanguage(Cql2ResourceFactories.text()).parse("owner LIKE"))
				.isInstanceOf(IllegalArgumentException.class).hasMessageContaining("CQL2 syntax error");
		assertThatThrownBy(() -> new Cql2JsonLanguage(Cql2ResourceFactories.json()).parse("{\"op\":\"like\""))
				.isInstanceOf(IllegalArgumentException.class);
	}
}
