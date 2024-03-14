package com.example.core_data.di

import com.example.core_alcohol_api.repository.AlcoholRepository
import com.example.core_common.scope.AppScope
import com.example.core_data.repositories.AlcoholRepositoryImpl
import com.example.core_data.repositories.FoodRepositoryImpl
import com.example.core_food_api.repositories.FoodRepository
import dagger.Binds
import dagger.Module

@Module
interface RepoModule {

    @Binds
    @AppScope
    fun bindAlcoholRepository(impl: AlcoholRepositoryImpl) : AlcoholRepository

    @Binds
    @AppScope
    fun bindFoodRepository(impl : FoodRepositoryImpl) : FoodRepository
}