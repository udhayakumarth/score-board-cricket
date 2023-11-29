package com.udhayakumart.android.scoreboard.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun OverBalls(text: String) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .size(48.dp) // adjust the size of the circle as you wish
            .clip(CircleShape) // clip the box to a circle shape
            .background(MaterialTheme.colorScheme.primary) // set the background color of the circle
    ) {
        Text(
            text = text, // set the text that you want to display
            color = MaterialTheme.colorScheme.onPrimary, // set the text color
            modifier = Modifier.align(Alignment.Center) // align the text to the center of the box
        )
    }
}