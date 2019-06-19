package com.forzotechlabs.noteappmvvm.Utils;

import android.app.Activity;
import android.content.Context;

import com.google.android.material.snackbar.Snackbar;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Utils {

    public Context context;

    @Inject
    public Utils(Context context) {
        this.context = context;
    }

    public void showSnackbar(Activity context, String message){
        Snackbar snackbar = Snackbar.make(context.findViewById(android.R.id.content), message,
                Snackbar.LENGTH_LONG);
        snackbar.show();
    }

}