package com.alexisflop.prediscussion.ui.screens

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.alexisflop.prediscussion.ui.activities.PutExtraActivity
import com.alexisflop.prediscussion.ui.components.DummyDataWRememberComponent
import com.alexisflop.prediscussion.ui.components.UnitFunctionComponent

@Composable
fun UnitFunctionScreen(context: Context) {
    Column {
        DummyDataWRememberComponent()
        UnitFunctionComponent(context)
    }

}

@Preview(showSystemUi = true)
@Composable
private fun UnitFunctionScreenPreview() {
    UnitFunctionScreen(LocalContext.current)
}