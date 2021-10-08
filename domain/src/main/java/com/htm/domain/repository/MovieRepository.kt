package com.htm.domain.repository

import com.htm.domain.model.Movie

interface MovieRepository : ItemRepository {
    suspend fun getMovies(page: Int): List<Movie>?
}