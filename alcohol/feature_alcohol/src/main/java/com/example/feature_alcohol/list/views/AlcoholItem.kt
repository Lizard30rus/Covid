package com.example.feature_alcohol.list.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.core_alcohol_api.enums.AlcoholType
import com.example.core_alcohol_api.models.AlcoholDomainModel
import com.example.core_common.utils.createUuid
import com.example.core_ui.composables.CustomCard
import com.example.core_ui.dimens.Dimens
import java.util.Date

@Composable
internal fun AlcoholItem(item: AlcoholDomainModel, onClick: () -> Unit) {
    CustomCard(
        modifier = Modifier.clickable {
            onClick()
        }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(PaddingValues(all = Dimens.small_padding))
        ) {
            Text(text = item.name)
        }
    }
}

@Preview(
    showBackground = true,
    locale = "ru"
)
@Composable
private fun AlcoholItemPreview() {
    AlcoholItem(
        AlcoholDomainModel(
            id = createUuid(),
            name = "Имя",
            description = "gbcfybt",
            type = AlcoholType.BEER,
            createdAt = Date()
        )
    ) {

    }
}