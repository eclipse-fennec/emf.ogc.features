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
# Generates bath.geojson, the demo data of a fictional leisure pool ("Freizeitbad
# Saaleaue") at the edge of Jena. The layout is drawn in metres on a local grid
# (x east, y north, origin at the south-west corner of the site) and projected to
# CRS84 around ORIGIN. Run it after changing the layout; the output is committed.
import json, math, os

ORIGIN = (11.6150, 50.9050)          # lon, lat of the site's south-west corner
M_PER_DEG_LAT = 111_320.0
M_PER_DEG_LON = M_PER_DEG_LAT * math.cos(math.radians(ORIGIN[1]))

def ll(x, y):
    return [round(ORIGIN[0] + x / M_PER_DEG_LON, 7), round(ORIGIN[1] + y / M_PER_DEG_LAT, 7)]

def point(x, y):
    return {"type": "Point", "coordinates": ll(x, y)}

def line(*xy):
    return {"type": "LineString", "coordinates": [ll(x, y) for x, y in xy]}

def polygon(*xy, holes=()):
    def ring(pts):
        r = [ll(x, y) for x, y in pts]
        return r + [r[0]]
    return {"type": "Polygon", "coordinates": [ring(xy)] + [ring(h) for h in holes]}

def rect(x1, y1, x2, y2):
    return polygon((x1, y1), (x2, y1), (x2, y2), (x1, y2))

def circle(cx, cy, r, n=12):
    return polygon(*[(cx + r * math.cos(2 * math.pi * i / n), cy + r * math.sin(2 * math.pi * i / n)) for i in range(n)])

def blob(cx, cy, rx, ry, n=40, wobble=0.12, seed=3):
    # an organic outline with many vertices, e.g. a lawn following the terrain
    pts = []
    for i in range(n):
        a = 2 * math.pi * i / n
        f = 1 + wobble * math.sin(seed * a) * math.cos(2 * a)
        pts.append((cx + rx * f * math.cos(a), cy + ry * f * math.sin(a)))
    return polygon(*pts)

features = []

def asset(asset_type, fid, name, geometry, **props):
    base = {"assetType": asset_type, "name": name, "status": "OPEN", "accessible": True,
            "lastInspection": "2026-06-15"}
    base.update(props)
    features.append({"type": "Feature", "id": fid, "geometry": geometry, "properties": base})

# --- site and buildings -----------------------------------------------------------
asset("SiteBoundary", "site", "Gelände Freizeitbad Saaleaue",
      polygon((0, 0), (220, 0), (220, 160), (120, 160), (120, 152), (0, 152)),
      description="Grundstücksgrenze", level="OUTDOOR")
asset("Building", "hall", "Hallenbad", rect(20, 90, 110, 147), floors=2, level="GROUND_FLOOR",
      description="Hallenbad mit Umkleiden, Wellenbecken und Bistro")
asset("Building", "sauna-house", "Saunahaus", rect(156, 116, 184, 144), floors=1, level="GROUND_FLOOR")

# --- indoor pools -----------------------------------------------------------------
asset("Pool", "pool-sport", "Sportbecken", rect(28, 96, 53, 108.5), poolType="SWIMMER",
      depthMin=1.35, depthMax=2.0, waterTemperature=27.0, lanes=5, level="GROUND_FLOOR",
      lastInspection="2026-09-01")
asset("Pool", "pool-learn", "Nichtschwimmerbecken", rect(60, 96, 78, 106), poolType="NON_SWIMMER",
      depthMin=0.6, depthMax=1.25, waterTemperature=30.0, lanes=0, level="GROUND_FLOOR")
asset("Pool", "pool-kids", "Kinderplanschbecken",
      polygon((82, 96), (93, 96), (95, 101), (90, 106), (83, 105)), poolType="KIDS",
      depthMin=0.2, depthMax=0.4, waterTemperature=32.0, lanes=0, level="GROUND_FLOOR")
