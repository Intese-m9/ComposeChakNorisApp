package com.example.composechucknorisapp.presentation.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.composechucknorisapp.presentation.viewmodel.ChuckUiState

@Composable
fun HomeScreen(
    chuckUiState: ChuckUiState,
    retryAction: () -> Unit,
    modifier: Modifier
){
when (chuckUiState){
    is ChuckUiState.Loading -> LoadingScreen()
    is ChuckUiState.Success -> JokeCard(joke = chuckUiState.listChuck)
    is ChuckUiState.Error -> ErrorScreen(retryAction)
}
}