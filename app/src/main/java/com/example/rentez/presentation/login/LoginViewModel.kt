package com.example.rentez.presentation.login

import androidx.lifecycle.ViewModel
import com.example.rentez.domain.repositories.SharedPrefsRepository
import com.example.rentez.domain.repositories.UserRepository

class LoginViewModel(
    private val sharedPrefsRepository: SharedPrefsRepository,
    private val userRepository: UserRepository
) : ViewModel() {
}