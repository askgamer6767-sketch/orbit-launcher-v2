# Contributing

Thanks for helping build Orbit Launcher.

## Workflow

1. Open an issue for significant behavior changes.
2. Keep changes scoped to one feature or architecture concern.
3. Run tests and lint before opening a pull request.
4. Keep privacy-sensitive features opt-in and local-first.
5. Avoid adding telemetry, analytics, or network SDKs without an explicit design discussion.

## Code Style

- Kotlin official style.
- Compose state flows down and events flow up.
- Domain interfaces live in `core:domain`; Android integrations live outside it.
- Prefer small immutable models and Flow-based streams.
- Add tests for scoring, parsing, persistence, and permission behavior.

## Local Checks

```bash
./gradlew testDebugUnitTest lintDebug assembleDebug
```
