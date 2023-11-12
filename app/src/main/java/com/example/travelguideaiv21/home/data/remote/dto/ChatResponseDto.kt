package com.example.travelguideaiv21.home.data.remote.dto


import com.squareup.moshi.Json

data class ChatResponseDto(
    @field:Json(name = "choices")
    val choices: List<Choice>,
    @field:Json(name = "created")
    val created: Int,
    @field:Json(name = "id")
    val id: String,
    @field:Json(name = "model")
    val model: String,
    @field:Json(name = "object")
    val objectX: String,
    @field:Json(name = "usage")
    val usage: Usage,
    @field:Json(name = "warning")
    val warning: String
)