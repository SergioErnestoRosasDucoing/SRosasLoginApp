package com.example.loginapp.components

import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun AuthFooter(
    text: String,
    actionText: String,
    onAction: () -> Unit,
    modifier: Modifier = Modifier
) {
    TextButton(onClick = onAction, modifier = modifier) {
        Text(text = "$text $actionText", color = Color.Black)
    }
}