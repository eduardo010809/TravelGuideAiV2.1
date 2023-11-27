package com.example.travelguideaiv21.home.presentacion;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/example/travelguideaiv21/home/presentacion/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/travelguideaiv21/home/domain/HomeRepository;", "(Lcom/example/travelguideaiv21/home/domain/HomeRepository;)V", "<set-?>", "Lcom/example/travelguideaiv21/home/presentacion/HomeState;", "state", "getState", "()Lcom/example/travelguideaiv21/home/presentacion/HomeState;", "setState", "(Lcom/example/travelguideaiv21/home/presentacion/HomeState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "onFilterClick", "", "onFilterDismiss", "onSearchTextChange", "newText", "", "onSettingsChange", "action", "Lcom/example/travelguideaiv21/home/presentacion/HomeFilterDialogAction;", "search", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.travelguideaiv21.home.domain.HomeRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState state$delegate = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.example.travelguideaiv21.home.domain.HomeRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.travelguideaiv21.home.presentacion.HomeState getState() {
        return null;
    }
    
    private final void setState(com.example.travelguideaiv21.home.presentacion.HomeState p0) {
    }
    
    public final void onSearchTextChange(@org.jetbrains.annotations.NotNull
    java.lang.String newText) {
    }
    
    public final void search() {
    }
    
    public final void onFilterDismiss() {
    }
    
    public final void onSettingsChange(@org.jetbrains.annotations.NotNull
    com.example.travelguideaiv21.home.presentacion.HomeFilterDialogAction action) {
    }
    
    public final void onFilterClick() {
    }
}