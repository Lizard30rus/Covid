package com.example.core_navigation.routes.screens.alcohol

import com.example.core_navigation.NavigationDestination

object AlcoholListDestination : NavigationDestination {

    override fun route(): String = ALCOHOL_LIST_SCREEN

    private const val ALCOHOL_LIST_SCREEN = "ALCOHOL_LIST_SCREEN"
}