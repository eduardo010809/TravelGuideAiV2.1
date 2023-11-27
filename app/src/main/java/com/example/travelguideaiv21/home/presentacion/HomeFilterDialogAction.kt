package com.example.travelguideaiv21.home.presentacion

sealed interface HomeFilterDialogAction{
    object OnApplyClick : HomeFilterDialogAction
    object OnBaresClick : HomeFilterDialogAction
    object OnDiscotecasClick : HomeFilterDialogAction
    object  OnPeople : HomeFilterDialogAction
    object OnPeopleMin : HomeFilterDialogAction
    object OnPeoplePlus: HomeFilterDialogAction
}