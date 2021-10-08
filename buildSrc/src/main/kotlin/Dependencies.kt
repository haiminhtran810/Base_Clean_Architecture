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
    val navigation = "2.3.5"
    val retrofit = "2.2.0"
    val okLogging = "3.9.0"
    val moshi = "1.12.0"
    val timber = "4.7.1"
    val koin = "2.2.2"
    val coroutines = "1.5.30"
}

object Url {
    const val fabric = "https://maven.fabric.io/public"
    const val sonatype = "https://oss.sonatype.org/content/repositories/snapshots"
    const val jitpack = "https://jitpack.io"
}

object BuildPlugins {
    val androidPlugin = "com.android.tools.build:gradle:${Versions.androidPlugin}"
    val navigationSafe =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
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
    const val navigation = "androidx.navigation.safeargs"
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

    // navigation
    val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    val navigationSupport =
        "androidx.navigation:navigation-dynamic-features-fragment:${Versions.navigation}"
    val navigationTesting = "androidx.navigation:navigation-testing:${Versions.navigation}"

    // retrofit
    val retrofitRuntime = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofitMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    val retrofitMock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit}"
    val retrofitAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    val okLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okLogging}"

    // Moshi
    val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    val moshiKotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    val moshiAdapter = "com.squareup.moshi:moshi-adapters:${Versions.moshi}"
    val moshiCodeGen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"

    // Timber
    val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    // Koin
    val koinCore = "io.insert-koin:koin-core:${Versions.koin}"
    val koinAndroid = "io.insert-koin:koin-android:${Versions.koin}"
    val koinAndroidScope = "io.insert-koin:koin-androidx-scope:${Versions.koin}"
    val koinViewModel = "io.insert-koin:koin-android-viewmodel:${Versions.koin}"
    val koinFragment = "io.insert-koin:koin-androidx-fragment:${Versions.koin}"
    val koinTest = "io.insert-koin:koin-test:${Versions.koin}"

    // Coroutines
    val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$Versions.coroutines"
    val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$Versions.coroutines"
}