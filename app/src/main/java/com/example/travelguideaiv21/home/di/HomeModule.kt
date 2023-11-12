package com.example.travelguideaiv21.home.di

import com.example.travelguideaiv21.home.data.remote.ChatGptApi
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

@InstallIn(SingletonComponent::class)
@Module


object HomeModule {
    fun provideApi():ChatGptApi{
        return Retrofit.Builder().baseUrl(ChatGptApi.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create()).client(OkHttpClient.Builder().addInterceptor(HttpLoggingInterceptor()).build()
            ).build().create()
        
    }
}