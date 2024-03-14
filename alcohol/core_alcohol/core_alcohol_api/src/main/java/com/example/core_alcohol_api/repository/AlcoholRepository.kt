package com.example.core_alcohol_api.repository

import com.example.core_alcohol_api.models.AlcoholDomainModel
import kotlinx.coroutines.flow.Flow

interface AlcoholRepository {

    suspend fun getListFlow() : Flow<List<AlcoholDomainModel>>

    suspend fun getAlcoholFlow(id : String) : Flow<AlcoholDomainModel?>

    suspend fun createAlcohol(model: AlcoholDomainModel)

    suspend fun remove(id : String)
}