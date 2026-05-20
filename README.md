# Orbit Launcher

Orbit Launcher is a futuristic, privacy-first Android launcher prototype for power users, students, creators, and the AI era. It is built with Kotlin, Jetpack Compose, MVVM + Clean Architecture, Hilt, Room, DataStore, Coroutines, and Flow.

The first prototype focuses on a polished Home + Search experience while scaffolding the rest of the production architecture: gestures, themes, widgets, productivity modes, backup/restore, privacy, plugins, and local-only smart suggestions.

## Highlights

- Android 10+ launcher entry point with `HOME` intent support.
- Installed app indexing through Android package manager APIs.
- Compose home grid, adaptive dock, Orbit Search, command palette, settings, theme studio, gesture studio, focus modes, privacy dashboard, widgets surface, backup surface, and plugin console.
- Local heuristic prediction engine with no cloud dependency.
- Room app index and usage event persistence.
- DataStore-backed themes, gestures, focus profile state, and JSON backup.
- Hilt dependency injection and modular Gradle Kotlin DSL project structure.
- No telemetry, analytics, ads, or tracking by default.

## Requirements

- Android Studio with Android SDK 36.
- JDK 17.
- Internet access on first build to download Gradle and Android dependencies.

## Build

```powershell
.\gradlew.bat testDebugUnitTest lintDebug assembleDebug
```

On macOS/Linux:

```bash
./gradlew testDebugUnitTest lintDebug assembleDebug
```

The debug APK will be generated at:

```text
app/build/outputs/apk/debug/app-debug.apk
```

## Project Structure

```text
app/                 Android application, Hilt setup, root Compose shell
core/model/          Immutable domain models
core/common/         Fuzzy search, command parsing, classification utilities
core/domain/         Repository and engine interfaces
core/database/       Room entities, DAOs, OrbitDatabase
core/datastore/      DataStore settings, focus, gestures, backup repository
core/launcher/       Package indexing, launch intents, prediction, privacy, plugins
core/security/       Encrypted local settings helper
core/ui/             Shared Compose theme and UI components
feature/*            Screen-level Compose modules
```

## Philosophy

Orbit is local-first and privacy-first. Smart features start as transparent on-device heuristics, and all sensitive surfaces are opt-in. The architecture is prepared for local model providers and plugin manifests without requiring cloud services or arbitrary code execution.
