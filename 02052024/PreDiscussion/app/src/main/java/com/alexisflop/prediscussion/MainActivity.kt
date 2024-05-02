package com.alexisflop.prediscussion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.platform.LocalContext
import com.alexisflop.prediscussion.ui.screens.ModifiersScreen
import com.alexisflop.prediscussion.ui.screens.UnitFunctionScreen
import com.alexisflop.prediscussion.ui.theme.PreDiscussionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreDiscussionTheme {
                UnitFunctionScreen(context = LocalContext.current)
            }
        }
    }
}
