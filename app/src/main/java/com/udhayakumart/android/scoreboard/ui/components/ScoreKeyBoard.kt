package com.udhayakumart.android.scoreboard.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScoreKeyBoard() {
    val buttonSpacing = 8.dp
    Row( modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(36.dp))  {

        ScoreButton(symbol = "Undo",color = MaterialTheme.colorScheme.secondaryContainer,textColor = MaterialTheme.colorScheme.onSecondaryContainer,
            modifier = Modifier
                .aspectRatio(2.5f)
                .weight(2f)) {

        }
        ScoreButton(symbol = "Next Over",color = MaterialTheme.colorScheme.secondaryContainer,textColor = MaterialTheme.colorScheme.onSecondaryContainer,
            modifier = Modifier
                .aspectRatio(2.5f)
                .weight(2f)) {

        }
    }
    Row( modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(22.dp))  {
        ScoreButton(symbol = "0",color = MaterialTheme.colorScheme.surfaceVariant,textColor = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier
                .aspectRatio(1f)
                .weight(1f)) {

        }
        ScoreButton(symbol = "1",color = MaterialTheme.colorScheme.surfaceVariant,textColor = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier
                .aspectRatio(1f)
                .weight(1f)) {

        }
        ScoreButton(symbol = "2",color = MaterialTheme.colorScheme.surfaceVariant,textColor = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier
                .aspectRatio(1f)
                .weight(1f)) {

        }
        ScoreButton(symbol = "3",color = MaterialTheme.colorScheme.surfaceVariant,textColor = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier
                .aspectRatio(1f)
                .weight(1f)) {

        }
    }
    Row( modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(22.dp))  {
        ScoreButton(symbol = "4",color = MaterialTheme.colorScheme.surfaceVariant,textColor = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier
                .aspectRatio(1f)
                .weight(1f)) {

        }
        ScoreButton(symbol = "6",color = MaterialTheme.colorScheme.surfaceVariant,textColor = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier
                .aspectRatio(1f)
                .weight(1f)) {

        }
        ScoreButton(symbol = "W",color = MaterialTheme.colorScheme.tertiaryContainer,textColor = MaterialTheme.colorScheme.onTertiaryContainer,
            modifier = Modifier
                .aspectRatio(1f)
                .weight(1f)) {

        }
        ScoreButton(symbol = "+",color = MaterialTheme.colorScheme.surfaceVariant,textColor = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier
                .aspectRatio(1f)
                .weight(1f)) {

        }
    }
    Row( modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(36.dp))  {
        ScoreButton(symbol = "Wide",color = MaterialTheme.colorScheme.secondaryContainer,textColor = MaterialTheme.colorScheme.onSecondaryContainer,
            modifier = Modifier
                .aspectRatio(2.5f)
                .weight(2f)) {

        }
        ScoreButton(symbol = "No Ball",color = MaterialTheme.colorScheme.secondaryContainer,textColor = MaterialTheme.colorScheme.onSecondaryContainer,
            modifier = Modifier
                .aspectRatio(2.5f)
                .weight(2f)) {

        }
    }
}