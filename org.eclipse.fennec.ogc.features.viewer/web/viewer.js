/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * SPDX-License-Identifier: EPL-2.0
 *
 * Map viewer for the Fennec OGC API Features server. Every collection becomes a GeoJSON
 * source with fill, line and circle layers; the layer panel groups the collections by their
 * layerGroup and colours them by their style. Features are fetched for the visible bbox.
 */
import * as maplibregl from './maplibre/maplibre-gl.mjs';

const API = new URL('../', window.location.href);
const PAGE_SIZE = 1000;
const FALLBACK_COLORS = ['#1e88e5', '#43a047', '#fb8c00', '#8e24aa', '#e53935', '#00acc1', '#6d4c41', '#546e7a'];
const AGGREGATE_GROUP = 'Alle Anlagen';

const state = { collections: [], visible: new Set(), counts: new Map() };

function api(path, params = {}) {
  const url = new URL(path, API);
  url.searchParams.set('f', 'json');
  for (const [k, v] of Object.entries(params)) url.searchParams.set(k, v);
  return url;
}

async function getJson(url) {
  const response = await fetch(url, { headers: { Accept: 'application/json' } });
  if (!response.ok) throw new Error(`${response.status} ${url}`);
  return response.json();
}

/** the style of a collection is a CSS color or a JSON object {"color": ..., "fillOpacity": ...} */
function styleOf(collection, index) {
  const fallback = { color: FALLBACK_COLORS[index % FALLBACK_COLORS.length], fillOpacity: 0.45 };
  const style = collection.style;
  if (!style) return fallback;
  try {
    const parsed = JSON.parse(style);
    return { color: parsed.color ?? fallback.color, fillOpacity: parsed.fillOpacity ?? fallback.fillOpacity };
  } catch {
    return { ...fallback, color: style };
  }
}

function extentOf(collection) {
  return collection.extent?.spatial?.bbox?.[0];
}

function area(bbox) {
  return bbox ? (bbox[2] - bbox[0]) * (bbox[3] - bbox[1]) : 0;
}

function isAggregate(collection) {
  // a collection whose extent covers all others and has no group is shown as "all assets"
  return !collection.layerGroup;
}

function baseStyle() {
  return {
    version: 8,
    glyphs: 'https://demotiles.maplibre.org/font/{fontstack}/{range}.pbf',
    sources: {
      osm: {
        type: 'raster',
        tiles: ['https://tile.openstreetmap.org/{z}/{x}/{y}.png'],
        tileSize: 256,
        maxzoom: 19,
        attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a>-Mitwirkende'
      }
    },
    layers: [
      { id: 'background', type: 'background', paint: { 'background-color': '#eef2f5' } },
      { id: 'osm', type: 'raster', source: 'osm', paint: { 'raster-opacity': 0.85 } }
    ]
  };
}

const map = new maplibregl.Map({
  container: 'map',
  style: baseStyle(),
  center: [11.616, 50.9057],
  zoom: 17,
  maxZoom: 22,
  attributionControl: { compact: true }
});
map.addControl(new maplibregl.NavigationControl(), 'top-right');
map.addControl(new maplibregl.ScaleControl({ unit: 'metric' }), 'bottom-right');

function sourceId(c) { return `c-${c.id}`; }

