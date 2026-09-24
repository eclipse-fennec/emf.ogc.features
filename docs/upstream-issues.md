# Upstream findings

Gaps and bugs in the libraries this project builds on, found while building OGC Features.
We report them to the projects they belong to and work around them here. Each entry names
the workaround, so it can be removed once the upstream fix lands.

Status: 1–8 posted on 2026-09-24 (links in the headings), 9 not yet.

---

## 1. emf.persistence-jpa — [comment on #308](https://github.com/eclipse-fennec/emf.persistence-jpa/issues/308#issuecomment-5812600116) (read path skips the TypeConverter)

`EFeatureAccessor.dataTypeConvert()` checks `value instanceof String` before it asks the
converter. A converter that stores a non-String EDataType **as String** is never asked
when the value is read back. `EcoreUtil.createFromString` runs instead and fails.

Our case, beyond the UUID one in #308: `GeoJsonGeometry` is a generated EDataType with
instance class `org.geojson.Geometry` (an EObject interface), and a `TypeConverter` stores
it as GeoJSON text.

- Writing works: `getAttributeValueFromObject` calls the converter.
- Reading works only while the object comes from the EclipseLink shared cache.
- With `eclipselink.cache.shared.default=false`, every read fails with
  `The value '{"type":"Point",...}' is invalid`.

Suggested order in `dataTypeConvert`: converter first, `createFromString` second.

**Workaround here:** the EDataType has GenModel `create`/`convert` bodies that use the
GeoJSON codec (`GeoJsonText.standalone()`), so `createFromString` succeeds
(`org.eclipse.fennec.ogc.features.example.bath/model/bath.ecore`).

## 2. emf.persistence-jpa — [#311](https://github.com/eclipse-fennec/emf.persistence-jpa/issues/311): generated classes are not used as entity classes

`EClassDescriptor.convertClassNamesToClasses` takes `eClass.getInstanceClass()` as entity
class, if that class can be instantiated. For a generated model this is the interface
(`...bath.Pool`), so the check fails and a dynamic `DynamicEObjectImpl` subclass is
generated under the interface's name.

Effect:
- Objects read from JPA have the right `eClass()`, but they are not instances of the
  generated interfaces.
- `(Pool) obj` fails with a `ClassCastException` (two different classes of the same name
  in different loaders).
- Generated operations and derived features are lost.

