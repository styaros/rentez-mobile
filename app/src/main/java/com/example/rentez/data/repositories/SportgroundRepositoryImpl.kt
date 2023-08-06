package com.example.rentez.data.repositories

import com.example.rentez.data.api.apis.SportgroundApi
import com.example.rentez.data.mappers.SportgroundMapper
import com.example.rentez.domain.repositories.SportgroundRepository

class SportgroundRepositoryImpl(
    private val sportgroundApi: SportgroundApi,
    private val sportgroundMapper: SportgroundMapper
) : SportgroundRepository {
}