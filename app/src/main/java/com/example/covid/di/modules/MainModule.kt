package com.example.covid.di.modules

import android.content.Context
import androidx.lifecycle.SavedStateHandle
import com.example.core_common.scope.AppScope
import dagger.Module
import dagger.Provides

@Module
class MainModule(private val context: Context) {

    @Provides
    @AppScope
    fun provideContext() = context

    @Provides
    @AppScope
    fun provideStateHandle() = SavedStateHandle()
}