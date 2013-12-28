package com.kings.ttp.pojo;

import java.util.ArrayList;
import java.util.List;

public class TradeRuleTypeBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradeRuleTypeBeanExample() {
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

        public Criteria andRuleTypeNumIsNull() {
            addCriterion("F_RULE_TYPE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNumIsNotNull() {
            addCriterion("F_RULE_TYPE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNumEqualTo(String value) {
            addCriterion("F_RULE_TYPE_NUM =", value, "ruleTypeNum");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNumNotEqualTo(String value) {
            addCriterion("F_RULE_TYPE_NUM <>", value, "ruleTypeNum");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNumGreaterThan(String value) {
            addCriterion("F_RULE_TYPE_NUM >", value, "ruleTypeNum");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNumGreaterThanOrEqualTo(String value) {
            addCriterion("F_RULE_TYPE_NUM >=", value, "ruleTypeNum");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNumLessThan(String value) {
            addCriterion("F_RULE_TYPE_NUM <", value, "ruleTypeNum");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNumLessThanOrEqualTo(String value) {
            addCriterion("F_RULE_TYPE_NUM <=", value, "ruleTypeNum");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNumLike(String value) {
            addCriterion("F_RULE_TYPE_NUM like", value, "ruleTypeNum");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNumNotLike(String value) {
            addCriterion("F_RULE_TYPE_NUM not like", value, "ruleTypeNum");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNumIn(List<String> values) {
            addCriterion("F_RULE_TYPE_NUM in", values, "ruleTypeNum");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNumNotIn(List<String> values) {
            addCriterion("F_RULE_TYPE_NUM not in", values, "ruleTypeNum");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNumBetween(String value1, String value2) {
            addCriterion("F_RULE_TYPE_NUM between", value1, value2, "ruleTypeNum");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNumNotBetween(String value1, String value2) {
            addCriterion("F_RULE_TYPE_NUM not between", value1, value2, "ruleTypeNum");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameIsNull() {
            addCriterion("F_RULE_TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameIsNotNull() {
            addCriterion("F_RULE_TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameEqualTo(String value) {
            addCriterion("F_RULE_TYPE_NAME =", value, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameNotEqualTo(String value) {
            addCriterion("F_RULE_TYPE_NAME <>", value, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameGreaterThan(String value) {
            addCriterion("F_RULE_TYPE_NAME >", value, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_RULE_TYPE_NAME >=", value, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameLessThan(String value) {
            addCriterion("F_RULE_TYPE_NAME <", value, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameLessThanOrEqualTo(String value) {
            addCriterion("F_RULE_TYPE_NAME <=", value, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameLike(String value) {
            addCriterion("F_RULE_TYPE_NAME like", value, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameNotLike(String value) {
            addCriterion("F_RULE_TYPE_NAME not like", value, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameIn(List<String> values) {
            addCriterion("F_RULE_TYPE_NAME in", values, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameNotIn(List<String> values) {
            addCriterion("F_RULE_TYPE_NAME not in", values, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameBetween(String value1, String value2) {
            addCriterion("F_RULE_TYPE_NAME between", value1, value2, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameNotBetween(String value1, String value2) {
            addCriterion("F_RULE_TYPE_NAME not between", value1, value2, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeMemoIsNull() {
            addCriterion("F_RULE_TYPE_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeMemoIsNotNull() {
            addCriterion("F_RULE_TYPE_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeMemoEqualTo(String value) {
            addCriterion("F_RULE_TYPE_MEMO =", value, "ruleTypeMemo");
            return (Criteria) this;
        }

        public Criteria andRuleTypeMemoNotEqualTo(String value) {
            addCriterion("F_RULE_TYPE_MEMO <>", value, "ruleTypeMemo");
            return (Criteria) this;
        }

        public Criteria andRuleTypeMemoGreaterThan(String value) {
            addCriterion("F_RULE_TYPE_MEMO >", value, "ruleTypeMemo");
            return (Criteria) this;
        }

        public Criteria andRuleTypeMemoGreaterThanOrEqualTo(String value) {
            addCriterion("F_RULE_TYPE_MEMO >=", value, "ruleTypeMemo");
            return (Criteria) this;
        }

        public Criteria andRuleTypeMemoLessThan(String value) {
            addCriterion("F_RULE_TYPE_MEMO <", value, "ruleTypeMemo");
            return (Criteria) this;
        }

        public Criteria andRuleTypeMemoLessThanOrEqualTo(String value) {
            addCriterion("F_RULE_TYPE_MEMO <=", value, "ruleTypeMemo");
            return (Criteria) this;
        }

        public Criteria andRuleTypeMemoLike(String value) {
            addCriterion("F_RULE_TYPE_MEMO like", value, "ruleTypeMemo");
            return (Criteria) this;
        }

        public Criteria andRuleTypeMemoNotLike(String value) {
            addCriterion("F_RULE_TYPE_MEMO not like", value, "ruleTypeMemo");
            return (Criteria) this;
        }

        public Criteria andRuleTypeMemoIn(List<String> values) {
            addCriterion("F_RULE_TYPE_MEMO in", values, "ruleTypeMemo");
            return (Criteria) this;
        }

        public Criteria andRuleTypeMemoNotIn(List<String> values) {
            addCriterion("F_RULE_TYPE_MEMO not in", values, "ruleTypeMemo");
            return (Criteria) this;
        }

        public Criteria andRuleTypeMemoBetween(String value1, String value2) {
            addCriterion("F_RULE_TYPE_MEMO between", value1, value2, "ruleTypeMemo");
            return (Criteria) this;
        }

        public Criteria andRuleTypeMemoNotBetween(String value1, String value2) {
            addCriterion("F_RULE_TYPE_MEMO not between", value1, value2, "ruleTypeMemo");
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