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

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.fennec.ogc.features.api.FilterLanguage;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import net.opengis.cql2.Predicate;

/**
 * {@code filter-lang=cql2-json}
 */
@Component
public class Cql2JsonLanguage implements FilterLanguage {

	private final Resource.Factory factory;

	/**
	 * @param factory the resource factory of the CQL2 JSON encoding
	 */
	@Activate
	public Cql2JsonLanguage(@Reference(target = "(emf.configuratorName=cql2-json)") Resource.Factory factory) {
		this.factory = factory;
	}

	@Override
	public String name() {
		return "cql2-json";
	}

	@Override
	public Predicate parse(String filter) {
		return Cql2Languages.parse(factory, "filter.cql2json", filter);
	}

	@Override
	public List<String> conformanceClasses() {
		List<String> classes = new ArrayList<>(Cql2Languages.SHARED);
		classes.add("http://www.opengis.net/spec/cql2/1.0/conf/cql2-json");
		return classes;
	}
}
