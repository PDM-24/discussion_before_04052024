package com.alexisflop.prediscussion.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RememberComponent(){
    
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(0.95f)
            .background(Color.Gray))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Tap me")
        }
    }
}

@Preview(showSystemUi = false)
@Composable
private fun RememberComponentPreview(){
    RememberComponent()
}