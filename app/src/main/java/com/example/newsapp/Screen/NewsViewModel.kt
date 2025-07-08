package com.example.newsapp.Screen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.NewsModel
import com.example.newsapp.repo.Repo
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.launchIn

class NewsViewModel(private val repo: Repo) : ViewModel() {

    val res = mutableStateOf(Result)

    init {
        getNews()
    }

    fun getNews()= flow<Result<NewsModel>> {

        emit(Result.Loading(""))
        try {
            emit(Result.Success(data = repo.newProvider().body()))
        }catch (
            e:Exception
        ){
            emit(Result.Error(e.localizedMessage))
        }

    }
}