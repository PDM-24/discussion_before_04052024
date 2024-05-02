package com.alexisflop.prediscussion.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alexisflop.prediscussion.ui.components.ScaffoldComponent

@Composable
fun ScaffoldScreen(){
    Scaffold(
        content = {innerPadding ->
            ScaffoldComponent(modifier = Modifier.padding(innerPadding))
        }
    )
}

@Preview
@Composable
private fun ScaffoldScreenPreview(){
    ScaffoldScreen()
}