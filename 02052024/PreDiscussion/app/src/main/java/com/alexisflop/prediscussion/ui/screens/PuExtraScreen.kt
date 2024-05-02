package com.alexisflop.prediscussion.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alexisflop.prediscussion.ui.activities.PutExtraActivity
import com.alexisflop.prediscussion.ui.components.PutExtraComponent

@Composable
fun PutExtraScreen(index: Int){
    PutExtraComponent(index = index)
}

@Preview(showSystemUi = true)
@Composable
private fun PutExtraScreenPreview(){
    PutExtraScreen(0)
}