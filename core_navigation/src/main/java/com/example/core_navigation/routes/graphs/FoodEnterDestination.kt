package com.example.core_navigation.routes.graphs

import com.example.core_navigation.NavigationDestination

object FoodEnterDestination : NavigationDestination {

    override fun route(): String = FOOD_ENTER_GRAPH

    private const val FOOD_ENTER_GRAPH = "FOOD_ENTER_GRAPH"
}