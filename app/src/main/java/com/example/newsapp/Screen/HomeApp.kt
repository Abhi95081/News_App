package com.example.newsapp.Screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier

@Composable
fun HomeApp(modifier: Modifier = Modifier,viewModel: NewsViewModel) {

    val res = viewModel.getNews().collectAsState(initial = Result.Loading(""))
}