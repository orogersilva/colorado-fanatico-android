package com.orogersilva.coloradofanatico.model;

import android.database.sqlite.SQLiteDatabase;

import com.orogersilva.coloradofanatico.ColoradoFanaticoApp;
import com.orogersilva.coloradofanatico.di.component.AppComponent;

/**
 * Created by orogersilva on 1/30/2016.
 */
public class BaseModel {

    // region FIELDS

    protected final SQLiteDatabase mSQLiteDatabase;
    protected final AppComponent mAppComponent;

    // endregion

    // region CONSTRUCTORS

    public BaseModel(ColoradoFanaticoApp app, SQLiteDatabase database) {
        mAppComponent = app.getAppComponent();
        mSQLiteDatabase = database;
    }

    // endregion
}
