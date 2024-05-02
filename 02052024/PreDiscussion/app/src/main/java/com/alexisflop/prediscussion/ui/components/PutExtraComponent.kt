package com.alexisflop.prediscussion.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alexisflop.prediscussion.data.myList

@Composable
fun PutExtraComponent(index: Int
){
    Text(text = myList.value[index])
}

@Preview(showSystemUi = false)
@Composable
private fun PutExtraComponentPreview(){
    PutExtraComponent(0)
}