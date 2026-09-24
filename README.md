# Eclipse Fennec OGC Features

An [OGC API – Features](https://ogcapi.ogc.org/features/) server for EMF models, running
on OSGi and reading its data through [Fennec persistence](https://github.com/eclipse-fennec/emf.persistence-jpa).

An annotated `EClass` becomes a feature collection. Its instances become features, each
with a geometry and properties. The server offers them as GeoJSON and HTML and supports
filtering with CQL2.

> Status: early development. Milestone 1 covers Part 1 (Core, GeoJSON, HTML) and
> Part 3 (Basic CQL2 in text and JSON encoding, plus `S_INTERSECTS`).

## How it fits together

```
HTTP /ogc/*  ──► OgcFeaturesServlet ── JSON | GeoJSON | HTML | OpenAPI
                    ├─ collections  ◄── EPackages annotated with https://eclipse.org/fennec/ogc/features
                    ├─ filter (cql2-text / cql2-json) ──► CQL2 model (EMF resources)
                    │  bbox, datetime, ?property=value ──┘  one CQL2 predicate per request
                    └─ FeatureSource (SPI: FeatureQuery with the CQL2 predicate)
                          ├─ source.persistence: CQL2 → Fennec query IR (JPA: H2, PostgreSQL)
                          │                      + in-memory residual (exact spatial test)
                          └─ source.memory:      CQL2 evaluator, the reference
/ogc/viewer/ ──► MapLibre GL JS viewer, one layer per collection
```

The backend layer follows fennec-odata: the server hands every backend the same neutral
query, here a CQL2 model, and each backend translates it into its own query form. A
file-based or Lucene backend is another `FeatureSource`. A construct a backend cannot
evaluate is answered with 501, an invalid filter with 400.

### Geometry storage

Fennec persistence has no PostGIS support yet
([emf.persistence-jpa#262](https://github.com/eclipse-fennec/emf.persistence-jpa/issues/262)).
Until it does, the workaround is:

- A geometry is stored as a GeoJSON string, through a `TypeConverter` that uses the
  Fennec GeoJSON codec.
- Each feature also carries a persisted bounding box (`minX/minY/maxX/maxY`).
- The persistence backend sends the envelope test of `bbox=` and `S_*` to the store as plain
  numeric comparisons.
- The exact spatial test runs in memory with JTS.

## Modules

| Bundle | Description |
|--------|-------------|
| `net.opengis.cql2.model` | The CQL2 EMF model (`cql2.ecore`), with the OGC specification files it is tested against |
| `org.eclipse.fennec.codec.cql2` | EMF resources of CQL2 text (ANTLR) and CQL2 JSON (Fennec codec), registered with emf.osgi |
| `org.qgis.project.model` | The part of the QGIS project format written here, as EMF model with the QGIS XML names |
| `org.eclipse.fennec.ogc.features.api` | Collection descriptors from EAnnotations, the backend neutral `FeatureSource` SPI, `FeatureQuery` with a CQL2 filter, `FilterLanguage` |
| `org.eclipse.fennec.ogc.features.geo` | Envelopes, GeoJSON ↔ JTS, spatial relations, GeoJSON writer and importer |
| `org.eclipse.fennec.ogc.features.cql2` | The filter languages, binding a filter to a collection, builders for `bbox`/`datetime`/properties, the in-memory CQL2 evaluator |
| `org.eclipse.fennec.ogc.features.source.memory` | Backend over objects in memory, evaluated by the CQL2 evaluator: the reference |
| `org.eclipse.fennec.ogc.features.source.persistence` | Backend over a Fennec persistence repository (JPA, MongoDB): CQL2 → query IR plus in-memory residual, GeoJSON `TypeConverter` |
| `org.eclipse.fennec.ogc.features.runtime` | The OGC API servlet: landing page, conformance, OpenAPI, collections, items, queryables, the collections as QGIS project |
| `org.eclipse.fennec.ogc.features.viewer` | MapLibre GL JS map viewer under `/ogc/viewer/` |
| `org.eclipse.fennec.ogc.features.example.bath` | Demo model: the assets of a leisure pool |
| `org.eclipse.fennec.ogc.features.example.city` | Demo model: the generated town Dim Stadt |
| `org.eclipse.fennec.ogc.features.example.bath.demo` | Demo data (the leisure pool WOGE in Dim Stadt), loader and the launchable demo server (`bath.bndrun`) |
| `org.eclipse.fennec.ogc.features.tests` | OSGi tests on H2 or PostgreSQL: JPA against the in-memory reference, the API over HTTP |

See [docs/ogc-features-overview.md](docs/ogc-features-overview.md) for the annotation, the
configuration and the demo, and [docs/upstream-issues.md](docs/upstream-issues.md) for the
workarounds carried until upstream fixes land.

## Build

```bash
./gradlew build          # compile, unit and OSGi tests (H2)
OGC_TEST_FLAVOR=postgres OGC_TEST_CONTAINER_CLI=podman \
  ./gradlew :org.eclipse.fennec.ogc.features.tests:testOSGi --rerun   # the OSGi tests on PostgreSQL 17
./gradlew :org.eclipse.fennec.ogc.features.example.bath.demo:run.bath # demo on http://localhost:8080/ogc
```

This is a bnd workspace, and Gradle only drives the build. Dependencies are listed in
`cnf/ext/central.mvn` and the bnd libraries activated in `cnf/ext/fennec.bnd`.

## License

[Eclipse Public License 2.0](LICENSE)
