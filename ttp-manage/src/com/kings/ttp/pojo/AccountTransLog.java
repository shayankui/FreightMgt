package com.kings.ttp.pojo;

public class AccountTransLog {
    private String logId;

    private String transNum;

    private String accountId;

    private Integer optType;

    private String transSrc;

    private String transSrcBill;

    private Integer clientType;

    private String clientImei;

    private String transDes;

    private String transDesBill;

    private Double rmbMoney;

    private Double otherAmount;

    private Double otherMoney;

    private Integer resultCode;

    private String transTime;

    private String buildTime;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    public String getTransNum() {
        return transNum;
    }

    public void setTransNum(String transNum) {
        this.transNum = transNum == null ? null : transNum.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public Integer getOptType() {
        return optType;
    }

    public void setOptType(Integer optType) {
        this.optType = optType;
    }

    public String getTransSrc() {
        return transSrc;
    }

    public void setTransSrc(String transSrc) {
        this.transSrc = transSrc == null ? null : transSrc.trim();
    }

    public String getTransSrcBill() {
        return transSrcBill;
    }

    public void setTransSrcBill(String transSrcBill) {
        this.transSrcBill = transSrcBill == null ? null : transSrcBill.trim();
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public String getClientImei() {
        return clientImei;
    }

    public void setClientImei(String clientImei) {
        this.clientImei = clientImei == null ? null : clientImei.trim();
    }

    public String getTransDes() {
        return transDes;
    }

    public void setTransDes(String transDes) {
        this.transDes = transDes == null ? null : transDes.trim();
    }

    public String getTransDesBill() {
        return transDesBill;
    }

    public void setTransDesBill(String transDesBill) {
        this.transDesBill = transDesBill == null ? null : transDesBill.trim();
    }

    public Double getRmbMoney() {
        return rmbMoney;
    }

    public void setRmbMoney(Double rmbMoney) {
        this.rmbMoney = rmbMoney;
    }

    public Double getOtherAmount() {
        return otherAmount;
    }

    public void setOtherAmount(Double otherAmount) {
        this.otherAmount = otherAmount;
    }

    public Double getOtherMoney() {
        return otherMoney;
    }

    public void setOtherMoney(Double otherMoney) {
        this.otherMoney = otherMoney;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime == null ? null : transTime.trim();
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime == null ? null : buildTime.trim();
    }
}