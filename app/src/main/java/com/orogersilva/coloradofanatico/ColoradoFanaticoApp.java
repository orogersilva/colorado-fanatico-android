package com.orogersilva.coloradofanatico;

import android.app.Application;

import com.orogersilva.coloradofanatico.di.component.AppComponent;
import com.orogersilva.coloradofanatico.di.component.DaggerAppComponent;
import com.orogersilva.coloradofanatico.di.module.DatabaseModule;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by orogersilva on 1/30/2016.
 */
public class ColoradoFanaticoApp extends Application {

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
                .databaseModule(new DatabaseModule(this))
                .build();
    }

    // endregion

    // region GETTERS AND SETTERS

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    // endregion
}
