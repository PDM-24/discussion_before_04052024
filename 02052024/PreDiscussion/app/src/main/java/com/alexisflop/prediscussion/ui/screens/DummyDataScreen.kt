package com.alexisflop.prediscussion.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alexisflop.prediscussion.ui.components.DummyDataWRememberComponent

@Composable
fun DummyDataScreen(){
    DummyDataWRememberComponent()
}

@Preview(showSystemUi = true)
@Composable
private fun DummyDataScreenPreview(){
    DummyDataScreen()
}