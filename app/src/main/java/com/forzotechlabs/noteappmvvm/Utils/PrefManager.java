package com.forzotechlabs.noteappmvvm.Utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import javax.inject.Inject;

public class PrefManager {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private Gson gson;

    @Inject
    public PrefManager(Context context, Gson gson) {
        this.gson = gson;
        sharedPreferences = context.getSharedPreferences(Constants.PREF_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.apply();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(Constants.IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return sharedPreferences.getBoolean(Constants.IS_FIRST_TIME_LAUNCH, true);
    }

    public boolean isLoggedIn(){
        return sharedPreferences.getBoolean(Constants.LOGGED_IN, false);
    }

    public void setLoggedIn(boolean isLoggedIn){
        editor.putBoolean(Constants.LOGGED_IN, isLoggedIn);
        editor.commit();
    }

}
