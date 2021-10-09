package com.htm.base_clean_architecture.base

import com.htm.base_clean_architecture.model.ModelItem
import com.htm.domain.model.Model

interface ItemMapper<M : Model, MI : ModelItem> {
    fun mapToPresentation(model: M): ModelItem

    fun mapToDomain(modelItem: MI): Model
}