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
        getByName(BuildType.release) {
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), BuildType.proguardRelease)
        }
        getByName(BuildType.debug) {
            signingConfig = signingConfigs.getByName("debug")
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), BuildType.proguardDebug)
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
}