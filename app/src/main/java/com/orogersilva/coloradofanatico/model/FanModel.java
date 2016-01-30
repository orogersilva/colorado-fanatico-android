package com.orogersilva.coloradofanatico.model;

import android.database.sqlite.SQLiteDatabase;

import com.orogersilva.coloradofanatico.ColoradoFanaticoApp;

/**
 * Created by orogersilva on 1/30/2016.
 */
public class FanModel extends BaseModel {

    // region CONSTRUCTORS

    public FanModel(ColoradoFanaticoApp app, SQLiteDatabase database) {
        super(app, database);
    }

    // endregion


}
