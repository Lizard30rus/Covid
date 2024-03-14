package com.example.feature_alcohol.di

import androidx.lifecycle.SavedStateHandle
import com.example.core_alcohol_api.repository.AlcoholRepository
import com.example.core_common.scope.AlcoholScope
import com.example.feature_alcohol.detail.AlcoholDetailViewModel
import com.example.feature_alcohol.list.AlcoholListViewModel
import dagger.Module
import dagger.Provides

@Module
object AlcoholModule {

    @AlcoholScope
    @Provides
    fun provideListViewModel(
        repository: AlcoholRepository
    ): AlcoholListViewModel = AlcoholListViewModel(repository)

    @AlcoholScope
    @Provides
    fun provideDetailViewModel(
        repository: AlcoholRepository,
        savedStateHandle: SavedStateHandle
    ): AlcoholDetailViewModel = AlcoholDetailViewModel(repository, savedStateHandle)
}