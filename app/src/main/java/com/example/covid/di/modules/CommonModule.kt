package com.example.covid.di.modules

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
object CommonModule {

    @Provides
    fun provideContext(
        application: Application
    ) = application.baseContext
}