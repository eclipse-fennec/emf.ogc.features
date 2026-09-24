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
package org.qgis.project.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.qgis.project.Project;
import org.qgis.project.util.QgisResourceFactoryImpl;

/**
 * Writes and reads QGIS project files ({@code .qgs}) as QGIS expects them: UTF-8, no namespace
 * and no schema location.
 */
public final class QgisProjectFiles {

	private static final Map<Object, Object> SAVE_OPTIONS = Map.of(
			XMLResource.OPTION_ENCODING, "UTF-8",
			XMLResource.OPTION_SCHEMA_LOCATION, Boolean.FALSE);

	private QgisProjectFiles() {
	}

	/**
	 * @param project the project
	 * @param out receives the project file
	 * @throws IOException if writing fails
	 */
	public static void write(Project project, OutputStream out) throws IOException {
		Resource resource = new QgisResourceFactoryImpl().createResource(URI.createURI("project.qgs"));
		resource.getContents().add(project);
		try {
			resource.save(out, SAVE_OPTIONS);
		} finally {
			// the project stays usable outside the resource
			resource.getContents().clear();
		}
	}

	/**
	 * @param in a project file
	 * @return the project, with the parts the model covers
	 * @throws IOException if reading fails or the file is no QGIS project
	 */
	public static Project read(InputStream in) throws IOException {
		Resource resource = new QgisResourceFactoryImpl().createResource(URI.createURI("project.qgs"));
		resource.load(in, Map.of(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE));
		if (resource.getContents().isEmpty() || !(resource.getContents().get(0) instanceof Project project)) {
			throw new IOException("Not a QGIS project");
		}
		return project;
	}
}
