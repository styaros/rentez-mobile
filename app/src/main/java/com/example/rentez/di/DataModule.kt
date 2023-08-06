package com.example.rentez.di

import com.example.rentez.data.repositories.BoxRepositoryImpl
import com.example.rentez.data.repositories.CompanyRepositoryImpl
import com.example.rentez.data.repositories.ReservationRepositoryImpl
import com.example.rentez.data.repositories.SharedPrefsRepositoryImpl
import com.example.rentez.data.repositories.SportgroundRepositoryImpl
import com.example.rentez.data.repositories.SportgroundTypeRepositoryImpl
import com.example.rentez.data.repositories.UserRepositoryImpl
import com.example.rentez.domain.repositories.BoxRepository
import com.example.rentez.domain.repositories.CompanyRepository
import com.example.rentez.domain.repositories.ReservationRepository
import com.example.rentez.domain.repositories.SharedPrefsRepository
import com.example.rentez.domain.repositories.SportgroundRepository
import com.example.rentez.domain.repositories.SportgroundTypeRepository
import com.example.rentez.domain.repositories.UserRepository
import org.koin.dsl.module

val dataModule = module {

    single<UserRepository> {
        UserRepositoryImpl(get(), get())
    }

    single<CompanyRepository> {
        CompanyRepositoryImpl(get(), get())
    }

    single<SportgroundTypeRepository> {
        SportgroundTypeRepositoryImpl(get(), get())
    }

    single<SportgroundRepository> {
        SportgroundRepositoryImpl(get(), get())
    }

    single<BoxRepository> {
        BoxRepositoryImpl(get(), get())
    }

    single<SportgroundRepository> {
        SportgroundRepositoryImpl(get(), get())
    }

    single<ReservationRepository> {
        ReservationRepositoryImpl(get(), get())
    }

    single<SharedPrefsRepository> {
        SharedPrefsRepositoryImpl(get())
    }
}