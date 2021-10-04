object Versions {
    val kotlin = "1.5.31"
    val androidPlugin = "7.0.2"
    val androidxCore = "1.6.0"
    val support = "1.3.1"
    val supportDesign = "1.4.0"
    val constraintlayout = "2.1.1"
    val junit = "4.13.2"
    val jUnitExtension = "1.1.3"
    val espresso = "3.4.0"
    val lifecycle = "2.2.0-alpha04"
    val lifecycleSaved = "1.0.0-alpha04"
    val fragmentKtx = "1.3.0-alpha01"
}

object Url {
    const val fabric = "https://maven.fabric.io/public"
    const val sonatype = "https://oss.sonatype.org/content/repositories/snapshots"
    const val jitpack = "https://jitpack.io"
}

object BuildPlugins {
    val androidPlugin = "com.android.tools.build:gradle:${Versions.androidPlugin}"
}

object Android {
    const val applicationId = "com.htm.base_clean_architecture"
    const val minSdk = 21
    const val targetSdk = 30
    const val versionCode = 1
    const val versionName = "1.0"
    const val compileSdk = 30

}

object GradlePlugins {
    const val android = "com.android.application"
    const val kotlinAndroid = "android"
    const val kotlinApt = "kapt"
    const val androidLib = "com.android.library"
    const val kotlinAndroidLib = "kotlin-android"
}

object Modules {
    const val domain = ":domain"
    const val data = ":data"
}

object AndroidJUnit {
    const val runner = "androidx.test.runner.AndroidJUnitRunner"
}

object BuildType {
    const val debug = "debug"
    const val release = "release"

    const val minifyRelease = true
    const val shrinkResourcesRelease = true
    const val proguardRelease = "proguard-rules.pro"

    const val minifyDebug = false
    const val proguardDebug = "proguard-rules.pro"
}

object Libs {
    val ktx = "androidx.core:core-ktx:${Versions.androidxCore}"
    val supportAppCompat = "androidx.appcompat:appcompat:${Versions.support}"
    val supportDesign = "com.google.android.material:material:${Versions.supportDesign}"
    val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"

    // JUnit for testing
    val junit = "junit:junit:${Versions.junit}"
    val jUnitExtension = "androidx.test.ext:junit:${Versions.jUnitExtension}"

    // espresso for testing
    val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"

    // lifecycle
    val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycle}"
    val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata:${Versions.lifecycle}"
    val lifecycleLiveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel:${Versions.lifecycle}"
    val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val lifecycleJava8 = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"
    val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    val lifecycleSavedState =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycleSaved}"
    val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"
}