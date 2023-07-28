package com.example.composechucknorisapp.presentation.view

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composechucknorisapp.data.model.ChuckNorisApi

@Composable
fun JokeCard(
    joke: ChuckNorisApi
) {
    Card(
        modifier = Modifier
            .padding(4.dp)
            .requiredHeight(120.dp)
            .wrapContentWidth()
    ) {
        Text(text = joke.value)
    }
}