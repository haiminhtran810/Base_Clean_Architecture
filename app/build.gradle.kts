plugins {
    id(GradlePlugins.android)
    kotlin(GradlePlugins.kotlinAndroid)
    kotlin(GradlePlugins.kotlinApt)
}

android {
    compileSdk = Android.compileSdk
    flavorDimensions.add("default")

    defaultConfig {
        applicationId = Android.applicationId
        minSdk = Android.minSdk
        targetSdk = Android.targetSdk
        versionCode = Android.versionCode
        versionName = Android.versionName

        testInstrumentationRunner = AndroidJUnit.runner
    }

    buildTypes {
        getByName(BuildType.release) {
            isMinifyEnabled = BuildType.minifyRelease
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), BuildType.proguardRelease)
        }
        getByName(BuildType.debug) {
            signingConfig = signingConfigs.getByName("debug")
            isMinifyEnabled = BuildType.minifyDebug
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
}