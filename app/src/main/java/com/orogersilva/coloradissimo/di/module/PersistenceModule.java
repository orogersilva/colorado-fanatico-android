package com.orogersilva.coloradissimo.di.module;

import android.database.sqlite.SQLiteDatabase;

import com.orogersilva.coloradissimo.ColoradissimoApp;
import com.orogersilva.coloradissimo.model.ColoradissimoDatabase;
import com.orogersilva.coloradissimo.model.FanModel;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by orogersilva on 1/30/2016.
 */
@Module
public class PersistenceModule {

    // region FIELDS

    private final ColoradissimoApp mApp;

    // endregion

    // region CONSTRUCTORS

    public PersistenceModule(ColoradissimoApp app) {

        mApp = app;
    }

    // endregion

    // region PROVIDERS

    @Provides
    @Singleton
    public DatabaseWrapper provideDatabase() {

        return FlowManager.getDatabase(ColoradissimoDatabase.NAME).getWritableDatabase();
    }

    @Provides
    @Singleton
    public FanModel provideFanModel(DatabaseWrapper database) {

        return new FanModel(mApp, database);
    }

    // endregion
}
