package com.example.core_database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "AlcoholTable"
)
data class AlcoholEntity(

    @PrimaryKey
    val id : String,

    val name : String,

    val description : String,

    val type : Int,

    val createdAt : Long,

    val inFavorites : Boolean,

    val addedToFavorite : Long
)
