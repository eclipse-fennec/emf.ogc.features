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
package org.qgis.project;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Test;
import org.qgis.project.io.QgisProjectFiles;

/** The model writes the XML names QGIS reads, without a namespace. */
class QgisProjectXmlTest {

	private static final QgisFactory F = QgisFactory.eINSTANCE;

	@Test
	void writesQgisXml() throws Exception {
		Project project = F.createProject();
		project.setVersion("3.34.0");
		project.setProjectname("Probe");
		project.setTitle("Probe");
		LayerTreeGroup root = F.createLayerTreeGroup();
		LayerTreeGroup group = F.createLayerTreeGroup();
		group.setName("Wasser");
		group.setChecked(CheckState.CHECKED);
		LayerTreeLayer layer = F.createLayerTreeLayer();
		layer.setId("ogc_pools");
		layer.setName("Becken");
		layer.setChecked(CheckState.UNCHECKED);
		group.getLayers().add(layer);
		root.getGroups().add(group);
		CustomOrder order = F.createCustomOrder();
		order.setEnabled("1");
		order.getItems().add("ogc_pools");
		root.setCustomOrder(order);
		project.setLayerTreeGroup(root);
		ProjectLayers layers = F.createProjectLayers();
		MapLayer mapLayer = F.createMapLayer();
		mapLayer.setType("vector");
		mapLayer.setId("ogc_pools");
		Provider provider = F.createProvider();
		provider.setEncoding("UTF-8");
		provider.setKey("OAPIF");
		mapLayer.setProvider(provider);
		SymbolLayer symbolLayer = F.createSymbolLayer();
		symbolLayer.setLayerClass("SimpleFill");
		Option options = F.createOption();
		options.setType("Map");
		Option color = F.createOption();
		color.setName("color");
		color.setType("QString");
		color.setValue("30,136,229,115");
		options.getOptions().add(color);
		symbolLayer.setOptions(options);
		Symbol symbol = F.createSymbol();
		symbol.setType("fill");
		symbol.getLayers().add(symbolLayer);
		Symbols symbols = F.createSymbols();
		symbols.getSymbols().add(symbol);
		Renderer renderer = F.createRenderer();
		renderer.setType("singleSymbol");
		renderer.setSymbols(symbols);
		mapLayer.setRenderer(renderer);
		layers.getLayers().add(mapLayer);
		project.setProjectLayers(layers);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		QgisProjectFiles.write(project, out);
		String xml = out.toString(StandardCharsets.UTF_8);

		assertThat(xml).contains("encoding=\"UTF-8\"", "<qgis ", "version=\"3.34.0\"", "<layer-tree-group>", "<layer-tree-group name=\"Wasser\" checked=\"Qt::Checked\">",
				"checked=\"Qt::Unchecked\"", "<custom-order enabled=\"1\">", "<item>ogc_pools</item>",
				"<provider encoding=\"UTF-8\">OAPIF</provider>", "<renderer-v2 type=\"singleSymbol\">",
				"<layer class=\"SimpleFill\">", "<Option type=\"Map\">", "<Option name=\"color\" type=\"QString\" value=\"30,136,229,115\"/>")
				.doesNotContain("xmlns", "xsi:");

		Project back = QgisProjectFiles.read(new ByteArrayInputStream(out.toByteArray()));
		assertThat(EcoreUtil.equals(back, project)).as("read back").isTrue();
	}
}
