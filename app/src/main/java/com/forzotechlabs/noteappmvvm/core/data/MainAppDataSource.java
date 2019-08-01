package com.forzotechlabs.noteappmvvm.core.data;

import com.forzotechlabs.noteappmvvm.core.data.local.LocalData;
import com.forzotechlabs.noteappmvvm.core.data.remote.RemoteData;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MainAppDataSource {

    private RemoteData remoteData;
    private LocalData localData;

    @Inject
    public MainAppDataSource(RemoteData remoteData, LocalData localData){
        this.remoteData = remoteData;
        this.localData = localData;
    }

    public void setFirstTimeLaunch(){
        localData.setFirstTimeLaunch();
    }

    public boolean isFirstTimeLaunch(){
        return localData.isFirstTimeLaunch();
    }

    public boolean isLoggedIn(){
        return localData.isLoggedIn();
    }

    public void setLoggedIn(boolean loggedIn){
        localData.setLoggedIn(loggedIn);
    }


}
