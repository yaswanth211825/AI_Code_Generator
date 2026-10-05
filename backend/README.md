# Backend

Spring Boot (Java 21) API for the AI app builder: JWT auth, project CRUD, project members/roles, and an LLM-driven chat endpoint that streams generated code (SSE) and persists file edits to object storage + Postgres.

## Local development

Requires Docker (for Postgres + object storage) and Java 21.

```bash
docker compose -f services.docker-compose.yml up -d
./starter-template/seed.sh http://localhost:9000 minioadmin minioadmin123
./mvnw spring-boot:run
```

The API runs at `http://localhost:8080`. Default local credentials match `services.docker-compose.yml` (see `application.yaml` for the full list of env vars and their local defaults).

The `seed.sh` step only needs to run once - it uploads the starter template new projects are cloned from (see [starter-template/README.md](starter-template/README.md)). Skipping it means project creation will fail with a `NoSuchBucket` error.

To use the AI chat feature locally, set an API key before starting:

```bash
export OPENROUTER_API_KEY=your-key-here
./mvnw spring-boot:run
```

## Configuration

All config in `application.yaml` reads from environment variables with local-dev defaults baked in. See [.env.example](.env.example) for the full list (database, object storage, JWT secret, LLM provider key, CORS origins, Stripe keys).

## Deploying

This repo includes a `Dockerfile` (multi-stage Maven build -> JRE runtime) suitable for any container host (e.g. Render, Fly.io, Railway). Point the host at this `backend/` directory and set the environment variables from `.env.example` with real values:

- Postgres connection string (with the `pgvector` extension enabled)
- S3-compatible object storage credentials
- An LLM provider API key (OpenRouter by default)
- `CORS_ALLOWED_ORIGINS` set to your deployed frontend's origin

Also run `./starter-template/seed.sh <endpoint> <access-key> <secret-key>` once against your production storage, the same as local dev - otherwise project creation will fail.