function addCollectionLayers(collection, style) {
  const { color, fillOpacity } = style;
  const source = sourceId(collection);
  map.addSource(source, { type: 'geojson', data: { type: 'FeatureCollection', features: [] } });
  const outline = ['match', ['get', 'status'], 'MAINTENANCE', '#c62828', 'CLOSED', '#424242', color];
  const opacity = ['match', ['get', 'status'], 'MAINTENANCE', fillOpacity * 0.4, 'CLOSED', fillOpacity * 0.4, fillOpacity];
  return {
    fill: { id: `${source}-fill`, type: 'fill', source, filter: ['==', ['geometry-type'], 'Polygon'],
      paint: { 'fill-color': color, 'fill-opacity': opacity } },
    outline: { id: `${source}-outline`, type: 'line', source, filter: ['==', ['geometry-type'], 'Polygon'],
      paint: { 'line-color': outline, 'line-width': 1.5 } },
    line: { id: `${source}-line`, type: 'line', source, filter: ['==', ['geometry-type'], 'LineString'],
      layout: { 'line-cap': 'round', 'line-join': 'round' },
      paint: { 'line-color': outline, 'line-width': ['interpolate', ['linear'], ['zoom'], 16, 2, 20, 6] } },
    circle: { id: `${source}-circle`, type: 'circle', source, filter: ['==', ['geometry-type'], 'Point'],
      paint: { 'circle-color': color, 'circle-radius': ['interpolate', ['linear'], ['zoom'], 16, 4, 20, 9],
        'circle-stroke-color': '#ffffff', 'circle-stroke-width': 1.5 } },
    label: { id: `${source}-label`, type: 'symbol', source, minzoom: 17.5,
      layout: { 'text-field': ['get', 'name'], 'text-font': ['Open Sans Semibold'], 'text-size': 12,
        'text-offset': [0, 0.9], 'text-anchor': 'top', 'text-optional': true },
      paint: { 'text-color': '#1d2733', 'text-halo-color': '#ffffff', 'text-halo-width': 1.4 } }
  };
}

function layerIds(collection) {
  const s = sourceId(collection);
  return [`${s}-fill`, `${s}-outline`, `${s}-line`, `${s}-circle`, `${s}-label`];
}

function setVisible(collection, visible) {
  if (visible) state.visible.add(collection.id); else state.visible.delete(collection.id);
  const labels = document.getElementById('labels').checked;
  for (const id of layerIds(collection)) {
    const show = visible && (!id.endsWith('-label') || labels);
    map.setLayoutProperty(id, 'visibility', show ? 'visible' : 'none');
  }
  if (visible) load(collection);
}

let loadToken = 0;
async function load(collection) {
  const b = map.getBounds();
  const bbox = [b.getWest(), b.getSouth(), b.getEast(), b.getNorth()].map(v => v.toFixed(7)).join(',');
  const token = ++loadToken;
  try {
    const page = await getJson(api(`collections/${encodeURIComponent(collection.id)}/items`, { bbox, limit: PAGE_SIZE }));
    map.getSource(sourceId(collection)).setData(page);
    state.counts.set(collection.id, page.numberMatched ?? page.numberReturned);
    const badge = document.querySelector(`[data-count="${CSS.escape(collection.id)}"]`);
    if (badge) badge.textContent = state.counts.get(collection.id);
  } catch (e) {
    if (token === loadToken) console.warn('Loading', collection.id, 'failed:', e);
  }
}

function reloadVisible() {
  for (const c of state.collections) if (state.visible.has(c.id)) load(c);
}

function buildPanel(groups) {
  const container = document.getElementById('layers');
  container.replaceChildren();
  for (const [group, entries] of groups) {
    const section = document.createElement('div');
    section.className = 'group';
    const groupLabel = document.createElement('label');
    const groupBox = document.createElement('input');
    groupBox.type = 'checkbox';
    groupBox.checked = entries.every(e => state.visible.has(e.collection.id));
    groupLabel.append(groupBox, document.createTextNode(group));
    section.append(groupLabel);
    const boxes = [];
    for (const { collection, color } of entries) {
      const row = document.createElement('div');
      row.className = 'layer';
      const label = document.createElement('label');
      const box = document.createElement('input');
      box.type = 'checkbox';
      box.checked = state.visible.has(collection.id);
      box.addEventListener('change', () => {
        setVisible(collection, box.checked);
        groupBox.checked = boxes.every(b => b.checked);
      });
      boxes.push(box);
      const swatch = document.createElement('span');
      swatch.className = 'swatch';
      swatch.style.background = color;
      label.append(box, swatch, document.createTextNode(collection.title));
      const count = document.createElement('span');
      count.className = 'count';
      count.dataset.count = collection.id;
      row.append(label, count);
      section.append(row);
    }
    groupBox.addEventListener('change', () => {
      boxes.forEach((b, i) => { b.checked = groupBox.checked; setVisible(entries[i].collection, groupBox.checked); });
    });
    container.append(section);
  }
}

