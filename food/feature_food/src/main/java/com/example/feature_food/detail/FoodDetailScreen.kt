package com.example.feature_food.detail

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.core_common.utils.createUuid
import com.example.core_food_api.enums.FoodType
import com.example.core_food_api.models.FoodDomainModel
import com.example.core_navigation.routes.screens.food.FoodDetailDestination
import com.example.core_ui.composables.top_bar.TopAppBar
import com.example.core_ui.composables.top_bar.states.AppBarState
import java.util.Date

@Composable
fun FoodDetailScreen(navController: NavController, onAppBarState: (AppBarState) -> Unit) {
    val food = remember {
        FoodDomainModel(
            id = createUuid(),
            name = "Имя еды",
            description = "Описание",
            type = FoodType.MEAT,
            createdAt = Date()
        )
    }
    onAppBarState(
        AppBarState.ShowTopAppBar {
            TopAppBar.Main(
                title = food.name,
                onBack = { navController.navigateUp() })
        }
    )
}

@Composable
private fun FoodDetailScreen(
    food : FoodDomainModel
) {

}

@Preview(
    showBackground = true,
    locale = "ru"
)
@Composable
private fun FoodDetailScreenPreview() {
   FoodDetailScreen(
       FoodDomainModel(
       id = createUuid(),
           name = "fddfd",
           description = "vfxvdcvxcvx",
           type = FoodType.MEAT,
           createdAt = Date()
   ))
}