package com.orogersilva.coloradissimo.di.component;

import com.orogersilva.coloradissimo.di.module.PersistenceModule;
import com.orogersilva.coloradissimo.model.FanModel;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by orogersilva on 1/30/2016.
 */
@Singleton
@Component(modules = {PersistenceModule.class})
public interface AppComponent {

    // region INJECTORS

    void inject(FanModel fanModel);

    // endregion
}
