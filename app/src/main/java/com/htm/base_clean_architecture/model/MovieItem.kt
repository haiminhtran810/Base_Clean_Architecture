package com.htm.base_clean_architecture.model

import android.os.Parcelable
import com.htm.base_clean_architecture.base.ItemMapper
import com.htm.domain.model.Movie
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieItem(
    val id: Int? = 0,

    val adult: Boolean? = false,

    val genres: List<GenreItem>? = emptyList(),

    val budget: Int? = 0,

    val backdropPath: String? = "",

    val originalLanguage: String? = "",

    val originalTitle: String? = "",

    val overview: String? = "",

    val popularity: Double? = 0.0,

    val posterPath: String? = "",

    val title: String? = "",

    val video: Boolean? = false,

    val voteAverage: Double? = 0.0,

    val voteCount: Int? = 0
) : ModelItem, Parcelable

class MovieItemMapper(private val genreItemMapper: GenreItemMapper) : ItemMapper<Movie, MovieItem> {
    override fun mapToPresentation(model: Movie): MovieItem = MovieItem(
        id = model.id,
        adult = model.adult,
        genres = model.genres?.map {
            genreItemMapper.mapToPresentation(it)
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

    override fun mapToDomain(modelItem: MovieItem): Movie = Movie(
        id = modelItem.id,
        adult = modelItem.adult,
        genres = modelItem.genres?.map {
            genreItemMapper.mapToDomain(it)
        },
        budget = modelItem.budget,
        backdropPath = modelItem.backdropPath,
        originalLanguage = modelItem.originalLanguage,
        originalTitle = modelItem.originalTitle,
        overview = modelItem.overview,
        popularity = modelItem.popularity,
        posterPath = modelItem.posterPath,
        title = modelItem.title,
        video = modelItem.video,
        voteAverage = modelItem.voteAverage,
        voteCount = modelItem.voteCount
    )
}