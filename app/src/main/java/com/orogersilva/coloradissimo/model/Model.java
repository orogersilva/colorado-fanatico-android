package com.orogersilva.coloradissimo.model;

import com.orogersilva.coloradissimo.ColoradissimoApp;
import com.orogersilva.coloradissimo.di.component.AppComponent;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

/**
 * Created by orogersilva on 1/30/2016.
 */
public class Model {

    // region FIELDS

    protected final AppComponent mAppComponent;
    protected final DatabaseWrapper mDatabase;

    // endregion

    // region CONSTRUCTORS

    public Model(ColoradissimoApp app, DatabaseWrapper database) {

        mAppComponent = app.getAppComponent();
        mDatabase = database;
    }

    // endregion
}
