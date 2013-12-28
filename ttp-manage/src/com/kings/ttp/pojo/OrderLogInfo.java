package com.kings.ttp.pojo;

public class OrderLogInfo {
    private String logId;

    private String orderNum;

    private String subNum;

    private String orderStatus;

    private Integer opType;

    private String opNum;

    private Integer clientType;

    private String clientImei;

    private String opMancode;

    private String opManname;

    private String opTime;

    private String opMemo;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
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

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public Integer getOpType() {
        return opType;
    }

    public void setOpType(Integer opType) {
        this.opType = opType;
    }

    public String getOpNum() {
        return opNum;
    }

    public void setOpNum(String opNum) {
        this.opNum = opNum == null ? null : opNum.trim();
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

    public String getOpMancode() {
        return opMancode;
    }

    public void setOpMancode(String opMancode) {
        this.opMancode = opMancode == null ? null : opMancode.trim();
    }

    public String getOpManname() {
        return opManname;
    }

    public void setOpManname(String opManname) {
        this.opManname = opManname == null ? null : opManname.trim();
    }

    public String getOpTime() {
        return opTime;
    }

    public void setOpTime(String opTime) {
        this.opTime = opTime == null ? null : opTime.trim();
    }

    public String getOpMemo() {
        return opMemo;
    }

    public void setOpMemo(String opMemo) {
        this.opMemo = opMemo == null ? null : opMemo.trim();
    }
}