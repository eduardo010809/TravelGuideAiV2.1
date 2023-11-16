package com.example.travelguideaiv21.home.presentacion.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun HomefilterSettingsButton(
    onClick: () -> Unit,
    icon:  ImageVector,
    modifier: Modifier = Modifier
){
    OutlinedButton(onClick = onClick,
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = Color.Transparent
        )
    ) {
        Icon(
            imageVector = icon, contentDescription = "icon",
            tint = Color.Green
        )
    }
}