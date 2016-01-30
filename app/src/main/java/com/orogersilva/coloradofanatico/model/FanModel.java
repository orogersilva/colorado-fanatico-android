package com.orogersilva.coloradofanatico.model;

import android.content.Context;

import com.orogersilva.coloradofanatico.ColoradoFanaticoApp;
import com.orogersilva.coloradofanatico.vo.Fan;

import io.realm.Realm;

/**
 * Created by orogersilva on 1/30/2016.
 */
public class FanModel extends BaseModel {

    // region FIELDS

    private Context mContext;

    // endregion

    // region CONSTRUCTORS

    public FanModel(ColoradoFanaticoApp app, Realm realm) {

        super(app, realm);
    }

    // endregion

    // region CRUD

    public void createFan(Fan fan) {

        mRealm.beginTransaction();
        mRealm.copyToRealm(fan);
        mRealm.commitTransaction();
    }

    public Fan retrieveFan(String username) {

        Fan fan = mRealm.where(Fan.class).equalTo("username", username).findFirst();

        return fan;
    }

    // endregion
}
