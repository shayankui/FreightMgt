package com.kings.ttp.pojo;

public class UserAccountBean {
    private String accountId;

    private String userId;

    private Integer status;

    private Double rmbMoney;

    private Double otherAmount;

    private Double otherMoney;

    private Double minMoney;

    private Double maxMoney;

    private String buildTime;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Double getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(Double minMoney) {
        this.minMoney = minMoney;
    }

    public Double getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(Double maxMoney) {
        this.maxMoney = maxMoney;
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime == null ? null : buildTime.trim();
    }
}