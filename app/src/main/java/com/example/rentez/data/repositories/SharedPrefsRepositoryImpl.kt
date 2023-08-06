package com.example.rentez.data.repositories

import android.content.Context
import com.example.rentez.domain.repositories.SharedPrefsRepository

class SharedPrefsRepositoryImpl(
    context: Context
) : SharedPrefsRepository {

    private val sharedPrefs = context.getSharedPreferences(USER_SHARED_PREFS, Context.MODE_PRIVATE)

    override suspend fun getUserToken(): String? {
        return sharedPrefs.getString(TOKEN, "")
    }

    override suspend fun putUserToken(token: String?) {
        sharedPrefs.edit().putString(TOKEN, token).apply()
    }

    override suspend fun getUserId(): Int {
        return sharedPrefs.getInt(USER_ID, -1)
    }

    override suspend fun putUserId(userId: Int) {
        sharedPrefs.edit().putInt(USER_ID, userId).apply()
    }

    companion object {
        private const val USER_SHARED_PREFS = "user_shared_prefs"
        private const val TOKEN = "token"
        private const val USER_ID = "userID"
    }
}