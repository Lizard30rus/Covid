package com.example.core_navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavDeepLink

/**
 * Функциональный интерфейс, описывающий общие параметры
 * для пункта назначения
 */
interface NavigationDestination {

    /** Строка, по которой происходит навигация к экрану */
    fun route(): String

    /** Аргументы, которые необходимо передать */
    val arguments: List<NamedNavArgument>
        get() = emptyList()

    /** Deep links для связи с точкой назначения */
    val deepLinks: List<NavDeepLink>
        get() = emptyList()
}
