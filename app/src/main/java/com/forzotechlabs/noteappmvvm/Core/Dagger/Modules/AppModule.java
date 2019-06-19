package com.forzotechlabs.noteappmvvm.Core.Dagger.Modules;

import android.content.Context;

import com.forzotechlabs.noteappmvvm.Core.data.MainAppStore;
import com.forzotechlabs.noteappmvvm.Core.data.offline.OfflineStore;
import com.forzotechlabs.noteappmvvm.Core.data.online.OnlineStore;
import com.forzotechlabs.noteappmvvm.MainApplication;
import com.forzotechlabs.noteappmvvm.Utils.Utils;
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
    MainAppStore provideMainAppStore(OnlineStore onlineStore, OfflineStore offlineStore){
        return new MainAppStore(onlineStore, offlineStore);
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
