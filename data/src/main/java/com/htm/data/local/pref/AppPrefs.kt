package com.htm.data.local.pref

import android.content.SharedPreferences

class AppPrefs(private val sharedPreferences: SharedPreferences) : PrefHelper {

    override fun isFirstRun(): Boolean {
        return sharedPreferences.getBoolean(FIRST_RUN, false)
    }

    override fun setFirstRun(boolean: Boolean) {
        sharedPreferences.edit().apply {
            putBoolean(FIRST_RUN, boolean)
        }.apply()
    }

    companion object {
        private const val FIRST_RUN = "first_run"
    }
}