package com.example.block_2

import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { PlatformRepository() }
    viewModel { AboutViewModel(get()) }
}
