package com.example.core_database.di

import android.app.Application
import androidx.room.Room
import com.example.core_database.database.AppDatabase
import dagger.Module
import dagger.Provides

@Module
class DbModule {

    companion object {
        private const val APP_DATABASE = "my_database.db"
    }

    @Provides
    fun provideDb(
        application: Application
    ) : AppDatabase =
        Room.databaseBuilder(
            application,
            AppDatabase::class.java,
            APP_DATABASE
        )
            .build()

    @Provides
    fun provideFoodDao(database: AppDatabase) =
        database.foodDao()

    @Provides
    fun provideAlcoholDao(database: AppDatabase) =
        database.alcoholDao()
}