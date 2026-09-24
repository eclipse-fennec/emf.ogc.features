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
package org.eclipse.fennec.ogc.features.example.bath.demo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

import javax.sql.DataSource;

/**
 * Widens generated VARCHAR columns to unbounded text.
 * <p>
 * Fennec persistence maps every String valued attribute to EclipseLink's default
 * VARCHAR(255) and ignores eorm column length, definition and lob. A GeoJSON polygon
 * exceeds that quickly. Until the mapping honours a column definition, the columns are
 * altered after EclipseLink created the schema. Only H2 and PostgreSQL are handled.
 */
public final class TextColumns {

	private TextColumns() {
	}

	/**
	 * Alters every VARCHAR column whose name is one of the given names, in any table, to
	 * unbounded text. Columns that already are unbounded are left alone.
	 *
	 * @param dataSource the database
	 * @param columnNames column names, compared case insensitively
	 * @return the altered columns as {@code table.column}
	 * @throws SQLException if the metadata cannot be read or an ALTER fails
	 */
	public static List<String> widen(DataSource dataSource, Collection<String> columnNames) throws SQLException {
		Set<String> wanted = columnNames.stream().map(n -> n.toUpperCase(Locale.ROOT)).collect(Collectors.toSet());
		List<String> altered = new ArrayList<>();
		try (Connection connection = dataSource.getConnection()) {
			DatabaseMetaData metaData = connection.getMetaData();
			String product = metaData.getDatabaseProductName().toLowerCase(Locale.ROOT);
			List<String[]> columns = new ArrayList<>();
			try (ResultSet rs = metaData.getColumns(connection.getCatalog(), connection.getSchema(), "%", "%")) {
				while (rs.next()) {
					String column = rs.getString("COLUMN_NAME");
					int size = rs.getInt("COLUMN_SIZE");
					if (wanted.contains(column.toUpperCase(Locale.ROOT)) && rs.getInt("DATA_TYPE") == Types.VARCHAR
							&& size > 0 && size < 100_000) {
						columns.add(new String[] { rs.getString("TABLE_NAME"), column });
					}
				}
			}
			try (Statement statement = connection.createStatement()) {
				for (String[] c : columns) {
					statement.execute(alter(product, quote(c[0]), quote(c[1])));
					altered.add(c[0] + "." + c[1]);
				}
			}
		}
		return altered;
	}

	private static String alter(String product, String table, String column) {
		if (product.contains("postgres")) {
			return "ALTER TABLE " + table + " ALTER COLUMN " + column + " TYPE TEXT";
		}
		if (product.contains("h2")) {
			return "ALTER TABLE " + table + " ALTER COLUMN " + column + " SET DATA TYPE VARCHAR(1000000)";
		}
		throw new IllegalStateException("No text column workaround for database " + product);
	}

	private static String quote(String identifier) {
		return '"' + identifier.replace("\"", "\"\"") + '"';
	}
}
