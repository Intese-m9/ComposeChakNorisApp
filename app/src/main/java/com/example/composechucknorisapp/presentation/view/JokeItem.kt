package com.example.composechucknorisapp.presentation.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composechucknorisapp.data.model.ChuckNorisApi

@Composable
fun JokeCard(
    joke: ChuckNorisApi,
    retryAction: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier
                .padding(4.dp)
                .wrapContentHeight()
                .wrapContentWidth()
        ) {
            Text(text = joke.value)
        }
        Button(
            onClick = retryAction,
            modifier = Modifier
        ) {
            Text(text = "Новая шутка")
        }
    }
}