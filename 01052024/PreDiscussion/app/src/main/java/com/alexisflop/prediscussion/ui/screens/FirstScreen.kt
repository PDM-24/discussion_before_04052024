package com.alexisflop.prediscussion.ui.screens


import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.alexisflop.prediscussion.ui.activities.SecondActivity
import com.alexisflop.prediscussion.ui.components.FirstComponent

@Composable
fun FirstScreen(context: Context){
    Column {
        FirstComponent(modifier = Modifier.weight(0.5f),
            onClick = {
                context.startActivity(Intent(context, SecondActivity::class.java))
                (context as Activity)
            })
    }

}

@Preview
@Composable
private fun FirstScreenPreview(){
    FirstScreen(context = LocalContext.current)
}