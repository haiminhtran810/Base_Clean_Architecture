package com.htm.data.base

import com.htm.domain.model.Model

interface EntityMapper<M : Model, ME : ModelEntity> {
    fun mapToDomain(entity: ME): M
    fun mapToEntity(model: M): ME
}