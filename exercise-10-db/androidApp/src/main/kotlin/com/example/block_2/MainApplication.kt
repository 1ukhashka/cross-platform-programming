package com.example.block_2

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(
                appModule,
                module {
                    single { DatabaseDriverFactory(androidContext()) }
                }
            )
        }
    }
}