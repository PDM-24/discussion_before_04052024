package com.alexisflop.prediscussion.ui.components

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.alexisflop.prediscussion.ui.activities.PutExtraActivity

@Composable
fun UnitFunctionComponent(context: Context) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Button(onClick = {
            val intent = Intent(context, PutExtraActivity::class.java)
            intent.putExtra("indexItem", 0)
            context.startActivity(intent)
            (context as Activity)
        }) {
            Text(text = "You can navigate to other activity")
        }
    }

}

@Preview(showSystemUi = false)
@Composable
private fun UnitFunctionComponentPreview() {
    UnitFunctionComponent(LocalContext.current)
}