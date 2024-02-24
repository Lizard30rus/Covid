package com.example.covid.di

import com.example.core_database.di.DbModule
import com.example.covid.di.modules.CommonModule
import dagger.Component

@Component(modules = [CommonModule::class, DbModule::class])
interface AppComponent {
}