/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * SPDX-License-Identifier: EPL-2.0
 *
 * Map viewer for the Fennec OGC API Features server. Every collection becomes a GeoJSON
 * source with fill, line and circle layers; the layer panel shows the collections as a tree of
 * their layerGroup paths ("Town/Facility/Water") and colours them by their style. Features are fetched for the visible bbox.
 */
import * as maplibregl from './maplibre/maplibre-gl.mjs';

const API = new URL('../', window.location.href);
const PAGE_SIZE = 10000;
const FALLBACK_COLORS = ['#1e88e5', '#43a047', '#fb8c00', '#8e24aa', '#e53935', '#00acc1', '#6d4c41', '#546e7a'];
const UNGROUPED = 'Weitere';

const state = { collections: [], visible: new Set(), counts: new Map(), styles: new Map() };

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

/** the style of a collection is a CSS color or a JSON object {"color", "fillOpacity", "labels"} */
function styleOf(collection, index) {
  const fallback = { color: FALLBACK_COLORS[index % FALLBACK_COLORS.length], fillOpacity: 0.45, labels: true };
  const style = collection.style;
  if (!style) return fallback;
  try {
    const parsed = JSON.parse(style);
    return { color: parsed.color ?? fallback.color, fillOpacity: parsed.fillOpacity ?? fallback.fillOpacity,
      labels: parsed.labels ?? true };
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
  // gathers the features of other collections, e.g. all assets of a facility
  return collection.aggregate === true;
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

// read before the map exists: with hash enabled it writes its own position into the URL at once
const startedWithPosition = /^#\d/.test(window.location.hash);

const map = new maplibregl.Map({
  container: 'map',
  style: baseStyle(),
  center: [10.45, 51.16],
  zoom: 5,
  maxZoom: 22,
  hash: true,
  attributionControl: { compact: true }
});
map.addControl(new maplibregl.NavigationControl(), 'top-right');
map.addControl(new maplibregl.ScaleControl({ unit: 'metric' }), 'bottom-right');

function sourceId(c) { return `c-${c.id}`; }

function addCollectionLayers(collection, style) {
  const { color, fillOpacity } = style;
  const source = sourceId(collection);
  map.addSource(source, { type: 'geojson', data: { type: 'FeatureCollection', features: [] } });
  // a feature may carry its own colour (property color), e.g. buildings by type
  const own = ['coalesce', ['get', 'color'], color];
  const outline = ['match', ['get', 'status'], 'MAINTENANCE', '#c62828', 'CLOSED', '#424242', own];
  const opacity = ['match', ['get', 'status'], 'MAINTENANCE', fillOpacity * 0.4, 'CLOSED', fillOpacity * 0.4, fillOpacity];
  return {
    fill: { id: `${source}-fill`, type: 'fill', source, filter: ['==', ['geometry-type'], 'Polygon'],
      paint: { 'fill-color': own, 'fill-opacity': opacity } },
    outline: { id: `${source}-outline`, type: 'line', source, filter: ['==', ['geometry-type'], 'Polygon'],
      paint: { 'line-color': outline, 'line-width': 1.5 } },
    line: { id: `${source}-line`, type: 'line', source, filter: ['==', ['geometry-type'], 'LineString'],
      layout: { 'line-cap': 'round', 'line-join': 'round' },
      paint: { 'line-color': outline, 'line-width': ['interpolate', ['linear'], ['zoom'], 16, 2, 20, 6] } },
    circle: { id: `${source}-circle`, type: 'circle', source, filter: ['==', ['geometry-type'], 'Point'],
      paint: { 'circle-color': own, 'circle-radius': ['interpolate', ['linear'], ['zoom'], 16, 4, 20, 9],
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
  const labels = document.getElementById('labels').checked && state.styles.get(collection.id).labels;
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

/** the layer groups as a tree: "Dim Stadt/Freizeitbad WOGE/Wasser" nests three folders */
function groupTree(collections, styles) {
  const root = { name: null, folders: new Map(), entries: [] };
  for (const c of collections) {
    let node = root;
    for (const part of (c.layerGroup ?? UNGROUPED).split('/').map(p => p.trim()).filter(Boolean)) {
      if (!node.folders.has(part)) node.folders.set(part, { name: part, folders: new Map(), entries: [] });
      node = node.folders.get(part);
    }
    node.entries.push({ collection: c, color: styles.get(c.id).color });
  }
  return root;
}

function collectionsBelow(node) {
  return [...node.entries.map(e => e.collection), ...[...node.folders.values()].flatMap(collectionsBelow)];
}

function buildPanel(tree) {
  const container = document.getElementById('layers');
  container.replaceChildren();
  const refresh = [];
  const render = (node, parent, depth) => {
    // sub folders first, so that a facility shows at the top of its town; the aggregate last
    for (const folder of node.folders.values()) {
      const section = document.createElement('div');
      section.className = `group depth-${Math.min(depth, 3)}`;
      const label = document.createElement('label');
      const box = document.createElement('input');
      box.type = 'checkbox';
      const below = collectionsBelow(folder);
      box.addEventListener('change', () => {
        for (const c of below) if (!isAggregate(c)) setVisible(c, box.checked);
        refresh.forEach(r => r());
      });
      refresh.push(() => { box.checked = below.filter(c => !isAggregate(c)).every(c => state.visible.has(c.id)); });
      label.append(box, document.createTextNode(folder.name));
      section.append(label);
      render(folder, section, depth + 1);
      parent.append(section);
    }
    const entries = [...node.entries].sort((a, b) => isAggregate(a.collection) - isAggregate(b.collection));
    for (const { collection, color } of entries) {
      const row = document.createElement('div');
      row.className = 'layer';
      const label = document.createElement('label');
      const box = document.createElement('input');
      box.type = 'checkbox';
      box.addEventListener('change', () => { setVisible(collection, box.checked); refresh.forEach(r => r()); });
      refresh.push(() => { box.checked = state.visible.has(collection.id); });
      const swatch = document.createElement('span');
      swatch.className = 'swatch';
      swatch.style.background = color;
      label.append(box, swatch, document.createTextNode(collection.title));
      const count = document.createElement('span');
      count.className = 'count';
      count.dataset.count = collection.id;
      row.append(label, count);
      parent.append(row);
    }
  };
  render(tree, container, 0);
  refresh.forEach(r => r());
}

function escapeHtml(text) {
  return String(text).replace(/[&<>"']/g, c => ({ '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&#39;' }[c]));
}

function popupHtml(feature, collection) {
  const p = feature.properties;
  const rows = Object.entries(p).filter(([k]) => k !== 'name' && k !== 'color')
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
  state.styles = styles;
  const specs = collections.map(c => ({ collection: c, layers: addCollectionLayers(c, styles.get(c.id)) }));
  // large areas first so that smaller ones stay clickable on top, then lines, points and labels
  const byArea = [...specs].sort((a, b) => area(extentOf(b.collection)) - area(extentOf(a.collection)));
  for (const kind of ['fill', 'outline', 'line', 'circle', 'label']) {
    for (const { layers } of (kind === 'fill' || kind === 'outline') ? byArea : specs) {
      map.addLayer({ ...layers[kind], layout: { ...(layers[kind].layout ?? {}), visibility: 'none' } });
    }
  }

  for (const c of collections) if (!isAggregate(c)) state.visible.add(c.id);
  buildPanel(groupTree(collections, styles));

  // start at the smallest collection that aggregates others (e.g. all assets of a facility), else show everything
  const aggregates = collections.filter(isAggregate).map(extentOf).filter(Boolean).sort((a, b) => area(a) - area(b));
  const extents = aggregates.length ? [aggregates[0]] : collections.map(extentOf).filter(Boolean);
  if (extents.length && !startedWithPosition) {
    const all = extents.reduce((a, b) => [Math.min(a[0], b[0]), Math.min(a[1], b[1]), Math.max(a[2], b[2]), Math.max(a[3], b[3])]);
    map.fitBounds([[all[0], all[1]], [all[2], all[3]]], { padding: { top: 40, bottom: 40, left: 320, right: 40 }, duration: 0 });
  }
  for (const c of collections) setVisible(c, state.visible.has(c.id));

  // one popup for the topmost feature under the pointer, not one per layer it hits
  const collectionOfLayer = new Map();
  for (const { collection } of specs) {
    for (const id of layerIds(collection)) {
      const invisibleFill = id.endsWith('-fill') && styles.get(collection.id).fillOpacity === 0;
      if (!id.endsWith('-label') && !invisibleFill) collectionOfLayer.set(id, collection);
    }
  }
  const clickable = [...collectionOfLayer.keys()];
  map.on('click', e => {
    const hit = map.queryRenderedFeatures(e.point, { layers: clickable.filter(id => map.getLayoutProperty(id, 'visibility') === 'visible') })[0];
    if (hit) {
      new maplibregl.Popup({ maxWidth: '300px' }).setLngLat(e.lngLat)
        .setHTML(popupHtml(hit, collectionOfLayer.get(hit.layer.id))).addTo(map);
    }
  });
  map.on('mousemove', e => {
    const visible = clickable.filter(id => map.getLayoutProperty(id, 'visibility') === 'visible');
    map.getCanvas().style.cursor = map.queryRenderedFeatures(e.point, { layers: visible }).length ? 'pointer' : '';
  });

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
