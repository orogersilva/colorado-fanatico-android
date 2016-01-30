package com.orogersilva.coloradofanatico.di.module;

import android.database.sqlite.SQLiteDatabase;

import com.orogersilva.coloradofanatico.ColoradoFanaticoApp;
import com.orogersilva.coloradofanatico.model.FanModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by orogersilva on 1/30/2016.
 */
@Module
public class DatabaseModule {

    // region FIELDS

    private final ColoradoFanaticoApp mApp;

    // endregion

    // region CONSTRUCTORS

    public DatabaseModule(ColoradoFanaticoApp app) {
        mApp = app;
    }

    // endregion

    // region PROVIDERS

    @Provides
    @Singleton
    public FanModel provideFanModel(SQLiteDatabase database) {
        return new FanModel(mApp, database);
    }

    // endregion
}
