package com.example.travelguideaiv21.home.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/example/travelguideaiv21/home/data/remote/ChatGptApi;", "", "getTravelInformation", "Lcom/example/travelguideaiv21/home/data/remote/dto/ChatResponseDto;", "body", "Lcom/example/travelguideaiv21/home/data/remote/dto/ChatRequestDto;", "(Lcom/example/travelguideaiv21/home/data/remote/dto/ChatRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface ChatGptApi {
    @org.jetbrains.annotations.NotNull
    public static final com.example.travelguideaiv21.home.data.remote.ChatGptApi.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "https://api.openai.com/v1/";
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "completions")
    public abstract java.lang.Object getTravelInformation(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.travelguideaiv21.home.data.remote.dto.ChatRequestDto body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.travelguideaiv21.home.data.remote.dto.ChatResponseDto> continuation);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/travelguideaiv21/home/data/remote/ChatGptApi$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String BASE_URL = "https://api.openai.com/v1/";
        
        private Companion() {
            super();
        }
    }
}