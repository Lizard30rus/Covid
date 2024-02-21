package com.example.covid.ui.navigation.graphs

import android.content.Context
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.example.core_navigation.composable
import com.example.core_navigation.routes.screens.SplashScreenDestination
import com.example.core_ui.composables.top_bar.states.AppBarState
import com.example.covid.ui.views.SplashScreen

fun NavGraphBuilder.globalGraph(
    context: Context,
    navController: NavController,
    onAppBarState: (AppBarState) -> Unit
) {
    composable(
        showBottomMenu = false,
        destination = SplashScreenDestination
    ) {
        SplashScreen()
    }

    foodGraph(context, navController, onAppBarState)
    favoritesGraph(context, navController, onAppBarState)
    alcoholGraph(context, navController, onAppBarState)
}