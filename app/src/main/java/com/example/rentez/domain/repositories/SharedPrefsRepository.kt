package com.example.rentez.domain.repositories

interface SharedPrefsRepository {

    suspend fun getUserToken(): String?

    suspend fun putUserToken(token: String?)

    suspend fun getUserId(): Int

    suspend fun putUserId(userId: Int)
}