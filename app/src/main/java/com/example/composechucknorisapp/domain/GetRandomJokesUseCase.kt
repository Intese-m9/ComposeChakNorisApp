package com.example.composechucknorisapp.domain

import com.example.composechucknorisapp.data.model.ChuckNorisApi
import com.example.composechucknorisapp.data.repository.NetworkRepositoryRandomJokes

class GetRandomJokesUseCase(private val networkRepositoryRandomJokes: NetworkRepositoryRandomJokes){
    suspend fun getListJokes():List<ChuckNorisApi>{
        return networkRepositoryRandomJokes.getRandomChuckNoris()
    }
}