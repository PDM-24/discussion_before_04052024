package com.alexisflop.prediscussion.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.alexisflop.prediscussion.ui.screens.SecondScreen
import com.alexisflop.prediscussion.ui.theme.PreDiscussionTheme

class SecondActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            PreDiscussionTheme {
                SecondScreen(index = intent.getIntExtra("itemIndex", 2))
            }
        }
    }
}