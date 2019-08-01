package com.forzotechlabs.noteappmvvm.core.data.local;

import com.forzotechlabs.noteappmvvm.utils.PrefManager;

import javax.inject.Inject;

public class LocalData {

    private PrefManager prefManager;

    @Inject
    public LocalData(PrefManager manager){
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
