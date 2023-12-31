package com.example.composechucknorisapp.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    const val baseUrl = "https://api.chucknorris.io/"
    private fun getInstance():Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
     val retrofitApi: ApiService by lazy{
        getInstance().create(ApiService::class.java)
    }
}