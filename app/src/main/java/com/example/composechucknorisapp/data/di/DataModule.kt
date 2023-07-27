package com.example.composechucknorisapp.data.di

import com.example.composechucknorisapp.data.api.ApiService
import com.example.composechucknorisapp.data.repository.NetworkRepository
import com.example.composechucknorisapp.data.repository.NetworkRepositoryRandomJokes
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {
    @Provides
    @Singleton
    fun provideRepositoryChuck(apiService: ApiService):NetworkRepositoryRandomJokes{
        return NetworkRepositoryRandomJokes(apiService)
    }
}