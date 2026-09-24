/**
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.eclipse.fennec.ogc.features.runtime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;

import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.Envelope;
import org.qgis.project.CheckState;
import org.qgis.project.Crs;
import org.qgis.project.CustomOrder;
import org.qgis.project.DataDefinedProperties;
import org.qgis.project.Extent;
import org.qgis.project.LabelSettings;
import org.qgis.project.Labeling;
import org.qgis.project.LayerOrder;
import org.qgis.project.LayerRef;
import org.qgis.project.LayerTreeGroup;
import org.qgis.project.LayerTreeLayer;
import org.qgis.project.MapLayer;
import org.qgis.project.Option;
import org.qgis.project.Placement;
import org.qgis.project.Project;
import org.qgis.project.ProjectLayers;
import org.qgis.project.ProjectViewSettings;
import org.qgis.project.Properties;
import org.qgis.project.Provider;
import org.qgis.project.QgisFactory;
import org.qgis.project.Renderer;
import org.qgis.project.Rendering;
import org.qgis.project.SpatialRefSys;
import org.qgis.project.SpatialRefSysProperties;
import org.qgis.project.Symbol;
import org.qgis.project.SymbolLayer;
import org.qgis.project.Symbols;
import org.qgis.project.TextBuffer;
import org.qgis.project.TextStyle;
import org.qgis.project.TypedValue;
import org.qgis.project.io.QgisProjectFiles;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

/**
 * The collections as a QGIS project: one OGC API Features layer per collection, grouped by the
 * layer groups, drawn and styled as the map viewer draws them, on top of OpenStreetMap.
 * <p>
 * A QGIS layer has one geometry type, which QGIS takes from the first features, so a collection
 * with mixed types shows only the type of its first feature.
 */
final class QgisProject {

	/** the geometry type of a layer */
	enum Kind {
		POINT, LINE, POLYGON
	}

	/**
	 * @param view the collection
	 * @param kind its geometry type, the one of its first feature
	 */
	record Layer(CollectionView view, Kind kind) {
	}

	/** the style hints of a collection, as the viewer reads them */
	record Style(String color, double fillOpacity, boolean labels) {
	}

	private static final QgisFactory F = QgisFactory.eINSTANCE;
	/** the fallback colours of the viewer, by collection index */
	private static final List<String> FALLBACK_COLORS = List.of("#1e88e5", "#43a047", "#fb8c00", "#8e24aa",
			"#e53935", "#00acc1", "#6d4c41", "#546e7a");
	private static final Pattern HEX = Pattern.compile("#([0-9a-fA-F]{3}|[0-9a-fA-F]{6})");
	private static final JsonMapper MAPPER = JsonMapper.builder().build();
	/** labels from this scale on, about zoom 17.5 of the viewer */
	private static final int LABEL_SCALE = 5000;
	private static final String OSM_ID = "openstreetmap";
	private static final String OSM_SOURCE = "type=xyz&url=https://tile.openstreetmap.org/{z}/{x}/{y}.png&zmax=19&zmin=0";
	private static final double EARTH_HALF_CIRCUMFERENCE = 20037508.342789244;

