package com.example.covid.ui.navigation.graphs

import android.content.Context
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.example.core_navigation.composable
import com.example.core_navigation.routes.graphs.AlcoholEnterDestination
import com.example.core_navigation.routes.screens.alcohol.AlcoholListDestination
import com.example.core_ui.composables.top_bar.states.AppBarState
import com.example.feature_alcohol.list.AlcoholListScreen

fun NavGraphBuilder.alcoholGraph(
    context: Context,
    navController: NavController,
    onAppBarState : (AppBarState) -> Unit
) {
    navigation(AlcoholListDestination.route(), AlcoholEnterDestination.route()) {

        composable(
            showBottomMenu = true,
            destination = AlcoholListDestination
        ) {
            AlcoholListScreen(navController, onAppBarState)
        }
    }

}