package com.example.feature_alcohol.detail

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.core_alcohol_api.enums.AlcoholType
import com.example.core_alcohol_api.models.AlcoholDomainModel
import com.example.core_common.utils.createUuid
import com.example.core_ui.composables.CustomCard
import com.example.core_ui.composables.top_bar.TopAppBar
import com.example.core_ui.composables.top_bar.states.AppBarState
import com.example.core_ui.dimens.Dimens
import com.example.feature_alcohol.list.AlcoholListViewModel
import java.util.Date

@Composable
fun AlcoholDetailScreen(
    navController: NavController,
    viewModel: AlcoholDetailViewModel,
    onAppBarState: (AppBarState) -> Unit) {
    val alcohol = remember {
        AlcoholDomainModel(
            id = createUuid(),
            name = "Напиток днтали",
            description = "описание",
            type =AlcoholType.BEER,
            createdAt = Date()
        )
    }
    onAppBarState(
        AppBarState.ShowTopAppBar {
            TopAppBar.Main(
                title = alcohol.name,
                onBack = { navController.navigateUp() })
        }
    )
    AlcoholDetailScreen(alcohol)
}

@Composable
private fun AlcoholDetailScreen(
    alcohol: AlcoholDomainModel
) {
    Surface(modifier = Modifier.padding(PaddingValues(all = Dimens.medium_padding))) {
    }
    CustomCard() {

    }

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