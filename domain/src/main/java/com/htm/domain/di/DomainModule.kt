package com.htm.domain.di

import com.htm.domain.usecase.movie.GetMoviesUseCase
import org.koin.dsl.module

val domainModule = module {
    factory {
        GetMoviesUseCase(movieRepository = get())
    }
}