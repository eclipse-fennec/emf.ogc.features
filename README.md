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
                    ├─ CQL2 (text / JSON) ──► store part (Fennec query IR)  +  in-memory part (JTS)
                    └─ FeatureSource ──┬─ Fennec repository (JPA: H2, PostgreSQL)
                                       └─ in-memory (MemoryQueries)
/ogc/viewer/ ──► MapLibre GL JS viewer, one layer per collection
```

### Geometry storage

Fennec persistence has no PostGIS support yet
([emf.persistence-jpa#262](https://github.com/eclipse-fennec/emf.persistence-jpa/issues/262)).
Until it does, the workaround is:

- A geometry is stored as a GeoJSON string, through a `TypeConverter` that uses the
  Fennec GeoJSON codec.
- Each feature also carries a persisted bounding box (`minX/minY/maxX/maxY`).
- `bbox=` and the bbox part of `S_INTERSECTS` are sent to the store as plain numeric
  comparisons.
- The exact spatial test runs in memory with JTS.

## Modules

| Bundle | Description |
|--------|-------------|
| `org.eclipse.fennec.ogc.features.api` | Collection descriptors from EAnnotations, `FeatureSource` SPI, `FeatureQuery`, `FilterLanguage` |
| `org.eclipse.fennec.ogc.features.geo` | Envelopes, GeoJSON ↔ JTS, spatial relations, GeoJSON `TypeConverter`, writer and importer |
| `org.eclipse.fennec.ogc.features.cql2` | CQL2 text/JSON parser, splitting a filter into store part and in-memory part |
| `org.eclipse.fennec.ogc.features.source` | Feature sources over Fennec repositories and in memory |
| `org.eclipse.fennec.ogc.features.runtime` | The OGC API servlet: landing page, conformance, OpenAPI, collections, items, queryables |
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
