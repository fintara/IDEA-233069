plugins {
    kotlin("jvm") version "1.3.61"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation(group = "org.jetbrains.exposed", name = "exposed-core", version = "0.21.1")
    implementation(group = "org.jetbrains.exposed", name = "exposed-dao", version = "0.21.1")
    implementation(group = "org.jetbrains.exposed", name = "exposed-jdbc", version = "0.21.1")
    implementation(group = "org.jetbrains.exposed", name = "exposed-java-time", version = "0.21.1")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}