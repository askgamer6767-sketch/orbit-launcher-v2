# Architecture

Orbit uses MVVM + Clean Architecture with Android feature modules.

## Layers

- `core:model`: platform-light models shared across the app.
- `core:domain`: interfaces for repositories, prediction, plugins, privacy, productivity, theme, backup, and search.
- `core:database`: Room schema for installed apps, usage events, themes, gestures, and focus profiles.
- `core:datastore`: DataStore implementation for lightweight preferences and local JSON backup.
- `core:launcher`: Android-specific integrations such as package indexing, app launching, widget hosting, privacy state checks, search, and predictions.
- `core:ui`: shared Compose theme, glass surfaces, app glyphs, search field, and reusable components.
- `feature:*`: isolated Compose screens with state passed in from the app shell.
- `app`: Hilt wiring, root view model, navigation shell, and Android manifest.

## Data Flow

1. `MainActivity` renders `OrbitAppRoot` and collects `OrbitViewModel.uiState`.
2. `OrbitViewModel` combines app index, search results, theme state, gesture mappings, focus profiles, plugin manifests, permissions, and backup status.
3. `AndroidAppRepository` indexes launchable activities into Room and launches selected apps.
4. `AndroidSearchRepository` combines fuzzy app search with local command parsing.
5. `HeuristicPredictionEngine` ranks apps locally using recency, frequency, time-of-day, and focus context.
6. Feature screens emit intents through callbacks; persistence and side effects remain in the view model/repositories.

## Extension Points

- `PredictionEngine`: replace heuristics with a TFLite/on-device model provider.
- `PluginRegistry`: evolve the declarative plugin manifest format.
- `BackupRepository`: add encrypted export or optional sync providers.
- `GestureActionRepository`: expand safe routine actions without arbitrary code execution.
- `OrbitWidgetHostController`: connect full widget picker and host rendering flows.
