package com.example.composechucknorisapp.data.di

import com.example.composechucknorisapp.data.repository.NetworkRepositoryRandomJokes
import com.example.composechucknorisapp.domain.GetRandomJokesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {
    @Provides
    fun provideGetRandomJokesUseCase(networkRepositoryRandomJokes: NetworkRepositoryRandomJokes): GetRandomJokesUseCase {
        return GetRandomJokesUseCase(networkRepositoryRandomJokes)
    }
}