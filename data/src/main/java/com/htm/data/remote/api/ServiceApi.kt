package com.htm.data.remote.api

import retrofit2.http.GET

interface ServiceApi {
    @GET("search/repositories")
    fun getMovies()
}