package com.example.rentez.presentation.appointment

import androidx.lifecycle.ViewModel
import com.example.rentez.domain.repositories.ReservationRepository
import com.example.rentez.domain.repositories.SportgroundRepository

class AppointmentViewModel(
    private val sportgroundRepository: SportgroundRepository,
    private val reservationRepository: ReservationRepository
) : ViewModel() {
}