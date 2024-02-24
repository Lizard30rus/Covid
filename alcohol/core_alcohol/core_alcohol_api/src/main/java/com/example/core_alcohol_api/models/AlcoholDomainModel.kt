package com.example.core_alcohol_api.models

import com.example.core_alcohol_api.enums.AlcoholType
import java.util.Date

data class AlcoholDomainModel(
    val id : String,
    val name : String,
    val description : String,
    val type : AlcoholType,
    val createdAt : Date,
    val inFavorites : Boolean = false,
    val addedToFavorite : Date? = null
)
