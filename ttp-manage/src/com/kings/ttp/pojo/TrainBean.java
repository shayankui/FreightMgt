package com.kings.ttp.pojo;

public class TrainBean {
    private String trainId;

    private String trainNum;

    private Double trainLength;

    private Double trainWidth;

    private Double trainHeight;

    private Double trainSize;

    private Double trainMaxWeight;

    private String trainBrand;

    private Integer beenRunned;

    private String factoryTime;

    private String buildTime;

    private String pic1;

    private String pic2;

    private String pic3;

    private String pic4;

    private String pic5;

    private String memo;

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId == null ? null : trainId.trim();
    }

    public String getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(String trainNum) {
        this.trainNum = trainNum == null ? null : trainNum.trim();
    }

    public Double getTrainLength() {
        return trainLength;
    }

    public void setTrainLength(Double trainLength) {
        this.trainLength = trainLength;
    }

    public Double getTrainWidth() {
        return trainWidth;
    }

    public void setTrainWidth(Double trainWidth) {
        this.trainWidth = trainWidth;
    }

    public Double getTrainHeight() {
        return trainHeight;
    }

    public void setTrainHeight(Double trainHeight) {
        this.trainHeight = trainHeight;
    }

    public Double getTrainSize() {
        return trainSize;
    }

    public void setTrainSize(Double trainSize) {
        this.trainSize = trainSize;
    }

    public Double getTrainMaxWeight() {
        return trainMaxWeight;
    }

    public void setTrainMaxWeight(Double trainMaxWeight) {
        this.trainMaxWeight = trainMaxWeight;
    }

    public String getTrainBrand() {
        return trainBrand;
    }

    public void setTrainBrand(String trainBrand) {
        this.trainBrand = trainBrand == null ? null : trainBrand.trim();
    }

    public Integer getBeenRunned() {
        return beenRunned;
    }

    public void setBeenRunned(Integer beenRunned) {
        this.beenRunned = beenRunned;
    }

    public String getFactoryTime() {
        return factoryTime;
    }

    public void setFactoryTime(String factoryTime) {
        this.factoryTime = factoryTime == null ? null : factoryTime.trim();
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime == null ? null : buildTime.trim();
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1 == null ? null : pic1.trim();
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2 == null ? null : pic2.trim();
    }

    public String getPic3() {
        return pic3;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3 == null ? null : pic3.trim();
    }

    public String getPic4() {
        return pic4;
    }

    public void setPic4(String pic4) {
        this.pic4 = pic4 == null ? null : pic4.trim();
    }

    public String getPic5() {
        return pic5;
    }

    public void setPic5(String pic5) {
        this.pic5 = pic5 == null ? null : pic5.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}