package com.example.feature_alcohol.detail

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.createSavedStateHandle
import androidx.navigation.NavController
import com.example.core_alcohol_api.enums.AlcoholType
import com.example.core_alcohol_api.models.AlcoholDomainModel
import com.example.core_common.utils.createUuid
import com.example.core_ui.composables.top_bar.TopAppBar
import com.example.core_ui.composables.top_bar.states.AppBarState
import java.util.Date

@Composable
fun AlcoholDetailScreen(navController: NavController, onAppBarState: (AppBarState) -> Unit) {
    onAppBarState(
        AppBarState.ShowTopAppBar {
            TopAppBar.Main(
                title = "s",
            onBack = {navController.navigateUp()})
        }
    )
    val item =
AlcoholDetailScreen()
}

@Composable
private fun AlcoholDetailScreen(
    alcohol : AlcoholDomainModel
) {

}

@Preview(
    showBackground = true,
    locale = "ru"
)
@Composable
private fun AlcoholDetailScreenPreview() {
   AlcoholDetailScreen(
       AlcoholDomainModel(
           id = createUuid(),
           name = "ти",
           description = "",
           type = AlcoholType.BEER,
           createdAt = Date()
       )
   )
}