package com.chanweather.model;

/**
 * Created by 李嘉诚 on 2015/5/23.
 * 最后修改时间: 2015/5/23
 */
public class County {
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private int m_id;
    private String m_countyName;
    private String m_countyCode;
    private int m_cityId;
    ////////////////////////////////////////////////////////////////////////////////////////////////

    public int getId() { return m_id; }
    public String getCountyName() { return m_countyName; }
    public String getCountyCode() { return m_countyCode; }
    public int getCityId() { return m_cityId; }

    public void setId(int id) { m_id = id; }
    public void setCountyName(String countyName) { m_countyName = countyName; }
    public void setCountyCode(String countyCode) { m_countyCode = countyCode; }
    public void setCityId(int cityId) { m_cityId = cityId; }
}
