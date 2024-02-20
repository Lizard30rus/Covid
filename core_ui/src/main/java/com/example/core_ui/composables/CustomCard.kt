package com.example.core_ui.composables

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.core_ui.values.Shapes

@Composable
fun CustomCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Card(
        modifier = modifier,
        shape = Shapes.small,
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp,
            pressedElevation = 10.dp
        ),
        content = { content() }
    )
}