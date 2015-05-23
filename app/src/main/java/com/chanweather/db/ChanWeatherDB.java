package com.chanweather.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.chanweather.model.City;
import com.chanweather.model.County;
import com.chanweather.model.Province;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 李嘉诚 on 2015/5/23.
 * 最后修改时间: 2015/5/23
 */
public class ChanWeatherDB {
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private static final String s_DBName = "chan_weather";
    private static final int    s_version = 1;
    private static ChanWeatherDB s_chanWeatherDB;
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private SQLiteDatabase m_db;
    ////////////////////////////////////////////////////////////////////////////////////////////////

    private ChanWeatherDB(Context context){

        ChanWeatherOpenHelper helper = new ChanWeatherOpenHelper(context,s_DBName,null,s_version);

        m_db = helper.getWritableDatabase();
    }

    public synchronized static ChanWeatherDB getInstance(Context context){
        if(s_chanWeatherDB == null)
            s_chanWeatherDB = new ChanWeatherDB(context);

        return s_chanWeatherDB;
    }

    public void saveProvince(Province province){

        ContentValues values = new ContentValues();
        values.put("province_name",province.getProvinceName());
        values.put("province_code",province.getProvinceCode());

        m_db.insert("Province",null,values);
    }

    public List<Province> loadProvinces(){
        List<Province> set = new ArrayList<Province>();

        Cursor cursor = m_db.query("Province",null,null,null,null,null,null);

        if(cursor.moveToFirst()){
            do{
                Province item = new Province();

                item.setId(cursor.getInt(cursor.getColumnIndex("id")));
                item.setProvinceName(cursor.getString(cursor.getColumnIndex("province_name")));
                item.setProvinceCode(cursor.getString(cursor.getColumnIndex("province_code")));

                set.add(item);
            }while (cursor.moveToNext());
        }

        return set;
    }

    public void saveCity(City city){

        ContentValues values = new ContentValues();

        values.put("city_name",city.getCityName());
        values.put("city_code",city.getCityCode());
        values.put("province_id",city.getProvinceId());

        m_db.insert("City",null,values);
    }

    public List<City> loadCities(){
        List<City> set = new ArrayList<City>();

        Cursor cursor = m_db.query("City",null,null,null,null,null,null);

        if(cursor.moveToFirst()){
            do{
                City item = new City();

                item.setId(cursor.getInt(cursor.getColumnIndex("id")));
                item.setCityName(cursor.getString(cursor.getColumnIndex("city_name")));
                item.setCityCode(cursor.getString(cursor.getColumnIndex("city_code")));
                item.setProvinceId(cursor.getInt(cursor.getColumnIndex("province_id")));

                set.add(item);
            }while (cursor.moveToNext());
        }

        return set;
    }

    public void saveCounty(County county){

        ContentValues values = new ContentValues();

        values.put("county_name",county.getCountyName());
        values.put("county_code",county.getCountyCode());
        values.put("city_id",county.getCityId());
    }

    public List<County> loadCounties(){
        List<County> set = new ArrayList<County>();

        Cursor cursor = m_db.query("County",null,null,null,null,null,null);

        if(cursor.moveToFirst()){
            do{
                County item = new County();

                item.setId(cursor.getInt(cursor.getColumnIndex("id")));
                item.setCountyName(cursor.getString(cursor.getColumnIndex("county_name")));
                item.setCountyCode(cursor.getString(cursor.getColumnIndex("county_code")));
                item.setCityId(cursor.getInt(cursor.getColumnIndex("city_id")));

                set.add(item);
            }while (cursor.moveToNext());
        }

        return set;
    }
}
