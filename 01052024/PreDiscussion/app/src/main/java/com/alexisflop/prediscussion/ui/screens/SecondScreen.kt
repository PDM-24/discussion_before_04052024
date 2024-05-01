package com.alexisflop.prediscussion.ui.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alexisflop.prediscussion.ui.components.FirstComponent
import com.alexisflop.prediscussion.ui.components.SecondComponent

@Composable
fun SecondScreen(){
    Column {
        SecondComponent(modifier = Modifier.weight(0.5f))
    }
}

@Preview
@Composable
private fun SecondScreenPreview(){
    SecondScreen()
}