package com.forzotechlabs.noteappmvvm.Core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.forzotechlabs.noteappmvvm.Core.data.offline.OfflineStore;
import com.forzotechlabs.noteappmvvm.Core.data.online.OnlineStore;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MainAppStore {

    private OnlineStore onlineStore;
    private OfflineStore offlineStore;

    @Inject
    public MainAppStore(OnlineStore onlineStore, OfflineStore offlineStore){
        this.onlineStore = onlineStore;
        this.offlineStore = offlineStore;
    }

    public void setFirstTimeLaunch(){
        offlineStore.setFirstTimeLaunch();
    }

    public boolean isFirstTimeLaunch(){
        return offlineStore.isFirstTimeLaunch();
    }

    public boolean isLoggedIn(){
        return offlineStore.isLoggedIn();
    }

    public void setLoggedIn(boolean loggedIn){
        offlineStore.setLoggedIn(loggedIn);
    }


}
