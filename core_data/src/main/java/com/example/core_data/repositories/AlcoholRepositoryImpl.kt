package com.example.core_data.repositories

import com.example.core_alcohol_api.models.AlcoholDomainModel
import com.example.core_alcohol_api.repository.AlcoholRepository
import com.example.core_common.utils.mapIterable
import com.example.core_data.mapper.AlcoholMapper.mapToDomain
import com.example.core_database.dao.AlcoholDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class AlcoholRepositoryImpl @Inject constructor(
    private val alcoholDao: AlcoholDao
) : AlcoholRepository {

    override suspend fun getListFlow(): Flow<List<AlcoholDomainModel>> =
        alcoholDao.getAlcoholListFlow().mapIterable {
            it.mapToDomain()
        }

    override suspend fun getAlcoholFlow(id: String): Flow<AlcoholDomainModel?> {
        TODO("Not yet implemented")
    }

    override suspend fun createAlcohol(model: AlcoholDomainModel) {
        TODO("Not yet implemented")
    }

    override suspend fun remove(id: String) {
        TODO("Not yet implemented")
    }
}