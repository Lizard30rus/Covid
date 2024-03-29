object Dependencies {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val lifecycle =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleVersion}"
    const val viewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"

    const val coroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutineVersion}"

    const val ui = "androidx.compose.ui:ui:${Versions.composeVersion}"
    const val uiToolingDebug = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
    const val uiToolingPreview =
        "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"
    const val material3 =
        "androidx.compose.material3:material3:${Versions.materialVersion}"
    const val activity =
        "androidx.activity:activity-compose:${Versions.activityCompose}"
    const val composeViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.viewModelCompose}"
    const val navigationCompose =
        "androidx.navigation:navigation-compose:${Versions.navigationCompose}"

    const val dagger = "com.google.dagger:hilt-android:${Versions.daggerVersion}"
    const val compiler = "com.google.dagger:dagger-compiler:${Versions.daggerVersion}"

    const val roomCompiler  = "androidx.room:room-compiler:${Versions.roomVersion}"
    const val roomRuntime  = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomKtx  = "androidx.room:room-ktx:${Versions.roomVersion}"
}