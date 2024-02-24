package com.example.core_database.dao

import androidx.room.Dao
import com.example.core_database.entity.FoodEntity

@Dao
interface FoodDao : BaseDao<FoodEntity> {
}