package com.example.rentez.data.repositories

import com.example.rentez.data.api.apis.SportgroundTypeApi
import com.example.rentez.data.mappers.SportgroundTypeMapper
import com.example.rentez.domain.repositories.SportgroundTypeRepository

class SportgroundTypeRepositoryImpl(
    private val sportgroundTypeApi: SportgroundTypeApi,
    private val sportgroundTypeMapper: SportgroundTypeMapper
) : SportgroundTypeRepository {
}