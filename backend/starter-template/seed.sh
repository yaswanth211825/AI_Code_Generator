#!/usr/bin/env bash
# Uploads this starter template to an S3-compatible endpoint so project creation works.
# Requires the MinIO client (`mc`): https://min.io/docs/minio/linux/reference/minio-mc.html
#
# Usage:
#   ./seed.sh <endpoint-url> <access-key> <secret-key>
# Example (local Docker MinIO):
#   ./seed.sh http://localhost:9000 minioadmin minioadmin123

set -euo pipefail

ENDPOINT="${1:?endpoint URL required, e.g. http://localhost:9000}"
ACCESS_KEY="${2:?access key required}"
SECRET_KEY="${3:?secret key required}"
ALIAS="lovable-seed-target"
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

mc alias set "$ALIAS" "$ENDPOINT" "$ACCESS_KEY" "$SECRET_KEY"
mc mb --ignore-existing "$ALIAS/projects"
mc mb --ignore-existing "$ALIAS/starter-projects"
mc cp --recursive "$SCRIPT_DIR/react-vite-tailwind-daisyui-starter" "$ALIAS/starter-projects/"

echo "Done. Seeded starter-projects/react-vite-tailwind-daisyui-starter/ and created the projects bucket."
