package com.example.covid.ui.views

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.core_navigation.navigateInGraph
import com.example.core_navigation.states.BottomBarState
import com.example.core_ui.dimens.Dimens
import com.example.core_ui.values.color.Palette
import com.example.covid.ui.navigation.models.NavigationItem

@Composable
internal fun BottomBar(
    navigationItems: List<NavigationItem>,
    navController: NavHostController,
    bottomBarState: State<BottomBarState>
) {
    AnimatedVisibility(visible = bottomBarState.value == BottomBarState.Visible) {
        NavigationBar(
            containerColor = Palette.Purple80
        ) {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination
            navigationItems.forEach { item ->
                NavigationBarItem(
                    selected = currentRoute?.hierarchy?.any { it.route == item.route } == true,
                    onClick = { onClickItem(navController, item, currentRoute?.parent?.route) },
                    icon = {
                        Icon(
                            painter = painterResource(item.icon),
                            contentDescription = stringResource(item.label),
                            modifier = Modifier.size(Dimens.bottom_label)
                        )
                    },
                    label = { Text(text = stringResource(item.label)) },
                    colors = NavigationBarItemDefaults.colors(
                        unselectedIconColor = Palette.Purple40.copy(alpha = 0.6f),
                        unselectedTextColor = Palette.Purple40.copy(alpha = 0.6f),
                        selectedIconColor = Palette.Purple40,
                        selectedTextColor = Palette.Purple40
                    )
                )
            }
        }

    }

}

private fun onClickItem(
    navController: NavHostController,
    item: NavigationItem,
    currentRoute: String?
) {
    if (currentRoute != item.route) {
        navController.navigateInGraph(item.route)
    }
}