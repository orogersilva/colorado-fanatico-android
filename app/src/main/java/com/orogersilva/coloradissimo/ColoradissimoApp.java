package com.orogersilva.coloradissimo;

import android.app.Application;
import android.support.annotation.VisibleForTesting;

import com.orogersilva.coloradissimo.di.component.AppComponent;
import com.orogersilva.coloradissimo.di.component.DaggerAppComponent;
import com.orogersilva.coloradissimo.di.module.PersistenceModule;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by orogersilva on 1/30/2016.
 */
public class ColoradissimoApp extends Application {

    // region FIELDS

    private AppComponent mAppComponent;

    // endregion

    // region OVERRIDED METHODS

    @Override
    public void onCreate() {

        super.onCreate();

        // Initialing DBFlow...
        FlowManager.init(this);

        // Initialing Dagger...
        mAppComponent = DaggerAppComponent.builder()
                .persistenceModule(new PersistenceModule(this))
                .build();
    }

    // endregion

    // region GETTERS AND SETTERS

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    @VisibleForTesting
    public void setTestComponent(AppComponent appComponent) {

        mAppComponent = appComponent;
    }

    // endregion
}
