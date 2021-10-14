package com.htm.data.repository

import com.htm.data.model.MovieEntityMapper
import com.htm.data.remote.api.ServiceApi
import com.htm.domain.model.Movie
import com.htm.domain.repository.MovieRepository
import timber.log.Timber

class MovieRepositoryImpl(
    private val serverApi: ServiceApi,
    private val movieEntityMapper: MovieEntityMapper
) : MovieRepository {
    override suspend fun getMovies(page: Int): List<Movie>? {
        val resultData = serverApi.getMovieListPopularAsync(page = page)
        return if (resultData.isSuccessful) {
            resultData.body().let {
                it?.results?.map { movieEntity ->
                    movieEntityMapper.mapToDomain(movieEntity)
                }
            }
        } else {
            Timber.e(resultData.errorBody()?.string())
            null
        }
    }
}