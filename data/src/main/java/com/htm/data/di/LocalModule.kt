package com.htm.data.di

import android.content.Context
import android.content.SharedPreferences
import com.htm.data.local.pref.AppPrefs
import com.htm.data.local.pref.PrefHelper
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val localModule = module {

    single<PrefHelper> {
        return@single AppPrefs(sharedPreferences = get())
    }

    single<SharedPreferences> {
        val context: Context = androidContext()
        return@single context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)
    }
}