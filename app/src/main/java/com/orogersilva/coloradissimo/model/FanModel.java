package com.orogersilva.coloradissimo.model;

import android.database.sqlite.SQLiteDatabase;

import com.orogersilva.coloradissimo.ColoradissimoApp;
import com.orogersilva.coloradissimo.vo.Fan;
import com.orogersilva.coloradissimo.vo.Fan_Table;

import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

/**
 * Created by orogersilva on 1/30/2016.
 */
public class FanModel extends Model {

    // region CONSTRUCTORS

    public FanModel(ColoradissimoApp app, DatabaseWrapper database) {

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
