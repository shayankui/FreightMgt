package com.kings.ttp.pojo;

public class TradeRuleBean {
    private String ruleNum;

    private String ruleType;

    private String ruleName;

    private Integer isUse;

    private String ruleMemo;

    public String getRuleNum() {
        return ruleNum;
    }

    public void setRuleNum(String ruleNum) {
        this.ruleNum = ruleNum == null ? null : ruleNum.trim();
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType == null ? null : ruleType.trim();
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    public String getRuleMemo() {
        return ruleMemo;
    }

    public void setRuleMemo(String ruleMemo) {
        this.ruleMemo = ruleMemo == null ? null : ruleMemo.trim();
    }
}