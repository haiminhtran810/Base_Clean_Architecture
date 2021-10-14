package com.htm.data.base

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
open class BaseListResponse<Item>(
    @Json(name = "id") val page: Int? = null,
    @Json(name = "total_results") val totalResults: Int? = null,
    @Json(name = "total_pages") val totalPages: Int? = null,
    @Json(name = "results") var results: List<Item>? = null
) : BaseResponse()