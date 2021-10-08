package com.htm.data.di

import com.htm.data.repository.MovieRepositoryImpl
import com.htm.domain.repository.MovieRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<MovieRepository> {
        MovieRepositoryImpl(serverApi = get(), movieEntityMapper = get())
    }
}