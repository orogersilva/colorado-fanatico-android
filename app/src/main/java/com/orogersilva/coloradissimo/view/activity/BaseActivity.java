package com.orogersilva.coloradissimo.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.orogersilva.coloradissimo.ColoradissimoApp;
import com.orogersilva.coloradissimo.di.component.ActivityComponent;
import com.orogersilva.coloradissimo.di.component.DaggerActivityComponent;

/**
 * Created by orogersilva on 2/1/2016.
 */
public class BaseActivity extends AppCompatActivity {

    // region FIELDS

    private ActivityComponent mActivityComponent;

    // endregion

    // region ACTIVITY LIFECYCLE METHODS

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        mActivityComponent = DaggerActivityComponent.builder()
                .appComponent(getApp().getAppComponent())
                .build();
    }

    @Override
    protected void onStart() {

        super.onStart();
    }

    @Override
    protected void onStop() {

        super.onStop();
    }

    // endregion

    // region GETTERS AND SETTERS

    protected ActivityComponent getActivityComponent() {

        return mActivityComponent;
    }

    protected ColoradissimoApp getApp() {

        return (ColoradissimoApp) getApplicationContext();
    }

    // endregion
}
