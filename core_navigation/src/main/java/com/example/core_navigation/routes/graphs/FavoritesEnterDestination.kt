package com.example.core_navigation.routes.graphs

import com.example.core_navigation.NavigationDestination

object FavoritesEnterDestination : NavigationDestination {

    override fun route(): String = FAVORITES_ENTER_GRAPH

    private const val FAVORITES_ENTER_GRAPH = "FAVORITES_ENTER_GRAPH"
}