package com.alexisflop.prediscussion.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.provider.FontsContractCompat.Columns

@Composable
fun ModifiersComponent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .weight(0.50f))
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Gray)
            .weight(0.5f))
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .weight(1f))
    }
}

@Preview(showSystemUi = false)
@Composable
private fun ModifiersComponentPreview() {
    ModifiersComponent()
}