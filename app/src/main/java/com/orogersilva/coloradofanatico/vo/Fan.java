package com.orogersilva.coloradofanatico.vo;

import android.support.annotation.VisibleForTesting;

import com.orogersilva.coloradofanatico.exception.ValidationFailedException;
import com.orogersilva.coloradofanatico.interfaces.Validation;
import com.orogersilva.coloradofanatico.model.ColoradoFanaticoDatabase;
import com.orogersilva.coloradofanatico.util.StringUtils;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by orogersilva on 1/30/2016.
 */
@Table(database = ColoradoFanaticoDatabase.class)
public class Fan extends BaseModel implements Validation {

    // region FIELDS

    @PrimaryKey
    @Column
    String username;

    @Column
    String fullName;

    @Column
    int quantityCheckin;

    // endregion

    // region CONSTRUCTORS

    public Fan() {}

    public Fan(String username, String fullName, int quantityCheckin) {

        setUsername(username);
        setFullName(fullName);
        setQuantityCheckin(quantityCheckin);
    }

    // endregion

    // region GETTERS AND SETTERS

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public int getQuantityCheckin() {

        return quantityCheckin;
    }

    public void setQuantityCheckin(int quantityCheckin) {

        this.quantityCheckin = quantityCheckin;
    }

    // endregion

    // region VALIDATION METHODS

    @Override
    public void validate() {

        if (StringUtils.isNullOrEmpty(username)) {

            throw new ValidationFailedException("Invalid username");
        }
    }

    // endregion
}
