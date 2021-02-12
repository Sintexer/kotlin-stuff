import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.21"
    application
}

group = "com.ilyabuglakov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
    google()
}

application {
    mainClassName = "MainKt"
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.4.2")
    testImplementation("org.assertj:assertj-core:3.12.2")
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.4.2")
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<Test> {
    useJUnitPlatform()
}
