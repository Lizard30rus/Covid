package com.example.core_ui.composables.top_bar.states

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.core_ui.values.color.Palette

/** Состояние панели приложения [appBar] и цвет статус бара [statusBarColor] */
sealed class AppBarState(
    open val statusBarColor: Color,
    open val appBar: @Composable ColumnScope.() -> Unit
) {

    /** Панель приложения скрыта, отображается статус бар заданный цветом [statusBarColor] */
    data class WithoutAppBar(
        override val statusBarColor: Color = Palette.White
    ) : AppBarState(statusBarColor, { })

    /** Отображение панели приложения [appBar] и статус бара заданного цветом [statusBarColor] */
    data class ShowTopAppBar(
        override val statusBarColor: Color = Palette.Purple80,
        override val appBar: @Composable ColumnScope.() -> Unit
    ) : AppBarState(statusBarColor, appBar)
}
