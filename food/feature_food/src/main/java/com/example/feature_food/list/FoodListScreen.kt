package com.example.feature_food.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.core_common.utils.createUuid
import com.example.core_food_api.enums.FoodType
import com.example.core_food_api.models.FoodDomainModel
import com.example.core_ui.composables.top_bar.TopAppBar
import com.example.core_ui.composables.top_bar.states.AppBarState
import com.example.core_ui.dimens.Dimens
import com.example.feature_food.R
import com.example.feature_food.list.views.FoodItem
import java.util.Date

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
    val list = remember {
        List(size = 20) {
            FoodDomainModel(
                id = createUuid(),
                name = "Еда $it",
                description = "описание",
                type = FoodType.MEAT,
                createdAt = Date()
            )
        }
    }
   LazyColumn(
       contentPadding = PaddingValues(
           horizontal = Dimens.medium_padding,
           vertical = Dimens.medium_padding
       ),
       verticalArrangement = Arrangement.spacedBy(Dimens.small_padding)
   ) {
       items(list) {
           FoodItem(item = it)
       }
   }
}

@Preview(
    showBackground = true,
    locale = "ru"
)
@Composable
private fun FoodListScreenPreview() {
    FoodListScreen()
}