package com.orogersilva.coloradofanatico.vo;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by orogersilva on 1/30/2016.
 */
public class Fan extends RealmObject {

    // region FIELDS

    @PrimaryKey
    private String username;

    // endregion

    // region GETTERS AND SETTERS

    public String getUsername() {

        return username;
    }

    // endregion
}
