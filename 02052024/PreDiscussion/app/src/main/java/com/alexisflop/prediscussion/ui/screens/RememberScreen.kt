package com.alexisflop.prediscussion.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alexisflop.prediscussion.ui.components.RememberComponent

@Composable
fun RememberScreen(){
    RememberComponent()
}

@Preview(showSystemUi = true)
@Composable
private fun RememberScreenPreview(){
    RememberScreen()
}