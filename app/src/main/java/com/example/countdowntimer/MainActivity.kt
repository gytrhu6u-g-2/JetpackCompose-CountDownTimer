package com.example.countdowntimer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.outlined.Timer10Select
import androidx.compose.material.icons.outlined.Timer3Select
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.example.countdowntimer.ui.theme.CountDownTimerTheme
import com.example.countdowntimer.ui.theme.Pink40
import com.example.countdowntimer.ui.theme.Pink80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        }
    }
}

@Composable
fun ExampleScaffold() {
    Scaffold(
        topBar = { Text("TopBar") },
        bottomBar = { Text("BottomAppBar") },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                content = {
                    Icon(
                        imageVector = Icons.Filled.Timer,
                        contentDescription = "Timer"
                    )
                }
            )
        },
        content = { innerPadding ->
            Box(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .background(color = Pink80),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Content")
            }
        }
    )
}

@Preview(widthDp = 300, heightDp = 500)
@Composable
private fun ExampleScaffoldPreview() {
    CountDownTimerTheme {
        ExampleScaffold()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    iconOnClick: (Int) -> Unit,
) {
    TopAppBar(
        title = {
            Text(
                text = "CountDownTimer",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        navigationIcon = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Filled.Timer,
                    contentDescription = "Timer"
                )
            }
        },
        actions = {
            IconButton(
                onClick = {iconOnClick(3)}
            ) {
                Icon(
                    imageVector = Icons.Outlined.Timer3Select,
                    contentDescription = "Timer3Selet"
                )
            }
            IconButton(
                onClick = {iconOnClick(10)}
            ) {
                Icon(
                    imageVector = Icons.Outlined.Timer10Select,
                    contentDescription = "Timer10Selet"
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            navigationIconContentColor = MaterialTheme.colorScheme.onPrimary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary,
            actionIconContentColor = MaterialTheme.colorScheme.onPrimary
        )
    )
}

@Preview
@Composable
private fun TopBarPreview() {
    TopBar(iconOnClick = {})
}