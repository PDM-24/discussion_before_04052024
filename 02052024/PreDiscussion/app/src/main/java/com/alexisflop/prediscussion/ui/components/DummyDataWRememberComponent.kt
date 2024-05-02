package com.alexisflop.prediscussion.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.alexisflop.prediscussion.data.myList

@Composable
fun DummyDataWRememberComponent(){
    val _myList by remember {
        myList
    }

    val _myList2 = remember {
        myList
    }

    Column {
        LazyColumn {
            itemsIndexed(_myList2.value){
                index, item ->
                Text(text = "i = "+index+ "String: " + item)
            }
        }
        Button(onClick = {


            myList.value += "Henry"
            _myList2.value += "Alexis"
            /*
            *
            * myList += "Flores"
            * muListScope+= "Lopez"
            *
            * */
        }) {

        }
    }
}

@Preview(showSystemUi = false)
@Composable
private fun DummyDataWRememberComponentPreview(){
    DummyDataWRememberComponent()
}