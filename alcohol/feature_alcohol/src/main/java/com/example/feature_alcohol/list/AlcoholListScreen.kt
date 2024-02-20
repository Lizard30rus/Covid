package com.example.feature_alcohol.list

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AlcoholListScreen() {
    Text(text = "AlcoholListScreen")
}

@Preview(
    showBackground = true,
    locale = "ru"
)
@Composable
private fun AlcoholListScreenPreview() {
    AlcoholListScreen()
}