	/** QGIS takes a CRS for invalid without its full definition, and then draws nothing */
	private static final String WEB_MERCATOR_WKT = "PROJCRS[\"WGS 84 / Pseudo-Mercator\",BASEGEOGCRS[\"WGS 84\","
			+ "ENSEMBLE[\"World Geodetic System 1984 ensemble\",MEMBER[\"World Geodetic System 1984 (Transit)\"],"
			+ "MEMBER[\"World Geodetic System 1984 (G730)\"],MEMBER[\"World Geodetic System 1984 (G873)\"],"
			+ "MEMBER[\"World Geodetic System 1984 (G1150)\"],MEMBER[\"World Geodetic System 1984 (G1674)\"],"
			+ "MEMBER[\"World Geodetic System 1984 (G1762)\"],MEMBER[\"World Geodetic System 1984 (G2139)\"],"
			+ "ELLIPSOID[\"WGS 84\",6378137,298.257223563,LENGTHUNIT[\"metre\",1]],ENSEMBLEACCURACY[2.0]],"
			+ "PRIMEM[\"Greenwich\",0,ANGLEUNIT[\"degree\",0.0174532925199433]],ID[\"EPSG\",4326]],"
			+ "CONVERSION[\"Popular Visualisation Pseudo-Mercator\",METHOD[\"Popular Visualisation Pseudo Mercator\","
			+ "ID[\"EPSG\",1024]],PARAMETER[\"Latitude of natural origin\",0,ANGLEUNIT[\"degree\",0.0174532925199433],"
			+ "ID[\"EPSG\",8801]],PARAMETER[\"Longitude of natural origin\",0,ANGLEUNIT[\"degree\",0.0174532925199433],"
			+ "ID[\"EPSG\",8802]],PARAMETER[\"False easting\",0,LENGTHUNIT[\"metre\",1],ID[\"EPSG\",8806]],"
			+ "PARAMETER[\"False northing\",0,LENGTHUNIT[\"metre\",1],ID[\"EPSG\",8807]]],CS[Cartesian,2],"
			+ "AXIS[\"easting (X)\",east,ORDER[1],LENGTHUNIT[\"metre\",1]],AXIS[\"northing (Y)\",north,ORDER[2],"
			+ "LENGTHUNIT[\"metre\",1]],USAGE[SCOPE[\"Web mapping and visualisation.\"],"
			+ "AREA[\"World between 85.06°S and 85.06°N.\"],BBOX[-85.06,-180,85.06,180]],ID[\"EPSG\",3857]]";
	private static final String WEB_MERCATOR_PROJ4 = "+proj=merc +a=6378137 +b=6378137 +lat_ts=0 +lon_0=0 +x_0=0 "
			+ "+y_0=0 +k=1 +units=m +nadgrids=@null +wktext +no_defs";
	private static final String CRS84_WKT = "GEOGCRS[\"WGS 84 (CRS84)\",ENSEMBLE[\"World Geodetic System 1984 ensemble\","
			+ "MEMBER[\"World Geodetic System 1984 (Transit)\"],MEMBER[\"World Geodetic System 1984 (G730)\"],"
			+ "MEMBER[\"World Geodetic System 1984 (G873)\"],MEMBER[\"World Geodetic System 1984 (G1150)\"],"
			+ "MEMBER[\"World Geodetic System 1984 (G1674)\"],MEMBER[\"World Geodetic System 1984 (G1762)\"],"
			+ "MEMBER[\"World Geodetic System 1984 (G2139)\"],ELLIPSOID[\"WGS 84\",6378137,298.257223563,"
			+ "LENGTHUNIT[\"metre\",1]],ENSEMBLEACCURACY[2.0]],PRIMEM[\"Greenwich\",0,ANGLEUNIT[\"degree\",0.0174532925199433]],"
			+ "CS[ellipsoidal,2],AXIS[\"geodetic longitude (Lon)\",east,ORDER[1],ANGLEUNIT[\"degree\",0.0174532925199433]],"
			+ "AXIS[\"geodetic latitude (Lat)\",north,ORDER[2],ANGLEUNIT[\"degree\",0.0174532925199433]],"
			+ "USAGE[SCOPE[\"Not known.\"],AREA[\"World.\"],BBOX[-90,-180,90,180]],ID[\"OGC\",\"CRS84\"]]";

	private QgisProject() {
	}

