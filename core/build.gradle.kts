plugins {
    id("com.facebook.java-conventions")
    kotlin("jvm").version("1.8.21")
}

dependencies {
    api("com.google.guava:guava:29.0-jre")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.6.20-M1")
    api("org.jetbrains.kotlin:kotlin-test:1.6.20-M1")
    api("org.jetbrains.kotlin:kotlin-compiler-embeddable:1.6.20-M1")
    api("net.java.dev.jna:jna:4.2.2")
    api("com.google.googlejavaformat:google-java-format:1.8")
    testImplementation("junit:junit:4.13.1")
    testImplementation("com.google.truth:truth:1.0")
}

description = "Ktfmt"

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of("8"))
    }
}
