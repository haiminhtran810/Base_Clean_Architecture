package com.htm.data.repository

import com.htm.data.model.MovieEntityMapper
import com.htm.data.remote.api.ServiceApi
import com.htm.domain.model.Movie
import com.htm.domain.repository.MovieRepository

class MovieRepositoryImpl(
    private val serverApi: ServiceApi,
    private val movieEntityMapper: MovieEntityMapper
) : MovieRepository {
    override suspend fun getMovies(page: Int): List<Movie>? {
        return serverApi.getMovieListPopular(page = page).body()?.results?.map {
            movieEntityMapper.mapToDomain(it)
        }
    }
}