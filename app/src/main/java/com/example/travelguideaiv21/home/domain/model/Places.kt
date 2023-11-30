package com.example.travelguideaiv21.home.domain.model

data class Places(
    val country : String,
    val city : String,
    val region: Region,
    val image: String
)
enum class Region{
    TODAS,
    AMERICA,
    ASIA,
    EUROPA,
    OCEANIA

}
