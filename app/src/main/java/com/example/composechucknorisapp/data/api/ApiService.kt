package com.example.composechucknorisapp.data.api

import com.example.composechucknorisapp.data.model.ChuckNorisApi
import retrofit2.http.GET
import javax.inject.Inject


interface ApiService {
    @GET("jokes/random")
    suspend fun getChuckRandomJoke(): List<ChuckNorisApi>
}