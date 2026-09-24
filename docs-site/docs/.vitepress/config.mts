import { defineConfig } from 'vitepress'
import { GUIDES } from '../../guides.mjs'

// Per-project docs are served under a versioned sub-path, matching the org
// convention (https://eclipse-fennec.github.io/<repo>/<version>/). The snapshot
// branch publishes to /emf.ogc.features/snapshot/; tagged releases / `latest` get added
// once the first release lands.
const version = process.env.DOCS_BRANCH || 'snapshot'
const base = `/emf.ogc.features/${version}/`

// Git ref the "Edit this page" links point at — the same one sync-guides.mjs uses
// for its blob URLs. Not `version`: that is a URL segment and `latest` is no branch.
const ref = process.env.DOCS_REF || 'snapshot'

// Canonical published origin. Links that point OUTSIDE the current docs base
// (other doc versions) must be full URLs — VitePress
// auto-prepends `base` to any root-absolute (`/…`) link, which would otherwise
// double the path (e.g. /emf.ogc.features/snapshot/emf.ogc.features/guides/…). Links to pages WITHIN
// this version stay base-relative (e.g. `/guides/overview`).
const SITE = 'https://eclipse-fennec.github.io/emf.ogc.features'


// Version selector. Only `snapshot` is deployed today; keep as data so adding
// `latest` and tagged versions later is a one-liner.
const versions = [{ text: 'snapshot', link: `${SITE}/snapshot/` }]

const guideItems = GUIDES.map((g) => ({ text: g.title, link: `/guides/${g.slug}` }))

// "Edit this page" has to lead to the SOURCE of a guide (docs/<file>.md), not to
// the synced copy the site is built from (guides/<slug>.md). VitePress serializes
// a function from the config and evaluates it on the client without its closure,
// so the pattern may not reference anything from this module — the mapping and
// the ref are baked into its source.
const editSources = Object.fromEntries(GUIDES.map((g) => [`guides/${g.slug}.md`, `docs/${g.file}`]))
const editPattern = new Function(
  'page',
  `const sources = ${JSON.stringify(editSources)}\n` +
    `const path = sources[page.filePath] || 'docs-site/docs/' + page.filePath\n` +
    `return 'https://github.com/eclipse-fennec/emf.ogc.features/edit/${ref}/' + path`
) as (page: { filePath: string }) => string

export default defineConfig({
  title: 'Fennec OGC Features',
  description:
    'OGC API Features for EMF models — collections, items, CQL2 filtering and GeoJSON on top of Fennec persistence.',
  lang: 'en-US',
  base,
  cleanUrls: true,
  lastUpdated: true,
  // On, deliberately: it was switched off while the guides' GitHub-style anchors
  // resolved to nothing on the site, which sync-guides.mjs now fixes — that script
  // checks the anchors, VitePress checks the page links, and a broken one fails the
  // build instead of shipping.
  ignoreDeadLinks: false,


  head: [
    ['link', { rel: 'icon', type: 'image/png', href: `${base}fennec-logo.png` }],
    ['meta', { name: 'theme-color', content: '#c0631c' }],
    ['meta', { property: 'og:type', content: 'website' }],
    ['meta', { property: 'og:title', content: 'Fennec OGC Features' }],
    [
      'meta',
      {
        property: 'og:description',
        content:
          'OGC API Features for EMF models on top of Fennec persistence.',
      },
    ],
  ],

  themeConfig: {
    logo: '/fennec-logo.png',
    siteTitle: 'Fennec OGC Features',

    nav: [
      { text: 'Home', link: '/' },
      { text: 'Guides', items: guideItems },
      { text: `version: ${version}`, items: versions },
    ],

    sidebar: {
      '/guides/': [{ text: 'User Guides', items: guideItems }],
    },

    socialLinks: [{ icon: 'github', link: 'https://github.com/eclipse-fennec/emf.ogc.features' }],

    search: { provider: 'local' },

    // The repository root IS the workspace, so a source path has no `workspace/`
    // segment, and `main` does not exist as a branch — see editPattern above.
    editLink: {
      pattern: editPattern,
      text: 'Edit this page on GitHub',
    },

    footer: {
      message:
        'Released under the EPL-2.0 License. Eclipse Fennec is part of the Eclipse Foundation.',
      copyright: 'Copyright © Eclipse Foundation and contributors',
    },
  },
})
