package com.kings.ttp.pojo;

public class SystemParamBean {
    private String csbm;

    private String csmc;

    private String csz;

    private String bz;

    public String getCsbm() {
        return csbm;
    }

    public void setCsbm(String csbm) {
        this.csbm = csbm == null ? null : csbm.trim();
    }

    public String getCsmc() {
        return csmc;
    }

    public void setCsmc(String csmc) {
        this.csmc = csmc == null ? null : csmc.trim();
    }

    public String getCsz() {
        return csz;
    }

    public void setCsz(String csz) {
        this.csz = csz == null ? null : csz.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }
}