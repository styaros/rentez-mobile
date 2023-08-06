package com.example.rentez.presentation.userprofile

import androidx.lifecycle.ViewModel
import com.example.rentez.domain.repositories.ReservationRepository
import com.example.rentez.domain.repositories.UserRepository

class UserProfileViewModel(
    private val userRepository: UserRepository,
    private val reservationRepository: ReservationRepository
) : ViewModel() {
}