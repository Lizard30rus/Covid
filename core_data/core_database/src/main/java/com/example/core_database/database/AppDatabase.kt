package com.example.core_database.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.core_database.dao.AlcoholDao
import com.example.core_database.dao.FoodDao
import com.example.core_database.entity.AlcoholEntity
import com.example.core_database.entity.FoodEntity

@Database(
    entities = [
        AlcoholEntity::class,
        FoodEntity::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun foodDao() : FoodDao

    abstract fun alcoholDao() : AlcoholDao
}