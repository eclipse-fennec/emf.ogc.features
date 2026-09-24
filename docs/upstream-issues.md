# Upstream findings

Gaps and bugs in the libraries this project builds on, found while building OGC Features.
We report them to the projects they belong to and work around them here. Each entry names
the workaround, so it can be removed once the upstream fix lands.

Status: **drafts, not posted yet.**

---

## 1. emf.persistence-jpa — comment on #308 (read path skips the TypeConverter)

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

## 2. emf.persistence-jpa — new: generated classes are not used as entity classes

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

## 3. emf.persistence-jpa — new: String basic attributes are VARCHAR(255) on PostgreSQL

`AttributeConfigurator.processBasic()` does not evaluate the eorm `Column.length`,
`Column.columnDefinition` or `Lob` of a basic attribute. On PostgreSQL, EclipseLink creates
`VARCHAR(255)` for every String attribute, including those a `TypeConverter` maps to
String. A GeoJSON polygon exceeds 255 characters quickly. H2 has no such limit.

Suggestion: honour `length`/`columnDefinition`/`lob` from the eorm, or let a
`TypeConverter` hint the column type.

**Workaround here:** after schema generation the demo loader alters the column to `TEXT`
(`TextColumns` in `...example.bath.demo`); on PostgreSQL it logs `Widened geometry columns [asset.geometry]`.

## 4. emf.persistence-jpa — new: repository published before its unit accepts requests

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

## 5. emf.persistence-jpa — comment on #262 (G-P4, geo on JPA/PostGIS)

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

## 6. emf.persistence-jpa — minor: id warning for every SINGLE_TABLE subclass

`IdConfigurator.configureIds` logs `No IDs specified for entity Lawn` for every
subclass of a `SINGLE_TABLE` root, although the id is inherited from the root.

## 7. emf.codec — geojson: unchecked parse errors, elevation 0.0 on every position

- `GeoJsonResourceImpl.load` lets `tools.jackson.core.exc.*` escape unchecked instead of
  reporting an `IOException` or resource error for invalid JSON.
- `save` writes `[lon, lat, 0.0]` for positions whose elevation was never set. RFC 7946
  positions without elevation should stay two-dimensional (`Coordinates.elevation` is
  unset, `eIsSet` can tell).

**Workaround here:** `GeoJsonText.read` catches `RuntimeException`; the OGC output is
written by our own `GeometryJson`, which omits unset elevations.

