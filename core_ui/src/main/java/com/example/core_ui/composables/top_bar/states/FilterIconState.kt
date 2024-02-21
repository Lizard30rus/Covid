package com.example.core_ui.composables.top_bar.states

/** Состояния иконки фильтра. */
enum class FilterIconState {

    /** Состояние иконки, когда фильтр не выбран. */
    FILTER_NOT_CHANGED,

    /** Состояние иконки, когда фильтр выбран. */
    FILTER_CHANGED,

    /** Состояние иконки, когда фильтр не требуется. */
    FILTER_NOT_NEED
}
