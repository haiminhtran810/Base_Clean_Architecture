plugins {
    id(GradlePlugins.androidLib)
    id(GradlePlugins.kotlinAndroidLib)
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
}