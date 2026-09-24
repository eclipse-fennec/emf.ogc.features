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

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.fennec.codec.geojson.GeoJsonResourceFactoryImpl;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.Envelope;
import org.eclipse.fennec.ogc.features.example.bath.BathPackage;
import org.eclipse.fennec.ogc.features.example.bath.ParkingLot;
import org.eclipse.fennec.ogc.features.example.bath.Paving;
import org.eclipse.fennec.ogc.features.example.bath.Pool;
import org.eclipse.fennec.ogc.features.example.bath.PoolType;
import org.eclipse.fennec.ogc.features.example.bath.Shower;
import org.eclipse.fennec.ogc.features.example.bath.Slide;
import org.eclipse.fennec.ogc.features.example.city.CityPackage;
import org.eclipse.fennec.ogc.features.example.city.Flaeche;
import org.eclipse.fennec.ogc.features.example.city.Gebaeude;
import org.eclipse.fennec.ogc.features.example.city.Nutzung;
import org.eclipse.fennec.ogc.features.example.city.Ort;
import org.eclipse.fennec.ogc.features.example.city.Stadtgebiet;
import org.eclipse.fennec.ogc.features.example.city.Strasse;
import org.eclipse.fennec.ogc.features.example.city.Strassenklasse;
import org.eclipse.fennec.ogc.features.geo.GeoJsonFeatureImporter;
import org.eclipse.fennec.ogc.features.geo.GeoJsonText;
import org.eclipse.fennec.ogc.features.geo.Geometries;
import org.eclipse.fennec.ogc.features.geo.JtsGeometries;
import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.LineString;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.Polygon;

/** The demo data fits the models: the WOGE and the town it stands in. */
class DemoDataTest {

	private static final GeoJsonText TEXT = new GeoJsonText(new GeoJsonResourceFactoryImpl());
	private static final List<String> STYLE = List.of("fill", "fill-opacity", "stroke", "stroke-width", "stroke-dasharray",
			"marker-color");

	private static List<EObject> read(EPackage ePackage, String file, EClass type) throws IOException {
		GeoJsonFeatureImporter importer = new GeoJsonFeatureImporter(TEXT, ePackage, "assetType").ignoring(STYLE);
		try (InputStream in = Files.newInputStream(Path.of("data", file))) {
			return importer.read(in, type);
		}
	}

	@Test
	void woge() throws IOException {
		List<EObject> assets = read(BathPackage.eINSTANCE, "woge.geojson", null);
		assertThat(assets).hasSize(82);
		Pool wave = find(assets, Pool.class, "woge-wave");
		assertThat(wave.getPoolType()).isEqualTo(PoolType.WAVE);
		assertThat(wave.getWaterTemperature()).isEqualTo(28.0);
		assertThat(find(assets, Pool.class, "woge-sole").getPoolType()).isEqualTo(PoolType.SOLE);
		assertThat(find(assets, Slide.class, "woge-blauer-blitz").getLength()).isEqualTo(120.0);
		ParkingLot parking = find(assets, ParkingLot.class, "woge-parking");
		assertThat(parking.getSpaces()).isEqualTo(350);
		assertThat(parking.getFreeHours()).isEqualTo(4);
	}

	@Test
	void slidesEndInAPool() throws IOException {
		List<EObject> assets = read(BathPackage.eINSTANCE, "woge.geojson", null);
		for (String slide : List.of("woge-blauer-blitz", "woge-mini-slide")) {
			Geometry line = JtsGeometries.toJts(find(assets, Slide.class, slide).getGeometry());
			Point end = ((LineString) line).getEndPoint();
			assertThat(assets.stream().filter(Pool.class::isInstance).map(p -> JtsGeometries.toJts(((Pool) p).getGeometry())))
					.as(slide + " ends in a pool").anyMatch(pool -> pool.contains(end));
		}
	}

