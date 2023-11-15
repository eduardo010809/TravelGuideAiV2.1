package com.example.travelguideaiv21.home.presentacion

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.travelguideaiv21.home.presentacion.components.HomeFilterButton
import com.example.travelguideaiv21.home.presentacion.components.HomeFilterDialog
import com.example.travelguideaiv21.home.presentacion.components.HomeSearchBar
import com.example.travelguideaiv21.home.presentacion.components.HomeSearchBarPreview

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()){
    val state = viewModel.state
    if (state.showdialog){
        HomeFilterDialog()
    }

    Column( modifier = Modifier.fillMaxSize()){
        Text(text="¿A donde viajas?")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment  = Alignment.CenterVertically
        ){}
        HomeSearchBar(onSearch = {
                                 viewModel.search()
        }, placeholder = "Pais, Ciudad",
            inputText = state.searchtext, onValueChange = {viewModel.onSearchTextChange(it) },
            modifier = Modifier.fillMaxWidth())
        HomeFilterButton(onClick = { viewModel.onFilterClick() })
    }

}