package com.htm.data.remote.api

import com.htm.data.remote.response.GetMoviesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ServiceApi {
    @GET("movie/popular")
    suspend fun getMovieListPopular(@Query(ApiParams.PAGE) page: Int): GetMoviesResponse
}

object ApiParams {
    const val PAGE = "page"
    const val MOVIE_ID = "movie_id"
}