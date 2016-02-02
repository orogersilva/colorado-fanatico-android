package com.orogersilva.coloradissimo.model;

import com.orogersilva.coloradissimo.ColoradissimoApp;
import com.orogersilva.coloradissimo.di.component.AppComponent;

/**
 * Created by orogersilva on 1/30/2016.
 */
public class Model {

    // region FIELDS

    protected final AppComponent mAppComponent;
    protected final ColoradissimoDatabase mDatabase;

    // endregion

    // region CONSTRUCTORS

    public Model(ColoradissimoApp app, ColoradissimoDatabase database) {

        mAppComponent = app.getAppComponent();
        mDatabase = database;
    }

    // endregion
}
