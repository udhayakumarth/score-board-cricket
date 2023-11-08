package com.udhayakumart.android.scoreboard.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun OverCard() {
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(250.dp)
        .padding(16.dp), colors = CardDefaults.cardColors(
        MaterialTheme.colorScheme.primaryContainer
    )
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Row {
                Text(text = "1 st Over", fontWeight = FontWeight.Bold)
                Text(text = " | ")
                Text(text = "11 Runs")
            }
            Row {
                OverBalls("1")
                OverBalls("6")
            }
        }
    }
}
