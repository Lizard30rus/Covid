package com.example.core_navigation.states

/** Стэйт отображения нижнего меню */
sealed class BottomBarState {

    /** Нижнее меню скрыто */
    object Gone : BottomBarState()

    /** Нижнее меню отображается */
    object Visible : BottomBarState()
}
