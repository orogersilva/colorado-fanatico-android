package com.orogersilva.coloradofanatico.di.component;

import com.orogersilva.coloradofanatico.di.scope.ActivityScope;
import com.orogersilva.coloradofanatico.view.activity.MainActivity;

import dagger.Component;

/**
 * Created by orogersilva on 2/1/2016.
 */
@ActivityScope
@Component(dependencies = AppComponent.class)
public interface ActivityComponent extends AppComponent {

    // region INJECTORS

    void inject(MainActivity mainActivity);

    // endregion
}
