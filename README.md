# MPD

Monorepo scaffold for a firmware + Android + web + Java backend MVP.

## Modules

- `firmware/` C++ command handler prototype and tests
- `android/` Java Android app scaffold with command UI
- `web/` HTML/CSS/JS dashboard scaffold
- `backend/` Java service skeleton for command/status contract
- `docs/` shared protocol documentation

## MVP command set

- `LED_ON`
- `LED_OFF`
- `GET_STATUS`

See `docs/protocol.md`.

## Local checks

- Firmware: `make -C firmware test`
- Backend: `mvn -q -f backend/pom.xml -DskipTests compile`
- Smoke: `./scripts/smoke.sh`
