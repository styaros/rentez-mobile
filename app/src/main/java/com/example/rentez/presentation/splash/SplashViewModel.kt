package com.example.rentez.presentation.splash

import androidx.lifecycle.ViewModel
import com.example.rentez.domain.repositories.SharedPrefsRepository
import com.example.rentez.domain.repositories.UserRepository

class SplashViewModel(
    private val sharedPrefsRepository: SharedPrefsRepository,
    private val userRepository: UserRepository
) : ViewModel() {
}