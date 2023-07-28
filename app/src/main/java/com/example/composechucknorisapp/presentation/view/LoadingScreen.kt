package com.example.composechucknorisapp.presentation.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun LoadingScreen(){
    Box(
        Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Загрузка"
        )
    }
}