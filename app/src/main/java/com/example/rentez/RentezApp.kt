package com.example.rentez

import android.app.Application
import com.example.rentez.di.dataModule
import com.example.rentez.di.viewModelModule
import org.koin.core.context.startKoin

class RentezApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(dataModule, viewModelModule)
        }
    }
}