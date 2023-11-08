package com.udhayakumart.android.scoreboard.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScore() {
    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(16.dp)) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text("13/1", fontSize = 30.sp)
                    Text("Overs 1.2")
                }
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Total wicket -7",modifier = Modifier.align(Alignment.End))
                    Text("Total Over -10",modifier = Modifier.align(Alignment.End))
                }
            }


        }
    }
}