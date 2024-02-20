package com.example.core_navigation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Параметры верхнего меню
 *
 * @param title Название экрана
 * @param showIconBack Флаг показа стрелки "Назад"
 * @param showIconNotification Флаг показа иконки уведомлений
 * @param showIconQuestion Флаг показа иконки вопроса
 */
@Parcelize
data class TopBarParams(
    val title: String,
    val showIconBack: Boolean,
    val showIconNotification: Boolean,
    val showIconQuestion: Boolean
) : Parcelable
