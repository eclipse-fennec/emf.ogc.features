#!/usr/bin/env python3
#
# Copyright (c) 2026 Contributors to the Eclipse Foundation.
#
# This program and the accompanying materials are made
# available under the terms of the Eclipse Public License 2.0
# which is available at https://www.eclipse.org/legal/epl-2.0/
#
# SPDX-License-Identifier: EPL-2.0
#
# Contributors:
#     Data In Motion - initial API and implementation
#
# Generates woge.geojson, the demo data of the leisure pool WOGE (https://woge.modelatlas.cloud)
# in the generated town Dim Stadt (city/*.geojson). The facts come from the WOGE web page: a
# 1,000 m² wave pool, the 120 m slide "Blauer Blitz", a 25 m sports pool with six lanes, the
# children's area, an outdoor sole pool, four saunas, the bistro "Sandbank", 350 parking
# spaces and 400 covered bicycle racks.
#
# The site sits on meadow and field at the Unstrutstraße, which runs along its west side;
# the access road "Am Wellental" leads from there to the car park. The layout is drawn in
# metres on the site (x east, y north, origin at its south-west corner) and projected with
# the local projection of the town generator, so it lines up with the town's streets.
import json, math, os

# local projection of the Dim Stadt generator: centroid of the town boundary
LON0, LAT0 = 11.286276388888888, 51.31202205555556
M_LAT = 111260.0
M_LON = 111320.0 * math.cos(math.radians(LAT0))
# south-west corner of the site in the town's local metres, found free of buildings and streets
SITE_X, SITE_Y = 705.0, -555.0


def ll(x, y):
    return [round(LON0 + (SITE_X + x) / M_LON, 7), round(LAT0 + (SITE_Y + y) / M_LAT, 7)]


def point(x, y):
    return {"type": "Point", "coordinates": ll(x, y)}


def line(*xy):
    return {"type": "LineString", "coordinates": [ll(x, y) for x, y in xy]}


def polygon(*xy):
    ring = [ll(x, y) for x, y in xy]
    return {"type": "Polygon", "coordinates": [ring + [ring[0]]]}


def rect(x1, y1, x2, y2):
    return polygon((x1, y1), (x2, y1), (x2, y2), (x1, y2))


def circle(cx, cy, r, n=12):
    return polygon(*[(cx + r * math.cos(2 * math.pi * i / n), cy + r * math.sin(2 * math.pi * i / n)) for i in range(n)])


def blob(cx, cy, rx, ry, n=40, wobble=0.1, seed=3):
    pts = []
    for i in range(n):
        a = 2 * math.pi * i / n
        f = 1 + wobble * math.sin(seed * a) * math.cos(2 * a)
        pts.append((cx + rx * f * math.cos(a), cy + ry * f * math.sin(a)))
    return polygon(*pts)


def offset(pts, d):
    """Outward offset of a convex polygon given counter-clockwise (the pool outline)."""
    n = len(pts)
    lines = []
    for i in range(n):
        (x1, y1), (x2, y2) = pts[i], pts[(i + 1) % n]
        ex, ey = x2 - x1, y2 - y1
        l = math.hypot(ex, ey)
        nx, ny = ey / l, -ex / l
        lines.append(((x1 + nx * d, y1 + ny * d), (ex, ey)))
    out = []
    for i in range(n):
        (p, r), (q, t) = lines[i - 1], lines[i]
        den = r[0] * t[1] - r[1] * t[0]
        u = ((q[0] - p[0]) * t[1] - (q[1] - p[1]) * t[0]) / den
        out.append((p[0] + r[0] * u, p[1] + r[1] * u))
    return out


def with_hole(outer, hole):
    ring = [ll(x, y) for x, y in outer]
    inner = [ll(x, y) for x, y in reversed(hole)]
    return {"type": "Polygon", "coordinates": [ring + [ring[0]], inner + [inner[0]]]}


def corners(x1, y1, x2, y2):
    return [(x1, y1), (x2, y1), (x2, y2), (x1, y2)]


def length(*xy):
    return round(sum(math.dist(a, b) for a, b in zip(xy, xy[1:])), 1)


features = []


def asset(asset_type, fid, name, geometry, **props):
    base = {"assetType": asset_type, "name": name, "status": "OPEN", "accessible": True,
            "lastInspection": "2026-07-01"}
    base.update(props)
    features.append({"type": "Feature", "id": fid, "geometry": geometry, "properties": base})


