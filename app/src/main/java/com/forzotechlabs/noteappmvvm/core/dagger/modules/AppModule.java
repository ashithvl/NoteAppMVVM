package com.forzotechlabs.noteappmvvm.core.dagger.modules;

import android.content.Context;

import com.forzotechlabs.noteappmvvm.core.data.MainAppDataSource;
import com.forzotechlabs.noteappmvvm.core.data.local.LocalData;
import com.forzotechlabs.noteappmvvm.core.data.remote.RemoteData;
import com.forzotechlabs.noteappmvvm.MainApplication;
import com.forzotechlabs.noteappmvvm.utils.Utils;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Singleton
    @Provides
    Context provideContext(MainApplication application) {
        return application;
    }

    @Singleton
    @Provides
    MainAppDataSource provideMainAppStore(RemoteData remoteData, LocalData localData){
        return new MainAppDataSource(remoteData, localData);
    }

    @Singleton
    @Provides
    Gson provideGson(){
        return new Gson();
    }

    @Singleton
    @Provides
    Utils provideUtils(Context context) {
        return new Utils(context);
    }

}
