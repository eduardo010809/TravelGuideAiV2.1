package com.example.travelguideaiv21.home.presentacion.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomefilterSettingsButton(
    onClick: () -> Unit,
    icon:  ImageVector?,
    modifier: Modifier = Modifier
){
    OutlinedButton(onClick = onClick,
        modifier = modifier.defaultMinSize(ButtonDefaults.MinHeight, ButtonDefaults.MinHeight),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = Color.Transparent
        ),
        shape = RoundedCornerShape(10.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        if (icon != null){
            Icon(
            imageVector = icon, contentDescription = "icon",
            tint = Color.Green
        )}

    }
}
@Preview
@Composable
fun HomeFilterSettingsButtonPreview(){
    HomefilterSettingsButton({}, Icons.Default.Add )
}