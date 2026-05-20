# Testing

## Unit Tests

```bash
./gradlew testDebugUnitTest
```

Current coverage includes:

- Fuzzy app search scoring.
- Natural-language command parsing.
- Heuristic app prediction.

## Lint

```bash
./gradlew lintDebug
```

## APK Build

```bash
./gradlew assembleDebug
```

## Instrumented UI Smoke Test

Run from Android Studio or an attached emulator:

```bash
./gradlew connectedDebugAndroidTest
```

The current smoke test verifies that the home screen renders the Orbit identity.
