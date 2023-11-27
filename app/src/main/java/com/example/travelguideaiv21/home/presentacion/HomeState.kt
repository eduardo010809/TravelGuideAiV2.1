package com.example.travelguideaiv21.home.presentacion

import com.example.travelguideaiv21.home.domain.HomeFilterSettings

data class HomeState (
    val searchtext: String = "",
    val showdialog: Boolean = false,
    val filterSettings: HomeFilterSettings = HomeFilterSettings(),
    val filterSettingsBackup: HomeFilterSettings = filterSettings
)