package com.htm.data.remote.response

import com.htm.data.base.BaseResponse
import com.htm.data.model.MovieEntity
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GetMoviesResponse(
    @Json(name = "id") val page: Int? = null,
    @Json(name = "total_results") val totalResults: Int? = null,
    @Json(name = "total_pages") val totalPages: Int? = null,
    @Json(name = "results") var results: ArrayList<MovieEntity>? = null
) : BaseResponse()