	/**
	 * @param title the project title
	 * @param apiUrl the base URL of the API
	 * @param layers the collections, in collection order
	 * @return the project file ({@code .qgs})
	 */
	static byte[] write(String title, String apiUrl, List<Layer> layers) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			QgisProjectFiles.write(project(title, apiUrl, layers), out);
		} catch (IOException e) {
			throw new UncheckedIOException("Cannot write the QGIS project", e);
		}
		return out.toByteArray();
	}

	/**
	 * @param title the project title
	 * @param apiUrl the base URL of the API
	 * @param layers the collections, in collection order
	 * @return the project
	 */
	static Project project(String title, String apiUrl, List<Layer> layers) {
		Map<Layer, String> ids = new LinkedHashMap<>();
		Map<Layer, Style> styles = new LinkedHashMap<>();
		for (int i = 0; i < layers.size(); i++) {
			Layer layer = layers.get(i);
			// QGIS replaces a layer id of up to ten characters by a generated one, which breaks the
			// references from the layer tree and the drawing order
			ids.put(layer, "ogc_features_" + layer.view().descriptor().id().replaceAll("[^A-Za-z0-9_]", "_"));
			styles.put(layer, style(layer.view().descriptor(), i));
		}
		List<String> drawOrder = drawOrder(layers, ids);

		Project project = F.createProject();
		// the oldest version the written parts are known to load in
		project.setVersion("3.34.0");
		project.setProjectname(title);
		project.setTitle(title);
		project.setProjectCrs(crs(webMercator()));

		LayerTreeGroup root = F.createLayerTreeGroup();
		tree(root, Group.of(layers), ids, apiUrl);
		root.getLayers().add(treeLayer(OSM_ID, "OpenStreetMap", "wms", OSM_SOURCE, true));
		CustomOrder order = F.createCustomOrder();
		order.setEnabled("1");
		order.getItems().addAll(drawOrder);
		root.setCustomOrder(order);
		project.setLayerTreeGroup(root);

		ProjectLayers projectLayers = F.createProjectLayers();
		for (Layer layer : layers) {
			projectLayers.getLayers().add(vectorLayer(layer, ids.get(layer), styles.get(layer), apiUrl));
		}
		projectLayers.getLayers().add(osmLayer());
		project.setProjectLayers(projectLayers);

		LayerOrder layerOrder = F.createLayerOrder();
		for (String id : drawOrder) {
			LayerRef ref = F.createLayerRef();
			ref.setId(id);
			layerOrder.getLayers().add(ref);
		}
		project.setLayerOrder(layerOrder);

		Properties properties = F.createProperties();
		SpatialRefSysProperties crsProperties = F.createSpatialRefSysProperties();
		crsProperties.setProjectionsEnabled(typed("int", "1"));
		properties.setSpatialRefSys(crsProperties);
		project.setProperties(properties);

		startExtent(layers).map(QgisProject::viewSettings).ifPresent(project::setViewSettings);
		return project;
	}

	/**
	 * @param descriptor the collection
	 * @param index the position of the collection, selects the fallback colour
	 * @return the style hints, as the viewer reads them
	 */
	static Style style(CollectionDescriptor descriptor, int index) {
		Style fallback = new Style(FALLBACK_COLORS.get(index % FALLBACK_COLORS.size()), 0.45, true);
		String style = descriptor.style();
		if (style == null || style.isBlank()) {
			return fallback;
		}
		if (!style.trim().startsWith("{")) {
			return new Style(style.trim(), fallback.fillOpacity(), true);
		}
		try {
			JsonNode node = MAPPER.readTree(style);
			return new Style(node.hasNonNull("color") ? node.get("color").asString() : fallback.color(),
					node.hasNonNull("fillOpacity") ? node.get("fillOpacity").asDouble() : fallback.fillOpacity(),
					!node.hasNonNull("labels") || node.get("labels").asBoolean());
		} catch (RuntimeException e) {
			return fallback;
		}
	}

	/** top first: points, lines, then areas from small to large, OpenStreetMap at the bottom */
	private static List<String> drawOrder(List<Layer> layers, Map<Layer, String> ids) {
		List<String> order = new ArrayList<>();
		for (Kind kind : List.of(Kind.POINT, Kind.LINE)) {
			layers.stream().filter(l -> l.kind() == kind).map(ids::get).forEach(order::add);
		}
		layers.stream().filter(l -> l.kind() == Kind.POLYGON)
				.sorted(Comparator.comparingDouble(l -> l.view().extent().map(QgisProject::area).orElse(0.0)))
				.map(ids::get).forEach(order::add);
		order.add(OSM_ID);
		return order;
	}

	private static double area(Envelope e) {
		return (e.maxX() - e.minX()) * (e.maxY() - e.minY());
	}

	/** a folder of the layer tree, from the layer group paths */
	private record Group(String name, Map<String, Group> groups, List<Layer> layers) {

		static Group of(List<Layer> layers) {
			Group root = new Group("", new LinkedHashMap<>(), new ArrayList<>());
			for (Layer layer : layers) {
				Group group = root;
				String path = layer.view().layerGroup();
				if (path != null) {
					for (String segment : path.split("/")) {
						if (!segment.isBlank()) {
							group = group.groups().computeIfAbsent(segment.trim(),
									n -> new Group(n, new LinkedHashMap<>(), new ArrayList<>()));
						}
					}
				}
				group.layers().add(layer);
			}
			return root;
		}
	}

	/** folders before layers, as in the viewer */
	private static void tree(LayerTreeGroup target, Group group, Map<Layer, String> ids, String apiUrl) {
		for (Group child : group.groups().values()) {
			LayerTreeGroup folder = F.createLayerTreeGroup();
			folder.setName(child.name());
			folder.setChecked(CheckState.CHECKED);
			folder.setExpanded("1");
			tree(folder, child, ids, apiUrl);
			target.getGroups().add(folder);
		}
		for (Layer layer : group.layers()) {
			CollectionView view = layer.view();
			// a collection gathering others starts hidden, as in the viewer
			target.getLayers().add(treeLayer(ids.get(layer), title(view), "OAPIF", source(apiUrl, view), !view.aggregate()));
		}
	}

	private static LayerTreeLayer treeLayer(String id, String name, String provider, String source, boolean checked) {
		LayerTreeLayer layer = F.createLayerTreeLayer();
		layer.setId(id);
		layer.setName(name);
		layer.setProviderKey(provider);
		layer.setSource(source);
		layer.setChecked(checked ? CheckState.CHECKED : CheckState.UNCHECKED);
		layer.setExpanded("0");
		return layer;
	}

	private static MapLayer vectorLayer(Layer layer, String id, Style style, String apiUrl) {
		CollectionView view = layer.view();
		MapLayer mapLayer = F.createMapLayer();
		mapLayer.setType("vector");
		mapLayer.setGeometry(switch (layer.kind()) {
		case POINT -> "Point";
		case LINE -> "Line";
		case POLYGON -> "Polygon";
		});
		mapLayer.setId(id);
		mapLayer.setDatasource(source(apiUrl, view));
		mapLayer.setLayername(title(view));
		mapLayer.setSrs(crs(crs84()));
		mapLayer.setProvider(provider("OAPIF", "UTF-8"));
		mapLayer.setRenderer(renderer(layer.kind(), style, view.descriptor()));
		if (style.labels() && has(view.descriptor(), "name")) {
			mapLayer.setLabeling(labeling(layer.kind()));
		}
		return mapLayer;
	}

	private static Renderer renderer(Kind kind, Style style, CollectionDescriptor descriptor) {
		boolean ownColor = has(descriptor, "color");
		boolean status = has(descriptor, "status");
		String color = hex(style.color());
		// a feature may carry its own colour (property color), e.g. buildings by type
		String own = ownColor ? "coalesce(\"color\", '" + color + "')" : "'" + color + "'";
		String outline = status ? "CASE WHEN \"status\" = 'MAINTENANCE' THEN '#c62828' WHEN \"status\" = 'CLOSED' "
				+ "THEN '#424242' ELSE " + own + " END" : own;
		int alpha = (int) Math.round(255 * clamp(style.fillOpacity()));

		Symbol symbol = F.createSymbol();
		symbol.setName("0");
		symbol.setAlpha("1");
		symbol.setClipToExtent("1");
		symbol.setForceRhr("0");
		switch (kind) {
		case POLYGON -> {
			symbol.setType("fill");
			String fill = status
					? "set_color_part(" + own + ", 'alpha', CASE WHEN \"status\" IN ('MAINTENANCE', 'CLOSED') THEN "
							+ Math.round(alpha * 0.4) + " ELSE " + alpha + " END)"
					: "set_color_part(" + own + ", 'alpha', " + alpha + ")";
			symbol.getLayers().add(symbolLayer("SimpleFill", Map.of(
					"color", rgba(color, alpha),
					"style", alpha == 0 ? "no" : "solid",
					"outline_color", rgba(color, 255),
					"outline_width", "0.4",
					"outline_width_unit", "MM",
					"outline_style", "solid"),
					ownColor || status ? Map.of("fillColor", fill, "outlineColor", outline) : Map.of()));
		}
		case LINE -> {
			symbol.setType("line");
			symbol.getLayers().add(symbolLayer("SimpleLine", Map.of(
					"line_color", rgba(color, 255),
					"line_width", "0.8",
					"line_width_unit", "MM",
					"capstyle", "round",
					"joinstyle", "round",
					"line_style", "solid"),
					ownColor || status ? Map.of("outlineColor", outline) : Map.of()));
		}
		case POINT -> {
			symbol.setType("marker");
			symbol.getLayers().add(symbolLayer("SimpleMarker", Map.of(
					"name", "circle",
					"color", rgba(color, 255),
					"outline_color", "255,255,255,255",
					"outline_width", "0.3",
					"outline_width_unit", "MM",
					"size", "2.4",
					"size_unit", "MM"),
					ownColor ? Map.of("fillColor", own) : Map.of()));
		}
		}
		Symbols symbols = F.createSymbols();
		symbols.getSymbols().add(symbol);
		Renderer renderer = F.createRenderer();
		renderer.setType("singleSymbol");
		renderer.setSymbollevels("0");
		renderer.setEnableorderby("0");
		renderer.setForceraster("0");
		renderer.setSymbols(symbols);
		return renderer;
	}

	private static SymbolLayer symbolLayer(String type, Map<String, String> options, Map<String, String> dataDefined) {
		SymbolLayer layer = F.createSymbolLayer();
		layer.setLayerClass(type);
		layer.setEnabled("1");
		layer.setLocked("0");
		layer.setPass("0");
		Option map = map(null);
		options.forEach((name, value) -> map.getOptions().add(option(name, "QString", value)));
		layer.setOptions(map);
		if (!dataDefined.isEmpty()) {
			Option properties = map("properties");
			dataDefined.forEach((name, expression) -> {
				Option property = map(name);
				property.getOptions().add(option("active", "bool", "true"));
				property.getOptions().add(option("expression", "QString", expression));
				// an expression based property
				property.getOptions().add(option("type", "int", "3"));
				properties.getOptions().add(property);
			});
			Option collection = map(null);
			collection.getOptions().add(option("name", "QString", ""));
			collection.getOptions().add(properties);
			collection.getOptions().add(option("type", "QString", "collection"));
			DataDefinedProperties ddp = F.createDataDefinedProperties();
			ddp.setOption(collection);
			layer.setDataDefinedProperties(ddp);
		}
		return layer;
	}

	private static Option map(String name) {
		Option option = F.createOption();
		option.setName(name);
		option.setType("Map");
		return option;
	}

	private static Option option(String name, String type, String value) {
		Option option = F.createOption();
		option.setName(name);
		option.setType(type);
		option.setValue(value);
		return option;
	}

	private static Labeling labeling(Kind kind) {
		TextBuffer buffer = F.createTextBuffer();
		buffer.setBufferDraw("1");
		buffer.setBufferSize("1");
		buffer.setBufferColor("255,255,255,255");
		TextStyle text = F.createTextStyle();
		text.setFieldName("name");
		text.setIsExpression("0");
		text.setFontSize("9");
		text.setTextColor("29,39,51,255");
		text.setTextBuffer(buffer);
		Placement placement = F.createPlacement();
		// around point, along the line, over the area's centre
		placement.setPlacement(switch (kind) {
		case POINT -> "0";
		case LINE -> "2";
		case POLYGON -> "1";
		});
		Rendering rendering = F.createRendering();
		rendering.setScaleVisibility("1");
		rendering.setScaleMin(Integer.toString(LABEL_SCALE));
		rendering.setScaleMax("0");
		LabelSettings settings = F.createLabelSettings();
		settings.setCalloutType("simple");
		settings.setTextStyle(text);
		settings.setPlacement(placement);
		settings.setRendering(rendering);
		Labeling labeling = F.createLabeling();
		labeling.setType("simple");
		labeling.setSettings(settings);
		return labeling;
	}

	private static MapLayer osmLayer() {
		MapLayer layer = F.createMapLayer();
		layer.setType("raster");
		layer.setId(OSM_ID);
		layer.setDatasource(OSM_SOURCE);
		layer.setLayername("OpenStreetMap");
		layer.setSrs(crs(webMercator()));
		layer.setProvider(provider("wms", null));
		return layer;
	}

	private static Provider provider(String key, String encoding) {
		Provider provider = F.createProvider();
		provider.setKey(key);
		provider.setEncoding(encoding);
		return provider;
	}

	private static TypedValue typed(String type, String value) {
		TypedValue typed = F.createTypedValue();
		typed.setType(type);
		typed.setValue(value);
		return typed;
	}

	private static Crs crs(SpatialRefSys spatialRefSys) {
		Crs crs = F.createCrs();
		crs.setSpatialRefSys(spatialRefSys);
		return crs;
	}

	private static SpatialRefSys crs84() {
		SpatialRefSys crs = F.createSpatialRefSys();
		crs.setNativeFormat("Wkt");
		crs.setWkt(CRS84_WKT);
		crs.setProj4("+proj=longlat +datum=WGS84 +no_defs");
		crs.setSrsid("63159");
		crs.setSrid("520003159");
		crs.setAuthid("OGC:CRS84");
		crs.setDescription("WGS 84 (CRS84)");
		crs.setProjectionacronym("longlat");
		crs.setEllipsoidacronym("EPSG:7030");
		crs.setGeographicflag("true");
		return crs;
	}

	private static SpatialRefSys webMercator() {
		SpatialRefSys crs = F.createSpatialRefSys();
		crs.setNativeFormat("Wkt");
		crs.setWkt(WEB_MERCATOR_WKT);
		crs.setProj4(WEB_MERCATOR_PROJ4);
		crs.setSrsid("3857");
		crs.setSrid("3857");
		crs.setAuthid("EPSG:3857");
		crs.setDescription("WGS 84 / Pseudo-Mercator");
		crs.setProjectionacronym("merc");
		crs.setEllipsoidacronym("EPSG:7030");
		crs.setGeographicflag("false");
		return crs;
	}

	/** the smallest collection that gathers others (e.g. all assets of a facility), else all */
	private static Optional<Envelope> startExtent(List<Layer> layers) {
		Optional<Envelope> aggregate = layers.stream().map(Layer::view).filter(CollectionView::aggregate)
				.map(CollectionView::extent).flatMap(Optional::stream).min(Comparator.comparingDouble(QgisProject::area));
		if (aggregate.isPresent()) {
			return aggregate;
		}
		return layers.stream().map(Layer::view).map(CollectionView::extent).flatMap(Optional::stream)
				.reduce(Envelope::union);
	}

	private static ProjectViewSettings viewSettings(Envelope extent) {
		double padX = (extent.maxX() - extent.minX()) * 0.1;
		double padY = (extent.maxY() - extent.minY()) * 0.1;
		Extent view = F.createExtent();
		view.setXmin(mercatorX(extent.minX() - padX));
		view.setYmin(mercatorY(extent.minY() - padY));
		view.setXmax(mercatorX(extent.maxX() + padX));
		view.setYmax(mercatorY(extent.maxY() + padY));
		view.setSpatialRefSys(webMercator());
		ProjectViewSettings settings = F.createProjectViewSettings();
		settings.setUseProjectScales("0");
		settings.setRotation("0");
		settings.setDefaultViewExtent(view);
		return settings;
	}

	private static double mercatorX(double lon) {
		return lon * EARTH_HALF_CIRCUMFERENCE / 180;
	}

	private static double mercatorY(double lat) {
		double clamped = Math.max(-85.0511, Math.min(85.0511, lat));
		return Math.log(Math.tan((90 + clamped) * Math.PI / 360)) / (Math.PI / 180) * EARTH_HALF_CIRCUMFERENCE / 180;
	}

	private static String source(String apiUrl, CollectionView view) {
		// pages of 1000 instead of the server's default page size
		return "url='" + apiUrl + "' typename='" + view.descriptor().id()
				+ "' pagingEnabled='true' pageSize='1000' restrictToRequestBBOX='1' preferCoordinatesForWfsT11='false'";
	}

	private static String title(CollectionView view) {
		String title = view.descriptor().title();
		return title == null || title.isBlank() ? view.descriptor().id() : title;
	}

	private static boolean has(CollectionDescriptor descriptor, String property) {
		return descriptor.property(property).isPresent();
	}

	private static double clamp(double value) {
		return Math.max(0, Math.min(1, value));
	}

	/** a CSS hex colour, normalised to #rrggbb; other CSS colours fall back to grey */
	private static String hex(String color) {
		if (color == null || !HEX.matcher(color.trim()).matches()) {
			return "#78909c";
		}
		String c = color.trim().substring(1);
		if (c.length() == 3) {
			c = "" + c.charAt(0) + c.charAt(0) + c.charAt(1) + c.charAt(1) + c.charAt(2) + c.charAt(2);
		}
		return "#" + c.toLowerCase(Locale.ROOT);
	}

	private static String rgba(String hex, int alpha) {
		int rgb = Integer.parseInt(hex.substring(1), 16);
		return ((rgb >> 16) & 0xff) + "," + ((rgb >> 8) & 0xff) + "," + (rgb & 0xff) + "," + alpha;
	}
}
