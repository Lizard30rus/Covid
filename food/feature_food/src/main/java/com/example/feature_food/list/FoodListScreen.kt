package com.example.feature_food.list

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.core_ui.composables.top_bar.TopAppBar
import com.example.core_ui.composables.top_bar.states.AppBarState
import com.example.feature_food.R

@Composable
fun FoodListScreen(navController: NavController, onAppBarState: (AppBarState) -> Unit) {
    onAppBarState(AppBarState.ShowTopAppBar {
        TopAppBar.Main(
            title = stringResource(R.string.food_list_title)
        )
    }
    )
    FoodListScreen()
}

@Composable
private fun FoodListScreen() {
    Text(text = "FoodListScreen")
}

@Preview(
    showBackground = true,
    locale = "ru"
)
@Composable
private fun FoodListScreenPreview() {
    FoodListScreen()
}