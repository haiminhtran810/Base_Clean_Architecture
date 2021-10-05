package com.htm.data.local.pref

interface PrefHelper {
    fun isFirstRun(): Boolean

    fun setFirstRun(boolean: Boolean)
}