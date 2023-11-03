plugins {
    id(Plugins.androidApplication)
    id(Plugins.kotlinAndroid)
    id(Plugins.kotlinKapt)
    id(Plugins.daggerHiltAndroidPlugin)
}

android {
    namespace = "com.example.covid"
    compileSdk =  34

    defaultConfig {
        applicationId = "com.example.covid"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion ="1.4.8"
    }
    packagingOptions {
        resources {
            excludes +="/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    with(Dependencies) {
        implementation(coreKtx)
        implementation(lifecycle)
        implementation(coroutines)
        implementation(appCompat)

        implementation(hilt)
        implementation(hiltNavigationCompose)
        implementation(workManager)
        kapt(composeCompiler)
        kapt(compiler)

        implementation(activity)
        implementation(ui)
        implementation(uiToolingPreview)
        implementation(material3)
        debugImplementation(uiToolingDebug)
    }
}