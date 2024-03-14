package com.example.feature_alcohol.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.core_alcohol_api.models.AlcoholDomainModel
import com.example.core_navigation.routes.screens.alcohol.AlcoholDetailDestination
import com.example.core_navigation.safeNavigate
import com.example.core_ui.composables.top_bar.TopAppBar
import com.example.core_ui.composables.top_bar.states.AppBarState
import com.example.core_ui.dimens.Dimens
import com.example.feature_alcohol.R
import com.example.feature_alcohol.Test
import com.example.feature_alcohol.list.views.AlcoholItem

@Composable
fun AlcoholListScreen(
    navController: NavController,
    viewModel: AlcoholListViewModel,
    onAppBarState: (AppBarState) -> Unit
) {
    onAppBarState(AppBarState.ShowTopAppBar {
        TopAppBar.Main(
            title = stringResource(R.string.alcohol_list_title)
        )
    }
    )
    val list = viewModel.alcoholList.collectAsState().value
    AlcoholListScreen(list) {
        navController.safeNavigate(AlcoholDetailDestination.createRoute(it))
    }
}

@Composable
private fun AlcoholListScreen(
    list : List<AlcoholDomainModel>,
    onClickItem: (String) -> Unit
) {
    LazyColumn(
        contentPadding = PaddingValues(
            horizontal = Dimens.medium_padding,
            vertical = Dimens.medium_padding
        ),
        verticalArrangement = Arrangement.spacedBy(Dimens.small_padding)
    ) {
        items(list) {
            AlcoholItem(item = it) { onClickItem(it.id) }
        }
    }
}

@Preview(
    showBackground = true,
    locale = "ru"
)
@Composable
private fun AlcoholListScreenPreview() {
    AlcoholListScreen(emptyList()) {

    }
}