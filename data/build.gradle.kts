plugins {
    id(GradlePlugins.androidLib)
    id(GradlePlugins.kotlinAndroidLib)
    kotlin(GradlePlugins.kotlinApt)
}

android {
    compileSdk = Android.compileSdk
    flavorDimensions.add("default")

    defaultConfig {
        minSdk = Android.minSdk
        targetSdk = Android.targetSdk
        testInstrumentationRunner = AndroidJUnit.runner
    }

    buildTypes {
        val API_URL = "https://api.themoviedb.org/3/"
        val SMALL_IMAGE_URL = "https://image.tmdb.org/t/p/w200"
        val LARGE_IMAGE_URL = "https://image.tmdb.org/t/p/w500"
        val ORIGINAL_IMAGE_URL = "https://image.tmdb.org/t/p/original"
        val API_KEY = "3e047b2cc8fc38537ee7b3e6f547e53c"
        val YOUTUBE_URL = "https://www.youtube.com/watch?v="

        getByName(BuildType.release) {
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), BuildType.proguardRelease)

            buildConfigField("String", "API_URL", "\"${API_URL}\"")
            buildConfigField("String", "SMALL_IMAGE_URL", "\"${SMALL_IMAGE_URL}\"")
            buildConfigField("String", "LARGE_IMAGE_URL", "\"${LARGE_IMAGE_URL}\"")
            buildConfigField("String", "ORIGINAL_IMAGE_URL", "\"${ORIGINAL_IMAGE_URL}\"")
            buildConfigField("String", "API_KEY", "\"${API_KEY}\"")
            buildConfigField("String", "YOUTUBE_URL", "\"${YOUTUBE_URL}\"")
        }

        getByName(BuildType.debug) {
            signingConfig = signingConfigs.getByName("debug")
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), BuildType.proguardDebug)

            buildConfigField("String", "API_URL", "\"${API_URL}\"")
            buildConfigField("String", "SMALL_IMAGE_URL", "\"${SMALL_IMAGE_URL}\"")
            buildConfigField("String", "LARGE_IMAGE_URL", "\"${LARGE_IMAGE_URL}\"")
            buildConfigField("String", "ORIGINAL_IMAGE_URL", "\"${ORIGINAL_IMAGE_URL}\"")
            buildConfigField("String", "API_KEY", "\"${API_KEY}\"")
            buildConfigField("String", "YOUTUBE_URL", "\"${YOUTUBE_URL}\"")
        }
    }

    productFlavors {
        create("staging") {

        }

        create("production") {

        }

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Libs.ktx)
    implementation(Libs.supportAppCompat)
    implementation(Libs.supportDesign)
    implementation(Libs.constraintlayout)
    testImplementation(Libs.junit)
    androidTestImplementation(Libs.jUnitExtension)
    androidTestImplementation(Libs.espressoCore)

    // Retrofit
    implementation(Libs.retrofitAdapter)
    implementation(Libs.retrofitRuntime)
    implementation(Libs.retrofitMoshi)
    implementation(Libs.retrofitMock)
    implementation(Libs.okLogging)

    // Moshi
    implementation(Libs.moshi)
    implementation(Libs.moshiAdapter)
    implementation(Libs.moshiKotlin)
    kapt(Libs.moshiCodeGen)

    // Timber
    implementation(Libs.timber)


    // Koin
    implementation(Libs.koinCore)
    implementation(Libs.koinAndroid)
    implementation(Libs.koinAndroidScope)
    implementation(Libs.koinViewModel)
    implementation(Libs.koinFragment)
    implementation(Libs.koinTest)

    // Module
    implementation(project(Modules.domain))

    // Kotlin Coroutines
    implementation(Libs.coroutinesAndroid)
    implementation(Libs.coroutinesCore)
}