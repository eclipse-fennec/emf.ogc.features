// The published, user-facing guides (allowlist). Shared by the sync script and
// the VitePress config so the set and its order are defined exactly once.
//   file  — source markdown in ../docs
//   slug  — route name under /guides/
//   title — sidebar / nav label
export const GUIDES = [
  { file: 'ogc-features-overview.md', slug: 'overview', title: 'Overview' },
];
