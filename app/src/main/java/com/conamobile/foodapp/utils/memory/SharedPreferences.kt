package com.conamobile.foodapp.utils.memory

import android.content.Context

class SharedPreferences(context: Context) {
    private val pref = context.getSharedPreferences("shared", Context.MODE_PRIVATE)

    fun isLoginPageBoolean(isLoginPageBoolean: Boolean) {
        val editor = pref.edit()
        editor.putBoolean("isLoginPageBoolean", isLoginPageBoolean)
        editor.apply()
    }

    fun getLoginPageBoolean(): Boolean {
        return pref.getBoolean("isLoginPageBoolean", false)
    }

    fun isSaveEmail(isSaveEmail: String) {
        val editor = pref.edit()
        editor.putString("isSaveEmail", isSaveEmail)
        editor.apply()
    }

    fun getSaveEmail(): String {
        return pref.getString("isSaveEmail", "")!!
    }
}