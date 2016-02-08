package com.orogersilva.coloradissimo.vo;

import com.orogersilva.coloradissimo.exception.ValidationFailedException;
import com.orogersilva.coloradissimo.interfaces.Validation;
import com.orogersilva.coloradissimo.model.ColoradissimoDatabase;
import com.orogersilva.coloradissimo.util.StringUtils;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by orogersilva on 1/30/2016.
 */
@Table(database = ColoradissimoDatabase.class)
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
