package com.example.rentez.data.repositories

import com.example.rentez.data.api.apis.BoxApi
import com.example.rentez.data.mappers.BoxMapper
import com.example.rentez.domain.repositories.BoxRepository

class BoxRepositoryImpl(
    private val boxApi: BoxApi,
    private val boxMapper: BoxMapper
) : BoxRepository {
}