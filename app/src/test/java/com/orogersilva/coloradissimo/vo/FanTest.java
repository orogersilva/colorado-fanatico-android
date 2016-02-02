package com.orogersilva.coloradissimo.vo;

import android.test.suitebuilder.annotation.SmallTest;

import com.orogersilva.coloradissimo.exception.ValidationFailedException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by orogersilva on 1/30/2016.
 */
@SmallTest
public class FanTest {

    // region FIELDS

    private Fan mFan;

    // endregion

    // region SETUP

    @Before
    public void setup() {

        mFan = new Fan();
    }

    // endregion

    // region TEST METHODS

    @Test(expected = ValidationFailedException.class)
    public void validate_whenUsernameIsNull_throwsValidationFailedException() {

        // ARRANGE

        final String EXPECTED_EXCEPTION_MESSAGE = "Invalid username";
        final String TEST_ERROR_MESSAGE = "ValidationFailedException would must has been thrown.";

        final String NULL_USER_NAME = null;

        mFan.setUsername(NULL_USER_NAME);

        // ACT/ASSERT

        try {

            mFan.validate();

        } catch (ValidationFailedException e) {

            assertEquals(EXPECTED_EXCEPTION_MESSAGE, e.getMessage());

            throw e;
        }

        fail(TEST_ERROR_MESSAGE);
    }

    @Test(expected = ValidationFailedException.class)
    public void validate_whenUsernameIsEmpty_throwsValidationFailedException() {

        // ARRANGE
        final String EXPECTED_EXCEPTION_MESSAGE = "Invalid username";
        final String TEST_ERROR_MESSAGE = "ValidationFailedException would must has been thrown.";

        final String EMPTY_USER_NAME = null;

        mFan.setUsername(EMPTY_USER_NAME);

        // ACT/ASSERT

        try {

            mFan.validate();

        } catch (ValidationFailedException e) {

            assertEquals(EXPECTED_EXCEPTION_MESSAGE, e.getMessage());

            throw e;
        }

        fail(TEST_ERROR_MESSAGE);
    }

    @Test
    public void validate_whenUsernameIsValid_validationIsSuccessfully() {

        // ARRANGE
        final String VALID_USER_NAME = "orogersilva";

        mFan.setUsername(VALID_USER_NAME);

        // ACT/ASSERT
        mFan.validate();
    }

    // endregion

    // region TEARDOWN

    @After
    public void teardown() {

        mFan = null;
    }

    // endregion
}
