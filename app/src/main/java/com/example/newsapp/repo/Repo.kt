package com.example.newsapp.repo

import com.example.newsapp.NewsModel
import com.example.newsapp.network.ApiProvider
import retrofit2.Response

class Repo() {
    suspend fun newProvider() : Response<NewsModel> {
        return ApiProvider.provideApi().getNewsFromServer()
    }
}