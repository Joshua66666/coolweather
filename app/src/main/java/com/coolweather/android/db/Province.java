package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Joshua on 2017/7/19.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getProvinceName(String provinceName){
        this.provinceName=provinceName;
    }

    public int getProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
