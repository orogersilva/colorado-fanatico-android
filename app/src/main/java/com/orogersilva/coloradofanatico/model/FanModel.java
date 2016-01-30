package com.orogersilva.coloradofanatico.model;

import com.orogersilva.coloradofanatico.ColoradoFanaticoApp;
import com.orogersilva.coloradofanatico.vo.Fan;
import com.orogersilva.coloradofanatico.vo.Fan_Table;

import com.raizlabs.android.dbflow.sql.language.SQLite;

/**
 * Created by orogersilva on 1/30/2016.
 */
public class FanModel extends Model {

    // region CONSTRUCTORS

    public FanModel(ColoradoFanaticoApp app, ColoradoFanaticoDatabase database) {

        super(app, database);
    }

    // endregion

    // region CRUD

    public Fan retrieveFan(String username) {

        Fan fan = SQLite.select()
                .from(Fan.class)
                .where(Fan_Table.username.eq(username))
                .querySingle();

        return fan;
    }

    // endregion
}
