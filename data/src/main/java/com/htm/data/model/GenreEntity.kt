package com.htm.data.model

import com.htm.data.base.EntityMapper
import com.htm.data.base.ModelEntity
import com.htm.domain.model.Genre
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenreEntity(
    @Json(name = "id")
    val id: Int? = 0,

    @Json(name = "homepage")
    val homepage: String? = "",

    @Json(name = "imdb_id")
    val imdbId: String? = ""
) : ModelEntity

class GenreEntityMapper : EntityMapper<Genre, GenreEntity> {
    override fun mapToDomain(entity: GenreEntity): Genre = Genre(
        id = entity.id,
        homepage = entity.homepage,
        imdbId = entity.imdbId
    )

    override fun mapToEntity(model: Genre): GenreEntity = GenreEntity(
        id = model.id,
        homepage = model.homepage,
        imdbId = model.imdbId
    )
}