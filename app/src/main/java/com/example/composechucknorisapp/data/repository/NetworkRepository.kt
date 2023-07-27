package com.example.composechucknorisapp.data.repository

import com.example.composechucknorisapp.data.api.ApiService
import com.example.composechucknorisapp.data.model.ChuckNorisApi


interface NetworkRepository{
    suspend fun getRandomChuckNoris():List<ChuckNorisApi>
}

class NetworkRepositoryRandomJokes(private val apiService: ApiService):NetworkRepository{
    override suspend fun getRandomChuckNoris(): List<ChuckNorisApi> = apiService.getChuckRandomJoke().map {
        ChuckNorisApi(
            it.icon_url,
            it.value
        )
    }

}