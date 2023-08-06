package com.example.rentez.di

import com.example.rentez.data.api.RetrofitInstance
import com.example.rentez.data.api.TokenInterceptor
import com.example.rentez.data.api.apis.BoxApi
import com.example.rentez.data.api.apis.CompanyApi
import com.example.rentez.data.api.apis.ReservationApi
import com.example.rentez.data.api.apis.SportgroundApi
import com.example.rentez.data.api.apis.SportgroundTypeApi
import com.example.rentez.data.api.apis.UserApi
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    single {
        (get() as Retrofit).create(UserApi::class.java)
    }

    single {
        (get() as Retrofit).create(CompanyApi::class.java)
    }

    single {
        (get() as Retrofit).create(SportgroundTypeApi::class.java)
    }

    single {
        (get() as Retrofit).create(SportgroundApi::class.java)
    }

    single {
        (get() as Retrofit).create(BoxApi::class.java)
    }

    single {
        (get() as Retrofit).create(ReservationApi::class.java)
    }

    single {
        RetrofitInstance(get()).getInstance()
    }

    single {
        TokenInterceptor()
    }
}