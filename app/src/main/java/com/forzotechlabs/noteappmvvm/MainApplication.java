package com.forzotechlabs.noteappmvvm;

import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.core.CrashlyticsCore;
import com.forzotechlabs.noteappmvvm.core.dagger.components.DaggerMainComponent;
import com.forzotechlabs.noteappmvvm.utils.error.ReleaseTree;

import net.danlew.android.joda.JodaTimeAndroid;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import io.fabric.sdk.android.Fabric;
import timber.log.Timber;

public class MainApplication extends DaggerApplication {

    private static MainApplication instance;

    public static synchronized MainApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        JodaTimeAndroid.init(this);

        Fabric.with(this, new Crashlytics.Builder()
                .core(new CrashlyticsCore.Builder()
                        .disabled(BuildConfig.DEBUG)
                        .build())
                .build());

        if (BuildConfig.DEBUG)
            Timber.plant(new Timber.DebugTree());
        else
            Timber.plant(new ReleaseTree());

    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerMainComponent.builder().application(this).build();
    }

}
