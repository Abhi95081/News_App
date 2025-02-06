package com.example.newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.newsapp.ui.theme.NewsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewsAppTheme {
                NewsScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewsScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("News App", color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF6200EE))
            )
        }
    ) { innerPadding ->
        NewsList(modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun NewsList(modifier: Modifier = Modifier) {
    val newsItems = listOf(
        "Breaking: Market hits all-time high",
        "Tech: New smartphone released today",
        "Sports: Local team wins championship",
        "World: Major summit happening now"
    )

    LazyColumn(modifier = modifier.padding(16.dp)) {
        items(newsItems) { news ->
            NewsCard(news)
        }
    }
}

@Composable
fun NewsCard(news: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFBB86FC)),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Text(
            text = news,
            color = Color.White,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun NewsScreenPreview() {
    NewsAppTheme {
        NewsScreen()
    }
}