# --- site, access and mobility -------------------------------------------------------
asset("SiteBoundary", "woge-site", "Freizeitbad WOGE", rect(0, 0, 230, 170), level="OUTDOOR",
      description="Freizeitbad WOGE, Am Wellental 1, Dim Stadt. 363 Tage im Jahr geöffnet: "
                  "Mo–Fr 9–22 Uhr, Sa 9–23 Uhr, So 9–21 Uhr. Busse 12 und 47.")
asset("Path", "woge-access", "Am Wellental", line((-33, 2), (-5, 8), (8, 30), (8, 75)),
      surface="PAVED", level="OUTDOOR", description="Zufahrt von der Unstrutstraße")
asset("ParkingLot", "woge-parking", "Parkplatz WOGE", rect(12, 5, 68, 160), spaces=350, freeHours=4,
      chargingPoints=12, level="OUTDOOR", description="350 Stellplätze, die ersten 4 Stunden kostenlos")
asset("BikeParking", "woge-bikes", "Fahrradüberdachung", rect(72, 35, 81, 80), racks=400, covered=True,
      level="OUTDOOR", description="400 überdachte Fahrradstellplätze")
asset("Entrance", "woge-entrance", "Haupteingang Am Wellental 1", point(85, 64), main=True,
      level="GROUND_FLOOR", description="Kasse; Erwachsene 12,50 €, Kinder (4–15) 7,50 €, Familie (bis 5) 32,00 €")
asset("Path", "woge-walk", "Weg zum Eingang", line((68, 64), (85, 64)), surface="PAVED", level="OUTDOOR")

# --- hall ------------------------------------------------------------------------------
asset("Building", "woge-hall", "Badehalle", rect(85, 60, 185, 150), floors=2, level="GROUND_FLOOR",
      description="Wellenbad, Sportbecken, Kinderwelt, Umkleiden und Bistro unter einem Dach")
asset("ChangingRoom", "woge-changing", "Umkleiden & Schließfächer", rect(88, 63, 116, 86), cabins=60,
      lockers=600, family=False, level="GROUND_FLOOR", description="Barrierefreie Umkleiden und Schließfächer")
asset("ChangingRoom", "woge-changing-family", "Familienumkleide", rect(88, 87, 101, 96), cabins=8, lockers=60,
      family=True, level="GROUND_FLOOR")
asset("Toilet", "woge-wc-entrance", "WC Eingang", point(118, 66), babyChanging=True, level="GROUND_FLOOR")
asset("Toilet", "woge-wc-hall", "WC Wellenbad", point(174, 96), babyChanging=True, level="GROUND_FLOOR")
asset("Kiosk", "woge-bistro", "Bistro Sandbank", rect(120, 64, 150, 86), openingHours="11:30-20:00", seats=90,
      level="GROUND_FLOOR", description="Küche 11:30–20:00 Uhr")
asset("FirstAid", "woge-first-aid", "Erste Hilfe / Badeaufsicht", point(122, 92), defibrillator=True,
      level="GROUND_FLOOR")

# pools, each with its surround and showers
POOLS = {}


def pool(fid, name, outline, surface, showers, **props):
    POOLS[fid] = outline
    asset("Pool", fid, name, polygon(*outline), **props)
    asset("Paving", fid + "-surround", "Umfassung " + name, with_hole(offset(outline, 2.5), outline),
          surface=surface, slipResistant=True, level=props.get("level", "GROUND_FLOOR"))
    for i, (x, y, heads) in enumerate(showers, 1):
        asset("Shower", f"{fid}-shower-{i}", "Duschen " + name, point(x, y), heads=heads, warmWater=True,
              level=props.get("level", "GROUND_FLOOR"))


wave = [(125, 100), (170, 100), (165, 125), (130, 125)]
pool("woge-wave", "Wellenbecken", wave, "TILES", [(128, 98.5, 6), (167, 98.5, 6)], poolType="WAVE",
     depthMin=0.0, depthMax=2.0, waterTemperature=28.0, lanes=0, level="GROUND_FLOOR",
     description="1.000 m² Wasserfläche, Wellen alle 30 Minuten")
