package com.example.covid.di

import com.example.core_common.scope.AppScope
import com.example.core_data.di.RepoModule
import com.example.core_database.di.DbModule
import com.example.covid.app.App
import com.example.covid.di.modules.MainModule
import com.example.feature_alcohol.di.AlcoholComponent
import com.example.feature_food.di.FoodComponent
import dagger.Component

@Component(
    modules = [
        MainModule::class,
        DbModule::class,
        RepoModule::class
    ]
)
@AppScope
interface AppComponent {

    fun inject(app : App)

    fun getAlcoholComponent() : AlcoholComponent

    fun getFoodComponent() : FoodComponent

}