asset("Pool", "pool-wave", "Wellenbecken", polygon((58, 114), (96, 114), (92, 140), (62, 140)),
      poolType="WAVE", depthMin=0.0, depthMax=2.0, waterTemperature=28.0, lanes=0,
      level="GROUND_FLOOR", description="Wellenbetrieb jede volle Stunde")
asset("Pool", "pool-whirl", "Whirlpool", circle(102, 132, 2.5), poolType="WHIRLPOOL",
      depthMin=0.9, depthMax=0.9, waterTemperature=36.0, lanes=0, level="GROUND_FLOOR")

# --- outdoor pools ----------------------------------------------------------------
asset("Pool", "pool-outdoor", "Freibad-Schwimmerbecken", rect(120, 18, 170, 39), poolType="OUTDOOR",
      depthMin=1.2, depthMax=2.0, waterTemperature=24.0, lanes=8, level="OUTDOOR")
asset("Pool", "pool-diving", "Sprungbecken", rect(176, 18, 191, 34), poolType="DIVING",
      depthMin=3.8, depthMax=4.5, waterTemperature=23.0, lanes=0, level="OUTDOOR",
      status="MAINTENANCE", description="Sprungturm 1 m / 3 m / 5 m, derzeit Wartung",
      lastInspection="2025-11-20")

# --- slides -----------------------------------------------------------------------
asset("Slide", "slide-tornado", "Tornado-Rutsche",
      line((112, 62), (118, 66), (124, 62), (122, 55), (116, 52), (114, 46), (121, 42), (130, 40)),
      length=86.0, heightDifference=11.5, minAge=8, level="OUTDOOR")
asset("Slide", "slide-kids", "Kinderrutsche", line((100, 44), (106, 42), (112, 40.5)),
      length=14.0, heightDifference=2.0, minAge=3, level="OUTDOOR")
asset("Slide", "slide-blackhole", "Black-Hole-Rutsche",
      line((106, 146), (100, 150), (92, 149), (88, 144), (84, 140)),
      length=62.0, heightDifference=8.0, minAge=10, level="UPPER_FLOOR", accessible=False)

# --- changing rooms, toilets, first aid -------------------------------------------
asset("ChangingRoom", "changing-main", "Umkleiden Halle", rect(22, 118, 46, 145), cabins=40,
      lockers=350, family=False, level="GROUND_FLOOR")
asset("ChangingRoom", "changing-family", "Familienumkleide", rect(47, 136, 56, 145), cabins=6,
      lockers=40, family=True, level="GROUND_FLOOR")
asset("ChangingRoom", "changing-outdoor", "Umkleiden Freibad", rect(100, 70, 114, 80), cabins=16,
      lockers=120, family=False, level="OUTDOOR")
asset("Toilet", "wc-hall", "WC Halle", point(48, 124), babyChanging=True, level="GROUND_FLOOR")
asset("Toilet", "wc-wave", "WC Wellenbecken", point(98, 112), babyChanging=False, level="GROUND_FLOOR")
asset("Toilet", "wc-outdoor", "WC Freibad", rect(115, 70, 121, 76), babyChanging=True, level="OUTDOOR")
asset("Toilet", "wc-sauna", "WC Saunahaus", point(182, 118), babyChanging=False, level="GROUND_FLOOR")
asset("FirstAid", "first-aid-hall", "Erste Hilfe / Bademeister", point(56, 112), defibrillator=True,
      level="GROUND_FLOOR")
asset("FirstAid", "first-aid-outdoor", "Erste Hilfe Freibad", point(172, 44), defibrillator=True,
      level="OUTDOOR")

# --- food -------------------------------------------------------------------------
asset("Kiosk", "bistro", "Bistro Wellenblick", point(104, 100), openingHours="10:00-21:00", seats=60,
      level="GROUND_FLOOR")
asset("Kiosk", "kiosk-outdoor", "Kiosk Freibad", point(135, 86), openingHours="11:00-19:00", seats=40,
      level="OUTDOOR", description="Pommes, Eis und Getränke")

