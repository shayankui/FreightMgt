package com.kings.ttp.pojo;

public class GoodsEvaluateInfo {
    private String evaluateNum;

    private String userId;

    private String orderNum;

    private String subNum;

    private Integer receiveType;

    private String receiveUser;

    private Integer serviceVal;

    private String detail;

    private String opTime;

    private Integer cntUseful;

    private Integer cntUnuseful;

    public String getEvaluateNum() {
        return evaluateNum;
    }

    public void setEvaluateNum(String evaluateNum) {
        this.evaluateNum = evaluateNum == null ? null : evaluateNum.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public String getSubNum() {
        return subNum;
    }

    public void setSubNum(String subNum) {
        this.subNum = subNum == null ? null : subNum.trim();
    }

    public Integer getReceiveType() {
        return receiveType;
    }

    public void setReceiveType(Integer receiveType) {
        this.receiveType = receiveType;
    }

    public String getReceiveUser() {
        return receiveUser;
    }

    public void setReceiveUser(String receiveUser) {
        this.receiveUser = receiveUser == null ? null : receiveUser.trim();
    }

    public Integer getServiceVal() {
        return serviceVal;
    }

    public void setServiceVal(Integer serviceVal) {
        this.serviceVal = serviceVal;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getOpTime() {
        return opTime;
    }

    public void setOpTime(String opTime) {
        this.opTime = opTime == null ? null : opTime.trim();
    }

    public Integer getCntUseful() {
        return cntUseful;
    }

    public void setCntUseful(Integer cntUseful) {
        this.cntUseful = cntUseful;
    }

    public Integer getCntUnuseful() {
        return cntUnuseful;
    }

    public void setCntUnuseful(Integer cntUnuseful) {
        this.cntUnuseful = cntUnuseful;
    }
}