	@Test
	void everyPoolHasASurroundAndShowers() throws IOException {
		List<EObject> assets = read(BathPackage.eINSTANCE, "woge.geojson", null);
		List<Pool> pools = assets.stream().filter(Pool.class::isInstance).map(Pool.class::cast).toList();
		assertThat(pools).hasSize(5);
		for (Pool pool : pools) {
			Paving surround = find(assets, Paving.class, pool.getId() + "-surround");
			Polygon ring = (Polygon) JtsGeometries.toJts(surround.getGeometry());
			assertThat(ring.getNumInteriorRing()).as("the pool is the hole of its surround").isEqualTo(1);
			assertThat(ring.intersection(JtsGeometries.toJts(pool.getGeometry())).getArea()).isLessThan(0.01);
			Geometry near = JtsGeometries.toJts(surround.getGeometry()).buffer(0.00005);
			assertThat(assets.stream().filter(Shower.class::isInstance).map(s -> JtsGeometries.toJts(((Shower) s).getGeometry())))
					.as("showers at " + pool.getName()).anyMatch(near::covers);
		}
	}

	@Test
	void town() throws IOException {
		assertThat(read(CityPackage.eINSTANCE, "city/stadtteile.geojson", CityPackage.Literals.STADTTEIL)).hasSize(10);
		// the 52 places of the generator plus the WOGE
		assertThat(read(CityPackage.eINSTANCE, "city/orte.geojson", CityPackage.Literals.ORT)).hasSize(53)
				.anyMatch(o -> "Freizeitbad WOGE".equals(((Ort) o).getName()) && "Freizeitbad".equals(((Ort) o).getKategorie()));
		assertThat(read(CityPackage.eINSTANCE, "city/gebaeude.geojson", CityPackage.Literals.GEBAEUDE)).hasSize(5954)
				.allMatch(o -> ((Gebaeude) o).getHoeheM() > 0 && ((Gebaeude) o).getColor() != null);

		List<EObject> town = read(CityPackage.eINSTANCE, "city/dim_stadt.geojson", CityPackage.Literals.STADTGEBIET);
		Stadtgebiet boundary = (Stadtgebiet) town.get(0);
		assertThat(boundary.getNachbarorte()).isEqualTo("Heldrungen, Braunsroda, Reinsdorf, Gehofen, Nausitz");
		assertThat(boundary.getFlaecheKm2()).isEqualTo(14.62);
		assertThat(boundary.getColor()).isEqualTo("#b3261e");

		List<EObject> areas = read(CityPackage.eINSTANCE, "city/flaechen.geojson", CityPackage.Literals.FLAECHE);
		assertThat(areas).hasSize(635).anyMatch(o -> ((Flaeche) o).getNutzung() == Nutzung.KLEINGAERTEN);
		List<EObject> streets = read(CityPackage.eINSTANCE, "city/strassen.geojson", CityPackage.Literals.STRASSE);
		assertThat(streets).hasSize(162).anyMatch(o -> ((Strasse) o).getKlasse() == Strassenklasse.HAUPTSTRASSE);
	}

	@Test
	void wogeStandsInTheTownFreeOfBuildings() throws IOException {
		CollectionDescriptor site = CollectionDescriptor.of(BathPackage.Literals.SITE_BOUNDARY).orElseThrow();
		Envelope woge = read(BathPackage.eINSTANCE, "woge.geojson", null).stream()
				.filter(o -> o.eClass() == BathPackage.Literals.SITE_BOUNDARY)
				.map(o -> site.bbox().read(o).orElseThrow()).findFirst().orElseThrow();
		Envelope town = Geometries.envelope(((Stadtgebiet) read(CityPackage.eINSTANCE, "city/dim_stadt.geojson",
				CityPackage.Literals.STADTGEBIET).get(0)).getGeometry());
		assertThat(town.union(woge)).as("inside the town").isEqualTo(town);
		assertThat(read(CityPackage.eINSTANCE, "city/gebaeude.geojson", CityPackage.Literals.GEBAEUDE))
				.noneMatch(o -> Geometries.envelope(((Gebaeude) o).getGeometry()).intersects(woge));
	}

	private static <T extends EObject> T find(List<EObject> objects, Class<T> type, String id) {
		return objects.stream().filter(type::isInstance).map(type::cast)
				.filter(o -> id.equals(o.eGet(o.eClass().getEIDAttribute()))).findFirst().orElseThrow();
	}
}