# --- sauna ------------------------------------------------------------------------
asset("Sauna", "sauna-finnish", "Finnische Sauna", rect(158, 128, 168, 142), saunaType="FINNISH",
      temperature=90.0, capacity=20, level="GROUND_FLOOR", accessible=False)
asset("Sauna", "sauna-bio", "Bio-Sauna", rect(170, 132, 182, 142), saunaType="BIO",
      temperature=60.0, capacity=14, level="GROUND_FLOOR", accessible=False)
asset("Sauna", "sauna-steam", "Dampfbad", rect(158, 118, 166, 126), saunaType="STEAM",
      temperature=45.0, capacity=10, level="GROUND_FLOOR")
asset("Sauna", "sauna-infrared", "Infrarotkabine", rect(170, 120, 176, 126), saunaType="INFRARED",
      temperature=40.0, capacity=4, level="GROUND_FLOOR", status="CLOSED")

# --- open areas -------------------------------------------------------------------
asset("Lawn", "lawn-big", "Große Liegewiese", blob(55, 45, 45, 30, n=48), shaded=False, level="OUTDOOR",
      description="Sonnige Liegewiese mit Blick auf das Freibad")
asset("Lawn", "lawn-trees", "Liegewiese unter Bäumen", polygon((196, 48), (216, 50), (217, 104),
      (210, 112), (197, 108)), shaded=True, level="OUTDOOR")
asset("Lawn", "lawn-sauna", "Saunagarten", polygon((186, 116), (216, 116), (216, 148), (186, 148)),
      shaded=True, level="OUTDOOR")
asset("Playground", "playground", "Abenteuerspielplatz", polygon((128, 96), (150, 94), (152, 114),
      (130, 116)), ageFrom=3, ageTo=12, level="OUTDOOR")
asset("Playground", "splash", "Wasserspielplatz", circle(92, 62, 6), ageFrom=1, ageTo=6,
      level="OUTDOOR")
asset("SportArea", "volleyball", "Beachvolleyball", rect(150, 55, 166, 63), sportType="BEACH_VOLLEYBALL",
      level="OUTDOOR")
asset("SportArea", "soccer", "Bolzplatz", rect(140, 125, 152, 148), sportType="SOCCER", level="OUTDOOR",
      accessible=False)
asset("SportArea", "table-tennis", "Tischtennis", rect(172, 58, 178, 62), sportType="TABLE_TENNIS",
      level="OUTDOOR")
asset("SportArea", "fitness", "Aqua-Fitness-Raum", rect(20, 146, 40, 147), sportType="FITNESS",
      level="UPPER_FLOOR")

# --- infrastructure ---------------------------------------------------------------
asset("Entrance", "entrance-main", "Haupteingang mit Kasse", point(65, 90), main=True, level="GROUND_FLOOR")
asset("Entrance", "entrance-outdoor", "Ausgang Freibad", point(110, 89), main=False, level="OUTDOOR")
asset("Entrance", "entrance-staff", "Personaleingang", point(20, 100), main=False, level="GROUND_FLOOR",
      accessible=False)
asset("Path", "path-main", "Hauptweg", line((65, 90), (65, 84), (100, 84), (135, 84), (160, 70),
      (172, 48)), surface="PAVED", level="OUTDOOR")
asset("Path", "path-sauna", "Weg zum Saunahaus", line((110, 120), (130, 120), (156, 125)),
      surface="WOODEN", level="OUTDOOR")
asset("Path", "path-lawn", "Weg Liegewiese", line((100, 84), (90, 70), (70, 60), (40, 50)),
      surface="GRAVEL", level="OUTDOOR")

out = os.path.join(os.path.dirname(os.path.abspath(__file__)), "bath.geojson")
with open(out, "w", encoding="utf-8") as f:
    json.dump({"type": "FeatureCollection", "name": "Freizeitbad Saaleaue", "features": features},
              f, ensure_ascii=False, indent=1)
print(f"{len(features)} features -> {out}")
