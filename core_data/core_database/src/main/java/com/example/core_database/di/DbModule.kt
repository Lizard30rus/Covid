package com.example.core_database.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.example.core_common.scope.AppScope
import com.example.core_database.database.AppDatabase
import dagger.Module
import dagger.Provides

@Module
class DbModule() {

    companion object {
        private const val APP_DATABASE = "my_database.db"
    }

    @Provides
    @AppScope
    fun provideDb(
        context: Context
    ) : AppDatabase =
        Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            APP_DATABASE
        )
            .build()

    @Provides
    @AppScope
    fun provideFoodDao(database: AppDatabase) =
        database.foodDao()

    @Provides
    @AppScope
    fun provideAlcoholDao(database: AppDatabase) =
        database.alcoholDao()
}