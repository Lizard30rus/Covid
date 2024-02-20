package com.example.covid.ui.navigation.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.core_navigation.routes.graphs.AlcoholEnterDestination
import com.example.core_navigation.routes.graphs.FavoritesEnterDestination
import com.example.core_navigation.routes.graphs.FoodEnterDestination
import com.example.covid.R

/** Элементы навигации нижнего меню приложения */
sealed class NavigationItem(
    val route: String,
    @DrawableRes val icon: Int,
    @StringRes val label: Int
) {

    /** Экран заданий */
    object Food : NavigationItem(
        FoodEnterDestination.route(),
        R.drawable.food,
        R.string.food
    )

    /** Экран дефектов */
    object Favorites : NavigationItem(
        FavoritesEnterDestination.route(),
        R.drawable.favorites,
        R.string.favorites
    )

    /** Экран тестирования */
    object Alcohol : NavigationItem(
        AlcoholEnterDestination.route(),
        R.drawable.alcohol,
        R.string.alcohol
    )

}