pool("woge-sport", "Sportbecken", corners(90, 124, 115, 137), "TILES", [(88.5, 126, 4), (88.5, 135, 4)],
     poolType="SWIMMER", depthMin=1.8, depthMax=2.0, waterTemperature=26.0, lanes=6, level="GROUND_FLOOR",
     description="25 m, sechs Bahnen; Schwimmkurse für Kinder und Erwachsene")
kids = [(90, 100), (106, 100), (108, 110), (100, 118), (90, 116)]
pool("woge-kids", "Kinderwelt", kids, "TILES", [(92, 98.5, 3)], poolType="KIDS", depthMin=0.1, depthMax=0.4,
     waterTemperature=32.0, lanes=0, level="GROUND_FLOOR", description="Planschbecken für Kinder von 0 bis 6 Jahren")
landing = corners(174, 128, 183, 140)
pool("woge-landing", "Landebecken Blauer Blitz", landing, "TILES", [(172.5, 138, 2)], poolType="LANDING",
     depthMin=1.0, depthMax=1.2, waterTemperature=28.0, lanes=0, level="GROUND_FLOOR",
     description="Auslauf der Rutsche Blauer Blitz")
pool("woge-sole", "Außen-Solebecken", corners(192, 96, 218, 112), "PAVED", [(190.5, 110, 4)], poolType="SOLE",
     depthMin=1.2, depthMax=1.35, waterTemperature=34.0, lanes=0, level="OUTDOOR",
     description="Ganzjährig 34 °C mit Massagedüsen")

asset("Playground", "woge-pirates", "Piratenschiff & Wasserpilz", rect(111, 101, 120, 112), ageFrom=0, ageTo=6,
      level="GROUND_FLOOR", description="Piratenschiff und Wasserpilz in der Kinderwelt")
kids_slide = [(92, 113), (95, 109), (99, 105)]
asset("Slide", "woge-mini-slide", "Minirutsche", line(*kids_slide), length=length(*kids_slide),
      heightDifference=1.2, minAge=2, level="GROUND_FLOOR", description="Endet im Planschbecken der Kinderwelt")

# "Blauer Blitz": from the tower at the north-east corner of the hall out over the sauna
# garden and back into its landing pool
blitz = [(183, 148), (196, 158), (212, 156), (214, 142), (204, 136), (212, 128), (200, 119),
         (188, 122), (186, 132), (178, 134)]
asset("Slide", "woge-blauer-blitz", "Blauer Blitz", line(*blitz), length=120.0, heightDifference=12.0, minAge=8,
      level="UPPER_FLOOR", description="120 m Röhrenrutsche mit Zeitmessung, Landung im Landebecken")

# barefoot paths between the areas
asset("Path", "woge-path-pools", "Barfußgang Umkleiden – Becken", line((102, 86), (102, 97), (120, 97), (150, 97)),
      surface="TILES", level="GROUND_FLOOR", description="Von den Umkleiden an Kinderwelt und Wellenbecken vorbei")
asset("Path", "woge-path-sport", "Barfußgang Sportbecken", line((102, 97), (118, 118), (118, 130)),
      surface="TILES", level="GROUND_FLOOR")
asset("Path", "woge-path-landing", "Barfußgang Landebecken", line((150, 97), (171, 97), (170, 127)),
      surface="TILES", level="GROUND_FLOOR")
asset("Path", "woge-path-sole", "Weg zum Solebecken", line((171, 97), (185, 99), (189, 102)),
      surface="PAVED", level="OUTDOOR", description="Durch die Schleuse ins Außenbecken")
asset("Path", "woge-path-sauna", "Saunagang", line((180, 115), (186, 118), (192, 124)),
      surface="TILES", level="GROUND_FLOOR", description="Von der Halle in die Saunawelt")
asset("Path", "woge-path-lawn", "Weg zur Liegewiese", line((205, 94), (205, 88), (198, 82)),
      surface="WOODEN", level="OUTDOOR")

# --- outdoor ---------------------------------------------------------------------------
asset("Lawn", "woge-lawn", "Liegewiese", blob(195, 48, 30, 36, n=44), shaded=False, level="OUTDOOR")

# --- vegetation --------------------------------------------------------------------------
trees = []
for i, y in enumerate(range(12, 160, 18)):
    trees.append(("Winterlinde" if i % 2 else "Spitzahorn", 9.0 + (i % 3) * 3, 3, y))
    trees.append(("Spitzahorn" if i % 2 else "Winterlinde", 8.0 + (i % 4) * 2.5, 70, y + 9))
