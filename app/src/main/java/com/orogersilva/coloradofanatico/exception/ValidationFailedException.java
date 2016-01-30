package com.orogersilva.coloradofanatico.exception;

/**
 * Created by orogersilva on 1/30/2016.
 */
public class ValidationFailedException extends RuntimeException {

    // region CONSTRUCTORS

    public ValidationFailedException(String detailMessage) {

        super(detailMessage);
    }

    // endregion
}
