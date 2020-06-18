package com.example.mysearch.application

import android.app.Application
import com.example.mysearch.di.application
import com.example.mysearch.di.historyScreen
import com.example.mysearch.di.mainScreen
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class TranslatorApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules(listOf(application, mainScreen, historyScreen))
        }
    }
}