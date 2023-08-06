package com.example.rentez.di

import com.example.rentez.presentation.appointment.AppointmentViewModel
import com.example.rentez.presentation.login.LoginViewModel
import com.example.rentez.presentation.pickbox.PickBoxViewModel
import com.example.rentez.presentation.splash.SplashViewModel
import com.example.rentez.presentation.sportgrounds.SportgroundsViewModel
import com.example.rentez.presentation.userprofile.UserProfileViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel {
        SplashViewModel(get(), get())
    }

    viewModel {
        LoginViewModel(get(), get())
    }

    viewModel {
        UserProfileViewModel(get(), get())
    }

    viewModel {
        SportgroundsViewModel(get(), get())
    }

    viewModel {
        AppointmentViewModel(get(), get())
    }

    viewModel {
        PickBoxViewModel(get(), get())
    }
}