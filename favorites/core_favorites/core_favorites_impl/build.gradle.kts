plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.core_favorites_impl"
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
}

dependencies {
    api(project(Modules.core_favorites_api))
    with(Dependencies) {
        implementation(coreKtx)
        implementation(lifecycle)
        implementation(coroutines)
        implementation(appCompat)
    }
}