package com.example.travelguideaiv21.home.presentacion.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.migration.DisableInstallInCheck

@Composable
fun HomefilterCheckBox(
    onClick: () -> Unit,
    isChecked: Boolean,
    modifier: Modifier = Modifier
){
    val icon = if (isChecked) Icons.Default.Check else null
    HomefilterSettingsButton(onClick = onClick, icon = icon, modifier = modifier)
}

@Preview
@Composable
fun HomeFilterCheckBoxPreview(){
    HomefilterCheckBox({}, isChecked = true)
}