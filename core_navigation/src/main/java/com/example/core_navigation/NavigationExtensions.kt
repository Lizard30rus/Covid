package com.example.core_navigation

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.core_navigation.states.BottomBarState
import com.example.core_navigation.states.TopBarState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/**
 * Добавляет [Composable] в [NavGraphBuilder] с параметрами по умолчанию
 *
 * @param topAppBar Параметры отображения верхнего меню или null, если не нужно
 * отображать
 * @param showBottomMenu Флаг показа нижнего меню
 * @param destination Параметры точки назначения при навигации
 * @param content Compose функция для пункта назначения
 */
fun NavGraphBuilder.composable(
    showBottomMenu: Boolean,
    destination: NavigationDestination,
    content: @Composable AnimatedContentScope.(NavBackStackEntry) -> Unit
) {
    val args = mutableListOf<NamedNavArgument>()
    args += destination.arguments
    args += navArgument(Constants.SHOW_BOTTOM_MENU) {
        type = NavType.BoolType
        defaultValue = showBottomMenu
    }
    composable(
        route = destination.route(),
        arguments = args,
        deepLinks = destination.deepLinks,
        content = content
    )
}

/** Навигация к экрану заглушке в случае ошибки навигации по переданному роуту */
fun NavController.safeNavigate(
    route: String,
    sideEffect: (Throwable) -> Unit = { }
) {
    runCatching { navigate(route) }.onFailure {
        sideEffect(it)
    }
}

/** Параметры верхнего меню */
val NavDestination.topBarParams: TopBarParams?
    get() = arguments[Constants.TOP_APP_BAR]?.defaultValue as TopBarParams?

/** Флаг показа нижнего меню */
val NavDestination.showBottomMenu: Boolean
    get() = arguments.getValue(Constants.SHOW_BOTTOM_MENU).defaultValue as Boolean

/** Навигация с очисткой бэкстека */
fun NavController.navigateAndClear(route: String) {
    navigate(route) { popUpTo(0) }
}

/** Навигация с очисткой текущего экрана из стека */
fun NavController.navigateAndRemove(route: String) {
    navigate(route) { popBackStack() }
}

fun NavController.navigateInGraph(route: String) {
    navigate(route) {
        popUpTo(0)
        launchSingleTop = true
    }
}

/** Подписка на стэйт отображения нижнего меню */
fun NavController.topBarStateFlow(): Flow<TopBarState> =
    currentBackStackEntryFlow
        .map { it.destination.topBarParams }
        .map { topAppBar ->
            if (topAppBar != null) {
                TopBarState.Visible(
                    title = topAppBar.title,
                    showIconBack = topAppBar.showIconBack,
                    showIconNotification = topAppBar.showIconNotification,
                    showIconQuestion = topAppBar.showIconQuestion
                )
            } else {
                TopBarState.Gone
            }
        }

/** Подписка на стэйт отображения верхнего меню */
fun NavController.bottomBarStateFlow(): Flow<BottomBarState> =
    currentBackStackEntryFlow
        .map { it.destination.showBottomMenu }
        .map { showBottomBar ->
            if (showBottomBar) {
                BottomBarState.Visible
            } else {
                BottomBarState.Gone
            }
        }

private object Constants {

    /** Ключ для получения параметров отображения верхнего меню */
    const val TOP_APP_BAR = "topAppBar"

    /** Ключ для получения флага отображения нижнего меню */
    const val SHOW_BOTTOM_MENU = "showBottomMenu"

}