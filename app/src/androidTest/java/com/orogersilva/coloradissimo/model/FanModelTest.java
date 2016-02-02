package com.orogersilva.coloradissimo.model;

import android.support.test.runner.AndroidJUnit4;

import com.orogersilva.coloradissimo.BaseTest;
import com.orogersilva.coloradissimo.vo.Fan;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

/**
 * Created by orogersilva on 2/2/2016.
 */
@RunWith(AndroidJUnit4.class)
public class FanModelTest extends BaseTest {

    // region FIELDS

    @Inject
    FanModel mFanModel;

    // endregion

    // region SETUP

    @Before
    public void setup() throws Exception {

        getTestComponent().inject(this);
    }

    // endregion

    // region TEST METHODS

    @Test
    public void retrieveFan_whenUsernameIsNull_returnNull() throws Exception {

        // ARRANGE

        final String NULL_USER_NAME = null;

        // ACT

        Fan fan = mFanModel.retrieveFan(NULL_USER_NAME);

        // ASSERT

        assertNull(fan);
    }

    // endregion

    // region TEARDOWN

    @After
    public void teardown() throws Exception {
    }

    // endregion
}
