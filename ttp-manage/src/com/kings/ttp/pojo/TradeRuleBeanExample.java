package com.kings.ttp.pojo;

import java.util.ArrayList;
import java.util.List;

public class TradeRuleBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradeRuleBeanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRuleNumIsNull() {
            addCriterion("F_RULE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRuleNumIsNotNull() {
            addCriterion("F_RULE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNumEqualTo(String value) {
            addCriterion("F_RULE_NUM =", value, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumNotEqualTo(String value) {
            addCriterion("F_RULE_NUM <>", value, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumGreaterThan(String value) {
            addCriterion("F_RULE_NUM >", value, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_RULE_NUM >=", value, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumLessThan(String value) {
            addCriterion("F_RULE_NUM <", value, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumLessThanOrEqualTo(String value) {
            addCriterion("F_RULE_NUM <=", value, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumLike(String value) {
            addCriterion("F_RULE_NUM like", value, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumNotLike(String value) {
            addCriterion("F_RULE_NUM not like", value, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumIn(List<String> values) {
            addCriterion("F_RULE_NUM in", values, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumNotIn(List<String> values) {
            addCriterion("F_RULE_NUM not in", values, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumBetween(String value1, String value2) {
            addCriterion("F_RULE_NUM between", value1, value2, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleNumNotBetween(String value1, String value2) {
            addCriterion("F_RULE_NUM not between", value1, value2, "ruleNum");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIsNull() {
            addCriterion("F_RULE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIsNotNull() {
            addCriterion("F_RULE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeEqualTo(String value) {
            addCriterion("F_RULE_TYPE =", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotEqualTo(String value) {
            addCriterion("F_RULE_TYPE <>", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThan(String value) {
            addCriterion("F_RULE_TYPE >", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("F_RULE_TYPE >=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThan(String value) {
            addCriterion("F_RULE_TYPE <", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThanOrEqualTo(String value) {
            addCriterion("F_RULE_TYPE <=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLike(String value) {
            addCriterion("F_RULE_TYPE like", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotLike(String value) {
            addCriterion("F_RULE_TYPE not like", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIn(List<String> values) {
            addCriterion("F_RULE_TYPE in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotIn(List<String> values) {
            addCriterion("F_RULE_TYPE not in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeBetween(String value1, String value2) {
            addCriterion("F_RULE_TYPE between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotBetween(String value1, String value2) {
            addCriterion("F_RULE_TYPE not between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNull() {
            addCriterion("F_RULE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNotNull() {
            addCriterion("F_RULE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNameEqualTo(String value) {
            addCriterion("F_RULE_NAME =", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotEqualTo(String value) {
            addCriterion("F_RULE_NAME <>", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThan(String value) {
            addCriterion("F_RULE_NAME >", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_RULE_NAME >=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThan(String value) {
            addCriterion("F_RULE_NAME <", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThanOrEqualTo(String value) {
            addCriterion("F_RULE_NAME <=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLike(String value) {
            addCriterion("F_RULE_NAME like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotLike(String value) {
            addCriterion("F_RULE_NAME not like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameIn(List<String> values) {
            addCriterion("F_RULE_NAME in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotIn(List<String> values) {
            addCriterion("F_RULE_NAME not in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameBetween(String value1, String value2) {
            addCriterion("F_RULE_NAME between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotBetween(String value1, String value2) {
            addCriterion("F_RULE_NAME not between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNull() {
            addCriterion("F_IS_USE is null");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNotNull() {
            addCriterion("F_IS_USE is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseEqualTo(Integer value) {
            addCriterion("F_IS_USE =", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotEqualTo(Integer value) {
            addCriterion("F_IS_USE <>", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThan(Integer value) {
            addCriterion("F_IS_USE >", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_IS_USE >=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThan(Integer value) {
            addCriterion("F_IS_USE <", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThanOrEqualTo(Integer value) {
            addCriterion("F_IS_USE <=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseIn(List<Integer> values) {
            addCriterion("F_IS_USE in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotIn(List<Integer> values) {
            addCriterion("F_IS_USE not in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseBetween(Integer value1, Integer value2) {
            addCriterion("F_IS_USE between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotBetween(Integer value1, Integer value2) {
            addCriterion("F_IS_USE not between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andRuleMemoIsNull() {
            addCriterion("F_RULE_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andRuleMemoIsNotNull() {
            addCriterion("F_RULE_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andRuleMemoEqualTo(String value) {
            addCriterion("F_RULE_MEMO =", value, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoNotEqualTo(String value) {
            addCriterion("F_RULE_MEMO <>", value, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoGreaterThan(String value) {
            addCriterion("F_RULE_MEMO >", value, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoGreaterThanOrEqualTo(String value) {
            addCriterion("F_RULE_MEMO >=", value, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoLessThan(String value) {
            addCriterion("F_RULE_MEMO <", value, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoLessThanOrEqualTo(String value) {
            addCriterion("F_RULE_MEMO <=", value, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoLike(String value) {
            addCriterion("F_RULE_MEMO like", value, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoNotLike(String value) {
            addCriterion("F_RULE_MEMO not like", value, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoIn(List<String> values) {
            addCriterion("F_RULE_MEMO in", values, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoNotIn(List<String> values) {
            addCriterion("F_RULE_MEMO not in", values, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoBetween(String value1, String value2) {
            addCriterion("F_RULE_MEMO between", value1, value2, "ruleMemo");
            return (Criteria) this;
        }

        public Criteria andRuleMemoNotBetween(String value1, String value2) {
            addCriterion("F_RULE_MEMO not between", value1, value2, "ruleMemo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}