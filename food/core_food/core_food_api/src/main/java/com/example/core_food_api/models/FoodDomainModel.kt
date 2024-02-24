package com.example.core_food_api.models

import com.example.core_food_api.enums.FoodType
import java.util.Date

data class FoodDomainModel(
    val id : String,
    val name : String,
    val description : String,
    val type : FoodType,
    val createdAt : Date,
    val inFavorites : Boolean = false,
    val addedToFavorite : Date? = null
)
