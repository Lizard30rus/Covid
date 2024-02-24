package com.example.core_navigation.routes.screens.alcohol

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.core_navigation.NavigationDestination

object AlcoholDetailDestination : NavigationDestination {

    override fun route(): String = "$ALCOHOL_DETAIL_SCREEN/{$ALCOHOL_ID}"

    override val arguments: List<NamedNavArgument>
        get() = listOf(navArgument(ALCOHOL_ID) {
            type = NavType.StringType
        })


    const val ALCOHOL_ID = "ALCOHOL_ID"
    private const val ALCOHOL_DETAIL_SCREEN = "ALCOHOL_DETAIL_SCREEN"

    fun createRoute(id: String) = "$ALCOHOL_DETAIL_SCREEN/$id"
}