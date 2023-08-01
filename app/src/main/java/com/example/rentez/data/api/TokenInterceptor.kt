package com.example.rentez.data.api

import okhttp3.Interceptor
import okhttp3.Response

class TokenInterceptor : Interceptor {

    private var token: String = ""

    fun updateToken(newToken: String) {
        token = newToken
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val modifiedRequest = originalRequest.newBuilder()
            .header(AUTHORIZATION_HEADER, "$BEARER $token")
            .build()
        return chain.proceed(modifiedRequest)
    }

    companion object {
        private const val AUTHORIZATION_HEADER = "Authorization"
        private const val BEARER = "Bearer"
    }
}