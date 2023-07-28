package com.example.composechucknorisapp.presentation.view

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composechucknorisapp.data.model.ChuckNorisApi

const val ZERO = 0
@Composable
fun JokeCard(
    joke: List<ChuckNorisApi>
) {
    Card(
        modifier = Modifier
            .padding(4.dp)
            .requiredHeight(120.dp)
            .requiredWidth(120.dp)
    ) {
        joke[ZERO].value
    }
}