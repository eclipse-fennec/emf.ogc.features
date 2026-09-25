# OGC Features User Guide

Fennec OGC Features publishes instances of EMF models as
[OGC API – Features](https://ogcapi.ogc.org/features/) collections. You annotate an EClass,
and its instances become features. They come as GeoJSON or HTML, can be filtered with CQL2
and are read through [Fennec persistence](https://github.com/eclipse-fennec/emf.persistence-jpa)
(JPA on H2 or PostgreSQL) or from memory.

## Table of Contents

1. [Overview](#1-overview)
2. [Quick Start](#2-quick-start)
3. [Publishing an EClass](#3-publishing-an-eclass)
4. [Configuration](#4-configuration)
5. [The API](#5-the-api)
6. [Filtering with CQL2](#6-filtering-with-cql2)
7. [Viewer and QGIS](#7-viewer-and-qgis)
8. [The Demo](#8-the-demo)
9. [Tests](#9-tests)
10. [Known Limitations](#10-known-limitations)

---

## 1. Overview

Fennec OGC Features provides:

- **Collections from Ecore.** An EClass annotated with `collection=true` becomes a feature
  collection. An abstract class gathers the instances of all its subclasses.
- **OGC API – Features Part 1 (Core)** with GeoJSON, HTML and an OpenAPI 3.0 definition.
- **Part 3 (Filtering)** with queryables, property filters and CQL2 in the text and JSON
  encoding, including the spatial functions.
- **Backends behind one SPI.** A Fennec persistence repository (JPA, MongoDB) or objects held
  in memory. Every backend gets the same neutral query.
- **A map viewer** (MapLibre GL JS) and a **QGIS project** generated from the collections.

The server lists these conformance classes under `/conformance`:

| Part | Conformance classes |
|------|---------------------|
| Features Part 1 | `core`, `geojson`, `html`, `oas30` |
| Features Part 3 | `queryables`, `queryables-query-parameters`, `filter`, `features-filter` |
| CQL2 | `basic-cql2`, `advanced-comparison-operators`, `basic-spatial-functions`, `basic-spatial-functions-plus`, `spatial-functions`, `property-property`, `cql2-text`, `cql2-json` |

The Part 3 and CQL2 classes are listed only when the filter languages of
`org.eclipse.fennec.ogc.features.cql2` are installed.

How the pieces fit together is described in the
[Architecture Guide](ogc-features-architecture.md).

---

## 2. Quick Start

The fastest way to see it is the demo: a leisure pool and a small town, both stored with
Fennec persistence on an embedded H2 database.

```bash
./gradlew :org.eclipse.fennec.ogc.features.example.bath.demo:run.bath
```

Then open:

| URL | What |
|-----|------|
| `http://localhost:8080/ogc` | Landing page |
| `http://localhost:8080/ogc/collections` | The collections |
| `http://localhost:8080/ogc/collections/pools/items?f=json` | The pools as GeoJSON |
| `http://localhost:8080/ogc/viewer/` | The map viewer |
| `http://localhost:8080/ogc/collections?f=qgs` | A QGIS project of all collections |

A first filter, in the CQL2 text encoding:

```
http://localhost:8080/ogc/collections/pools/items?filter=waterTemperature > 30
```

The demo is described in [section 8](#8-the-demo).

---

## 3. Publishing an EClass

### 3.1 The Collection Annotation

A collection is declared with an EAnnotation of source
`https://eclipse.org/fennec/ogc/features` on the EClass:

```xml
<eClassifiers xsi:type="ecore:EClass" name="Asset" abstract="true">
  <eAnnotations source="https://eclipse.org/fennec/ogc/features">
    <details key="collection" value="true"/>
    <details key="id" value="assets"/>
    <details key="title" value="All assets"/>
    <details key="geometry" value="geometry"/>
    <details key="bbox" value="minX,minY,maxX,maxY"/>
    <details key="temporal" value="lastInspection"/>
  </eAnnotations>
  ...
</eClassifiers>
<eClassifiers xsi:type="ecore:EClass" name="Pool" eSuperTypes="#//Asset">
  <eAnnotations source="https://eclipse.org/fennec/ogc/features">
    <details key="collection" value="true"/>
    <details key="id" value="pools"/>
    <details key="title" value="Pools"/>
    <details key="layerGroup" value="Water"/>
    <details key="style" value="#1e88e5"/>
  </eAnnotations>
  ...
</eClassifiers>
```

| Key | Inherited | Meaning |
|-----|-----------|---------|
| `collection` | no | `true` publishes the class. An abstract class becomes a collection of the instances of all its concrete subclasses. |
| `id` | no | Collection id in the URL. Default: the class name. |
| `title` | no | Title. Default: the class name. |
| `description` | no | Description. |
| `geometry` | yes | Attribute holding the geometry. Its data type has the instance class `org.geojson.Geometry`. |
| `bbox` | yes | Four attributes `minX,minY,maxX,maxY` holding the persisted bounding box (see [3.3](#33-geometry-and-bounding-box)). |
| `temporal` | yes | Date/time attribute the `datetime` parameter filters on. |
| `idAttribute` | yes | Attribute used as feature id. Default: the ID attribute of the class. |
| `layerGroup` | yes | Group the viewer and the QGIS project put the layer in, e.g. `Water/Pools`. |
| `style` | no | Display style: a CSS color or a JSON object `{"color": …, "fillOpacity": …, "labels": false}`. |

Inherited keys are looked up along the super types. An abstract base class, such as `Asset`
in the demo, therefore declares the geometry, the bounding box and the temporal attribute
once for all its subclasses. A class naming an attribute it does not have is rejected with
an error.

### 3.2 Properties and Queryables

Every attribute of a feature is a property, except the geometry, the bounding box
attributes and the feature id. A feature of a subclass carries the attributes of its own
class as well, so the features of an abstract collection may differ in their properties.

Values are written as JSON numbers, booleans or strings. An enumeration is written as its
literal, a date as an ISO 8601 instant, and a multi-valued attribute as an array. Unset
values are left out.

The queryables of a collection are the geometry and the attributes of the collection's class
except the bounding box, the id attribute included. They are listed as JSON Schema under
`/collections/{id}/queryables`, with the roles `primary-geometry`, `id` and `primary-instant`
(the `temporal` attribute). Queryables can be used in filters, and all but the geometry as
query parameters.

### 3.3 Geometry and Bounding Box

The geometry is an attribute whose data type has the instance class `org.geojson.Geometry`,
from the GeoJSON EMF model `org.geojson.model`:

```xml
<eClassifiers xsi:type="ecore:EDataType" name="GeoJsonGeometry"
    instanceClassName="org.geojson.Geometry"/>
```

Coordinates are CRS84: longitude, latitude and optionally elevation.

Fennec persistence has no spatial column type yet. The geometry is therefore stored as
GeoJSON text by the `geojson` type converter (see [4.3](#43-a-persistence-backend)), and
every feature also carries its bounding box in four numeric attributes. The bounding box is
what a spatial filter is pushed down to the store with; the exact relation is then checked
in memory. Whoever writes the features keeps the four attributes consistent with the
geometry. The demo loader computes them from the geometry.

### 3.4 Property Names in GeoJSON Files

The `property` key on an **EAttribute** names the GeoJSON property the demo importer reads
the attribute from. It is meant for names that are no identifiers, such as the simplestyle
members of styled GeoJSON files:

```xml
<eStructuralFeatures xsi:type="ecore:EAttribute" name="color" eType="…EString">
  <eAnnotations source="https://eclipse.org/fennec/ogc/features">
    <details key="property" value="stroke"/>
  </eAnnotations>
</eStructuralFeatures>
```

An ExtendedMetaData name works as well. The annotation keeps the GeoJSON name apart from
other serialisations of the model.

---

## 4. Configuration

All components are configured through OSGi Configuration Admin. The demo uses the
[Configurator](https://docs.osgi.org/specification/osgi.cmpn/8.1.0/service.configurator.html)
format, shown in the examples below.

### 4.1 The Server

PID `org.eclipse.fennec.ogc.features.servlet`. The servlet registers on the OSGi HTTP
whiteboard under `/ogc`.

| Property | Default | Meaning |
|----------|---------|---------|
| `title` | `Fennec OGC API Features` | Title of the landing page |
| `description` | `Feature collections of EMF models, served by Eclipse Fennec` | Description of the landing page |
| `defaultLimit` | `10` | Page size when a request has no `limit` |
| `maxLimit` | `10000` | Largest page size. A larger `limit` is reduced to it. |
| `baseUrl` | empty | Public base URL, e.g. `https://example.org/ogc`, for links behind a proxy. Derived from the request when empty. |
| `corsOrigin` | `*` | Value of `Access-Control-Allow-Origin`. No CORS header when empty. |
| `layerFolders` | none | Folders put in front of the layer groups of a package, as `nsURI=Folder/Subfolder` |

```json
"org.eclipse.fennec.ogc.features.servlet": {
  "title": "Leisure pool WOGE",
  "defaultLimit": 50,
  "layerFolders": [
    "https://eclipse.org/fennec/ogc/example/city/1.0=Dim Stadt",
    "https://eclipse.org/fennec/ogc/example/bath/1.0=Dim Stadt/Leisure pool WOGE"
  ]
}
```

The server collects the collections of all registered EPackages. A collection is served by
the first feature source that supports its class; without one it is not listed.

### 4.2 Feature Sources

A feature source is an OSGi service of type `org.eclipse.fennec.ogc.features.api.FeatureSource`.
It claims the classes it serves with `supports(EClass)`. Two are included:

| Source | Bundle | Registration |
|--------|--------|--------------|
| Repository source | `org.eclipse.fennec.ogc.features.source.persistence` | Configuration, one per repository (4.3) |
| Memory source | `org.eclipse.fennec.ogc.features.source.memory` | Programmatic: `new MemoryFeatureSource(nsURIs, supplier)` registered as `FeatureSource` service |

The memory source evaluates every query on the objects its supplier returns. It is the
reference the other backends are tested against, and it suits small, fixed data sets.

### 4.3 A Persistence Backend

The repository source serves the features of a Fennec persistence repository. Factory PID
`org.eclipse.fennec.ogc.features.source.repository`:

| Property | Meaning |
|----------|---------|
| `repository.target` | Filter selecting the repository, e.g. `(persistence.repository.id=bath)` |
| `nsURIs` | Namespace URIs of the packages served |

The repository itself comes from Fennec persistence: a data source, an EORM mapping, a
persistence unit and a JPA repository. A complete configuration for one package:

```json
"fennec.jpa.EORMMappingService~bath": {
  "fennec.jpa.eorm.mappingName": "bath",
  "fennec.jpa.eorm.model.target": "(emf.nsURI=https://eclipse.org/fennec/ogc/example/bath/1.0)"
},
"fennec.jpa.EMPersistenceUnit~bath": {
  "fennec.jpa.persistenceUnitName": "bath",
  "fennec.jpa.mapping.target": "(fennec.jpa.eorm.mapping=bath)",
  "fennec.jpa.converter.target": "(fennec.persistence.converter=geojson)",
  "fennec.jpa.ext.eclipselink.ddl-generation": "create-tables",
  "fennec.jpa.dataSource.target": "(subprotocol=*)"
},
"fennec.repository.jpa~bath": {
  "repositoryId": "bath",
  "unit.target": "(osgi.unit.name=bath)"
},
"org.eclipse.fennec.ogc.features.source.repository~bath": {
  "repository.target": "(persistence.repository.id=bath)",
  "nsURIs": ["https://eclipse.org/fennec/ogc/example/bath/1.0"]
}
```

Two settings matter for OGC Features:

- **`fennec.jpa.converter.target=(fennec.persistence.converter=geojson)`** makes the unit wait
  for the `geojson` type converter of `org.eclipse.fennec.ogc.features.source.persistence`,
  so the geometry attribute is always mapped with it. The converter stores a geometry as
  GeoJSON text in a large-value column (CLOB/TEXT), so long polygons fit.
- **Inheritance.** An abstract collection class is best mapped with one table for all
  subclasses. Annotate it with source `https://eclipse.org/fennec/persistence` and
  `inheritance=SINGLE_TABLE`.

All persistence settings are described in the
[Fennec persistence configuration reference](https://github.com/eclipse-fennec/emf.persistence-jpa/blob/snapshot/docs/configuration-reference.md).

### 4.4 Data Sources

The data source is a [daanse](https://github.com/eclipse-daanse) JDBC data source.

**H2 (embedded):**

```json
"daanse.jdbc.datasource.h2.DataSource~bath": {
  "identifier": "./generated/h2/bath;DB_CLOSE_DELAY=-1"
}
```

Keep `DB_CLOSE_DELAY=-1` for an embedded H2. Without a connection pool, EclipseLink holds no
connection between operations, so H2 closes and reopens the database around every one of
them. H2 loses committed rows, or even the whole store, across such cycles
([#8](https://github.com/eclipse-fennec/emf.ogc.features/issues/8)).

**PostgreSQL:**

```json
"daanse.jdbc.datasource.postgresql.DataSource~bath": {
  "host": "127.0.0.1",
  "port:Integer": 5432,
  "dbname": "ogc",
  "user": "ogc",
  ".password": "secret"
}
```

A property whose name starts with a dot, such as `.password`, is private to the component
and not visible as a service property.

### 4.5 Required Bundles

A server needs, besides an OSGi framework with Configuration Admin and an HTTP whiteboard
implementation (e.g. `org.apache.felix.http.jetty12`):

| Bundle | Purpose |
|--------|---------|
| `org.eclipse.fennec.ogc.features.runtime` | The server under `/ogc` |
| `org.eclipse.fennec.ogc.features.api` | The SPI |
| `org.eclipse.fennec.ogc.features.geo` | Envelopes, JTS conversion, spatial relations |
| `org.eclipse.fennec.ogc.features.cql2` | The filter languages `cql2-text` and `cql2-json` |
| `org.eclipse.fennec.codec.cql2`, `net.opengis.cql2.model` | The CQL2 EMF resources and model |
| `org.eclipse.fennec.ogc.features.source.persistence` | The repository source and the `geojson` converter |
| `org.eclipse.fennec.codec.geojson` | The GeoJSON codec used by the converter |
| `org.eclipse.fennec.ogc.features.viewer` | The map viewer under `/ogc/viewer` (optional) |
| Your model bundle | The annotated EPackage, registered with emf.osgi |

Plus Fennec persistence and a JDBC driver. `bath.bndrun` in the demo project is a complete
example.

---

## 5. The API

### 5.1 Resources

| Path | Content |
|------|---------|
| `/ogc` | Landing page |
| `/ogc/conformance` | Conformance classes |
| `/ogc/api` | OpenAPI 3.0 definition, generated from the collections |
| `/ogc/collections` | All collections |
| `/ogc/collections/{id}` | One collection with its spatial extent |
| `/ogc/collections/{id}/queryables` | The queryables as JSON Schema |
| `/ogc/collections/{id}/items` | The features |
| `/ogc/collections/{id}/items/{featureId}` | One feature |

The spatial extent of a collection is the union of the stored bounding boxes of its
features. Besides the standard members, a collection carries `layerGroup`, `style` and, for
an abstract class, `"aggregate": true`. These are display hints for map clients and not
part of OGC API Features.

### 5.2 Formats

The format is chosen by the `f` parameter or, without it, by the `Accept` header: a browser
asking for `text/html` gets HTML, every other client JSON.

| `f` | Result |
|-----|--------|
| `json`, `geojson` | JSON, GeoJSON for features |
| `html` | HTML pages |
| `qgs`, `qgis` | A QGIS project; offered for `/collections` only |

### 5.3 Items Parameters

| Parameter | Meaning |
|-----------|---------|
| `limit` | Page size, at least 1. Default and maximum from the server configuration. |
| `offset` | Number of features to skip, default 0 |
| `bbox` | `minX,minY,maxX,maxY` in CRS84; features whose geometry intersects it |
| `bbox-crs` | Only `http://www.opengis.net/def/crs/OGC/1.3/CRS84` |
| `datetime` | An instant, a date or an interval `start/end` with open ends (`..`), on the `temporal` attribute |
| `filter` | A CQL2 filter (section 6) |
| `filter-lang` | `cql2-text` (default) or `cql2-json` |
| `filter-crs` | Only CRS84 |
| `{queryable}={value}` | Equality on a queryable, e.g. `?status=OPEN` |

All conditions are combined with AND. An unknown parameter is an error. A collection without
geometry ignores `bbox`, one without a temporal attribute ignores `datetime`.

Features are ordered by their id. The response carries `numberMatched`, `numberReturned`
and `next`/`prev` links for paging.

### 5.4 Errors

Errors come as JSON (`code`, `description`) or, for HTML clients, as an HTML page.

| Status | Code | When |
|--------|------|------|
| 400 | `InvalidParameterValue` | An invalid or unknown parameter, an invalid filter, an unknown queryable in a filter, a literal that does not fit its property |
| 404 | `NotFound` | An unknown path, collection or feature |
| 406 | `NotAcceptable` | An unsupported `f` |
| 500 | `ServerError` | The feature store failed |
| 501 | `NotImplemented` | The backend cannot evaluate part of a valid filter |

A filter is validated against the collection the same way for every backend, so a filter is
either accepted everywhere or rejected with 400 everywhere.

---

## 6. Filtering with CQL2

### 6.1 Encodings

Filters are read in both encodings of
[CQL2 (OGC 21-065r2)](https://docs.ogc.org/is/21-065r2/21-065r2.html):

```
# cql2-text
filter=status = 'OPEN' AND waterTemperature > 30

# cql2-json
filter-lang=cql2-json&filter={"op":"and","args":[
  {"op":"=","args":[{"property":"status"},"OPEN"]},
  {"op":">","args":[{"property":"waterTemperature"},30]}]}
```

Both are tested against the examples of the CQL2 specification. The text encoding is read by
an ANTLR parser, the JSON encoding by the Fennec codec, whose limits for nesting depth,
string length and collection size apply to every JSON filter.

### 6.2 Supported Subset

| Group | Supported |
|-------|-----------|
| Comparisons | `=`, `<>`, `<`, `<=`, `>`, `>=`, also property against property |
| Logic | `AND`, `OR`, `NOT` |
| Advanced comparisons | `IS [NOT] NULL`, `[NOT] LIKE`, `[NOT] BETWEEN`, `[NOT] IN` |
| Literals | strings, numbers, booleans, `DATE('…')`, `TIMESTAMP('…')` |
| Spatial functions | `S_INTERSECTS`, `S_EQUALS`, `S_DISJOINT`, `S_TOUCHES`, `S_WITHIN`, `S_OVERLAPS`, `S_CROSSES`, `S_CONTAINS` |
| Geometries | Text: WKT literals and `BBOX(…)`. JSON: GeoJSON geometries and `{"bbox": […]}`. |

Not supported yet: the temporal functions (`T_*`), array functions, `CASEI`/`ACCENTI`,
arithmetic, and CRS other than CRS84.

Logic is three-valued as in SQL: `NOT (x = 1)` does not match a feature without `x`.

### 6.3 Spatial Filters

```
filter=S_INTERSECTS(geometry, POLYGON((11.28 51.31, 11.29 51.31, 11.29 51.32, 11.28 51.31)))
```

On a persistence backend, a spatial filter is split in two:

1. The envelope test on the bounding box attributes. It runs in the store, like any other
   comparison.
2. The exact relation, computed with JTS in memory on what the store returned.

As long as such a residual exists, paging and `numberMatched` are computed in memory as
well. A filter without a spatial part runs completely in the store.

---

## 7. Viewer and QGIS

### 7.1 The Map Viewer

`/ogc/viewer/` shows all collections on a map (MapLibre GL JS, loaded from
cdn.jsdelivr.net):

- The layer tree is built from the `layerGroup` paths and the server's `layerFolders`, with
  folders before layers.
- A collection of an abstract class (`"aggregate": true`) starts hidden, so its features are
  not drawn twice.
- `style` sets colour, fill opacity and labels of a collection. A feature property `color`
  overrides the colour per feature.
- The first view shows the smallest collection that gathers others (in the demo all assets of
  the leisure pool), otherwise the extent of all collections. A position can be given in the
  URL fragment, `#zoom/latitude/longitude`, e.g. `/ogc/viewer/#14.6/51.3155/11.287`.

### 7.2 QGIS Project

`/ogc/collections?f=qgs` returns the collections as a QGIS project
(`application/x-qgis-project`), styled as the viewer draws them. The viewer links to it
("In QGIS öffnen").

- One OGC API Features layer per collection, in folders following the `layerGroup` paths.
  A collection gathering others starts hidden.
- The drawing order of the viewer: points, lines, then areas from small to large, with
  OpenStreetMap at the bottom.
- Colour and fill opacity come from `style`, the colour per feature from the property
  `color`, labels from `name` below 1:5000 unless `labels:false`.

A QGIS layer has a single geometry type, taken from its first features. A collection with
mixed geometry types therefore shows only the type of its first feature.

---

## 8. The Demo

The demo publishes two models side by side, each in its own persistence unit:

- **`org.eclipse.fennec.ogc.features.example.bath`**: the leisure pool WOGE with 18 asset
  types below an abstract `Asset` (pools, slides, saunas, parking, trees …), all in one table
  (`SINGLE_TABLE`).
- **`org.eclipse.fennec.ogc.features.example.city`**: the generated town *Dim Stadt* with
  boundary, districts, land use, streets, buildings and places, 6,816 features.

`org.eclipse.fennec.ogc.features.example.bath.demo` holds the data, the loader and the
launch configurations.

### 8.1 Running It

```bash
# H2, in the launcher's working directory
./gradlew :org.eclipse.fennec.ogc.features.example.bath.demo:run.bath

# PostgreSQL: start a database once, then
podman run -d --name ogc-demo-postgres -e POSTGRES_DB=ogc -e POSTGRES_USER=ogc -e POSTGRES_PASSWORD=ogc \
  -p 127.0.0.1:55433:5432 -v ogc-demo-pgdata:/var/lib/postgresql/data docker.io/library/postgres:17
./gradlew :org.eclipse.fennec.ogc.features.example.bath.demo:run.bath-postgres
```

The Gogo shell listens on `telnet 127.0.0.1 6666`.

`run.bath` updates the running framework when workspace bundles or repository snapshots
change. For a demo that keeps running, export it and start the executable jar:

```bash
./gradlew :org.eclipse.fennec.ogc.features.example.bath.demo:export.bath
java -jar org.eclipse.fennec.ogc.features.example.bath.demo/generated/distributions/executable/bath.jar
```

The configuration is split: `config/bath-demo.json` holds everything but the data source,
`config/datasource-h2.json` and `config/datasource-postgres.json` add one each.

### 8.2 Loading GeoJSON Files

The `DemoDataLoader` reads GeoJSON FeatureCollections from its bundle into a repository.
Factory PID `org.eclipse.fennec.ogc.features.example.loader`:

| Property | Default | Meaning |
|----------|---------|---------|
| `repository.target` | | Filter selecting the repository to load into |
| `ePackage.target` | | Filter selecting the EPackage of the feature classes, e.g. `(emf.nsURI=…)` |
| `files` | | Bundle resources: `path` takes the class of each feature from `typeProperty`, `path=ClassName` reads all features of the file as that class |
| `typeProperty` | `assetType` | Feature property naming the class of a feature |
| `ignoredProperties` | the simplestyle members | Feature properties to skip where the class has no attribute for them |
| `existsType` | | Class whose instances mean the data is loaded already |
| `conditionId` | | `osgi.condition.id` registered once the data is in the store |

Each feature becomes an instance of its class: the feature id goes to the id attribute, the
geometry to the geometry attribute, the bounding box is computed, and every other property
is set on the attribute of the same name (or of that ExtendedMetaData or `property` name).
A property without an attribute is an error unless it is ignored.

The data is loaded once. Delete the database to load it again.

---

## 9. Tests

```bash
./gradlew build                                   # unit tests and OSGi tests on H2
OGC_TEST_FLAVOR=postgres OGC_TEST_CONTAINER_CLI=podman \
  ./gradlew :org.eclipse.fennec.ogc.features.tests:testOSGi --rerun   # the same on PostgreSQL 17
```

The OSGi tests compare every query and every CQL2 construct between the JPA backend and the
in-memory reference backend, and exercise the API over HTTP. For PostgreSQL a container
`postgres:17` is started on port 55432 (`OGC_TEST_POSTGRES_PORT`).

---

## 10. Known Limitations

- **CRS84 only.** No other coordinate reference systems, no antimeridian handling.
- **Read only.** Creating, replacing and deleting features (Part 4) is not implemented.
- **No spatial index.** Geometries are stored as GeoJSON text until Fennec persistence
  supports spatial columns
  ([emf.persistence-jpa#262](https://github.com/eclipse-fennec/emf.persistence-jpa/issues/262)).
  A spatial filter therefore pages in memory.
- **Dynamic objects.** Objects read from JPA are dynamic EObjects, not instances of the
  generated classes
  ([emf.persistence-jpa#311](https://github.com/eclipse-fennec/emf.persistence-jpa/issues/311)).
- **CQL2 subset** as listed in [6.2](#62-supported-subset).

The workarounds this project carries until upstream fixes arrive are listed in
[upstream-issues.md](upstream-issues.md).
