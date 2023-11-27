package com.example.travelguideaiv21.home.domain

interface HomeRepository {
    suspend fun getTravelGuide(location: String, settings: HomeFilterSettings) : Result<String>
}