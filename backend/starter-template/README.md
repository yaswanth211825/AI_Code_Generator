# Starter template

A minimal Vite + React + TypeScript + Tailwind + daisyUI scaffold. When a user creates a project, the backend copies these files into that project's storage as its starting point (see `ProjectTemplateServiceImpl`).

This only needs to be uploaded **once** per storage backend (local MinIO, or your production S3-compatible storage) - not per project.

## Seeding

Requires the [MinIO client (`mc`)](https://min.io/docs/minio/linux/reference/minio-mc.html).

```bash
./seed.sh <endpoint-url> <access-key> <secret-key>

# local Docker MinIO:
./seed.sh http://localhost:9000 minioadmin minioadmin123

# production (e.g. Supabase S3-compatible storage):
./seed.sh https://<project-ref>.supabase.co/storage/v1/s3 <access-key> <secret-key>
```

This creates two buckets if they don't already exist - `projects` (where generated project files live) and `starter-projects` (holding this template) - and uploads the template under `starter-projects/react-vite-tailwind-daisyui-starter/`.

Without this step, project creation fails with a `NoSuchBucket` error.
