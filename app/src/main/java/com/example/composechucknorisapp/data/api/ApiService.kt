package com.example.composechucknorisapp.data.api

import com.example.composechucknorisapp.data.model.ChakNorisApi
import retrofit2.Response
import retrofit2.http.GET


interface ApiService {
    @GET("jokes/random")
    suspend fun getChuckRandomJoke(): Response<ChakNorisApi>
}