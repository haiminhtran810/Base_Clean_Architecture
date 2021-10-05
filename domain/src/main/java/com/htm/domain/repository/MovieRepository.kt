package com.htm.domain.repository

interface MovieRepository : ItemRepository {
    fun getMovies(query: String): Boolean
}