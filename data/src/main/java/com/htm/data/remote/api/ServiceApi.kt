package com.htm.data.remote.api

import com.htm.data.base.BaseListResponse
import com.htm.data.model.MovieEntity
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ServiceApi {
    @GET("movie/popular")
    suspend fun getMovieListPopularAsync(@Query(ApiParams.PAGE) page: Int): Response<BaseListResponse<MovieEntity>>
}

object ApiParams {
    const val PAGE = "page"
    const val MOVIE_ID = "movie_id"
}