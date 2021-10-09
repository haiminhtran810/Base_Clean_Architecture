package com.htm.base_clean_architecture.model

import android.os.Parcelable
import com.htm.base_clean_architecture.base.ItemMapper
import com.htm.domain.model.Genre
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GenreItem(
    val id: Int? = 0,
    val homepage: String? = "",
    val imdbId: String? = ""
) : ModelItem, Parcelable

class GenreItemMapper() : ItemMapper<Genre, GenreItem> {
    override fun mapToPresentation(model: Genre): GenreItem = GenreItem(
        id = model.id,
        homepage = model.homepage,
        imdbId = model.imdbId
    )

    override fun mapToDomain(modelItem: GenreItem): Genre = Genre(
        id = modelItem.id,
        homepage = modelItem.homepage,
        imdbId = modelItem.imdbId
    )
}