package com.alexisflop.prediscussion.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.alexisflop.prediscussion.ui.screens.PutExtraScreen
import com.alexisflop.prediscussion.ui.theme.PreDiscussionTheme

class PutExtraActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            PreDiscussionTheme {
                PutExtraScreen(index = intent.getIntExtra("indexItem", 1))
            }
        }
    }
}