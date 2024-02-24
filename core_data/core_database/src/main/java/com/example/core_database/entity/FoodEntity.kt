package com.example.core_database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FoodEntity(

    @PrimaryKey
    val id: String,

    val description: String
)
