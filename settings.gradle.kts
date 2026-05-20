pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "OrbitLauncher"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":app")

include(":core:model")
project(":core:model").projectDir = file("core/model")
include(":core:common")
project(":core:common").projectDir = file("core/common")
include(":core:database")
project(":core:database").projectDir = file("core/database")
include(":core:datastore")
project(":core:datastore").projectDir = file("core/datastore")
include(":core:domain")
project(":core:domain").projectDir = file("core/domain")
include(":core:launcher")
project(":core:launcher").projectDir = file("core/launcher")
include(":core:security")
project(":core:security").projectDir = file("core/security")
include(":core:ui")
project(":core:ui").projectDir = file("core/ui")

include(":feature:home")
project(":feature:home").projectDir = file("feature/home")
include(":feature:search")
project(":feature:search").projectDir = file("feature/search")
include(":feature:gestures")
project(":feature:gestures").projectDir = file("feature/gestures")
include(":feature:themes")
project(":feature:themes").projectDir = file("feature/themes")
include(":feature:productivity")
project(":feature:productivity").projectDir = file("feature/productivity")
include(":feature:settings")
project(":feature:settings").projectDir = file("feature/settings")
include(":feature:widgets")
project(":feature:widgets").projectDir = file("feature/widgets")
include(":feature:backup")
project(":feature:backup").projectDir = file("feature/backup")
include(":feature:privacy")
project(":feature:privacy").projectDir = file("feature/privacy")
include(":feature:plugins")
project(":feature:plugins").projectDir = file("feature/plugins")
