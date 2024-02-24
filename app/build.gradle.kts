plugins {
    id(Plugins.androidApplication)
    id(Plugins.kotlinAndroid)
    id(Plugins.kotlinKapt)
}

android {
    namespace = "com.example.covid"
    compileSdk =  Release.compileSdk

    defaultConfig {
        applicationId = "com.example.covid"
        minSdk = Release.minSdk
        targetSdk = Release.targetSdk
        versionCode = Release.versionCode
        versionName = Release.versionName

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

        implementation(dagger)
        kapt(compiler)

        implementation(activity)
        implementation(composeViewModel)
        implementation(navigationCompose)

        implementation(ui)
        implementation(uiToolingPreview)
        implementation(material3)
        debugImplementation(uiToolingDebug)

    }
    with(Modules) {
        
        implementation(project(core_data))
        implementation(project(core_database))

        implementation(project(core_ui))

        implementation(project(core_common))

        implementation(project(core_navigation))
        
        implementation(project(core_alcohol))
        implementation(project(feature_alcohol))

        implementation(project(core_food))
        implementation(project(feature_food))

        implementation(project(core_favorites))
        implementation(project(feature_favorites))
    }
}