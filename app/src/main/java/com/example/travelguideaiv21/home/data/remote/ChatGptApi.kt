package com.example.travelguideaiv21.home.data.remote

import com.example.travelguideaiv21.home.data.remote.dto.ChatResponseDto
import retrofit2.http.POST

interface ChatGptApi {
    companion object {
        const val BASE_URL = "https://api.openai.com/v1/"

    }
    @POST("completions")
    suspend fun getTravelInformation() : ChatResponseDto
}