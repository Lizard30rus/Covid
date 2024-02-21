package com.example.covid.ui.navigation.graphs

import android.content.Context
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.example.core_navigation.composable
import com.example.core_navigation.routes.graphs.FavoritesEnterDestination
import com.example.core_navigation.routes.screens.favorites.FavoritesListDestination
import com.example.core_ui.composables.top_bar.states.AppBarState
import com.example.feature_favorites.list.FavoritesListScreen

fun NavGraphBuilder.favoritesGraph(
    context: Context,
    navController: NavController,
    onAppBarState : (AppBarState) -> Unit
) {
    navigation(FavoritesListDestination.route(), FavoritesEnterDestination.route()) {

        composable(
            showBottomMenu = true,
            destination = FavoritesListDestination
        ) {
            FavoritesListScreen(navController, onAppBarState)
        }
    }

}