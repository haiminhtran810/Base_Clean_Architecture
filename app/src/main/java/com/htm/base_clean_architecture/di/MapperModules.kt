package com.htm.base_clean_architecture.di

import com.htm.base_clean_architecture.model.GenreItemMapper
import com.htm.base_clean_architecture.model.MovieItemMapper
import org.koin.dsl.module

val mapperModules = module {
    factory {
        MovieItemMapper(genreItemMapper = get())
    }
    factory {
        GenreItemMapper()
    }
}