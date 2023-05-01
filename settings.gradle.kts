rootProject.name = "ktfmt-parent"
include(":ktfmt")
project(":ktfmt").projectDir = file("core")

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention").version("0.5.0")
}
