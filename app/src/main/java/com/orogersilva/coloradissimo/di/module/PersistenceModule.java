package com.orogersilva.coloradissimo.di.module;

import com.orogersilva.coloradissimo.ColoradissimoApp;
import com.orogersilva.coloradissimo.model.ColoradissimoDatabase;
import com.orogersilva.coloradissimo.model.FanModel;

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
    public FanModel provideFanModel(ColoradissimoDatabase database) {

        return new FanModel(mApp, database);
    }

    // endregion
}
