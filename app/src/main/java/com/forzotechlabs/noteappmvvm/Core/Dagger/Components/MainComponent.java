package com.forzotechlabs.noteappmvvm.Core.Dagger.Components;

import android.app.Application;

import com.forzotechlabs.noteappmvvm.Core.Dagger.Modules.AppModule;
import com.forzotechlabs.noteappmvvm.Core.Dagger.Modules.NetworkModule;
import com.forzotechlabs.noteappmvvm.MainApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class,
        AppModule.class,
        NetworkModule.class})
public interface MainComponent extends AndroidInjector<MainApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        MainComponent.Builder application(Application application);
        MainComponent build();
    }
}