package com.example.composechucknorisapp.data.repository

import com.example.composechucknorisapp.data.api.ApiService
import com.example.composechucknorisapp.data.api.RetrofitHelper
import com.example.composechucknorisapp.data.model.ChuckNorisApi
import javax.inject.Inject


interface NetworkRepository{
    suspend fun getRandomChuckNoris():List<ChuckNorisApi>
}

class NetworkRepositoryRandomJokes @Inject constructor():NetworkRepository{
    override suspend fun getRandomChuckNoris(): List<ChuckNorisApi> = RetrofitHelper.retrofitApi.getChuckRandomJoke().map {
        ChuckNorisApi(
            it.icon_url,
            it.value
        )
    }
}