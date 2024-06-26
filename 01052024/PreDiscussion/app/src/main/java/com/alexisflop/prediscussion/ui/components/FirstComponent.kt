package com.alexisflop.prediscussion.ui.components

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.alexisflop.prediscussion.data.myList
import com.alexisflop.prediscussion.ui.activities.SecondActivity

@Composable
fun FirstComponent(modifier: Modifier = Modifier, onClick: () -> Unit, context: Context) {

    /*val myState by remember {
        mutableStateOf(true)
    }*/

    /*val _myState: MutableState<String> = remember {
        mutableStateOf("Hola")
    }

    val _myList = remember {
        myList
    }

    _myList.value += "Henry"
    myList.value+= "Alexis"*/

    //var myString: String = "Hola"

    Column(modifier = modifier) {
        Box(
            modifier = Modifier
                .weight(0.5f)
                .fillMaxWidth()
                .background(Color.Black)
        ) {
            //Text(color = Color.White, text = _myState.value)

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.50f)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.White)
        ) {

        }
        Button(
            onClick = {
                myList.value += "Henry"//0
                myList.value += "Alexis"//1
                myList.value += "Flores"//2
                myList.value += "Lopez"//3
            }/*{
            //Log.i("FIRST STATUS", myString)
            /*_myState.value = "Adios"
            _myList.value+= "Flores"
            myList.value += "Lopez"*/
            //Log.i("LAST STATUS", myString)
        }*/, modifier = Modifier.weight(0.3f)
        ) {
            Text(text = "Navigate to other activity")
        }
        TextButton(onClick = { val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("itemIndex", 1)
            context.startActivity(intent)
            (context as Activity) }) {
            Text(text = "Navegar")

        }

        /*Text(
            modifier = Modifier.clickable {
                val intent = Intent(context, SecondActivity::class.java)
                intent.putExtra("itemIndex", 1)
                context.startActivity(intent)
                (context as Activity)
            },
            text = "Text Button to other Activity"
        )*/
        /*LazyColumn(modifier = Modifier.weight(1f).fillMaxWidth()) {
            itemsIndexed(_myList.value){index, item ->
                Text(text = item, color = Color.White)
            }

        }*/
    }
}

@Preview(showSystemUi = false)
@Composable
private fun FirstComponentPreview() {
    FirstComponent(onClick = {}, context = LocalContext.current)
}
