package com.htm.base_clean_architecture.di

import com.htm.base_clean_architecture.ui.home.HomeViewModel
import com.htm.base_clean_architecture.ui.main.MainViewModel
import com.htm.base_clean_architecture.ui.splash.SplashViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { SplashViewModel(moviesUseCase = get(), movieItemMapper = get()) }
    viewModel { MainViewModel() }
    viewModel { HomeViewModel() }
}