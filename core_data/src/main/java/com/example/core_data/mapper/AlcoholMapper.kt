package com.example.core_data.mapper

import com.example.core_alcohol_api.enums.AlcoholType
import com.example.core_alcohol_api.models.AlcoholDomainModel
import com.example.core_database.entity.AlcoholEntity
import java.util.Date

object AlcoholMapper {

    internal fun AlcoholEntity.mapToDomain() : AlcoholDomainModel =
        AlcoholDomainModel(
            id = id,
            name =name,
            description = description,
            type = AlcoholType.getByIndex(type),
            createdAt = Date(createdAt),
            inFavorites = inFavorites,
            addedToFavorite = Date(addedToFavorite)
        )
}