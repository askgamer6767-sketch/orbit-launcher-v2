# Privacy

Orbit Launcher ships with no telemetry, analytics, advertising SDK, remote logging, or cloud dependency by default.

## Defaults

- App prediction runs locally.
- Search indexes installed launchable apps and local launcher settings.
- Backup export is local JSON.
- Sensitive features are opt-in.
- No network permission is declared in the prototype.

## Opt-In Surfaces

- Contacts search requires contacts permission.
- Usage insights require Android usage access.
- Notification minimizer requires notification listener access in a future implementation.
- Widget binding uses Android's user-approved widget picker/binding flow.
- Cloud sync is planned as optional and disabled by default.

## Sensitive Data

`core:security` provides an encrypted local settings helper for future sensitive launcher data. The backup rules exclude encrypted preferences from Android cloud/device backup.
