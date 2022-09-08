plugins {
    `kotlin-dsl`
}

group = "letsplaybadminton.buildlogic"

repositories {
    google()
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation(libs.androidGradlePlugin)
    implementation(libs.kotlinGradlePlugin)
    implementation(libs.spotlessGradlePlugin)
    implementation(libs.hiltGradlePlugin)
    implementation(libs.moleculeGradlePlugin)
    implementation(libs.kotlinSerializationPlugin)
    implementation(libs.buildkonfigPlugin)
    implementation(libs.firebasePlugin)
}
