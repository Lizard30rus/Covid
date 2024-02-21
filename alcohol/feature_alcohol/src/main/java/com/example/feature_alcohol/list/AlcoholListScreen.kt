package com.example.feature_alcohol.list

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.core_ui.composables.top_bar.TopAppBar
import com.example.core_ui.composables.top_bar.states.AppBarState
import com.example.feature_alcohol.R

@Composable
fun AlcoholListScreen(navController: NavController, onAppBarState: (AppBarState) -> Unit) {
    onAppBarState(AppBarState.ShowTopAppBar {
        TopAppBar.Main(
            title = stringResource(R.string.alcohol_list_title)
        )
    }
    )
    AlcoholListScreen()
}

@Composable
private fun AlcoholListScreen() {
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