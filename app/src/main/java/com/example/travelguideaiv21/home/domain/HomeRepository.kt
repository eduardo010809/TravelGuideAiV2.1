package com.example.travelguideaiv21.home.domain

import com.example.travelguideaiv21.home.domain.model.HomeFilterSettings
import com.example.travelguideaiv21.home.domain.model.Places

interface HomeRepository {
    suspend fun getTravelGuide(location: String, settings: HomeFilterSettings) : Result<String>

    suspend fun getPopularPlaces() : Result<List<Places>>
}