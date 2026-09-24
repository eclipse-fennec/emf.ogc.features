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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.FeatureFilter;
import org.eclipse.fennec.ogc.features.api.FilterLanguage;
import org.eclipse.fennec.ogc.features.cql2.Cql2TextParser;
import org.eclipse.fennec.ogc.features.cql2.Cql2Translator;
import org.osgi.service.component.annotations.Component;

/**
 * {@code filter-lang=cql2-text}
 */
@Component
public class Cql2TextLanguage implements FilterLanguage {

	@Override
	public String name() {
		return "cql2-text";
	}

	@Override
	public FeatureFilter parse(String filter, CollectionDescriptor collection) {
		return Cql2Translator.translate(Cql2TextParser.parse(filter), collection);
	}

	@Override
	public List<String> conformanceClasses() {
		List<String> classes = new ArrayList<>(Cql2Languages.SHARED);
		classes.add("http://www.opengis.net/spec/cql2/1.0/conf/cql2-text");
		return classes;
	}
}
