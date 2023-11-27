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
            repository.getTravelGuide(state.searchtext,
                state.filterSettings).onSuccess {
                println(it)
            }.onFailure {
                println("hubo un error")
            }

        }
    }

    fun onFilterDismiss(){

        state = state.copy(
            showdialog = false,
            filterSettings = state.filterSettingsBackup
            )
    }

    fun onSettingsChange(action: HomeFilterDialogAction){
        when (action){
            HomeFilterDialogAction.OnApplyClick -> {
                state = state.copy(
                    filterSettingsBackup = state.filterSettings,
                    showdialog = false
                )
            }
                HomeFilterDialogAction.OnBaresClick -> {
                    state = state.copy(
                        filterSettings = state.filterSettings.copy(
                            Bares = !state.filterSettings.Bares
                        )
                    )
                }
                HomeFilterDialogAction.OnDiscotecasClick ->{
                    state = state.copy(
                        filterSettings = state.filterSettings.copy(
                            Bares = !state.filterSettings.Discotecas
                        )
                    )
                }
                HomeFilterDialogAction.OnPeopleMin -> {
                    state = state.copy(
                        filterSettings = state.filterSettings.copy(
                            people = state.filterSettings.people + 1
                        )
                    )
                }
                HomeFilterDialogAction.OnPeoplePlus -> {
                    state = state.copy(
                        filterSettings = state.filterSettings.copy(
                           people = state.filterSettings.people - 1
                        )
                    )
                }

            else -> {}
        }
    }
    fun onFilterClick()
    {
        state = state.copy(
            showdialog = true
        )
    }
}

