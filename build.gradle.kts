// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.5.0")
        // Due an issue the full qualified name is required here. See https://github.com/gradle/kotlin-dsl/issues/1291
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${to.dev.dev_android.build.BuildConfig.kotlinVersion}")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}
plugins {
    buildSrcVersions
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

/** Update Gradle with: $ ./gradlew buildSrcVersions && ./gradlew wrapper   ***/
tasks.wrapper {
    gradleVersion = Versions.gradleLatestVersion
    distributionType = Wrapper.DistributionType.ALL
}

task("clean") {
    delete(rootProject.buildDir)
}

buildSrcVersions {
    indent = "    "
}