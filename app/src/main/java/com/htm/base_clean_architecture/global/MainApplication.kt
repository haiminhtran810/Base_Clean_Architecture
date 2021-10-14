package com.htm.base_clean_architecture.global

import android.app.Application
import com.htm.base_clean_architecture.BuildConfig
import com.htm.base_clean_architecture.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        startKoin {
            androidContext(this@MainApplication)
            modules(appModules)
        }
    }
}