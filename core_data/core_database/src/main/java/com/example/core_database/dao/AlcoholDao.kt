package com.example.core_database.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.core_database.entity.AlcoholEntity
import com.example.core_database.entity.FoodEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface AlcoholDao : BaseDao<FoodEntity> {

    @Query("SELECT * FROM AlcoholTable")
    fun getAlcoholListFlow(): Flow<List<AlcoholEntity>>
}