package com.example.covid.ui.navigation.graphs

import android.content.Context
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.example.core_navigation.composable
import com.example.core_navigation.routes.graphs.FoodEnterDestination
import com.example.core_navigation.routes.screens.food.FoodDetailDestination
import com.example.core_navigation.routes.screens.food.FoodListDestination
import com.example.core_ui.composables.top_bar.states.AppBarState
import com.example.feature_food.detail.FoodDetailScreen
import com.example.feature_food.list.FoodListScreen
import com.example.feature_food.list.FoodListViewModel

fun NavGraphBuilder.foodGraph(
    context: Context,
    navController: NavController,
    onAppBarState: (AppBarState) -> Unit,
) {
    navigation(FoodListDestination.route(), FoodEnterDestination.route()) {

        composable(
            showBottomMenu = true,
            destination = FoodListDestination
        ) {
            FoodListScreen(navController, onAppBarState)
        }

        composable(
            showBottomMenu = false,
            destination = FoodDetailDestination
        ) {
            FoodDetailScreen(navController, onAppBarState)
        }
    }

}