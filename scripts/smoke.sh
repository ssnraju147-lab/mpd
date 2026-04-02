#!/usr/bin/env bash
set -euo pipefail

echo "[firmware]"
make -C firmware test

echo "[backend]"
mvn -q -f backend/pom.xml -DskipTests compile

echo "[web]"
test -f web/index.html && test -f web/app.js && test -f web/styles.css

echo "Smoke checks passed"
