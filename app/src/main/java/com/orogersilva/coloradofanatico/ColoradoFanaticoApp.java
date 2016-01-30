package com.orogersilva.coloradofanatico;

import android.app.Application;

import com.orogersilva.coloradofanatico.di.component.AppComponent;

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
    }

    // endregion

    // region GETTERS AND SETTERS

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    // endregion
}
