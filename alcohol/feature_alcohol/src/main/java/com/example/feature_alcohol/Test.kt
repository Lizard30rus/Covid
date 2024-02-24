package com.example.feature_alcohol

import com.example.core_alcohol_api.enums.AlcoholType
import com.example.core_alcohol_api.models.AlcoholDomainModel
import com.example.core_common.utils.createUuid
import java.util.Date

object Test {
    val list =  List(size = 20) {
        AlcoholDomainModel(
            id = createUuid(),
            name = "Напиток $it",
            description = "описание",
            type = AlcoholType.BEER,
            createdAt = Date()
        )
    }
}