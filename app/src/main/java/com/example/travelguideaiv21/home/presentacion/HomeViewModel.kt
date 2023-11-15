package com.example.travelguideaiv21.home.presentacion

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel

import com.example.travelguideaiv21.home.domain.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository : HomeRepository): ViewModel() {

    var state by mutableStateOf(HomeState())
    private set

    fun onSearchTextChange(newText: String){
        state = state.copy(
            searchtext = newText
        )
    }

    fun search() {

        viewModelScope.launch {
            repository.getTravelGuide(state.searchtext).onSuccess {
                println(it)
            }.onFailure {
                println("hubo un error")
            }

        }
    }

    fun onFilterClick()
    {
        state = state.copy(
            showdialog = true
        )
    }
}

