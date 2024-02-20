package com.example.feature_food.list

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FoodListScreen() {
    Text(text = "FoodScreen")
}

@Preview(
    showBackground = true,
    locale = "ru"
)
@Composable
private fun FoodListScreenPreview() {
    FoodListScreen()
}