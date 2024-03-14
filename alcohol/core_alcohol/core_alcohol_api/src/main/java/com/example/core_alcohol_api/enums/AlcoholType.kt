package com.example.core_alcohol_api.enums

enum class AlcoholType(val index : Int) {

    SHOT(1),

    COCKTAIL(2),

    BEER(3);

    companion object {
        fun getByIndex(index: Int) = values().find { it.index == index }
            ?: throw NoSuchElementException()
    }
}