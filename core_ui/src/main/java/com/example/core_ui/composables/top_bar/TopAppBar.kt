package com.example.core_ui.composables.top_bar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.core_ui.R
import com.example.core_ui.composables.top_bar.states.FilterIconState
import com.example.core_ui.values.color.Palette

object TopAppBar {

    /**
     * Основная панель приложения.
     * Поддерживает кнопку "назад"
     *
     * @param title название экрана
     * @param onBack необязательное действие на кнопку "назад" (если null - будет скрыта)
     */
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Main(
        title: String,
        onBack: (() -> Unit)? = null,
        onClickFilter: (() -> Unit)? = null,
        filterIconState: FilterIconState = FilterIconState.FILTER_NOT_NEED
    ) {
        TopAppBar(
            title = {
                Text(
                    text = title,
                    color = Palette.White
                )
            },
            navigationIcon = {
                if (onBack != null) {
                        IconButton(onClick = onBack) {
                            Icon(
                                painter = painterResource(R.drawable.ic_arrow_back),
                                contentDescription = "arrow_back",
                                tint = Palette.White
                            )
                        }
                }
            },
            actions = {
                if (filterIconState != FilterIconState.FILTER_NOT_NEED && onClickFilter != null) {
                    IconButton(onClick = {
                        onClickFilter()
                    }) {
                        Icon(
                            painter = if (filterIconState == FilterIconState.FILTER_CHANGED)
                                painterResource(R.drawable.ic_filter_filled)
                            else painterResource(R.drawable.ic_filter),
                            contentDescription = null,
                            tint = Palette.White
                        )
                    }
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Palette.Purple80,
                navigationIconContentColor = Palette.White,
                titleContentColor = Palette.Black
            )
        )
    }
}