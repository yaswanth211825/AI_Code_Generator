# Frontend

React + TypeScript + Vite + shadcn/ui client for the AI app builder. Chat with an AI on one side to generate/edit a project; browse the generated files on the other.

## Local development

Requires the backend running locally (see [../backend/README.md](../backend/README.md)).

```bash
npm install
npm run dev
```

Runs at `http://localhost:5173`, talking to the backend at `http://localhost:8080` by default.

To point at a different backend (e.g. a deployed one), set `VITE_API_URL`:

```bash
VITE_API_URL=https://your-backend-host npm run dev
```

## Deploying

Built as a static site (`npm run build` -> `dist/`) and deployed to GitHub Pages via `.github/workflows/deploy.yml` at the repo root. Set the deployed backend's URL as a repository variable before the workflow will point at the right API:

> Repo Settings -> Secrets and variables -> Actions -> Variables -> `VITE_API_URL`

Routing uses `HashRouter` so deep links (e.g. `/#/projects/5`) work on GitHub Pages without server-side rewrites.

## Known limitations of this hosted demo

- **Live preview** ("Run Preview") is disabled — running arbitrary generated code in a sandboxed browser preview isn't implemented.
- **Project download (zip)** is disabled — not implemented on the backend.

Both are UI affordances left in place but intentionally disabled rather than removed, since the rest of the feature (chat-driven code generation, file browsing) works end-to-end.
