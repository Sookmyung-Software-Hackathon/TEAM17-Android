package com.example.team17.data.sharedpref

import android.content.Context
import android.content.SharedPreferences

object BoggleSharedPreference {
    private const val ACCESS_TOKEN = "ACCESS_TOKEN"
    private const val USER_NAME = "USER_NAME"
    lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)
    }

    fun getAccessToken(): String {
        return preferences.getString(ACCESS_TOKEN, "") ?: ""
    }

    fun setAccessToken(value: String) {
        preferences.edit().putString(ACCESS_TOKEN, value).apply()
    }

    fun getUserName(): String {
        return preferences.getString(USER_NAME, "") ?: ""
    }

    fun setUserName(value: String) {
        preferences.edit().putString(USER_NAME, value).apply()
    }
}