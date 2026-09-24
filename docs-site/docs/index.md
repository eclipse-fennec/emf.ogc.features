---
layout: home

hero:
  name: Fennec OGC Features
  text: OGC API Features for EMF models
  tagline: Publish EMF model instances as OGC API Features collections — GeoJSON, HTML and CQL2 filtering on top of Fennec persistence.
  image:
    src: /fennec-logo.png
    alt: Eclipse Fennec logo
  actions:
    - theme: brand
      text: Overview
      link: /guides/overview
    - theme: alt
      text: View on GitHub
      link: https://github.com/eclipse-fennec/emf.ogc.features

features:
  - icon: 🗺️
    title: Collections from Ecore
    details: An annotated EClass becomes a feature collection; its instances become features with geometry and properties.
    link: /guides/overview
    linkText: Overview
  - icon: 🔎
    title: CQL2 filtering
    details: Basic CQL2 in text and JSON encoding, plus spatial intersection, translated to the Fennec query IR.
  - icon: 🗄️
    title: Fennec persistence
    details: Features are read through Fennec repositories — JPA (H2, PostgreSQL) or in memory.
---
