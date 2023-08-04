package com.example.rentez.data.api

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance(
    private val tokenInterceptor: TokenInterceptor
) {

    fun getInstance(): Retrofit {
        val loggingInterceptor = HttpLoggingInterceptor().apply {
            setLevel(Level.HEADERS)
            setLevel(Level.BODY)
        }
        val client = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .addInterceptor(tokenInterceptor)
            .build()

        val gson = GsonBuilder()
            .setLenient()
            .create()

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

    companion object {
        private const val BROADCAST_ADDRESS = "10.0.2.2"
        private const val BASE_URL = "http://$BROADCAST_ADDRESS:4000"
    }
}