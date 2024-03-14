package com.example.core_food_api.repositories

import com.example.core_food_api.models.FoodDomainModel
import kotlinx.coroutines.flow.Flow

interface FoodRepository {

    suspend fun getListFlow(): Flow<List<FoodDomainModel>>

    suspend fun getFoodFlow(id: String): Flow<FoodDomainModel?>

    suspend fun createFood(model: FoodDomainModel)

    suspend fun remove(id: String)
}