package com.kings.ttp.pojo;

public class TradeRuleTypeBean {
    private String ruleTypeNum;

    private String ruleTypeName;

    private String ruleTypeMemo;

    public String getRuleTypeNum() {
        return ruleTypeNum;
    }

    public void setRuleTypeNum(String ruleTypeNum) {
        this.ruleTypeNum = ruleTypeNum == null ? null : ruleTypeNum.trim();
    }

    public String getRuleTypeName() {
        return ruleTypeName;
    }

    public void setRuleTypeName(String ruleTypeName) {
        this.ruleTypeName = ruleTypeName == null ? null : ruleTypeName.trim();
    }

    public String getRuleTypeMemo() {
        return ruleTypeMemo;
    }

    public void setRuleTypeMemo(String ruleTypeMemo) {
        this.ruleTypeMemo = ruleTypeMemo == null ? null : ruleTypeMemo.trim();
    }
}