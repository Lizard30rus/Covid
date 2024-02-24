package com.example.core_navigation.routes.screens.food

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.core_navigation.NavigationDestination

object FoodDetailDestination : NavigationDestination {

    override fun route(): String = "$FOOD_DETAIL_SCREEN/{$FOOD_ID}"

    override val arguments: List<NamedNavArgument>
        get() = listOf(navArgument(FOOD_ID) {
            type = NavType.StringType
        })


    const val FOOD_ID = "FOOD_ID"
    private const val FOOD_DETAIL_SCREEN = "FOOD_DETAIL_SCREEN"

    fun createRoute(id: String) = "$FOOD_DETAIL_SCREEN/$id"
}