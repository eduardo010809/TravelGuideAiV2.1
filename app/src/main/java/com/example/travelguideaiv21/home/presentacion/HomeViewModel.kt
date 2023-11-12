package com.example.travelguideaiv21.home.presentacion

import androidx.lifecycle.ViewModel
import com.example.travelguideaiv21.BuildConfig
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(): ViewModel() {
    init {
        println("Soy el home view model!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
    }
}