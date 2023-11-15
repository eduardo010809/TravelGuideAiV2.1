package com.example.travelguideaiv21.home.data.remote

import com.example.travelguideaiv21.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
            val requeest = chain.request().newBuilder()
        requeest.addHeader("Authorization", "Bareer ${BuildConfig.API_KEY}")
        return chain.proceed(requeest.build())    }

}