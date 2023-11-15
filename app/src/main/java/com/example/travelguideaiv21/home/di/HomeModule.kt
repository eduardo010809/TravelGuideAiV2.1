package com.example.travelguideaiv21.home.di

import com.example.travelguideaiv21.home.data.HomeRepositoryImpl
import com.example.travelguideaiv21.home.data.remote.ApiKeyInterceptor
import com.example.travelguideaiv21.home.data.remote.ChatGptApi
import com.example.travelguideaiv21.home.domain.HomeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module


object HomeModule {
    @Singleton
    @Provides
    fun provideApi():ChatGptApi{
        return Retrofit.Builder().baseUrl(ChatGptApi.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create()).client(OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor())
                .addInterceptor(ApiKeyInterceptor()).build()
            ).build().create()
        
    }
    @Singleton
    @Provides
    fun provideRepository(api : ChatGptApi): HomeRepository{
        return HomeRepositoryImpl(api)
    }

}