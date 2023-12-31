package com.example.travelguideaiv21.home.presentacion.components

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Tune
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeFilterButton(onClick: () -> Unit,
                     modifier: Modifier=Modifier
                     ){
    IconButton(onClick =onClick,
        modifier = modifier.background(
            color = Color.LightGray, shape = RoundedCornerShape(8.dp)
        )) {
        Icon(imageVector = Icons.Default.Tune, contentDescription = "Filter",
                tint = Color.Gray
            )
        
    }
}

@Preview
@Composable
fun HomeFilterButtonPreview(){
    HomeFilterButton(onClick = { })
}