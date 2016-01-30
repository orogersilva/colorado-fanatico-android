package com.orogersilva.coloradofanatico.model;

import com.orogersilva.coloradofanatico.ColoradoFanaticoApp;
import com.orogersilva.coloradofanatico.di.component.AppComponent;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by orogersilva on 1/30/2016.
 */
public class Model {

    // region FIELDS

    protected final AppComponent mAppComponent;
    protected final ColoradoFanaticoDatabase mDatabase;

    // endregion

    // region CONSTRUCTORS

    public Model(ColoradoFanaticoApp app, ColoradoFanaticoDatabase database) {

        mAppComponent = app.getAppComponent();
        mDatabase = database;
    }

    // endregion
}
