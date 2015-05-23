package com.chanweather.model;

/**
 * Created by 李嘉诚 on 2015/5/23.
 * 最后修改时间: 2015/5/23
 */
public class City {
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private int m_id;
    private String m_cityName;
    private String m_cityCode;
    private int m_provinceId;
    ////////////////////////////////////////////////////////////////////////////////////////////////

    public int getId() { return m_id; }
    public String getCityName() { return m_cityName; }
    public String getCityCode() { return m_cityCode; }
    public int getProvinceId() { return m_provinceId; }


    public void setId(int id) { m_id = id; }
    public void setCityName(String cityName) { m_cityName = cityName; }
    public void setCityCode(String cityCode) { m_cityCode = cityCode; }
    public void setProvinceId(int provinceId) { m_provinceId = provinceId; }
}
