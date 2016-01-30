package com.orogersilva.coloradofanatico.model;

import com.orogersilva.coloradofanatico.ColoradoFanaticoApp;
import com.orogersilva.coloradofanatico.di.component.AppComponent;

import io.realm.Realm;

/**
 * Created by orogersilva on 1/30/2016.
 */
public class BaseModel {

    // region FIELDS

    protected final Realm mRealm;
    protected final AppComponent mAppComponent;

    // endregion

    // region CONSTRUCTORS

    public BaseModel(ColoradoFanaticoApp app, Realm realm) {

        mRealm = realm;
        mAppComponent = app.getAppComponent();
    }

    // endregion
}
