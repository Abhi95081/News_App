package com.example.newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.newsapp.ui.theme.NewsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewsAppTheme {
                NewsScreen()
                //newsapi.org/
                //https://newsapi.org/v2/top-headlines?country=us&apiKey=38eec33c66ec45f0b6ad9f5ea7628d0a
            }
        }
    }
}

