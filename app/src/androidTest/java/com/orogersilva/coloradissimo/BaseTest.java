package com.orogersilva.coloradissimo;

import android.support.test.InstrumentationRegistry;
import android.test.AndroidTestCase;

import com.orogersilva.coloradissimo.di.component.DaggerTestComponent;
import com.orogersilva.coloradissimo.di.component.TestComponent;
import com.orogersilva.coloradissimo.di.module.TestPersistenceModule;

import org.junit.After;
import org.junit.Before;

/**
 * Created by orogersilva on 2/2/2016.
 */
public class BaseTest extends AndroidTestCase {

    // region FIELDS

    private ColoradissimoApp mApp;
    private TestComponent mTestComponent;

    // endregion

    // region SETUP

    @Before
    public final void setupBaseTest() throws Exception {

        super.setUp();

        mApp = (ColoradissimoApp) InstrumentationRegistry
                .getTargetContext().getApplicationContext();

        mTestComponent = DaggerTestComponent.builder()
                .testPersistenceModule(new TestPersistenceModule(mApp))
                .build();

        mApp.setTestComponent(mTestComponent);
    }

    // endregion

    // region GETTERS AND SETTERS

    protected TestComponent getTestComponent() {

        return mTestComponent;
    }

    // endregion

    // region TEARDOWN

    @After
    public void teardown() throws Exception {

        mApp = null;
    }

    // endregion
}
