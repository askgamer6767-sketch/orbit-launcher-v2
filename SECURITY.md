# Security Policy

Orbit Launcher is a privacy-first local launcher. Please report security issues privately before opening public issues.

## Supported Versions

The prototype supports only the current `main` branch until tagged releases begin.

## Reporting

Open a private security advisory on the repository host or contact the maintainers through the project issue tracker with minimal public details.

## Design Rules

- No telemetry by default.
- No arbitrary plugin code execution.
- Sensitive settings should use encrypted local storage.
- Runtime permissions must be user-initiated and tied to a visible feature.
- Scoped storage and Android platform permission flows must be respected.
