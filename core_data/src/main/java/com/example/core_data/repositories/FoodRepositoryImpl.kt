package com.example.core_data.repositories

import com.example.core_database.dao.FoodDao
import com.example.core_food_api.models.FoodDomainModel
import com.example.core_food_api.repositories.FoodRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FoodRepositoryImpl @Inject constructor(
    private val foodDao: FoodDao
) : FoodRepository {

    override suspend fun getListFlow(): Flow<List<FoodDomainModel>> {
        TODO("Not yet implemented")
    }

    override suspend fun getFoodFlow(id: String): Flow<FoodDomainModel?> {
        TODO("Not yet implemented")
    }

    override suspend fun createFood(model: FoodDomainModel) {
        TODO("Not yet implemented")
    }

    override suspend fun remove(id: String) {
        TODO("Not yet implemented")
    }
}