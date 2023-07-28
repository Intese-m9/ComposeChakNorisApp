package com.example.composechucknorisapp.presentation.view

import androidx.compose.runtime.Composable
import com.example.composechucknorisapp.presentation.viewmodel.ChuckUiState

@Composable
fun HomeScreen(
    chuckUiState: ChuckUiState,
    retryAction: () -> Unit
){
when (chuckUiState){
    is ChuckUiState.Loading -> LoadingScreen()
    is ChuckUiState.Success -> JokeCard(joke = chuckUiState.listChuck,retryAction)
    is ChuckUiState.Error -> ErrorScreen(retryAction)
}
}