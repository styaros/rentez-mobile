package com.example.rentez.data.repositories

import com.example.rentez.data.api.apis.ReservationApi
import com.example.rentez.data.mappers.ReservationMapper
import com.example.rentez.domain.repositories.ReservationRepository

class ReservationRepositoryImpl(
    private val reservationApi: ReservationApi,
    private val reservationMapper: ReservationMapper
) : ReservationRepository {
}