plugins {
    id(Plugins.androidLibrary)
    id(Plugins.kotlinAndroid)
    id(Plugins.parcelize)
}

android {
    namespace = "com.example.core_navigation"
    compileSdk =  Release.compileSdk

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
        implementation(navigationCompose)
        implementation(coreKtx)
        implementation(lifecycle)
        implementation(coroutines)
        implementation(appCompat)
    }

}