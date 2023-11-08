package com.udhayakumart.android.scoreboard.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row                                                              
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScoreKeyBoard(){
    Row( modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween)  {
        Button(onClick = { }, Modifier.height(90.dp).weight(1f).padding(16.dp)) {
            Text("Undo")
        }
        Button(onClick = { },Modifier.height(90.dp).weight(1f).padding(16.dp)) {
            Text("Next Over")
        }
    }
    Row( modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween)  {
        Button(onClick = { }, Modifier.height(90.dp).width(80.dp).weight(1f).padding(12.dp)
        ) {
            Text("0")
        }
        Button(onClick = { },Modifier.height(90.dp).weight(1f).padding(12.dp)) {
            Text("1")
        }
        Button(onClick = { }, Modifier.height(90.dp).weight(1f).padding(12.dp)) {
            Text("2")
        }
        Button(onClick = { },Modifier.height(90.dp).weight(1f).padding(12.dp)) {
            Text("3")
        }
    }
    Row( modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween)  {
        Button(onClick = { }, Modifier.height(90.dp).width(80.dp).weight(1f).padding(12.dp)
        ) {
            Text("4")
        }
        Button(onClick = { },Modifier.height(90.dp).weight(1f).padding(12.dp)) {
            Text("6")
        }
        Button(onClick = { }, Modifier.height(90.dp).weight(1f).padding(12.dp)) {
            Text("W")
        }
        Button(onClick = { },Modifier.height(90.dp).weight(1f).padding(12.dp)) {
            Text("+")
        }
    }
    Row( modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween)  {
        Button(onClick = { }, Modifier.height(90.dp).weight(1f).padding(16.dp)) {
            Text("Wide")
        }
        Button(onClick = { },Modifier.height(90.dp).weight(1f).padding(16.dp)) {
            Text("No Ball")
        }
    }
}