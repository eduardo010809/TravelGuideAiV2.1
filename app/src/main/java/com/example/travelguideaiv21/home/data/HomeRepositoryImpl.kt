package com.example.travelguideaiv21.home.data

import com.example.travelguideaiv21.home.data.remote.ChatGptApi
import com.example.travelguideaiv21.home.data.remote.dto.ChatRequestDto
import com.example.travelguideaiv21.home.domain.HomeFilterSettings
import com.example.travelguideaiv21.home.domain.HomeRepository

class HomeRepositoryImpl (private val api: ChatGptApi): HomeRepository{
    override suspend fun getTravelGuide(location: String, settings: HomeFilterSettings): Result<String> {
        return try {
            var places = ""
            if(settings.Bares) places += "Bares, "
            if (settings.Discotecas) places += "Discotecas, "
            val placesToVisit = if (places.isNotEmpty())"y quiero vistar: $places" else ""

            val request = ChatRequestDto(
                maxTokens = 1500,
                model = "text-davinci-003",
                prompt = "Soy un guia de viaje. Te voy a dar mi ubicación, y me vas a sugerir lugares para visitar cerca. También te voy a dar los tipos de lugares que quiero visitar. Aparte, quiero que me sugieran lugares de un tipo similar a los que te mencione que están cerca de mi primera ubicación. Estoy en $location $placesToVisit. Dame los precios de cada lugar en Pesos Mexicanos. Ordenalos por tipo de lugar",
                temperature = 0.7
            )
            val information = api.getTravelInformation(request)
            Result.success(information.choices.first().text)
        }
        catch (e: Exception){
            Result.failure(e)
        }
    }
}