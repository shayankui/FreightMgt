package com.kings.ttp.pojo;

public class OrderSubInfo {
    private String subNum;

    private String orderNum;

    private String extSubNum;

    private String goodsNum;

    private Integer goodsCount;

    private Double goodsPrice;

    private String validDate;

    private String payTime;

    private String checkDate;

    private Double orderMoney;

    private Integer orderIspay;

    private Double orderPaymoney;

    private Double orderDiscount;

    private String goodsMemo;

    public String getSubNum() {
        return subNum;
    }

    public void setSubNum(String subNum) {
        this.subNum = subNum == null ? null : subNum.trim();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public String getExtSubNum() {
        return extSubNum;
    }

    public void setExtSubNum(String extSubNum) {
        this.extSubNum = extSubNum == null ? null : extSubNum.trim();
    }

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum == null ? null : goodsNum.trim();
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate == null ? null : validDate.trim();
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime == null ? null : payTime.trim();
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate == null ? null : checkDate.trim();
    }

    public Double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Integer getOrderIspay() {
        return orderIspay;
    }

    public void setOrderIspay(Integer orderIspay) {
        this.orderIspay = orderIspay;
    }

    public Double getOrderPaymoney() {
        return orderPaymoney;
    }

    public void setOrderPaymoney(Double orderPaymoney) {
        this.orderPaymoney = orderPaymoney;
    }

    public Double getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(Double orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public String getGoodsMemo() {
        return goodsMemo;
    }

    public void setGoodsMemo(String goodsMemo) {
        this.goodsMemo = goodsMemo == null ? null : goodsMemo.trim();
    }
}