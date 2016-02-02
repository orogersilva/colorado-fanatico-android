package com.orogersilva.coloradissimo.di.component;

import com.orogersilva.coloradissimo.di.module.TestPersistenceModule;
import com.orogersilva.coloradissimo.model.FanModelTest;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by orogersilva on 2/2/2016.
 */
@Singleton
@Component(modules = {TestPersistenceModule.class})
public interface TestComponent extends AppComponent {

    // region INJECTORS

    void inject(FanModelTest fanModelTest);

    // endregion
}
