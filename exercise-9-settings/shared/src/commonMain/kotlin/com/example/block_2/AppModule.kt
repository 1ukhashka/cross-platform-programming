package com.example.block_2

import com.russhwolf.settings.Settings
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<Settings> { Settings() }
    single { PlatformRepository(get()) }
    viewModel { AboutViewModel(get()) }
}
