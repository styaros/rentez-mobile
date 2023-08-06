package com.example.rentez.data.repositories

import com.example.rentez.data.api.apis.UserApi
import com.example.rentez.data.mappers.UserMapper
import com.example.rentez.domain.repositories.UserRepository

class UserRepositoryImpl(
    private val userApi: UserApi,
    private val userMapper: UserMapper
) : UserRepository {
}