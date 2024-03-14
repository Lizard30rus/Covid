package com.example.covid.app

import android.app.Application
import com.example.covid.di.AppComponent
import com.example.covid.di.DaggerAppComponent
import com.example.covid.di.modules.MainModule

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .mainModule(MainModule(this))
            .build()
    }

}