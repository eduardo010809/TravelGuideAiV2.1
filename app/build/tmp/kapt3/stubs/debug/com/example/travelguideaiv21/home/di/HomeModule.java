package com.example.travelguideaiv21.home.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/travelguideaiv21/home/di/HomeModule;", "", "()V", "provideApi", "Lcom/example/travelguideaiv21/home/data/remote/ChatGptApi;", "app_debug"})
@dagger.Module
public final class HomeModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.travelguideaiv21.home.di.HomeModule INSTANCE = null;
    
    private HomeModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.travelguideaiv21.home.data.remote.ChatGptApi provideApi() {
        return null;
    }
}