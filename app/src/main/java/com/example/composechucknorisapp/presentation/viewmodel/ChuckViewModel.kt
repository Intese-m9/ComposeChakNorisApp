package com.example.composechucknorisapp.presentation.viewmodel

import android.view.View
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.composechucknorisapp.data.model.ChuckNorisApi
import com.example.composechucknorisapp.data.repository.NetworkRepository
import com.example.composechucknorisapp.domain.GetRandomJokesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException
import java.lang.IllegalStateException
import javax.inject.Inject

sealed interface ChuckUiState {
    data class Success(val listChuck: List<ChuckNorisApi>) : ChuckUiState
    object Error : ChuckUiState
    object Loading : ChuckUiState
}

@HiltViewModel
class ChuckViewModel @Inject constructor(private val getRandomJokesUseCase: GetRandomJokesUseCase) :
    ViewModel() {
    var chuckUiState: ChuckUiState by mutableStateOf(ChuckUiState.Loading)

    init {
        getRandomJoke()
    }

    fun getRandomJoke() {
        viewModelScope.launch {
            chuckUiState = ChuckUiState.Loading
            chuckUiState = try {
                ChuckUiState.Success(getRandomJokesUseCase.getListJokes())
            } catch (e: IOException) {
                ChuckUiState.Error
            } catch (e: HttpException) {
                ChuckUiState.Error
            }catch (e: IllegalStateException){
                ChuckUiState.Error
            }
        }
    }
}