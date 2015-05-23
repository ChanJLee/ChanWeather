package com.chanweather.model;

/**
 * Created by 李嘉诚 on 2015/5/23.
 * 最后修改时间: 2015/5/23
 */
public class Province {
    ////////////////////////////////////////////////////////////////////////////////////////////////
    private int         m_id = 0;
    private String      m_provinceName = null;
    private String      m_provinceCode = null;
    ////////////////////////////////////////////////////////////////////////////////////////////////

    public int getId(){ return m_id; }
    public String getProvinceName() { return m_provinceName; }
    public String getProvinceCode() { return m_provinceCode; }


    public void setId(int id) { m_id = id; }
    public void setProvinceName(String provinceName) { m_provinceName = provinceName; }
    public void setProvinceCode(String provinceCode) { m_provinceCode = provinceCode; }
}
