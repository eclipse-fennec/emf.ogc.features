# Fennec OGC Features — Overview

Fennec OGC Features publishes instances of EMF models as
[OGC API – Features](https://ogcapi.ogc.org/features/) collections. The data is read
through [Fennec persistence](https://github.com/eclipse-fennec/emf.persistence-jpa), with
JPA (H2, PostgreSQL) or in memory.

## Turning an EClass into a collection

Annotate the EClass with the source `https://eclipse.org/fennec/ogc/features`:

```xml
<eClassifiers xsi:type="ecore:EClass" name="Pool" eSuperTypes="#//Asset">
  <eAnnotations source="https://eclipse.org/fennec/ogc/features">
    <details key="collection" value="true"/>
    <details key="id" value="pools"/>
    <details key="title" value="Becken"/>
    <details key="layerGroup" value="Wasser"/>
    <details key="style" value="#1e88e5"/>
  </eAnnotations>
  ...
```

| Key | Inherited | Meaning |
|-----|-----------|---------|
| `collection` | no | `true` publishes the class; an abstract class becomes a collection of all its subclasses' instances |
| `id`, `title`, `description` | no | URL id (default: class name), title, description |
| `geometry` | yes | Attribute holding the geometry; its data type has instance class `org.geojson.Geometry` |
| `bbox` | yes | Four attributes `minX,minY,maxX,maxY` holding the persisted bounding box |
| `temporal` | yes | Date/time attribute the `datetime` parameter filters on |
| `idAttribute` | yes | Feature id attribute, default the class' ID attribute |
| `layerGroup`, `style` | group yes, style no | Display hints for the viewer; `style` is a CSS color or `{"color":…,"fillOpacity":…,"labels":false}` |
| `property` (on an EAttribute) | — | Name of the GeoJSON property the importer reads the attribute from, where it is no identifier |

Inherited keys are looked up along the super types. That way an abstract base class
(`Asset` in the demo) declares geometry, bbox and temporal attribute once.

## Why a bounding box is persisted

Fennec persistence has no spatial column type yet. The geometry is therefore stored as
GeoJSON text, and every feature also carries its bounding box as four numbers.

The persistence backend therefore splits a spatial filter into two parts:

1. The envelope test (`minX <= maxX' AND …`). It runs in the store, like any other
   comparison.
2. The exact relation (JTS). It runs in memory on what the store returned.

As long as such a residual exists, paging and `numberMatched` are computed in memory too.
A filter without a spatial part is pushed to the store completely.

## Server and sources

| Configuration PID | Purpose |
|-------------------|---------|
| `org.eclipse.fennec.ogc.features.servlet` | `title`, `description`, `defaultLimit` (10), `maxLimit` (10000), `baseUrl`, `corsOrigin` (`*`), `layerFolders` (`nsURI=Folder/Sub`) |
| `org.eclipse.fennec.ogc.features.source.repository` (factory) | `repository.target` selects a Fennec repository, `nsURIs` the packages it serves |

The server serves under `/ogc`:
- `/`, `/conformance`, `/api` (OpenAPI 3.0), `/collections`
- `/collections/{id}`, `/collections/{id}/queryables`
- `/collections/{id}/items`, `/collections/{id}/items/{featureId}`

Every resource comes as JSON (GeoJSON for features) and HTML, selected by `f=json|html`
or the `Accept` header. Parameters of `items`:
- `limit`, `offset`, `bbox` (CRS84)
- `datetime` (instant, date or interval with open ends)
- `filter`, `filter-lang` (`cql2-text`, `cql2-json`)
- equality filters `?property=value` on any queryable

A repository source needs the geojson `TypeConverter`. It ships in
`org.eclipse.fennec.ogc.features.source.persistence`. The persistence unit should wait for it:
`fennec.jpa.converter.target=(fennec.persistence.converter=geojson)`.

## Backends

As in fennec-odata, the server hands every backend the same neutral query: a `FeatureQuery`
whose filter is one CQL2 predicate (`net.opengis.cql2.model`). `bbox`, `datetime` and the
property parameters are turned into CQL2 too (`Cql2Filters`). A backend is a
`FeatureSource` service. It claims its classes with `supports(EClass)` and translates the
CQL2 model into its own query form.

| Backend | Translation |
|---------|-------------|
| `org.eclipse.fennec.ogc.features.source.persistence` | `Cql2ToQuery`: CQL2 → Fennec query IR, plus an in-memory residual for the exact spatial relations |
| `org.eclipse.fennec.ogc.features.source.memory` | `Cql2Evaluator` on the objects, the reference semantics |

`Cql2Binding` binds property references and literals to a collection, the same for every
backend. The server validates a filter with the evaluator (400 for an unknown queryable or
a literal that does not fit). A backend throws `UnsupportedOperationException` for what it
cannot evaluate, answered with 501. The evaluator uses three-valued logic like SQL:
`NOT (x = 1)` does not match a feature without `x`.

## CQL2

The filter languages read the filter through the CQL2 EMF resources of
`org.eclipse.fennec.codec.cql2`, registered with emf.osgi (`text/cql2` via an ANTLR parser,
`application/cql2+json` via the Fennec codec). Both are tested against the examples of the
CQL2 specification. Supported:

- Comparisons (`= <> < <= > >=`), including property against property.
- `AND`, `OR`, `NOT`, `IS [NOT] NULL`, `[NOT] LIKE`, `[NOT] BETWEEN`, `[NOT] IN`.
- `DATE('…')` and `TIMESTAMP('…')`.
- The spatial functions `S_INTERSECTS`, `S_EQUALS`, `S_DISJOINT`, `S_TOUCHES`,
  `S_WITHIN`, `S_OVERLAPS`, `S_CROSSES`, `S_CONTAINS`.
  - Text encoding: WKT literals or `BBOX(…)`.
  - JSON encoding: GeoJSON geometries or `{"bbox": […]}`.

Not supported yet: temporal functions (`T_*`), array functions, `CASEI`/`ACCENTI`,
arithmetic, and CRS other than CRS84.

## The demo: the leisure pool WOGE in the town Dim Stadt

The demo publishes two models side by side, each in a persistence unit of its own.

- **`org.eclipse.fennec.ogc.features.example.bath`** is a leisure pool.
  - 18 asset types below an abstract `Asset`: pools, slides, pool surrounds (`Paving`),
    showers, changing rooms, saunas, car and bicycle parking, trees, shrubs and more.
  - All types share one table (`SINGLE_TABLE`).
- **`org.eclipse.fennec.ogc.features.example.city`** is the generated town *Dim Stadt*
  (Kyffhäuserkreis): boundary, districts, land use, streets, buildings and places.
  - It holds 6,816 features, and every feature keeps its own display colour.

`org.eclipse.fennec.ogc.features.example.bath.demo` holds the data and the launch
configuration:

- `data/woge.geojson` is the WOGE (https://woge.modelatlas.cloud), generated by
  `data/generate_woge.py`.
  - It covers the wave pool, the slide *Blauer Blitz* ending in its landing pool, the
    sports pool, the children's world, the sole pool, four saunas, the bistro *Sandbank*,
    350 parking spaces and 400 bicycle racks.
  - It is placed on free meadow at the Unstrutstraße of Dim Stadt.
- `data/city/*.geojson` is the town, one file per class.
- `data/saaleaue.geojson` is the fixed test data of the tests.

The generic `DemoDataLoader` (factory PID `org.eclipse.fennec.ogc.features.example.loader`)
reads such files into a repository:
- `files` lists `path` or `path=ClassName`.
- `ignoredProperties` names the simplestyle members to skip.
- It registers a condition when it is done.

The server's `layerFolders` put the packages into one layer tree:
- `…/city/1.0=Dim Stadt`
- `…/bath/1.0=Dim Stadt/Freizeitbad WOGE`

```bash
./gradlew :org.eclipse.fennec.ogc.features.example.bath.demo:run.bath
# API:    http://localhost:8080/ogc
# Viewer: http://localhost:8080/ogc/viewer/          (starts at the WOGE)
#         http://localhost:8080/ogc/viewer/#14.6/51.3155/11.287   (the town)
# Shell:  telnet 127.0.0.1 6666                      (Gogo, e.g. scr:list)
```

On PostgreSQL, as in production, start a database once and run `bath-postgres`:

```bash
podman run -d --name ogc-demo-postgres -e POSTGRES_DB=ogc -e POSTGRES_USER=ogc -e POSTGRES_PASSWORD=ogc \
  -p 127.0.0.1:55433:5432 -v ogc-demo-pgdata:/var/lib/postgresql/data docker.io/library/postgres:17
./gradlew :org.eclipse.fennec.ogc.features.example.bath.demo:run.bath-postgres
```

The configuration is split: `config/bath-demo.json` holds everything but the data source,
`config/datasource-h2.json` and `config/datasource-postgres.json` add one each.

`run.bath` updates the running framework when workspace bundles or repository snapshots
change. That suits development, but a snapshot refreshed during the run can leave bundles
uninstalled. For a demo that keeps running, export it and start the executable jar:

```bash
./gradlew :org.eclipse.fennec.ogc.features.example.bath.demo:export.bath
java -jar org.eclipse.fennec.ogc.features.example.bath.demo/generated/distributions/executable/bath.jar
```

The data is written to H2 in the launcher's working directory
(`generated/tmp/run.bath/…/generated/h2`). It is loaded on the first start only; delete the
database files to reload it.

## QGIS project

`/ogc/collections?f=qgs` returns the collections as a QGIS project (`application/x-qgis-project`),
styled as the viewer draws them; the viewer links to it ("In QGIS öffnen").

- One OGC API Features layer per collection, in the folders of the `layerGroup` paths.
  A collection gathering others (e.g. all assets) starts hidden.
- The drawing order of the viewer: points, lines, then areas from small to large, and
  OpenStreetMap at the bottom.
- Colour and fill opacity from `style`, the colour per feature from the property `color`,
  the outline by `status` as in the viewer, labels from `name` below 1:5000 unless
  `labels:false`.
- The project opens at the extent the viewer starts at.

The file is written with the EMF model `org.qgis.project.model`. QGIS has no current schema of
its project format (the DTD dates from QGIS 1.x), so the model covers the part written here and
follows the files QGIS 3 writes. Two findings from testing it against QGIS 3.44:

- QGIS reads the project CRS only with its full definition and `SpatialRefSys/ProjectionsEnabled`.
- QGIS replaces a layer id of up to ten characters by a generated one and loses the references
  of the layer tree to it; the layer ids are therefore `ogc_features_<collection>`.

A QGIS layer has a single geometry type, taken from the first features, so a collection with
mixed types shows only the type of its first feature (in the demo the centre point of Dim Stadt).
Reading styles back from QGIS would need a style endpoint; not done yet.

## Viewer

The viewer lists the collections as a tree of their `layerGroup` paths, with folders before
layers. A collection whose type is abstract (`"aggregate": true`, e.g. all assets) starts
hidden, and the first view shows its extent. The `style` of a collection may be a CSS
color or a JSON object `{"color", "fillOpacity", "labels"}`; a feature property `color`
overrides the colour per feature.

## Tests

```bash
./gradlew build                                   # unit tests and OSGi tests on H2
OGC_TEST_FLAVOR=postgres OGC_TEST_CONTAINER_CLI=podman \
  ./gradlew :org.eclipse.fennec.ogc.features.tests:testOSGi --rerun   # the same on PostgreSQL 17
```

The OSGi tests compare every query and every CQL2 construct between the JPA backend and the
in-memory reference backend. They also exercise the API over HTTP. For PostgreSQL a container
`postgres:17` is started on port 55432 (`OGC_TEST_POSTGRES_PORT`).

## Known limitations

See [upstream-issues.md](upstream-issues.md) for the workarounds this project carries
until Fennec persistence and the GeoJSON codec catch up. Among them: objects read from JPA
are dynamic EObjects rather than instances of the generated classes.
