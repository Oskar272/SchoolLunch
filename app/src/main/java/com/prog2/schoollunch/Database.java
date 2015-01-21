package com.prog2.schoollunch;

//package com.androidhive.androidsqlite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



/**
 * Created by peter.bergman on 2014-10-22.
 */

public class Database extends SQLiteOpenHelper {


    public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {

    }


    public Cursor getInfoSchool()
    {

        SQLiteDatabase db = this.getReadableDatabase();

        //Raw data
        Cursor dbCom = db.rawQuery("SELECT * FROM schools",null);

        //Returnera raw data
        return dbCom;

    }

}

