buildscript {
    repositories {
        google()
        mavenCentral()

        // Android Build Server
        maven { url = uri("../nowinandroid-prebuilts/m2repository") }
    }

}

plugins {
    alias(libs.plugins.androidGradlePlugin) apply false
    alias(libs.plugins.androidGradleLibraryPlugin) apply false
    alias(libs.plugins.kotlinPlugin) apply false
}