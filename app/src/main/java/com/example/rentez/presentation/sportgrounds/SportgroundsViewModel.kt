package com.example.rentez.presentation.sportgrounds

import androidx.lifecycle.ViewModel
import com.example.rentez.domain.repositories.SportgroundRepository
import com.example.rentez.domain.repositories.SportgroundTypeRepository

class SportgroundsViewModel(
    private val sportgroundRepository: SportgroundRepository,
    private val sportgroundTypeRepository: SportgroundTypeRepository
) : ViewModel() {
}