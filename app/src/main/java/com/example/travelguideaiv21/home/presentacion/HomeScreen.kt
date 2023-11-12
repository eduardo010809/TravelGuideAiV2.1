package com.example.travelguideaiv21.home.presentacion

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.travelguideaiv21.home.presentacion.components.HomeSearchBar
import com.example.travelguideaiv21.home.presentacion.components.HomeSearchBarPreview

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()){
    Column( modifier = Modifier.fillMaxSize()){
        Text(text="¿A donde viajas?")
        HomeScreen()
    }

}