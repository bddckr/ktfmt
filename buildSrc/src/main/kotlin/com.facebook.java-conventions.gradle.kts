plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenCentral()
}

group = "com.facebook"
version = "0.45-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}
