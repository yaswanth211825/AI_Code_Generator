# AI Code Generator

An AI-powered app builder: describe what you want in a chat interface, and it generates and edits a real React project for you in real time, backed by an LLM.

## How it works

- **`backend/`** — Spring Boot (Java 21) API: JWT auth, project management, and an LLM-driven chat endpoint that streams generated code over Server-Sent Events while persisting file changes to object storage and Postgres.
- **`frontend/`** — React + TypeScript + Vite + shadcn/ui. A chat panel on one side, a live file tree/code viewer on the other, updating as the AI edits files.

### Architecture

```
Browser (React/Vite)  --->  Spring Boot API  --->  Postgres (pgvector)
                                   |
                                   +---> S3-compatible object storage (generated project files)
                                   |
                                   +---> LLM provider (OpenRouter, OpenAI-compatible)
```

## Running locally

1. **Backend** — see [backend/README.md](backend/README.md).
2. **Frontend** — see [frontend/README.md](frontend/README.md).

## Live demo

Frontend deployed to GitHub Pages via the workflow in `.github/workflows/deploy.yml`; backend deployed separately (see `backend/README.md` for hosting notes).
