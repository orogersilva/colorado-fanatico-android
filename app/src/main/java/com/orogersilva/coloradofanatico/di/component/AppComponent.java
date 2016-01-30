package com.orogersilva.coloradofanatico.di.component;

import com.orogersilva.coloradofanatico.di.module.DatabaseModule;
import com.orogersilva.coloradofanatico.model.FanModel;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by orogersilva on 1/30/2016.
 */
@Singleton
@Component(modules = {DatabaseModule.class})
public interface AppComponent {

    // region INJECTORS

    void inject(FanModel fanModel);

    // endregion
}
