plugins {
    id(GradlePlugins.android)
    id(GradlePlugins.navigation)
    id(GradlePlugins.kotlinParcelize)
    id(GradlePlugins.kotlinAndroid)
    id("org.jetbrains.kotlin.android")
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
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
    viewBinding {
        isEnabled = true
    }
}

dependencies {

    implementation(Libs.kotlinCore)
    implementation(Libs.appcompat)
    implementation(Libs.material)
    implementation(Libs.constraintLayout)
    implementation(Libs.multidex)
    implementation(Libs.coroutinesAndroid)
    implementation(Libs.coroutinesCore)
    implementation(Libs.lifecycleExtensions)
    implementation(Libs.lifecycleRuntime)
    implementation(Libs.viewModel)
    implementation(Libs.liveData)
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")
    implementation("androidx.databinding:databinding-runtime:8.6.1")

    // Unit test
    testImplementation(Libs.junit)
    androidTestImplementation(Libs.runner)
    androidTestImplementation(Libs.espressoCore)

    // Navigation
    implementation(Libs.navigationFragmentKtx)
    implementation(Libs.navigationUiKtx)
    implementation(Libs.navigationSupport)
    implementation(Libs.navigationTesting)

    // Timber
    implementation(Libs.timber)

    // Koin
    implementation(Libs.koinCore)
    implementation(Libs.koinAndroid)
    implementation(Libs.koinAndroidScope)
    implementation(Libs.koinViewModel)
    implementation(Libs.koinFragment)
    implementation(Libs.koinTest)

    // Modules
    implementation(project(Modules.data))
    implementation(project(Modules.domain))
}