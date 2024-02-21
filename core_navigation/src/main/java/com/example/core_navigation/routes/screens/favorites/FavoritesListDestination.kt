package com.example.core_navigation.routes.screens.favorites

import com.example.core_navigation.NavigationDestination

object FavoritesListDestination : NavigationDestination {

    override fun route(): String = ALCOHOL_LIST_SCREEN

    private const val ALCOHOL_LIST_SCREEN = "ALCOHOL_LIST_SCREEN"
}