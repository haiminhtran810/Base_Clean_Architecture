package com.htm.domain.model

data class Genre(
    val id: Int? = 0,
    val homepage: String? = "",
    val imdbId: String? = ""
) : Model