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
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * A MongoDB 7 container started through the docker or podman CLI for the #14 experiment,
 * shared by the run and removed when the JVM exits. A test class using it is skipped when
 * no container runtime is available.
 */
final class MongoContainer {

	/** starts the container before the configurations of a test class are applied */
	static final class Extension implements BeforeAllCallback {

		@Override
		public void beforeAll(ExtensionContext context) {
			try {
				get();
			} catch (IllegalStateException e) {
				Assumptions.abort("No MongoDB container: " + e.getMessage());
			}
		}
	}

	private static MongoContainer instance;

	final int port;
	private final String cli;
	private final String id;

	private MongoContainer(String cli, int port, String id) {
		this.cli = cli;
		this.port = port;
		this.id = id;
	}

	static synchronized MongoContainer get() {
		if (instance == null) {
			String cli = System.getProperty("ogc.test.container.cli", "docker");
			int port = Integer.getInteger("ogc.test.mongo.port", 55437);
			String image = System.getProperty("ogc.test.mongo.image", "docker.io/library/mongo:7");
			String id = exec(cli, "run", "-d", "--rm", "-p", "127.0.0.1:" + port + ":27017", image).trim();
			MongoContainer container = new MongoContainer(cli, port, id);
			Runtime.getRuntime().addShutdownHook(new Thread(container::stop));
			container.awaitReady();
			instance = container;
		}
		return instance;
	}

	private void awaitReady() {
		long deadline = System.currentTimeMillis() + 60_000;
		while (System.currentTimeMillis() < deadline) {
			try (Socket socket = new Socket()) {
				socket.connect(new InetSocketAddress("127.0.0.1", port), 1000);
				return;
			} catch (IOException e) {
				sleep();
			}
		}
		stop();
		throw new IllegalStateException("MongoDB did not become ready in container " + id);
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