for i in range(9):
    a = 2 * math.pi * i / 9 + 0.3
    trees.append(("Rotbuche" if i % 3 else "Stieleiche", 14.0 + (i % 3) * 3, 195 + 38 * math.cos(a), 48 + 43 * math.sin(a)))
for x, y in [(226, 150), (226, 128), (186, 164)]:
    trees.append(("Sandbirke", 12.0, x, y))
for i, (species, height, x, y) in enumerate(trees, 1):
    in_hall = 83 <= x <= 187 and 58 <= y <= 152
    if 0 < x < 230 and 0 < y < 170 and not in_hall:
        asset("Tree", f"woge-tree-{i}", species, point(x, y), species=species, heightM=height,
              crownDiameterM=round(height * 0.6, 1), level="OUTDOOR", accessible=True)
asset("Shrub", "woge-hedge-south", "Hainbuchenhecke Süd", rect(84, 0.5, 229.5, 2.5), species="Hainbuche", heightM=1.8,
      level="OUTDOOR")
asset("Shrub", "woge-hedge-east", "Hainbuchenhecke Ost", rect(227.5, 2.5, 229.5, 169.5), species="Hainbuche",
      heightM=1.8, level="OUTDOOR")
for i, (x, y, r, species) in enumerate([(78, 90, 3, "Forsythie"), (95, 45, 3, "Forsythie"), (160, 30, 4, "Haselnuss"),
                                         (150, 40, 3.5, "Schneeball"), (222, 88, 3, "Liguster")], 1):
    asset("Shrub", f"woge-shrub-{i}", species, circle(x, y, r, 10), species=species, heightM=2.0 + r / 3,
          level="OUTDOOR")

# --- sauna world -----------------------------------------------------------------------
asset("Building", "woge-sauna-house", "Saunawelt", rect(188, 122, 228, 166), floors=1, level="GROUND_FLOOR",
      description="Vier Saunen (60–90 °C), Eisbrunnen, Ruheraum mit Panoramafenstern, "
                  "stündliche Aufgüsse; ab 16 Jahren, textilfrei")
asset("Sauna", "woge-sauna-finnish", "Finnische Sauna", rect(191, 151, 205, 163), saunaType="FINNISH",
      temperature=90.0, capacity=24, level="GROUND_FLOOR", accessible=False)
asset("Sauna", "woge-sauna-infusion", "Aufguss-Sauna", rect(208, 151, 225, 163), saunaType="FINNISH",
      temperature=85.0, capacity=40, level="GROUND_FLOOR", accessible=False,
      description="Stündliche Aufgüsse")
asset("Sauna", "woge-sauna-herbal", "Kräutersauna", rect(191, 136, 203, 148), saunaType="BIO",
      temperature=70.0, capacity=16, level="GROUND_FLOOR", accessible=False)
asset("Sauna", "woge-sauna-bio", "Bio-Sauna", rect(206, 136, 218, 148), saunaType="BIO",
      temperature=60.0, capacity=16, level="GROUND_FLOOR")
asset("Toilet", "woge-wc-sauna", "WC Saunawelt", point(223, 128), babyChanging=False, level="GROUND_FLOOR")
asset("Shower", "woge-sauna-showers", "Erlebnisduschen Saunawelt", point(197, 128), heads=6, warmWater=True,
      level="GROUND_FLOOR", description="Schwall-, Regen- und Kaltwasserduschen, Eisbrunnen")
asset("Shower", "woge-changing-showers", "Duschen Umkleide", point(112, 80), heads=16, warmWater=True,
      level="GROUND_FLOOR")

out = os.path.join(os.path.dirname(os.path.abspath(__file__)), "woge.geojson")
with open(out, "w", encoding="utf-8") as f:
    json.dump({"type": "FeatureCollection", "name": "Freizeitbad WOGE", "features": features},
              f, ensure_ascii=False, indent=1)
wave_area = abs(sum(a[0] * b[1] - b[0] * a[1] for a, b in zip(wave, wave[1:] + wave[:1]))) / 2
from collections import Counter
print(f"{len(features)} features -> {out}; wave pool {wave_area:.0f} m², Blauer Blitz {length(*blitz)} m drawn")
print(dict(Counter(f["properties"]["assetType"] for f in features)))
