package com.example.feature_food.detail

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.core_ui.composables.top_bar.states.AppBarState

@Composable
fun FoodDetailScreen(navController: NavController, onAppBarState: (AppBarState) -> Unit) {

}

@Preview(
    showBackground = true,
    locale = "ru"
)
@Composable
private fun FoodDetailScreenPreview() {
   FoodDetailScreen(navController, onAppBarState)
}