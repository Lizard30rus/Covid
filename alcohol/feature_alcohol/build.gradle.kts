plugins {
    id(Plugins.androidLibrary)
    id(Plugins.kotlinAndroid)
}

android {
    namespace = "com.example.feature_alcohol"
    compileSdk = Release.compileSdk

    defaultConfig {
        minSdk = Release.minSdk
        targetSdk = Release.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion ="1.4.8"
    }
}

dependencies {
    with(Dependencies) {
        implementation(coreKtx)
        implementation(lifecycle)
        implementation(coroutines)
        implementation(appCompat)
        implementation(activity)
        implementation(composeViewModel)
        implementation(navigationCompose)

        implementation(ui)
        implementation(uiToolingPreview)
        implementation(material3)
        debugImplementation(uiToolingDebug)
    }
    with(Modules) {
        implementation(project(core_food))
        implementation(project(core_navigation))
        implementation(project(core_ui))
    }
}