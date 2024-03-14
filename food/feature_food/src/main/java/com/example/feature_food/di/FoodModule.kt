package com.example.feature_food.di

import androidx.lifecycle.SavedStateHandle
import com.example.core_common.scope.FoodScope
import com.example.core_food_api.repositories.FoodRepository
import com.example.feature_food.detail.FoodDetailViewModel
import com.example.feature_food.list.FoodListViewModel
import dagger.Module
import dagger.Provides

@Module
object FoodModule {

    @FoodScope
    @Provides
    fun provideListViewModel(
        repository: FoodRepository
    ): FoodListViewModel = FoodListViewModel(repository)

    @FoodScope
    @Provides
    fun provideDetailViewModel(
        repository: FoodRepository,
        savedStateHandle: SavedStateHandle
    ): FoodDetailViewModel = FoodDetailViewModel(repository, savedStateHandle)
}