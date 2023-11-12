package com.example.travelguideaiv21.home.data.remote.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000eJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\fH\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003JU\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0006H\u00d6\u0001J\t\u0010&\u001a\u00020\bH\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lcom/example/travelguideaiv21/home/data/remote/dto/ChatResponseDto;", "", "choices", "", "Lcom/example/travelguideaiv21/home/data/remote/dto/Choice;", "created", "", "id", "", "model", "objectX", "usage", "Lcom/example/travelguideaiv21/home/data/remote/dto/Usage;", "warning", "(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/travelguideaiv21/home/data/remote/dto/Usage;Ljava/lang/String;)V", "getChoices", "()Ljava/util/List;", "getCreated", "()I", "getId", "()Ljava/lang/String;", "getModel", "getObjectX", "getUsage", "()Lcom/example/travelguideaiv21/home/data/remote/dto/Usage;", "getWarning", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class ChatResponseDto {
    @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "choices")
    private final java.util.List<com.example.travelguideaiv21.home.data.remote.dto.Choice> choices = null;
    @com.squareup.moshi.Json(name = "created")
    private final int created = 0;
    @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "id")
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "model")
    private final java.lang.String model = null;
    @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "object")
    private final java.lang.String objectX = null;
    @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "usage")
    private final com.example.travelguideaiv21.home.data.remote.dto.Usage usage = null;
    @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "warning")
    private final java.lang.String warning = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.travelguideaiv21.home.data.remote.dto.ChatResponseDto copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.travelguideaiv21.home.data.remote.dto.Choice> choices, int created, @org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.lang.String model, @org.jetbrains.annotations.NotNull
    java.lang.String objectX, @org.jetbrains.annotations.NotNull
    com.example.travelguideaiv21.home.data.remote.dto.Usage usage, @org.jetbrains.annotations.NotNull
    java.lang.String warning) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ChatResponseDto(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.travelguideaiv21.home.data.remote.dto.Choice> choices, int created, @org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.lang.String model, @org.jetbrains.annotations.NotNull
    java.lang.String objectX, @org.jetbrains.annotations.NotNull
    com.example.travelguideaiv21.home.data.remote.dto.Usage usage, @org.jetbrains.annotations.NotNull
    java.lang.String warning) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.travelguideaiv21.home.data.remote.dto.Choice> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.travelguideaiv21.home.data.remote.dto.Choice> getChoices() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getCreated() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getObjectX() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.travelguideaiv21.home.data.remote.dto.Usage component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.travelguideaiv21.home.data.remote.dto.Usage getUsage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWarning() {
        return null;
    }
}