plugins {
    id("ca.stellardrift.polyglot-version-catalogs") version "5.0.0"
}

rootProject.name = "bluetils"

include("core", "paper")

project(":core").name = "bluetils-core"
project(":paper").name = "bluetils-paper"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

