package com.example.core_navigation.routes.graphs

import com.example.core_navigation.NavigationDestination

object AlcoholEnterDestination : NavigationDestination {

    override fun route(): String = ALCOHOL_ENTER_GRAPH

    private const val ALCOHOL_ENTER_GRAPH = "ALCOHOL_ENTER_GRAPH"
}