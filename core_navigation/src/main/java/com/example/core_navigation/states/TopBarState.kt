package com.example.core_navigation.states

/** Стэйт отображения верхнего меню */
sealed class TopBarState {

    /** Верхнее меню скрыто */
    object Gone : TopBarState()

    /**
     * Верхнее меню отображается
     *
     * @param title Название экрана
     * @param showIconBack Флаг показа стрелки "Назад"
     * @param showIconNotification Флаг показа иконки уведомлений
     * @param showIconQuestion Флаг показа иконки вопроса
     */
    data class Visible(
        val title: String,
        val showIconBack: Boolean,
        val showIconNotification: Boolean,
        val showIconQuestion: Boolean
    ) : TopBarState()
}
