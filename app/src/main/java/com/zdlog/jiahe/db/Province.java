package com.zdlog.jiahe.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/23 0023.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;   //记录省的名字
    private int provinceCode;   //记录省的代号

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
