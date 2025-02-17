// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.navigation.safe.args.gradle.plugin) apply false
    alias(libs.plugins.kotlin.kapt) apply false
    alias(libs.plugins.com.google.dagger.hilt.android) apply false
}

