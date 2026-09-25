# OGC Features Architecture Guide

How Fennec OGC Features is built: the modules, the path of a request, the SPI between the
server and its backends, and how filters and geometries reach a store that knows nothing
about either. For setting it up, see the [User Guide](ogc-features-user-guide.md).

## Table of Contents

1. [Design Principles](#1-design-principles)
2. [Modules](#2-modules)
3. [Request Flow](#3-request-flow)
4. [The Feature Source SPI](#4-the-feature-source-spi)
5. [CQL2](#5-cql2)
6. [The Persistence Backend](#6-the-persistence-backend)
7. [Geometry Storage](#7-geometry-storage)
8. [Writing a Backend](#8-writing-a-backend)

---

## 1. Design Principles

- **The model is the configuration.** A collection is an annotated EClass. The server derives
  ids, properties, queryables, the OpenAPI definition and the viewer layers from the Ecore
  model; there is no second schema to keep in step.
- **One neutral query.** Every restriction of a request (`bbox`, `datetime`, property
  parameters and `filter`) arrives at a backend as one CQL2 predicate, an EMF model
  independent of any store. A backend translates it and evaluates in memory what its store
  cannot.
- **One reference semantics.** The in-memory evaluator defines what a filter means. Every
  backend is tested against it, and every filter is validated with it before it reaches a
  backend, so all backends accept and reject the same filters.
- **Protocol neutral SPI.** The server and the backends meet in
  `org.eclipse.fennec.ogc.features.api`, which knows no HTTP. The same sources can serve other
  protocols later.
- **OSGi services throughout.** Packages, feature sources, filter languages and resource
  factories are services. They come and go at runtime, and the server follows them.

---

## 2. Modules

| Bundle | Role |
|--------|------|
| `org.eclipse.fennec.ogc.features.api` | The SPI: `CollectionDescriptor`, `FeatureQuery`, `FeatureResult`, `FeatureSource`, `FilterLanguage` |
| `org.eclipse.fennec.ogc.features.geo` | Geometry support, backend neutral: envelopes, conversion to JTS, the OGC spatial relations, GeoJSON text, the GeoJSON importer |
| `net.opengis.cql2.model` | CQL2 as EMF model, mirroring the CQL2 JSON encoding |
| `org.eclipse.fennec.codec.cql2` | EMF resources for the two CQL2 encodings, registered with emf.osgi |
| `org.eclipse.fennec.ogc.features.cql2` | The filter languages `cql2-text` and `cql2-json`, binding a filter to a collection, the filters of the request parameters, the in-memory evaluator |
| `org.eclipse.fennec.ogc.features.source.memory` | Feature source over objects in memory, the reference backend |
| `org.eclipse.fennec.ogc.features.source.persistence` | Feature source over a Fennec persistence repository, and the `geojson` type converter |
| `org.eclipse.fennec.ogc.features.runtime` | The server: servlet under `/ogc`, encoders for JSON, GeoJSON, HTML, OpenAPI and QGIS |
| `org.eclipse.fennec.ogc.features.viewer` | The MapLibre viewer under `/ogc/viewer`, static web resources only |

### 2.1 Dependency Graph

```
  ┌─────────┐   ┌───────────────┐   ┌────────────────────┐
  │ runtime │   │ source.memory │   │ source.persistence │──► Fennec persistence,
  └────┬────┘   └───────┬───────┘   └─────────┬──────────┘    codec.geojson
       │                │                     │
       └────────────────┼─────────────────────┘
                        ▼
                   ┌─────────┐
                   │  cql2   │ ─ ─ ─(Resource.Factory services)─ ─ ─► codec.cql2 ──► Fennec codec
                   └────┬────┘
                        ▼
                   ┌─────────┐
                   │   geo   │ ──► JTS, codec.geojson
                   └────┬────┘
                        ▼
                   ┌─────────┐      ┌────────────┐      ┌───────────────┐
                   │   api   │ ───► │ cql2.model │ ───► │ geojson model │
                   └─────────┘      └────────────┘      └───────────────┘
```

The server does not link against any backend. It finds the feature sources as
`FeatureSource` services. Likewise, `org.eclipse.fennec.ogc.features.cql2` does not link
against `codec.cql2`. It uses the CQL2
resource factories as services, selected by `emf.configuratorName` (`cql2-text`,
`cql2-json`). The viewer depends on nothing but the HTTP whiteboard; it talks to the server
over HTTP like any other client.

---

## 3. Request Flow

```
GET /ogc/collections/pools/items?bbox=…&filter=…
  │
  ▼
OgcFeaturesServlet ── HTTP whiteboard, CORS, base URL
  │
  ▼
OgcApi ── format (f / Accept), routing, errors
  │
  ├─ CollectionRegistry ── collections of every registered EPackage,
  │                         the first FeatureSource that supports the class
  │
  ├─ ItemsRequest ── parameters ─► FeatureQuery
  │     bbox, datetime, property=value ─► Cql2Filters ─┐
  │     filter + filter-lang ─► FilterLanguage.parse ──┤
  │                                                    ▼
  │                              one CQL2 predicate (AND of all parts)
  │                              validated by Cql2Evaluator.compile
  │
  ├─ FeatureSource.query(FeatureQuery) ─► FeatureResult (page + numberMatched)
  │
  └─ JsonEncoder / HtmlEncoder ─► GeoJSON FeatureCollection or HTML, links next/prev
```

The server knows collections, not stores. `CollectionRegistry` keeps the collections of
every EPackage service and, per collection, asks the registered feature sources which one
`supports` its class. EPackages, sources and filter languages are dynamic references, so a
model or backend installed later appears without a restart.

An exception of a backend maps to an HTTP status:

| From the backend | Status |
|------------------|--------|
| `IllegalArgumentException` | 400, the filter does not fit |
| `UnsupportedOperationException` | 501, valid, but this backend cannot evaluate it |
| `FeatureSourceException` | 500, the store failed |

---

## 4. The Feature Source SPI

### 4.1 Collections

A `CollectionDescriptor` is derived from an annotated EClass
(`CollectionDescriptor.of(EClass)` / `of(EPackage)`). It carries the collection id and
title, the class, and the resolved attributes: id, geometry, the four bounding box
attributes (`BboxAttributes`), temporal. `properties()` are all attributes except geometry
and bounding box.

For an abstract class the collection contains the instances of all concrete subclasses. A
source queries the abstract class; a store with class inheritance, such as a
`SINGLE_TABLE` mapping, answers that with one query.

### 4.2 Queries and Results

```java
public interface FeatureSource {
    boolean supports(EClass type);
    FeatureResult query(FeatureQuery query);
    Optional<EObject> get(CollectionDescriptor collection, String id);
    default Optional<Envelope> extent(CollectionDescriptor collection) { … }
}
```

| `FeatureQuery` | |
|----------------|--|
| `collection` | The collection queried |
| `filter` | One CQL2 `Predicate`, `null` for none |
| `sort` | Sort keys; the source appends the id attribute, so paging is stable |
| `offset`, `limit` | Paging; `limit` may be `UNLIMITED` |
| `count` | Whether `numberMatched` is computed |

A `FeatureResult` holds the features of the page and `numberMatched` (`UNKNOWN` when not
requested). The features are the model objects themselves; the server encodes them.

`extent` has a default that reads every feature and unites the stored bounding boxes. A
backend should push it to its store.

### 4.3 Filter Languages

A `FilterLanguage` service turns the `filter` parameter into a CQL2 predicate and names the
conformance classes it contributes. The server offers the `filter` parameter and the Part 3
conformance classes only while at least one language is registered. Another language, such
as an ECQL dialect, is one more service producing the same model.

---

## 5. CQL2

### 5.1 The Model

`net.opengis.cql2.model` mirrors the CQL2 JSON encoding: an `Operation` with its `args`, its
classes following the `op` names (`And`, `Or`, `Not`, the comparisons, `Like`, `Between`,
`In`, `IsNull`, the spatial operations), `PropertyRef`, and the literals. A
`GeometryLiteral` holds an `org.geojson.Geometry` from the GeoJSON EMF model, the same type
the feature attributes use.

### 5.2 The Resources

`org.eclipse.fennec.codec.cql2` registers two EMF resource factories with emf.osgi:

| Encoding | Content type | Extension | `emf.configuratorName` | Implementation |
|----------|--------------|-----------|------------------------|----------------|
| Text | `text/cql2` | `cql2` | `cql2-text` | ANTLR parser (grammar `grammar/CQL2.g4`, generated once and checked in) and a writer |
| JSON | `application/cql2+json` | `cql2json` | `cql2-json` | Fennec codec |

The JSON resource is configuration, not a hand-written parser. The `op` member is the type
discriminator, mapped by codec annotations in `cql2.ecore`. The mixed `args` array (operations,
literals, property references, geometries) is handled by a value reader and writer for
`Operation.args`. GeoJSON geometries inside the arguments are handed back to the codec with
a closed type mapping on `Geometry`. So the codec's limits for depth, size and string length
apply to the whole filter.

Both resources are tested against the examples of the CQL2 specification: every text
example against its JSON counterpart, and both written and read again.

### 5.3 Binding and Evaluation

In `org.eclipse.fennec.ogc.features.cql2`:

- **`Cql2Binding`** binds a predicate to a collection: property references to queryable
  attributes, literals to values of the attribute type (numbers, strings, enum literals,
  dates, geometries). Every backend's translation uses it, so a filter that does not fit is
  rejected the same way everywhere.
- **`Cql2Filters`** builds the CQL2 predicates for `bbox`, `datetime` and `property=value`.
- **`Cql2Evaluator`** evaluates a predicate on objects. It is the reference semantics:
  three-valued logic as in SQL, and the spatial relations through JTS prepared geometries.
  The server compiles every filter with it once to validate it.

---

## 6. The Persistence Backend

`PersistenceFeatureSource` translates a `FeatureQuery` into the Fennec query IR
(`org.eclipse.fennec.query.model`) and leaves only the execution to its subclass.
`RepositoryFeatureSource` runs it on a Fennec `ReadRepository`, JPA or MongoDB. Repositories
are prototype-scoped and not thread-safe, so every query gets its own instance, disposed
afterwards.

### 6.1 Store Part and Residual

`Cql2ToQuery` splits the filter into two parts with `filter ≡ store ∧ residual`:

| Construct | Store part | Residual |
|-----------|------------|----------|
| Comparison, `LIKE`, `BETWEEN`, `IN`, `IS NULL` | exact | none |
| Spatial function | envelope test on the bounding box attributes, where the relation needs intersecting envelopes | the exact relation |
| `AND` | the AND of the store parts | the AND of the residuals |
| `OR` | exact if all branches are exact; otherwise the OR of the branches' store parts as a necessary condition | the whole `OR` |
| `NOT` | the negated store part if it is exact | otherwise the whole `NOT` |

The store part is always a necessary condition. It never drops a feature the filter
matches; it only makes the residual's input small. For `S_INTERSECTS` with a polygon, the
store returns the features whose bounding box intersects the polygon's envelope, and JTS
checks the exact geometries.

### 6.2 Paging

- **No residual:** `offset`, `limit` and the count are pushed to the store (`skip`, `top`,
  a count query).
- **With a residual:** the store returns every feature matching the store part, in the
  query order.
  The residual, the page and `numberMatched` are computed in memory.

The order is always total (the id attribute is appended), so offset paging returns every
feature exactly once.

---

## 7. Geometry Storage

Fennec persistence has no spatial column type yet
([emf.persistence-jpa#262](https://github.com/eclipse-fennec/emf.persistence-jpa/issues/262)).
The interim design is:

- **The geometry is a normal attribute** whose data type has the instance class
  `org.geojson.Geometry`. In memory, and to the server, it is a GeoJSON EMF object.
- **`GeoJsonTypeConverter`**, a Fennec persistence `TypeConverter` named `geojson`, stores it
  as GeoJSON text through the GeoJSON codec, and reads it back. It declares the value large,
  so the column becomes a CLOB/TEXT instead of `VARCHAR(255)`.
- **The bounding box is persisted** in four numeric attributes. That is what the store can
  filter on; the envelope test becomes four comparisons.

When spatial columns arrive, the store part of a spatial filter can grow to the exact
relation, and the residual disappears. Neither the server, the SPI nor the CQL2 layer
changes.

---

## 8. Writing a Backend

A backend is a `FeatureSource` service:

1. **Claim the classes** in `supports(EClass)`, typically by namespace URI.
2. **Translate the filter** in `query`. Bind property references and literals with
   `Cql2Binding` so the backend accepts exactly the filters the others accept. Evaluate what
   the store cannot with `Cql2Evaluator` on the store's result, as the persistence backend
   does.
3. **Order and page.** Append the id attribute to the sort, push `offset`/`limit` to the
   store when nothing is left for memory, and compute `numberMatched` when `count` is set.
4. **Report the limits.** Throw `UnsupportedOperationException` for a construct the backend
   cannot evaluate (501), `FeatureSourceException` when the store fails (500).
5. **Push `extent`** to the store if it can aggregate.

For a store the Fennec query IR reaches, extend `PersistenceFeatureSource` and implement only
`objects(Query)` and `count(Query)`.

The OSGi tests in `org.eclipse.fennec.ogc.features.tests` show how to test a backend: the
same queries and every CQL2 construct, compared with the in-memory reference backend on the
same data.
