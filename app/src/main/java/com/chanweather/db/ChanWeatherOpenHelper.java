package com.chanweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 李嘉诚 on 2015/5/23.
 * 最后修改时间: 2015/5/23
 */
public class ChanWeatherOpenHelper extends SQLiteOpenHelper {
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String s_createProvince =
            "create table Province( " +
            "id integer primary key autoincrement," +
            "province_name text," +
            "province_code text)";

    private static final String s_createCity =
            "create table city(" +
            "id integer primary key autoincrement," +
            "city_name text," +
            "city_code text," +
            "province_id integer)";

    private static final String s_createCounty =
            "create table county(" +
            "id integer primary key autoincrement," +
            "county_name text," +
            "county_code text," +
            "city_id integer)";
    ////////////////////////////////////////////////////////////////////////////////////////////////

    public ChanWeatherOpenHelper(Context context,
                                 String name,
                                 SQLiteDatabase.CursorFactory factory,
                                 int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(s_createProvince);
        db.execSQL(s_createCity);
        db.execSQL(s_createCounty);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
