package com.udhayakumart.android.scoreboard

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.udhayakumart.android.scoreboard.ui.components.MainScore
import com.udhayakumart.android.scoreboard.ui.components.OverCard
import com.udhayakumart.android.scoreboard.ui.components.ScoreKeyBoard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScoreBoardScreen() {
    var mDisplayMenu by remember { mutableStateOf(false) }
    // fetching local context
    val mContext = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                ),
                title = {
                    Text("Score Board")
                },
                actions = {
                    IconButton(onClick = { mDisplayMenu = !mDisplayMenu }) {
                        Icon(Icons.Default.MoreVert, "", tint = MaterialTheme.colorScheme.onPrimary)
                    }

                    DropdownMenu(
                        expanded = mDisplayMenu,
                        onDismissRequest = { mDisplayMenu = false }
                    ) {
                        DropdownMenuItem(text = { Text(text = "Reset") }, onClick = { Toast.makeText(mContext, "Reset", Toast.LENGTH_SHORT).show() })
                        DropdownMenuItem(text = { Text(text = "Change Match") }, onClick = { Toast.makeText(mContext, "Change Match", Toast.LENGTH_SHORT).show() })

                    }
                }
            )
        },
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding).background(MaterialTheme.colorScheme.inverseOnSurface)) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomCenter),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                ) {
                    Row {
                        Column(modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)
                            .padding(16.dp),verticalArrangement = Arrangement.spacedBy(16.dp)) {
                            MainScore()
                            LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)){
                                items(items = listOf(1,2,3,4), itemContent = {
                                    OverCard()
                                })
                            }
                        }
                    }
                    Row(modifier = Modifier.background(MaterialTheme.colorScheme.surface)
                    ) {
                        Column(modifier = Modifier.background(MaterialTheme.colorScheme.surface)
                            .padding(16.dp),verticalArrangement = Arrangement.spacedBy(16.dp)) {
                            ScoreKeyBoard()
                        }
                    }
                }

            }

        }
    }
}

