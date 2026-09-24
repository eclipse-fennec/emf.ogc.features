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

import static org.junit.jupiter.api.Assumptions.abort;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * The examples of the CQL2 specification, downloaded from the OGC schema repository on first
 * use and kept under generated/. They are not part of this repository; without network access
 * the tests using them are skipped.
 */
final class SpecExamples {

	/** the published schema, BNF and examples of CQL2 1.0.0 */
	static final URI ZIP = URI.create("https://schemas.opengis.net/cql2/cql2-1_0_0.zip");
	private static final Path TARGET = Path.of("generated", "cql2-spec");

	private SpecExamples() {
	}

	/**
	 * @return the examples directory with the subdirectories json and text
	 */
	static synchronized Path directory() {
		Path examples = TARGET.resolve("cql2/1.0.0/examples");
		if (Files.isDirectory(examples.resolve("text"))) {
			return examples;
		}
		try {
			download();
		} catch (IOException | InterruptedException e) {
			abort("The CQL2 specification examples are not available from " + ZIP + ": " + e);
		}
		return examples;
	}

	private static void download() throws IOException, InterruptedException {
		HttpClient client = HttpClient.newBuilder().followRedirects(HttpClient.Redirect.NORMAL)
				.connectTimeout(Duration.ofSeconds(20)).build();
		HttpResponse<InputStream> response = client.send(HttpRequest.newBuilder(ZIP).timeout(Duration.ofSeconds(60)).build(),
				HttpResponse.BodyHandlers.ofInputStream());
		if (response.statusCode() != 200) {
			throw new IOException("HTTP " + response.statusCode());
		}
		Path root = TARGET.toAbsolutePath().normalize();
		try (ZipInputStream zip = new ZipInputStream(response.body())) {
			for (ZipEntry entry = zip.getNextEntry(); entry != null; entry = zip.getNextEntry()) {
				Path file = root.resolve(entry.getName()).normalize();
				if (!file.startsWith(root)) {
					throw new IOException("Entry outside the target: " + entry.getName());
				}
				if (entry.isDirectory()) {
					Files.createDirectories(file);
				} else {
					Files.createDirectories(file.getParent());
					Files.copy(zip, file, StandardCopyOption.REPLACE_EXISTING);
				}
			}
		}
	}
}
