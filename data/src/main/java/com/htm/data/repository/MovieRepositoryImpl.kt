package com.htm.data.repository

import com.htm.data.remote.api.ServiceApi
import com.htm.domain.repository.MovieRepository

class MovieRepositoryImpl(serverApi: ServiceApi) : MovieRepository {
    override fun getMovies(query: String): Boolean {
        return true
    }
}