Suggestion: for an EClass of a generated package, use the implementation class the factory
creates (`ePackage.getEFactoryInstance().create(eClass).getClass()`), as the javadoc of
`EDynamicTypeGenerator.createFromEntity` intends ("If we have generated code, we take the
generated class").

**Workaround here:** the OGC layer reads every feature reflectively; the tests compare ids,
not types (`JpaFeatureSourceTest` javadoc).

## 3. emf.persistence-jpa — [#312](https://github.com/eclipse-fennec/emf.persistence-jpa/issues/312): String basic attributes are VARCHAR(255) on PostgreSQL

`AttributeConfigurator.processBasic()` does not evaluate the eorm `Column.length`,
`Column.columnDefinition` or `Lob` of a basic attribute. On PostgreSQL, EclipseLink creates
`VARCHAR(255)` for every String attribute, including those a `TypeConverter` maps to
String. A GeoJSON polygon exceeds 255 characters quickly. H2 has no such limit.

Suggestion: honour `length`/`columnDefinition`/`lob` from the eorm, or let a
`TypeConverter` hint the column type.

**Workaround here:** after schema generation the demo loader alters the column to `TEXT`
(`TextColumns` in `...example.bath.demo`); on PostgreSQL it logs `Widened geometry columns [asset.geometry]`.

## 4. emf.persistence-jpa — [#313](https://github.com/eclipse-fennec/emf.persistence-jpa/issues/313): repository published before its unit accepts requests

When a `fennec.jpa.EMPersistenceUnit` activates, it registers its `JPAUnit`. Within the same
call stack:
1. `fennec.repository.jpa` registers the `Repository`.
2. That satisfies a consumer component, which is activated synchronously.
3. The consumer's first access fails with
   `IllegalStateException: No persistence unit 'bath' is available for URI 'jpa://bath/Asset'`
   (`JPAUnit.unavailable`).

"Presence indicates functionality" does not hold for the repository in this window.

**Workaround here:** the demo loader works asynchronously and retries
(`BathDataLoader`).

## 5. emf.persistence-jpa — [comment on #262](https://github.com/eclipse-fennec/emf.persistence-jpa/issues/262#issuecomment-5812601905) (G-P4, geo on JPA/PostGIS)

A consumer for G-P4 (#207 rule): OGC API Features on JPA.

- Features are polygons, lines and points, not only points.
- The interim stores the geometry as GeoJSON text plus four persisted bbox attributes.
  The store evaluates `bbox` and the envelope part of `S_INTERSECTS` as numeric
  comparisons; the exact relation (JTS) runs in memory.
- With a residual, paging and counting move to memory as well.

What we would push down with PostGIS:
- `ST_Intersects`, `ST_Within`, `ST_Contains`, `ST_Disjoint` & co. between a geometry
  column and a literal, CRS84.
- Envelope overlap `&&` for the bbox parameter.
- A spatial column type in the eorm mapping, filled from the GeoJSON EDataType.

## 6. emf.persistence-jpa — [#314](https://github.com/eclipse-fennec/emf.persistence-jpa/issues/314): ExtendedMetaData names become column names unchecked

The derived mapping takes the ExtendedMetaData `name` of an attribute as its column name.
A name that is fine in JSON or XML but no SQL identifier breaks the schema generation. For
example, `marker-color` from a simplestyle GeoJSON produces
`CREATE TABLE CITYFEATURE (… marker-color VARCHAR …)`, which fails with
`JdbcSQLSyntaxErrorException`. After that, every query on the unit fails with "table not
found".

Suggestion: quote such names, sanitize them, or map the attribute name instead.

**Workaround here:** GeoJSON property names that are no identifiers are mapped with our own
annotation detail `property` (`OgcFeaturesAnnotations.PROPERTY`) instead of ExtendedMetaData.

## 7. emf.persistence-jpa — [#315](https://github.com/eclipse-fennec/emf.persistence-jpa/issues/315): id warning for every SINGLE_TABLE subclass

`IdConfigurator.configureIds` logs `No IDs specified for entity Lawn` for every
subclass of a `SINGLE_TABLE` root, although the id is inherited from the root.

## 8. emf.codec [#225](https://github.com/eclipse-fennec/emf.codec/issues/225) and common.models [#24](https://github.com/eclipse-fennec/common.models/issues/24) — GeoJSON: unchecked parse errors, elevation 0.0 on every position

- `GeoJsonResourceImpl.load` lets `tools.jackson.core.exc.*` escape unchecked instead of
  reporting an `IOException` or resource error for invalid JSON.
- `save` writes `[lon, lat, 0.0]` for positions whose elevation was never set. The cause is
  in the model, not the codec: `GeoJsonHelper.convertCoordinates` omits the elevation only
  when it is NaN, but its default is 0.0 (hence the issue in common.models). RFC 7946
  positions without elevation should stay two-dimensional (`Coordinates.elevation` is
  unset, `eIsSet` can tell).

**Workaround here:** `GeoJsonText.read` catches `RuntimeException`; the OGC output is
written by our own `GeometryJson`, which omits unset elevations.


## 9. emf.osgi — codegen: a cross reference by nsURI fails in ecore mode

In ecore mode (`-generate … ecore=model/x.ecore`), the genmodel derivation does not resolve
a cross-package reference written with the nsURI, e.g.
`eType="ecore:EClass https://geojson.org/model/2016#//Geometry"`. The referenced package is
not found, no usedGenPackage is linked, and the generator fails with
`NullPointerException … GenPackageImpl.findGenClassifier(…) is null`. EMF accepts the nsURI
form otherwise. The form `platform:/plugin/org.geojson.model/model/geojson.ecore#//Geometry`
works.

Suggestion: resolve nsURI references through the buildpath model map the codegen already
builds (it logs `https://geojson.org/model/2016 - /model/geojson.ecore`), or at least fail
with a message naming the unresolved reference.

**Workaround here:** `net.opengis.cql2.model/model/cql2.ecore` uses the
`platform:/plugin/…` form.

## 10. common.models — [#27](https://github.com/eclipse-fennec/common.models/issues/27): geojson `data` attributes are volatile but not derived

Every geometry exposes its coordinates a second time as a volatile `double[]` attribute
`data`, which is neither `derived` nor `transient`. `EcoreUtil.equals` compares it by array
identity, so two geometries with the same coordinates are never equal.

**Workaround here:** `Cql2SpecExamplesTest` compares with an `EqualityHelper` that compares
arrays by content.

## 11. emf.persistence-jpa — [#316](https://github.com/eclipse-fennec/emf.persistence-jpa/issues/316): embedded H2 loses the last commits on the idle close

After `emfIdleTimeout` (60 s) the unit closes its factory, the last connection closes and H2
closes the embedded database. After the reopen the most recently committed types were gone,
without any DELETE in the SQL log. `create-tables` does not help; `DB_CLOSE_DELAY=-1` does, and
PostgreSQL is not affected.

**Workaround here:** the H2 identifier of the demo carries `DB_CLOSE_DELAY=-1`, and the demo
also runs on PostgreSQL (`bath-postgres.bndrun`). Both use `ddl-generation=create-tables`.
