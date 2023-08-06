package com.example.rentez.presentation.pickbox

import androidx.lifecycle.ViewModel
import com.example.rentez.domain.repositories.BoxRepository
import com.example.rentez.domain.repositories.ReservationRepository

class PickBoxViewModel(
    private val boxRepository: BoxRepository,
    private val reservationRepository: ReservationRepository
) : ViewModel() {
}