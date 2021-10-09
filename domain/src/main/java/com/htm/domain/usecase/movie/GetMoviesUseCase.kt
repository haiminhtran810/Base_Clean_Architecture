package com.htm.domain.usecase.movie

import com.htm.domain.model.Movie
import com.htm.domain.repository.MovieRepository
import com.htm.domain.usecase.UseCase

class GetMoviesUseCase(private val movieRepository: MovieRepository) :
    UseCase<GetMoviesUseCase.Params, List<Movie>>() {

    override suspend fun executeWork(params: Params?): List<Movie>? {
        return movieRepository.getMovies(params?.page ?: 0)
    }

    data class Params(
        val page: Int = 0,
    )

}