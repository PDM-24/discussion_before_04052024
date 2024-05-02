package com.alexisflop.prediscussion.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alexisflop.prediscussion.ui.components.ModifiersComponent

@Composable
fun ModifiersScreen(){
    Column {
        ModifiersComponent(modifier = Modifier.weight(0.5f))
        ModifiersComponent(modifier = Modifier.weight(0.5f))
    }

}

@Preview(showSystemUi = true)
@Composable
private fun ModifiersScreenPreview(){
    ModifiersScreen()
}