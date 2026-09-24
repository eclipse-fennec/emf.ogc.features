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
package org.eclipse.fennec.ogc.features.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * A PostgreSQL 17 container started through the docker or podman CLI, shared by all test
 * classes of a run and removed when the JVM exits.
 */
final class PostgresContainer {

	/**
	 * Starts the container before the configurations of a test class are applied, if the
	 * run is for PostgreSQL ({@code ogc.test.subprotocol=postgresql}).
	 */
	static final class Extension implements BeforeAllCallback {

		@Override
		public void beforeAll(ExtensionContext context) {
			if ("postgresql".equals(System.getProperty("ogc.test.subprotocol"))) {
				get();
			}
		}
	}

	static final String DB = "ogc";
	static final String USER = "ogc";
	static final String PASSWORD = "ogc";

	private static PostgresContainer instance;

	final String host = "127.0.0.1";
	final int port;
	private final String cli;
	private final String id;

	private PostgresContainer(String cli, int port, String id) {
		this.cli = cli;
		this.port = port;
		this.id = id;
	}

	/**
	 * @return the running container, started on first use
	 * @throws IllegalStateException if it cannot be started or does not become ready
	 */
	static synchronized PostgresContainer get() {
		if (instance == null) {
			String cli = System.getProperty("ogc.test.container.cli", "docker");
			int port = Integer.getInteger("ogc.test.postgres.port", 55432);
			String image = System.getProperty("ogc.test.postgres.image", "docker.io/library/postgres:17");
			String id = exec(cli, "run", "-d", "--rm", "-p", "127.0.0.1:" + port + ":5432",
					"-e", "POSTGRES_DB=" + DB, "-e", "POSTGRES_USER=" + USER, "-e", "POSTGRES_PASSWORD=" + PASSWORD,
					image).trim();
			PostgresContainer container = new PostgresContainer(cli, port, id);
			Runtime.getRuntime().addShutdownHook(new Thread(container::stop));
			container.awaitReady();
			instance = container;
		}
		return instance;
	}

	private void awaitReady() {
		long deadline = System.currentTimeMillis() + 60_000;
		while (System.currentTimeMillis() < deadline) {
			try {
				// the entrypoint restarts the server once after initdb; ask over TCP to see the final one
				exec(cli, "exec", id, "pg_isready", "-h", "127.0.0.1", "-U", USER, "-d", DB);
				return;
			} catch (IllegalStateException e) {
				sleep();
			}
		}
		stop();
		throw new IllegalStateException("PostgreSQL did not become ready in container " + id);
	}

	private void stop() {
		try {
			exec(cli, "rm", "-f", id);
		} catch (RuntimeException e) {
			// best effort, --rm removes it anyway once it stops
		}
	}

	private static void sleep() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new IllegalStateException(e);
		}
	}

	private static String exec(String... command) {
		List<String> cmd = new ArrayList<>(List.of(command));
		try {
			Process process = new ProcessBuilder(cmd).redirectErrorStream(true).start();
			String output = new String(process.getInputStream().readAllBytes());
			if (!process.waitFor(120, TimeUnit.SECONDS) || process.exitValue() != 0) {
				throw new IllegalStateException(String.join(" ", cmd) + " failed: " + output);
			}
			return output;
		} catch (IOException e) {
			throw new IllegalStateException("Cannot run " + cmd.get(0), e);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new IllegalStateException(e);
		}
	}
}
