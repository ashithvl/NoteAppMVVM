package com.forzotechlabs.noteappmvvm.Utils;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/**
 *
 * To pass value from repository constructor we need
 * ViewModelProvider Factory
 *
 * **/
public class ViewModelProviderFactory<V> implements ViewModelProvider.Factory {

    private V viewModel;

    public ViewModelProviderFactory(V viewModel) {
        this.viewModel = viewModel;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(viewModel.getClass())) {
            return (T) viewModel;
        }
        throw new IllegalArgumentException("Unknown class name");
    }
}