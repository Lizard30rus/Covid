package com.example.feature_favorites.list

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.core_ui.composables.top_bar.TopAppBar
import com.example.core_ui.composables.top_bar.states.AppBarState
import com.example.feature_favorites.R

@Composable
fun FavoritesListScreen(navController: NavController, onAppBarState: (AppBarState) -> Unit) {
    onAppBarState(AppBarState.ShowTopAppBar {
        TopAppBar.Main(
            title = stringResource(R.string.favorites_list_title)
        )
    }
    )
    FavoritesListListScreen()
}

@Composable
private fun FavoritesListListScreen() {
    Text(text = "FavoritesListListScreen")
}

@Preview(
    showBackground = true,
    locale = "ru"
)
@Composable
private fun FoodListScreenPreview() {
    FavoritesListListScreen()
}