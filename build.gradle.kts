// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        val kotlinVersion: String by project
        classpath("com.android.tools.build:gradle:7.4.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
    }
}
