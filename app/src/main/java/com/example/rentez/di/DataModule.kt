package com.example.rentez.di

import com.example.rentez.data.api.RetrofitInstance
import com.example.rentez.data.api.TokenInterceptor
import org.koin.dsl.module

val dataModule = module {

    single {
        RetrofitInstance(get()).getInstance()
    }

    single {
        TokenInterceptor()
    }
}