package com.example.travelguideaiv21.home.presentacion.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.travelguideaiv21.ui.theme.VerdeMeLaMuerde


@Composable
fun HomeSearchButton(
    icon: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier.background(color= VerdeMeLaMuerde , shape = CircleShape)
){
    IconButton(onClick = onClick, modifier = Modifier,) {
        Icon(imageVector = icon, contentDescription = "search", tint = Color.White)
    }
}
@Preview
@Composable
fun HomeSearchButtonPreview(){
    HomeSearchButton(icon = Icons.Default.Search, onClick = {})
}