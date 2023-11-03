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
        "androidx.activity:activity-compose:${Versions.activityComposeVersion}"
    const val composeViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.viewModelComposeVersion}"
    const val navigationCompose =
        "androidx.navigation:navigation-compose:${Versions.navigationComposeVersion}"

    const val hilt = "com.google.dagger:hilt-android:${Versions.daggerVersion}"
    const val workManager = "androidx.hilt:hilt-work:${Versions.composeHilt}"
    const val compiler = "com.google.dagger:hilt-compiler:${Versions.daggerVersion}"
    const val composeCompiler = "androidx.hilt:hilt-compiler:${Versions.composeHilt}"
    const val hiltNavigationCompose =
        "androidx.hilt:hilt-navigation-compose:${Versions.composeHilt}"
}