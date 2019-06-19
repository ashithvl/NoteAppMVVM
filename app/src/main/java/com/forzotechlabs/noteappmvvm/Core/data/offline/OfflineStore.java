package com.forzotechlabs.noteappmvvm.Core.data.offline;

import com.forzotechlabs.noteappmvvm.Utils.PrefManager;

import javax.inject.Inject;

public class OfflineStore {

    private PrefManager prefManager;

    @Inject
    public OfflineStore(PrefManager manager){
        this.prefManager = manager;
    }

    public void setFirstTimeLaunch(){
        prefManager.setFirstTimeLaunch(false);
    }

    public boolean isFirstTimeLaunch(){
        return prefManager.isFirstTimeLaunch();
    }

    public boolean isLoggedIn(){
        return prefManager.isLoggedIn();
    }

    public void setLoggedIn(boolean loggedIn){
        prefManager.setLoggedIn(loggedIn);
    }
}
