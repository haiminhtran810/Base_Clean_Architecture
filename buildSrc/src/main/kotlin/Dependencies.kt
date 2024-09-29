object Versions {
    const val kotlin = "1.8.0"
    const val androidxCore = "1.6.0"
    const val coroutines = "1.3.6"
    const val lifecycle = "2.5.1"
    const val lifecycleExt = "2.2.0"
    const val appCompat = "1.6.1"
    const val constraintLayout = "2.1.4"
    const val viewpager2 = "1.0.0"
    const val multidex = "2.0.0"
    const val cardview = "1.0.0"
    const val recyclerView = "1.3.0"
    const val androidXExtTest = "1.1.3"
    const val runner = "1.1.1"
    const val espressoCore = "3.1.1"
    const val hamcrest = "1.3"
    val androidPlugin = "7.1.3"
    val support = "1.3.1"
    val supportDesign = "1.4.0"
    val constraintlayout = "2.1.1"
    val junit = "4.13.2"
    val jUnitExtension = "1.1.3"
    val espresso = "3.4.0"
    val lifecycleSaved = "1.0.0-alpha04"
    val fragmentKtx = "1.3.0-alpha01"
    val navigation = "2.3.5"
    val retrofit = "2.9.0"
    val okLogging = "3.9.0"
    val coroutineAdapter = "0.9.2"
    val moshi = "1.12.0"
    val timber = "5.0.1"
    val koin = "2.2.2"
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
    const val minSdk = 24
    const val targetSdk = 34
    const val versionCode = 1
    const val versionName = "1.0"
    const val compileSdk = 34

}

object GradlePlugins {
    const val android = "com.android.application"
    const val kotlinAndroid = "android"
    const val kotlinApt = "kotlin-kapt"
    const val androidLib = "com.android.library"
    const val kotlinAndroidLib = "kotlin-android"
    const val navigation = "androidx.navigation.safeargs"
    const val kotlinParcelize = "kotlin-parcelize"
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
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlinCore = "androidx.core:core-ktx:${Versions.androidxCore}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val lifecycleExtensions =
        "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleExt}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"

    const val appcompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val material = "com.google.android.material:material:${Versions.appCompat}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val viewpager2 = "androidx.viewpager2:viewpager2:${Versions.viewpager2}"
    const val multidex = "androidx.multidex:multidex:${Versions.multidex}"
    const val cardview = "androidx.cardview:cardview:${Versions.cardview}"
    const val swiperefreshlayout =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.cardview}"

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
    val okLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okLogging}"

    // Moshi
    val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    val moshiKotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    val moshiAdapter = "com.squareup.moshi:moshi-adapters:${Versions.moshi}"
    val moshiCodeGen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"
    val moshiRetrofitAdapter =
        "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.coroutineAdapter}"

    // Timber
    val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    // Koin
    val koinCore = "io.insert-koin:koin-core:${Versions.koin}"
    val koinAndroid = "io.insert-koin:koin-android:${Versions.koin}"
    val koinAndroidScope = "io.insert-koin:koin-androidx-scope:${Versions.koin}"
    val koinViewModel = "io.insert-koin:koin-android-viewmodel:${Versions.koin}"
    val koinFragment = "io.insert-koin:koin-androidx-fragment:${Versions.koin}"
    val koinTest = "io.insert-koin:koin-test:${Versions.koin}"

    val junit = "junit:junit:${Versions.junit}"
    val testExtJunit = "androidx.test.ext:junit:${Versions.androidXExtTest}"
    val runner = "androidx.test:runner:${Versions.runner}"
    val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    val hamcrest = "org.hamcrest:hamcrest-all:${Versions.hamcrest}"
}