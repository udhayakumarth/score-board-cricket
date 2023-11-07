package com.udhayakumart.android.scoreboard

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.udhayakumart.android.scoreboard.ui.theme.ScoreBoardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScoreBoardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        SmallTopAppBarExample()
                    }

                }
            }
        }
    }

}

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



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmallTopAppBarExample() {
    var mDisplayMenu by remember { mutableStateOf(false) }

    // fetching local context
    val mContext = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Score Board")
                },
                actions = {
                    IconButton(onClick = { mDisplayMenu = !mDisplayMenu }) {
                        Icon(Icons.Default.MoreVert, "")
                    }

                    DropdownMenu(
                        expanded = mDisplayMenu,
                        onDismissRequest = { mDisplayMenu = false }
                    ) {
                        DropdownMenuItem(text = { Text(text = "Reset")}, onClick = { Toast.makeText(mContext, "Reset", Toast.LENGTH_SHORT).show() })
                        DropdownMenuItem(text = { Text(text = "Change Match")}, onClick = { Toast.makeText(mContext, "Change Match", Toast.LENGTH_SHORT).show() })

                    }
                }
            )
        },
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            MainScore()
            Divider(
                color = Color.LightGray,
                thickness = 1.dp
            )
            OverCard()
        }
    }
}


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


@Composable
fun OverBalls(text: String) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .size(48.dp) // adjust the size of the circle as you wish
            .clip(CircleShape) // clip the box to a circle shape
            .background(Color.White) // set the background color of the circle
    ) {
        Text(
            text = text, // set the text that you want to display
            color = Color.Black, // set the text color
            modifier = Modifier.align(Alignment.Center) // align the text to the center of the box
        )
    }
}


