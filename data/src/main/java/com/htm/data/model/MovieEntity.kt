package com.htm.data.model

import com.htm.data.base.EntityMapper
import com.htm.data.base.ModelEntity
import com.htm.domain.model.Movie
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MovieEntity(
    @Json(name = "id")
    val id: Int? = 0,

    @Json(name = "adult")
    val adult: Boolean? = false,

    @Json(name = "genres")
    val genres: List<GenreEntity>? = emptyList(),

    @Json(name = "budget")
    val budget: Int? = 0,

    @Json(name = "backdrop_path")
    val backdropPath: String? = "",

    @Json(name = "original_language")
    val originalLanguage: String? = "",

    @Json(name = "original_title")
    val originalTitle: String? = "",

    @Json(name = "overview")
    val overview: String? = "",

    @Json(name = "popularity")
    val popularity: Double? = 0.0,

    @Json(name = "poster_path")
    val posterPath: String? = "",

    @Json(name = "title")
    val title: String? = "",

    @Json(name = "video")
    val video: Boolean? = false,

    @Json(name = "vote_average")
    val voteAverage: Double? = 0.0,

    @Json(name = "vote_count")
    val voteCount: Int? = 0
) : ModelEntity

class MovieEntityMapper(private val genreEntityMapper: GenreEntityMapper) :
    EntityMapper<Movie, MovieEntity> {
    override fun mapToDomain(entity: MovieEntity): Movie = Movie(
        id = entity.id,
        adult = entity.adult,
        genres = entity.genres?.map {
            genreEntityMapper.mapToDomain(it)
        },
        budget = entity.budget,
        backdropPath = entity.backdropPath,
        originalLanguage = entity.originalLanguage,
        originalTitle = entity.originalTitle,
        overview = entity.overview,
        popularity = entity.popularity,
        posterPath = entity.posterPath,
        title = entity.title,
        video = entity.video,
        voteAverage = entity.voteAverage,
        voteCount = entity.voteCount
    )

    override fun mapToEntity(model: Movie): MovieEntity = MovieEntity(
        id = model.id,
        adult = model.adult,
        genres = model.genres?.map {
            genreEntityMapper.mapToEntity(it)
        },
        budget = model.budget,
        backdropPath = model.backdropPath,
        originalLanguage = model.originalLanguage,
        originalTitle = model.originalTitle,
        overview = model.overview,
        popularity = model.popularity,
        posterPath = model.posterPath,
        title = model.title,
        video = model.video,
        voteAverage = model.voteAverage,
        voteCount = model.voteCount
    )
}