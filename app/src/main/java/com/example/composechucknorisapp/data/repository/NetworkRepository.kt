package com.example.composechucknorisapp.data.repository

import com.example.composechucknorisapp.data.api.RetrofitHelper
import com.example.composechucknorisapp.data.model.ChuckNorisApi
import javax.inject.Inject

interface NetworkRepository{
    suspend fun getRandomChuckNoris():ChuckNorisApi
}
class NetworkRepositoryRandomJokes @Inject constructor():NetworkRepository{
    override suspend fun getRandomChuckNoris(): ChuckNorisApi {
        return RetrofitHelper.retrofitApi.getChuckRandomJoke()
    }
}