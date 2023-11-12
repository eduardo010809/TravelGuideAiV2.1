package com.example.travelguideaiv21.home.domain

interface HomeRepository {
    suspend fun getTravelGuide() : Result<String>
}