function escapeHtml(text) {
  return String(text).replace(/[&<>"']/g, c => ({ '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&#39;' }[c]));
}

function popupHtml(feature, collection) {
  const p = feature.properties;
  const rows = Object.entries(p).filter(([k]) => k !== 'name')
    .map(([k, v]) => `<tr><td>${escapeHtml(k)}</td><td>${escapeHtml(v)}</td></tr>`).join('');
  const href = new URL(`collections/${encodeURIComponent(collection.id)}/items/${encodeURIComponent(feature.id)}?f=html`, API);
  return `<div class="popup"><h2>${escapeHtml(p.name ?? feature.id)}</h2>`
    + `<div class="type">${escapeHtml(collection.title)}</div><table>${rows}</table>`
    + `<p><a href="${href}" target="_blank" rel="noopener">Details</a></p></div>`;
}

async function init() {
  const landing = await getJson(api(''));
  document.getElementById('title').textContent = landing.title ?? 'Asset-Karte';
  document.title = landing.title ?? document.title;
  const { collections } = await getJson(api('collections'));
  state.collections = collections;

  const styles = new Map(collections.map((c, i) => [c.id, styleOf(c, i)]));
  const specs = collections.map(c => ({ collection: c, layers: addCollectionLayers(c, styles.get(c.id)) }));
  // large areas first so that smaller ones stay clickable on top, then lines, points and labels
  const byArea = [...specs].sort((a, b) => area(extentOf(b.collection)) - area(extentOf(a.collection)));
  for (const kind of ['fill', 'outline', 'line', 'circle', 'label']) {
    for (const { layers } of (kind === 'fill' || kind === 'outline') ? byArea : specs) {
      map.addLayer({ ...layers[kind], layout: { ...(layers[kind].layout ?? {}), visibility: 'none' } });
    }
  }

  const groups = new Map();
  for (const c of collections) {
    const group = isAggregate(c) ? AGGREGATE_GROUP : c.layerGroup;
    if (!groups.has(group)) groups.set(group, []);
    groups.get(group).push({ collection: c, color: styles.get(c.id).color });
  }
  // the aggregate collection duplicates all others, so it starts hidden and is listed last
  const ordered = [...groups].sort(([a], [b]) => (a === AGGREGATE_GROUP) - (b === AGGREGATE_GROUP));
  for (const c of collections) if (!isAggregate(c)) state.visible.add(c.id);
  buildPanel(ordered);

  const extents = collections.map(extentOf).filter(Boolean);
  if (extents.length) {
    const all = extents.reduce((a, b) => [Math.min(a[0], b[0]), Math.min(a[1], b[1]), Math.max(a[2], b[2]), Math.max(a[3], b[3])]);
    map.fitBounds([[all[0], all[1]], [all[2], all[3]]], { padding: { top: 40, bottom: 40, left: 320, right: 40 }, duration: 0 });
  }
  for (const c of collections) setVisible(c, state.visible.has(c.id));

  const clickable = specs.flatMap(({ collection }) => layerIds(collection).filter(id => !id.endsWith('-label'))
    .map(id => ({ id, collection })));
  for (const { id, collection } of clickable) {
    map.on('click', id, e => {
      const feature = e.features[0];
      new maplibregl.Popup({ maxWidth: '300px' }).setLngLat(e.lngLat).setHTML(popupHtml(feature, collection)).addTo(map);
    });
    map.on('mouseenter', id, () => { map.getCanvas().style.cursor = 'pointer'; });
    map.on('mouseleave', id, () => { map.getCanvas().style.cursor = ''; });
  }

  let timer;
  map.on('moveend', () => { clearTimeout(timer); timer = setTimeout(reloadVisible, 250); });
}

document.getElementById('collapse').addEventListener('click', e => {
  const panel = document.getElementById('panel');
  panel.classList.toggle('collapsed');
  e.currentTarget.setAttribute('aria-expanded', String(!panel.classList.contains('collapsed')));
});
document.getElementById('basemap').addEventListener('change', e => {
  map.setLayoutProperty('osm', 'visibility', e.target.value === 'osm' ? 'visible' : 'none');
});
document.getElementById('labels').addEventListener('change', () => {
  for (const c of state.collections) setVisible(c, state.visible.has(c.id));
});

map.on('load', () => init().catch(e => {
  document.getElementById('layers').innerHTML = `<p class="muted">Fehler: ${escapeHtml(e.message)}</p>`;
}));
