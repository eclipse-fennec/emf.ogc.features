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
      text: User Guide
      link: /guides/user-guide
    - theme: alt
      text: Architecture
      link: /guides/architecture
    - theme: alt
      text: View on GitHub
      link: https://github.com/eclipse-fennec/emf.ogc.features

features:
  - icon: 🗺️
    title: Collections from Ecore
    details: An annotated EClass becomes a feature collection; its instances become features with geometry and properties.
    link: /guides/user-guide
    linkText: User Guide
  - icon: 🔎
    title: CQL2 filtering
    details: CQL2 in text and JSON encoding with comparisons, LIKE, BETWEEN, IN and the spatial functions, the same for every backend.
    link: /guides/user-guide#_6-filtering-with-cql2
    linkText: Filtering
  - icon: 🗄️
    title: Fennec persistence
    details: Features are read through Fennec repositories — JPA (H2, PostgreSQL) or in memory. Filters are pushed to the store; exact spatial relations run in memory.
    link: /guides/architecture
    linkText: Architecture
---
