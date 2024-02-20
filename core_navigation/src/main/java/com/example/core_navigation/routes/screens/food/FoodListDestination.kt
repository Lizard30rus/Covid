package com.example.core_navigation.routes.screens.food

import com.example.core_navigation.NavigationDestination

object FoodListDestination : NavigationDestination {

    override fun route(): String = FOOD_LIST_SCREEN

    private const val FOOD_LIST_SCREEN = "FOOD_LIST_SCREEN"
}