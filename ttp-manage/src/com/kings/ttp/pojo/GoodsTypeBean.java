package com.kings.ttp.pojo;

public class GoodsTypeBean {
    private String typeNum;

    private String typeName;

    private String typeMemo;

    public String getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(String typeNum) {
        this.typeNum = typeNum == null ? null : typeNum.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeMemo() {
        return typeMemo;
    }

    public void setTypeMemo(String typeMemo) {
        this.typeMemo = typeMemo == null ? null : typeMemo.trim();
    }
}