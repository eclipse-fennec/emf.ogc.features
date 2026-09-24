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
| `org.eclipse.fennec.ogc.features.model` | `GeoJsonGeometry` data type, collection annotation conventions |
| `org.eclipse.fennec.ogc.features.api` | `FeatureSource` SPI, `FeatureQuery`, collection descriptors |
| `org.eclipse.fennec.ogc.features.geo` | Envelopes, GeoJSON ↔ JTS, spatial predicates, GeoJSON `TypeConverter` |
| `org.eclipse.fennec.ogc.features.cql2` | CQL2 text/JSON parser, splitting a filter into store part and in-memory part |
| `org.eclipse.fennec.ogc.features.source` | Feature sources over Fennec repositories and in memory |
| `org.eclipse.fennec.ogc.features.runtime` | The OGC API servlet: landing page, conformance, OpenAPI, collections, items |
| `org.eclipse.fennec.ogc.features.viewer` | MapLibre GL JS map viewer |
| `org.eclipse.fennec.ogc.features.example.bath` | Demo: assets of a leisure pool as feature collections |

## Build

```bash
./gradlew build          # compile + unit tests
./gradlew testOSGi       # OSGi integration tests (H2)
```

This is a bnd workspace, and Gradle only drives the build. Dependencies are listed in
`cnf/ext/central.mvn` and the bnd libraries activated in `cnf/ext/fennec.bnd`.

## License

[Eclipse Public License 2.0](LICENSE)
